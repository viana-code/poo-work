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

abstract class Ranking {//pode transformar essa classe em abstract
    private String dataAtualizacao; // Data da última atualização do ranking
    private String titulo; // Título do ranking

    // Construtor
    public Ranking(String dataAtualizacao, String titulo) {
        this.dataAtualizacao = dataAtualizacao;
        this.titulo = titulo;
    }

    // Método para ordenar (exemplo, você pode personalizar a lógica de ordenação conforme necessário)
    public ArrayList<?> ordenar() {
        // Aqui você pode implementar a lógica para ordenar os dados do ranking.
        // Exemplo: retornar uma lista ordenada (substitua pelo seu tipo específico)
        return new ArrayList<>();
    }

    // Métodos Getters e Setters
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String data) {
        this.dataAtualizacao = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}


