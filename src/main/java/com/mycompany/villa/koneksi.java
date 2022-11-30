/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.villa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ryad helmi fadila
 * @author sopwatun anisa
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        
        if(mysqlkonek==null){
            try {
            String DB="jdbc:mysql://localhost:3306/villa";
            String user="root";
            String pass="";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Koneksi");
            }
        }
    return mysqlkonek;
}
}
