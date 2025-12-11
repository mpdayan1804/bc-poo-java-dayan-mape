Implementación de Herencia: Jerarquía de Servicios de Belleza

##  Objetivos Cumplidos

- [x] Se define la clase base que contiene atributos comunes (serviceName, basePrice, etc.) como protected.
- [x] Clases específicas que añaden atributos únicos (ej: stylistLevel en cabello, hasArtDesign en uñas).
- [x] Ambas subclases utilizan extends Service y llaman al constructor de la clase padre con super(nombre, precio, etc) para inicializar los atributos heredados.
- [x] Se sobrescribe el método getServiceDetails() y el método toString() (@Override) en las subclases para incluir su información especializada.
- [x] Se utiliza una colección (List<Service>) que almacena objetos de diferentes subclases, y se llama a un método común (getServiceDetails()) para demostrar que se ejecuta la versión de la clase hija.

##  Archivos Entregados

- Service.java	Clase Padre	Define la estructura base y el método toString() base.
- HairService.java	Subclase 1	Servicios de cabello. Llama a super() y sobrescribe la lógica de precio/detalle.
- NailService.java	Subclase 2	Servicios de uñas. Llama a super() y sobrescribe la lógica de precio/detalle.
- Main.java	Demostración	Crea subclases, las inserta en una List<Service> y demuestra el Polimorfismo y el toString().
- JERARQUIA.md	Documentación	Explica la decisión de diseño y la aplicación de protected y super().

##  Instrucciones de Ejecución

```bash
# Navegar a la carpeta de la Semana 04
cd ruta/a/semana-04 

# Compilar todos los archivos .java
javac *.java

# Ejecutar la clase principal Main
java Main
```
## Salida esperada
``` ==================================================
==================================================
PRUEBA SEMANA 04: HERENCIA Y toString()
==================================================

--- 1. Impresión de Objetos con toString() ---
Corte y Color: Servicio Base: Corte y Color Full | Precio: $150.000,00 | Duración: 120 min | Nivel: Senior | Color Extra: Sí
Manicure Premium: Servicio Base: Manicure Gel | Precio: $60.000,00 | Duración: 90 min | Diseño de Arte: Sí | Técnico: NTECH005

--- 2. Polimorfismo (Lista de Servicios) ---
-> Servicio de Cabello (Corte y Color Full) | Nivel Estilista: Senior | Precio Total: $200.000,00
-> Servicio de Uñas (Manicure Gel) | Técnico ID: NTECH005 | Precio Total: $80.000,00
-> Servicio de Uñas (Pedicure Básico) | Técnico ID: NTECH001 | Precio Total: $40.000,00

==================================================
FIN DE LA PRUEBA
==================================================

Process finished with exit code 0
```
