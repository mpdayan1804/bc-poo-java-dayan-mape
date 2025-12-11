package semana3;

public class Specialist {
    private String employeeCode;
    private String name;
    private String role;
    private int experienceYears;

    // CONSTRUCTOR 1: COMPLETO (Todos los campos)
    public Specialist(String employeeCode, String name, String role, int experienceYears) {
        setEmployeeCode(employeeCode);
        setName(name);
        setRole(role);
        setExperienceYears(experienceYears);
    }

    // CONSTRUCTOR 2: PARCIAL (Solo código y nombre)
    // Sobrecarga de Constructores (Requisito S03)
    public Specialist(String employeeCode, String name) {
        this(employeeCode, name, "Asistente", 0); // Llama al constructor completo con valores por defecto
    }

    // --- GETTERS ---
    public String getEmployeeCode() { return employeeCode; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public int getExperienceYears() { return experienceYears; }

    // --- SETTERS CON VALIDACIÓN (Requisito S03) ---
    private void setEmployeeCode(String code) {
        if (code == null || code.length() != 4 || !code.startsWith("E")) {
            throw new IllegalArgumentException("El código de empleado debe tener 4 caracteres y empezar con 'E'.");
        }
        this.employeeCode = code;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 3) {
            throw new IllegalArgumentException("El nombre del especialista es muy corto.");
        }
        this.name = name;
    }

    public void setRole(String role) {
        // Validación: el rol debe ser uno de los permitidos
        if (!role.matches("Estilista|Manicurista|Maquillador|Asistente")) {
            throw new IllegalArgumentException("Rol de especialista inválido: " + role);
        }
        this.role = role;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0 || experienceYears > 50) {
            throw new IllegalArgumentException("La experiencia debe ser un valor razonable (0-50).");
        }
        this.experienceYears = experienceYears;
    }

    // Método canPerformService (Lógica de Negocio S01/S02)
    public boolean canPerformService(String service) {
        // Lógica de validación de rol de la semana 01/02
        String lowerRole = this.role.toLowerCase();
        String lowerService = service.toLowerCase();

        if (lowerService.contains("manicure") || lowerService.contains("pedicure")) {
            return lowerRole.equals("manicurista");
        } else if (lowerService.contains("corte") || lowerService.contains("color")) {
            return lowerRole.equals("estilista");
        }
        return false;
    }

    public void showFullInfo() {
        System.out.println("--- Información del Especialista ---");
        System.out.println("Código: " + this.employeeCode);
        System.out.println("Nombre: " + this.name);
        System.out.println("Rol: " + this.role);
        System.out.println("Experiencia: " + this.experienceYears + " años");
    }
}