/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rankings;

/**
 *
 * @author vacin
 */
import java.util.ArrayList;

import usuarios.Aluno;

public class RankingAlunos extends Ranking {
    private ArrayList<Aluno> rank; // Lista de alunos no ranking

    // Construtor
    public RankingAlunos(String dataAtualizacao, String titulo, ArrayList<Aluno> rank) {
        super(dataAtualizacao, titulo); // Chama o construtor da classe pai
        this.rank = rank;
    }

    // Método para ordenar os alunos (exemplo, personalizar conforme necessário)
    @Override
    public ArrayList<Aluno> ordenar() {
        // Implementar a lógica de ordenação dos alunos
        // Exemplo: retornar a lista de alunos ordenada
        return rank; // Retorne a lista ordenada
    }

    // Métodos Getters e Setters
    public ArrayList<Aluno> getRank() {
        return rank;
    }

    public void setRank(ArrayList<Aluno> rank) {
        this.rank = rank;
    }
}

