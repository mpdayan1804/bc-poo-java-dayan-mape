Refactorización y Mejora: Encapsulación y Constructores

##  Objetivos Cumplidos

- [x] Todos los atributos de las clases principales son ahora private. El acceso al estado se realiza únicamente a través de métodos públicos (getters y setters).
- [x] Cada clase principal (Client, Specialist, BeautyAppointment) implementa al menos dos constructores (uno completo y uno parcial), haciendo que el constructor parcial llame al constructor completo con valores por defecto (this(...)).
- [x] Se implementan validaciones que lanzan IllegalArgumentException si se intenta crear un objeto o modificar un atributo a un estado inválido (ej: precio negativo, ID cero, nombre muy corto).
- [x] Se utilizaron setters private para atributos que solo deben asignarse una vez (ej: ID) y métodos private (como isValidEmail) para encapsular lógica interna de verificación.

##  Archivos Entregados

- Client.java	Clase Cliente	Mejorada: Encapsulación completa y sobrecarga de constructores (Completo y Parcial).
- Specialist.java	Clase Especialista	Mejorada: Encapsulación, validación en setRole, sobrecarga de constructores.
- BeautyAppointment.java	Clase Cita	Mejorada: Encapsulación, validación en setPrice y setDurationMinutes, sobrecarga de constructores.
- Main.java	Programa de Demostración	Demuestra la creación de objetos usando los múltiples constructores y la captura de las excepciones de validación.
- MEJORAS.md	Documentación	Detalle técnico de la refactorización

##  Instrucciones de Ejecución

```bash
# Navegar al directorio raíz de la Semana 03
cd ruta/a/semana-03

# Compilar todos los archivos .java
javac *.java

# Ejecutar la clase principal Main
java Main
```
## Salida esperada
``` ==================================================
==================================================
PRUEBA SEMANA 03: ENCAPSULACIÓN Y SOBRECARGA
==================================================

--- 1. Sobrecarga y Constructores ---
-> Cliente Registrado:
ID: 1001
Nombre: Carlos Pérez
Teléfono: 3001234567
Email: carlos@mail.com
-> Cliente Registrado:
ID: 1002
Nombre: Ana García
Teléfono: N/A
Email: sin@correo.com
--- Información del Especialista ---
Código: E101
Nombre: Laura Montes
Rol: Estilista
Experiencia: 10 años
--- Información del Especialista ---
Código: E205
Nombre: Daniela Páez
Rol: Asistente
Experiencia: 0 años
--- Cita de Belleza ---
Código: N/A
Cliente: Cliente Anónimo
Servicio: Manicure Express
Precio Final: $35.700,00
--- Cita de Belleza ---
Código: A002
Cliente: Elena Rojas
Servicio: Corte de cabello
Precio Final: $53.550,00

--- 2. Pruebas de Validaciones (Setters y Constructores) ---
Intento de cambiar el rol de Daniel... ÉXITO: Nuevo Rol: Manicurista
Intento de crear un cliente con nombre corto... Intento de asignar un precio negativo...
==================================================
FIN DE LA PRUEBA
==================================================
ERROR: El nombre del cliente debe tener al menos 2 caracteres.
ERROR: El precio del servicio debe ser positivo.

Process finished with exit code 0
```


