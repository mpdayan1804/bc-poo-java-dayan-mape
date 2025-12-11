package semana3;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRUEBA SEMANA 03: ENCAPSULACIÓN Y SOBRECARGA");
        System.out.println("==================================================");

        // --- 1. Demostración de Sobrecarga de Constructores ---
        System.out.println("\n--- 1. Sobrecarga y Constructores ---");

        // Client - Uso del Constructor Completo
        Client client1 = new Client(1001, "Carlos Pérez", "3001234567", "carlos@mail.com");
        client1.showClientInfo();

        // Client - Uso del Constructor Parcial (Sobrecarga)
        Client client2 = new Client(1002, "Ana García");
        client2.showClientInfo(); // Usará valores por defecto (N/A, sin@correo.com)

        // Specialist - Uso del Constructor Completo
        Specialist spec1 = new Specialist("E101", "Laura Montes", "Estilista", 10);
        spec1.showFullInfo();

        // Specialist - Uso del Constructor Parcial (Sobrecarga)
        Specialist spec2 = new Specialist("E205", "Daniela Páez");
        spec2.showFullInfo(); // Usará valores por defecto (Asistente, 0 años)

        // Appointment - Uso del Constructor Parcial (Sobrecarga)
        BeautyAppointment app1 = new BeautyAppointment("Manicure Express", 30000.0);
        app1.showDetails(); // Usará Cliente Anónimo, código N/A

        // Appointment - Uso del Constructor Completo
        BeautyAppointment app2 = new BeautyAppointment("A002", "Elena Rojas", "Corte de cabello", 45000.0, 60);
        app2.showDetails();

        // --- 2. Demostración de Validaciones ---
        System.out.println("\n--- 2. Pruebas de Validaciones (Setters y Constructores) ---");

        // Prueba de Setters (Cambio de Rol y validación implícita)
        try {
            System.out.print("Intento de cambiar el rol de Daniel... ");
            spec2.setRole("Manicurista"); // Esto debe ser exitoso
            System.out.println("ÉXITO: Nuevo Rol: " + spec2.getRole());
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        // Prueba de Constructor y Setters (Error esperado)
        try {
            System.out.print("Intento de crear un cliente con nombre corto... ");
            Client clientError = new Client(1003, "J"); // Falla en el setter del constructor
            clientError.setName(""); // Falla en el setter
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        try {
            System.out.print("Intento de asignar un precio negativo... ");
            BeautyAppointment appError = new BeautyAppointment("Servicio de Prueba", -10.0); // Falla en el setter del constructor
        } catch (IllegalArgumentException e) {
            System.err.println(" ERROR: " + e.getMessage());
        }

        System.out.println("\n==================================================");
        System.out.println("     FIN DE LA PRUEBA");
        System.out.println("==================================================");
    }
}