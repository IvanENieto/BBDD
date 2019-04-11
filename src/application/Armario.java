package application;

public class Armario {
	
	private String Numero;
	
	private String Tamaño;

	public Armario(String numero, String tamaño) {
		super();
		Numero = numero;
		Tamaño = tamaño;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getTamaño() {
		return Tamaño;
	}

	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	};
	
	

}
