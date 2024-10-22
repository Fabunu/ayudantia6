package com.example;

import java.util.ArrayList;
import java.util.List;

class Territorio {
    private List<Region> regiones;

    public Territorio() {
        this.regiones = new ArrayList<>();
    }

    public void agregarRegion(Region region) throws IllegalArgumentException  {
        if (region == null || region.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error: La región no puede ser nula o vacía.");
        }
        if (regiones.contains(region)) {
            throw new IllegalArgumentException("Error: La región ya existe.");
        }
        regiones.add(region);
        System.out.println("Región '" + region.getNombre() + "' añadida con éxito.");
    }

    public void modificarRegion(int index, Region nuevaRegion) throws IndexOutOfBoundsException {
        if (nuevaRegion == null || nuevaRegion.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error: La nueva región no puede ser nula o vacía.");
        }
        regiones.set(index, nuevaRegion);
        System.out.println("Región modificada con éxito.");
    }   

    public void eliminarRegion(int index) throws IndexOutOfBoundsException {
        System.out.println("Region " + regiones.get(index).getNombre() + "eliminada");
        regiones.remove(index);
    }

    public void consultarRegiones() {
        if (regiones.isEmpty()) {
            System.out.println("No hay regiones registradas.");
        } else {
            System.out.println("Regiones disponibles:");
            for (Region region : regiones) {
                System.out.println(" - " + region.getNombre());
            }
        }
    }

    public List<Region> getRegiones() {
        return regiones;
    }
}
