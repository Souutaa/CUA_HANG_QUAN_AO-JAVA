package CONNECTION;

import java.sql.*;
// This example is running with MySql.

public class MyTest {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://QUANGLONG\\SQLEXPRESS:1433;databaseName=QL_CUAHANG_QUAN_AO;trustServerCertificate=true";
        String query = "select * from NHANVIEN";
        Connection myCon = null;
        Statement stmt = null;
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Class Load Error");
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Trying to connect...");
            myCon = DriverManager.getConnection(url, "sa", "sa");
            stmt = myCon.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String col1 = rs.getString(1);
                String col2 = rs.getString(2);
                String col3 = rs.getString(3);
                String col4 = rs.getString(4);
                String col5 = rs.getString(5);
                System.out.println(" " + col1 + " : " + col2 + " : " + col3 + " : " + col4 + " : " + col5);
            }
            rs.close();
            stmt.close();
            myCon.close();
        } catch (SQLException e) {
            System.out.println("MY" + url + " : ");
            System.err.println(e.getMessage() + e.toString());
        }
    }
}
