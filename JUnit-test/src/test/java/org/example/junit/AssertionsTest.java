package org.example.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void validarLancamento(){

        int[] primeiroLancamento = {10, 15, 20, 30, 35};
        int[] segundoLancamento = {10, 15, 20, 30, 35};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        Pessoa luciano = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(luciano);
    }
}
