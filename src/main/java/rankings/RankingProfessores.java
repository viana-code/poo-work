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

import usuarios.Professor;

public class RankingProfessores extends Ranking {
    private ArrayList<Professor> rank; // Lista de professores no ranking

    // Construtor
    public RankingProfessores(String dataAtualizacao, String titulo, ArrayList<Professor> rank) {
        super(dataAtualizacao, titulo); // Chama o construtor da classe pai
        this.rank = rank;
    }

    // Método para ordenar os professores (exemplo, personalizar conforme necessário)
    @Override
    public ArrayList<Professor> ordenar() {
        // Implementar a lógica de ordenação dos professores
        // Exemplo: retornar a lista de professores ordenada
        return rank; // Retorne a lista ordenada
    }

    // Métodos Getters e Setters
    public ArrayList<Professor> getRank() {
        return rank;
    }

    public void setRank(ArrayList<Professor> rank) {
        this.rank = rank;
    }
}
