package org.example.junit;

import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTest {
    @Test
    public void validaCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123", 0);
        Conta contaDestino = new Conta("123", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
