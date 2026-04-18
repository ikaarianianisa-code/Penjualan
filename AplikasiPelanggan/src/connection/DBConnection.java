/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author daff
 */
public class DBConnection {
    private Connection conn;
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("library connected");
        } catch (ClassNotFoundException ex) {
             System.out.println("gagal koneksi " + ex);
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url = "jdbc:mysql://localhost:3306/pemvis?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("db connected");
        } catch(SQLException ex){
            System.out.println("db failed connect "+ex);
        }
        return conn;
    }
}
