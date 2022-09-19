package br.com.avaliativeProject.Models;

public class Pedagogo extends Pessoa{
    private int totalAtdPedagogicos = 0;

    public Pedagogo(String nome, String telefone, String dtNascimento, String CPF) {
        super(nome, telefone, dtNascimento, CPF);
        setInstances(this);
    }

    public int getTotalAtdPedagogicos() {
        return totalAtdPedagogicos;
    }

    public void setTotalAtdPedagogicos() {
        this.totalAtdPedagogicos++;
    }

    @Override
    public String toString() {
        return super.toString() +
                "totalAtdPedagogicos=" + totalAtdPedagogicos;
    }
}
