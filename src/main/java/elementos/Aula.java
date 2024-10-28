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

import usuarios.Aluno;
import java.util.Scanner;
public class Aula {
    private String data; // Data da aula
    private String tema; // Tema da aula
    private ArrayList<Aluno> alunosPresenca; // Lista de alunos presentes
    private ArrayList<Feedback> feedback; // Lista de feedbacks da aula
    private String materialTeorico; // Material teórico da aula
    private String exercicio; // Exercício associado à aula

    // Construtor
    public Aula(String data, String tema, ArrayList<Aluno> alunosPresenca,
                ArrayList<Feedback> feedback, String materialTeorico, String exercicio) {
        this.data = data;
        this.tema = tema;
        this.alunosPresenca = alunosPresenca;
        this.feedback = feedback;
        this.materialTeorico = materialTeorico;
        this.exercicio = exercicio;
    }

    // Métodos Getters e Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Aluno> getAlunosPresenca() {
        return alunosPresenca;
    }

    public void setAlunosPresenca(ArrayList<Aluno> alunosPresenca) {
        this.alunosPresenca = alunosPresenca;
    }

    public ArrayList<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<Feedback> feedback) {
        this.feedback = feedback;
    }

    public String getMaterialTeorico() {
        return materialTeorico;
    }

    public void setMaterialTeorico(String materialTeorico) {
        this.materialTeorico = materialTeorico;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }
    public void cadastrarAula() {//somente o professor podera chamar esse metodo
        Scanner leituraAula = new Scanner(System.in);
        
        // data da aula
        System.out.print("Digite a data da aula: ");
        this.data =	leituraAula.nextLine();
        
        // tema
        System.out.print("Digite o tema da aula: ");
        this.tema = leituraAula.nextLine();// se for prova , digita prova
       
     
        System.out.print("Material da aula: ");
        this.materialTeorico = leituraAula.nextLine();
        
        
        System.out.print("Exercicios para a aula: ");// se nao tiver nao digita nada
        this.exercicio = leituraAula.nextLine();
        


        System.out.println("Aula cadastrada com sucesso!");
    }
    public void computarFaltas(ArrayList<Aluno> alunosCadastrados) {
        Scanner leitura = new Scanner(System.in);

        for (Aluno aluno : alunosCadastrados) {
            System.out.print(aluno.getNome() +"(Digite 'F' para falta ou pressione Enter para presente): ");
            String resposta = leitura.nextLine().trim();

            if (resposta.equalsIgnoreCase("F")) {
                aluno.adicionarFalta(); 
                System.out.println("Falta computada para " + aluno.getNome());
            } else {
                System.out.println("Presença registrada para " + aluno.getNome());
            }
        }
   }
}
