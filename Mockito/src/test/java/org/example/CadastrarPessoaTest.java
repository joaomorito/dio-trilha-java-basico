package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Extension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Poços de Caldas", "Rua 2", "Apto", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("191919")).thenReturn(dadosLocalizacao);
        Pessoa joao = cadastrarPessoa.cadastrarPessoa("João", "12121", LocalDate.now(), "191919");

        assertEquals("João", joao.getNome());
        assertEquals("12121", joao.getDocumento());
        assertEquals("MG", joao.getEndereco().getUf());
        assertEquals("Apto", joao.getEndereco().getComplemento());
    }
}
