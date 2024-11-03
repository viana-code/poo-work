/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */
import elementos.Disciplina;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

import usuarios.Aluno;
import usuarios.Professor;

public class Turma {
    private String id;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aula> aulas;
    private ArrayList<Prova> provas;
    private ArrayList<Trabalho> trabalhos;
    private Chat chatGeral;
   
    private static ArrayList<Turma> turmas = new ArrayList<>();

    // Construtor
    public Turma(String id, ArrayList<Aluno> alunos, Professor professor, Disciplina disciplina,
                 ArrayList<Aula> aulas, ArrayList<Prova> provas, ArrayList<Trabalho> trabalhos, Chat chatGeral
         ) {
        this.id = id;
        this.alunos = alunos;
        this.professor = professor;
        this.disciplina = disciplina;
        this.aulas = aulas;
        this.provas = provas;
        this.trabalhos = trabalhos;
        this.chatGeral = chatGeral;
        
    }
    public Turma(String id, ArrayList<Aluno> alunos, Professor professor, Disciplina disciplina,
            ArrayList<Aula> aulas, ArrayList<Prova> provas, ArrayList<Trabalho> trabalhos) {
    	this.id = id;
    	this.alunos = alunos;
    	this.professor = professor;
    	this.disciplina = disciplina;
    	this.aulas = aulas;
    	this.provas = provas;
    	this.trabalhos = trabalhos;
}
    public Turma(String id,Professor professor){
        this.id = id;
        this.professor = professor;
    }
    

    

    public Turma() {
        
    }
	// Métodos Getters e Setters
    public static ArrayList<Turma> getTurmas() {
    return turmas; 
}
    public static void setTurmas(ArrayList<Turma> turmas) {
    Turma.turmas = turmas; // Define uma nova lista de turmas
}
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
   public void cadastrarAluno(Aluno aluno) {
       if (alunos == null) {
        alunos = new ArrayList<>(); 
    }
        
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " cadastrado na turma " + this.id);
    }
  

    public static void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public static Turma obterTurma(String id) {
        for (Turma turma : turmas) {
            if (turma.getId().equals(id)) {
                return turma; 
            }
        }
        return null; 
    }
   public void cadastrarAula(String data, String tema, String materialTeorico, String exercicio, Disciplina disciplina) {
    
    Aula novaAula = new Aula(data, tema, disciplina, new ArrayList<>(), new ArrayList<>(), materialTeorico, exercicio);
    
    
    aulas.add(novaAula);
    JOptionPane.showMessageDialog(null, "Aula cadastrada: " + tema + " em " + data);
}
   
     public static void cadastrarTurma(Turma turma) {
    
    Turma.getTurmas().add(turma); 
    
    JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso: " + turma.getId());
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


