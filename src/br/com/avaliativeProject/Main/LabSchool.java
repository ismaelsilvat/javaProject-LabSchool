package  br.com.avaliativeProject.Main;

import br.com.avaliativeProject.Models.*;

import java.util.Scanner;

import static br.com.avaliativeProject.Models.Pessoa.*;

public class LabSchool {
    public static void main(String[] args) {

//      Sout de Boas vindas
        System.out.println("\n\nBem-vindo ao sistema do Lab School!\n");

//      Instanciando Scanner
        Scanner out = new Scanner(System.in);

//      Cadastros default para interação do usuário ser mais completa
        Aluno aluno1 = new Aluno("Ismael", "(48)991891499", "02/04/2004", "123456789-01", "Ativo", 10);
        Aluno aluno2 = new Aluno("Igor", "(00)000000000", "00/00/0000", "987654321-01", "Irregular", 5);
        aluno2.setTotalAtdPedagogicos();
        aluno2.setTotalAtdPedagogicos();
        Professor professor1 = new Professor("Joao", "(00)000000000", "00/00/0000", "543216789-01", "Mestrado", "Full-Stack", true);
        Professor professor2 = new Professor("Guido", "(00)000000000", "00/00/0000", "321456789-01", "Mestrado", "Full-Stack", true);
        Pedagogo pedagoga = new Pedagogo("Patricia", "(00)000000000", "00/00/0000", "543214545-01");
        pedagoga.setTotalAtdPedagogicos();
        pedagoga.setTotalAtdPedagogicos();

//      Variáveis(name class) para condicionamento do retorno de pessoas cadastradas, conforme a escolha do usuário
        String alunoClass = "br.com.avaliativeProject.Models.Aluno";
        String professorClass = "br.com.avaliativeProject.Models.Professor";
        String pedagogoClass = "br.com.avaliativeProject.Models.Pedagogo";

//      Interação com o usuário
        int menuLevel = 0;
        while(menuLevel != 7){
            if(menuLevel == 0){
                System.out.println(
                        "1. Realizar atendimento pedagogico\n" +
                                "2. Listar todas as pessoas cadastradas\n" +
                                "3. Relatorio dos Alunos.\n" +
                                "4. Relatorio dos Professores.\n" +
                                "5. Aluno com mais atendimentos pedagogicos\n" +
                                "6. Pedagogo com mais atendimentos pedagogicos\n" +
                                "7. Sair");
                menuLevel = out.nextInt();
            }
            else if (menuLevel == 1){
                getStudents("Todos");
                System.out.println("\nDigite o codigo do estudante que participara do atendimento pedagogico:");
                int studentId = out.nextInt();
                getPedagogics();
                System.out.println("\nDigite o codigo do pedagogo(a) que participara do atendimento pedagogico:");
                int pedagogicId = out.nextInt();
                attendPedagogic(studentId, pedagogicId);
                menuLevel = 0;
            }
            else if (menuLevel == 2) {
                System.out.println(
                        "\n\n\nListar todas as pessoas cadastradas. O usuario devera informar quais categorias de " +
                                "pessoas deseja listar (deve-se listar Codigo, Nome e CPF):\n" +
                        "1. Alunos\n" +
                        "2. Professores\n" +
                        "3. Pedagogos\n" +
                        "4. Todos\n");
                System.out.println("Digite o numero conforme o que desejar listar:");
                int schoose = out.nextInt();
                if(schoose == 1){
                    getInstances(alunoClass);
                    System.out.println("\n1. Sair");
                    int exit = out.nextInt();
                    if(exit == 1){
                        menuLevel = 0;
                    }
                }
                else if(schoose == 2){
                    getInstances(professorClass);
                    System.out.println("\n1. Sair");
                    int exit = out.nextInt();
                    if(exit == 1){
                        menuLevel = 0;
                    }
                }
                else if(schoose == 3){
                    getInstances(pedagogoClass);
                    System.out.println("\n1. Sair");
                    int exit = out.nextInt();
                    if(exit == 1){
                        menuLevel = 0;
                    }
                }
                else{
                    getInstances("todos");
                    System.out.println("\n1. Sair");
                    int exit = out.nextInt();
                    if(exit == 1){
                        menuLevel = 0;
                    }
                }
            }
            else if (menuLevel == 3) {
                System.out.println(
                        "\n\n\n1. Ativo\n" +
                        "2. Irregular\n" +
                        "3. Atendimento pedagogico\n" +
                        "4. Inativo\n" +
                        "5. Todos\n" +
                        "6. Sair"
                );
                int condicao = out.nextInt();
                switch (condicao) {
                    case 1:
                        getStudents("Ativo");
                        System.out.println("\n1. Sair");
                        break;
                    case 2:
                        getStudents("Irregular");
                        System.out.println("\n1. Sair");
                        break;
                    case 3:
                        getStudents("Atendimento pedagogico");
                        System.out.println("\n1. Sair");
                        break;
                    case 4:
                        getStudents("Inativo");
                        System.out.println("\n1. Sair");
                        break;
                    case 5:
                        getStudents("Todos");
                        System.out.println("\n1. Sair");
                        break;
                    case 6:
                        menuLevel = 0;
                        break;
                }
                int schoose = out.nextInt();
                if(schoose == 1){
                    menuLevel = 0;
                }
            }
            else if (menuLevel == 4) {
                System.out.println(
                        "\n\n\n1. Front-End\n" +
                                "2. Back-End\n" +
                                "3. Full-Stack\n" +
                                "4. Todos\n" +
                                "5. Sair"
                );
                int condicao = out.nextInt();
                switch (condicao) {
                    case 1:
                        getTeachers("Front-End");
                        System.out.println("\n1. Sair");
                        break;
                    case 2:
                        getTeachers("Back-End");
                        System.out.println("\n1. Sair");
                        break;
                    case 3:
                        getTeachers("Full-Stack");
                        System.out.println("\n1. Sair");
                        break;
                    case 4:
                        getTeachers("Todos");
                        System.out.println("\n1. Sair");
                        break;
                    case 5:
                        menuLevel = 1;
                        break;
                }
                int schoose = out.nextInt();
                if(schoose == 1){
                    menuLevel = 0;
                }
            }
            else if(menuLevel == 5){
                getHigherAttended();
                System.out.println("\n1. Sair");
                int schoose = out.nextInt();
                if(schoose == 1){
                    menuLevel = 0;
                }
            }
            else if(menuLevel == 6){
                getHigherAttendedPedagogo();
                System.out.println("\n1. Sair");
                int schoose = out.nextInt();
                if(schoose == 1){
                    menuLevel = 0;
                }
            }

        }
    }
}