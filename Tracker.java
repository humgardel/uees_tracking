/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueestracking;
import java.util.ArrayList;

/**
 *
 * @author HUMGARDEL
 */
public class Tracker {
    private ArrayList<Usuario> users;
    private int numTotUsuarios;
    private ArrayList<Documento> docs;
    private int numTotDocumentos;
    
    public Tracker(){
        this.users= new ArrayList<Usuario>();
        this.numTotUsuarios= getNumUsers();
        this.docs= new ArrayList<Documento>();
        this.numTotDocumentos= getNumDocs();
        
    }
    
    public String gestionarTracking(){
        String cadena;
        cadena=("1.  Registro de Usuarios\n"+"2.  Registro de Operacion sobre Documentos\n"+"3.  Tracking de Documento\n"+"4.  Mostrar el estado actual del directorio\n"+"5.  Reporte de Operaciones por Usuario\n"+"6.  Salir\n");
        return cadena;
    }
    
    public void nuevoUsuario(Usuario usr){
        this.users.add(usr);
    }
    
    public void nuevoDocumento(Documento doc){
        this.docs.add(doc);
    }
    
    public String informe(){
        String cadena;
        cadena = "";
        return cadena;
    }
    
    public int getNumUsers(){
        return users.size();
    }
    
    public int getNumDocs(){
        return docs.size();
    }
}
