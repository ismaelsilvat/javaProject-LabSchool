package br.com.avaliativeProject.Models;

public class Professor extends Pessoa{
    private String formacao;
    private String experiencia;
    private String estado;
    public Professor(String nome, String telefone, String dtNascimento, String CPF, String formacao, String experiencia, boolean estado) {
        super(nome, telefone, dtNascimento, CPF);
        this.formacao = formacao;
        this.experiencia = experiencia;
        if(estado == true){this.estado = "Ativo";}
        else{this.estado = "Inativo";}
        setInstances(this);
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
