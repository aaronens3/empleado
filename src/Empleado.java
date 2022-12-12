
/**
 * Esta clase representa Empleado
 *
 * @author aaronprimoalmarche
 * @author<a href= "mailto:prologmacgmail.com">prologmacgmail.com</a>
 * @version 1.0
 */

public class Empleado {
    /**
     * Contructores del lenguaje
     */
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    //Metodos publicos
    public boolean plus (double sueldoPlus ) {
    boolean aumento = false;
    if (edad > 40 && compruebaNombre()) {
        salario += sueldoPlus;
        aumento = true;
    }
    return aumento;
    }
 //Metodos privados
 private boolean compruebaNombre() {
 if (nombre.equals(" ")) {
 return false;
 }
 return true;
 }
 
 
 //Constructores
 public Empleado() {
 this( "", "" , 0, 0);
 }
 public Empleado(String nombre, String apellido, int edad, double salario) {
 this.nombre = nombre;
 this.apellido = apellido;
 this.edad = edad;
 this.salario = salario;
 }
}