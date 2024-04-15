package Banque;

import java.util.List;

public class ComptePayant extends CompteBancaire {
    public ComptePayant(double solde, Client client, List<Operation> operations) {
        super(solde, client, operations);
    }
}
