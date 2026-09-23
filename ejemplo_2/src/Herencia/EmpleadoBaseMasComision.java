package Herencia;

/**
 *
 * @author Rodrigo
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision { 
    private double salarioBase;// salario base por mes
    // constructor con seis argumentos
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
    String numeroCedula, double ventasBrutas, double tarifaComision, 
    double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroCedula, ventasBrutas, tarifaComision);
        // si salarioBase no es válido, lanza excepción
        if(salarioBase <0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
                this.salarioBase = salarioBase;
   }

// establece el salario base
    public void establecerSalarioBase(double salarioBase){
        if(salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
                this.salarioBase = salarioBase;
   }

    // devuelve el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }
    
    // calcula los ingresos
    @Override 
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    } 

 // devuelve representación String de EmpleadoBaseMasComision
   @Override 
    public String toString(){
        return String.format("%s %s%n%s: %.2f%n%s: %.2f", "Con sueldo base nuevo para el ",
            super.toString(), "El salario base es", obtenerSalarioBase() ,
            "Su ingreso total nuevo", ingresos());
    } 
} // fin de la clase EmpleadoBaseMasComision