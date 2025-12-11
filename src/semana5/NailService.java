package semana5;

// Archivo: semana-05/NailService.java
public class NailService extends Service {
    private boolean hasArtDesign;
    private String nailTechnicianCode;
    private static final double ART_DESIGN_COST = 20000.0;

    public NailService(String serviceName, double basePrice, int durationMinutes, boolean hasArtDesign, String nailTechnicianCode) {
        super(serviceName, basePrice, durationMinutes);
        this.hasArtDesign = hasArtDesign;
        this.nailTechnicianCode = nailTechnicianCode;
    }

    // MÉTODO POLIMÓRFICO 4: Sobrescritura (Overriding)
    // Sobreescribe el método base para añadir el costo por diseño de arte
    @Override
    public double calcularPrecioFinal() {
        double subtotal = this.basePrice;
        if (hasArtDesign) {
            subtotal += ART_DESIGN_COST;
        }
        return subtotal * 1.19;
    }

    @Override
    public String getDetails() {
        return String.format("Diseño de Arte: %s | Técnico ID: %s", hasArtDesign ? "Sí" : "No", nailTechnicianCode);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Diseño: %s | Técnico: %s",
                hasArtDesign ? "Sí" : "No", nailTechnicianCode);
    }
}
