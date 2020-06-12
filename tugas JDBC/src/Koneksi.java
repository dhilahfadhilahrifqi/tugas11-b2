import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    static Connection koneksi = null;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
               String url = "jdbc:mysql://127.0.0.1:3307/mahasiswa";
                String user = "root";
                String password = "fadrif00";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Terkoneksi");
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}