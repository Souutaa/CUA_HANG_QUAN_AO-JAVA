package Controller;

import Bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import View.HOADON_VIEW;
import View.KHACHHANG_VIEW;
import View.KHUYENMAI_VIEW;
import View.NHACUNGCAP_VIEW;
import View.NHANVIEN_VIEW;
import View.PHIEUNHAPHANG_VIEW;
import View.SANPHAM_VIEW;
import View.THONGKE_VIEW;

/**
 *
 * @author Quang Long
 */
public class ChuyenManHinhController {

    private final JPanel jpnRoot;
    private String kindSelected = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    private void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "NHÂN VIÊN";
        jpnItem.setBackground(new Color(210,145,188));
        jlbItem.setBackground(new Color(210,145,188));

        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(jpnRoot);
        jpnRoot.validate();
        jpnRoot.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel jbnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jbnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jbnItem = jbnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "NHÂN VIÊN":
                    node = new NHANVIEN_VIEW();
                    break;
                case "KHÁCH HÀNG":
                    node = new KHACHHANG_VIEW();
                    break;
                case "SẢN PHẨM":
                    node = new SANPHAM_VIEW();
                    break;
                case "HÓA ĐƠN":
                    node = new HOADON_VIEW();
                    break;
                case "NHẬP HÀNG":
                    node = new PHIEUNHAPHANG_VIEW();
                    break;
                case "NHÀ CUNG CẤP":
                    node = new NHACUNGCAP_VIEW();
                    break;
                case "KHUYẾN MÃI":
                    node = new KHUYENMAI_VIEW();
                    break;
                case "THỐNG KÊ":
                    node = new THONGKE_VIEW();
                    break;
                default:
                    break;
            }
            jpnRoot.removeAll();
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(node);
            jpnRoot.validate();
            jpnRoot.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jbnItem.setBackground(new Color(210,145,188));
            jlbItem.setBackground(new Color(210,145,188));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jbnItem.setBackground(new Color(210,145,188));
            jlbItem.setBackground(new Color(210,145,188));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jbnItem.setBackground(new Color(255,200,231));
                jlbItem.setBackground(new Color(255,200,231));
            }
        }
    }

    private void setChangeBackground(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(210,145,188));
                item.getJlb().setBackground(new Color(210,145,188));
            } else {
                item.getJpn().setBackground(new Color(255,200,231));
                item.getJlb().setBackground(new Color(255,200,231));
            }
        }
    }
}
