package semana3;

public class BeautyAppointment {
    private String appointmentCode;
    private String clientName;
    private String serviceName;
    private double price;
    private int durationMinutes;
    private static final double TAX_RATE = 0.19; // Modificador final (constante)

    // CONSTRUCTOR 1: COMPLETO (5 parámetros)
    public BeautyAppointment(String appointmentCode, String clientName, String serviceName, double price, int durationMinutes) {
        setAppointmentCode(appointmentCode);
        setClientName(clientName);
        setServiceName(serviceName);
        setPrice(price);
        setDurationMinutes(durationMinutes);
    }

    // CONSTRUCTOR 2: PARCIAL (Solo servicio y precio)
    // Sobrecarga de Constructores (Requisito S03)
    public BeautyAppointment(String serviceName, double price) {
        this("N/A", "Cliente Anónimo", serviceName, price, 30); // Llama al constructor completo
    }

    // --- GETTERS ---
    public String getAppointmentCode() { return appointmentCode; }
    public String getClientName() { return clientName; }
    public String getServiceName() { return serviceName; }
    public double getPrice() { return price; }
    public int getDurationMinutes() { return durationMinutes; }

    // --- SETTERS CON VALIDACIÓN (Requisito S03) ---
    private void setAppointmentCode(String code) {
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("El código de cita debe ser válido.");
        }
        this.appointmentCode = code;
    }

    public void setClientName(String clientName) {
        if (clientName == null || clientName.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        this.clientName = clientName;
    }

    public void setServiceName(String serviceName) {
        if (serviceName == null || serviceName.length() < 5) {
            throw new IllegalArgumentException("Nombre de servicio inválido.");
        }
        this.serviceName = serviceName;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("El precio del servicio debe ser positivo.");
        }
        this.price = price;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes <= 15) {
            throw new IllegalArgumentException("La duración mínima es de 15 minutos.");
        }
        this.durationMinutes = durationMinutes;
    }

    // Método auxiliar (cálculo de impuesto)
    public double calculateTax() {
        return this.price * TAX_RATE;
    }

    public void showDetails() {
        double finalPrice = this.price + this.calculateTax();
        System.out.println("--- Cita de Belleza ---");
        System.out.println("Código: " + this.appointmentCode);
        System.out.println("Cliente: " + this.clientName);
        System.out.println("Servicio: " + this.serviceName);
        System.out.printf("Precio Final: $%,.2f%n", finalPrice);
    }
}