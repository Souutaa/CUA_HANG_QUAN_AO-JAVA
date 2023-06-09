/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BUS.KhachHangBUS;
import BUS.KhuyenMaiBUS;
import BUS.LoaiSanPhamBUS;
import BUS.NhanVienBUS;
import Model.CTCTKM;
import Model.KHACHHANG;
import Model.LOAISP;
import Model.NHANVIEN;
import Model.SANPHAM;
import static View.NHANVIEN_VIEW.jtfMANV;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quang Long
 */
public class CHONKM_VIEW extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    /**
     * Creates new form LOÁIANPHAM
     */
    public CHONKM_VIEW() {
        initComponents();
        setTitle("CHỌN KHUYẾN MÃI");
        tableModel = (DefaultTableModel) jtbCTCTKM.getModel();
        showCTCTKM();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jtfTIMKIEMNANGCAO_CTCTKM.setEnabled(false);
    }

    private void showCTCTKM() {

        KhuyenMaiBUS ctkmBUS = new KhuyenMaiBUS();
        KhuyenMaiBUS.CTCTKMLIST = ctkmBUS.getAllCT_ChuongTrinhKhuyenMai();

        tableModel.setRowCount(0);

        for (CTCTKM ctctkm : KhuyenMaiBUS.CTCTKMLIST) {
            Vector<String> row = new Vector<>();
            row.add(ctctkm.getMaKM());
            row.add(ctctkm.getPhantram_KM());

            tableModel.addRow(row);
        }

        jtbCTCTKM.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCHON = new javax.swing.JButton();
        jcbTIMKIEMCT_CTKM = new javax.swing.JComboBox<>();
        jtfTIMKIEMCT_CTKM = new javax.swing.JTextField();
        jtfTIMKIEMNANGCAO_CTCTKM = new javax.swing.JTextField();
        btnTIMKIEMCT_CTKM = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbCTCTKM = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 145, 188));

        jPanel1.setBackground(new java.awt.Color(210, 145, 188));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(255, 200, 231));

        btnCHON.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnCHON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/choice (1).png"))); // NOI18N
        btnCHON.setText("CHỌN");
        btnCHON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCHONActionPerformed(evt);
            }
        });

        jcbTIMKIEMCT_CTKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "%KM" }));
        jcbTIMKIEMCT_CTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTIMKIEMCT_CTKMActionPerformed(evt);
            }
        });

        jtfTIMKIEMCT_CTKM.setText("Nhập dữ liệu cần tìm");
        jtfTIMKIEMCT_CTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMCT_CTKMMouseClicked(evt);
            }
        });

        jtfTIMKIEMNANGCAO_CTCTKM.setText("Nhập dữ liệu cần tìm");
        jtfTIMKIEMNANGCAO_CTCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMNANGCAO_CTCTKMMouseClicked(evt);
            }
        });

        btnTIMKIEMCT_CTKM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTIMKIEMCT_CTKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web-search-engine.png"))); // NOI18N
        btnTIMKIEMCT_CTKM.setText("TÌM KIẾM");
        btnTIMKIEMCT_CTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIMKIEMCT_CTKMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnCHON, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jcbTIMKIEMCT_CTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfTIMKIEMNANGCAO_CTCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jtfTIMKIEMCT_CTKM))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnTIMKIEMCT_CTKM)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfTIMKIEMCT_CTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbTIMKIEMCT_CTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTIMKIEMNANGCAO_CTCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnTIMKIEMCT_CTKM))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCHON, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 200, 231));

        jtbCTCTKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ KM", "% KM"
            }
        ));
        jtbCTCTKM.setPreferredSize(new java.awt.Dimension(300, 80));
        jtbCTCTKM.setShowGrid(false);
        jtbCTCTKM.setShowHorizontalLines(true);
        jtbCTCTKM.setShowVerticalLines(true);
        jtbCTCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbCTCTKMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbCTCTKM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/workflow.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH KHUYẾN MÃI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCHONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCHONActionPerformed
        int i = jtbCTCTKM.getSelectedRow();
        if (i >= 0) {

            HOADON_VIEW.jtfMAKM.setText(String.valueOf(tableModel.getValueAt(i, 0)));
            HOADON_VIEW.jtfGIAMGIA.setText(String.valueOf(tableModel.getValueAt(i, 1)));
            this.dispose();
        }
    }//GEN-LAST:event_btnCHONActionPerformed

    private void jtbCTCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbCTCTKMMouseClicked
        
    }//GEN-LAST:event_jtbCTCTKMMouseClicked

    private void jcbTIMKIEMCT_CTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTIMKIEMCT_CTKMActionPerformed
        if (jcbTIMKIEMCT_CTKM.getSelectedItem().equals("Mặc Định")) {
            //jtfTIMKIEMNANGCAO.setEnabled(true);
            jtfTIMKIEMCT_CTKM.setText("Nhập dữ liệu tìm kiếm");
        } else {
            jtfTIMKIEMCT_CTKM.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO_CTCTKM.setText("Nhập dữ liệu tìm kiếm");
            //jtfTIMKIEMNANGCAO.setEnabled(false);
        }
    }//GEN-LAST:event_jcbTIMKIEMCT_CTKMActionPerformed

    private void jtfTIMKIEMCT_CTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMCT_CTKMMouseClicked
        jtfTIMKIEMCT_CTKM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMCT_CTKMMouseClicked

    private void jtfTIMKIEMNANGCAO_CTCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAO_CTCTKMMouseClicked
        jtfTIMKIEMNANGCAO_CTCTKM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMNANGCAO_CTCTKMMouseClicked

    private void btnTIMKIEMCT_CTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIMKIEMCT_CTKMActionPerformed
        String ValueOfFind = jtfTIMKIEMCT_CTKM.getText();
        String ValueOFFind_NangCao = jtfTIMKIEMNANGCAO_CTCTKM.getText();

        List<CTCTKM> kq = new ArrayList<>();
        CTCTKM ctctkm = new CTCTKM();
        KhuyenMaiBUS kmBUS = new KhuyenMaiBUS();
        int pos = jcbTIMKIEMCT_CTKM.getSelectedIndex();
        switch (pos) {
            case 0:
            jtfTIMKIEMCT_CTKM.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO_CTCTKM.setText("Nhập dữ liệu tìm kiếm");
            showCTCTKM();
            break;
            case 1:

            kq = kmBUS.timTheoPhanTramCT_CTKM(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModel.setRowCount(0);
                for (CTCTKM ctctkmkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(ctctkmkq.getMaKM());
                    row.add(ctctkmkq.getPhantram_KM());
                    tableModel.addRow(row);
                }
                jtbCTCTKM.setModel(tableModel);
            }
            break;

            /*         case 2:

            kq = kmBUS.timTheoTenKM(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModelCTKM.setRowCount(0);
                for (CTKM ctkmkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(ctkmkq.getMaKM());
                    row.add(ctkmkq.getTenCTKM());
                    row.add(ctkmkq.getNgayBD());
                    row.add(ctkmkq.getNgayKT());
                    tableModelCTKM.addRow(row);
                }
                jtbCTKM.setModel(tableModelCTKM);
            }
            break;

            case 3:
            kq = kmBUS.timTheoNgayBD(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModelCTKM.setRowCount(0);
                for (CTKM ctkmkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(ctkmkq.getMaKM());
                    row.add(ctkmkq.getTenCTKM());
                    row.add(ctkmkq.getNgayBD());
                    row.add(ctkmkq.getNgayKT());
                    tableModelCTKM.addRow(row);
                }
                jtbCTKM.setModel(tableModelCTKM);
            }
            break;

            case 4:
            kq = kmBUS.timTheoNgayKT(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModelCTKM.setRowCount(0);
                for (CTKM ctkmkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(ctkmkq.getMaKM());
                    row.add(ctkmkq.getTenCTKM());
                    row.add(ctkmkq.getNgayBD());
                    row.add(ctkmkq.getNgayKT());
                    tableModelCTKM.addRow(row);
                }
                jtbCTKM.setModel(tableModelCTKM);
            }
            break;*/
            default:
            break;
        }
    }//GEN-LAST:event_btnTIMKIEMCT_CTKMActionPerformed

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
            java.util.logging.Logger.getLogger(CHONKM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHONKM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHONKM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHONKM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHONKM_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCHON;
    private javax.swing.JButton btnTIMKIEMCT_CTKM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbTIMKIEMCT_CTKM;
    private javax.swing.JTable jtbCTCTKM;
    private javax.swing.JTextField jtfTIMKIEMCT_CTKM;
    private javax.swing.JTextField jtfTIMKIEMNANGCAO_CTCTKM;
    // End of variables declaration//GEN-END:variables
}
