package br.unicamp.ic.inf335;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class AnuncioBeanTest {

    @Test
    @DisplayName("Um produto com 0% de desconto deve ter o valor com desconto igual ao valor inicial")
    public void test0PorCentoDesconto() throws MalformedURLException {
        ProdutoBean produto = new ProdutoBean(
        "P01",
        "Produto 1",
        "descricao",
        50D,
        "novo"
        );

        URL foto1 = new URL("http://localhost:8080/produtos/foto/1");
        URL foto2 = new URL("http://localhost:8080/produtos/foto/2");
        ArrayList<URL> fotos = new ArrayList<>();
        fotos.add(foto2);
        fotos.add(foto1);

        AnuncioBean anuncio = new AnuncioBean(produto,fotos , 0D);

        Double valorComDesconto = anuncio.getValor();

        assertEquals(produto.getValor(), valorComDesconto);
    }

    @Test
    @DisplayName("Um produto com 0.5 de desconto deve custar metade do seu valor inicial")
    public void test50PorCentoDesconto() throws MalformedURLException {
        ProdutoBean produto = new ProdutoBean(
        "P01",
        "Produto 1",
        "descricao",
        50D,
        "novo"
        );
        Double valorEsperado = produto.getValor() / 2D;

        URL foto1 = new URL("http://localhost:8080/produtos/foto/1");
        URL foto2 = new URL("http://localhost:8080/produtos/foto/2");
        ArrayList<URL> fotos = new ArrayList<>();
        fotos.add(foto2);
        fotos.add(foto1);

        AnuncioBean anuncio = new AnuncioBean(produto,fotos , 0.5D);

        Double valorComDesconto = anuncio.getValor();

        assertEquals(valorEsperado, valorComDesconto);
    }
}
