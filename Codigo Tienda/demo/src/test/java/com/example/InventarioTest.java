package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventarioTest {
    private Inventario inventario;

    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }

    @Test
    void testAgregarProducto() {
        Producto producto = new Producto("P001", "Camiseta", 19.99, "Ropa");
        inventario.agregarProducto(producto);
        assertEquals(1, inventario.getProductos().size());
    }

    @Test
    void testEliminarProducto() {
        Producto producto = new Producto("P001", "Camiseta", 19.99, "Ropa");
        inventario.agregarProducto(producto);
        inventario.eliminarProducto(0);
        assertEquals(0, inventario.getProductos().size());
    }
}
