/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author vacin
 */
import java.util.ArrayList;
import java.util.Map;
import elementos.Aula;
import elementos.Disciplina;
import elementos.Turma;
import elementos.Feedback;
import elementos.Chat;
public class Professor extends Pessoa {
    private ArrayList<Turma> turmas;
    private ArrayList<Feedback> feedback;
    private ArrayList<Disciplina> disciplinasMinistradas;

    // Construtor
    public Professor(int id, String nome, int idade, char sexo, String email, 
                     ArrayList<Turma> turmas, ArrayList<Feedback> feedback, ArrayList<Disciplina> disciplinasMinistradas) {
        super(id, nome, idade, sexo, email);  // Chama o construtor da superclasse (Pessoa)
        this.turmas = turmas;
        this.feedback = feedback;
        this.disciplinasMinistradas = disciplinasMinistradas;
        
    }
    public Professor(int id, String nome, int idade, char sexo, String email) {
        super(id, nome, idade, sexo, email);
        this.turmas = new ArrayList<>();
        this.feedback = new ArrayList<>();
        this.disciplinasMinistradas = new ArrayList<>();
    }

    // Métodos Getters e Setters
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<Feedback> feedback) {
        this.feedback = feedback;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinasMinistradas = disciplinas;
    }
   
   
    public void cadastrarTurma(int idTurma, ArrayList<Aluno> alunos, Disciplina disciplina) {
        
        Chat novoChat = new Chat();//nao lembro como seria o chat entao criei aqui um chat pra turma qualquer coisa so remover;
        Turma novaTurma = new Turma(idTurma, alunos, this, disciplina, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), novoChat);
        
        turmas.add(novaTurma);
        
        System.out.println("Turma cadastrada com sucesso");
    }
    public void adicionarConteudoAula(Turma turma, Aula aula) {
        turma.getAulas().add(aula); // Adiciona a aula a ser ministrada na turma
        System.out.println("Conteúdo da aula adicionado a turma " + turma.getId());
    }
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " adicionada ao professor " + getNome());
    }

    // para testar
    public void exibirDisciplinas() {
        if (disciplinasMinistradas.isEmpty()) {
            System.out.println("O professor " + getNome() + " nao ministra nenhuma disciplna.");
        } else {
            System.out.println("Disciplinas ministradas pelo professor " + getNome() + ":");
            for (Disciplina disciplina : disciplinasMinistradas) {
                System.out.println(" " + disciplina.getNome());
            }
        }
        
    }
   
    
    
  
    
}