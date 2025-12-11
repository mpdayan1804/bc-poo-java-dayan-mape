// Archivo: semana2/AppointmentManager.java
package semana2;

import java.util.ArrayList;
import java.util.List;
import semana1.BeautyAppointment; // Importa la clase S01
import semana1.Specialist;      // Importa la clase S01

public class AppointmentManager {
    // Colecciones de objetos de S01 y S02 (ArrayList)
    private List<BeautyAppointment> appointmentsList;
    private List<Specialist> specialistList;
    private List<Client> clientList;

    private String centerName;

    public AppointmentManager(String centerName) {
        this.centerName = centerName;
        this.appointmentsList = new ArrayList<>();
        this.specialistList = new ArrayList<>();
        this.clientList = new ArrayList<>();
    }

    public void addSpecialist(Specialist specialist) {
        this.specialistList.add(specialist);
    }

    public void addClient(Client client) {
        this.clientList.add(client);
    }

    /**
     * Crea la Cita S01 solo si la lógica de negocio (S02) lo permite.
     * Esto implementa la Relación (Specialist se usa para validar el servicio).
     */
    public void tryAddAppointment(
            String appointmentCode, String clientName, String serviceName,
            double price, int durationMinutes, String specialistName
    ) {
        Specialist specFound = findSpecialistByName(specialistName);

        if (specFound == null) {
            System.err.println("ERROR: Especialista " + specialistName + " no encontrado.");
            return;
        }

        // Validación S02 usando la lógica de Specialist S01
        if (!specFound.canPerformService(serviceName)) {
            throw new IllegalArgumentException(
                    "VALIDACIÓN FALLIDA: " + specFound.getName() + " (" + specFound.getRole() +
                            ") no puede realizar el servicio de " + serviceName
            );
        }

        // Crea el objeto S01 (sin modificación)
        BeautyAppointment newAppointment = new BeautyAppointment(
                appointmentCode, clientName, serviceName, price, durationMinutes
        );

        this.appointmentsList.add(newAppointment);
        System.out.println("✅ Cita " + appointmentCode + " agendada exitosamente con " + specialistName + ".");
    }

    private Specialist findSpecialistByName(String name) {
        for (Specialist spec : specialistList) {
            if (spec.getName().equalsIgnoreCase(name)) { return spec; }
        }
        return null;
    }

    private Client findClientByName(String name) {
        for (Client client : clientList) {
            if (client.getName().equalsIgnoreCase(name)) { return client; }
        }
        return null;
    }

    /**
     * Método complejo que demuestra la relación S02: 
     * Muestra información de los objetos S02/S01 relacionados con la Cita S01.
     */
    public void showDetailedAgenda() {
        System.out.println("\n================ AGENDA DETALLADA (" + this.centerName + ") ================");
        if (this.appointmentsList.isEmpty()) {
            System.out.println("No hay citas programadas."); return;
        }

        for (BeautyAppointment appointment : this.appointmentsList) {
            Client clientInfo = findClientByName(appointment.getClientName());
            // Simulamos la asignación del especialista que hizo la cita S01
            Specialist assignedSpec = findSpecialistForService(appointment.getServiceName());

            System.out.println("\n*** Cita N°: " + appointment.getAppointmentCode() + " ***");

            // Muestra información de las clases S02 (Client)
            if (clientInfo != null) clientInfo.showClientInfo();

            // Muestra información de las clases S01 (Specialist)
            if (assignedSpec != null) {
                System.out.println("-> Especialista Asignado (S01): " + assignedSpec.getName() + " (" + assignedSpec.getRole() + ")");
            }

            // Muestra los detalles de la cita S01
            appointment.showDetails();
        }
    }

    // Método auxiliar (Simulación de asignación)
    private Specialist findSpecialistForService(String serviceName) {
        if (serviceName.toLowerCase().contains("manicure")) {
            return findSpecialistByName("Daniela Páez");
        } else if (serviceName.toLowerCase().contains("corte")) {
            return findSpecialistByName("Laura Montes");
        }
        return null;
    }
}