
public class Ccuenta {

	// Atributos de cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public Ccuenta(String nom, String cue, double sal, double tipoInteres) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		this.tipoInteres = tipoInteres;
	}

	// Para probar Junit
	public double ingresar(double cantidad) {
		if (cantidad < 0) {
			System.out.println("Cantidad negativa");
		}
		return saldo = saldo + cantidad;
	}

	// Para probar JUnit
	public double retirar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Cantidad Negativa");
		if (this.getSaldo() < cantidad)
			System.out.println("Saldo insuficiente");
		return saldo = saldo - cantidad;
	}

	// Métodos para devolver los datos de la cuenta
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getTipo() {
		return tipoInteres;
	}
	
}
