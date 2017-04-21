/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * tgl_pinjamFrame.java
 *
 * 
 */
package KELOMPOK_1;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class tglPinjamFrame extends javax.swing.JFrame {
    
    tglPinjam tp = new tglPinjam();

    /** Creates new form tgl_pinjamFrame */
    public tglPinjamFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        PanelModule = new javax.swing.JPanel();
        iDLabel = new javax.swing.JLabel();
        noIDTextField = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tglComboBox = new javax.swing.JComboBox();
        bulanComboBox = new javax.swing.JComboBox();
        tahunComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        dosenLabel = new javax.swing.JLabel();
        iDLabel1 = new javax.swing.JLabel();
        tlpTextField = new javax.swing.JTextField();
        moduleLabel = new javax.swing.JLabel();
        priaRadioButton = new javax.swing.JRadioButton();
        wanitaRadioButton = new javax.swing.JRadioButton();
        PanelButton = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        writeButton = new javax.swing.JButton();
        prosesButton = new javax.swing.JButton();

        lastButton.setBackground(new java.awt.Color(0, 0, 0));
        lastButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        lastButton.setForeground(new java.awt.Color(51, 255, 0));
        lastButton.setText(">>");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(0, 0, 0));
        nextButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 0, 0));
        nextButton.setText(">");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setBackground(new java.awt.Color(0, 0, 0));
        prevButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        prevButton.setForeground(new java.awt.Color(255, 0, 0));
        prevButton.setText("<");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        firstButton.setBackground(new java.awt.Color(0, 0, 0));
        firstButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        firstButton.setForeground(new java.awt.Color(51, 255, 0));
        firstButton.setText("<<");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[ Data transaksi ] tanggal pengembalian BUKU `");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PanelModule.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "peminjaman buku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12))); // NOI18N
        PanelModule.setFont(new java.awt.Font("Old English Text MT", 1, 11)); // NOI18N

        iDLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iDLabel.setText("no ID ");

        noIDTextField.setText(" ");
        noIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIDTextFieldActionPerformed(evt);
            }
        });

        judulLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        judulLabel.setText("nama peminjam");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tanggal Pinjam :");

        tglComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tgl", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- bulan -", "January", "February", "Maret", "April", "Mey", "Juny", "July", "Agustus", "September", "October", "November", "Desember" }));

        tahunComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "taun", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        tahunComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunComboBoxActionPerformed(evt);
            }
        });

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatTextArea);

        dosenLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dosenLabel.setText("alamat ");

        iDLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iDLabel1.setText("no telephone");

        tlpTextField.setText(" ");
        tlpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlpTextFieldActionPerformed(evt);
            }
        });

        moduleLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        moduleLabel.setText("jenis kelamin");

        priaRadioButton.setText("pria");

        wanitaRadioButton.setText("wanita");

        javax.swing.GroupLayout PanelModuleLayout = new javax.swing.GroupLayout(PanelModule);
        PanelModule.setLayout(PanelModuleLayout);
        PanelModuleLayout.setHorizontalGroup(
            PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iDLabel)
                    .addComponent(noIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iDLabel1)
                    .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelModuleLayout.createSequentialGroup()
                            .addComponent(priaRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wanitaRadioButton))
                        .addComponent(tlpTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(moduleLabel)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulLabel)
                    .addComponent(dosenLabel)
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahunComboBox, 0, 61, Short.MAX_VALUE))
                    .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelModuleLayout.setVerticalGroup(
            PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModuleLayout.createSequentialGroup()
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addComponent(judulLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dosenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addComponent(iDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iDLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tlpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moduleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priaRadioButton)
                            .addComponent(wanitaRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        PanelButton.setBackground(new java.awt.Color(0, 0, 0));
        PanelButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images copy.png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("\" Silahkan iSi Biodata anda ! \"");

        writeButton.setBackground(new java.awt.Color(0, 0, 0));
        writeButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        writeButton.setForeground(new java.awt.Color(51, 255, 0));
        writeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon Corel_.png"))); // NOI18N
        writeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(writeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(writeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prosesButton.setBackground(new java.awt.Color(0, 0, 0));
        prosesButton.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        prosesButton.setForeground(new java.awt.Color(255, 255, 255));
        prosesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Love-message-icon.png"))); // NOI18N
        prosesButton.setText("proses");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelModule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prosesButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prosesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void noIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIDTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_noIDTextFieldActionPerformed

private void tlpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlpTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tlpTextFieldActionPerformed

private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
// home
    peminjamanBuku pB = new peminjamanBuku();
    pB.setVisible(true);
    dispose();
}//GEN-LAST:event_homeButtonActionPerformed

private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
// first
    
}//GEN-LAST:event_firstButtonActionPerformed

private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
// prev
    
}//GEN-LAST:event_prevButtonActionPerformed

private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
// next
    
}//GEN-LAST:event_nextButtonActionPerformed

private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
// last
    
}//GEN-LAST:event_lastButtonActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// window activated
    
}//GEN-LAST:event_formWindowActivated

private void writeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeButtonActionPerformed
// write
    noIDTextField.setText("");
    namaTextField.setText("");
    tlpTextField.setText("");
    alamatTextArea.setText("");
    priaRadioButton.setSelected(false);
    wanitaRadioButton.setSelected(false);
    tglComboBox.setSelectedIndex(0);
    bulanComboBox.setSelectedIndex(0);
    tahunComboBox.setSelectedIndex(0);
    
}//GEN-LAST:event_writeButtonActionPerformed

private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
// prosses
    tp.no_id = noIDTextField.getText();
    tp.nama = namaTextField.getText();
    tp.telp = tlpTextField.getText();
    tp.alamat = alamatTextArea.getText();
    if(priaRadioButton.isSelected()){
        tp.jenis_kelamin = priaRadioButton.getText();
    } else {
        tp.jenis_kelamin = wanitaRadioButton.getText();
    }
    tp.date = tglComboBox.getSelectedItem().toString()+" "+
            bulanComboBox.getSelectedItem().toString()+" "+
            tahunComboBox.getSelectedItem().toString();
    tp.prosses();
    noIDTextField.requestFocus();
}//GEN-LAST:event_prosesButtonActionPerformed

    private void tahunComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahunComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tglPinjamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tglPinjamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tglPinjamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tglPinjamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tglPinjamFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelButton;
    private javax.swing.JPanel PanelModule;
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JComboBox bulanComboBox;
    private javax.swing.JLabel dosenLabel;
    private javax.swing.JButton firstButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JLabel iDLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton lastButton;
    private javax.swing.JLabel moduleLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField noIDTextField;
    private javax.swing.JButton prevButton;
    private javax.swing.JRadioButton priaRadioButton;
    private javax.swing.JButton prosesButton;
    private javax.swing.JComboBox tahunComboBox;
    private javax.swing.JComboBox tglComboBox;
    private javax.swing.JTextField tlpTextField;
    private javax.swing.JRadioButton wanitaRadioButton;
    private javax.swing.JButton writeButton;
    // End of variables declaration//GEN-END:variables
}
