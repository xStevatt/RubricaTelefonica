package rubricatelefonica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FileModifierGUI extends javax.swing.JFrame {
    
    private int numeroPersone = 0; 
    private int elementsFound = 0; 
    private boolean isOnePersonSelected = false; 
    private int posizionePersona = 0; 
    
    public FileModifierGUI() 
    {   
        this.setTitle("Modifica un file"); 
        this.setResizable(false);
        
        initComponents();
        this.setLocationRelativeTo(null);
        NodeList nodeList = RubricaTelefonicaGUI.document.getElementsByTagName("employee");
        this.numeroPersone = nodeList.getLength(); 
        
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(IDRadioButton);
        bg.add(NameSurnameRadio);
        IDRadioButton.setSelected(true);
                
        buttonID.setEnabled(true);
        fieldID.setEditable(true);
        fieldCognome.setEditable(false);
        fieldNome.setEditable(false);
        buttonSurname.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        deletePersonNameButton = new javax.swing.JButton();
        deletePersonSurnameButton = new javax.swing.JButton();
        deletePersonMobileButton = new javax.swing.JButton();
        deleteNumeroInterno = new javax.swing.JButton();
        deletePersonEmailButton = new javax.swing.JButton();
        personSelectedLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        addPersonButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IDRadioButton = new javax.swing.JRadioButton();
        NameSurnameRadio = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        fieldNome = new javax.swing.JTextField();
        fieldCognome = new javax.swing.JTextField();
        buttonSurname = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fieldID = new javax.swing.JTextField();
        buttonID = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modifica un file");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deletePersonNameButton.setEnabled(false);
        deletePersonNameButton.setText("Elimina nome persona");
        deletePersonNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonNameButtonActionPerformed(evt);
            }
        });

        deletePersonSurnameButton.setEnabled(false);
        deletePersonSurnameButton.setText("Elimina Cognome persona");
        deletePersonSurnameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonSurnameButtonActionPerformed(evt);
            }
        });

        deletePersonMobileButton.setEnabled(false);
        deletePersonMobileButton.setText("Elimina Cellulare persona");
        deletePersonMobileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonMobileButtonActionPerformed(evt);
            }
        });

        deleteNumeroInterno.setEnabled(false);
        deleteNumeroInterno.setText("Elimina Numero Interno");
        deleteNumeroInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNumeroInternoActionPerformed(evt);
            }
        });

        deletePersonEmailButton.setEnabled(false);
        deletePersonEmailButton.setText("Elimina Email persona");
        deletePersonEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonEmailButtonActionPerformed(evt);
            }
        });

        personSelectedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personSelectedLabel.setText("Nessuna Persona Selezionata");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletePersonSurnameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePersonNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePersonMobileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteNumeroInterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePersonEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personSelectedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePersonNameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonSurnameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonMobileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteNumeroInterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonEmailButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cerca la persona che vuoi modificare");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Elimina persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addPersonButton.setText("Aggiungi Persona");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPersonButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Search by");

        IDRadioButton.setBackground(new java.awt.Color(204, 204, 255));
        IDRadioButton.setText("ID");
        IDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRadioButtonActionPerformed(evt);
            }
        });

        NameSurnameRadio.setBackground(new java.awt.Color(204, 204, 255));
        NameSurnameRadio.setText("Name & Surname");
        NameSurnameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSurnameRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameSurnameRadio)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDRadioButton)
                    .addComponent(NameSurnameRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.setText("Inserisci qui il nome");
        fieldNome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(NameSurnameRadio.isSelected())
                {
                    fieldNome.setText("");
                    personSelectedLabel.setText("Nessuna Persona Selezionata");
                    deletePersonNameButton.setEnabled(false);
                    deletePersonSurnameButton.setEnabled(false);
                    deletePersonMobileButton.setEnabled(false);
                    deletePersonEmailButton.setEnabled(false);
                    deleteNumeroInterno.setEnabled(false);
                }
            }
        });
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        fieldCognome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldCognome.setText("Inserisci qui il cognome");
        fieldCognome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(!IDRadioButton.isSelected())
                {
                    fieldCognome.setText("");
                    personSelectedLabel.setText("Nessuna Persona Selezionata");
                    deletePersonNameButton.setEnabled(false);
                    deletePersonSurnameButton.setEnabled(false);
                    deletePersonMobileButton.setEnabled(false);
                    deletePersonEmailButton.setEnabled(false);
                    deleteNumeroInterno.setEnabled(false);
                }
            }
        });

        buttonSurname.setText("Cerca");
        buttonSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSurnameActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nome");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cognome");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(fieldCognome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSurname)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldID.setText("Inserisci qui l'ID");
        fieldID.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(!NameSurnameRadio.isSelected())
                {
                    fieldID.setText("");
                    personSelectedLabel.setText("Nessuna Persona Selezionata");
                    deletePersonNameButton.setEnabled(false);
                    deletePersonSurnameButton.setEnabled(false);
                    deletePersonMobileButton.setEnabled(false);
                    deletePersonEmailButton.setEnabled(false);
                    deleteNumeroInterno.setEnabled(false);
                }
            }
        });

        buttonID.setText("Cerca");
        buttonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIDActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonID)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Puoi modificare una persona sola, prova a cercare by ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletePersonNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonNameButtonActionPerformed
        String[] options = {"Sì", "No", "Annulla"};
        
        int option = JOptionPane.showOptionDialog(this, "Sei sicuro di voler eliminare il nome?", "Attenzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        int personaSelezionata = this.posizionePersona; 
        
        NodeList nodes = RubricaTelefonicaGUI.document.getElementsByTagName("person");
        
        if(option == 0)
        {
            NodeList lista = RubricaTelefonicaGUI.document.getElementsByTagName("person"); 
            Element elemento = (Element) lista.item(personaSelezionata); 
            elemento.removeChild(elemento); 
            
            RubricaTelefonicaGUI.document.normalize();
        }
        
        if(option == 1)
        {
            System.out.println("2");
        }
        
        if(option == 2)
        {
            System.out.println("3");
        }
    }//GEN-LAST:event_deletePersonNameButtonActionPerformed

    private void deletePersonSurnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonSurnameButtonActionPerformed
        String[] options = {"Sì", "No", "Annulla"};
        int option = JOptionPane.showOptionDialog(this, "Sei sicuro di voler eliminare il cognome?", "Attenzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        
        if(option == 0)
        {
            System.out.println("1");
        }
        
        if(option == 1)
        {
            System.out.println("2");
        }
        
        if(option == 2)
        {
            System.out.println("3");
        }
    }//GEN-LAST:event_deletePersonSurnameButtonActionPerformed

    private void deletePersonMobileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonMobileButtonActionPerformed
        String[] options = {"Sì", "No", "Annulla"};
        int option = JOptionPane.showOptionDialog(this, "Sei sicuro di voler eliminare il cellulare?", "Attenzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        
        if(option == 0)
        {
            System.out.println("1");
        }
        
        if(option == 1)
        {
            System.out.println("2");
        }
        
        if(option == 2)
        {
            System.out.println("3");
        }
    }//GEN-LAST:event_deletePersonMobileButtonActionPerformed

    private void deleteNumeroInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNumeroInternoActionPerformed
        String[] options = {"Sì", "No", "Annulla"};
        int option = JOptionPane.showOptionDialog(this, "Sei sicuro di voler eliminare il numero di interno?", "Attenzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        
        if(option == 0)
        {
            System.out.println("1");
        }
        
        if(option == 1)
        {
            System.out.println("2");
        }
        
        if(option == 2)
        {
            System.out.println("3");
        }
    }//GEN-LAST:event_deleteNumeroInternoActionPerformed

    private void deletePersonEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonEmailButtonActionPerformed
        String[] options = {"Sì", "No", "Annulla"};
        int option = JOptionPane.showOptionDialog(this, "Sei sicuro di voler eliminare l'email?", "Attenzione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        
        if(option == 0)
        {
            System.out.println("1");
        }
        
        if(option == 1)
        {
            System.out.println("2");
        }
        
        if(option == 2)
        {
            System.out.println("3");
        }
    }//GEN-LAST:event_deletePersonEmailButtonActionPerformed

    private void buttonSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSurnameActionPerformed
        String cognome = fieldCognome.getText().trim(); 
        String nome = fieldNome.getText().trim();
        
        // Initialize
        isOnePersonSelected = false; 
        posizionePersona = 0; 
        elementsFound = 0; 
        jTextArea1.setText("");
        
        NodeList nodeList = RubricaTelefonicaGUI.document.getElementsByTagName("person");
        
        if(nodeList == null)
        {
            System.out.println("rip");
        }
        
        for (int i = 0; i < nodeList.getLength(); i++) 
        {
            Node nNode = nodeList.item(i);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) 
            {
                Element elem = (Element) nNode;

                Node node1 = elem.getElementsByTagName("firstname").item(0);
                Node node2 = elem.getElementsByTagName("lastname").item(0); 
                String fname = node1.getTextContent();
                String fsurname = node2.getTextContent(); 
                
                if(fname.equalsIgnoreCase(nome) && fsurname.equalsIgnoreCase(cognome))
                {   
                    elementsFound++; 
                    
                    if(elementsFound == 1)
                    {   
                        isOnePersonSelected = true; 
                        jTextArea1.append("<rubrica>" + "\n");
                        posizionePersona = i; 
                    }
                    else
                    {
                        isOnePersonSelected = false; 
                    }
                    
                    Node el1 = elem.getElementsByTagName("firstname").item(0);
                    String nomeStringato = el1.getTextContent();
                    Node el2 = elem.getElementsByTagName("lastname").item(0);
                    String cognomeStringato = el2.getTextContent();
                    Node el3 = elem.getElementsByTagName("email").item(0);
                    String emailStringato = el3.getTextContent();
                    Node el4 = elem.getElementsByTagName("telephone").item(0);
                    String depStringato = el4.getTextContent(); 
                    Node el5 = elem.getElementsByTagName("numero_interno").item(0);
                    String internoStringato = el5.getTextContent();       
                    
                    jTextArea1.append(" <person>" + "\n");
                    jTextArea1.append("     <firstname>" + nomeStringato + "</firstname>" + "\n");
                    jTextArea1.append("     <lastname>" + cognomeStringato + "</lastname>" + "\n"); 
                    jTextArea1.append("     <email>" + emailStringato + "</email>" + "\n");
                    jTextArea1.append("     <telephone>" + depStringato + "</telephone>" + "\n");
                    jTextArea1.append("     <numero_interno>" + internoStringato + "</numero_interno>" + "\n");
                    jTextArea1.append(" </person>" + "\n");
                }
            }
        }
        if(elementsFound != 0)
        {
            jTextArea1.append("</rubrica>" + "\n");
        }
        
        if(isOnePersonSelected)
        {   
            personSelectedLabel.setText("Persona " + posizionePersona + " selezionata");
            deletePersonNameButton.setEnabled(true);
            deletePersonSurnameButton.setEnabled(true);
            deletePersonMobileButton.setEnabled(true);
            deletePersonEmailButton.setEnabled(true);
            deleteNumeroInterno.setEnabled(true);
        }
        
        if(elementsFound > 1)
        {
            personSelectedLabel.setText(elementsFound + " persone trovate");
        }
        
        if(elementsFound == 0)
        {
            JOptionPane.showMessageDialog(this, "Nessun elemento trovato!");
        }
    }//GEN-LAST:event_buttonSurnameActionPerformed
    
    
    private void buttonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIDActionPerformed
               
        Element element = null; 
        XPathFactory xpathFactory; 
        XPath xpath; 
        jTextArea1.setText("");
        
        int numero = -1; 
        boolean erroreConversione = false; 
        
        try
        {
            numero = Integer.parseInt(fieldID.getText()); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Inserisci un numero valido", "Attenzione", JOptionPane.WARNING_MESSAGE);
            fieldID.setText("");
            erroreConversione = true; 
        }
        
        if(!erroreConversione)
        {   
            try
            {
                xpathFactory = XPathFactory.newInstance();
                xpath = xpathFactory.newXPath();
                element = (Element) xpath.evaluate("//*[@id='" + Integer.toString(numero) + "']", RubricaTelefonicaGUI.document, XPathConstants.NODE);
                posizionePersona = numero;
                deleteNumeroInterno.setEnabled(true);
                deletePersonEmailButton.setEnabled(true);
                deletePersonMobileButton.setEnabled(true);
                deletePersonNameButton.setEnabled(true);
                deletePersonSurnameButton.setEnabled(true);
            }
            catch(Exception e)
            {
                deleteNumeroInterno.setEnabled(false);
                deletePersonEmailButton.setEnabled(false);
                deletePersonMobileButton.setEnabled(false);
                deletePersonNameButton.setEnabled(false);
                deletePersonSurnameButton.setEnabled(false);
            }
               
            String nomeString = "";
            String cognomeString = ""; 
            String emailString = "";
            String telephoneString = "";
            String internoString = "";
            
            try
            {
                Node el1 = element.getElementsByTagName("firstname").item(0);
                nomeString = el1.getTextContent();
                Node el2 = element.getElementsByTagName("lastname").item(0);
                cognomeString = el2.getTextContent();
                Node el3 = element.getElementsByTagName("email").item(0);
                emailString = el3.getTextContent();
                Node el4 = element.getElementsByTagName("telephone").item(0);
                telephoneString = el4.getTextContent(); 
                Node el5 = element.getElementsByTagName("numero_interno").item(0);
                internoString = el5.getTextContent();     
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Elemento non trovato", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
            
            if(nomeString.length() > 0 && cognomeString.length() > 0 && emailString.length() > 0 && telephoneString.length() > 0
                    && internoString.length() > 0)
            {   
                jTextArea1.append(" <person>" + "\n");
                jTextArea1.append("     <firstname>" + nomeString + "</firstname>" + "\n");
                jTextArea1.append("     <lastname>" + cognomeString + "</lastname>" + "\n"); 
                jTextArea1.append("     <email>" + emailString + "</email>" + "\n");
                jTextArea1.append("     <telephone>" + telephoneString + "</telephone>" + "\n");
                jTextArea1.append("     <numero_interno>" + internoString + "</numero_interno>" + "\n");
                jTextArea1.append(" </person>" + "\n");
            }
            else
            {
                deleteNumeroInterno.setEnabled(false);
                deletePersonEmailButton.setEnabled(false);
                deletePersonMobileButton.setEnabled(false);
                deletePersonNameButton.setEnabled(false);
                deletePersonSurnameButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_buttonIDActionPerformed

    private void IDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRadioButtonActionPerformed
        
        jTextArea1.setText("");
        personSelectedLabel.setText("Nessuna Persona Selezionata");
        deleteNumeroInterno.setEnabled(false);
        deletePersonEmailButton.setEnabled(false);
        deletePersonMobileButton.setEnabled(false);
        deletePersonNameButton.setEnabled(false);
        deletePersonSurnameButton.setEnabled(false);
        
        buttonID.setEnabled(true);
        fieldID.setEditable(true);
        fieldCognome.setEditable(false);
        fieldNome.setEditable(false);
        buttonSurname.setEnabled(false);
        
        fieldID.setText("Inserisci qui l'ID");
        fieldCognome.setText("Inserisci qui il cognome");
        fieldNome.setText("Inserisci qui il nome");
    }//GEN-LAST:event_IDRadioButtonActionPerformed

    private void NameSurnameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSurnameRadioActionPerformed
                
        jTextArea1.setText("");
        personSelectedLabel.setText("Nessuna Persona Selezionata");
                
        deleteNumeroInterno.setEnabled(false);
        deletePersonEmailButton.setEnabled(false);
        deletePersonMobileButton.setEnabled(false);
        deletePersonNameButton.setEnabled(false);
        deletePersonSurnameButton.setEnabled(false);
        
        buttonID.setEnabled(false);
        fieldID.setEditable(false);
        fieldCognome.setEditable(true);
        fieldNome.setEditable(true);
        buttonSurname.setEnabled(true);
        
        fieldID.setText("Inserisci qui l'ID");
        fieldCognome.setText("Inserisci qui il cognome");
        fieldNome.setText("Inserisci qui il nome");
    }//GEN-LAST:event_NameSurnameRadioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {   
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            Element persona = (Element) xpath.evaluate("//*[@id='" + Integer.toString(posizionePersona) + "']", RubricaTelefonicaGUI.document, XPathConstants.NODE);
            persona.getParentNode().removeChild(persona);
            RubricaTelefonicaGUI.document.normalize();
            
            jTextArea1.setText("");
            RubricaTelefonicaGUI.setDefaultXML(); 
        }
        catch(Exception e)
        {
        }
        
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
        RubricaTelefonicaGUI.delteAnElement(posizionePersona); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new AddPersonGUI().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_addPersonButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton IDRadioButton;
    private javax.swing.JRadioButton NameSurnameRadio;
    private javax.swing.JButton addPersonButton;
    private javax.swing.JButton buttonID;
    private javax.swing.JButton buttonSurname;
    private javax.swing.JButton deleteNumeroInterno;
    private javax.swing.JButton deletePersonEmailButton;
    private javax.swing.JButton deletePersonMobileButton;
    private javax.swing.JButton deletePersonNameButton;
    private javax.swing.JButton deletePersonSurnameButton;
    private javax.swing.JTextField fieldCognome;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel personSelectedLabel;
    // End of variables declaration//GEN-END:variables
}
