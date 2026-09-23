

package EnClase;
import Herencia.* ; 
/**
 *
 * @author marco
 */
public class AppPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado unEmpleado = new Empleado(2000000,"Programador");
        System.out.println("====================================");
        System.err.println("Los datos del empleado son: ");
        System.out.printf("%s",unEmpleado);
        System.out.println("====================================");
        
        Empleado dosEmpleado = new Empleado(3000000,"Analista","Rodrigo","Velazquez",30,"123456","CI");
        System.out.println("====================================");
        System.err.println("Los datos del empleado son: ");
        System.out.printf("%s",dosEmpleado);
        System.out.println("====================================");
        
        System.out.println(verificarTipo(unEmpleado));
        System.out.println("====================================");
    
    }
    
    
    public static String verificarTipo(Persona objeto) {
            if(objeto instanceof Empleado){
                return "El objeto es un tipo de Empleado";
            } else {
                return "El objeto no es un tipo de Empleado";
            }
    }
}

