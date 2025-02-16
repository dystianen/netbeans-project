
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user.dev
 */
public class DataDiri extends javax.swing.JFrame {
    private String nama, nim, jurusan, hobi, info, jenisKelamin, semester;
    /**
     * Creates new form DataDiri
     */
    public DataDiri() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grouprdjeniskelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        rdgender2 = new javax.swing.JRadioButton();
        rdgender1 = new javax.swing.JRadioButton();
        cbhobi3 = new javax.swing.JCheckBox();
        cbhobi1 = new javax.swing.JCheckBox();
        cbhobi2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbjurusan = new javax.swing.JList<>();
        comsemester = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        bersihkan = new javax.swing.JButton();
        tampilkan = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("Nama");

        jLabel3.setText("NIM");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Hobi");

        jLabel6.setText("Jurusan");

        jLabel7.setText("Semester");

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });

        grouprdjeniskelamin.add(rdgender2);
        rdgender2.setText("Perempuan");
        rdgender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgender2ActionPerformed(evt);
            }
        });

        grouprdjeniskelamin.add(rdgender1);
        rdgender1.setText("Laki-laki");
        rdgender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgender1ActionPerformed(evt);
            }
        });
        rdgender1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdgender1KeyPressed(evt);
            }
        });

        cbhobi3.setText("Makan");

        cbhobi1.setText("Coding");

        cbhobi2.setText("Tidur");

        lbjurusan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Teknik Informatika", "Biologi", "Sistem Informatika" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lbjurusan);

        comsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester Ganjil", "Semester Genap" }));
        comsemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comsemesterActionPerformed(evt);
            }
        });

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane2.setViewportView(hasil);

        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });

        tampilkan.setText("Tampilkan");
        tampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanActionPerformed(evt);
            }
        });

        jRadioButton2.setText("jRadioButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnim)
                                    .addComponent(txtnama)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(comsemester, 0, 384, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cbhobi1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbhobi2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rdgender2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rdgender1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(cbhobi3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tampilkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdgender2)
                            .addComponent(rdgender1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbhobi3)
                            .addComponent(cbhobi1)
                            .addComponent(cbhobi2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(bersihkan)
                    .addComponent(tampilkan))
                .addGap(31, 31, 31)
                .addComponent(jRadioButton2)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdgender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdgender1ActionPerformed

    private void comsemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comsemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comsemesterActionPerformed

    private void tampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanActionPerformed
        // TODO add your handling code here:
        nama = txtnama.getText();
        nim = txtnim.getText();
        if (cbhobi1.isSelected()) {
            hobi = "Coding";
        }
        if (cbhobi2.isSelected()) {
            hobi = "Tidur";
        }
        if (cbhobi3.isSelected()) {
            hobi = "Makan";
        }
        
        if (rdgender1.isSelected()) {
            jenisKelamin = "Laki-Laki";
        } else {
            jenisKelamin = "Perempuan";
        }
        
        jurusan = lbjurusan.getSelectedValue();
        semester = comsemester.getSelectedItem().toString();
        
        info="Nama : " + nama + "\n";
        info+="NIM : " + nim + "\n";
        info+="Jenis Kelamin : " + jenisKelamin + "\n";
        info+="Jurusan : " + jurusan + "\n";
        info+="Semester : " + semester + "\n";
        info+="Hobi : " + hobi + "\n";
        hasil.setText(info);
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_tampilkanActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        // TODO add your handling code here:
        txtnama.setText("");
        txtnim.setText("");
        cbhobi1.setSelected(false);
        cbhobi2.setSelected(false);
        cbhobi3.setSelected(false);
        hasil.setText("");
    }//GEN-LAST:event_bersihkanActionPerformed

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void rdgender1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdgender1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdgender1KeyPressed

    private void rdgender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgender2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdgender2ActionPerformed

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
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDiri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihkan;
    private javax.swing.JCheckBox cbhobi1;
    private javax.swing.JCheckBox cbhobi2;
    private javax.swing.JCheckBox cbhobi3;
    private javax.swing.JComboBox<String> comsemester;
    private javax.swing.ButtonGroup grouprdjeniskelamin;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lbjurusan;
    private javax.swing.JRadioButton rdgender1;
    private javax.swing.JRadioButton rdgender2;
    private javax.swing.JButton tampilkan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
