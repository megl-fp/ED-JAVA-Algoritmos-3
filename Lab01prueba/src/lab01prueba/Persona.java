/*
 Documentacion tecinca --> java.doc
    tiene incorporado el motor de java. 
    tiene una sintaxis para implementar en la documentacion
 */
package lab01prueba;

// DOCUMENTACION
/**
 * Grupo 8
 * @author Marcos Ezequiel Gonzalez Lovera
 * @version 12/08/2024
 */
// DOCUMENTACION
public class Persona {
    // atributos . 
    // Colocar los atributos como private al principio.
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private String tipoDocumento;
    
    
    // constructor, camino del que le gusta escribir
    public Persona(){
        nombre = "" ;
        apellido = "" ;
        edad = 0 ;
        documento = "" ;
        tipoDocumento = "" ;
    }


    
    
    
    // generado por Insert code.
    public Persona(String nombre, String apellido, int edad, String documento, String tipoDocumento) {
        // this.TalCosa --> es la variable de la clase. Es para diferenciar , 
            // sirve para apuntar al la clase
        // TalCosa --> es la variable de este bloque, sirve para el argumento.
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    
    
    
    // geters y seters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    
    
    
    
/*
    public String objtenerNombre(){
        return nombre;
    }
    
    public String objtenerApellido(){
        return apellido;
    }
    
    public int objtenerEdad(){
        return edad;
    }
    
    public String objtenerDocumento(){
        return documento;
    }
    
    public String objtenerTipoDeDocumento(){
        return tipoDocumento;
    }
*/
    
    @Override 
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n",
        "Nombre de Empeado", getNombre(), getApellido(),
         "N de documento",getDocumento()); 
   }
}







