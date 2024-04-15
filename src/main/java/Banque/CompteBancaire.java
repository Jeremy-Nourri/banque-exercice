package Banque;

import java.util.List;

public abstract class CompteBancaire {
    private double solde;
    private Client client;
    private List<Operation> operations;


    public CompteBancaire(double solde, Client client, List<Operation> operations) {
        this.solde = solde;
        this.client = client;
        this.operations = operations;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "CompteBancaire{" +
                "solde=" + solde +
                ", client='" + client.getNom() + '\'' +
                ", operations=" + operations +
                '}';
    }
}

