Aplicación de Polimorfismo: Flexibilidad en el Cálculo de Precios

##  Objetivos Cumplidos

- [x] Implementación con 0 argumentos (sin descuento) y 1 argumento (con tasa de descuento).
- [x] Se sobrescribe el cálculo en los hijos para incluir la lógica de recargos (COLOR_SURCHARGE, ART_DESIGN_COST).
- [x] Método que acepta la clase padre (Service) como parámetro, procesando cualquier subclase derivada.
- [x] El programa demuestra la sobrecarga, la sobrescritura y la iteración polimórfica en colecciones.

##  Archivos Entregados

- Service.java	Clase Padre	Sobrecarga de calcularPrecioFinal().
- HairService.java	Subclase 1	Sobrescritura (@Override) con lógica de recargo por color.
- NailService.java	Subclase 2	Sobrescritura (@Override) con lógica de recargo por diseño de arte.
- ServiceManager.java	Clase Gestora	Implementa el Polimorfismo en tiempo de ejecución.
- Main.java	Demostración	Prueba todos los escenarios de sobrecarga y el polimorfismo dinámico.
- POLIMORFISMO.md	Documentación	Detalle técnico de la aplicación del Polimorfismo.

##  Instrucciones de Ejecución

```bash
# Navegar al directorio de la Semana 05
cd ruta/a/semana-05 

# Compilar todos los archivos .java
javac *.java

# Ejecutar la clase principal Main
java Main
```
## Salida esperada
``` ==================================================
