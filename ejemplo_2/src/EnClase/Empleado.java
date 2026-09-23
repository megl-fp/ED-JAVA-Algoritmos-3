/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EnClase;


/**
 *
 * @author marco
 */
public class Empleado extends Persona {
    private long salario;
    private String puesto;

    public Empleado(long salario, String puesto) {
        this.salario = salario ;
        this.puesto = puesto ;
    }
    
    public Empleado(long salario,String puesto ,String nombre, String apellido , int edad ,String documento, String tipoDocumento) {
        super(nombre,apellido,edad,documento,tipoDocumento); // edad esta de mas
        this.salario = salario ;
        this.puesto = puesto ;
    }

    // GETERS
    public long getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    
    // SETERS 
    public void setSalario(long salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override 
    public String toString(){
        return String.format("%s: %s %s%n%s: %s %n%s: %s%n%s: %s%n",
        "Nombre de Empeado", getNombre(), getApellido(),
        "N de documento",getDocumento(),
        "Sueldo",getSalario(),
        "Puesto",getPuesto()); 
   }
}

