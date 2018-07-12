package fr.bank;

import fr.banque.CompteRemunere;

public class Run {

	public static void main(String[] args) {
		// clt
		Client clt = new Client("nom", "prenom", 1, 2);
		System.out.println(clt.toString());
		clt.ajouterCompte(new Compte());

		CompteRemunere remunCpt = new CompteRemunere(2, 15415145, 0.6);
		System.out.println(remunCpt.calculerInterets());
		remunCpt.verserInterets();

		CompteASeuil seuilCpt = new CompteASeuil(1000);
		System.out.println(seuilCpt.retirer(100));
		System.out.println(seuilCpt.retirer(2000));
	}

}
