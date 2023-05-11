/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BUS.LoaiSanPhamBUS;
import BUS.NhanVienBUS;
import Model.LOAISP;
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
public class LOAISANPHAM_VIEW extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    /**
     * Creates new form LOÁIANPHAM
     */
    public LOAISANPHAM_VIEW() {
        initComponents();
        setTitle("LOẠI SẢN PHẨM");
        tableModel = (DefaultTableModel) jtbLOAISP.getModel();
        showLOAISP();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jtfTIMKIEMNANGCAO.setEnabled(false);
    }

    private void showLOAISP() {

        LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
        LoaiSanPhamBUS.LOAISPLIST = lspBUS.getAllLoaiSP();

        tableModel.setRowCount(0);

        for (LOAISP lsp : LoaiSanPhamBUS.LOAISPLIST) {
            Vector<String> row = new Vector<>();
            row.add(lsp.getMaLoai());
            row.add(lsp.getTenLoai());
            row.add(lsp.getSize());
            row.add(lsp.getMauSac());
            tableModel.addRow(row);
        }

        jtbLOAISP.setModel(tableModel);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTHEM = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        jtfMALOAISP = new javax.swing.JTextField();
        jtfTENLOAISP = new javax.swing.JTextField();
        jtfSIZE = new javax.swing.JTextField();
        jtfMAU = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLOAISP = new javax.swing.JTable();
        btnTIMKIEM = new javax.swing.JButton();
        jcbTIMKIEM = new javax.swing.JComboBox<>();
        jtfTIMKIEM = new javax.swing.JTextField();
        jtfTIMKIEMNANGCAO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(210, 145, 188));

        jPanel1.setBackground(new java.awt.Color(210, 145, 188));

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/hierarchy.png"))); // NOI18N
        jLabel1.setText("LOẠI SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 200, 231));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID Loại:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Tên loại:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Size:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Color:");

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

        btnRESET.setBackground(new java.awt.Color(255, 200, 231));
        btnRESET.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.png"))); // NOI18N
        btnRESET.setText("RESET");
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
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

        jtfSIZE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSIZEActionPerformed(evt);
            }
        });

        jtfMAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMAUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfMAU, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                    .addComponent(jtfSIZE)
                                    .addComponent(jtfTENLOAISP)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfMALOAISP))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnTHEM)
                        .addGap(29, 29, 29)
                        .addComponent(btnXOA)
                        .addGap(30, 30, 30)
                        .addComponent(btnSUA)
                        .addGap(27, 27, 27)
                        .addComponent(btnRESET)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMALOAISP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfTENLOAISP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfSIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfMAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRESET)
                    .addComponent(btnSUA)
                    .addComponent(btnXOA)
                    .addComponent(btnTHEM))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 200, 231));

        jtbLOAISP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Loại", "Tên loại", "Size", "Color"
            }
        ));
        jtbLOAISP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbLOAISPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbLOAISP);

        btnTIMKIEM.setBackground(new java.awt.Color(255, 200, 231));
        btnTIMKIEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTIMKIEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web-search-engine.png"))); // NOI18N
        btnTIMKIEM.setText("TÌM KIẾM");
        btnTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIMKIEMActionPerformed(evt);
            }
        });

        jcbTIMKIEM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc Định", "Mã Loại", "Tên Loại", "Size", "Màu Sắc", "Size và Màu Sắc", "Size hoặc Màu Sắc" }));
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

        jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
        jtfTIMKIEMNANGCAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfTIMKIEMNANGCAOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(btnTIMKIEM)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTIMKIEM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSIZEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSIZEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSIZEActionPerformed

    private void jtfMAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMAUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMAUActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        LOAISP lsp = new LOAISP();
        SANPHAM sp = new SANPHAM();
        lsp.setMaLoai(jtfMALOAISP.getText());
        lsp.setTenLoai(jtfTENLOAISP.getText());
        sp.setMaLoai(jtfMALOAISP.getText());
        lsp.setSize(jtfSIZE.getText());
        lsp.setMauSac(jtfMAU.getText());

        LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
        try {
            int result = lspBUS.insertLoaiSP(lsp);
            if (result != 0) {
                JOptionPane.showMessageDialog(this,
                        "Thêm dữ liệu thành công!", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            showLOAISP();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
        int selectedIndex = jtbLOAISP.getSelectedRow();
        if (selectedIndex >= 0) {
            LOAISP std = LoaiSanPhamBUS.LOAISPLIST.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");

            if (option == 0) {
                lspBUS.deleteLoaiSP(std.getMaLoai());

                showLOAISP();
            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        int i = jtbLOAISP.getSelectedRow();
        if (i >= 0) {
            LOAISP lsp_old = new LOAISP();
            LOAISP lsp = new LOAISP();
            LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
            lsp_old = LoaiSanPhamBUS.LOAISPLIST.set(i, lsp);

            lsp.setMaLoai(jtfMALOAISP.getText());
            lsp.setTenLoai(jtfTENLOAISP.getText());
            lsp.setSize(jtfSIZE.getText());
            lsp.setMauSac(jtfMAU.getText());

            int result = lspBUS.updateUser(lsp, lsp_old);
            if (result == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cập nhật dữ liệu thành công!", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                showLOAISP();

            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        jtfMALOAISP.setText("");
        jtfTENLOAISP.setText("");
        jtfSIZE.setText("");
        jtfMAU.setText("");
    }//GEN-LAST:event_btnRESETActionPerformed

    private void jtfTIMKIEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMMouseClicked
        jtfTIMKIEM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMMouseClicked

    private void jtfTIMKIEMNANGCAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAOMouseClicked
        jtfTIMKIEMNANGCAO.setText("");
    }//GEN-LAST:event_jtfTIMKIEMNANGCAOMouseClicked

    private void btnTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIMKIEMActionPerformed
        String ValueOfFind = jtfTIMKIEM.getText();
        String ValueOFFind_NangCao = jtfTIMKIEMNANGCAO.getText();

        List<LOAISP> kq = new ArrayList<>();
        LOAISP lsp = new LOAISP();
        LoaiSanPhamBUS lspBUS = new LoaiSanPhamBUS();
        int pos = jcbTIMKIEM.getSelectedIndex();
        switch (pos) {
            case 0:
                jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
                jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
                showLOAISP();
                break;
            case 1:

                lsp = lspBUS.timTheoMa(ValueOfFind);
                if (lsp == null) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);

                    Vector<String> row = new Vector<>();
                    row.add(lsp.getMaLoai());
                    row.add(lsp.getTenLoai());
                    row.add(lsp.getSize());
                    row.add(lsp.getMauSac());
                    tableModel.addRow(row);

                    jtbLOAISP.setModel(tableModel);
                }
                break;

            case 2:

                kq = lspBUS.timTheoTen(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (LOAISP lsp_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(lsp_kq.getMaLoai());
                        row.add(lsp_kq.getTenLoai());
                        row.add(lsp_kq.getSize());
                        row.add(lsp_kq.getMauSac());
                        tableModel.addRow(row);
                    }
                    jtbLOAISP.setModel(tableModel);
                }
                break;

            case 3:
                kq = lspBUS.timTheoSize(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (LOAISP lsp_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(lsp_kq.getMaLoai());
                        row.add(lsp_kq.getTenLoai());
                        row.add(lsp_kq.getSize());
                        row.add(lsp_kq.getMauSac());
                        tableModel.addRow(row);
                    }
                    jtbLOAISP.setModel(tableModel);
                }
                break;

            case 4:
                kq = lspBUS.timTheoMauSac(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (LOAISP lsp_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(lsp_kq.getMaLoai());
                        row.add(lsp_kq.getTenLoai());
                        row.add(lsp_kq.getSize());
                        row.add(lsp_kq.getMauSac());
                        tableModel.addRow(row);
                    }
                    jtbLOAISP.setModel(tableModel);
                }
                break;

            case 5:
                kq = lspBUS.timTheoSizevaMauSac(ValueOfFind, ValueOFFind_NangCao);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (LOAISP lsp_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(lsp_kq.getMaLoai());
                        row.add(lsp_kq.getTenLoai());
                        row.add(lsp_kq.getSize());
                        row.add(lsp_kq.getMauSac());
                        tableModel.addRow(row);
                    }
                    jtbLOAISP.setModel(tableModel);
                }
                break;

            case 6:
                kq = lspBUS.timTheoSizehoacMausac(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (LOAISP lsp_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(lsp_kq.getMaLoai());
                        row.add(lsp_kq.getTenLoai());
                        row.add(lsp_kq.getSize());
                        row.add(lsp_kq.getMauSac());
                        tableModel.addRow(row);
                    }
                    jtbLOAISP.setModel(tableModel);
                }
                break;

            default:
                return;
        }
    }//GEN-LAST:event_btnTIMKIEMActionPerformed

    private void jcbTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTIMKIEMActionPerformed
        if (jcbTIMKIEM.getSelectedItem().equals("Size và Màu Sắc")) {
            jtfTIMKIEMNANGCAO.setEnabled(true);
        } else {
            jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setEnabled(false);
        }
    }//GEN-LAST:event_jcbTIMKIEMActionPerformed

    private void jtbLOAISPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbLOAISPMouseClicked
        if (evt.getSource() == jtbLOAISP) {
            int i = jtbLOAISP.getSelectedRow();
            if (i >= 0) {
                LOAISP lsp = new LOAISP();
                lsp = LoaiSanPhamBUS.LOAISPLIST.get(i);
                jtfMALOAISP.setText(lsp.getMaLoai());
                jtfTENLOAISP.setText(lsp.getTenLoai());
                jtfSIZE.setText(lsp.getSize());
                jtfMAU.setText(lsp.getMauSac());
            }
        }
    }//GEN-LAST:event_jtbLOAISPMouseClicked

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
            java.util.logging.Logger.getLogger(LOAISANPHAM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOAISANPHAM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOAISANPHAM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOAISANPHAM_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new LOAISANPHAM_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRESET;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnTIMKIEM;
    private javax.swing.JButton btnXOA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTIMKIEM;
    private javax.swing.JTable jtbLOAISP;
    private javax.swing.JTextField jtfMALOAISP;
    private javax.swing.JTextField jtfMAU;
    private javax.swing.JTextField jtfSIZE;
    private javax.swing.JTextField jtfTENLOAISP;
    private javax.swing.JTextField jtfTIMKIEM;
    private javax.swing.JTextField jtfTIMKIEMNANGCAO;
    // End of variables declaration//GEN-END:variables
}
