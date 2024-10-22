package com.example;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String nombre;
	private List<Ciudad> ciudades;

	public Region(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }



    public void agregarCiudad(Ciudad ciudad) throws IllegalArgumentException {
        if (ciudad == null || ciudad.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error: La ciudad no puede ser nula o vacía.");
        }
        if (ciudades.contains(ciudad)) {
            throw new IllegalArgumentException("Error: La ciudad ya existe.");
        }
        ciudades.add(ciudad);
        System.out.println("Ciudad '" + ciudad.getNombre() + "' añadida con éxito.");
    }

    public void modificarCiudad(int index, Ciudad nuevaCiudad) throws IndexOutOfBoundsException {
        if (nuevaCiudad == null || nuevaCiudad.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error: La nueva ciudad no puede ser nula o vacía.");
        }
        ciudades.set(index, nuevaCiudad);
        System.out.println("Ciudad modificada con éxito.");
    }

    public void eliminarCiudad(int index) throws IndexOutOfBoundsException {
        System.out.println("Ciudad '" + ciudades.get(index).getNombre() + "' eliminada.");
        ciudades.remove(index);
    }

    public void consultarCiudades() {
        if (ciudades.isEmpty()) {
            System.out.println("No hay ciudades registradas en la región " + nombre + ".");
        } else {
            System.out.println("Ciudades en la región " + nombre + ":");
            for (Ciudad ciudad : ciudades) {
                System.out.println(" - " + ciudad.getNombre());
            }
        }
    }
}

