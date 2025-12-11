package semana1;

public class BeautyAppointment {
    // ---------------------- INICIO DE ATRIBUTOS ----------------------
    private String appointmentCode;
    private String clientName;
    private String serviceName;
    private double price;
    private int durationMinutes;
    private String getServiceName;

    private static final double TAX_RATE = 0.19;
    // ----------------------- FIN DE ATRIBUTOS ------------------------

    // ---------------------- INICIO DE CONSTRUCTOR --------------------
    public BeautyAppointment(String appointmentCode, String clientName, String serviceName, double price, int durationMinutes) {
        this.appointmentCode = appointmentCode;
        this.clientName = clientName;
        this.serviceName = serviceName;
        this.price = price;
        this.durationMinutes = durationMinutes;

    }
    // ----------------------- FIN DE CONSTRUCTOR ----------------------

    // ---------------------- INICIO DE MÉTODOS ----------------------
    public double calculateTax() {
        return this.price * TAX_RATE;
    }

    public void showDetails() {
        double taxAmount = this.calculateTax();
        double finalPrice = this.price + taxAmount;

        System.out.println("--- Cita de Belleza ---");
        System.out.println("Código de Cita: " + this.appointmentCode);
        System.out.println("Cliente: " + this.clientName);
        System.out.println("Servicio: " + this.serviceName);
        System.out.println("Duración Estimada: " + this.durationMinutes + " minutos");
        System.out.printf("Precio Base: $%,.2f%n", this.price);
        System.out.printf("Impuesto (%.0f%%): $%,.2f%n", (TAX_RATE * 100), taxAmount);
        System.out.printf("Precio Final: $%,.2f%n", finalPrice);
    }

    public String getAppointmentCode() {
        return appointmentCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }

    public String getClientName() {
        return clientName;
    }


    // ----------------------- FIN DE MÉTODOS ------------------------
}