package JDBCUSINGSQLITE;

import java.sql.*;

public class IntroductionToJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from students");

        int dno;
        String name;
        String city;
        int roll;
        while (rs.next()) {
            dno = rs.getInt("deptno");
            name = rs.getString("name");
            city = rs.getString("city");
            roll = rs.getInt("roll");
            System.out.println(roll + "\t" + name + "\t" + city + "\t" + dno);
        }
    }
}
