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
import org.w3c.dom.NamedNodeMap;
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
        
        deletePersonButton.setEnabled(false);
        
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        deletePersonButton = new javax.swing.JButton();
        addPersonButton = new javax.swing.JButton();
        modifyName = new javax.swing.JButton();
        personSelectedLabel = new javax.swing.JLabel();
        modifySurname = new javax.swing.JButton();
        modifyEmail = new javax.swing.JButton();
        modifyTelephone = new javax.swing.JButton();
        modifyIntern = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modifica un file");

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

        deletePersonButton.setText("Elimina persona");
        deletePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonButtonActionPerformed(evt);
            }
        });

        addPersonButton.setText("Aggiungi Persona");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });

        modifyName.setText("Modifica Nome");
        modifyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyNameActionPerformed(evt);
            }
        });

        personSelectedLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        personSelectedLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        personSelectedLabel.setText("Nessuna Persona Selezionata");

        modifySurname.setText("Modifica Cognome");

        modifyEmail.setText("Modifica Email");
        modifyEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyEmailActionPerformed(evt);
            }
        });

        modifyTelephone.setText("Modifca Numero di Telefono");

        modifyIntern.setText("Modifica Numero di Interno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modifyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(deletePersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(modifySurname, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(modifyEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(modifyTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(modifyIntern, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(personSelectedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(personSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletePersonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPersonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifySurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyTelephone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyIntern)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Search by");

        IDRadioButton.setBackground(new java.awt.Color(255, 204, 204));
        IDRadioButton.setText("ID");
        IDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRadioButtonActionPerformed(evt);
            }
        });

        NameSurnameRadio.setBackground(new java.awt.Color(255, 204, 204));
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
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(fieldCognome))
                .addGap(14, 14, 14)
                .addComponent(buttonSurname)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonID)
                .addContainerGap())
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

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Puoi modificare solo una persona alla volta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(0, 33, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSurnameActionPerformed
        String cognome = fieldCognome.getText().trim(); 
        String nome = fieldNome.getText().trim();
                
        deletePersonButton.setEnabled(false);
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
        
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
                        posizionePersona = Integer.parseInt(elem.getAttribute("id")); 
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
            deletePersonButton.setEnabled(true);
            addPersonButton.setEnabled(true);
            modifyEmail.setEnabled(true);
            modifyIntern.setEnabled(true);
            modifyName.setEnabled(true);
            modifySurname.setEnabled(true);
            modifyTelephone.setEnabled(true);
            
            personSelectedLabel.setText("Persona " + posizionePersona + " selezionata");
            deletePersonButton.setEnabled(true);
            addPersonButton.setEnabled(true);
        }
        
        if(elementsFound > 1)
        {
            personSelectedLabel.setText(elementsFound + " persone trovate");
            deletePersonButton.setEnabled(false);
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
                        
        deletePersonButton.setEnabled(false);
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
        
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
            }
            catch(Exception e)
            {
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
                
                deletePersonButton.setEnabled(true);
                addPersonButton.setEnabled(true);

                modifyEmail.setEnabled(true);
                modifyIntern.setEnabled(true);
                modifyName.setEnabled(true);
                modifySurname.setEnabled(true);
                modifyTelephone.setEnabled(true);
                
            }
            else
            {
                deletePersonButton.setEnabled(false);
                modifyEmail.setEnabled(false);
                modifyIntern.setEnabled(false);
                modifyName.setEnabled(false);
                modifySurname.setEnabled(false);
                modifyTelephone.setEnabled(false);
            }
        }
    }//GEN-LAST:event_buttonIDActionPerformed

    private void IDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRadioButtonActionPerformed
        
        jTextArea1.setText("");
        personSelectedLabel.setText("Nessuna Persona Selezionata");
        
        deletePersonButton.setEnabled(false);
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
        
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
                
        deletePersonButton.setEnabled(false);
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
        
        buttonID.setEnabled(false);
        fieldID.setEditable(false);
        fieldCognome.setEditable(true);
        fieldNome.setEditable(true);
        buttonSurname.setEnabled(true);
        
        fieldID.setText("Inserisci qui l'ID");
        fieldCognome.setText("Inserisci qui il cognome");
        fieldNome.setText("Inserisci qui il nome");
    }//GEN-LAST:event_NameSurnameRadioActionPerformed

    private void deletePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonButtonActionPerformed
        
        deletePersonButton.setEnabled(false);
        modifyEmail.setEnabled(false);
        modifyIntern.setEnabled(false);
        modifyName.setEnabled(false);
        modifySurname.setEnabled(false);
        modifyTelephone.setEnabled(false);
        
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
    }//GEN-LAST:event_deletePersonButtonActionPerformed

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

    private void modifyEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyEmailActionPerformed

    private void modifyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyNameActionPerformed
        
        Node persona = RubricaTelefonicaGUI.document.getElementById(""); 
        
        NodeList lista = persona.getChildNodes(); 
        
        for(int i = 0; i < lista.getLength(); i++)
        {
            Node node = lista.item(i);
            
            if("firstname".equals(node.getNodeName()))
            {   
                System.out.println("here");
                node.setTextContent("asdasdasd");

                NamedNodeMap attr  = node.getParentNode().getAttributes(); 
                Node nodeAttr = attr.getNamedItem("id");
                String stringa = nodeAttr.getTextContent(); 
                System.out.println(stringa);
                
                RubricaTelefonicaGUI.changeAnElement(1, stringa, "Enrico il Papo");
                RubricaTelefonicaGUI.jTable1.updateUI();
            }
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
    }//GEN-LAST:event_modifyNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton IDRadioButton;
    private javax.swing.JRadioButton NameSurnameRadio;
    private javax.swing.JButton addPersonButton;
    private javax.swing.JButton buttonID;
    private javax.swing.JButton buttonSurname;
    private javax.swing.JButton deletePersonButton;
    private javax.swing.JTextField fieldCognome;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modifyEmail;
    private javax.swing.JButton modifyIntern;
    private javax.swing.JButton modifyName;
    private javax.swing.JButton modifySurname;
    private javax.swing.JButton modifyTelephone;
    private javax.swing.JLabel personSelectedLabel;
    // End of variables declaration//GEN-END:variables
}
