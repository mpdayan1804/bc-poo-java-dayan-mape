# 📄 JERARQUIA.md - Semana 04: Herencia

## Dominio: Sala de Belleza - Estilo y Glamour

### 1. Identificación de Jerarquía "es-un"

Se identificó una jerarquía dentro de la clase de servicios, ya que muchos servicios comparten atributos básicos (nombre, precio, duración), pero difieren en sus características específicas y métodos de cálculo.

* **Relación:** Un Servicio de Cabello **es un** Servicio. Un Servicio de Uñas **es un** Servicio.

### 2. Estructura de Clases

| Clase | Tipo | Propósito | Atributos Compartidos | Métodos Sobrescritos |
| :--- | :--- | :--- | :--- | :--- |
| **`Service`** | Clase Padre (Base) | Define los atributos comunes a todos los servicios y el constructor `super()`. Es abstracta. | `serviceName`, `basePrice`, `durationMinutes` | `toString()`, `getServiceDetails()` (abstracto) |
| **`HairService`** | Subclase | Maneja la lógica específica de servicios de estilismo (ej: nivel de estilista, recargo por color). | N/A | `getServiceDetails()`, `toString()` |
| **`NailService`** | Subclase | Maneja la lógica específica de servicios de manicura/pedicura (ej: diseño de arte, código de técnico). | N/A | `getServiceDetails()`, `toString()` |

### 3. Uso de Herencia

* **Implementación:** Las clases `HairService` y `NailService` utilizan la palabra clave `extends Service`.
* **Constructores:** Ambas subclases llaman al constructor de la clase padre (`Service`) utilizando `super(...)` para inicializar los atributos heredados.
* **Métodos `protected`:** Los atributos comunes en la clase padre (`basePrice`, `durationMinutes`) se declararon como `protected` para permitir el acceso directo en las subclases para realizar cálculos específicos.

### 4. Demostración de Polimorfismo

En `Main.java`, se crea una `List<Service>` que contiene instancias de `HairService` y `NailService`. Al iterar sobre esta lista y llamar a `servicio.getServiceDetails()`, Java ejecuta automáticamente la implementación correcta del método que corresponde a la clase hija (polimorfismo).
