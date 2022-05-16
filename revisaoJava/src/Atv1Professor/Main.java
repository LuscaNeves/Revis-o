package Atv1Professor;

public class Main {
    public static void main(String[] args) throws Exception {
     //Definindo a variavel do tipo jogador 
        Jogador jogador1;

     //Cria um objeto da classe Jogador e atribui para a variavel jogador1
        jogador1 = new Jogador();
    
    //Atribuindo valores para o jogador 1
    //usando os setters
    jogador1.setPontuacao(100);
    jogador1.setNome("Joana");
    jogador1.setAtivado(true);

    //Recuperar valores do jogador 1
    //Usamos os getters
    System.out.println("Nome: " + jogador1.getNome());
    System.out.println("Pontuação: " + jogador1.getPontuacao());
    System.out.println("Ativado? " + jogador1.isAtivado());
    }
     
} 
