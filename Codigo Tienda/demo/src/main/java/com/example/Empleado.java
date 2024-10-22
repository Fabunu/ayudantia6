package com.example;

public class Empleado {
    private String nombre;
    private int id;
    private String cargo;

    public Empleado(String nombre, int id, String cargo) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
