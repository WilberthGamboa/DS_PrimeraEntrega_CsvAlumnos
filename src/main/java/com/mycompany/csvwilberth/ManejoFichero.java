package com.mycompany.csvwilberth;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class ManejoFichero {
   
    private LinkedList<ListaAlumnos> listaAlumnos = new LinkedList<>();

    public void guardarArchivo(File archivo){
        FileWriter fichero = null;
        PrintWriter pw= null;
        try {
            fichero = new FileWriter(archivo);
            pw  = new PrintWriter(fichero);
            for(ListaAlumnos u:  listaAlumnos){
                String linea = u.getMatricula()+","+u.getPrimerApellido()+","+u.getSegundoApellido()+","+u.getNombres();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                //TODO: handle exception
            }
        }
    }

    public void nuevoAlumno( javax.swing.JTextField matriculajTextField1,javax.swing.JTextField apellidoPjTextField1 , javax.swing.JTextField apellidoMjTextField1 , javax.swing.JTextField nombresjTextField1 ){
        ListaAlumnos nuevoAlumno = new ListaAlumnos();
        nuevoAlumno.setMatricula(matriculajTextField1.getText());
        nuevoAlumno.setPrimerApellido(apellidoPjTextField1.getText());
        nuevoAlumno.setSegundoApellido(apellidoMjTextField1.getText());
        nuevoAlumno.setNombres(nombresjTextField1.getText());
        listaAlumnos.add(nuevoAlumno);
    

    }

    
}
