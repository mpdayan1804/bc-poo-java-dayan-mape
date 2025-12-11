Implementación de un modelo inicial de clases en Java para el dominio de negocio *Sala de Belleza - Estilo y Glamour*. El objetivo fue aplicar los conceptos básicos de POO, como Clases, Objetos, Atributos, Métodos y Encapsulación, mediante la creación de dos entidades principales y un programa de prueba.

##  Objetivos Cumplidos

- [x] Implementar clase principal del dominio (BeautyAppointment.java)
- [x] Implementar clase secundaria relacionada (Specialist.java)
- [x] Crear programa de demostración (Main.java)
- [x] Documentar análisis del dominio (ANALISIS.md)

##  Archivos Entregados

- src/BeautyAppointment.java - Clase Principal: Modela la cita, el servicio, el precio y el cálculo del impuesto (IVA).
- src/Specialist.java - Clase Secundaria: Modela al empleado, su rol, experiencia, y contiene la lógica para verificar su competencia para un servicio.
- src/Main.java - Programa de demostración que crea objetos y prueba la interacción entre la cita y el especialista.
- docs/ANALISIS.md - Análisis detallado del diseño de clases, la aplicación de la Encapsulación, y las decisiones de diseño tomadas.

##  Instrucciones de Ejecución

Asumiendo que los archivos .java se encuentran dentro de una carpeta src (o semana1), se compilan y ejecutan de la siguiente manera:

```bash
# Navegar a la carpeta donde están los archivos Java
cd src 

# Compilar todos los archivos .java
javac *.java

# Ejecutar la clase principal Main
java Main
```
## Salida esperada 
``` ==================================================
     PRUEBA DEL SISTEMA ESTILO Y GLAMOUR
==================================================

--- 1. Creación y Prueba de Especialistas ---
--- Información del Especialista ---
Código: E101
Nombre: Laura Montes
Rol: Estilista
Experiencia: 10 años
--- Información del Especialista ---
Código: E205
Nombre: Daniela Páez
Rol: Manicurista
Experiencia: 5 años

--- 2. Creación y Prueba de Citas ---
--- Cita de Belleza ---
Código de Cita: A001
Cliente: Carlos Pérez
Servicio: Corte de cabello
Duración Estimada: 60 minutos
Precio Base: $45.000,00
Impuesto (19%): $8.550,00
Precio Final: $53.550,00
--- Cita de Belleza ---
Código de Cita: A002
Cliente: Ana García
Servicio: Manicure y Pedicure
Duración Estimada: 90 minutos
Precio Base: $65.000,00
Impuesto (19%): $12.350,00
Precio Final: $77.350,00

--- 3. Demostración de Lógica y Comportamiento ---
Verificación de Cita A001 (Corte de cabello):
¿Laura Montes (Estilista) puede hacer este servicio?  SÍ
¿Daniela Páez (Manicurista) puede hacer este servicio? NO
Verificación de Cita A002 (Manicure y Pedicure):
¿Daniela Páez (Manicurista) puede hacer este servicio? SÍ

==================================================
     FIN DE LA PRUEBA
==================================================
```