
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
public class module {
    String id_buku;
    String judul_buku;
    String dosen_MK;
    String module;
    String harga;
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public module(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/db_perpustakaan",
                    user= "root", pwd ="";
            conn = (Connection) DriverManager.getConnection(url, user, pwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT * FROM module ORDER BY no_id");
            if(rs.next()){
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_buku");
                dosen_MK = rs.getString("dosen_MK");
                module = rs.getString("module");
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
                judul_buku = rs.getString("judul_buku");
                dosen_MK = rs.getString("dosen_MK");
                module = rs.getString("module");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getPrev(){
        try {
            if (rs.previous()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_buku");
                dosen_MK = rs.getString("dosen_MK");
                module = rs.getString("module");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getLast(){
        try {
            if (rs.last()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_buku");
                dosen_MK = rs.getString("dosen_MK");
                module = rs.getString("module");
                harga = rs.getString("harga");
            }
        } catch (Exception e) {
        }
    }

    public void getFirst(){
        try {
            if (rs.first()) {
                id_buku = rs.getString("no_id");
                judul_buku = rs.getString("judul_buku");
                dosen_MK = rs.getString("dosen_MK");
                module = rs.getString("module");
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
        String sql = "INSERT INTO module VALUES "
                + "('"+id_buku+"','"+judul_buku+"','"+dosen_MK+"','"+module+"','"+harga+"')";
        try {
            int save = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void edit(){
        String sql = "UPDATE module SET judul_buku = '"
                +judul_buku+"',dosen_MK = '"+dosen_MK+"',module = '"+module+"',harga = '"+harga+"'"+"WHERE no_id = '"+id_buku+"'";
        try {
            int edit = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM module WHERE no_id = '"+id_buku+"'";
        try {
            int delete = st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed - not connected !");
            System.out.println(e.getMessage());
        }
    }
    
    public void search(){
        String sql = "SELECT * FROM module WHERE judul_buku = '"+judul_buku+"'";
        try {
            rs = st.executeQuery(sql);
            
            getNext();
            id_buku = rs.getString(1);
            judul_buku = rs.getString(2);
            dosen_MK = rs.getString(3);
            module = rs.getString(4);
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
