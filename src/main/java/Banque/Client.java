package Banque;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
//    private int identifiant;
    private int numeroTelephone;

    protected List<CompteBancaire> listeDesComptes;

    public Client(String nom, String prenom, int numeroTelephone, List<CompteBancaire> listeDesComptes) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.listeDesComptes = listeDesComptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void afficherListeDeCompte() {
        System.out.println("Liste des comptes de " + nom + " " + prenom + ":");
        for (CompteBancaire compte : listeDesComptes) {
            System.out.println(compte);
        }
    }
}
