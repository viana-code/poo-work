package com.mycompany.appgestao;

import java.util.Scanner;  // Para entrada de dados (input)
import java.io.*;          // Para manipulação de arquivos (input e output)
import java.util.ArrayList; // Para uso de vetores dinâmicos (ArrayList)
import java.util.Map;


import usuarios.Aluno;
import usuarios.Professor;
import elementos.Disciplina;
import elementos.Turma;


/**
 *
 * @author vacin
 */
public class AppGestao {

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Disciplina> disciplinasCadastradas = new ArrayList<>();
        ArrayList<Aluno> alunosCadastrados = new ArrayList<>();
        ArrayList<Professor> professoresCadastrados = new ArrayList<>();
        ArrayList<Turma> turmasCadastradas = new ArrayList<>();
        
 
        
        while(true){
            
        System.out.println("1- Exibir Alunos Cadastrados\n");
        System.out.println("2- Exibir Professores Cadastrados\n");
        System.out.println("3- Exibir Todas As Turmas Cadastradas\n");
        System.out.println("--------------------------------------\n");
        System.out.println("4- Cadastrar Aluno\n");
        System.out.println("5- Cadastrar Professor\n");
        System.out.println("-----------------------------------------\n");
        System.out.println("6- Exibir Opções de Aluno\n");
        System.out.println("7- Exibir Opções de Professor\n");
        System.out.println("---------------------------------------\n");
        System.out.println("0- Sair\n"); 
        
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
        case 1:
        	System.out.println("Alunos cadastrados:");
            if (alunosCadastrados.isEmpty()) {
                System.out.println("Nenhum aluno cadastrado.");
            } else {
                for (Aluno aluno : alunosCadastrados) {
                    System.out.println("ID: " + aluno.getId() + " Nome: " + aluno.getNome());
                }
            break;
            }
        case 2:
        	System.out.println("Professores cadastrados:");
            if (professoresCadastrados.isEmpty()) {
                System.out.println("Nenhum professor cadastrado.");
            } else {
                for (Professor professor : professoresCadastrados) {
                    System.out.println("ID: " + professor.getId() + 
                                       " Nome: " + professor.getNome() + 
                                       " Idade: " + professor.getIdade() + 
                                       " Sexo: " + professor.getSexo() + 
                                       " Email: " + professor.getEmail());

                    
                    if (professor.getDisciplinas().isEmpty()) {
                        System.out.println("  O professor não ministra nenhuma disciplina.");
                    } else {
                        System.out.println("  Disciplinas ministradas:");
                        for (Disciplina disciplina : professor.getDisciplinas()) {
                            System.out.println("    - " + disciplina.getNome());
                        }
                    }
                }
            }
            break;
            
        case 3:
        	System.out.println("Turmas cadastradas:");
            if (turmasCadastradas.isEmpty()) {
                System.out.println("Nenhuma turma cadastrada.");
            } else {
                for (Turma turma : turmasCadastradas) {
                    System.out.println("Id da Turma: " + turma.getId());
                    System.out.println("N de Alunos: " + turma.getAlunos().size());
                    System.out.println("Professor: " + turma.getProfessor().getNome());
                    
                }
            }
            break;
           
        case 4:
        	
            System.out.print("Digite o ID do aluno: ");
            int idAluno = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idadeAluno = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o sexo do aluno (M/F): ");
            char sexoAluno = scanner.nextLine().charAt(0);
            System.out.print("Digite o e-mail do aluno: ");
            String emailAluno = scanner.nextLine();
            
            Aluno novoAluno = new Aluno(idAluno, nomeAluno, idadeAluno, sexoAluno, emailAluno, 0.0, 0);
            alunosCadastrados.add(novoAluno);
            System.out.println("Aluno cadastrado com sucesso!");
            break;
            

        case 5:
        	System.out.print("Digite o ID do professor: ");
            int idProfessor = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            System.out.print("Digite o nome do professor: ");
            String nomeProfessor = scanner.nextLine();
            System.out.print("Digite a idade do professor: ");
            int idadeProfessor = scanner.nextInt();
            scanner.nextLine(); //limpar vbuffer
            System.out.print("Digite o sexo do professor (M/F): ");
            char sexoProfessor = scanner.nextLine().charAt(0);
            System.out.print("Digite o e-mail do professor: ");
            String emailProfessor = scanner.nextLine();

            
            Professor novoProfessor = new Professor(idProfessor, nomeProfessor, idadeProfessor, sexoProfessor, emailProfessor);

            System.out.println("Digite as disciplinas que o professor ministra (digite 0 para encerrar):");
            while (true) {
                System.out.print("Nome da disciplina: ");
                String nomeDisciplina = scanner.nextLine();

                if (nomeDisciplina.equals("0")) {//coloquei .equals pq por algum motivo if nomeDisciplinas == "0" tava dando erro
                    break; 
                }

                System.out.print("Carga horária da disciplina: ");
                int cargaHoraria = scanner.nextInt();
                scanner.nextLine(); //limpar buffer

                
                Disciplina novaDisciplina = new Disciplina(nomeDisciplina, cargaHoraria);
                novoProfessor.adicionarDisciplina(novaDisciplina);
                System.out.println("Disciplina " + nomeDisciplina + " adicionada com carga horaria de " + cargaHoraria + ".");
            }

            
            professoresCadastrados.add(novoProfessor);
            System.out.println("Professor cadastrado com sucesso!");
            break;
            
            
        case 6:
        	System.out.println("Selecione uma opção:");
        	System.out.println("1 - Ver Notas");
        	System.out.println("2 - Ver CRA");
        	System.out.println("3 - Ver Faltas");
        	System.out.println("0 - Voltar");

        	int opcaoAluno = scanner.nextInt();
        	scanner.nextLine(); // Limpar buffer

        	switch (opcaoAluno) {
        	    case 1: // Ver Notas
        	        System.out.print("Digite o ID do aluno: ");
        	        int idVerNotas = scanner.nextInt();
        	        Aluno alunoNotas = Aluno.encontrarAlunoPorId(alunosCadastrados, idVerNotas);
        	        if (alunoNotas != null) {
        	            alunoNotas.verNota(); 
        	        } else {
        	            System.out.println("Aluno não encontrado.");
        	        }
        	        break;
        	    case 2: // Ver CRA
        	        System.out.print("Digite o ID do aluno: ");
        	        int idVerCRA = scanner.nextInt();
        	        Aluno alunoCRA = Aluno.encontrarAlunoPorId(alunosCadastrados, idVerCRA);
        	        if (alunoCRA != null) {
        	            System.out.println("CRA do aluno " + alunoCRA.getNome() + ": " + alunoCRA.calculoCra(alunoCRA.getNotasDisciplinas())); // Passando as notas para calcular o CRA
        	        } else {
        	            System.out.println("Aluno não encontrado.");
        	        }
        	        break;
        	    case 3: // Ver Faltas
        	        System.out.print("Digite o ID do aluno: ");
        	        int idVerFaltas = scanner.nextInt();
        	        Aluno alunoFaltas = Aluno.encontrarAlunoPorId(alunosCadastrados, idVerFaltas);
        	        if (alunoFaltas != null) {
        	            System.out.println("Faltas do aluno " + alunoFaltas.getNome() + ": " + alunoFaltas.getFaltas()); // Certifique-se de que getFaltas() existe na classe Aluno
        	        } else {
        	            System.out.println("Aluno não encontrado.");
        	        }
        	        break;
        	    case 0:
        	        break; 
        	    default:
        	        System.out.println("Tente novamente opção invalida.");
        	        break;
        	}
            
        case 7:
        	System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar turma");
            System.out.println("2 - Dar nota de prova/trabalho");
            System.out.println("3 - Marcar aula");
            System.out.println("4 - Lista de presenca");
            System.out.println("0 - Voltar");

            int opcaoProfessor = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            switch(opcaoProfessor){
            case 1:
            	System.out.println("Informe o nome do professor para cadastrar a turma:");
                String nomedoProfessor = scanner.nextLine();

                // Buscar professor na lista de professores cadastrados
                Professor professorEscolhido = null;
                for (Professor professor : professoresCadastrados) {
                    if (professor.getNome().equalsIgnoreCase(nomedoProfessor)) {
                        professorEscolhido = professor;
                        break;
                    }
                }

                if (professorEscolhido == null) {
                    System.out.println("Professor não encontrado. Operação cancelada.");
                    break;
                }

                // Informar o ID da turma
                System.out.print("Informe o ID da turma: ");
                int idTurma = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                // Adicionar alunos à turma
                ArrayList<Aluno> alunos = new ArrayList<>();
                System.out.print("Quantos alunos deseja adicionar à turma? ");
                int numAlunos = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                for (int i = 0; i < numAlunos; i++) {
                    System.out.print("Informe o ID do aluno " + (i + 1) + ": ");
                    int idAlunoTurma = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer

                    Aluno aluno = Aluno.encontrarAlunoPorId(alunosCadastrados, idAlunoTurma);
                    if (aluno != null) {
                      alunos.add(aluno);
                    } else {
                        System.out.println("Aluno com ID " + idAlunoTurma + " não encontrado.");
                    }
                }

                // Informar a disciplina
                System.out.print("Informe o nome da disciplina: ");
                String nomeDisciplina = scanner.nextLine();
                System.out.print("Informe a carga horária da disciplina: ");
                int cargaHoraria = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHoraria);
                
                // Criar e cadastrar a turma
                Turma novaTurma = new Turma(idTurma, alunos, disciplina, professorEscolhido);
                turmasCadastradas.add(novaTurma);
                System.out.println("Turma cadastrada com sucesso!");
                break;
            
            
        case 0:
            
            return;
        default:
            System.out.println("Opção inválida! Tente novamente.");
            break;
    }
}
        
        
        
        
    
}
    }
}
