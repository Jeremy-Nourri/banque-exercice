package Banque;

public class Operation {
    int numeroOperation;
    double montant;
    Statut statut;

    public Operation(int numeroOperation, double montant, Statut statut) {
        this.numeroOperation = numeroOperation;
        this.montant = montant;
        this.statut = statut;
    }
}
