package br.com.avaliativeProject.Models;

public class Aluno extends Pessoa{
    private String condicao;

    private double nota;

    private int totalAtdPedagogicos = 0;

    public Aluno(String nome, String telefone, String dtNascimento, String CPF, String condicao, double nota) {
        super(nome, telefone, dtNascimento, CPF);
        this.condicao = condicao;
        this.nota = nota;
        setInstances(this);
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
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
                "condicao='" + condicao + '\'' +
                ", nota=" + nota +
                ", totalAtdPedagogicos=" + totalAtdPedagogicos +
                '}';
    }
}
