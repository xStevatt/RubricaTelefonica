package rubricatelefonica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class FileCreatorGUI extends javax.swing.JFrame
{
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
        jTextField1 = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCognome = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        labelNumCellulare = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        labelNumFisso = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        labelIndirizzo = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        modifyFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crea un File");

        jTextField1.setText("Inserisci qui il nome");
        jTextField1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField1.setText("");
            }
        });

        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome: ");

        labelCognome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCognome.setText("Cognome:");

        jTextField2.setText("Inserisci qui il cognome");
        jTextField2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField2.setText("");
            }
        });

        labelNumCellulare.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNumCellulare.setText("Numero di Cellulare: ");

        jTextField3.setText("Inserisci qui il numero di cellulare");
        jTextField3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField3.setText("");
            }
        });

        labelNumFisso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNumFisso.setText("Numero di Telefono Fisso: ");

        jTextField4.setText("Inserire qui il numero di telefono fisso");
        jTextField4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField4.setText("");
            }
        });

        labelIndirizzo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelIndirizzo.setText("Indirizzo: ");

        jTextField5.setText("Inserire qui l'indrizzo");
        jTextField5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField5.setText("");
            }
        });

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Indirizzo email:");

        jTextField6.setText("Inserire qui l'indirizzo email");
        jTextField6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTextField6.setText("");
            }
        });

        modifyFileButton.setBackground(new java.awt.Color(255, 102, 102));
        modifyFileButton.setText("Crea la nuova rubrica.");
        modifyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNumFisso, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNumCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modifyFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCognome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumCellulare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumFisso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIndirizzo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(28, 28, 28)
                .addComponent(modifyFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFileButtonActionPerformed
        int scelta = JOptionPane.showConfirmDialog(this, "Vuoi modificatre ulteriormente la tua rubrica?", "Elemento Creato", JOptionPane.YES_NO_OPTION);
        
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
    }//GEN-LAST:event_modifyFileButtonActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel labelCognome;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIndirizzo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumCellulare;
    private javax.swing.JLabel labelNumFisso;
    private javax.swing.JButton modifyFileButton;
    // End of variables declaration//GEN-END:variables
}
