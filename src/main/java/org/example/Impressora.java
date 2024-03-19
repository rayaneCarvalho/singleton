package org.example;

public class Impressora {

    private Impressora() {};
    private static Impressora instance = new Impressora();
    public static Impressora getInstance() {
        return instance;
    }

    private int numeroDePaginas;

    public int getNumeroDePagina() {
        return numeroDePaginas;
    }

    public void setNumeroDePagina(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
