package org.example.junit;

import org.example.Pessoa;
import org.junit.Test;

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
