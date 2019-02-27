/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author carlos.robledo
 */
public class Cliente {
    
    private String nombre;
    private String Idcliente;
    private String Empresa;

    public Cliente() {
    }

    public Cliente(String nombre, String Idcliente, String Empresa) {
        this.nombre = nombre;
        this.Idcliente = Idcliente;
        this.Empresa = Empresa;
    }

    /**
     * Get the value of Empresa
     *
     * @return the value of Empresa
     */
    public String getEmpresa() {
        return Empresa;
    }

    /**
     * Set the value of Empresa
     *
     * @param Empresa new value of Empresa
     */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }


    /**
     * Get the value of Idcliente
     *
     * @return the value of Idcliente
     */
    public String getIdcliente() {
        return Idcliente;
    }

    /**
     * Set the value of Idcliente
     *
     * @param Idcliente new value of Idcliente
     */
    public void setIdcliente(String Idcliente) {
        this.Idcliente = Idcliente;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre + ", " + Idcliente + ", " + Empresa;
    }

}
