package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assert.assertEquals(4, pessoa.getIdade());
    }
}