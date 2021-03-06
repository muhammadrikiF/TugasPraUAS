/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pembayaranFrame.java
 *
 * 
 */
package KELOMPOK_1;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class pembayaranFrame extends javax.swing.JFrame {
    
    pembayaran p = new pembayaran();
    tglPinjam tp = new tglPinjam();

    /** Creates new form pembayaranFrame */
    public pembayaranFrame() {
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

        prosesButton = new javax.swing.JButton();
        PanelButton = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PanelModule = new javax.swing.JPanel();
        iDLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        biayaBayarTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sisaBiayaTextField = new javax.swing.JTextField();
        sisa_biaya = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iDLabel1 = new javax.swing.JLabel();
        iDLabel2 = new javax.swing.JLabel();
        tglPinjamLabel = new javax.swing.JLabel();
        tglKembaliLabel = new javax.swing.JLabel();
        no_IDTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablebuku = new javax.swing.JTable();
        totalTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[ Data transaksi ] pembayaran `");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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
        jLabel2.setText("\" Data pemBayaran peminjaman buKu \"");

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelModule.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "transaksi   pembayaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12))); // NOI18N
        PanelModule.setFont(new java.awt.Font("Old English Text MT", 1, 11)); // NOI18N

        iDLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iDLabel.setText("no ID peminjam");

        judulLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        judulLabel.setText("nama peminjam");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Total Biaya");

        biayaBayarTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel3.setText("biaya yang akan Anda Bayar");

        sisaBiayaTextField.setEditable(false);
        sisaBiayaTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        sisaBiayaTextField.setForeground(new java.awt.Color(255, 0, 0));

        sisa_biaya.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        sisa_biaya.setText("sisa Biaya");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel5.setText("Rp.");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel6.setText("Rp.");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        jLabel7.setText("Rp.");

        iDLabel1.setFont(new java.awt.Font("Constantia", 2, 12)); // NOI18N
        iDLabel1.setText("tgl pinjam   :");

        iDLabel2.setFont(new java.awt.Font("Constantia", 2, 12)); // NOI18N
        iDLabel2.setText("tgl kembali :");

        tglPinjamLabel.setFont(new java.awt.Font("Constantia", 2, 12)); // NOI18N
        tglPinjamLabel.setText("-- / -- / --");

        tglKembaliLabel.setFont(new java.awt.Font("Constantia", 2, 12)); // NOI18N
        tglKembaliLabel.setText("-- / -- / --");

        no_IDTextField.setEditable(false);
        no_IDTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 10)); // NOI18N
        no_IDTextField.setForeground(new java.awt.Color(0, 0, 204));
        no_IDTextField.setText(" ");
        no_IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_IDTextFieldActionPerformed(evt);
            }
        });

        namaTextField.setEditable(false);
        namaTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 11)); // NOI18N
        namaTextField.setForeground(new java.awt.Color(0, 0, 204));

        tablebuku.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        tablebuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID buku", "Judul buku", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablebuku);

        totalTextField.setEditable(false);
        totalTextField.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        totalTextField.setForeground(new java.awt.Color(255, 0, 0));
        totalTextField.setText(" ");
        totalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelModuleLayout = new javax.swing.GroupLayout(PanelModule);
        PanelModule.setLayout(PanelModuleLayout);
        PanelModuleLayout.setHorizontalGroup(
            PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(no_IDTextField)
                            .addComponent(iDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addComponent(judulLabel)
                                .addGap(98, 98, 98))
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addComponent(iDLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tglPinjamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addComponent(iDLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tglKembaliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelModuleLayout.createSequentialGroup()
                            .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(sisa_biaya))
                            .addGap(18, 18, 18)
                            .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModuleLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sisaBiayaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelModuleLayout.createSequentialGroup()
                                    .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(totalTextField)
                                        .addComponent(biayaBayarTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        PanelModuleLayout.setVerticalGroup(
            PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDLabel)
                    .addComponent(judulLabel))
                .addGap(2, 2, 2)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDLabel1)
                    .addComponent(tglPinjamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDLabel2)
                    .addComponent(tglKembaliLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(biayaBayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sisa_biaya)
                    .addComponent(sisaBiayaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prosesButton)
                    .addComponent(PanelModule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prosesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
// prosses
    int z = Integer.parseInt(totalTextField.getText());
    int bayar = Integer.parseInt(biayaBayarTextField.getText());
    int sisa = bayar - z;
    
    if (sisa==0){
        sisaBiayaTextField.setText("[ LUNAS ]");
        JOptionPane.showMessageDialog(null, "\n"+"   TERIMAKASIH !"+"\n"+"atas partisipasi anda ..");
    } else if(sisa < 0){
        sisaBiayaTextField.setText(sisa+",-");
        JOptionPane.showMessageDialog(null, "sisa biaya anda sebesar Rp. "+sisa+",-");
    }
    else {
        sisa_biaya.setText("kembali");
        sisaBiayaTextField.setText(sisa+",-");
        JOptionPane.showMessageDialog(null, "\n"+"   TERIMAKASIH !"+"\n"+"atas partisipasi anda ..");
    }
    
    p.no_id = no_IDTextField.getText();
    p.nama = namaTextField.getText();
    p.tgl_pinjam = tglPinjamLabel.getText();
    p.tgl_kembali = tglKembaliLabel.getText();
    p.id_buku = tablebuku.getValueAt(0, 0).toString();
    p.judul_buku = tablebuku.getValueAt(0, 1).toString();
    p.harga = tablebuku.getValueAt(0, 2).toString();
    p.total_biaya = totalTextField.getText();
    p.bayar = biayaBayarTextField.getText();
    p.sisa_biaya = sisaBiayaTextField.getText();
    p.prosses();
    
    no_IDTextField.requestFocus();
    

}//GEN-LAST:event_prosesButtonActionPerformed

private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
// home
    peminjamanBuku pB = new peminjamanBuku();
    pB.setVisible(true);
    dispose();
}//GEN-LAST:event_homeButtonActionPerformed

private void no_IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_IDTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_no_IDTextFieldActionPerformed

private void totalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_totalTextFieldActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// window activated
    p.window();
    no_IDTextField.setText(p.tp.no_id);
    namaTextField.setText(p.tp.nama);
    tglPinjamLabel.setText(p.tp.date);
    tglKembaliLabel.setText(p.tk.date);
    
    DefaultTableModel tableBUKU = new DefaultTableModel();
        tableBUKU.addColumn("ID buku");
        tableBUKU.addColumn("judul buku");
        tableBUKU.addColumn("Harga");
        try {
            String sql = "SELECT * FROM sewa_buku";
            ResultSet rs = p.st.executeQuery(sql);
            while(rs.next()){
                tableBUKU.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed - progress BUKU");
        }
    tablebuku.setModel(tableBUKU);
    
    try {
        int x1 = Integer.parseInt(tablebuku.getValueAt(0, 2).toString());
        int x2 = Integer.parseInt(tablebuku.getValueAt(1, 2).toString());
        int total = x1 + x2;
        totalTextField.setText(""+total);
    } catch (Exception e) {
    }
    
    try {
        int x1 = Integer.parseInt(tablebuku.getValueAt(0, 2).toString());
        int x2 = Integer.parseInt(tablebuku.getValueAt(1, 2).toString());
        int x3 = Integer.parseInt(tablebuku.getValueAt(2, 2).toString());
        int total = x1 + x2 + x3;
        totalTextField.setText(""+total);
    } catch (Exception e) {
    }
    
    try {
        int x1 = Integer.parseInt(tablebuku.getValueAt(0, 2).toString());
        int x2 = Integer.parseInt(tablebuku.getValueAt(1, 2).toString());
        int x3 = Integer.parseInt(tablebuku.getValueAt(2, 2).toString());
        int x4 = Integer.parseInt(tablebuku.getValueAt(3, 2).toString());
        int total = x1 + x2 + x3 + x4;
        totalTextField.setText(""+total);
    } catch (Exception e) {
    }
    
    try {
        int x1 = Integer.parseInt(tablebuku.getValueAt(0, 2).toString());
        int x2 = Integer.parseInt(tablebuku.getValueAt(1, 2).toString());
        int x3 = Integer.parseInt(tablebuku.getValueAt(2, 2).toString());
        int x4 = Integer.parseInt(tablebuku.getValueAt(3, 2).toString());
        int x5 = Integer.parseInt(tablebuku.getValueAt(4, 2).toString());
        int total = x1 + x2 + x3 + x4 + x5;
        totalTextField.setText(""+total);
    } catch (Exception e) {
    }
    
    try {
        int x1 = Integer.parseInt(tablebuku.getValueAt(0, 2).toString());
        int x2 = Integer.parseInt(tablebuku.getValueAt(1, 2).toString());
        int x3 = Integer.parseInt(tablebuku.getValueAt(2, 2).toString());
        int x4 = Integer.parseInt(tablebuku.getValueAt(3, 2).toString());
        int x5 = Integer.parseInt(tablebuku.getValueAt(4, 2).toString());
        int x6 = Integer.parseInt(tablebuku.getValueAt(5, 2).toString());
        int total = x1 + x2 + x3 + x4 + x5 +x6;
        totalTextField.setText(""+total);
    } catch (Exception e) {
    }
    
}//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(pembayaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pembayaranFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelButton;
    private javax.swing.JPanel PanelModule;
    private javax.swing.JTextField biayaBayarTextField;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JLabel iDLabel1;
    private javax.swing.JLabel iDLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField no_IDTextField;
    private javax.swing.JButton prosesButton;
    private javax.swing.JTextField sisaBiayaTextField;
    private javax.swing.JLabel sisa_biaya;
    private javax.swing.JTable tablebuku;
    private javax.swing.JLabel tglKembaliLabel;
    private javax.swing.JLabel tglPinjamLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
