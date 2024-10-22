package com.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear territorio y regiones
        Territorio territorio = new Territorio();
        Region region1 = new Region("Región Norte");
        Region region2 = new Region("Región Sur");

        // Agregar regiones al territorio
        territorio.agregarRegion(region1);
        territorio.agregarRegion(region2);
        
        // Consultar regiones
        territorio.consultarRegiones();

        // Crear ciudades y agregarlas a la región
        Ciudad ciudad1 = new Ciudad("Ciudad A", 12345);
        Ciudad ciudad2 = new Ciudad("Ciudad B", 54321);
        
        region1.agregarCiudad(ciudad1);
        region2.agregarCiudad(ciudad2);

        // Consultar ciudades en cada región
        region1.consultarCiudades();
        region2.consultarCiudades();

        // Crear una tienda
        Tienda tienda = new Tienda("Tienda uno", "Calle 123", "9am - 9pm");

        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Perez", 1, "Vendedor");
        Empleado empleado2 = new Empleado("Maria Lopez", 2, "Gerente");
        
        // Agregar empleados a la tienda
        tienda.agregarEmpleado(empleado1);
        tienda.agregarEmpleado(empleado2);

        // Consultar empleados
        tienda.consultarEmpleados();

        // Crear productos
        Producto producto1 = new Producto("P001", "Camiseta", 10000, "Ropa");
        Producto producto2 = new Producto("P002", "Pantalón", 12000, "Ropa");

        // Crear inventario y agregar productos
        Inventario inventario = new Inventario();
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.consultarInventario();

        // Crear una compra
        Compra compra = new Compra(1, new Date(), "Tarjeta de Crédito");
        compra.agregarProducto(producto1);
        compra.agregarProducto(producto2);
        
        // Registrar compra en la tienda
        tienda.registrarCompra(compra);
        
        // Consultar compras registradas
        tienda.consultarCompras();
        
        // Consultar detalles de la compra
        compra.consultarCompras();

        // Crear cliente y registrar compra
        Cliente cliente = new Cliente("Carlos Ramirez", 101);
        cliente.registrarCompra(compra);

        // Consultar compras del cliente
        List<Compra> comprasCliente = cliente.consultarClientes();
        System.out.println("Compras del cliente " + cliente.getNombre() + ":");
        for (Compra c : comprasCliente) {
            System.out.println(" - Compra número: " + c.getNumeroCompra());
        }
    }
}
