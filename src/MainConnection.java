import com.uptc.db.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionManager.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM cat");
        while (rs.next()){
            System.out.println(rs.getString(1)+"--"+rs.getString(2));
        }
        rs.close();
        st.close();
    }
}
