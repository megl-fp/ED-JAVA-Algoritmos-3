package cuenta_5314781;

/**
 *
 * @author Marcos Ezequiel Gonzalez Lovera CI: 5314781
 */
public class cuenta_5314781 {
    String nombre;
    double saldo;

    public cuenta_5314781(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public cuenta_5314781(){
         this.nombre="";
         this.saldo=0.0;
     }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    
    public double objetenerSaldo() {
        return saldo;
    }
    
    public String objetenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
