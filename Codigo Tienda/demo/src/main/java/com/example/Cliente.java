package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int numeroCliente;
    private List<Compra> compras;

    public Cliente(String nombre, int numeroCliente) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.compras = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println("Cliente registrado con éxito.");
        }
    }

    public void registrarCompra(Compra compra) {
        if (compra != null) {
            compras.add(compra);
        }
    }

    public List<Compra> consultarClientes() {
        return compras;
    }

    public void modificarCliente(String nuevoNombre) {
        if (nuevoNombre != null) {
            this.nombre = nuevoNombre;
        }
    }

    public void eliminarCliente(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= compras.size()) {
            throw new IndexOutOfBoundsException("Error: índice de cliente fuera de límites.");
        }
        compras.remove(index);
        System.out.println("Cliente eliminado con éxito.");
    }

    public void eliminarCompra(int index) {
        if (index >= 0 && index < compras.size()) {
            compras.remove(index);
            System.out.println("Compra eliminada con éxito.");
        } else {
            System.out.println("Error: índice fuera de límites.");
        }
    }
}
