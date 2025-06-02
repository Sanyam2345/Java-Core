package JDBCUSINGSQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLiteJDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection c = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stmt = c.createStatement();
        String sql = "delete from students where roll=11;";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
}
