/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura_5314781;

/**
 *
 * @author marco
 */
public class Factura {
    private String Num_Pieza ;
    private String Tipo_Fact ;
    private String Descripcion ;
    private int Cant_Art ;
    private double Precio_Uni ;
    
    
   
    public Factura(String Num_Pieza, String Tipo_Fact, String Descripcion, int Cant_Art, double Precio_Uni ) {
        this.Num_Pieza = Num_Pieza;
        this.Tipo_Fact = Tipo_Fact;
        this.Descripcion = Descripcion;
        this.Cant_Art = Cant_Art;
        this.Precio_Uni = Precio_Uni;
    }
    
    public Factura(){
        this.Num_Pieza = "";
        this.Tipo_Fact = "";
        this.Descripcion = "";
        this.Cant_Art = 0;
        this.Precio_Uni = 0.0;
    }
    

    public String getNum_Pieza() {
        return Num_Pieza;
    }

    public String getTipo_Fact() {
        return Tipo_Fact;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCant_Art() {
        return Cant_Art;
    }

    public double getPrecio_Uni() {
        return Precio_Uni;
    }

// --------------------------------------------------
    
    public void setNum_Pieza(String Num_Pieza) {
        this.Num_Pieza = Num_Pieza;
    }

    public void setTipo_Fact(String Tipo_Fact) {
        this.Tipo_Fact = Tipo_Fact;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setCant_Art(Integer Cant_Art) {
        this.Cant_Art = Cant_Art;
    }

    public void setPrecio_Uni(double Precio_Uni) {
        this.Precio_Uni = Precio_Uni;
    }
    
// --------------------------------------------------
    
    public double obtenerMontoFactura() {
        if (this.getCant_Art() < 0 || this.getPrecio_Uni() < 0) {
            return 0.0;
        } else {
            return this.getPrecio_Uni() * this.getCant_Art();
        }
    }
    
    @Override 
    public String toString(){
        return String.format("%s: %s %n%s: %s%n%s: %s%n%s: %d%n%s: %.2f%n %s%n",
        "Nombre de Pieza", getNum_Pieza(),
        "Tipo de Factura",getTipo_Fact(),
        "Descripcion",getDescripcion(),
        "Cantidad a Comprar",getCant_Art(),
        "Precio por unidad",getPrecio_Uni(),
        "================================="); 
   }
    
}
