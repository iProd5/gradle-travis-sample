package io.turntabl;

import java.sql.*;

public class JDBCmain {

    public static void main(String[] args) throws ClassNotFoundException {

    Class.forName("org.postgresql.Driver");
    String url = "jdbc:postgresql:northwind";


    try(Connection db = DriverManager.getConnection(url, "franklin-luther","turntabl")) {
        Statement s = db.createStatement();
        ResultSet rs = s.executeQuery("select * from customers");
        System.out.println("*********************************************************************************************************************************************************");
        System.out.printf("%10s, %35s, %30s, %30s, %30s," , "ID", "COMPANY_NAME", "CONTACT_NAME", "CONTACT_TITLE", "ADDRESS");
        System.out.println("\n*********************************************************************************************************************************************");

        while(rs.next()){
//            System.out.format("%25s, %35 ", rs.getString("product_id"),rs.getString("product_name"));
//            System.out.println(rs.getString("product_name"));
            System.out.format("%10s %35s %30s %30s %30s ", rs.getString("customer_id"),
                    rs.getString("company_name"), rs.getString("contact_name"),
                    rs.getString("contact_title"), rs.getString("address"));
            System.out.println();
        }

    } catch (SQLException sqle) {
       System.err.print("Connection err: " + sqle);
    }


    }
}
