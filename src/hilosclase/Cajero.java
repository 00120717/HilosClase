/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclase;

/**
 *
 * @author Oscar Lovato
 */
public class Cajero extends Thread{
    private String nombre;
    private Cliente cliente;
    private Transaccion trans;

    public Cajero() {
    }

    public Cajero(String nombre, Cliente cliente, Transaccion trans) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.trans = trans;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transaccion getTiempoInicio() {
        return trans;
    }

    public void setTiempoInicio(long tiempoInicio) {
        this.trans = trans;
    }
     
    public void run(){
        
    }
}
