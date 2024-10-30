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
    public Aluno(int id, String nome, int idade, char sexo, String email, double nota, int faltas) {
        super(id, nome, idade, sexo, email); // Chama o construtor da classe super
        this.nota = nota;
        this.faltas = faltas;
        this.notasDisciplinas = new HashMap<>(); 
    }
    public Aluno() {
        super(0, "", 0, ' ', ""); // Iniciando como "0's";
        this.cra = 0.0;
        this.notasDisciplinas = new HashMap<>();
    }
    public Aluno(int id, String nome) {
    	super(id,nome);
        this.turmas = new ArrayList<>();
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
    public double calculoCra(Map<Disciplina, Integer>notasDisciplinas){
    	double calculonotas = 0.0;
    	
    	
    	
    	for(Map.Entry<Disciplina,Integer>entry: notasDisciplinas.entrySet()) {
    		Disciplina disciplina = entry.getKey();
    		int notas = entry.getValue();
    		calculonotas +=notas;
    	}
    	int nDisciplinas = notasDisciplinas.size();
    	if(nDisciplinas>0) {
    		return calculonotas/nDisciplinas;
    	}else {
    		return 0.0;
    	}
    }
    
   
    public void verNota() {
    	Scanner leituraDisciplina = new Scanner(System.in);
    	try {
    		boolean encontrada = false;
    	
        	System.out.println("Digite o nome da disciplina: ");
        	String disciplina = leituraDisciplina.nextLine().trim();
        	for(Map.Entry<Disciplina, Integer> entry : notasDisciplinas.entrySet()) {
        		Disciplina disciplinaNome = entry.getKey();
        		if(disciplinaNome.getNome().equalsIgnoreCase(disciplina)) {//ignorar letras maiusculas e minusculas
        			int nota = entry.getValue();
        			System.out.println("Sua nota : " + nota);
        			encontrada = true;
        			break;
        		}
        		
        	
        		
        	}
        	if(!encontrada) {
        		System.out.println("Disciplina nao encontrada");
        		
        	}
        	
    	} catch (NullPointerException e) {
    		System.out.println("Notas nao encontradas");
    	} catch(Exception e) {
    		System.out.println("Erro " + e.getMessage());
    	} finally {
    		leituraDisciplina.close();
    	}
    }
    public static Aluno encontrarAlunoPorId(ArrayList<Aluno> alunos, int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null; 
    }
    public void adicionarTurma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
        }
    }
    
    
}
