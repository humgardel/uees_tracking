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
public class RegistroOperacion {
    private Documento documento;
    private String tipoOperacion;
    private String fechaOperacion;
    private Usuario usuario;
    
    public RegistroOperacion(Documento documento_, String tipoOperacion_, String fechaOperacion_, Usuario usuario_){
        this.documento=documento_;
        this.tipoOperacion=tipoOperacion_;
        this.fechaOperacion=fechaOperacion_;
        this.usuario=usuario_;
    }
            
    /*public void registrarOperacion(){
        
    }*/
    
    public String informe(){
        String cadena;
        cadena = "";
        return cadena;
    }
}
