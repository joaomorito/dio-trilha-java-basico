package org.example.junit;

import org.example.DB;
import org.example.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    public static void configuraConexao(){
        DB.iniciarConexao();
        System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    public void insereDadosParaTeste(){
        DB.inserirDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    public void removeDadosDoTeste(){
        DB.removerDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    public void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    public static void finalizarConexao(){
        DB.iniciarConexao();
        System.out.println("rodou finalizarConexao");
    }
}
