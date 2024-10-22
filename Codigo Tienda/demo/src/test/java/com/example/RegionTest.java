package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;;

class RegionTest {
    private Region region;

    @BeforeEach
    void setUp() {
        region = new Region("Región Norte");
    }

    @Test
    void testAgregarCiudad() {
        Ciudad ciudad = new Ciudad("Ciudad A", 12345);
        region.agregarCiudad(ciudad);
        assertEquals(1, region.getCiudades().size());
    }

    @Test
    void testModificarCiudad() {
        Ciudad ciudad = new Ciudad("Ciudad A", 12345);
        region.agregarCiudad(ciudad);
        Ciudad nuevaCiudad = new Ciudad("Ciudad B", 54321);
        region.modificarCiudad(0, nuevaCiudad);
        assertEquals("Ciudad B", region.getCiudades().get(0).getNombre());
    }

    @Test
    void testEliminarCiudad() {
        Ciudad ciudad = new Ciudad("Ciudad A", 12345);
        region.agregarCiudad(ciudad);
        region.eliminarCiudad(0);
        assertEquals(0, region.getCiudades().size());
    }
}

