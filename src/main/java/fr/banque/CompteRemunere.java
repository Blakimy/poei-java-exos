package fr.banque;

import fr.bank.Compte;

public class CompteRemunere extends Compte {

	private double taux;

	public CompteRemunere() {
	}

	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteRemunere [taux=" + this.taux + "]";
	}

	public double calculerInterets() {
		return this.taux * super.getSolde();
	}

	public void verserInterets() {
		// super.setSolde(super.getSolde() + this.calculerInterets());
		super.ajouter(this.calculerInterets());
	}

}
