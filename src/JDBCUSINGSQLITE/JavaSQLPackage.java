package JDBCUSINGSQLITE;
import java.sql.*;

public class JavaSQLPackage {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from dept");
        while (rs.next()) {
            System.out.print(rs.getInt("deptno") + "\t");
            System.out.println(rs.getString("dname") + "\t");
        }
    }
}
