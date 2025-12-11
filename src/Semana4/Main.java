package Semana4;

// Archivo: semana-04/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRUEBA SEMANA 04: HERENCIA Y toString()");
        System.out.println("==================================================");

        // 1. Creación de Objetos (Subclases)

        // Subclase 1
        HairService corteYColor = new HairService(
                "Corte y Color Full", 150000.0, 120, "Senior", true
        );

        // Subclase 2
        NailService manicurePremium = new NailService(
                "Manicure Gel", 60000.0, 90, true, "NTECH005"
        );

        // Subclase 2 (Sin diseño)
        NailService pedicureBasico = new NailService(
                "Pedicure Básico", 40000.0, 60, false, "NTECH001"
        );

        // 2. Demostración del método toString() sobrescrito (Requisito)
        System.out.println("\n--- 1. Impresión de Objetos con toString() ---");
        System.out.println("Corte y Color: " + corteYColor);
        System.out.println("Manicure Premium: " + manicurePremium);

        // 3. Demostración de Polimorfismo y Colecciones
        System.out.println("\n--- 2. Polimorfismo (Lista de Servicios) ---");

        // Lista capaz de guardar objetos de la clase Padre (Service)
        List<Service> agendaServicios = new ArrayList<>();
        agendaServicios.add(corteYColor);
        agendaServicios.add(manicurePremium);
        agendaServicios.add(pedicureBasico);

        // Iteramos sobre la lista del TIPO PADRE (Service)
        for (Service servicio : agendaServicios) {
            // Se llama al método getServiceDetails() de la CLASE HIJA correspondiente (Polimorfismo)
            System.out.println("-> " + servicio.getServiceDetails());
        }

        System.out.println("\n==================================================");
        System.out.println("     FIN DE LA PRUEBA");
        System.out.println("==================================================");
    }
}
