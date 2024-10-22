import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private String nombre;
	private String direccion;
	private String horarioAtencion;
	private List<Empleado> empleados;
	private List<Compra> compras;

	public Tienda(String nombre, String direccion, String horarioAtencion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAtencion = horarioAtencion;
        this.empleados = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

	
    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleados.add(empleado);
            System.out.println("Empleado '" + empleado.getNombre() + "' añadido con éxito.");
        } else {
            System.out.println("Error: no se pudo añadir el empleado.");
        }
    }


    public void modificarTienda(String nuevoNombre, String nuevaDireccion, String nuevoHorario) {
        if (nuevoNombre != null && nuevaDireccion != null && nuevoHorario != null) {
            this.nombre = nuevoNombre;
            this.direccion = nuevaDireccion;
            this.horarioAtencion = nuevoHorario;
        }
    }

    public void eliminarEmpleado(int index) {
        if (index >= 0 && index < empleados.size()) {
            empleados.remove(index);
        }
    }

    public void consultarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Empleados en la tienda:");
            for (Empleado empleado : empleados) {
                System.out.println(" - " + empleado.getNombre() + " (ID: " + empleado.getId() + ")");
            }
        }
    }

    public void registrarCompra(Compra compra) {
        if (compra != null) {
            compras.add(compra);
            System.out.println("Compra registrada con éxito. Número de compra: " + compra.getNumeroCompra());
        } else {
            System.out.println("Error: no se pudo registrar la compra.");
        }
    }

    public void asignarEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

    public void consultarCompras() {
        if (compras.isEmpty()) {
            System.out.println("No hay compras registradas.");
        } else {
            System.out.println("Compras registradas:");
            for (Compra compra : compras) {
                System.out.println(" - Número de compra: " + compra.getNumeroCompra() + ", Fecha: " + compra.getFecha());
            }
        }
    }
}
