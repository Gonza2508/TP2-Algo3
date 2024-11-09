package com.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {
    @Test
    public void test01() {
        Principal principal = new Principal();
        int numero = principal.funcion();
        assertEquals(numero, 0);
    }
}
