package aoopproje;


import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class AramaEkrani extends javax.swing.JFrame {

public AramaEkrani() {
    
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aramacubugu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        menü_dön = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        aramacubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramacubuguActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        menü_dön.setBackground(new java.awt.Color(102, 153, 255));
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
                .addGap(12, 12, 12)
                .addComponent(menü_dön)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aramacubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramacubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menü_dön, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aramacubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramacubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramacubuguActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String arama = this.aramacubugu.getText();
        ArrayList<User> userList = KayitGiris.getUser_list();
        List<User> foundUsers = searchUsersByKeyword(userList, arama);
        
         // JList ve DefaultListModel oluşturuyoruz
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> sonuclist = new JList<>(listModel);

        // Bulunan kullanıcıları liste modeline ekliyoruz
        for (User user : foundUsers) {
            listModel.addElement(user.getKullanici_adi());
        }

        // JTable ve DefaultTableModel oluşturuyoruz
        String[] columnNames = {"Kullanıcı Adı"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);

        // JList'teki öğeleri JTable'a ekliyoruz
        for (int i = 0; i < listModel.size(); i++) {
            String username = listModel.get(i);
            tableModel.addRow(new Object[]{username});
        }
        JFrame frame = new JFrame("Arama Sonuçları");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        
        
        // JScrollPane ile JList ve JTable'ı ekle
        JScrollPane listScrollPane = new JScrollPane(sonuclist);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Paneller oluştur
        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.setBorder(BorderFactory.createTitledBorder("Sonuç Listesi"));
        listPanel.add(listScrollPane, BorderLayout.CENTER);

        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createTitledBorder("Sonuç Detayları"));
        tablePanel.add(tableScrollPane, BorderLayout.CENTER);

        // JSplitPane kullanarak bölme ekle
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listPanel, tablePanel);
        splitPane.setDividerLocation(200);

        // Frame'e bölme ekle
        frame.add(splitPane, BorderLayout.CENTER);

        // Arayüzü daha modern hale getirmek için Nimbus görünümünü kullan
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // JFrame'i görünür yap
        frame.setVisible(true);
    table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                if (row != -1) {
                    String selectedUser = (String) table.getValueAt(row, 0);
                    navigateToUserProfile(selectedUser, frame);
                    dispose();
                }
                
            }
            
        });
                            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menü_dönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menü_dönActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menü_dönActionPerformed

    public void navigateToUserProfile(String kullaniciAdi, JFrame frame) {
        // Retrieve the user from the list by username
        ArrayList<User> userList = KayitGiris.getUser_list();
        User selectedUser = null;
        for (User user : userList) {
            if (user.getKullanici_adi().equals(kullaniciAdi)) {
                selectedUser = user;
                break;
            }
        }
        if (selectedUser != null) {
            // Assuming you have a method to display the user's profile
            DiğerKullaniciEkranlari de = new  DiğerKullaniciEkranlari();
            de.setDiğerkullanici(selectedUser);
            de.displayUserProfile();
            frame.dispose();
        }
    }
    public List<User> searchUsersByKeyword(ArrayList<User> userList, String keyword) {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user.getKullanici_adi().contains(keyword)) {
                resultList.add(user);
            }
            
        }
        return resultList;
    }
    
    
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
            java.util.logging.Logger.getLogger(AramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AramaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aramacubugu;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menü_dön;
    // End of variables declaration//GEN-END:variables
}
