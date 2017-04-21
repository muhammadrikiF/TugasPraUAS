
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
public class novel {
    String id_buku;
    String judul_buku;
    String pengarang;
    String penerbit;
    String harga;
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public novel(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/db_perpustakaan",
                    user= "root", pwd ="";
            conn = (Connection) DriverManager.getConnection(url, user, pwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT * FROM novel ORDER BY no_id");
            if(rs.next()){
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_novel");
                pengarang = rs.getString("pengarang");
                penerbit = rs.getString("penerbit");
                harga = rs.getString("harga");
            } else {
                JOptionPane.showMessageDialog(null, "data masih kosong");
            }
        } catch (Exception e) {
            String err = "not connect to Database !";
            JOptionPane.showMessageDialog(null, err);
            System.exit(0);
        }
    }
    
    public void getNext(){
        try {
            if (rs.next()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_novel");
                pengarang = rs.getString("pengarang");
                penerbit = rs.getString("penerbit");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getPrev(){
        try {
            if (rs.previous()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_novel");
                pengarang = rs.getString("pengarang");
                penerbit = rs.getString("penerbit");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getLast(){
        try {
            if (rs.last()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_novel");
                pengarang = rs.getString("pengarang");
                penerbit = rs.getString("penerbit");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getFirst(){
        try {
            if (rs.first()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_novel");
                pengarang = rs.getString("pengarang");
                penerbit = rs.getString("penerbit");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
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
    
    public void add(){
        String sql = "INSERT INTO novel VALUES "
                + "('"+id_buku+"','"+judul_buku+"','"+pengarang+"','"+penerbit+"','"+harga+"')";
        try {
            int save = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void edit(){
        String sql = "UPDATE novel SET judul_novel = '"
                +judul_buku+"',pengarang = '"+pengarang+"',penerbit = '"+penerbit+"',harga = '"+harga+"'"+"WHERE no_id = '"+id_buku+"'";
        try {
            int edit = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM novel WHERE no_id = '"+id_buku+"'";
        try {
            int delete = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void search(){
        String sql = "SELECT * FROM novel WHERE judul_novel = '"+judul_buku+"'";
        try {
            rs = st.executeQuery(sql);
            
            getNext();
            id_buku = rs.getString(1);
            judul_buku = rs.getString(2);
            pengarang = rs.getString(3);
            penerbit = rs.getString(4);
            harga = rs.getString(5);
            
            JOptionPane.showMessageDialog(null,"Load Data '' "+judul_buku+" '' Completed");
            System.out.println();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Failed ! "+"\n"+"( '"+judul_buku+"' tidak ada dalam Database)");
            System.out.println(e.getMessage());
        }
    }
    
    public void sewa(){
        String sql = "INSERT INTO sewa_buku VALUES "
                + "('"+id_buku+"','"+judul_buku+"','"+harga+"')";
        try {
            int sewa = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
}
    
