# 📄 MEJORAS.md - Semana 03: Encapsulación y Sobrecarga

## Dominio: Sala de Belleza - Estilo y Glamour

Este documento detalla la refactorización realizada para aplicar la encapsulación completa, la sobrecarga de constructores y las validaciones, cumpliendo con los objetivos de la Semana 03.

### 1. Aplicación de Encapsulación Completa

| Clase | Cambio Realizado | Justificación |
| :--- | :--- | :--- |
| **Todas** | Todos los atributos cambiaron de `public` (o predeterminado) a `private`. | Garantiza que el estado interno solo se acceda y modifique a través de *getters* y *setters*, protegiendo la integridad del objeto. |
| **Todas** | Se añadieron *getters* (`public`) para la lectura de todos los atributos. | Permite consultar el estado del objeto sin exponer directamente la variable `private`. |
| **Todas** | Se implementaron *setters* (`public`) para la mayoría de atributos, delegando la asignación a la lógica de validación. | Permite cambiar el estado del objeto de forma controlada y segura (validación). |

### 2. Sobrecarga de Constructores (Múltiples Constructores)

Se implementaron al menos dos constructores en las clases principales, haciendo que el constructor parcial llame al constructor completo (`this(...)`) con valores predeterminados seguros.

| Clase | Constructor 1 (Completo) | Constructor 2 (Parcial/Sobrecarga) |
| :--- | :--- | :--- |
| **`Client`** | `Client(int id, String name, String phone, String email)` | `Client(int id, String name)` |
| **`Specialist`** | `Specialist(String code, String name, String role, int years)` | `Specialist(String code, String name)` |
| **`BeautyAppointment`** | `BeautyAppointment(String code, String client, String service, double price, int duration)` | `BeautyAppointment(String service, double price)` |

### 3. Implementación de Validaciones Robustas

Se incorporaron validaciones en los *setters* y constructores para prevenir la creación de objetos en estados inválidos, lanzando `IllegalArgumentException` si la validación falla.

| Clase | Atributo Validado | Regla de Validación Aplicada |
| :--- | :--- | :--- |
| **`Client`** | `name`, `clientId`, `email` | Nombre no puede ser demasiado corto; ID debe ser positivo; el email debe tener un formato básico válido. |
| **`Specialist`** | `employeeCode`, `role`, `experienceYears` | El código de empleado debe seguir un formato específico; el rol debe ser uno de los roles permitidos; los años de experiencia deben ser razonables. |
| **`BeautyAppointment`**| `price`, `durationMinutes` | El precio y la duración deben ser valores positivos y mayores a un mínimo establecido. |

### 4. Modificadores de Acceso y Métodos Auxiliares

* **Constructores/Setters Privados:** En `Client` y `Specialist`, los *setters* de atributos clave (como `clientId` o `employeeCode`) se hicieron `private` para garantizar que solo se puedan asignar una vez a través del constructor.
* **Métodos Auxiliares Privados:** Se implementó `private boolean isValidEmail(String email)` en la clase `Client` como ejemplo de un método auxiliar que encapsula lógica de verificación.