
package KELOMPOK_1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class tglPinjam {
    String no_id;
    String nama;
    String telp;
    String alamat;
    String jenis_kelamin;
    String date;
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public tglPinjam(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/db_perpustakaan",
                    user= "root", pwd ="";
            conn = (Connection) DriverManager.getConnection(url, user, pwd);
            st = (Statement) conn.createStatement();
            
        } catch (Exception e) {
            String err = "not connect to Database !";
            JOptionPane.showMessageDialog(null, err);
            System.exit(0);
        }
    }
    
    public void prosses(){
        String sql = "INSERT INTO tgl_pinjam VALUES "
                + "('"+no_id+"','"+nama+"','"+telp+"','"+alamat+"','"+
                jenis_kelamin+"','"+date+"')";
        try {
            int save = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"nama '' "+nama+" '' akan di prosses .. ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
}
