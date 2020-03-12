package tm;

import tm.* ;
import java.util.* ;

public class Carnet {
	private ArrayList<Contact> myCarnet = new ArrayList<Contact>() ;

	public void remplirCarnet() {
		Contact c0 = new Contact("Thomas", "0") ;
		Contact c1 = new Contact("Lucien", "1") ;

		this.myCarnet.add(c0) ;
		this.myCarnet.add(c1) ;
	}

	public boolean listeVide() {
		return(this.myCarnet.isEmpty() ? true : false) ;
	}

	public String getListeContact() {
		String tmp = "";
		for(int i = 0 ; i < myCarnet.size() ; i++) {
			tmp += "--------------------------------------------------------" + 
			"\nNom = " + myCarnet.get(i).getName() + "	|	" + "Numero = " + myCarnet.get(i).getNumero() +"\n" ;
		}

		return tmp ;
	}

	public String avoirNumero(String name) {
		for(int i = 0 ; i < this.myCarnet.size() ; i++) {
			if(this.myCarnet.get(i).getName().equals(name)) {
				return this.myCarnet.get(i).getNumero() ;
			}
		}

		return "Inconnu" ;
	}

	public String ajouterContact(String name, String numero) {
		Contact newContact = new Contact(name, numero) ;

		if(this.myCarnet.contains(newContact)) {
			return "Contact deja existant" ;
		}

		this.myCarnet.add(newContact) ;
		return "Contact crée";
	}
}