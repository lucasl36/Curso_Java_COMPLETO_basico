package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_5 extends Exercise {

    List<ItemCardapio> itens; 
    
    public Exercise_5_37_5() {
        super("Exercício mód. 5 aula 37 nro. 5");
        inicializarItensCardapio();
    }
    
    @Override
    public void execute() {
        boolean repeat = true;
        int codigo = 0;
        int quantidade = 0;
        do {
            System.out.println("Cardápio:");
            exibirItenCardapio();
            System.out.print("Por favor, informe o código e quantidade do item desejado\n"
                    + "separados por um espaço:");
            codigo = Main.sc.nextInt();
            quantidade = Main.sc.nextInt();
            Main.sc.nextLine();
            if(codigo >= itens.size() || codigo < 0) {
                System.out.println("Item inválido! Tente novamente...");
            } else if(quantidade <= 0) {
                System.out.println("Quantidade inválida! Tente novamente...");
            } else {
                System.out.printf("Total do pedido: R$ %.2f\n", (quantidade*itens.get(codigo-1).valor));
                repeat = false;
            }
        }while(repeat);
    }
    
    private class ItemCardapio {
        public int codigo;
        public String produto;
        public double valor;
        
        ItemCardapio(int codigo, String produto, double valor) {
            this.codigo = codigo;
            this.produto = produto;
            this.valor = valor;
        }
    }

    private void inicializarItensCardapio() {
        this.itens = new ArrayList<ItemCardapio>();
        this.itens.add(new ItemCardapio(1, "Cachorro Quente", 4.0));
        this.itens.add(new ItemCardapio(2, "X-Salada", 4.5));
        this.itens.add(new ItemCardapio(3, "X-Bacon", 5.0));
        this.itens.add(new ItemCardapio(4, "Torrada Simples", 2.0));
        this.itens.add(new ItemCardapio(5, "Refrigerante", 1.5));
    }
    
    private void exibirItenCardapio() {
        System.out.println("Código - Produto, R$ Preço");
        for(ItemCardapio item : itens) {
            System.out.printf("%d - %s, R$ %.2f\n", item.codigo, item.produto, item.valor);
        }
    }
    
}

