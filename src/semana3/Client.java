package semana3;

public class Client {
    private int clientId;
    private String name;
    private String phone;
    private String email; // Nuevo atributo para encapsulación completa

    // CONSTRUCTOR 1: COMPLETO (Obliga a pasar todos los datos)
    public Client(int clientId, String name, String phone, String email) {
        setClientId(clientId);
        setName(name);
        setPhone(phone);
        setEmail(email);
    }

    // CONSTRUCTOR 2: PARCIAL (Solo ID y Nombre)
    // Sobrecarga de Constructores (Requisito S03)
    public Client(int clientId, String name) {
        this(clientId, name, "N/A", "sin@correo.com"); // Llama al constructor completo
    }

    // --- GETTERS ---
    public int getClientId() { return clientId; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    // --- SETTERS CON VALIDACIÓN (Requisito S03) ---
    private void setClientId(int clientId) {
        if (clientId <= 0) {
            throw new IllegalArgumentException("ID de cliente debe ser positivo.");
        }
        this.clientId = clientId;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("El nombre del cliente debe tener al menos 2 caracteres.");
        }
        this.name = name;
    }

    public void setPhone(String phone) {
        // Validación: simple chequeo de que no sea nulo/vacío
        if (phone == null || phone.isEmpty()) {
            System.err.println("Advertencia: Teléfono no proporcionado. Usando 'N/A'.");
            this.phone = "N/A";
        } else {
            this.phone = phone;
        }
    }

    // Método auxiliar (Ejemplo de private helper method)
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("El formato del email es inválido.");
        }
        this.email = email;
    }

    public void showClientInfo() {
        System.out.println("-> Cliente Registrado:");
        System.out.println("   ID: " + this.clientId);
        System.out.println("   Nombre: " + this.name);
        System.out.println("   Teléfono: " + this.phone);
        System.out.println("   Email: " + this.email);
    }
}
