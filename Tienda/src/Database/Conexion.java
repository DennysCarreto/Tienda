/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Denis
 */
public class Conexion {
    Connection conexion;
    Statement stm;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendabd?user=root&password=2276616");
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return conexion;
    }
}
