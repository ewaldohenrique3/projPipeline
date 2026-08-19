package com.henrique;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions; // ou: import static org.junit.jupiter.api.Assertions.*;

public class SomaTeste {

    @Test
    public void testeSoma() {
        double result;

        Soma conta = new Soma();
        result = conta.soma(10.0, 5.0);

        // No JUnit 5 usamos Assertions (com 's')
        Assertions.assertEquals(15.0, result);
    }
}