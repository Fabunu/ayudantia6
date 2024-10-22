package com.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public int consultarCantidad(Producto producto) {
        int count = 0;
        for (Producto p : productos) {
            if (p.getCodigo().equals(producto.getCodigo())) {
                count++;
            }
        }
        return count;
    }

	public void actualizarInventario(Producto producto, int cantidad) {
        if (producto != null) {
            for (int i = 0; i < cantidad; i++) {
                productos.add(producto);
            }
        }
    }

    public void agregarProducto(Producto producto) {
        if (producto != null && !productos.contains(producto)) {
            productos.add(producto);
            System.out.println("Producto '" + producto.getDescripcion() + "' añadido con éxito.");
        } else {
            System.out.println("Error: no se pudo añadir el producto.");
        }
    }

    public void modificarProducto(int index, Producto nuevoProducto) {
        if (index >= 0 && index < productos.size()) {
            productos.set(index, nuevoProducto);
        }
    }

	public void eliminarProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            productos.remove(index);
        }
    }

    public void consultarInventario() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Productos en inventario:");
            for (Producto producto : productos) {
                System.out.println(" - " + producto.getDescripcion() + ": $" + producto.getPrecio());
            }
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}