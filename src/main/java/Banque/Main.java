package Banque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter le prénom du client ");
        String prenom = scanner.nextLine();
        System.out.println("Enter le nom du client ");
        String nom = scanner.nextLine();
        System.out.println("Enter le numéro de téléphone du client ");
        int telephone = scanner.nextInt();

        Client client = new Client(nom, prenom, telephone, null);

        System.out.println("============================");
        System.out.println("====== Menu Principal ======");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Créer un compte");
        System.out.println("3. Effectuer un dépôt");
        System.out.println("4. Effectuer un retrait");
        System.out.println("5. Afficher les transactions et le solde");
        System.out.println("6. Quitter");

        int choixUtilisateur = scanner.nextInt();

        switch (choixUtilisateur) {
            case 1:
                client.afficherListeDeCompte();
                break;
            case 2:
                   System.out.println("============================");
                System.out.println("====== Créer un compte ======");
                System.out.println("1. Compte courant");
                System.out.println("2. Compte d'épargne");
                System.out.println("3. Compte payant");
                int accountChoice = scanner.nextInt();
                switch (accountChoice) {
                    case 1:
                        CompteBancaire compteCourant = new CompteCourant(0, client, null);
                        break;
                    case 2:
                        CompteBancaire compteEpargne = new CompteEpargne(0, client, null);
                        break;
                    case 3:
                        CompteBancaire comptePayant = new ComptePayant(0, client, null);
                        break;
            default:
                System.out.println("Choix invalide");
                break;
        }
//                break;
//            case 3:
//                System.out.println("============================");
//                System.out.println("====== Effectuer un dépôt ======");
//                System.out.println("1. Compte courant");
//                System.out.println("2. Compte d'épargne");
//                System.out.println("3. Compte payant");
//
//                break;
    }

}