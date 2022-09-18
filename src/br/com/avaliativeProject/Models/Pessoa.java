package br.com.avaliativeProject.Models;

import java.util.*;

public abstract class Pessoa {

    public static List<Object> instances = new ArrayList();

    public static String getInstances(String condicao) {
        int i;
        if(condicao == "todos"){
            for (i = 0; i < instances.size(); i++) {
                if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Aluno") {
                    Aluno aluno = ((Aluno) instances.get(i));
                    System.out.println("Aluno:\n" +
                            "Codigo: " + aluno.getId() +
                            " Nome: " + aluno.getNome() +
                            " CPF: " + aluno.getCPF() +
                            "\n");
                } else if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Professor") {
                    Professor professor = ((Professor) instances.get(i));
                    System.out.println("Professor:\n" +
                            "Codigo: " + professor.getId() +
                            " Nome: " + professor.getNome() +
                            " CPF: " + professor.getCPF() +
                            "\n");
                } else if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Pedagogo") {
                    Pedagogo pedagogo = ((Pedagogo) instances.get(i));
                    System.out.println("Pedagogo:\n" +
                            "Codigo: " + pedagogo.getId() +
                            " Nome: " + pedagogo.getNome() +
                            " CPF: " + pedagogo.getCPF() +
                            "\n");
                }
            }
        }
        else{
            for (i = 0; i < instances.size(); i++) {
                if (instances.get(i).getClass().getName() == condicao && condicao == "br.com.avaliativeProject.Models.Aluno") {
                    Aluno aluno = ((Aluno) instances.get(i));
                    System.out.println("Aluno:\n" +
                            "Codigo: " + aluno.getId() +
                            " Nome: " + aluno.getNome() +
                            " CPF: " + aluno.getCPF() +
                            "\n");
                } else if (instances.get(i).getClass().getName() == condicao && condicao == "br.com.avaliativeProject.Models.Professor") {
                    Professor professor = ((Professor) instances.get(i));
                    System.out.println("Professor:\n" +
                            "Codigo: " + professor.getId() +
                            " Nome: " + professor.getNome() +
                            " CPF: " + professor.getCPF() +
                            "\n");
                } else if (instances.get(i).getClass().getName() == condicao && condicao == "br.com.avaliativeProject.Models.Pedagogo") {
                    Pedagogo pedagogo = ((Pedagogo) instances.get(i));
                    System.out.println("Pedagogo:\n" +
                            "Codigo: " + pedagogo.getId() +
                            " Nome: " + pedagogo.getNome() +
                            " CPF: " + pedagogo.getCPF() +
                            "\n");
                }
            }
        }

        return "";
    }

    public static void getStudents(String condicao){
        int i;
        for (i = 0; i < instances.size(); i++) {
            if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Aluno") {
                Aluno aluno = ((Aluno) instances.get(i));
                if(condicao == "Todos" ){
                    System.out.println(
                            "\nCodigo: " + aluno.getId() +
                                    "\nNome: " + aluno.getNome() +
                                    "\nNota: " + aluno.getNota() +
                                    "\nTotal de atendimentos pedagogicos: " + aluno.getTotalAtdPedagogicos());
                }
                else{
                    if(aluno.getCondicao() == condicao ){
                        System.out.println(
                                "\nCodigo: " + aluno.getId() +
                                        "\nNome: " + aluno.getNome() +
                                        "\nNota: " + aluno.getNota() +
                                        "\nTotal de atendimentos pedagogicos: " + aluno.getTotalAtdPedagogicos());
                    }
                }
            }
        }
    }

    public static void getTeachers(String condicao){
        int i;
        for (i = 0; i < instances.size(); i++) {
            if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Professor") {
                Professor professor = ((Professor) instances.get(i));
                if(condicao == "Todos" ){
                    System.out.println(
                            "\nCodigo: " + professor.getId() +
                                    "\nNome: " + professor.getNome() +
                                    "\nEstado: " + professor.getEstado());
                }
                else{
                    if(professor.getExperiencia() == condicao ){
                        System.out.println(
                                "\nCodigo: " + professor.getId() +
                                        "\nNome: " + professor.getNome() +
                                        "\nEstado: " + professor.getEstado());
                    }
                }
            }
        }
    }

    public static void getHigherAttended(){
        int i;
        int maior = 0;
        int position = 0;
        for (i = 0; i < instances.size(); i++) {
            if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Aluno") {
                Aluno aluno = ((Aluno) instances.get(i));
                if(aluno.getTotalAtdPedagogicos() > maior){
                    position = i;
                    maior = aluno.getTotalAtdPedagogicos();
                }
            }
            if(i + 1 == instances.size()){
                Aluno aluno = ((Aluno) instances.get(position));
                System.out.println(
                        "Codigo:" + aluno.getId() +
                                "\nNome: " + aluno.getNome() +
                                "\nNota: " + aluno.getNota() +
                                "\nTotal de atendimentos pedagogicos: " + aluno.getTotalAtdPedagogicos());
            }
        }
    }

    public static void getHigherAttendedPedagogo(){
        int i;
        int maior = 0;
        int position = 0;
        for (i = 0; i < instances.size(); i++) {
            if (instances.get(i).getClass().getName() == "br.com.avaliativeProject.Models.Pedagogo") {
                Pedagogo pedagogo = ((Pedagogo) instances.get(i));
                if(pedagogo.getTotalAtdPedagogicos() > maior) {
                    position = i;
                    maior = pedagogo.getTotalAtdPedagogicos();
                }
            }
            if(i + 1 == instances.size()){
                Pedagogo pedagogo = ((Pedagogo) instances.get(position));
                System.out.println(
                        "\nCodigo: " + pedagogo.getId() +
                                "\nNome: " + pedagogo.getNome() +
                                "\nTotal de atendimentos pedagogicos: " + pedagogo.getTotalAtdPedagogicos());
            }
        }
    }


    private String nome;
    private String telefone;
    private String dtNascimento;
    private String CPF;
    private int id;

    public Pessoa(String nome, String telefone, String dtNascimento, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.dtNascimento = dtNascimento;
        this.CPF = CPF;
        this.id = instances.size() + 1;
    }

    public static void setInstances(Object e) {
        instances.add(e);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", CPF=" + CPF +
                ", id=" + id +
                '}';
    }
}
