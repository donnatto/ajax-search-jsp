/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 Uso del Patron Singleton
 */
public class ConexionBD {
    private static ConexionBD instance=null;
    private static Connection con=null;
    private static final String url="jdbc:sqlserver://localhost:1433;databaseName=tambo";
    private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String user="sa";
    private static final String password="123456";
    
    private ConexionBD(){
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Correcta: ");
        } catch (Exception e) {
            System.out.println("Error de conexion: "+e.getMessage());
        }
    }
    
    /*Crear la instancia*/
    public synchronized static ConexionBD generateInstance(){
        if(instance == null){
            instance = new ConexionBD();
        }
        return instance;
    }
    
   public Connection getCon(){
       return con;
   }
   public void closeConnection(){
       instance = null;
   }
    
}
