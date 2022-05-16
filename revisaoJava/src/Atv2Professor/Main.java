package Atv2Professor;

public class Main {
        public static void main(String[] args) {
            //Criamos um produto
            Produto prod1 =  new Produto(00001, 1200.99, "PC da positivo");
    
            //Criando um item pedido
            ItemPedido itemPedido = new ItemPedido(prod1, 5);
    
            //Criando um objeto da classe pedido
            Pedido meuPedido = new Pedido();
    
            //Usando os metodos do objeto da classe pedido
            meuPedido.adicionarItem(itemPedido);
            System.out.println("Total do pedido " + meuPedido.obterTotal());
        }
    }
    
