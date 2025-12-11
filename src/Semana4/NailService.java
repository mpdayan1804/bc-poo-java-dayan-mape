package Semana4;

// Archivo: semana-04/NailService.java
public class NailService extends Service {
    private boolean hasArtDesign;
    private String nailTechnicianCode;
    private static final double ART_DESIGN_COST = 20000.0;

    // Constructor que llama a super()
    public NailService(String serviceName, double basePrice, int durationMinutes, boolean hasArtDesign, String nailTechnicianCode) {
        super(serviceName, basePrice, durationMinutes); // USAMOS super()
        this.hasArtDesign = hasArtDesign;
        this.nailTechnicianCode = nailTechnicianCode;
    }

    // Sobrescribir el método de detalle para incluir el cálculo de precio
    @Override
    public String getServiceDetails() {
        double finalPrice = basePrice + (hasArtDesign ? ART_DESIGN_COST : 0);
        return String.format("Servicio de Uñas (%s) | Técnico ID: %s | Precio Total: $%,.2f",
                super.getServiceName(), nailTechnicianCode, finalPrice);
    }

    // Sobrescribir toString() para incluir la información propia
    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo +
                " | Diseño de Arte: " + (hasArtDesign ? "Sí" : "No") +
                " | Técnico: " + nailTechnicianCode;
    }
}