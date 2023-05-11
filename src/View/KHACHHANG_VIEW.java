/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import BUS.KhachHangBUS;
import Model.KHACHHANG;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Quang Long
 */
public class KHACHHANG_VIEW extends javax.swing.JPanel {

    DefaultTableModel tableModel;

    /**
     * Creates new form KHACHHANG1
     */
    public KHACHHANG_VIEW() {
        initComponents();
        tableModel = (DefaultTableModel) jtbKHACHHANG.getModel();
        showKHACHHANG();

        jtfTIMKIEMNANGCAO.setEnabled(false);
    }

    private void showKHACHHANG() {

        KhachHangBUS khBUS = new KhachHangBUS();
        KhachHangBUS.KHACHHANGLIST = khBUS.getAllUsers();
        tableModel.setRowCount(0);

        for (KHACHHANG kh : KhachHangBUS.KHACHHANGLIST) {
            Vector<String> row = new Vector<>();
            row.add(kh.getMaKH());
            row.add(kh.getTenKH());
            row.add(kh.getSDT_KH());
            row.add(kh.getNgaySinh_KH());
            row.add(kh.getDiaChi_KH());

            tableModel.addRow(row);
        }
        jtbKHACHHANG.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnTHEM = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        jtfMAKH = new javax.swing.JTextField();
        jtfTENKH = new javax.swing.JTextField();
        jtfSDT_KH = new javax.swing.JTextField();
        jtfNGAYSINH_KH = new javax.swing.JTextField();
        jtfDIACHI_KH = new javax.swing.JTextField();
        btnXUAT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbKHACHHANG = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jcbTIMKIEM = new javax.swing.JComboBox<>();
        jtfTIMKIEM = new javax.swing.JTextField();
        jtfTIMKIEMNANGCAO = new javax.swing.JTextField();
        btnTIMKIEM = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 145, 188));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1221, 325));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(210, 145, 188));

        jPanel4.setBackground(new java.awt.Color(255, 200, 231));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("THÔNG TIN QUẢN LÝ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("ID Khách hàng:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Tên khách hàng:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Số điện thoại:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Năm sinh:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Địa chỉ:");

        btnTHEM.setBackground(new java.awt.Color(255, 200, 231));
        btnTHEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTHEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plus-sign.png"))); // NOI18N
        btnTHEM.setText("THÊM");
        btnTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHEMActionPerformed(evt);
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

        btnXUAT.setBackground(new java.awt.Color(255, 200, 231));
        btnXUAT.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnXUAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/click.png"))); // NOI18N
        btnXUAT.setText("XUẤT FILE");
        btnXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXUATActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addComponent(jLabel14)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTHEM))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfNGAYSINH_KH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jtfSDT_KH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTENKH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDIACHI_KH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMAKH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnSUA)
                                .addGap(69, 69, 69)
                                .addComponent(btnXOA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRESET)))
                        .addGap(51, 51, 51)
                        .addComponent(btnXUAT))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(jLabel10)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTENKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSDT_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNGAYSINH_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDIACHI_KH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRESET)
                    .addComponent(btnXOA)
                    .addComponent(btnSUA)
                    .addComponent(btnTHEM)
                    .addComponent(btnXUAT))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(254, 200, 216));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/customer-feedback.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 200, 231));

        jtbKHACHHANG.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID KH", "Tên KH", "SĐT", "Năm sinh", "Địa chỉ"
            }
        ));
        jtbKHACHHANG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbKHACHHANGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbKHACHHANG);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/file.png"))); // NOI18N
        jLabel16.setText("THÔNG TIN QUẢN LÝ");

        jcbTIMKIEM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc Định", "Mã KH", "Tên KH", "Ngày Sinh", "Địa chỉ", "Địa Chỉ và Ngày Sinh", "Địa chỉ hoặc Ngày Sinh" }));
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

        btnTIMKIEM.setBackground(new java.awt.Color(255, 200, 231));
        btnTIMKIEM.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTIMKIEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web-search-engine.png"))); // NOI18N
        btnTIMKIEM.setText("Tìm Kiếm");
        btnTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIMKIEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTIMKIEM)
                .addGap(170, 170, 170))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16))
                    .addComponent(btnTIMKIEM)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jtfTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTIMKIEMNANGCAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(685, 685, 685)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTIMKIEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMMouseClicked
        jtfTIMKIEM.setText("");
    }//GEN-LAST:event_jtfTIMKIEMMouseClicked

    private void jtfTIMKIEMNANGCAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfTIMKIEMNANGCAOMouseClicked
        jtfTIMKIEMNANGCAO.setText("");
    }//GEN-LAST:event_jtfTIMKIEMNANGCAOMouseClicked

    private void btnTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIMKIEMActionPerformed
        String ValueOfFind = jtfTIMKIEM.getText();
        String ValueOFFind_NangCao = jtfTIMKIEMNANGCAO.getText();

        List<KHACHHANG> kq = new ArrayList<>();
        KHACHHANG kh = new KHACHHANG();
        KhachHangBUS khBUS = new KhachHangBUS();
        int pos = jcbTIMKIEM.getSelectedIndex();
        switch (pos) {
            case 0:
                jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
                jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
                showKHACHHANG();
                break;
            case 1:

                kh = khBUS.timTheoMa(ValueOfFind);
                if (kh == null) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);

                    Vector<String> row = new Vector<>();
                    row.add(kh.getMaKH());
                    row.add(kh.getTenKH());
                    row.add(kh.getSDT_KH());
                    row.add(kh.getNgaySinh_KH());
                    row.add(kh.getDiaChi_KH());
                    tableModel.addRow(row);

                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            case 2:

                kq = khBUS.timTheoTen(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (KHACHHANG kh_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(kh_kq.getMaKH());
                        row.add(kh_kq.getTenKH());
                        row.add(kh_kq.getSDT_KH());
                        row.add(kh_kq.getNgaySinh_KH());
                        row.add(kh_kq.getDiaChi_KH());
                        tableModel.addRow(row);
                    }
                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            case 3:
                kq = khBUS.timTheoNamSinh(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (KHACHHANG kh_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(kh_kq.getMaKH());
                        row.add(kh_kq.getTenKH());
                        row.add(kh_kq.getSDT_KH());
                        row.add(kh_kq.getNgaySinh_KH());
                        row.add(kh_kq.getDiaChi_KH());
                        tableModel.addRow(row);
                    }
                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            case 4:
                kq = khBUS.timTheoDiaChi(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (KHACHHANG kh_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(kh_kq.getMaKH());
                        row.add(kh_kq.getTenKH());
                        row.add(kh_kq.getSDT_KH());
                        row.add(kh_kq.getNgaySinh_KH());
                        row.add(kh_kq.getDiaChi_KH());
                        tableModel.addRow(row);
                    }
                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            case 5:
                kq = khBUS.timTheoDiaChivaNgaySinh(ValueOfFind, ValueOFFind_NangCao);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (KHACHHANG kh_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(kh_kq.getMaKH());
                        row.add(kh_kq.getTenKH());
                        row.add(kh_kq.getSDT_KH());
                        row.add(kh_kq.getNgaySinh_KH());
                        row.add(kh_kq.getDiaChi_KH());
                        tableModel.addRow(row);
                    }
                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            case 6:
                kq = khBUS.timTheoDiaChihoacNgaySinh(ValueOfFind);
                if (kq.size() == 0) {
                    JOptionPane.showMessageDialog(this, "lỗi");
                } else {
                    tableModel.setRowCount(0);
                    for (KHACHHANG kh_kq : kq) {
                        Vector<String> row = new Vector<>();
                        row.add(kh_kq.getMaKH());
                        row.add(kh_kq.getTenKH());
                        row.add(kh_kq.getSDT_KH());
                        row.add(kh_kq.getNgaySinh_KH());
                        row.add(kh_kq.getDiaChi_KH());
                        tableModel.addRow(row);
                    }
                    jtbKHACHHANG.setModel(tableModel);
                }
                break;

            default:
                return;
        }
    }//GEN-LAST:event_btnTIMKIEMActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        KHACHHANG kh = new KHACHHANG();
        KhachHangBUS khBUS = new KhachHangBUS();
        int ktra = 1;
        kh.setMaKH(jtfMAKH.getText().trim());
        if (jtfMAKH.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Lỗi không được để Mã KH trống", "Lôi", JOptionPane.ERROR_MESSAGE);
        } else {
            for (KHACHHANG makh : KhachHangBUS.KHACHHANGLIST) {
                if (kh.getMaKH().equalsIgnoreCase(makh.getMaKH())) {
                    ktra = 0;
                }
            }
            if (ktra == 1) {

                kh.setTenKH(jtfTENKH.getText());
                kh.setSDT_KH(jtfSDT_KH.getText());
                kh.setNgaySinh_KH(jtfNGAYSINH_KH.getText());
                kh.setDiaChi_KH(jtfDIACHI_KH.getText());

                try {
                    int result = khBUS.insertUser(kh);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(this,
                                "Thêm dữ liệu thành công!", "Thông báo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    showKHACHHANG();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mã KH đã bị trùng lặp do khởi tạo trước đó", "Lôi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        int i = jtbKHACHHANG.getSelectedRow();
        if (i >= 0) {
            KHACHHANG khold = new KHACHHANG();
            KHACHHANG kh = new KHACHHANG();
            KhachHangBUS khBUS = new KhachHangBUS();
            khold = KhachHangBUS.KHACHHANGLIST.set(i, kh);

            kh.setMaKH(jtfMAKH.getText());
            kh.setTenKH(jtfTENKH.getText());
            kh.setNgaySinh_KH(jtfNGAYSINH_KH.getText());
            kh.setSDT_KH(jtfSDT_KH.getText());
            kh.setDiaChi_KH(jtfDIACHI_KH.getText());

            int result = khBUS.updateUser(kh, khold);
            if (result == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cập nhật dữ liệu thành công!", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                showKHACHHANG();

            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        KhachHangBUS khBUS = new KhachHangBUS();
        int selectedIndex = jtbKHACHHANG.getSelectedRow();
        if (selectedIndex >= 0) {
            KHACHHANG std = KhachHangBUS.KHACHHANGLIST.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");

            if (option == 0) {
                khBUS.deleteUser(std.getMaKH());

                showKHACHHANG();
            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        jtfMAKH.setText("");
        jtfTENKH.setText("");
        jtfNGAYSINH_KH.setText("");
        jtfSDT_KH.setText("");
        jtfDIACHI_KH.setText("");
    }//GEN-LAST:event_btnRESETActionPerformed

    private void jcbTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTIMKIEMActionPerformed
        if (jcbTIMKIEM.getSelectedItem().equals("Địa Chỉ và Ngày Sinh")) {
            jtfTIMKIEMNANGCAO.setEnabled(true);
        } else {
            jtfTIMKIEM.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setText("Nhập dữ liệu tìm kiếm");
            jtfTIMKIEMNANGCAO.setEnabled(false);
        }
    }//GEN-LAST:event_jcbTIMKIEMActionPerformed

    private void jtbKHACHHANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbKHACHHANGMouseClicked
        if (evt.getSource() == jtbKHACHHANG) {
            int i = jtbKHACHHANG.getSelectedRow();
            if (i >= 0) {
                KHACHHANG kh = new KHACHHANG();
                kh = KhachHangBUS.KHACHHANGLIST.get(i);
                jtfMAKH.setText(kh.getMaKH());
                jtfTENKH.setText(kh.getTenKH());
                jtfSDT_KH.setText(kh.getSDT_KH());
                jtfNGAYSINH_KH.setText(kh.getNgaySinh_KH());
                jtfDIACHI_KH.setText(kh.getDiaChi_KH());
            }
        }
    }//GEN-LAST:event_jtbKHACHHANGMouseClicked

    private void btnXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXUATActionPerformed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Khách Hàng");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH KHÁCH HÀNG");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ và tên");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Địa chỉ");

            List<KHACHHANG> LIST = KhachHangBUS.KHACHHANGLIST;

            for (int i = 0; i < LIST.size(); i++) {
                KHACHHANG nv = LIST.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(nv.getMaKH());
                row.createCell(2).setCellValue(nv.getTenKH());
                row.createCell(3).setCellValue(nv.getSDT_KH());
                row.createCell(4).setCellValue(nv.getNgaySinh_KH());
                row.createCell(5).setCellValue(nv.getDiaChi_KH());
            }

            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Quang Long\\Dropbox\\PC\\Documents\\NetBeansProjects\\QL_CUA_HANG_QUAN_AO\\src\\Excel\\QUANLI.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXUATActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRESET;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnTIMKIEM;
    private javax.swing.JButton btnXOA;
    public javax.swing.JButton btnXUAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTIMKIEM;
    private javax.swing.JTable jtbKHACHHANG;
    private javax.swing.JTextField jtfDIACHI_KH;
    private javax.swing.JTextField jtfMAKH;
    private javax.swing.JTextField jtfNGAYSINH_KH;
    private javax.swing.JTextField jtfSDT_KH;
    private javax.swing.JTextField jtfTENKH;
    private javax.swing.JTextField jtfTIMKIEM;
    private javax.swing.JTextField jtfTIMKIEMNANGCAO;
    // End of variables declaration//GEN-END:variables
}