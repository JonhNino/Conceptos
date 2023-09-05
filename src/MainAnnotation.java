import com.uptc.db.ConnectionManager;
import com.uptc.decorator.Entity;
import com.uptc.model.AutorEntity;
import com.uptc.model.MenssageEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAnnotation {
    public static void main(String[] args) throws SQLException {
        redTable(AutorEntity.class);
        System.out.println("***");
        redTable(MenssageEntity.class);

    }
    public static void redTable(Class myClass) throws SQLException {
        Entity entity = (Entity) myClass.getAnnotation(Entity.class);
        System.out.println(entity.table());
        Connection con = ConnectionManager.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM "+entity.table());
        while (rs.next()){
            System.out.println(rs.getString(1)+"--"+rs.getString(2));
        }
        rs.close();
        st.close();

    }
}
