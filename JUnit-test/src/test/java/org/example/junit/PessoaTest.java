package org.example.junit;

import org.example.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void DeveCalcularIdadeCorretamente(){
        Pessoa joao = new Pessoa("João", LocalDate.of(2000,1, 1));
        Assertions.assertEquals(24, joao.getIdade());
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade(){
        Pessoa joao = new Pessoa("João", LocalDate.of(2000,1, 1));
        Assertions.assertTrue(joao.ehMaiorDeIdade());

        Pessoa jubileu = new Pessoa("jubileu", LocalDate.now());
        Assertions.assertFalse(jubileu.ehMaiorDeIdade());
    }
}