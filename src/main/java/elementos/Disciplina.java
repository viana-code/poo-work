/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author vacin
 */
public class Disciplina {
    private String nome;
    private int horas;

    // Construtor
    public Disciplina(String nome, int horas) {
        this.nome = nome;
        this.horas = horas;
    }
    public Disciplina(String nome) {
    	this.nome = nome;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Horas: " + horas;
    }
  
}
