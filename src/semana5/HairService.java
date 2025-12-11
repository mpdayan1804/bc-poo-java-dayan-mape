package semana5;

// Archivo: semana-05/HairService.java
public class HairService extends Service {
    private String stylistLevel;
    private boolean isColorRequired;
    private static final double COLOR_SURCHARGE = 50000.0;

    public HairService(String serviceName, double basePrice, int durationMinutes, String stylistLevel, boolean isColorRequired) {
        super(serviceName, basePrice, durationMinutes);
        this.stylistLevel = stylistLevel;
        this.isColorRequired = isColorRequired;
    }

    // MÉTODO POLIMÓRFICO 3: Sobrescritura (Overriding)
    // Sobreescribe el método base para añadir el recargo por color antes del cálculo final
    @Override
    public double calcularPrecioFinal() {
        double subtotal = this.basePrice;
        if (isColorRequired) {
            subtotal += COLOR_SURCHARGE;
        }
        // Aplica el IVA al subtotal modificado
        return subtotal * 1.19;
    }

    // Sobrecarga del método sobrescrito (Opción Avanzada)
    @Override
    public double calcularPrecioFinal(double discountRate) {
        double precioConRecargo = this.calcularPrecioFinal(); // Llama a la versión sobrescrita sin argumentos
        return precioConRecargo * (1 - discountRate);
    }

    @Override
    public String getDetails() {
        return String.format("Estilista Nivel: %s | Incluye Color: %s", stylistLevel, isColorRequired ? "Sí" : "No");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Color: %s | Nivel: %s",
                isColorRequired ? "Sí" : "No", stylistLevel);
    }
}
