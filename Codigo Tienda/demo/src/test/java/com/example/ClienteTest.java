package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals

class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Carlos Ramirez", 101);
    }

    @Test
    void testRegistrarCompra() {
        Compra compra = new Compra(1, new Date(), "Efectivo");
        cliente.registrarCompra(compra);
        assertEquals(1, cliente.consultarClientes().size());
    }
}
