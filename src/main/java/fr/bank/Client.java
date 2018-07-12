package fr.bank;

public class Client {
	private String nom, prenom;
	private int age, numero;
	private Compte comptes[] = new Compte[5];

	public Client() {
	}

	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Client [nom=" + this.nom + ", prenom=" + this.prenom + ", age=" + this.age + ", numero=" + this.numero
				+ "]";
	}

	public void ajouterCompte(Compte compte) {
		for (int i = 0; i < this.comptes.length; i++) {
			if (this.comptes[i] == null) {
				this.comptes[i] = compte;
			} else {
				System.out.println("they have no more empty cases");
			}
		}
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Compte[] getComptes() {
		return this.comptes;
	}

	public void setComptes(Compte[] comptes) {
		this.comptes = comptes;
	}

}
