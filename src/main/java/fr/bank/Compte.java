package fr.bank;

public class Compte {
	private int numero;
	private double solde;

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + this.numero + ", solde=" + this.solde + "]";
	}

	public Compte() {

	}

	public void ajouter(double unMontant) {
		this.solde += unMontant;
	}

	public void retirer(double unMontant) {
		this.solde -= unMontant;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	};

}
