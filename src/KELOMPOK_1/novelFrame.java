/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * novelFrame.java
 *
 * 
 */
package KELOMPOK_1;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class novelFrame extends javax.swing.JFrame {
    
    novel n = new novel();

    /** Creates new form novelFrame */
    public novelFrame() {
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

        imageLabel = new javax.swing.JLabel();
        PanelButton = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        sewaButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        untukLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        clickLabel = new javax.swing.JLabel();
        PanelModule = new javax.swing.JPanel();
        iDLabel = new javax.swing.JLabel();
        idbukuTextField = new javax.swing.JTextField();
        moduleLabel = new javax.swing.JLabel();
        dosenLabel = new javax.swing.JLabel();
        pengarangTextField = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        hargaTextField = new javax.swing.JTextField();
        lastButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        penerbitTextField = new javax.swing.JTextField();
        judulTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("category : [ novel ]");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buku c.png"))); // NOI18N

        PanelButton.setBackground(new java.awt.Color(0, 0, 0));
        PanelButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images copy.png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        sewaButton.setBackground(new java.awt.Color(0, 0, 0));
        sewaButton.setFont(new java.awt.Font("SimHei", 1, 12)); // NOI18N
        sewaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buku copy_1.png"))); // NOI18N
        sewaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sewaButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 0));
        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(0, 0, 0));
        editButton.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 0));
        editButton.setText("edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(0, 0, 0));
        addButton.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 0));
        addButton.setText("+ add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sewaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap())
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(editButton)
                        .addComponent(deleteButton))
                    .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sewaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        untukLabel.setFont(new java.awt.Font("Consolas", 3, 8)); // NOI18N
        untukLabel.setText("untuk buku yang akan dipinjam ..");

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        noteLabel.setText("note :");

        clickLabel.setFont(new java.awt.Font("Consolas", 3, 8)); // NOI18N
        clickLabel.setText("click icon");

        PanelModule.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "novel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 0, 12))); // NOI18N
        PanelModule.setFont(new java.awt.Font("Old English Text MT", 1, 11)); // NOI18N

        iDLabel.setText("no ID buku");

        idbukuTextField.setText(" ");
        idbukuTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbukuTextFieldActionPerformed(evt);
            }
        });

        moduleLabel.setText("penerbit");

        dosenLabel.setText("pengarang");

        pengarangTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengarangTextFieldActionPerformed(evt);
            }
        });

        judulLabel.setText("judul novel");

        hargaLabel.setText("harga sewa");

        hargaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTextFieldActionPerformed(evt);
            }
        });

        lastButton.setBackground(new java.awt.Color(0, 0, 0));
        lastButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        lastButton.setForeground(new java.awt.Color(51, 255, 0));
        lastButton.setText(">>");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
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

        prevButton.setBackground(new java.awt.Color(0, 0, 0));
        prevButton.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        prevButton.setForeground(new java.awt.Color(255, 0, 0));
        prevButton.setText("<");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
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

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setFont(new java.awt.Font("SimHei", 1, 10)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image_search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
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
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(iDLabel)
                            .addComponent(idbukuTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(pengarangTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(dosenLabel))
                        .addGap(28, 28, 28)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moduleLabel)
                            .addComponent(judulLabel)
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addComponent(firstButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prevButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModuleLayout.createSequentialGroup()
                                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judulTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(penerbitTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(hargaLabel))
                .addContainerGap())
        );
        PanelModuleLayout.setVerticalGroup(
            PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addComponent(iDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idbukuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judulTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelModuleLayout.createSequentialGroup()
                        .addComponent(judulLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addComponent(searchButton)
                                .addGap(13, 13, 13)
                                .addComponent(dosenLabel))
                            .addGroup(PanelModuleLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(moduleLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pengarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penerbitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(hargaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstButton)
                            .addComponent(prevButton)
                            .addComponent(nextButton)
                            .addComponent(lastButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(noteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clickLabel)
                        .addGap(3, 3, 3)
                        .addComponent(imageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(untukLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noteLabel)
                        .addComponent(clickLabel)
                        .addComponent(untukLabel))
                    .addComponent(imageLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void hargaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_hargaTextFieldActionPerformed

private void pengarangTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengarangTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_pengarangTextFieldActionPerformed

private void idbukuTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbukuTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_idbukuTextFieldActionPerformed

private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
// home
    peminjamanBuku pB = new peminjamanBuku();
    pB.setVisible(true);
    dispose();
}//GEN-LAST:event_homeButtonActionPerformed

private void sewaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sewaButtonActionPerformed
// sewa
    n.id_buku = idbukuTextField.getText();
    n.judul_buku = judulTextField.getText();
    n.harga = hargaTextField.getText();
    n.sewa();
    
    JOptionPane.showMessageDialog(null,"Buku '' "+judulTextField.getText()+" '' telah di prosses");
    novelFrame nF = new novelFrame();
    nF.show();
    dispose();
}//GEN-LAST:event_sewaButtonActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// window activated
    idbukuTextField.setText(n.id_buku);
    judulTextField.setText(n.judul_buku);
    pengarangTextField.setText(n.pengarang);
    penerbitTextField.setText(n.penerbit);
    hargaTextField.setText(n.harga);
}//GEN-LAST:event_formWindowActivated

private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
// first
    n.getFirst();
    
    idbukuTextField.setText(n.id_buku);
    judulTextField.setText(n.judul_buku);
    pengarangTextField.setText(n.pengarang);
    penerbitTextField.setText(n.penerbit);
    hargaTextField.setText(n.harga);
}//GEN-LAST:event_firstButtonActionPerformed

private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
// prev
    n.getPrev();
    
    idbukuTextField.setText(n.id_buku);
    judulTextField.setText(n.judul_buku);
    pengarangTextField.setText(n.pengarang);
    penerbitTextField.setText(n.penerbit);
    hargaTextField.setText(n.harga);
}//GEN-LAST:event_prevButtonActionPerformed

private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
// next
    n.getNext();
    
    idbukuTextField.setText(n.id_buku);
    judulTextField.setText(n.judul_buku);
    pengarangTextField.setText(n.pengarang);
    penerbitTextField.setText(n.penerbit);
    hargaTextField.setText(n.harga);
}//GEN-LAST:event_nextButtonActionPerformed

