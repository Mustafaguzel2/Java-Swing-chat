
package aoopproje;

public class Menu extends javax.swing.JFrame {
    public User giris_yapan_user;

    public User getGiris_yapan_user() {
        return giris_yapan_user;
    }

    public void setGiris_yapan_user(User giris_yapan_user) {
        this.giris_yapan_user = giris_yapan_user;
    }
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        benim_duvarım = new javax.swing.JButton();
        ana_ekran = new javax.swing.JButton();
        gruplar = new javax.swing.JButton();
        arama_ekranı = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        benim_duvarım.setText("Benim Duvarım");
        benim_duvarım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benim_duvarımActionPerformed(evt);
            }
        });

        ana_ekran.setText("Ana Ekran");
        ana_ekran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ana_ekranActionPerformed(evt);
            }
        });

        gruplar.setText("Gruplar");
        gruplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruplarActionPerformed(evt);
            }
        });

        arama_ekranı.setText("Arama Ekranı");
        arama_ekranı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_ekranıActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama_ekranı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gruplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ana_ekran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(benim_duvarım, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(benim_duvarım)
                .addGap(12, 12, 12)
                .addComponent(ana_ekran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gruplar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arama_ekranı)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ana_ekranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ana_ekranActionPerformed
        AnaEkran ae = new AnaEkran();
        ae.setVisible(true);
        dispose();
    }//GEN-LAST:event_ana_ekranActionPerformed

    private void arama_ekranıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_ekranıActionPerformed
        AramaEkrani aramaEkranı =new AramaEkrani();
        aramaEkranı.setVisible(true);
        dispose();
    }//GEN-LAST:event_arama_ekranıActionPerformed

    private void gruplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruplarActionPerformed
        Gruplar grup = new Gruplar();
        grup.setVisible(true);
        dispose();
    }//GEN-LAST:event_gruplarActionPerformed

    private void benim_duvarımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benim_duvarımActionPerformed
        BenimEkran benimEkran = new BenimEkran();
        Singleton singleton2 = Singleton.getInstance();
        benimEkran.kullanıcı_ismi.setText(singleton2.getGiris_yapan_kullanici().getKullanici_adi());
        benimEkran.setVisible(true);
        dispose();
    }//GEN-LAST:event_benim_duvarımActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ana_ekran;
    private javax.swing.JButton arama_ekranı;
    private javax.swing.JButton benim_duvarım;
    private javax.swing.JButton gruplar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
