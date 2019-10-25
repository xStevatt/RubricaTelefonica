package rubricatelefonica;

import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FileModifierGUI extends javax.swing.JFrame {
    
    private boolean isAPersonSelected = false; 
    private int numeroPersone = 0; 
    
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
        deletePersonPhoneButton = new javax.swing.JButton();
        deletePersonAddressButton = new javax.swing.JButton();
        deletePersonEmailButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
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

        deletePersonPhoneButton.setEnabled(false);
        deletePersonPhoneButton.setText("Elimina Fisso persona");
        deletePersonPhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonPhoneButtonActionPerformed(evt);
            }
        });

        deletePersonAddressButton.setEnabled(false);
        deletePersonAddressButton.setText("Elimina Indirizzo persona");
        deletePersonAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonAddressButtonActionPerformed(evt);
            }
        });

        deletePersonEmailButton.setEnabled(false);
        deletePersonEmailButton.setText("Elimina Email persona");
        deletePersonEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonEmailButtonActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nessuna Persona Selezionata");

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
                    .addComponent(deletePersonPhoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePersonAddressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePersonEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePersonNameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonSurnameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonMobileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonPhoneButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonAddressButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePersonEmailButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cerca la persona che vuoi modificare");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Elimina persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addPersonButton.setText("Aggiungi Persona");

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
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

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.setText("Inserisci qui il nome");
        fieldNome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(!IDRadioButton.isSelected())
                {
                    fieldNome.setText("");
                }
            }
        });

        fieldCognome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldCognome.setText("Inserisci qui il cognome");
        fieldCognome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(!IDRadioButton.isSelected())
                {
                    fieldCognome.setText("");
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

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldID.setText("Inserisci qui l'ID");
        fieldID.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(!NameSurnameRadio.isSelected())
                {
                    fieldID.setText("");
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
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonNameButtonActionPerformed

    private void deletePersonSurnameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonSurnameButtonActionPerformed
               
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna personaè stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonSurnameButtonActionPerformed

    private void deletePersonMobileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonMobileButtonActionPerformed
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonMobileButtonActionPerformed

    private void deletePersonPhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonPhoneButtonActionPerformed
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonPhoneButtonActionPerformed

    private void deletePersonAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonAddressButtonActionPerformed
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonAddressButtonActionPerformed

    private void deletePersonEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonEmailButtonActionPerformed
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePersonEmailButtonActionPerformed

    private void buttonSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSurnameActionPerformed
        String cognome = fieldCognome.getText(); 
        String nome = fieldNome.getText();
        
        NodeList nodeList = RubricaTelefonicaGUI.document.getElementsByTagName("employee");
        
        if(nodeList == null)
        {
            System.out.println("rip");
        }
        jTextArea1.append("<rubrica>" + "\n");
        
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
                        
                if(fname.equals(nome) && fsurname.equals(cognome))
                {
                    Node el1 = elem.getElementsByTagName("firstname").item(0);
                    String nomeStringato = el1.getTextContent();
                    
                    Node el2 = elem.getElementsByTagName("lastname").item(0);
                    String cognomeStringato = el2.getTextContent();
                    Node el3 = elem.getElementsByTagName("email").item(0);
                    String emailStringato = el3.getTextContent();
                    Node el4 = elem.getElementsByTagName("department").item(0);
                    String depStringato = el4.getTextContent(); 
                          
                    
                    jTextArea1.append(" <employee>" + "\n");
                    jTextArea1.append("     <name>" + nomeStringato + "</name>" + "\n");
                    jTextArea1.append("     <lastname>" + cognomeStringato + "</lastname>" + "\n"); 
                    jTextArea1.append("     <email>" + emailStringato + "</email>" + "\n");
                    jTextArea1.append("     <deparment>" + depStringato + "</deparment>" + "\n");
                    jTextArea1.append(" </employee>" + "\n\n");
                }
            }
        }
        jTextArea1.append("</rubrica>" + "\n");
    }//GEN-LAST:event_buttonSurnameActionPerformed
    
    
    private void buttonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIDActionPerformed
        if(isAPersonSelected)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Attenzione", "Nessuna persona è stata selezionata", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonIDActionPerformed

    private void IDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRadioButtonActionPerformed
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
        // TODO add your handling code here:
        
        // open a joption pane, be sure to ask and check the input
        int idNumber; 
        
        do
        {
            String idPersona;
            idPersona = JOptionPane.showInputDialog("Inserisci l'id della persona da eliminare");
            idNumber = Integer.parseInt(idPersona); 
            
            Element element = (Element) RubricaTelefonicaGUI.document.getElementsByTagName(idPersona).item(0);
        }while(idNumber <= 0 || idNumber > numeroPersone);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton IDRadioButton;
    private javax.swing.JRadioButton NameSurnameRadio;
    private javax.swing.JButton addPersonButton;
    private javax.swing.JButton buttonID;
    private javax.swing.JButton buttonSurname;
    private javax.swing.JButton deletePersonAddressButton;
    private javax.swing.JButton deletePersonEmailButton;
    private javax.swing.JButton deletePersonMobileButton;
    private javax.swing.JButton deletePersonNameButton;
    private javax.swing.JButton deletePersonPhoneButton;
    private javax.swing.JButton deletePersonSurnameButton;
    private javax.swing.JTextField fieldCognome;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    // End of variables declaration//GEN-END:variables
}
