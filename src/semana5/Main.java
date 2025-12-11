package semana5;

// Archivo: semana-05/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRUEBA SEMANA 05: POLIMORFISMO Y SOBRECARGA");
        System.out.println("==================================================");

        // 1. Creación de Objetos (Subclases)
        HairService corteYColor = new HairService("Corte y Color Full", 150000.0, 120, "Senior", true);
        NailService manicurePremium = new NailService("Manicure Gel", 60000.0, 90, true, "NTECH005");
        NailService pedicureBasico = new NailService("Pedicure Básico", 40000.0, 60, false, "NTECH001");

        // 2. Demostración de Sobrecarga (Overloading)
        System.out.println("\n--- 1. Sobrecarga de Métodos (Overloading) ---");
        // Opción 1: Calcular sin descuento (Llama a calcularPrecioFinal())
        System.out.printf("Corte y Color (sin dscto): $%,.2f%n", corteYColor.calcularPrecioFinal());
        // Opción 2: Calcular con descuento (Llama a calcularPrecioFinal(double))
        System.out.printf("Manicure (con 10%% dscto): $%,.2f%n", manicurePremium.calcularPrecioFinal(0.10));

        // 3. Demostración del ArrayList Polimórfico y Sobrescritura (Overriding)
        ServiceManager manager = new ServiceManager();
        manager.addService(corteYColor);
        manager.addService(manicurePremium);
        manager.addService(pedicureBasico);

        // Polimorfismo en tiempo de ejecución:
        // El método procesarCalculoDePrecios() en el Manager llama a la versión SOBRESCRITA
        // de calcularPrecioFinal() (la que incluye recargos específicos) para cada objeto.
        manager.procesarCalculoDePrecios(0.15); // Aplica un 15% de descuento

        // 4. Demostración de toString() con Jerarquía
        System.out.println("\n--- 3. Impresión Polimórfica (toString()) ---");
        System.out.println(corteYColor);
        System.out.println(manicurePremium);

        System.out.println("\n==================================================");
        System.out.println("     FIN DE LA PRUEBA");
        System.out.println("==================================================");
    }
}