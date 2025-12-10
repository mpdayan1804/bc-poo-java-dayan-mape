# Análisis del Dominio: Sala de Belleza - Estilo y Glamour

## 1. Identificación de Objetos

### Objeto Principal: BeautyAppointment (Cita de Belleza)

- *Justificación:* La gestión de las citas y los servicios es la operación central y la principal fuente de ingresos del negocio. Este objeto debe encapsular la información esencial de cada transacción de servicio.
- *Atributos identificados:*
    - appointmentCode (String)
    - clientName (String)
    - serviceName (String)
    - price (double)
    - durationMinutes (int)
- *Comportamientos:*
    - calculateTax(): Calculo de la regla de negocio (Impuesto/IVA).
    - showDetails(): Muestra de forma estructurada los detalles de la cita.

### Objeto Secundario: Specialist (Especialista/Estilista)

- *Justificación:* El personal es el recurso clave que presta los servicios. Es necesario modelar sus habilidades y roles para la asignación de citas.
- *Relación con objeto principal:* Un Specialist es el responsable de realizar una BeautyAppointment. El objeto Main usa la lógica del Specialist para validar si puede tomar una cita específica.
- *Atributos identificados:*
    - employeeCode (String)
    - name (String)
    - role (String)
    - experienceYears (int)
- *Comportamientos:*
    - canPerformService(String service): Lógica para verificar si su role coincide con el serviceName requerido por la cita.
    - showFullInfo(): Presentación de la información del empleado.

---

## 2. Diagrama de Clases (Descripción Textual UML Simplificada)

| Clase: *BeautyAppointment* | Clase: *Specialist* |
| :--- | :--- |
| *- appointmentCode: String* | *- employeeCode: String* |
| *- clientName: String* | *- name: String* |
| *- price: double* | *- role: String* |
| *+ BeautyAppointment(...)* | *- experienceYears: int* |
| *+ calculateTax(): double* | *+ Specialist(...)* |
| *+ showDetails(): void* | *+ canPerformService(service: String): boolean* |
| | *+ showFullInfo(): void* |

*(Nota: Aunque se puede insertar un diagrama de clases UML, se proporciona esta descripción textual en caso de que las herramientas de marcado no sean permitidas. Se han usado los símbolos - para atributos private y + para métodos public.)*

---

## 3. Decisiones de Diseño

### A. ¿Por qué elegí estos atributos?

* *Identificación y Operación:* Se eligieron atributos mínimos pero suficientes para identificar (appointmentCode, employeeCode), describir (serviceName, name) y operar (price, role, durationMinutes) dentro del contexto de una cita y un recurso humano en el salón.
* *Encapsulación:* Todos los atributos fueron declarados como **private*. Esto asegura la **Encapsulación*, protegiendo el estado interno de los objetos y permitiendo que la clase controle cómo y cuándo se accede o modifica la información (aunque en este ejercicio solo se implementaron Getters).

[Image of Encapsulation in OOP]


### B. ¿Qué validaciones implementé?

* **Lógica de Negocio en Specialist:** La validación clave se encuentra en el método canPerformService(String service). Este método implementa una regla de negocio que verifica si el role del especialista (ej., "Manicurista") tiene la competencia para realizar el service solicitado (ej., "Manicure y Pedicure"). Esto evita la asignación incorrecta de tareas.
* *Constantes:* Se usó private static final double TAX_RATE = 0.19; en BeautyAppointment para mantener la tasa de impuesto como un valor único e inmutable, mejorando la mantenibilidad.

### C. ¿Qué relaciones identifiqué?

* *Relación de Uso (Dependencia):* La clase Main.java demuestra una relación de *Uso (o Dependencia)* entre BeautyAppointment y Specialist. El programa principal obtiene el serviceName de un objeto BeautyAppointment y se lo pasa como argumento al método canPerformService() del objeto Specialist. Los objetos interactúan para resolver la lógica de negocio.

---

## 4. Dificultades Encontradas

* **Lógica de canPerformService:** La principal dificultad fue implementar de manera flexible el método canPerformService() para que pudiera manejar variaciones en los nombres de servicio (ej., "Manicure" vs "Manicure y Pedicure"). *Solución:* Se optó por convertir tanto el rol como el servicio a minúsculas (toLowerCase()) y usar el método contains() para buscar palabras clave ("manicure", "corte") dentro del nombre del servicio.