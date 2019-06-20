/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import conexion.ConexionBD;
import dtos.Producto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ProductoDAO {
    private static CallableStatement cstm = null;
    private static ResultSet res = null;
    private static ConexionBD con = ConexionBD.generateInstance();
    private static final String SQL_SEARCH = "{call buscar(?)}";
    
    public ArrayList<Producto> buscar(String nombre){
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            cstm = con.getCon().prepareCall(SQL_SEARCH);
            cstm.setString(1, nombre);
            res = cstm.executeQuery();
            while(res.next()){
                productos.add(new Producto(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4), res.getInt(5)));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            closeCon();
        }
        return productos;
    }
    
    private void closeCon(){
        try {
            if(cstm!=null)cstm.close();
            if(res!=null)res.close();
            if(con!=null)con.closeConnection();
        } catch (Exception e) {
        }
    }
}
