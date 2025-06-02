package JDBCUSINGSQLITE;

import java.sql.*;
import java.util.Scanner;

public class DMLUsingJDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
//        Statement stm = con.createStatement();
//        stm.executeUpdate("delete from students where roll = 12");
        PreparedStatement ps = con.prepareStatement("delete from students where roll = ?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number you want to delete: ");
        int roll = sc.nextInt();
        ps.setInt(1,roll);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
}
