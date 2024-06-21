package list.OperacoesBasicas.CarrinhoCompras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinhoList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double soma = 0;
        for (int i = 0; i < carrinhoList.size(); i++) {
            Item item = carrinhoList.get(i);
            soma += item.getPreco() * item.getQuantidade();
        }
        return soma;
    }

    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    public int totalItens() {
        return carrinhoList.size();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O número total de produtos é: " + carrinhoDeCompras.totalItens());

        carrinhoDeCompras.adicionarItem("Sabonete", 5.12, 2);
        carrinhoDeCompras.adicionarItem("Macarrao", 4.50, 3);
        carrinhoDeCompras.adicionarItem("Chocolate", 10.00, 1);
        carrinhoDeCompras.adicionarItem("Ketchup", 3.99, 5);
        System.out.println("O número total de produtos é: " + carrinhoDeCompras.totalItens());

        carrinhoDeCompras.removerItem("Macarrao");
        System.out.println("O número total de produtos é: " + carrinhoDeCompras.totalItens());

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
