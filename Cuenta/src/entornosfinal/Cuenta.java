package entornosfinal;
//Clase Cuenta nombre apellidos direccion nif telefono y edad
public class Cuenta {

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

    //getters y setters
    public void setNombre(String s) {
        nombre = s;
    }
    
    public void serApellidos (String s) {
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
    
    
    //metodo para crear cuenta 
    public Cuenta crearCuenta(){
		Cuenta primeraCuenta;
		primeraCuenta = new Cuenta ("nombre", "apellidos", "direccion", 50365525, 680906267, 21, 13456789, 2580.95 );
    	return primeraCuenta;
    }
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