/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author vacin
 */
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import elementos.Turma;
import elementos.Disciplina;
import java.util.Scanner;
public class Aluno extends Pessoa {
    private double cra;  
    private Map<Disciplina, Integer> notasDisciplinas;
    private int faltas;
    private double nota;
    private ArrayList<Turma> turmas;
    // Construtor
    public Aluno(String id, String nome, int idade, String sexo, String email, double nota, int faltas) {
        super(id, nome, idade, sexo, email); // Chama o construtor da classe super
        this.nota = nota;
        this.faltas = faltas;
        this.notasDisciplinas = new HashMap<>(); 
    }
    
    public Aluno(String id, String nome) {
    	super(id,nome);
        this.turmas = new ArrayList<>();
    }

    Aluno() {
        
    }
    


    // Métodos Getters e Setters
    public double getCra() {
        return cra;
    }


    public void setCra(double cra) {
        this.cra = cra;
    }
    public int getFaltas() {
        return faltas;
    }
    public void adicionarFalta() {
        this.faltas++;
    }


    public Map<Disciplina, Integer> getNotasDisciplinas() {
        return notasDisciplinas;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setNotasDisciplinas(Map<Disciplina, Integer> notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    
    
   
    public static void cadastrarAluno(String id, String nome){
        
    }
    
    
}
