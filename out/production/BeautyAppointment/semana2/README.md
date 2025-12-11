Gestión de Citas de Belleza: Expansión del Sistema
##  Objetivos Cumplidos

- [x] Se crearon las nuevas entidades Client y Service para detallar la información del cliente y el servicio.
- [x] El Manager establece la Asociación Dinámica leyendo datos de la cita (S01) y buscando los objetos Client (S02) y Specialist (S01) en sus listas.
- [x] Utilizado para gestionar colecciones de BeautyAppointment, Client, y Specialist.
- [x] El Manager interactúa con las tres colecciones para buscar y mostrar la información completa y asociada de cada cita
- [x] Se implementa la Validación de Negocio comprobando que el Specialist (S01) sea apto para el servicio (S01) antes de agendar la cita.

##  Archivos Entregados

- Client.java	Nueva Clase 1 (Cliente).
- Service.java	Nueva Clase 2 (Servicio).
- AppointmentManager.java	Clase Gestora (ArrayList, Lógica de Relación).
- Main.java	Programa de Demostración Completo.
- README.md	Documento actual.

##  Instrucciones de Ejecución

```bash
# Navegar a la carpeta raíz
cd ruta/a/semana-02	Es crucial estar en el directorio que contiene semana1 y semana2.

# Compilar todos los archivos .java
javac semana1/*.java semana2/*.java	Este comando compila ambos paquetes, resolviendo las dependencias entre S02 y S01.

# Ejecutar la clase principal Main
java semana2.MainEjecuta el programa principal, especificando que se encuentra dentro del paquete semana2.
```
## Salida esperada
``` ==================================================
C:\jdk-21\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.3\lib\idea_rt.jar=53009" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\DELL\Documents\JUEVES-\opp-java\BeautyAppointment\out\production\BeautyAppointment semana2.Main
==================================================
     PRUEBA SEMANA 02: GESTIÓN DE CITAS (Relación S01/S02)
==================================================
--- 1. Componentes cargados en el Gestor ---
--- 2. Agendando Citas y Validando Roles ---
✅ Cita A001 agendada exitosamente con Laura Montes.
✅ Cita A002 agendada exitosamente con Daniela Páez.
--- 3. Prueba de Validación Fallida ---
VALIDACIÓN FALLIDA: Daniela Páez (Manicurista) no puede realizar el servicio de Corte de cabello

================ AGENDA DETALLADA (Salón Estilo y Glamour) ================

*** Cita N°: A001 ***
-> Cliente Registrado:
   ID: 1001
   Nombre: Carlos Pérez
-> Especialista Asignado (S01): Laura Montes (Estilista)
--- Cita de Belleza ---
Código de Cita: A001
Cliente: Carlos Pérez
Servicio: Corte de cabello
Duración Estimada: 60 minutos
Precio Base: $45.000,00
Impuesto (19%): $8.550,00
Precio Final: $53.550,00

*** Cita N°: A002 ***
-> Cliente Registrado:
   ID: 1002
   Nombre: Ana García
-> Especialista Asignado (S01): Daniela Páez (Manicurista)
--- Cita de Belleza ---
Código de Cita: A002
Cliente: Ana García
Servicio: Manicure y Pedicure
Duración Estimada: 90 minutos
Precio Base: $65.000,00
Impuesto (19%): $12.350,00
Precio Final: $77.350,00
==================================================
     FIN DE LA PRUEBA - REQUISITOS CUMPLIDOS
==================================================

Process finished with exit code 0
```