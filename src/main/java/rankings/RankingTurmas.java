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

import elementos.Turma;

public class RankingTurmas extends Ranking {
    private ArrayList<Turma> rank; // Lista de turmas no ranking

    // Construtor
    public RankingTurmas(String dataAtualizacao, String titulo, ArrayList<Turma> rank) {
        super(dataAtualizacao, titulo); // Chama o construtor da classe pai
        this.rank = rank;
    }

    // Método para ordenar as turmas (exemplo, personalizar conforme necessário)
    @Override
    public ArrayList<Turma> ordenar() {
        // Implementar a lógica de ordenação das turmas
        // Exemplo: retornar a lista de turmas ordenada
        return rank; // Retorne a lista ordenada
    }

    // Métodos Getters e Setters
    public ArrayList<Turma> getRank() {
        return rank;
    }

    public void setRank(ArrayList<Turma> rank) {
        this.rank = rank;
    }
}

