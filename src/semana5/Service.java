package semana5;

// Archivo: semana-05/Service.java
import java.util.Objects;

public abstract class Service {
    protected String serviceName;
    protected double basePrice;
    protected int durationMinutes;

    public Service(String serviceName, double basePrice, int durationMinutes) {
        if (basePrice <= 0) throw new IllegalArgumentException("El precio base debe ser positivo.");
        this.serviceName = serviceName;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    // MÉTODO POLIMÓRFICO 1: Sobrecarga (Overloading)
    // Calcula el precio final sin descuento
    public double calcularPrecioFinal() {
        // Lógica de cálculo base (ej: Precio base + IVA)
        return this.basePrice * 1.19;
    }

    // MÉTODO POLIMÓRFICO 2: Sobrecarga (Overloading)
    // Calcula el precio final aplicando un descuento
    public double calcularPrecioFinal(double discountRate) {
        if (discountRate < 0 || discountRate > 1) {
            throw new IllegalArgumentException("La tasa de descuento debe estar entre 0 y 1.");
        }
        double precioConIVA = this.basePrice * 1.19;
        return precioConIVA * (1 - discountRate);
    }

    // Método que será SOBRESCRITO en hijos para incluir su lógica específica
    public abstract String getDetails();

    // Método toString() sobrescrito (Requisito)
    @Override
    public String toString() {
        return String.format("Tipo: %s | Servicio: %s | Precio Base: $%,.2f",
                this.getClass().getSimpleName(), serviceName, basePrice);
    }

    // Getters
    public String getServiceName() { return serviceName; }
    public double getBasePrice() { return basePrice; }
}
