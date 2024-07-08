package br.unicamp.ic.inf335;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    @Test
    @DisplayName("Teste de ordenação dos produtos")
//    o método compareTo estava errado, o array de produtos não estava sendo ordenado
    void ordenarProdutosTest() {
        ProdutoBean produto1 = new ProdutoBean("P01", "Produto 1", "descricao", 50D, "novo");
        ProdutoBean produto2 = new ProdutoBean("P02", "Produto 2", "descricao", 10D, "novo");
        ProdutoBean produto3 = new ProdutoBean("P03", "Produto 3", "descricao", 30D, "usado");
        ProdutoBean produto4 = new ProdutoBean("P04", "Produto 4", "descricao", 20D, "usado");
        ProdutoBean produto5 = new ProdutoBean("P05", "Produto 5", "descricao", 5D, "usado");

        ArrayList<ProdutoBean> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        // Ordena produtos
        Collections.sort(produtos);

        assertEquals(produto5.getValor(), produtos.get(0).getValor());
        assertEquals(produto2.getValor(), produtos.get(1).getValor());
        assertEquals(produto4.getValor(), produtos.get(2).getValor());
        assertEquals(produto3.getValor(), produtos.get(3).getValor());
        assertEquals(produto1.getValor(), produtos.get(4).getValor());
    }


}