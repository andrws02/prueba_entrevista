/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andres Rojas
 */
public class conexion {

    Connection conn;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_entrevista","root","");
        } catch (Exception e) {
        }
    }
    public Connection getConnection(){
        return conn;
    }
}
