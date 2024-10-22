package org.example.junit;

import org.junit.Test;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {

    @DisplayName("B")
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("A")
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
