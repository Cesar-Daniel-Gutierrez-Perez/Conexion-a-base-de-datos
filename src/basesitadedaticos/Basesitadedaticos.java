/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesitadedaticos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author perez
 */
public class Basesitadedaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       // Establecemos la conexión con la base de datos.
       Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/prueba","root", "");
       // Preparamos la consulta
       Statement s = conexion.createStatement();
       ResultSet rs = s.executeQuery ("select * from persona");
       // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
       while (rs.next()){
           System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getDate(3));
       }
       // Cerramos la conexion a la base de datos.
       conexion.close();
    }    
}
