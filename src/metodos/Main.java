package metodos;

public class Main {

    public static void main(String[] args) {
        Usuario cynara = new Usuario("Cynara", "Grilo");//Contrutor com parâmetros

        Usuario walcker = new Usuario();//Construtor sem parâmetros
        walcker.nome = "Walcker";
        walcker.sobrenome = "Gomes";

        Usuario userBryan = new Usuario("Bryan", "Addams");//Chamando o método
        userBryan.imprimir();

        System.out.println(walcker.nome + " " + walcker.sobrenome);
        System.out.println(cynara.nome + " " + cynara.sobrenome);
    }
}
