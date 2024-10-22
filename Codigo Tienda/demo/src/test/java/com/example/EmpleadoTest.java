package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
    private Empleado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Empleado("Juan Perez", 1, "Vendedor");
    }

    @Test
    void testGetNombre() {
        assertEquals("Juan Perez", empleado.getNombre());
    }

    @Test
    void testSetNombre() {
        empleado.setNombre("Maria Lopez");
        assertEquals("Maria Lopez", empleado.getNombre());
    }
}
