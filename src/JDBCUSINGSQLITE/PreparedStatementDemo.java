package JDBCUSINGSQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement ps = con.prepareStatement("select * from students where deptno = ?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department number: ");
        int dn = sc.nextInt();
        ps.setInt(1,dn);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("roll") + "\t" + rs.getString("name") + "\t" + rs.getString("city") + "\t" + rs.getInt("deptno"));
        }
        ps.close();
        con.close();
    }
}
