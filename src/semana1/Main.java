package semana1;

public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos diferentes de tipo BeautyAppointment
        BeautyAppointment cita1 = new BeautyAppointment("A001", "Corte de cabello", 25000);
        BeautyAppointment cita2 = new BeautyAppointment("A002", "Manicure y pedicure", 40000);
        BeautyAppointment cita3 = new BeautyAppointment("A003", "Tratamiento facial", 60000);
        BeautyAppointment cita4 = new BeautyAppointment("A004", "Tintura", 180000);
        BeautyAppointment cita5 = new BeautyAppointment("A005", "keratina", 200000);


        // Llamar al método showInfo() para cada objeto
        System.out.println("=== Cita 1 ===");
        cita1.showInfo();

        System.out.println("\n=== Cita 2 ===");
        cita2.showInfo();

        System.out.println("\n=== Cita 3 ===");
        cita3.showInfo();

        System.out.println("\n=== Cita 4 ===");
        cita4.showInfo();

        System.out.println("\n=== Cita 5 ===");
        cita5.showInfo();


    }
}
