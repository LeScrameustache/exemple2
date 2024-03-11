package eu.fr.mulesoft.gestion.serveur;

import javax.xml.ws.Endpoint;

import eu.fr.mulesoft.gestion.entity.Utilisateur;
import eu.fr.mulesoft.gestion.service.impl.UtilisateurServiceImpl;

public class Serveur {
	public static void main(String[] args) {
		UtilisateurServiceImpl userService = new UtilisateurServiceImpl();
		Utilisateur user4 = new Utilisateur("0004","Bowie","David");
		userService.creerUtilisateur(user4);
		System.out.println("Utilisateur : " + userService.listerUtilisateur());
		Endpoint.publish("http://127.0.0.1:8888/users", userService);
	}
}
