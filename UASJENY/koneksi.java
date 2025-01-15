package UASJENY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/penjualan?useSSL=false&serverTimezone=UTC";
                String user = "root";
                String password = "";
                
                // Tidak perlu manual register driver
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]) {
        getKoneksi();
    }  
}
