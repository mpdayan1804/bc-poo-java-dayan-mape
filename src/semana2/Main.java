// Archivo: semana2/Main.java
package semana2;

// Main solo necesita importar las clases de su paquete o usar el nombre completo (semana1.Specialist)
import semana1.Specialist;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRUEBA SEMANA 02: GESTIÓN DE CITAS (Relación S01/S02)");
        System.out.println("==================================================");

        // 1. Inicialización de Componentes S01 y S02

        // Clases S01 (Deben ser importadas o creadas con el nombre completo si no hay import)
        Specialist laura = new Specialist("E101", "Laura Montes", "Estilista", 10);
        Specialist daniela = new Specialist("E205", "Daniela Páez", "Manicurista", 5);

        // Clases Nuevas (S02)
        Client carlos = new Client(1001, "Carlos Pérez", "3001234567");
        Client ana = new Client(1002, "Ana García", "3109876543");

        // Service solo se usa para validar datos, no se instancia aquí.

        // 2. Creación del Gestor (ClaseGestora con ArrayList)
        AppointmentManager manager = new AppointmentManager("Salón Estilo y Glamour");

        // 3. Cargar Objetos Base al Gestor (Simula la 'Base de Datos' y crea la relación)
        manager.addSpecialist(laura);
        manager.addSpecialist(daniela);
        manager.addClient(carlos);
        manager.addClient(ana);
        System.out.println("--- 1. Componentes cargados en el Gestor ---");

        // 4. Agendar Citas y Demostrar Relaciones/Validaciones
        System.out.println("--- 2. Agendando Citas y Validando Roles ---");

        try {
            // Cita 1: Correcta (Estilista -> Corte)
            manager.tryAddAppointment(
                    "A001", carlos.getName(), "Corte de cabello", 45000.0, 60, laura.getName()
            );

            // Cita 2: Correcta (Manicurista -> Manicure)
            manager.tryAddAppointment(
                    "A002", ana.getName(), "Manicure y Pedicure", 65000.0, 90, daniela.getName()
            );

            // 5. Demostración de Validación (ERROR ESPERADO)
            // Intento de asignar servicio de corte a la manicurista (Daniela)
            System.out.println("--- 3. Prueba de Validación Fallida ---");
            manager.tryAddAppointment(
                    "A004", ana.getName(), "Corte de cabello", 45000.0, 60, daniela.getName()
            );

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // 6. Demostración del ArrayList y Método Complejo
        manager.showDetailedAgenda();

        System.out.println("==================================================");
        System.out.println("     FIN DE LA PRUEBA - REQUISITOS CUMPLIDOS");
        System.out.println("==================================================");
    }
}
