package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompraTest {
    private Compra compra;

    @BeforeEach
    void setUp() {
        compra = new Compra(1, new Date(), "Tarjeta de Crédito");
    }

    @Test
    void testAgregarProducto() {
        Producto producto = new Producto("P001", "Camiseta", 19.99, "Ropa");
        compra.agregarProducto(producto);
        assertEquals(1, compra.getProductos().size());
    }

    @Test
    void testConsultarCompras() {
        Producto producto = new Producto("P001", "Camiseta", 19.99, "Ropa");
        compra.agregarProducto(producto);
        compra.consultarCompras();
    }

    @Test
    void testTotalCompra() {
        Producto producto = new Producto("P001", "Camiseta", 19.99, "Ropa");
        compra.agregarProducto(producto);
        assertEquals(19.99, compra.getTotal());
    }
}
