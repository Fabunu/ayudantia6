import java.util.List;
import java.util.ArrayList;

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

    public void agregarCiudad(Ciudad ciudad) {
        if (ciudad != null && !ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
            System.out.println("Ciudad '" + ciudad.getNombre() + "' añadida con éxito.");
        } else {
            System.out.println("Error: la ciudad no se pudo añadir.");
        }
    }

    public void modificarCiudad(int index, Ciudad nuevaCiudad) {
        if (index >= 0 && index < ciudades.size() && nuevaCiudad != null) {
            ciudades.set(index, nuevaCiudad);
            System.out.println("Ciudad en la posición " + index + " modificada con éxito.");
        } else {
            System.out.println("Error: no se pudo modificar la ciudad.");
        }
    }

    public void eliminarCiudad(int index) {
        if (index >= 0 && index < ciudades.size()) {
            System.out.println("Ciudad '" + ciudades.get(index).getNombre() + "' eliminada.");
            ciudades.remove(index);
        } else {
            System.out.println("Error: no se pudo eliminar la ciudad.");
        }
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
