package org.example.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.w3c.dom.ls.LSOutput;

public class AssumptionsTest {

    @Test
    public void validarAlgoSomenteNoUserJoao(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
