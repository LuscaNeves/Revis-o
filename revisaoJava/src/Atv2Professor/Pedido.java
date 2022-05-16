package Atv2Professor;
import java.util.ArrayList;

public class Pedido {

    private ArrayList <ItemPedido> itens;
    private double valorTotal;

    public Pedido(){
        itens = new ArrayList<>();
    }
    
    public void adicionarItem (ItemPedido itemNovo){
       this.itens.add(itemNovo);
       double valorItem;
       valorItem = itemNovo.getQuantidade()* 
                   itemNovo.getProduto().getValor();
       atualizaValorTotal(valorItem);
    }

    private void atualizaValorTotal(double valor){
        this.valorTotal = this.valorTotal+valor;
    }

    public double obterTotal(){
        return this.valorTotal;
    }
}

    