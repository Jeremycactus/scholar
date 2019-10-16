package javaapplication57;

import java.util.Calendar;
import javax.swing.JFrame;

/*import java.util.Date;*/



public class JavaApplication57 {
   
private static Ventana2 formulario;
private static persona Persona[];
private static int contador;


    public static void main(String[] args) {
        empleado empleado1 = new empleado();
        empleado1.nombre = "Jeremy ";
        empleado1.apellido = "Carrasquilla";
        empleado1.correo_electronico = "jeremycarrasquilla@gmail.com";
        empleado1.fecha_nacimiento = "04/03/2002";
        empleado1.genero = "Masculino";
        empleado1.ClacEdad();
        System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
        
        estudiante estudiante1 = new estudiante();
        estudiante1.nombre = "Franco ";
        estudiante1.apellido = "Rubem";
        System.out.println("el estudiante se llama " + estudiante1.nombre + estudiante1.apellido);
        estudiante1.fecha_nacimiento ="02/03/2004";
        estudiante1.ClacEdad();
        System.out.println("la fecha de nacimiento es: " + estudiante1.fecha_nacimiento);
        
        
        
       
        ventana v1 = new ventana();
           
        v1.setVisible(true); // Hacemos visible la ventana
          
        
       Ventana2 v2 = new Ventana2();
       v2.setVisible(true);//se hace la ventana2
       
       formulario=new Ventana2();
       Persona=new persona[5];
       //se crea e arrelgo para agregar 0 - 4 elementos
       //del arreglo persona
       for (int i = 0; i <5; i++){
           Persona[i]=new persona();
           
       }
       contador=0;
       
    }
    //metodos guardar y buscar
    public static void guardar(String nombre, String apellido, String fecha_nacimiento, String tipo_sangre, String nacionalidad, String identificacion, String telefono, String correo_electronico, String genero, int edad){  
        
     //se crean las variables de persona
     //String nombre, String apellido, String fecha_nacimiento, String tipo_sangre, String nacionalidad, String identificacion, String telefono, String direccion, String correo_electronico, String genero, int edad
     
     Persona[contador].setNombre(nombre);
     Persona[contador].setApellido(apellido);
     Persona[contador].setFecha_nacimiento(fecha_nacimiento);
     Persona[contador].setTipo_sangre(tipo_sangre);
     Persona[contador].setNacionalidad(nacionalidad);
     Persona[contador].setIdentificacion(identificacion);
     Persona[contador].setTelefono(telefono);
     Persona[contador].setCorreo_electronico(correo_electronico);
     Persona[contador].setGenero(genero);
     Persona[contador].ClacEdad();
     
     
    contador++;
 
    }
    //metodo buscar
    public static void buscar(String bus){
        //creamos la variable
        //buscar bus
        for (int j= 0; j < Persona.length; j++){
          if(Persona[j].getNombre().equals(bus))  {
              formulario.cargardatos(Persona[j]);
          }
        }
             
    }

    static void guardar(String nombre, String apellido, Calendar fecha_nacimiento, String tipo_sangre, String nacionalidad, String identificacion, String telefono, String correo_electronico, String genero, int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
        
    
    
