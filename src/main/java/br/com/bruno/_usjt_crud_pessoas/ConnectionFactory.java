/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bruno._usjt_crud_pessoas;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private final String host = "localhost";    
    private final String port = "3306";
    private final String user = "root";
    private final String password = "anima123";
    private final String db = "23232_usjt_psc_pessoas";
            
    public Connection conectar() throws Exception {
        String c = String.format(
           "jdbc:mysql://%s:%s/%s", host, port, db
        );
        
        Connection cn = DriverManager.getConnection(c, user, password);
        return cn;
    };        
}
