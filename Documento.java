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
public class Documento {
    private String nombre;
    private String tamanho;
    private Directorio dir;
    private Usuario ultmodificacion;
    
    public Documento(String nombre_, String tamanho_, Directorio dir_, Usuario ultmodificacion_){
        this.nombre=nombre_;
        this.tamanho=tamanho_;
        this.dir=dir_;
        this.ultmodificacion=ultmodificacion_;
    }
    
    /*public void crearDoc(String nombreDoc_, Directorio dirpredeterminado_){
        Documento doctest= new Documento(nombreDoc_,"27kb",dirpredeterminado_);
    }
    
    public void eliminarDoc(){
        
    }
    
    public void modificarDoc(){
        
    }*/
}
