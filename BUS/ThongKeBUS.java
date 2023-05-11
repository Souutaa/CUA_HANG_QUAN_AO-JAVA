/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HoaDonDAO;
import Model.HOADON;
import Model.TESTPHANTRAM;
import View.THONGKE_VIEW;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Quang Long
 */
public class ThongKeBUS {

    public static List<HOADON> THONGKELIST = new ArrayList<>();

    TESTPHANTRAM ktra = new TESTPHANTRAM();

    public Double getAllThongKeQuy1(int i) {
        Double Quy1 = 0.0;
        ArrayList<HOADON> HD_LIST = new ArrayList<>();
        HoaDonBUS hdBUS = new HoaDonBUS();
        HoaDonBUS.HDLIST.clear();
        
        if (HoaDonBUS.HDLIST.size() == 0) {
            HD_LIST = hdBUS.getAllHD();
        }else{
            HD_LIST = hdBUS.getAllHD();
        }
        
        for (HOADON hd : HD_LIST) {
            int Ngay = ktra.LayNgay(hd.getNgayLapHD());
            int Thang = ktra.LayThang(hd.getNgayLapHD());
            int Nam = Integer.parseInt(ktra.LayNam(hd.getNgayLapHD()));

            if (Nam == Integer.parseInt(THONGKE_VIEW.jcbNAM.getItemAt(i))) {
                if (Thang >= 1 && Thang <= 3) {
                    if (Ngay >= 01 && Ngay <= 31) {
                        Quy1 = Quy1 + hd.getTongTien();
                    }
                }
            } 
        }
        return Quy1;
    }      
    
    public Double getAllThongKeQuy2(int i) {
        Double Quy2 = 0.0;
        ArrayList<HOADON> HD_LIST = new ArrayList<>();
        HoaDonBUS hdBUS = new HoaDonBUS();

        if (HoaDonBUS.HDLIST.size() == 0) {
            HD_LIST = hdBUS.getAllHD();
        }
        for (HOADON hd : HD_LIST) {
            int Ngay = ktra.LayNgay(hd.getNgayLapHD());
            int Thang = ktra.LayThang(hd.getNgayLapHD());
            int Nam = Integer.parseInt(ktra.LayNam(hd.getNgayLapHD()));

            if (Nam == Integer.parseInt(THONGKE_VIEW.jcbNAM.getItemAt(i))) {
                if (Thang >= 4 && Thang <= 6) {
                    if (Ngay >= 01 && Ngay <= 31) {
                        Quy2 = Quy2 + hd.getTongTien();

                    }
                }
            } 
        }
        return Quy2;
    }

    public Double getAllThongKeQuy3(int i) {
        Double Quy3 = 0.0;
        ArrayList<HOADON> HD_LIST = new ArrayList<>();
        HoaDonBUS hdBUS = new HoaDonBUS();

        if (HoaDonBUS.HDLIST.size() == 0) {
            HD_LIST = hdBUS.getAllHD();
        }
        for (HOADON hd : HD_LIST) {
            int Ngay = ktra.LayNgay(hd.getNgayLapHD());
            int Thang = ktra.LayThang(hd.getNgayLapHD());
            int Nam = Integer.parseInt(ktra.LayNam(hd.getNgayLapHD()));

            if (Nam == Integer.parseInt(THONGKE_VIEW.jcbNAM.getItemAt(i))) {
                if (Thang >= 7 && Thang <= 9) {
                    if (Ngay >= 01 && Ngay <= 31) {
                        Quy3 = Quy3 + hd.getTongTien();

                    }
                }
            } 
        }
        return Quy3;
    }

    public Double getAllThongKeQuy4(int i) {
        Double Quy4 = 0.0;
        ArrayList<HOADON> HD_LIST = new ArrayList<>();
        HoaDonBUS hdBUS = new HoaDonBUS();

        if (HoaDonBUS.HDLIST.size() == 0) {
            HD_LIST = hdBUS.getAllHD();
        }
        for (HOADON hd : HD_LIST) {
            int Ngay = ktra.LayNgay(hd.getNgayLapHD());
            int Thang = ktra.LayThang(hd.getNgayLapHD());
            int Nam = Integer.parseInt(ktra.LayNam(hd.getNgayLapHD()));

            if (Nam == Integer.parseInt(THONGKE_VIEW.jcbNAM.getItemAt(i))) {
                if (Thang >= 10 && Thang <= 12) {
                    if (Ngay >= 01 && Ngay <= 31) {
                        Quy4 = Quy4 + hd.getTongTien();

                    }
                }
            } 
        }
        return Quy4;
    }
}
