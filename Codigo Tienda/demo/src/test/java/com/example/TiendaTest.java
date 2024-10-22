package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
    private Tienda tienda;

    @BeforeEach
    void setUp() {
        tienda = new Tienda("Tienda Ejemplo", "Calle Falsa 123", "9am - 9pm");
    }

    @Test
    void testAgregarEmpleado() {
        Empleado empleado = new Empleado("Juan Perez", 1, "Vendedor");
        tienda.agregarEmpleado(empleado);
        assertEquals(1, tienda.getEmpleados().size());
    }

    @Test
    void testModificarTienda() {
        tienda.modificarTienda("Nueva Tienda", "Nueva Dirección", "10am - 8pm");
        assertEquals("Nueva Tienda", tienda.getNombre());
    }

    @Test
    void testEliminarEmpleado() {
        Empleado empleado = new Empleado("Juan Perez", 1, "Vendedor");
        tienda.agregarEmpleado(empleado);
        tienda.eliminarEmpleado(0);
        assertEquals(0, tienda.getEmpleados().size());
    }
}