package Controller;

import BUS.TaiKhoanBUS;
import DAO.TaiKhoanDAO;
import Model.TaiKhoan;
import View.MainFrame_VIEW;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Dialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Quang Long
 */
public class TaiKhoanController {

    private JFrame jfTaiKhoan;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JTextField jtfMatKhau;
    private JLabel jlbMsg;

    private TaiKhoanBUS taiKhoanService = null;

    public TaiKhoanController(JFrame jfTaiKhoan, JButton btnSubmit, JTextField jtfTenDangNhap, JTextField jtfMatKhau, JLabel jlbMsg) {
        this.jfTaiKhoan = jfTaiKhoan;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;

        taiKhoanService = new TaiKhoanBUS();
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    if (jtfTenDangNhap.getText().length() == 0
                            || jtfMatKhau.getText().length() == 0) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        TaiKhoan taiKhoan = taiKhoanService.login(jtfTenDangNhap.getText(), jtfMatKhau.getText());
                        if (taiKhoan == null) {
                            jlbMsg.setText("Tên đăng nhập và mật khẩu không đúng!");
                        } else {
                            jfTaiKhoan.dispose();
                            MainFrame_VIEW frame = new MainFrame_VIEW();
                            //frame.setVisible(true);
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
            }

            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }
        });
    }
}
