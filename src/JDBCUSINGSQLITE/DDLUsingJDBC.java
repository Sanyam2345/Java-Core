package JDBCUSINGSQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLUsingJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("create table good(num integer, f float)");
//        stmt.executeUpdate("drop table if exists good");
        stmt.close();
        con.close();
    }
}
