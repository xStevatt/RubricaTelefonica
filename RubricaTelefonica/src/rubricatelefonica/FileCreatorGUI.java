package rubricatelefonica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import static rubricatelefonica.RubricaTelefonicaGUI.setDefaultXML;

public class FileCreatorGUI extends javax.swing.JFrame
{   
    
    private int peopleCreated = 0; 
    
    public FileCreatorGUI() 
    {   
        this.setTitle("Rubrica Telefonica"); 
        this.setResizable(false);
  
        
        initComponents();
        jLabel1.requestFocusInWindow(); 
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCognome = new javax.swing.JLabel();
        fieldCognome = new javax.swing.JTextField();
        labelCellulare = new javax.swing.JLabel();
        fieldCellulare = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        modifyFileButton = new javax.swing.JButton();
        fieldInterno1 = new javax.swing.JTextField();
        labelInterno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crea un File");

        fieldNome.setText("Inserisci qui il nome");
        fieldNome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldNome.setText("");
            }
        });

        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome: ");

        labelCognome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCognome.setText("Cognome:");

        fieldCognome.setText("Inserisci qui il cognome");
        fieldCognome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldCognome.setText("");
            }
        });

        labelCellulare.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCellulare.setText("Numero di Cellulare: ");

        fieldCellulare.setText("Inserisci qui il numero di cellulare");
        fieldCellulare.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldCellulare.setText("");
            }
        });

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Indirizzo email:");

        fieldEmail.setText("Inserire qui l'indirizzo email");
        fieldEmail.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldEmail.setText("");
            }
        });

        modifyFileButton.setBackground(new java.awt.Color(255, 102, 102));
        modifyFileButton.setText("Crea la nuova rubrica.");
        modifyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyFileButtonActionPerformed(evt);
            }
        });

        fieldInterno1.setText("Inserire qui l'ID della persona: ");
        fieldInterno1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldEmail.setText("");
            }
        });

        labelInterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelInterno.setText("Numero di Interno");

        jButton1.setText("Genera Casualmente Campi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCellulare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelInterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldEmail)
                            .addComponent(fieldInterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCognome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCellulare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldInterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInterno))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFileButtonActionPerformed
        
        if(fieldNome.getText().length() > 0 && fieldCognome.getText().length() > 0 && fieldCellulare.getText().length() > 0 && 
                fieldEmail.getText().length() > 0 && fieldInterno1.getText().length() > 0)
        {
            int scelta = JOptionPane.showConfirmDialog(this, "Sei sicuro di voler eliminare l'elemento", "Elimina Elemento", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            int rubricaCounter; 
            File fileToRead = null; 
            if(scelta == 0)
            {   
                try
                {
                    fileToRead= new File("./XML Files by User/infos.txt"); 
                    Scanner sc = new Scanner(fileToRead); 

                    String numberString = sc.next(); 
                    System.out.println("Il numero di rubriche vale " + numberString);
                    rubricaCounter = Integer.parseInt(numberString);  
                    peopleCreated = rubricaCounter;                     
                }
                catch(Exception e)
                {   
                    e.printStackTrace();
                    rubricaCounter = (int) Math.random() * 97;
                }
                
                String fileName = "rubrica" + Integer.toString(rubricaCounter); 
                
                File rubricaReader = new File("./XML Files by User/" + fileName + ".xml"); 
                RubricaTelefonicaGUI.defaultFileName = "./XML Files by User/" + fileName + ".xml"; 
                
                String nomeString = fieldNome.getText().trim(); 
                String cognomeString = fieldCognome.getText().trim(); 
                String cellulareString = fieldCellulare.getText().trim();
                String emailString = fieldEmail.getText().trim(); 
                String nInternoString = fieldInterno1.getText().trim(); 
                
                try
                {
                    DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
                    Document document = documentBuilder.newDocument();
                    
                    // Creates rubrica
                    Element root = document.createElement("rubrica");
                    document.appendChild(root);
                    
                    // Creates persona
                    Element persona = document.createElement("person"); 
                    root.appendChild(persona); 
                    
                    // Creates an ID
                    Attr attr = document.createAttribute("id"); 
                    attr.setValue(Integer.toString(peopleCreated));
                    persona.setAttributeNode(attr);
                    peopleCreated++; // increases the number of people created
                    
                    // firstname element
                    Element firstName = document.createElement("firstname");
                    firstName.appendChild(document.createTextNode(nomeString)); 
                    persona.appendChild(firstName); 
                    
                    // lastname element
                    Element lastName = document.createElement("lastname"); 
                    lastName.appendChild(document.createTextNode(cognomeString)); 
                    persona.appendChild(lastName); 
                    
                    // email element
                    Element email = document.createElement("email"); 
                    email.appendChild(document.createTextNode(emailString)); 
                    persona.appendChild(email); 
                    
                    // telephone element
                    Element telephone = document.createElement("telephone"); 
                    telephone.appendChild(document.createTextNode(cellulareString)); 
                    persona.appendChild(telephone); 
                    
                    // numerodiinterno element
                    Element intern = document.createElement("numero_interno"); 
                    intern.appendChild(document.createTextNode(nInternoString));
                    persona.appendChild(intern);
                    
                    try
                    {
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource domSource = new DOMSource(document);
                        StreamResult streamResult = new StreamResult(rubricaReader);
                        transformer.transform(domSource, streamResult);
                    }
                    catch(Exception e)
                    {   
                        e.printStackTrace();
                        System.err.println("errore nella creazione del file");
                    }
                }
                catch(Exception e)
                {
                    
                }
            }
                            
            try
            {   
                FileWriter writer = new FileWriter(fileToRead);
                writer.write(Integer.toString(peopleCreated));
                writer.flush();
                writer.close();
            }
                
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
        setDefaultXML();
        int scelta = JOptionPane.showConfirmDialog(this, "Vuoi modificare ulteriormente la tua rubrica?", "Elemento Creato", JOptionPane.YES_NO_OPTION);
        
        if(scelta == 0)
        {
            java.awt.EventQueue.invokeLater(new Runnable() 
            {
                public void run() {
                    new FileModifierGUI().setVisible(true);
                }
            });
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Sarai comunque in grado di modicare il tuo file più avanti!", "Ok!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        try
        {
            RubricaTelefonicaGUI.setDefaultXML();
            RubricaTelefonicaGUI.loadTable();
            RubricaTelefonicaGUI.jTextArea1.updateUI();
        }
        catch(Exception e)
        {
            
        }
        setDefaultXML();
    }//GEN-LAST:event_modifyFileButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String[] nomi = {"Massimo", "Marcello", "Marco", "Mastino", "Maricchia",
            "Marcellino", "Cavallo", "Catamarano", "Catalessi", "Stefano", "Stefania",
            "Torello", "Tafano", "Mariolo", "Kebbabaro", "Gabriele", "Mattia", "Angela",
            "Siracusa", "Sanculotto", "Sanpancrazio", "Giovanni", "Gialuca", "Giorgio"};
                
        String[] cognomi = {"Arcimboldo", "Australopiteco", "N'toni", "Polentone", "Terrone",
            "Tasto", "Torquato", "Culatto", "Coatto", "Rosso", "Mussoleenee",
            "Salveenee", "Stalin", "Cannavacciulo", "Knox", "Carabieniere", "Tacchinella", "Angela",
            "Serafino", "Santo", "Stefano", "Saviano", "Mazucco", "Marino"};
               
        String[] lettere = {"a", "b", "c", "d", "e",
            "d", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s",
            "v", "w", "u", "x", "y", "z"};
        
        String[] clientEmail = {"gmail.com", "protonmail.com", "gmail.it", "outlook.it", "outlook.com", "yahoo.it", "libero.it"}; 
        
        fieldNome.setText(nomi[(int) (Math.random() * 24)]);
        fieldCognome.setText(cognomi[(int) (Math.random() * 24)]);
                
        int numeroLettere = 0; 
                
        while(numeroLettere == 0)
        {
            numeroLettere = (int) (Math.random() * 10);
        }
        
        String email = ""; 
        
        for(int i = 0; i < numeroLettere; i++)
        {
            email += lettere[(int) (Math.random() * 24)]; 
        }
        
        fieldEmail.setText(email + "@" + clientEmail[(int) (Math.random() * 7)]);
        fieldInterno1.setText(Integer.toString((int) (Math.random() * 300)));
        
        String numeroCellulare = ""; 
        
        for(int i = 0; i < 9; i++)
        {
            numeroCellulare += (int) (Math.random() * 9); 
        }
        fieldCellulare.setText(numeroCellulare);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try 
        { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCellulare;
    private javax.swing.JTextField fieldCognome;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldInterno1;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCellulare;
    private javax.swing.JLabel labelCognome;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelInterno;
    private javax.swing.JLabel labelNome;
    private javax.swing.JButton modifyFileButton;
    // End of variables declaration//GEN-END:variables
}
