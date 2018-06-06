/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclase;

/**
 *
 * @author MMont
 */
public class Cliente {
    private String nombre;
    //Pago=1; Remesa=2; Retiro=3;
    private Transaccion transacciones[];
    
    public Cliente() {
    }

    public Cliente(String nombre, Transaccion[] transacciones) {
        this.nombre = nombre;
        this.transacciones = transacciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int[] transacciones) {
        this.transacciones = transacciones;
    }
    
    

    
    
    
    
    
    
}
