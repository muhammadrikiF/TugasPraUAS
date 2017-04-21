
package KELOMPOK_1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class pembayaran {
    String no_id;
    String nama;
    String tgl_pinjam;
    String tgl_kembali;
    String id_buku;
    String judul_buku;
    String harga;
    String total_biaya;
    String bayar;
    String sisa_biaya;
    
    tglPinjam tp = new tglPinjam();
    tglKembali tk = new tglKembali();
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    ResultSet rsp = null;
    ResultSet rsk = null;
    ResultSet rsb = null;
    
    public pembayaran(){
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
    
    public void window(){
        try {
            rsp = st.executeQuery("SELECT * FROM tgl_pinjam ");
            
            while (rsp.next()){
                tp.no_id = rsp.getString("no_id");
                tp.nama = rsp.getString("nama");
                tp.date = rsp.getString("date");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "anda belum mengisi data tgl pinjam !");
        }
        try {
            rsk = st.executeQuery("SELECT * FROM tgl_kembali ");
            while(rsk.next()){
                tk.date = rsk.getString("date");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "not connect tgl_kembali !");
        }
    }
    
    public void prosses(){
        String sql = "INSERT INTO pembayaran VALUES "
                + "('"+no_id+"','"+nama+"','"+tgl_pinjam+"','"+tgl_kembali+"','"+
               total_biaya+"','"+bayar+"','"+sisa_biaya+"')";
        try {
            int save = st.executeUpdate(sql);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM sewa_buku";
        try {
            int delete = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
}
