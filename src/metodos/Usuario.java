package metodos;

public class Usuario {

    Usuario(){ //Contrutor sem parâmetros
        System.out.println("Chamou meu construtor");
    }

    Usuario(String nome, String sobrenome){ //Construtor com Parâmetros
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    String nome;
    String sobrenome;

    void imprimir(){ //Método imprimir
        System.out.println(this.nome + " " + this.sobrenome);
    }
}
