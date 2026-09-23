/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author marco
 */
public abstract class Informatico extends Empleado{
    String lenguajePrincipal;

    public Informatico() {
        super();
        this.lenguajePrincipal = "";
    }
    
    public Informatico(String lenguajePrincipal, String Nombre, int ci, double salario) {
        super(Nombre, ci, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }
    
    public abstract void desarrollarSoftware();
    
}
