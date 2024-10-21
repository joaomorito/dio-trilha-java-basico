package org.example.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class ConditionsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "JOAO")
    public void validarAlgoSomenteNoUserJoao(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
