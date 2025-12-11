package semana5;

// Archivo: semana-05/ServiceManager.java
import java.util.ArrayList;
import java.util.List;

public class ServiceManager {
    // ArrayList Polimórfico: Puede contener cualquier objeto que herede de Service
    private List<Service> allServices;

    public ServiceManager() {
        this.allServices = new ArrayList<>();
    }

    public void addService(Service service) { // Método genérico: acepta el TIPO PADRE
        this.allServices.add(service);
    }

    // Método Polimórfico en tiempo de ejecución:
    // Itera sobre el tipo Service, pero llama al método SOBRESCRITO correcto.
    public void procesarCalculoDePrecios(double descuentoGlobal) {
        System.out.println("\n--- Procesamiento Polimórfico de Precios ---");
        System.out.println("Aplicando descuento global: " + (descuentoGlobal * 100) + "%");

        for (Service service : allServices) {
            // El compilador solo ve 'Service', pero en ejecución llama al método del objeto hijo (dynamic binding)
            double precioFinalConDscto = service.calcularPrecioFinal(descuentoGlobal);

            System.out.printf("   %s (%s): Precio Final: $%,.2f%n",
                    service.getServiceName(),
                    service.getClass().getSimpleName(), // Nombre de la clase hija
                    precioFinalConDscto);
        }
    }
}