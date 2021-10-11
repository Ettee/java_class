/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlynhahang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ettee
 */
public class Startup {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        System.out.println("Driver loading...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        System.out.println("Connecting ... ");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/quanlynhahang","root","12345678");
        System.out.println("Connected ");
        conn.close();
    }
    
}
