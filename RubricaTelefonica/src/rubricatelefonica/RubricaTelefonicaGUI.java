package rubricatelefonica;

import java.io.File;
import javax.swing.*; 
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RubricaTelefonicaGUI extends javax.swing.JFrame
{   
    public static String defaultFileName = "rubrica.xml";
    public static DocumentBuilderFactory factory; 
    public static DocumentBuilder builder; 
    public static Document document; 
    public static int contatore = 0; 
    public static Font font = null; 
    // Costruttore della classe, si occupa di richiamare il costruttore della grafica initComponents() e sistemare gli elementi grafici
    public RubricaTelefonicaGUI() 
    {   
        this.setTitle("Rubrica Telefonica"); 
        this.setResizable(false);
        requestFocusInWindow(); 

        try
        {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File(defaultFileName));
        }
        catch(Exception e)
        {
            
        }
        
        initComponents();
        
        jTextArea1.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        setDefaultXML();
        
        try
        {
            loadTable(); 
        }
        catch(Exception e)
        {
            
        }
    }
        
    public static void loadTable() throws XPathExpressionException
    {   
               
        System.out.println(defaultFileName);
        try
        {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File(defaultFileName));
        }
        catch(Exception e)
        {
        }
        
        NodeList nodeList = document.getElementsByTagName("person");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        Object[] rowData = new Object[6]; 
        
        for(int i = 0; i < nodeList.getLength(); i++)
        {   
            Node nNode = nodeList.item(i);
            Element elem = (Element) nNode;
            contatore++; 
            
            String nomeString = null; 
            String cognomeString = null; 
            String emailString = null; 
            String telephoneString = null; 
            String numeroInternoString = null; 
            String idString = null; 
            
            try
            {
                Node el1 = elem.getElementsByTagName("firstname").item(0);
                nomeString= el1.getTextContent();
                
                Node el2 = elem.getElementsByTagName("lastname").item(0);
                cognomeString = el2.getTextContent();
                
                Node el3 = elem.getElementsByTagName("email").item(0);
                emailString = el3.getTextContent();
                
                Node el4 = elem.getElementsByTagName("telephone").item(0);
                telephoneString = el4.getTextContent();
                
                Node el5 = elem.getElementsByTagName("numero_interno").item(0);
                numeroInternoString = el5.getTextContent();
                
                idString = elem.getAttribute("id");
            }
            catch(Exception e)
            {
                
            }
            
            rowData[0] = idString; 
            rowData[1] = nomeString; 
            rowData[2] = cognomeString; 
            rowData[3] = emailString; 
            rowData[4] = telephoneString; 
            rowData[5] = numeroInternoString; 
            model.addRow(rowData);
        }
    }
    
    public static void addOneElementToTable(Element node)
    {
        Object[] rowData = new Object[6]; 
                
        contatore++; 
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        rowData[0] = node.getAttribute("id"); 
        rowData[1] = node.getElementsByTagName("firstname").item(0).getTextContent(); 
        rowData[2] = node.getElementsByTagName("lastname").item(0).getTextContent(); 
        rowData[3] = node.getElementsByTagName("email").item(0).getTextContent(); 
        rowData[4] = node.getElementsByTagName("telephone").item(0).getTextContent(); 
        rowData[5] = node.getElementsByTagName("numero_interno").item(0).getTextContent(); 
        model.addRow(rowData);
    }
    
    public static void delteAnElement(int personaSelezionata)
    {   
        for(int i = 0; i < 1; i++)
        {
            for(int j = 0; j < jTable1.getRowCount(); j++)
            {
                if(Integer.parseInt((String) jTable1.getValueAt(j, i)) == personaSelezionata)
                {
                    jTable1.removeRowSelectionInterval(j, j);
                }
            }
        }
        
        try
        {
            ((DefaultTableModel)jTable1.getModel()).removeRow(personaSelezionata - 1);
            jTable1.updateUI();
        }
        catch(Exception e)
        {
            
        }
    }   
    
    // Questo metodo si occupa di mostrare a schermo il file XML che è stato preso dalla cartella del progetto
    public static void setDefaultXML()
    {   
        jTextArea1.setText("");
        try
        {
            String XMLFileContent = ""; 
            
            NodeList list = document.getElementsByTagName("person");
            XMLFileContent = ""; 
            XMLFileContent = "<rubrica>\n"; 
            for(int i = 0; i < list.getLength(); i++)
            {
                Node node = list.item(i); 
                
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {   
                    Element eElement = (Element) node;
                    XMLFileContent += " <person>\n";
                    XMLFileContent += "     <firstname id=\"" + eElement.getAttribute("id") + "\">" + eElement.getElementsByTagName("firstname").item(0).getTextContent() + "<firstname>\n"; 
                    XMLFileContent += "     <lastname>" + eElement.getElementsByTagName("lastname").item(0).getTextContent() + "<lastname>\n";
                    XMLFileContent += "     <email>" + eElement.getElementsByTagName("email").item(0).getTextContent() + "<email>\n";
                    XMLFileContent += "     <telephone>" + eElement.getElementsByTagName("telephone").item(0).getTextContent() + "<telephone>\n";
                    XMLFileContent += "     <numero_interno>" + eElement.getElementsByTagName("numero_interno").item(0).getTextContent() + "<numero_interno>\n";
                    XMLFileContent += " </person>\n"; 
                }
            }
            XMLFileContent += "</rubrica>"; 
            jTextArea1.setText(XMLFileContent);
        }
        catch(Exception e)
        {   
            /*
            e.printStackTrace();
            int choice = JOptionPane.showConfirmDialog(null, "Il file rubrica.xml non è stato creato! Vuoi creare un nuovo file da zero?");
            
            if(choice == 0)
            {
                java.awt.EventQueue.invokeLater(new Runnable() 
                {
                    public void run() {
                        new FileCreatorGUI().setVisible(true);
                    }
                });
            }
            else
            {
                System.err.println("Errore fatale nel sistema");
            }
            
            */
        }
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        openFileButton = new javax.swing.JButton();
        modifyFileButton = new javax.swing.JButton();
        createFileButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        openInBroswer = new javax.swing.JButton();
        openInBroswer1 = new javax.swing.JButton();
        openInBroswer2 = new javax.swing.JButton();
        openInBroswer3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rubrica Telefonica");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Questo programma ti permette la creazione di un file XML che gestisce la tua rubrica. Puoi creare un nuovo file oppure aprine uno esistente.");

        openFileButton.setBackground(new java.awt.Color(255, 102, 102));
        openFileButton.setText("Apri un file specifico");
        openFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonActionPerformed(evt);
            }
        });

        modifyFileButton.setBackground(new java.awt.Color(255, 102, 102));
        modifyFileButton.setText("Modifica il file aperto");
        modifyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyFileButtonActionPerformed(evt);
            }
        });

        createFileButton.setBackground(new java.awt.Color(255, 102, 102));
        createFileButton.setText("Crea una nuova rubrica");
        createFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valloncini Srl. Aggiornato alla versione 3.3");

        openInBroswer.setBackground(new java.awt.Color(0, 153, 153));
        openInBroswer.setText("Apri file nel broswer");
        openInBroswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInBroswerActionPerformed(evt);
            }
        });

        openInBroswer1.setBackground(new java.awt.Color(0, 153, 153));
        openInBroswer1.setText("Apri file nel notepad");
        openInBroswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInBroswer1ActionPerformed(evt);
            }
        });

        openInBroswer2.setBackground(new java.awt.Color(0, 153, 153));
        openInBroswer2.setText("Cerca nel file");
        openInBroswer2.setPreferredSize(new java.awt.Dimension(102, 32));
        openInBroswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInBroswer2ActionPerformed(evt);
            }
        });

        openInBroswer3.setBackground(new java.awt.Color(0, 153, 153));
        openInBroswer3.setText("Table View");
        openInBroswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInBroswer3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cognome", "Email", "Cellulare", "Num di Interno"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Reload UI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(openInBroswer)
                        .addGap(18, 18, 18)
                        .addComponent(modifyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openInBroswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openInBroswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openInBroswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openInBroswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openInBroswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openInBroswer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openInBroswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 35, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        // Open a file
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                FileOpenerGUI fileOpener = new FileOpenerGUI();
                
                String newFileName = fileOpener.getTextFile(); 
                
                if(!newFileName.equals(defaultFileName))
                {   
                    defaultFileName = newFileName; 
                    System.out.print("Il file è stato cambiato: ");
                    try
                    {   
                        setDefaultXML(); 
                        loadTable();
                    }
                    catch(Exception e)
                    {

                    }
                }
                else
                    System.out.println("Il file non è stato cambiato: " + defaultFileName);
                
                try
                {
                    factory = DocumentBuilderFactory.newInstance();
                    builder = factory.newDocumentBuilder();
                    document = builder.parse(new File(defaultFileName));
                    document.getDocumentElement().normalize(); // normalizza il file
                    setDefaultXML();
                }
                catch(Exception e)
                {
                    
                }
            }
        }); 
        

    }//GEN-LAST:event_openFileButtonActionPerformed

    private void modifyFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFileButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileModifierGUI().setVisible(true);
            }
        });
                
        setDefaultXML(); 
    }//GEN-LAST:event_modifyFileButtonActionPerformed

    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileButtonActionPerformed
        // Create a file
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileCreatorGUI().setVisible(true);
            }
        });
        setDefaultXML();
    }//GEN-LAST:event_createFileButtonActionPerformed

    private void openInBroswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswerActionPerformed
        setDefaultXML();
        
        int choice = JOptionPane.showConfirmDialog(this, "Vuoi aprire il file nel tuo broswer?");
            
        if(choice == 0)
        {
            try
            {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) 
                {   
                    File f = new File(defaultFileName);
                    URI u = f.toURI();
                    
                    Desktop.getDesktop().browse(u);
                }
            }
            catch(Exception e)
            {   
                e.printStackTrace();
                System.err.println("Errore nell'apertura del broswer");
            }
        }
                setDefaultXML(); 
    }//GEN-LAST:event_openInBroswerActionPerformed

    private void openInBroswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswer1ActionPerformed
                
        setDefaultXML();
        int choice = JOptionPane.showConfirmDialog(this, "Vuoi aprire il file nel blocco note?");
            
        if(choice == 0)
        {
            try
            {
                if (Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().edit(new File(defaultFileName));
                } 
                else 
                {
                    // dunno, up to you to handle this
                }
            }
            catch(Exception e)
            {
                System.err.println("Errore nell'apertura del broswer");
            }
        }
                setDefaultXML(); 
    }//GEN-LAST:event_openInBroswer1ActionPerformed

    private void openInBroswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswer2ActionPerformed
        setDefaultXML();
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileSearchGUI().setVisible(true);
            }
        });
                setDefaultXML(); 
    }//GEN-LAST:event_openInBroswer2ActionPerformed

    private void openInBroswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswer3ActionPerformed
                
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                try {
                    new TableViewGUI().setVisible(true);
                } catch (XPathExpressionException ex) {
                    Logger.getLogger(RubricaTelefonicaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
                        
        setDefaultXML(); 
    }//GEN-LAST:event_openInBroswer3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setDefaultXML();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) 
    {   
        try 
        {
        } 
        catch (Exception e) 
        {
             //Handle exception
        }
        
        try 
        { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new RubricaTelefonicaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createFileButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modifyFileButton;
    private javax.swing.JButton openFileButton;
    private javax.swing.JButton openInBroswer;
    private javax.swing.JButton openInBroswer1;
    private javax.swing.JButton openInBroswer2;
    private javax.swing.JButton openInBroswer3;
    // End of variables declaration//GEN-END:variables
}
