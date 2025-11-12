package semana1;

public class BeautyAppointment {
    // Atributos
    String appointmentCode;
    String service;
    double price;

    // Constructor
    public BeautyAppointment(String appointmentCode, String service, double price) {
        this.appointmentCode = appointmentCode;
        this.service = service;
        this.price = price;
    }

    // Mostrar información
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Servicio: " + service);
        System.out.println("Precio: $" + price);
    }
}