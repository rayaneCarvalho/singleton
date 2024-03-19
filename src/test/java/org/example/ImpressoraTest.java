package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressoraTest {

    @Test
    public void deveRetornarQtePagina() {
        Impressora.getInstance().setNumeroDePagina(10);
        assertEquals(10, Impressora.getInstance().getNumeroDePagina());
    }
}