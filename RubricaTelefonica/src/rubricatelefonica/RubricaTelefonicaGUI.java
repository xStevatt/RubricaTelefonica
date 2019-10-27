package rubricatelefonica;

import java.io.File;
import java.util.Scanner;
import javax.swing.*; 
import java.awt.Desktop;
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
    
        
    public void loadTable() throws XPathExpressionException
    {   
        NodeList nodeList = RubricaTelefonicaGUI.document.getElementsByTagName("person");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        Object[] rowData = new Object[6]; 
        
        for(int i = 0; i < nodeList.getLength(); i++)
        {   
            Node nNode = nodeList.item(i);
            Element elem = (Element) nNode;
            
            Node el1 = elem.getElementsByTagName("firstname").item(0);
            String nomeStringato = el1.getTextContent();
            Node el2 = elem.getElementsByTagName("lastname").item(0);
            String cognomeStringato = el2.getTextContent();
            Node el3 = elem.getElementsByTagName("email").item(0);
            String emailStringato = el3.getTextContent();
            Node el4 = elem.getElementsByTagName("telephone").item(0);
            String depStringato = el4.getTextContent();  
            Node el5 = elem.getElementsByTagName("numero_interno").item(0);
            String intStringato = el5.getTextContent();
            
            rowData[0] = i; 
            rowData[1] = nomeStringato; 
            rowData[2] = cognomeStringato; 
            rowData[3] = emailStringato; 
            rowData[4] = depStringato; 
            rowData[5] = intStringato; 
            model.addRow(rowData);
        }
    }
    
    // Questo metodo si occupa di mostrare a schermo il file XML che è stato preso dalla cartella del progetto
    public void setDefaultXML()
    {   
        try
        {
            Scanner fileReader = new Scanner(new File(defaultFileName)); 
            String XMLFileContent = ""; 
            
            while(fileReader.hasNextLine())
            {   
                XMLFileContent += fileReader.nextLine() + "\n"; 
            }
            jTextArea1.setText(XMLFileContent);
        }
        catch(Exception e)
        {
            int choice = JOptionPane.showConfirmDialog(this, "Il file rubrica.xml non è stato creato! Vuoi creare un nuovo file da zero?");
            
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
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valloncini Srl. Tutti i diritti sono riservati. Version 1.0");

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
                "ID", "Nome", "Cognome", "Email", "Cellulare", "Numero di Interno"
            }
        ));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
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
                .addComponent(openInBroswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        // Open a file
               
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                FileOpenerGUI fileOpener = new FileOpenerGUI();
                defaultFileName = fileOpener.getTextFile(); 
                System.out.println(defaultFileName);
                setDefaultXML();
                
                try
                {
                    factory = DocumentBuilderFactory.newInstance();
                    builder = factory.newDocumentBuilder();
                    document = builder.parse(new File(defaultFileName));
                    document.getDocumentElement().normalize(); // normalizza il file
                }
                catch(Exception e)
                {
                    
                }
            }
        });

    }//GEN-LAST:event_openFileButtonActionPerformed

    private void modifyFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFileButtonActionPerformed
        // Modify a file
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileModifierGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_modifyFileButtonActionPerformed

    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileButtonActionPerformed
        // Create a file
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileCreatorGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_createFileButtonActionPerformed

    private void openInBroswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswerActionPerformed
        
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
    }//GEN-LAST:event_openInBroswerActionPerformed

    private void openInBroswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswer1ActionPerformed
                
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
    }//GEN-LAST:event_openInBroswer1ActionPerformed

    private void openInBroswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBroswer2ActionPerformed
                java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FileSearchGUI().setVisible(true);
            }
        });
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
    }//GEN-LAST:event_openInBroswer3ActionPerformed

    public static void main(String args[]) 
    {   
        // Main menu graphics
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modifyFileButton;
    private javax.swing.JButton openFileButton;
    private javax.swing.JButton openInBroswer;
    private javax.swing.JButton openInBroswer1;
    private javax.swing.JButton openInBroswer2;
    private javax.swing.JButton openInBroswer3;
    // End of variables declaration//GEN-END:variables
}
