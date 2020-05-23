package entornosfinal;
//Clase Cuenta nombre apellidos direccion nif telefono y edad
/**
 * 
 * @author jorge
 *
 */
public class Cuenta {
/**
 * Aqui estamos declarando todas las constantes que incluyen la clase Cuenta
 */
	private String nombre;
    private String apellidos;
    private String direccion; 
    private int nif;
    private int telefono;
    private int edad;
    private int numeroCuenta;
    private double saldo;

    //Constructor por defecto
    public Cuenta() {
    }
/**
 * 
 * @param nombre
 * @param apellidos
 * @param direccion
 * @param nif
 * @param telefono
 * @param edad
 * @param numeroCuenta
 * @param saldo
 * Estas son las variables incluuuidas ya en el construntor ocn sus correspondientes parametro
 */
    //Constructor con parametros
    public Cuenta(String nombre, String apellidos, String direccion, int nif, int telefono, int edad, int numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Constructor copia
    public Cuenta(final Cuenta c) {
        nombre = c.nombre;
        apellidos = c.apellidos;
        direccion = c.direccion;
        nif = c.nif;
        telefono = c.telefono;
        edad = c.edad;
        numeroCuenta = c.numeroCuenta;
        saldo = c.saldo;
    }
/**
 * Aqui declaramos los getters y settes correspondientes
 * @param s
 */
    //getters y setters
    public void setNombre(String s) {
        nombre = s;
    }
    
    public void setApellidos (String s) {
    	apellidos = s;
    }
    
    public void setDireccion (String s) {
    	direccion = s;
    }
    
    public void setNIF (int t) {
    	nif = t;
    }
   
    public void setTelefono (int t) {
    	telefono = t;
    }
    
    public void setEdad (int t) {
    	edad = t;
    }
    
    public void setNumeroCuenta(int t) {
        numeroCuenta = t;
    }

    
    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNombre() {
        return nombre;
    }
    	
    public String getApellidos() {
    	return apellidos;
    }
    
    public String getDireccion() {
    	return direccion;
    }
    
    public int getNIF() {
    	return nif;
    }
    
    public int getTelefono() {
    	return telefono;
    }
    
    public int getEdad() {
    	return edad;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
 
    public double getSaldo() {
        return saldo;
    }
    //fin getters y setters 
    
    /**
     * Este es el metoro que utilizaremos para crear cada una de las cuentas
     * @return
     */
    //metodo para crear cuenta 
    public Cuenta crearCuenta(){
		Cuenta primeraCuenta;
		primeraCuenta = new Cuenta ("nombre", "apellidos", "direccion", 50365525, 680906267, 21, 13456789, 2580.95 );
    	return primeraCuenta;
    }
    /**
     * Este metodo le usaremos para cada uno de los ingresos que el usuario realize en una de la cuentas
     * @param n
     * @return
     */
    //metodo ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }
/**
 * Este metodo le usaremos para cada una de las retiradas que el usuario realize en una de las cuentas
 * @param n
 * @return
 */
    //metodo retirar
    public boolean retirada(double n) {
        boolean retiradaCorrecta = true;
        if (n < 0) {
        	retiradaCorrecta = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
        	retiradaCorrecta = false;
        }
        return retiradaCorrecta;
    }

}