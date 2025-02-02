package javabean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CocienteTest {
    private Cociente cociente;

    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    @Test
    void calcular() {
        cociente.calcular(10, 2);
        assertEquals(5,0);
    }

    @Test
    void esError() {
    }
}