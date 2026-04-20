import java.sql.*;
public class SqlPR {
    public void getAdmin(Connection c, String id) throws Exception {
        Statement s = c.createStatement();
        s.executeQuery("SELECT * FROM admins WHERE id='" + id + "'");
        Runtime.getRuntime().exec("cmd " + id);
    }
}