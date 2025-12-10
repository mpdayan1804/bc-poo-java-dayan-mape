package semana1;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRUEBA DEL SISTEMA ESTILO Y GLAMOUR");
        System.out.println("==================================================");

        // 1. Crear objetos Especialistas (Clase Specialist)
        System.out.println("\n--- 1. Creación y Prueba de Especialistas ---");

        Specialist estilistaPrincipal = new Specialist("E101", "Laura Montes", "Estilista", 10);
        Specialist manicurista = new Specialist("E205", "Daniela Páez", "Manicurista", 5);

        // Muestra la información de los especialistas
        estilistaPrincipal.showFullInfo();
        manicurista.showFullInfo();

        // 2. Crear objetos Citas (Clase BeautyAppointment)
        System.out.println("\n--- 2. Creación y Prueba de Citas ---");

        // Cita 1: Corte de cabello
        BeautyAppointment citaCorte = new BeautyAppointment("A001", "Carlos Pérez", "Corte de cabello", 45000, 60);

        // Cita 2: Manicure y Pedicure
        BeautyAppointment citaManicure = new BeautyAppointment("A002", "Ana García", "Manicure y Pedicure", 65000, 90);

        // Muestra la información de la primera cita (incluyendo el cálculo del impuesto)
        citaCorte.showDetails();

        // Muestra la información de la segunda cita
        citaManicure.showDetails();


        // 3. Demostración de Lógica: Interacción de Objetos
        System.out.println("\n--- 3. Demostración de Lógica y Comportamiento ---");

        // Prueba 1: ¿Puede el estilista hacer el corte?
        String servicioCorte = citaCorte.getServiceName();
        boolean puedeEstilista = estilistaPrincipal.canPerformService(servicioCorte);

        System.out.println("Verificación de Cita A001 (" + servicioCorte + "):");
        System.out.println("¿" + estilistaPrincipal.getName() + " (" + estilistaPrincipal.getRole() + ") puede hacer este servicio? "
                + (puedeEstilista ? " SÍ" : " NO"));

        // Prueba 2: ¿Puede la manicurista hacer el corte? (Debe ser NO)
        boolean puedeManicuristaCorte = manicurista.canPerformService(servicioCorte);
        System.out.println("¿" + manicurista.getName() + " (" + manicurista.getRole() + ") puede hacer este servicio? "
                + (puedeManicuristaCorte ? "SÍ" : "NO"));

        // Prueba 3: ¿Puede la manicurista hacer el manicure? (Debe ser SÍ)
        String servicioManicure = citaManicure.getServiceName();
        boolean puedeManicuristaManicure = manicurista.canPerformService(servicioManicure);
        System.out.println("Verificación de Cita A002 (" + servicioManicure + "):");
        System.out.println("¿" + manicurista.getName() + " (" + manicurista.getRole() + ") puede hacer este servicio? "
                + (puedeManicuristaManicure ? "SÍ" : "NO"));

        System.out.println("\n==================================================");
        System.out.println("     FIN DE LA PRUEBA");
        System.out.println("==================================================");
    }
}