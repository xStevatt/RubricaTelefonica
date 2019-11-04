package rubricatelefonica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Stefano Valloncini
 */

public class AddPersonGUI extends javax.swing.JFrame {

    public AddPersonGUI() 
    {
        initComponents();
        this.setResizable(false);
        this.setTitle("Aggiungi Persona");
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldCognome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldCellulare = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldInterno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aggiungi Persona");

        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.setText("Inserire qui il nome della persona");
        fieldNome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldNome.setText("");
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cognome:");

        fieldCognome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldCognome.setText("Inserire qui il cognome della persona");
        fieldCognome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldCognome.setText("");
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("email:");

        fieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldEmail.setText("Inserire qui l'email della persona");
        fieldEmail.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldEmail.setText("");
            }
        });
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cellulare:");

        fieldCellulare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldCellulare.setText("Inserire qui il cellulare della persona");
        fieldCellulare.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldCellulare.setText("");
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Interno:");

        fieldInterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldInterno.setText("Inserire qui il nInterno della persona ");
        fieldInterno.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fieldInterno.setText("");
            }
        });

        jButton1.setText("Aggiungi una persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Genera Campi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNome)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldCognome)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldEmail)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldCellulare)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldInterno)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                
        String[] nomi = {"Massimo", "Marcello", "Marco", "Mastino", "Maricchia",
            "Marcellino", "Cavallo", "Catamarano", "Angelino", "Stefano", "Stefania",
            "Alessandro", "Giaunluca", "Giovannino", "Adbul", "Gabriele", "Mattia", "Angela",
            "Siracusa", "Sanculotto", "Elena", "Giovanni", "Anna", "Giorgio"};
                
        String[] cognomi = {"Rossi", "Bianchi", "N'toni", "Polentone", "Escobar",
            "Tasto", "Torquato", "Valloncini", "Pezzotti", "Cavagnini", "Mussoleenee",
            "Salveenee", "Stalin", "Cannavacciulo", "Knox", "Carabieniere", "Alberti", "Angela",
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
        fieldInterno.setText(Integer.toString((int) (Math.random() * 300)));
        
        String numeroCellulare = ""; 
        
        for(int i = 0; i < 9; i++)
        {
            numeroCellulare += (int) (Math.random() * 9); 
        }
        fieldCellulare.setText(numeroCellulare);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  
        String nomeString = ""; 
        String cognomeString = ""; 
        String emailString = ""; 
        String telephoneString = ""; 
        String numeroInternoString = ""; 
        
        nomeString = fieldNome.getText().trim(); 
        cognomeString = fieldCognome.getText().trim(); 
        emailString = fieldEmail.getText().trim(); 
        telephoneString = fieldCellulare.getText().trim(); 
        numeroInternoString = fieldInterno.getText().trim(); 
        
        NodeList lista = RubricaTelefonicaGUI.document.getElementsByTagName("person"); 
        Element elementoUltimaPos = (Element) lista.item(lista.getLength() - 1); 
        elementoUltimaPos.getAttribute("id");
        int lunghezzaLista = lista.getLength(); 
        
        Element element = RubricaTelefonicaGUI.document.getDocumentElement();

        Node node = RubricaTelefonicaGUI.document.createElement("person");
        ((Element)node).setAttribute("id", Integer.toString(Integer.parseInt(elementoUltimaPos.getAttribute("id")) + 1));
        
        Element firstname = RubricaTelefonicaGUI.document.createElement("firstname");
        firstname.appendChild(RubricaTelefonicaGUI.document.createTextNode(nomeString));
        node.appendChild(firstname); 
        
        Element lastname = RubricaTelefonicaGUI.document.createElement("lastname");
        lastname.appendChild(RubricaTelefonicaGUI.document.createTextNode(cognomeString));
        node.appendChild(lastname); 
        
        Element emailElement = RubricaTelefonicaGUI.document.createElement("email");
        emailElement.appendChild(RubricaTelefonicaGUI.document.createTextNode(emailString));
        node.appendChild(emailElement); 
        
        Element telefonoElement = RubricaTelefonicaGUI.document.createElement("telephone");
        telefonoElement.appendChild(RubricaTelefonicaGUI.document.createTextNode(telephoneString));
        node.appendChild(telefonoElement); 
        
        Element numeroInternoCreateElement = RubricaTelefonicaGUI.document.createElement("numero_interno");
        numeroInternoCreateElement.appendChild(RubricaTelefonicaGUI.document.createTextNode(numeroInternoString));
        node.appendChild(numeroInternoCreateElement); 
        
        element.appendChild(node);
        
        // FIX TABLE 
        NodeList listaa = RubricaTelefonicaGUI.document.getElementsByTagName("person"); 
        Element elementt = (Element) listaa.item(lunghezzaLista); 
        
        RubricaTelefonicaGUI.addOneElementToTable(elementt);
        RubricaTelefonicaGUI.setDefaultXML();
        
        try
        {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Result output = new StreamResult(new File(RubricaTelefonicaGUI.defaultFileName));
            Source input = new DOMSource(RubricaTelefonicaGUI.document);

            transformer.transform(input, output);  
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCellulare;
    private javax.swing.JTextField fieldCognome;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldInterno;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
