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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tracker trackertest= new Tracker();
        Directorio dirpredeterminado=  new Directorio("C://UEESTRACKING/");
        System.out.println(trackertest.gestionarTracking());
        
        //1. Registro de Usuarios
        Usuario user1 = new Usuario("Juan", "Montalvo", "juamo", "12345");
        trackertest.nuevoUsuario(user1);
        Usuario user2 = new Usuario("Marta", "Sanchez", "marsa", "23456");
        trackertest.nuevoUsuario(user2);
        Usuario user3 = new Usuario("Raul", "Gonzalez", "raugo", "34567");
        trackertest.nuevoUsuario(user3);
        
        //2. Registro de Operación sobre Documentos
        Documento doc1 = new Documento("Plantas.doc", "27 kb", dirpredeterminado, user1);
        RegistroOperacion op1 = new RegistroOperacion(doc1,"Crear","12-10-16 14:20",user1);
        trackertest.nuevoDocumento(doc1);
        Documento doc2 = new Documento("Animales.pdf", "114 kb", dirpredeterminado, user2);
        RegistroOperacion op2 = new RegistroOperacion(doc2,"Crear","14-09-16 09:40",user2);
        trackertest.nuevoDocumento(doc2);
        Documento doc3 = new Documento("Cuentas2016.xls", "235 kb", dirpredeterminado, user3);
        RegistroOperacion op3 = new RegistroOperacion(doc3,"Crear","19-10-16 12:15",user3);
        trackertest.nuevoDocumento(doc3);
        
        //3. Tracking de Documento
        System.out.println(op1.informe());
        
        //4. Mostrar el estado actual del directorio
        System.out.println(trackertest.informe());
        
        //5. Reporte de Operaciones por Usuario
        System.out.println(user1.informe());
        
        
    }
    
}
