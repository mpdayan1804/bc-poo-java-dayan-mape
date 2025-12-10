package semana1;

public class Specialist {
    // ---------------------- INICIO DE ATRIBUTOS ----------------------
    private String employeeCode;
    private String name;
    private String role;
    private int experienceYears;
    // ----------------------- FIN DE ATRIBUTOS ------------------------

    // ---------------------- INICIO DE CONSTRUCTOR --------------------
    public Specialist(String employeeCode, String name, String role, int experienceYears) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.role = role;
        this.experienceYears = experienceYears;
    }
    // ----------------------- FIN DE CONSTRUCTOR ----------------------

    // ---------------------- INICIO DE MÉTODOS ----------------------
    public boolean canPerformService(String service) {
        String lowerRole = this.role.toLowerCase();
        String lowerService = service.toLowerCase();

        if (lowerService.contains("manicure") || lowerService.contains("pedicure")) {
            return lowerRole.equals("manicurista");
        } else if (lowerService.contains("corte") || lowerService.contains("color") || lowerService.contains("keratina")) {
            return lowerRole.equals("estilista");
        } else if (lowerService.contains("maquillaje")) {
            return lowerRole.equals("maquillador");
        }

        return lowerRole.equals("estilista");
    }

    public void showFullInfo() {
        System.out.println("--- Información del Especialista ---");
        System.out.println("Código: " + this.employeeCode);
        System.out.println("Nombre: " + this.name);
        System.out.println("Rol: " + this.role);
        System.out.println("Experiencia: " + this.experienceYears + " años");
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    // ----------------------- FIN DE MÉTODOS ------------------------
}