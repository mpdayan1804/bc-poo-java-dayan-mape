package Semana4;

// Archivo: semana-04/Service.java
public abstract class Service { // Usamos 'abstract' si nunca vamos a crear un objeto Service genérico
    protected String serviceName; // protected para acceso directo en subclases
    protected double basePrice;
    protected int durationMinutes;

    // Constructor Padre
    public Service(String serviceName, double basePrice, int durationMinutes) {
        // Implementación de validación básica de S03
        if (basePrice <= 0) throw new IllegalArgumentException("El precio base debe ser positivo.");
        this.serviceName = serviceName;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    // Método a Sobrescribir (Polimorfismo)
    public abstract String getServiceDetails();

    // Método toString() Sobrescrito (Requisito adicional)
    @Override
    public String toString() {
        return "Servicio Base: " + serviceName +
                " | Precio: $" + String.format("%,.2f", basePrice) +
                " | Duración: " + durationMinutes + " min";
    }

    // Getters y Setters (Encapsulación S03)
    public String getServiceName() { return serviceName; }
    public double getBasePrice() { return basePrice; }
}