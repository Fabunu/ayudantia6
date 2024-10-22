import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private int numeroCompra;
    private Date fecha;
    private double total;
    private String formaPago;
    private List<Producto> productos;

    public Compra(int numeroCompra, Date fecha, String formaPago) {
        this.numeroCompra = numeroCompra;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

	public int getNumeroCompra() {
        return numeroCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void registrarCompra(Compra compra) {
        if (compra != null) {
            System.out.println("Compra registrada con éxito.");
        }
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            total += producto.getPrecio();
            System.out.println("Producto '" + producto.getDescripcion() + "' agregado a la compra.");
        } else {
            System.out.println("Error: no se pudo agregar el producto.");
        }
    }

    public void actualizarInventarioTrasCompra(Inventario inventario) {
		for (Producto producto : productos) {
			boolean cantidadReducida = inventario.reducirCantidad(producto, 1); 
			if (cantidadReducida) {
				System.out.println("Se redujo la cantidad del producto '" + producto.getDescripcion() + "'.");
			} else {
				System.out.println("Error: no hay suficiente stock del producto '" + producto.getDescripcion() + "'.");
			}
		}
	}
	

     public void consultarCompras() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en esta compra.");
        } else {
            System.out.println("Productos en la compra número " + numeroCompra + ":");
            for (Producto producto : productos) {
                System.out.println(" - " + producto.getDescripcion() + ": $" + producto.getPrecio());
            }
            System.out.println("Total: $" + total);
        }
    }

    public double getTotal() {
        return total;
    }
}