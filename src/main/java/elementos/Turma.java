/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */
import java.util.ArrayList;
import java.util.Map;

import usuarios.Aluno;
import usuarios.Professor;

public class Turma {
    private int id;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aula> aulas;
    private ArrayList<Prova> provas;
    private ArrayList<Trabalho> trabalhos;
    private Chat chatGeral;

    // Construtor
    public Turma(int id, ArrayList<Aluno> alunos, Professor professor, Disciplina disciplina,
                 ArrayList<Aula> aulas, ArrayList<Prova> provas, ArrayList<Trabalho> trabalhos, Chat chatGeral) {
        this.id = id;
        this.alunos = alunos;
        this.professor = professor;
        this.disciplina = disciplina;
        this.aulas = aulas;
        this.provas = provas;
        this.trabalhos = trabalhos;
        this.chatGeral = chatGeral;
    }
    public Turma(int id, ArrayList<Aluno> alunos, Professor professor, Disciplina disciplina,
            ArrayList<Aula> aulas, ArrayList<Prova> provas, ArrayList<Trabalho> trabalhos) {
    	this.id = id;
    	this.alunos = alunos;
    	this.professor = professor;
    	this.disciplina = disciplina;
    	this.aulas = aulas;
    	this.provas = provas;
    	this.trabalhos = trabalhos;
}
    

    public Turma(int id, ArrayList<Aluno> alunos, Disciplina disciplina, Professor professor) {
		this.id = id;
		this.alunos = alunos;
		this.disciplina = disciplina;
		this.professor = professor;
		
	}
	// Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public ArrayList<Prova> getProvas() {
        return provas;
    }

    public void setProvas(ArrayList<Prova> provas) {
        this.provas = provas;
    }

    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public Chat getChat() {
        return chatGeral;
    }

    public void setChat(Chat chatGeral) {
        this.chatGeral = chatGeral;
    }
    public void cadastrarAlunoNaTurma(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " cadastrado na turma " + id);
        } else {
            System.out.println("Aluno " + aluno.getNome() + " já está cadastrado na turma " + id);
        }
    }

    
    @Override
    public String toString() {
        return "Turma ID: " + id +
               "\nProfessor: " + (professor != null ? professor.getNome() : "Nenhum") +
               "\nDisciplina: " + (disciplina != null ? disciplina.getNome() : "Nenhuma") +
               "\nNúmero de Alunos: " + alunos.size() +
               "\nAulas: " + aulas.size() +
               "\nProvas: " + provas.size() +
               "\nTrabalhos: " + trabalhos.size();
    }
}


