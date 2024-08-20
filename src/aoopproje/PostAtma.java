
package aoopproje;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class PostAtma extends javax.swing.JFrame {
    private BenimEkran benimEkran;
    private AnaEkran anaEkran;
    
    public PostAtma() {
        initComponents();
    }
    public PostAtma(BenimEkran benimEkran, AnaEkran anaEkran) {
        this.benimEkran = benimEkran;
        this.anaEkran = anaEkran;
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        post_atma_tuşu = new javax.swing.JButton();
        menü_dön = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        yazı = new javax.swing.JMenu();
        times_yap = new javax.swing.JMenuItem();
        comic_yap = new javax.swing.JMenuItem();
        yazı_rengi_değiştirme = new javax.swing.JMenu();
        renk_değiş = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        post_atma_tuşu.setBackground(new java.awt.Color(255, 153, 153));
        post_atma_tuşu.setText("Post At");
        post_atma_tuşu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_atma_tuşuActionPerformed(evt);
            }
        });

        menü_dön.setBackground(new java.awt.Color(255, 153, 153));
        menü_dön.setText("Menüye Dön");
        menü_dön.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menü_dönActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(menü_dön)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(post_atma_tuşu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(post_atma_tuşu)
                    .addComponent(menü_dön))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        yazı.setText("Yazı Tipi");

        times_yap.setText("Times New Roman");
        times_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                times_yapActionPerformed(evt);
            }
        });
        yazı.add(times_yap);

        comic_yap.setText("Comic Sans");
        comic_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comic_yapActionPerformed(evt);
            }
        });
        yazı.add(comic_yap);

        jMenuBar1.add(yazı);

        yazı_rengi_değiştirme.setText("Yazı Rengi");

        renk_değiş.setText("Rengi Değiş");
        renk_değiş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renk_değişActionPerformed(evt);
            }
        });
        yazı_rengi_değiştirme.add(renk_değiş);

        jMenuBar1.add(yazı_rengi_değiştirme);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comic_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comic_yapActionPerformed
        Font font = new Font("Comic Sans",Font.PLAIN,20);
        yazi_alani.setFont(font);
        
    }//GEN-LAST:event_comic_yapActionPerformed

    private void times_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_times_yapActionPerformed
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        yazi_alani.setFont(font);
        
    }//GEN-LAST:event_times_yapActionPerformed

    private void renk_değişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renk_değişActionPerformed
        Color color = JColorChooser.showDialog(this, "Renk seçiniz", Color.RED);
        yazi_alani.setForeground(color);
    }//GEN-LAST:event_renk_değişActionPerformed

    private void post_atma_tuşuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_atma_tuşuActionPerformed
        String userName = benimEkran.getKullanıcıIsmi();
        String postText = yazi_alani.getText().trim();

        if (!userName.isEmpty() && !postText.isEmpty()) {
            String post = userName + ": " + postText;
            anaEkran.addPost(post);
            JOptionPane.showMessageDialog(this, "Post atıldı");
            anaEkran.setVisible(true);
            anaEkran.savePosts();
            yazi_alani.setText(""); // Post alanını temizle
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen kullanıcı adı ve post alanını doldurun", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_post_atma_tuşuActionPerformed

    private void menü_dönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menü_dönActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menü_dönActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PostAtma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostAtma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostAtma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostAtma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BenimEkran benimEkran = new BenimEkran();
                AnaEkran anaEkran = new AnaEkran();
                PostAtma postAtma = new PostAtma(benimEkran, anaEkran);

                anaEkran.setVisible(true);
                
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem comic_yap;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menü_dön;
    private javax.swing.JButton post_atma_tuşu;
    private javax.swing.JMenuItem renk_değiş;
    private javax.swing.JMenuItem times_yap;
    private javax.swing.JTextArea yazi_alani;
    private javax.swing.JMenu yazı;
    private javax.swing.JMenu yazı_rengi_değiştirme;
    // End of variables declaration//GEN-END:variables

}