private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
// last
    n.getLast();
    
    idbukuTextField.setText(n.id_buku);
    judulTextField.setText(n.judul_buku);
    pengarangTextField.setText(n.pengarang);
    penerbitTextField.setText(n.penerbit);
    hargaTextField.setText(n.harga);
}//GEN-LAST:event_lastButtonActionPerformed

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
// add
    if(addButton.getText().equals("+ add")){
        idbukuTextField.setText("");
        judulTextField.setText("");
        pengarangTextField.setText("");
        penerbitTextField.setText("");
        hargaTextField.setText("");
        idbukuTextField.requestFocus();
        // ganti button
        addButton.setText("save");
    } else {
        n.id_buku = idbukuTextField.getText();
        n.pengarang = pengarangTextField.getText();
        n.penerbit = penerbitTextField.getText();
        n.judul_buku = judulTextField.getText();
        n.harga = hargaTextField.getText();
        n.add();
        
        JOptionPane.showMessageDialog(null,"Buku '' "+judulTextField.getText()+" '' has been Saved ");
        novelFrame nF = new novelFrame();
        nF.show();
        dispose();
        addButton.setText("+ add");
    }
}//GEN-LAST:event_addButtonActionPerformed

private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
// edit
    n.id_buku = idbukuTextField.getText();
    n.pengarang = pengarangTextField.getText();
    n.penerbit = penerbitTextField.getText();
    n.judul_buku = judulTextField.getText();
    n.harga = hargaTextField.getText();
    n.edit();
    
    JOptionPane.showMessageDialog(null," Update successful !");
    novelFrame nF = new novelFrame();
    nF.show();
    dispose();
}//GEN-LAST:event_editButtonActionPerformed

private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
// delete
    int delete = JOptionPane.showConfirmDialog(null, "hapus buku ''"+judulTextField.getText()+"'' ?","confirmasi delete reccord",JOptionPane.YES_NO_OPTION);
    if (delete == JOptionPane.YES_OPTION){
        n.id_buku = idbukuTextField.getText();
        n.pengarang = pengarangTextField.getText();
        n.penerbit = penerbitTextField.getText();
        n.judul_buku = judulTextField.getText();
        n.harga = hargaTextField.getText();
        n.delete();
        
        novelFrame nF = new novelFrame();
        nF.show();
        dispose();
    }
    JOptionPane.showMessageDialog(null," Deleted successful ! ");
}//GEN-LAST:event_deleteButtonActionPerformed

private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
// search
    n.id_buku = idbukuTextField.getText();
    n.pengarang = pengarangTextField.getText();
    n.penerbit = penerbitTextField.getText();
    n.judul_buku = judulTextField.getText();
    n.harga = hargaTextField.getText();
    n.search();
    
    idbukuTextField.requestFocus();
}//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(novelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new novelFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelButton;
    private javax.swing.JPanel PanelModule;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel clickLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dosenLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField idbukuTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField judulTextField;
    private javax.swing.JButton lastButton;
    private javax.swing.JLabel moduleLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField penerbitTextField;
    private javax.swing.JTextField pengarangTextField;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sewaButton;
    private javax.swing.JLabel untukLabel;
    // End of variables declaration//GEN-END:variables
}
