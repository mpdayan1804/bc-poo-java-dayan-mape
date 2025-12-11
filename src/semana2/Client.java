// Archivo: semana2/Client.java
package semana2;

public class Client {
    private int clientId;
    private String name;
    private String phone;

    public Client(int clientId, String name, String phone) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío."); // Validación S02
        }
        this.clientId = clientId;
        this.name = name;
        this.phone = phone;
    }
    // ... métodos showClientInfo(), getName()
    public String getName() { return name; }
    public void showClientInfo() {
        System.out.println("-> Cliente Registrado:");
        System.out.println("   ID: " + this.clientId);
        System.out.println("   Nombre: " + this.name);
    }
}