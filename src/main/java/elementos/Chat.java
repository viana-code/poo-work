/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

import java.util.ArrayList;

public class Chat {
    private ArrayList<Mensagem> mensagens;

    // Construtor
    public Chat() {
        this.mensagens = new ArrayList<>(); // Inicializa a lista de mensagens
    }

    // Métodos Getters e Setters
    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    // Método para adicionar uma mensagem ao chat
    public void addMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }
}

