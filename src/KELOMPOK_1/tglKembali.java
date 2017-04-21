
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
public class tglKembali {
    String no_id_tk;
    String nama_tk;
    String no_id;
    String nama;
    String id_buku;
    String judul_buku;
    String date;
    
    Connection conn = null;
    Statement st = null;
    ResultSet rsp = null;
    ResultSet rsk = null;
    tglPinjam tp = new tglPinjam();
    
    public tglKembali(){
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
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/db_perpustakaan","root","");
            st = (Statement) conn.createStatement();
            
        } catch (Exception e) {
            String err = "connect failed !";
            JOptionPane.showMessageDialog(null, err);
            System.exit(0);
        }
    }
    
    public void window(){
        try {
            rsp = st.executeQuery("SELECT * FROM tgl_pinjam ");
            while(rsp.next()){
                tp.no_id = rsp.getString("no_id");
                tp.nama = rsp.getString("nama");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "anda belum mengisi data tgl pinjam !");
        }
    }
    
    public void prosses(){
        String sql = "INSERT INTO tgl_kembali VALUES "
                + "('"+no_id_tk+"','"+nama_tk+"','"+id_buku+"','"+judul_buku+"','"+
                date+"')";
        try {
            rsk = st.executeQuery("SELECT * FROM tgl_kembali ");
            if(rsk.next()){
                no_id_tk = rsk.getString("no_id");
                nama_tk = rsk.getString("nama");
                id_buku = rsk.getString("id_buku");
                judul_buku = rsk.getString("judul_buku");
                date = rsk.getString("date");
                JOptionPane.showMessageDialog(null,"DATA anda telah di prosses .. ");
            } else {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
        
        try {
            int save = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FAILED saved !");
        }
    }
    
    
}
