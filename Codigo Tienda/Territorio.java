import java.util.ArrayList;
import java.util.List;

class Territorio {
    private List<Region> regiones;

    public Territorio() {
        this.regiones = new ArrayList<>();
    }

    public void agregarRegion(Region region) {
        if (region != null && !regiones.contains(region)) {
            regiones.add(region);
            System.out.println("Región '" + region.getNombre() + "' añadida con éxito.");
        } else {
            System.out.println("Error: la región no se pudo añadir.");
        }
    }

    public void modificarRegion(int index, Region nuevaRegion) {
        if (index >= 0 && index < regiones.size() && nuevaRegion != null) {
            regiones.set(index, nuevaRegion);
            System.out.println("Región en la posición " + index + " modificada con éxito.");
        } else {
            System.out.println("Error: no se pudo modificar la región.");
        }
    }

    public void eliminarRegion(int index) {
        if (index >= 0 && index < regiones.size()) {
            System.out.println("Región '" + regiones.get(index).getNombre() + "' eliminada.");
            regiones.remove(index);
        } else {
            System.out.println("Error: no se pudo eliminar la región.");
        }
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
}
