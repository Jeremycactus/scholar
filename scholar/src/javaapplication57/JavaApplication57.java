package javaapplication57;

/*import java.util.Date;*/



public class JavaApplication57 {
   

    public static void main(String[] args) {
        empleado empleado1 = new empleado();
        empleado1.nombre = "Jeremy ";
        empleado1.apellido = "Carrasquilla";
        empleado1.correo_electronico = "jeremycarrasquilla@gmail.com";
        empleado1.fecha_nacimiento = "04/03/2002";
        empleado1.genero = "Masculino";
        System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
        
        estudiante estudiante1 = new estudiante();
        estudiante1.nombre = "Franco ";
        estudiante1.apellido = "Rubem";
        System.out.println("el estudiante se llama " + estudiante1.nombre + estudiante1.apellido);
        estudiante1.fecha_nacimiento ="2002/03/04";
        System.out.println("la fecha de nacimiento es: " + estudiante1.fecha_nacimiento);
        
        System.out.println("edad: ");
        
       
        ventana v1 = new ventana();
           
        v1.setVisible(true); // visible la ventana
    }
}
        
    
    
