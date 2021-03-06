package com.win;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // connect to  database
        // 1.publish the driver
        try {
            System.out.println("Program initiated");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Published the driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ras","root","");
            System.out.println("Connected");

            // CRUD
            Statement stmt = con.createStatement();
            String queryString = "insert into Student (sid, first_name, last_name) values (009,'James','Bond')";
            int i = stmt.executeUpdate(queryString);
            if(i != 0) {
                System.out.println("Data added successfully");
            }

            // display data
            queryString = "select * from Student";

            ResultSet rs = stmt.executeQuery(queryString);

            while (rs.next()){

                String id = rs.getString("sid");   //
                String fname = rs.getString("first_name");
                String lname = rs.getString("last_name");

                System.out.println("SID = "+id+ " First Name = "+fname+" Last Name ="+lname);
            }

        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver not found");
        }
        catch (SQLException ex) {
            System.out.println("Database Error");
        }
        System.out.println("After All");
    }
}
