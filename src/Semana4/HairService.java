package Semana4;

// Archivo: semana-04/HairService.java
public class HairService extends Service {
    private String stylistLevel;
    private boolean isColorRequired;
    private static final double COLOR_SURCHARGE = 50000.0;

    // Constructor que llama a super()
    public HairService(String serviceName, double basePrice, int durationMinutes, String stylistLevel, boolean isColorRequired) {
        super(serviceName, basePrice, durationMinutes); // USAMOS super()
        this.stylistLevel = stylistLevel;
        this.isColorRequired = isColorRequired;
    }

    // Sobrescribir el método de detalle para incluir el cálculo de precio
    @Override
    public String getServiceDetails() {
        double finalPrice = basePrice + (isColorRequired ? COLOR_SURCHARGE : 0);
        return String.format("Servicio de Cabello (%s) | Nivel Estilista: %s | Precio Total: $%,.2f",
                super.getServiceName(), stylistLevel, finalPrice);
    }

    // Sobrescribir toString() para incluir la información propia
    @Override
    public String toString() {
        // Llama al toString() del padre (opcional) y añade sus detalles
        String baseInfo = super.toString();
        return baseInfo +
                " | Nivel: " + stylistLevel +
                " | Color Extra: " + (isColorRequired ? "Sí" : "No");
    }
}
