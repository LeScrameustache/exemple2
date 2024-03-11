package eu.fr.mulesoft.gestion.service.impl;

import java.util.ArrayList;
import java.util.List;

import eu.fr.mulesoft.gestion.entity.Utilisateur;
import eu.fr.mulesoft.gestion.service.IUtilisateurService;

public class UtilisateurServiceImpl implements IUtilisateurService {
	
	private List<Utilisateur> utilisateur = new ArrayList<Utilisateur>();
	
	public UtilisateurServiceImpl() {
		Utilisateur user1 = new Utilisateur();
	}
	@Override
	public Utilisateur creerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur rechercherUtilisateurParMatricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> listerUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

}
