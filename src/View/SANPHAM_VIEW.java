/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import BUS.SanPhamBUS;
import Model.SANPHAM;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quang Long
 */
public class SANPHAM_VIEW extends javax.swing.JPanel {

    DefaultTableModel tableModel;

    /**
     * Creates new form SANPHAM1
     */
    public SANPHAM_VIEW() {
        initComponents();
        tableModel = (DefaultTableModel) jtbSANPHAM.getModel();
        showSanPham();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnQL_LOAISP = new javax.swing.JButton();
        btnFrameCHONLOAISP = new javax.swing.JButton();
        btnTHEM = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        jtfMALOAISP = new javax.swing.JTextField();
        jtfMASP = new javax.swing.JTextField();
        jtfTENSP = new javax.swing.JTextField();
        jtfDONGIA = new javax.swing.JTextField();
        jtfSOLUONG = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbSANPHAM = new javax.swing.JTable();
        btnTIMKIEM = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcbTIMKIEM = new javax.swing.JComboBox<>();
        jtfTIMKIEM = new javax.swing.JTextField();
        jtfTIMKIEMNANGCAO = new javax.swing.JTextField();

        setBackground(new java.awt.Color(210, 145, 188));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        jPanel1.setBackground(new java.awt.Color(210, 145, 188));

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/box.png"))); // NOI18N
        jLabel2.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 200, 231));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("THÔNG TIN QUẢN LÝ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("ID Sản phẩm:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tên sản phẩm:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Đơn giá: ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("ID Loại:");

        btnQL_LOAISP.setBackground(new java.awt.Color(255, 200, 231));
        btnQL_LOAISP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnQL_LOAISP.setText("QUẢN LÝ LOẠI SẢN PHẨM");
        btnQL_LOAISP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQL_LOAISPActionPerformed(evt);
            }
        });

        btnFrameCHONLOAISP.setBackground(new java.awt.Color(255, 200, 231));
        btnFrameCHONLOAISP.setText("...");
        btnFrameCHONLOAISP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameCHONLOAISPActionPerformed(evt);
            }
        });

        btnTHEM.setBackground(new java.awt.Color(255, 200, 231));
        btnTHEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTHEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plus-sign.png"))); // NOI18N
        btnTHEM.setText("THÊM");
        btnTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHEMActionPerformed(evt);
            }
        });

        btnXOA.setBackground(new java.awt.Color(255, 200, 231));
        btnXOA.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnXOA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete-button.png"))); // NOI18N
        btnXOA.setText("XÓA");
        btnXOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXOAActionPerformed(evt);
            }
        });

        btnSUA.setBackground(new java.awt.Color(255, 200, 231));
        btnSUA.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnSUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eraser.png"))); // NOI18N
        btnSUA.setText("SỬA");
        btnSUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUAActionPerformed(evt);
            }
        });

        btnRESET.setBackground(new java.awt.Color(255, 200, 231));
        btnRESET.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.png"))); // NOI18N
        btnRESET.setText("RESET");
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Số lượng: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(jtfMALOAISP, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnTHEM)
                        .addGap(74, 74, 74)
                        .addComponent(btnXOA)
                        .addGap(65, 65, 65)
                        .addComponent(btnSUA)
                        .addGap(63, 63, 63)
                        .addComponent(btnRESET))
                    .addComponent(jLabel3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfMASP, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                            .addComponent(jtfTENSP)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDONGIA)
                            .addComponent(jtfSOLUONG)))
                    .addComponent(btnQL_LOAISP, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(btnFrameCHONLOAISP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMASP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfTENSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfDONGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfSOLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQL_LOAISP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfMALOAISP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrameCHONLOAISP))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSUA)
                    .addComponent(btnXOA)
                    .addComponent(btnTHEM)
                    .addComponent(btnRESET))
                .addGap(25, 25, 25))
        );

        jPanel7.setBackground(new java.awt.Color(255, 200, 231));

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

        btnTIMKIEM.setBackground(new java.awt.Color(255, 200, 231));
        btnTIMKIEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTIMKIEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web-search-engine.png"))); // NOI18N
        btnTIMKIEM.setText("TÌM KIẾM");
        btnTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIMKIEMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/file.png"))); // NOI18N
        jLabel8.setText("THÔNG TIN QUẢN LÝ");

        jcbTIMKIEM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc Định", "Mã SP", "Tên SP", "Đơn Giá" }));
        jcbTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTIMKIEMActionPerformed(evt);
            }
        });

        jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
        jtfTIMKIEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMMouseClicked(evt);
            }
        });
        jtfTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTIMKIEMActionPerformed(evt);
            }
        });

        jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
        jtfTIMKIEMNANGCAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMNANGCAOMouseClicked(evt);
            }
        });
        jtfTIMKIEMNANGCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTIMKIEMNANGCAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTIMKIEM)
                .addGap(195, 195, 195))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTIMKIEM)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        SanPhamBUS spBUS = new SanPhamBUS();
        int selectedIndex = jtbSANPHAM.getSelectedRow();
        if (selectedIndex >= 0) {
            SANPHAM std = SanPhamBUS.SANPHAMLIST.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");

            if (option == 0) {
                spBUS.deleteSP(std.getMaSP());

                showSanPham();
            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void jcbTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTIMKIEMActionPerformed
        if (jcbTIMKIEM.getSelectedItem().equals("Mặc Định")) {
            //jtfTIMKIEMNANGCAO.setEnabled(true);
            jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
        } else {
            jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
            //jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
            //jtfTIMKIEMNANGCAO.setEnabled(false);
        }
    }//GEN-LAST:event_jcbTIMKIEMActionPerformed

    private void jtfTIMKIEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMMouseClicked
        jtfTIMKIEM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMMouseClicked

    private void jtfTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTIMKIEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTIMKIEMActionPerformed

    private void jtfTIMKIEMNANGCAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAOMouseClicked
        jtfTIMKIEMNANGCAO.setText("");
    }//GEN-LAST:event_jtfTIMKIEMNANGCAOMouseClicked

    private void jtfTIMKIEMNANGCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTIMKIEMNANGCAOActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        SANPHAM sp = new SANPHAM();
        sp.setMaSP(jtfMASP.getText());
        sp.setTenSP(jtfTENSP.getText());
        sp.setDonGia(Double.valueOf(jtfDONGIA.getText()));
        sp.setSoLuong(Integer.valueOf(jtfSOLUONG.getText()));
        sp.setMaLoai(jtfMALOAISP.getText());

        SanPhamBUS spBUS = new SanPhamBUS();
        try {
            int result = spBUS.insertSP(sp);
            if (result != 0) {
                JOptionPane.showMessageDialog(this,
                        "Thêm dữ liệu thành công!", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            showSanPham();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        int i = jtbSANPHAM.getSelectedRow();
        if (i >= 0) {
            SANPHAM sp_old = new SANPHAM();
            SANPHAM sp = new SANPHAM();
            SanPhamBUS spBUS = new SanPhamBUS();
            sp_old = SanPhamBUS.SANPHAMLIST.set(i, sp);

            sp.setMaSP(jtfMASP.getText());
            sp.setTenSP(jtfTENSP.getText());
            sp.setDonGia(Double.valueOf(jtfDONGIA.getText()));
            sp.setSoLuong(Integer.valueOf(jtfSOLUONG.getText()));
            sp.setMaLoai(jtfMALOAISP.getText());
            int result = spBUS.updateSP(sp, sp_old);
            if (result == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cập nhật dữ liệu thành công!", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                showSanPham();

            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        jtfMALOAISP.setText("");
        jtfTENSP.setText("");
        jtfDONGIA.setText("");
        jtfSOLUONG.setText("");
        jtfMALOAISP.setText("");
    }//GEN-LAST:event_btnRESETActionPerformed

    private void btnTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIMKIEMActionPerformed
        String ValueOfFind = jtfTIMKIEM.getText();
        // String ValueOFFind_NangCao = jtfTIMKIEMNANGCAO.getText();

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

    private void btnQL_LOAISPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQL_LOAISPActionPerformed
        LOAISANPHAM_VIEW lsp_view = new LOAISANPHAM_VIEW();
        lsp_view.setVisible(true);
    }//GEN-LAST:event_btnQL_LOAISPActionPerformed

    private void btnFrameCHONLOAISPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameCHONLOAISPActionPerformed
        CHONLOAISP_VIEW chonlsp_view = new CHONLOAISP_VIEW();
        chonlsp_view.setVisible(true);
    }//GEN-LAST:event_btnFrameCHONLOAISPActionPerformed

    private void jtbSANPHAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbSANPHAMMouseClicked
        if (evt.getSource() == jtbSANPHAM) {
            int i = jtbSANPHAM.getSelectedRow();

            if (i >= 0) {
                SanPhamBUS spBUS = new SanPhamBUS();
                SANPHAM sp = new SANPHAM();

                sp = SanPhamBUS.SANPHAMLIST.get(i);
                jtfMASP.setText(sp.getMaSP());
                jtfTENSP.setText(sp.getTenSP());
                jtfDONGIA.setText(String.valueOf(sp.getDonGia()));
                jtfSOLUONG.setText(String.valueOf(sp.getSoLuong()));
                jtfMALOAISP.setText(sp.getMaLoai());

            }
        }
    }//GEN-LAST:event_jtbSANPHAMMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFrameCHONLOAISP;
    private javax.swing.JButton btnQL_LOAISP;
    private javax.swing.JButton btnRESET;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnTIMKIEM;
    private javax.swing.JButton btnXOA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbTIMKIEM;
    private javax.swing.JTable jtbSANPHAM;
    private javax.swing.JTextField jtfDONGIA;
    public static javax.swing.JTextField jtfMALOAISP;
    private javax.swing.JTextField jtfMASP;
    private javax.swing.JTextField jtfSOLUONG;
    private javax.swing.JTextField jtfTENSP;
    private javax.swing.JTextField jtfTIMKIEM;
    private javax.swing.JTextField jtfTIMKIEMNANGCAO;
    // End of variables declaration//GEN-END:variables
}
