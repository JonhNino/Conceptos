package com.uptc.db;

import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if(connection==null){
            DriverManager.registerDriver(new OracleDriver());
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CONCEPTOS_UNO","A");
        }
        return connection;
    }

}
