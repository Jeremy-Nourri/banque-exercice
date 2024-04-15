package Banque;

import java.util.List;

public class CompteEpargne extends CompteBancaire {
    public CompteEpargne(double solde, Client client, List<Operation> operations) {
        super(solde, client, operations);
    }
}
