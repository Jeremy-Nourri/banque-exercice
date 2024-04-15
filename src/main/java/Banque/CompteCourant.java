package Banque;

import java.util.List;

public class CompteCourant extends CompteBancaire {

    public CompteCourant(double solde, Client client, List<Operation> operations) {
        super(solde, client, operations);
    }
}
