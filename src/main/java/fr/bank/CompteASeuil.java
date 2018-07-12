package fr.bank;

public class CompteASeuil extends Compte {
	private double seuil;

	public double getSeuil() {
		return this.seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	public CompteASeuil() {
	}

	public CompteASeuil(double seuil) {
		super();
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		return "CompteASeuil [seuil=" + this.seuil + "]";
	}

	@Override
	public void retirer(double uneValeur) {
		if (super.getSolde() < this.seuil) {
			super.setSolde(super.getSolde() - uneValeur);
		} else {
			System.out.println("votre plafond ne vous permet pas de retirer 1 centime!!");
		}
	}
}
