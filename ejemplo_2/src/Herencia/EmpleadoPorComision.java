package Herencia;

/**
 *
 * @author Rodrigo
 */
public class EmpleadoPorComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroCedula;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision;// porcentaje de comisión
    
    // constructor con cinco argumentos
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, 
            String numeroCedula, double ventasBrutas, double tarifaComision) {
    // la llamada implícita al constructor de Object ocurre aquí
    // si ventasBrutas no son válidas, lanza excepción
        if(ventasBrutas <0.0)
            throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
        // si tarifaComision no es válida, lanza excepción
        if(tarifaComision <=0.0|| tarifaComision >=1.0)
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0");
        this.primerNombre       = primerNombre; 
        this.apellidoPaterno    = apellidoPaterno; 
        this.numeroCedula       = numeroCedula; 
        this.ventasBrutas       = ventasBrutas;
        this.tarifaComision     = tarifaComision;   
    }// fin del constructor

    // devuelve el valor incluido en la variable primerNombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // devuelve el valor incluido en la variable apellidoPaterno
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    // devuelve el valor en la variable numeroCedula
    public String obtenerNumeroCedula(){
        return numeroCedula;
    }

    // establece el valor de ventas brutas
    public void establecerVentasBrutas(double ventasBrutas)  {
        if(ventasBrutas <0.0)
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }
    
    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    // establece la tarifa de comisión
    public void establecerTarifaComision(double tarifaComision){
        if(tarifaComision <=0.0|| tarifaComision >= 1.0)
            throw new IllegalArgumentException( 
                    "La tarifa de comisión debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    // calcula los ingresos
    public double ingresos()  {
        return obtenerTarifaComision() * obtenerVentasBrutas(); 
    }

    // devuelve representación String del objeto EmpleadoPorComision
    @Override 
    /*
    para indicar al compilador que la intención es sobreescribir 
    el método de la clase padre y si nos equivocamos 
    (por ejemplo, al escribir el nombre del método) 
    y no estamos realmente sobreescribiendo, el compilador dará un error.
    */
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
        "empleado por comisión", obtenerPrimerNombre(), obtenerApellidoPaterno(),  
        "N° de cédula", obtenerNumeroCedula(),
        "Las ventas brutas son", obtenerVentasBrutas(),
        "La comisión es", obtenerTarifaComision()); 
    }
} // fin de la clase EmpleadoPorComision
