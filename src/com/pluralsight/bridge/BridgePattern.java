package com.pluralsight.bridge;

//Similar to Adapter, but meant to be designed at same time (not for legacy code)
//Decouple abstraction and implementation
// Uses interfaces and abstract classes
//Prioritizes composition over inheritance
//Examples: driver (JDBC)
//Abstraction, Implementor, Refined Abstraction, Concrete Implementor
//Concerns: increases complexity, difficult to plan, More than just OOP

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgePattern {
    public static void main(String[] args) {
        try {
//            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement sta = conn.createStatement();

            sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
            + " City VARCHAR(20))");

            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
