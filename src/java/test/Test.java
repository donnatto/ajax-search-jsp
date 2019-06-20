/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import daos.ProductoDAO;
import dtos.Producto;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Test {
    public static void main(String[] args){
        ProductoDAO productoDAO = new ProductoDAO();
        ArrayList<Producto> productos = productoDAO.buscar("k");
        for(Producto producto : productos){
            System.out.println("Econtrado: "+producto.getNombre());
        }
    }
}
