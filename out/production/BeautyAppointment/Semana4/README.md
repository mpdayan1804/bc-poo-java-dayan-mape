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
