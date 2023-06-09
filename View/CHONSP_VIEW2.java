/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BUS.LoaiSanPhamBUS;
import BUS.NhanVienBUS;
import BUS.SanPhamBUS;
import Model.LOAISP;
import Model.NHANVIEN;
import Model.SANPHAM;
import static View.NHANVIEN_VIEW.jtfMANV;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quang Long
 */
public class CHONSP_VIEW2 extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    /**
     * Creates new form LOÁIANPHAM
     */
    public CHONSP_VIEW2() {
        initComponents();
        setTitle("CHỌN SẢN PHẨM");
        tableModel = (DefaultTableModel) jtbSANPHAM.getModel();
        showSanPham();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jtfTIMKIEMNANGCAO.setEnabled(false);
    }

    private void showSanPham() {

        SanPhamBUS spBUS = new SanPhamBUS();
        SanPhamBUS.SANPHAMLIST = spBUS.getAllSanPham();

        tableModel.setRowCount(0);

        for (SANPHAM sp : SanPhamBUS.SANPHAMLIST) {
            Vector<String> row = new Vector<>();
            row.add(sp.getMaSP());
            row.add(sp.getTenSP());
            row.add(String.valueOf(sp.getDonGia()));
            row.add(String.valueOf(sp.getSoLuong()));
            row.add(sp.getMaLoai());
            tableModel.addRow(row);
        }

        jtbSANPHAM.setModel(tableModel);
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
        btnTIMKIEM = new javax.swing.JButton();
        jtfTIMKIEM = new javax.swing.JTextField();
        jtfTIMKIEMNANGCAO = new javax.swing.JTextField();
        jcbTIMKIEM = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbSANPHAM = new javax.swing.JTable();
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

        btnTIMKIEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTIMKIEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web-search-engine.png"))); // NOI18N
        btnTIMKIEM.setText("TÌM KIẾM");
        btnTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIMKIEMActionPerformed(evt);
            }
        });

        jtfTIMKIEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMMouseClicked(evt);
            }
        });

        jtfTIMKIEMNANGCAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMNANGCAOMouseClicked(evt);
            }
        });

        jcbTIMKIEM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc Định", "Mã NV", "Tên NV", "Ngày Sinh", "Địa chỉ", "Địa Chỉ và Ngày Sinh", "Địa chỉ hoặc Ngày Sinh" }));
        jcbTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTIMKIEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnCHON, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTIMKIEM)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCHON, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTIMKIEM))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 200, 231));

        jtbSANPHAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID SP", "Tên SP", "Đơn Giá", "Số Lượng", "ID Loại"
            }
        ));
        jtbSANPHAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbSANPHAMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbSANPHAM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/workflow.png"))); // NOI18N
        jLabel1.setText("DANH SÁCH SẢN PHẨM");

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
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCHONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCHONActionPerformed
         int i = jtbSANPHAM.getSelectedRow();
        if (i >= 0) {
            HOADON_VIEW.jtfMASP.setText(String.valueOf(tableModel.getValueAt(i, 0)));            
            HOADON_VIEW.jtfTENSP.setText(String.valueOf(tableModel.getValueAt(i, 1)));            
            HOADON_VIEW.jtfDONGIA.setText(String.valueOf(tableModel.getValueAt(i, 2)));                       
            this.dispose();
        }
    }//GEN-LAST:event_btnCHONActionPerformed

    private void jtfTIMKIEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMMouseClicked
        jtfTIMKIEM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMMouseClicked

    private void jtfTIMKIEMNANGCAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAOMouseClicked
        jtfTIMKIEMNANGCAO.setText("");
    }//GEN-LAST:event_jtfTIMKIEMNANGCAOMouseClicked

    private void btnTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIMKIEMActionPerformed
        String ValueOfFind = jtfTIMKIEM.getText();
        String ValueOFFind_NangCao = jtfTIMKIEMNANGCAO.getText();

        List<SANPHAM> kq = new ArrayList<>();
        SANPHAM sp = new SANPHAM();
        SanPhamBUS spBUS = new SanPhamBUS();
        int pos = jcbTIMKIEM.getSelectedIndex();
        switch (pos) {
            case 0:
                jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
                //jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
                showSanPham();
                break;
            case 1:

                sp = spBUS.timTheoMa(ValueOfFind);
                if (sp == null) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);

                    Vector<String> row = new Vector<>();
                    row.add(sp.getMaSP());
                    row.add(sp.getTenSP());
                    row.add(String.valueOf(sp.getDonGia()));
                    row.add(String.valueOf(sp.getSoLuong()));
                    row.add(sp.getMaLoai());
                    tableModel.addRow(row);

                    jtbSANPHAM.setModel(tableModel);
                }
                break;

            case 2:

                kq = spBUS.timTheoTen(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (SANPHAM SANPHAMkq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(SANPHAMkq.getMaSP());
                        row.add(SANPHAMkq.getTenSP());
                        row.add(String.valueOf(SANPHAMkq.getDonGia()));
                        row.add(String.valueOf(SANPHAMkq.getSoLuong()));
                        row.add(SANPHAMkq.getMaLoai());
                        tableModel.addRow(row);
                    }
                    jtbSANPHAM.setModel(tableModel);
                }
                break;

            case 3:
                kq = spBUS.timTheoDonGia(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (SANPHAM SANPHAMkq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(SANPHAMkq.getMaSP());
                        row.add(SANPHAMkq.getTenSP());
                        row.add(String.valueOf(SANPHAMkq.getDonGia()));
                        row.add(String.valueOf(SANPHAMkq.getSoLuong()));
                        row.add(SANPHAMkq.getMaLoai());
                        tableModel.addRow(row);
                    }
                    jtbSANPHAM.setModel(tableModel);
                }
                break;

            /*case 4:
            sp = spBUS.timTheoMaloai(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModel.setRowCount(0);
                
                Vector<String> row = new Vector<>();
                row.add(sp.getMaSP());
                row.add(sp.getTenSP());
                row.add(String.valueOf(sp.getDonGia()));
                row.add(String.valueOf(sp.getSoLuong()));
                row.add(sp.getMaLoai());
                tableModel.addRow(row);

                jtbSANPHAM.setModel(tableModel);
            }
            break;

            case 5:
            kq = nvBUS.timTheoDiaChivaNgaySinh(ValueOfFind,ValueOFFind_NangCao);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModel.setRowCount(0);
                for (NHANVIEN nhanvienkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(nhanvienkq.getMaNV());
                    row.add(nhanvienkq.getTenNV());
                    row.add(nhanvienkq.getSDT_NV());
                    row.add(nhanvienkq.getNgaySinh_NV());
                    row.add(nhanvienkq.getDiaChi_NV());
                    tableModel.addRow(row);
                }
                jtbNHANVIEN.setModel(tableModel);
            }
            break;

            case 6:
            kq = nvBUS.timTheoDiaChihoacNgaySinh(ValueOfFind);
            if (kq.size() == 0) {
                JOptionPane.showMessageDialog(this, "lỗi");
            } else {
                tableModel.setRowCount(0);
                for (NHANVIEN nhanvienkq : kq) {
                    Vector<String> row = new Vector<>();
                    row.add(nhanvienkq.getMaNV());
                    row.add(nhanvienkq.getTenNV());
                    row.add(nhanvienkq.getSDT_NV());
                    row.add(nhanvienkq.getNgaySinh_NV());
                    row.add(nhanvienkq.getDiaChi_NV());
                    tableModel.addRow(row);
                }
                jtbNHANVIEN.setModel(tableModel);
            }
            break;
             */
            default:
                return;
        }
    }//GEN-LAST:event_btnTIMKIEMActionPerformed

    private void jtbSANPHAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSANPHAMMouseClicked

    }//GEN-LAST:event_jtbSANPHAMMouseClicked

    private void jcbTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTIMKIEMActionPerformed
        if (jcbTIMKIEM.getSelectedItem().equals("Mặc Định")) {
            jtfTIMKIEMNANGCAO.setEnabled(true);
        } else {
            jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setEnabled(false);
        }
    }//GEN-LAST:event_jcbTIMKIEMActionPerformed

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
            java.util.logging.Logger.getLogger(CHONSP_VIEW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHONSP_VIEW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHONSP_VIEW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHONSP_VIEW2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CHONSP_VIEW2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCHON;
    private javax.swing.JButton btnTIMKIEM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbTIMKIEM;
    private javax.swing.JTable jtbSANPHAM;
    private javax.swing.JTextField jtfTIMKIEM;
    private javax.swing.JTextField jtfTIMKIEMNANGCAO;
    // End of variables declaration//GEN-END:variables
}
