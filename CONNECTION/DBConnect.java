/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Quang Long
 */
public class DBConnect {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://QUANGLONG\\SQLEXPRESS:1433;databasename=QL_CUAHANG_QUAN_AO;username=sa;password=sa;trustServerCertificate=true");
        } catch (Exception var2) {
            var2.printStackTrace();
        }
        return conn;

    }

    public static void main(String[] args) {
        new DBConnect();
    }

}
