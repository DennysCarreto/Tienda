/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import Database.Conexion;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        Conexion conectar = new Conexion();
        Interfaz_principal interfaz = new Interfaz_principal();
        
        interfaz.setVisible(true);
    }   
}
