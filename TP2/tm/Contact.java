package tm;

public class Contact {
	private String name;
	private String numero;

	public Contact(String name, String numero) {
		this.name = name ;
		this.numero = numero ;
	}

	public String getName() {
		return this.name ;
	}

	public String getNumero() {
		return this.numero ;
	}

	public void setName(String name) {
		this.name = name ;
	}

	public void setNumero(String numero) {
		this.numero = numero ;
	}
}