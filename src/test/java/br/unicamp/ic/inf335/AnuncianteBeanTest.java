package br.unicamp.ic.inf335;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnuncianteBeanTest {

    @Test
    @DisplayName("Testa o valor médio dos anuncios")
    public void testAnunciante() throws MalformedURLException {
        ProdutoBean produto1 = new ProdutoBean(
        "P01",
        "Produto 1",
        "descricao",
        50D,
        "novo"
        );

        URL foto1 = new URL("http://localhost:8080/produtos/foto/1");
        URL foto2 = new URL("http://localhost:8080/produtos/foto/2");
        ArrayList<URL> fotosAnuncio1 = new ArrayList<>();
        fotosAnuncio1.add(foto2);
        fotosAnuncio1.add(foto1);

        AnuncioBean anuncio1 = new AnuncioBean(produto1, fotosAnuncio1,0.5D);


        ProdutoBean produto2 = new ProdutoBean(
        "P01",
        "Produto 1",
        "descricao",
        50D,
        "novo"
        );

        URL foto3 = new URL("http://localhost:8080/produtos/foto/1");
        URL foto4 = new URL("http://localhost:8080/produtos/foto/2");
        ArrayList<URL> fotosAnuncio2 = new ArrayList<>();
        fotosAnuncio2.add(foto3);
        fotosAnuncio2.add(foto4);

        AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosAnuncio2,0.3D);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
        AnuncianteBean anunciante = new AnuncianteBean("joao", "12345678901", anuncios);

        Double valorMedioEsperado = (anuncio1.getValor() + anuncio2.getValor())/ 2D;

        assertEquals(valorMedioEsperado, anunciante.valorMedioAnuncios());

    }
}
