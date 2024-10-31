/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author vacin
 */
abstract class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private String sexo;
    private String email;

    // Construtor
    public Pessoa(String id, String nome, int idade, String sexo, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }
    public Pessoa(String id,String nome) {
    	this.id =id;
    	this.nome = nome;
    			}
    public Pessoa(){
        
    }

    // Métodos Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public String setSexo(String sexo) {
    	this.sexo = sexo;
    	return sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
}
