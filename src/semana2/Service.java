// Archivo: semana2/Service.java
package semana2;

public class Service {
    private String serviceName;
    private double basePrice;
    private int durationMinutes;
    private String category;

    public Service(String serviceName, double basePrice, int durationMinutes, String category) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("El precio base del servicio debe ser positivo."); // Validación S02
        }
        this.serviceName = serviceName;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
        this.category = category;
    }
    // ... métodos getServiceName()
    public String getServiceName() { return serviceName; }
    public void showServiceDetails() {
        System.out.println("-> Detalle del Servicio:");
        System.out.println("   Nombre: " + this.serviceName);
    }
}