package javaapplication57;

/**
 *
 * @author estudiante
 */
public class JavaApplication57 {

    public static void main(String[] args) {
        empleado empleado1 = new empleado();
        empleado1.nombre = "Jeremy ";
        empleado1.apellido = "Carrasquilla";
        empleado1.correo_electronico = "jeremycarrasquilla@gmail.com";
        empleado1.fecha_nacimiento = "04/03/2002";
        empleado1.genero = "Masculino";
        //System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
        empleado1.printname();
        estudiante estudiante1 = new estudiante();
        estudiante1.nombre = "ruben ";
        estudiante1.apellido = "franco";
        //System.out.println("el estudiante se llama " + estudiante1.nombre + estudiante1.apellido);
        estudiante1.printname();

    }

}
