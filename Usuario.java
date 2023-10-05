/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueestracking;

/**
 *
 * @author HUMGARDEL
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    
    public Usuario(String nombre_, String apellido_, String usuario_, String clave_){
        this.nombre=nombre_;
        this.apellido=apellido_;
        this.usuario=usuario_;
        this.clave=clave_;
    }
    
    public boolean validarAcceso(){
        return true;
    }
    
    public String informe(){
        String cadena;
        cadena = "";
        return cadena;
    }
}
