package com.mycompany.csvwilberth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class ManejoFichero {
   
    private LinkedList<ListaAlumnos> listaAlumnos = new LinkedList<>();
    private LinkedList <Calificaciones> calificaciones = new LinkedList<>();
    private int navegador =0;
    public void exportarArchivo(File archivo){
      
        FileWriter fichero = null;
        PrintWriter pw= null;

      
        try {
            fichero = new FileWriter(archivo);
            pw  = new PrintWriter(fichero);
            for(Calificaciones u:  calificaciones){
                String linea = u.getMatricula()+","+u.getNombreAsignatura()+","+u.getCalificacion();
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


    public void importarArchivos(File archivo){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr  = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null){

                String arreglo [] = linea.split(",");
                if(arreglo.length==4){
                    ListaAlumnos a  = new ListaAlumnos();
                    a.setMatricula(arreglo[0]);
                    a.setPrimerApellido(arreglo[1]);
                    a.setSegundoApellido(arreglo[2]);
                    a.setNombres(arreglo[3]);
                    listaAlumnos.add(a);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                //TODO: handle exception
            }
        }

    }
    

    public void guardarAlumno( javax.swing.JTextField matriculajTextField1,javax.swing.JTextField MateriajTextField1,javax.swing.JTextField CalificacionjTextField2){
        
        Calificaciones nuevaCalificaciones = new Calificaciones();
        nuevaCalificaciones.setMatricula(matriculajTextField1.getText());
        nuevaCalificaciones.setNombreAsignatura(MateriajTextField1.getText());
        nuevaCalificaciones.setCalificacion(Integer.parseInt(CalificacionjTextField2.getText()));
        /*
        nuevoAlumno.setMatricula(matriculajTextField1.getText());
        nuevoAlumno.setPrimerApellido(MateriajTextField1.getText());
        nuevoAlumno.setSegundoApellido(cali.getText());
        nuevoAlumno.setNombres(nombresjTextField1.getText());
         listaAlumnos.add(nuevoAlumno);
    
        */
        calificaciones.add(nuevaCalificaciones);
       

    }
   public void inicio(javax.swing.JTextField matriculajTextField1, javax.swing.JTextField apellidoPjTextField1, javax.swing.JTextField apellidoMjTextField1, javax.swing.JTextField nombresjTextField){
       
       matriculajTextField1.setText(listaAlumnos.get(navegador).getMatricula());
       matriculajTextField1.setEnabled(false);
       apellidoPjTextField1.setText(listaAlumnos.get(navegador).getPrimerApellido());
       apellidoPjTextField1.setEnabled(false);
       apellidoMjTextField1.setText(listaAlumnos.get(navegador).getSegundoApellido());
       apellidoMjTextField1.setEnabled(false);
       nombresjTextField.setText(listaAlumnos.get(navegador).getNombres());
        nombresjTextField.setEnabled(false);

       
   }
    public void atras(){
        navegador=navegador-1;
        if(navegador==-1){
            navegador=0;
        }else if(navegador>calificaciones.size()){
            navegador=calificaciones.size();
        }

        

    }

    public void delante(){
        navegador=navegador+1;
        if(navegador==-1){
            navegador=0;
        }else if(navegador>listaAlumnos.size()){
            navegador=listaAlumnos.size();
        }

      

    }

    
    

    
}
