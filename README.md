# Estilo y Glamour: sistema de citas para sala de belleza (POO en Java)

![Java](https://img.shields.io/badge/Java-17+-ED8B00?logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)

Proyecto del Bootcamp de Programación Orientada a Objetos. Modela el negocio de la sala de belleza **"Estilo y Glamour"**: especialistas, clientes, servicios (cabello y uñas) y agendamiento de citas. El proyecto crece semana a semana aplicando los pilares de la POO.

## Lo que demuestra este proyecto

- **Modelado de dominio** con clases y relaciones entre objetos (`BeautyAppointment`, `Specialist`, `Client`, `Service`, `AppointmentManager`).
- **Encapsulación**: atributos privados, getters/setters con validaciones y constructores sobrecargados.
- **Herencia**: jerarquía `Service` → `HairService` / `NailService` con `super` y `toString()`.
- **Polimorfismo**: sobrecarga y sobrescritura de `calcularPrecioFinal()` (IVA, descuentos, recargos por color o diseño de arte) y una colección polimórfica `ArrayList<Service>` en `ServiceManager`.
- **Reglas de negocio**: validación de especialistas por servicio, cálculo de impuestos y descuentos.

## Progreso semanal

| Semana | Tema | Carpeta | Documentación |
|:---:|---|---|---|
| 01 | Clases, objetos y encapsulación básica | [`src/semana1`](src/semana1) | [Análisis del dominio](src/semana1/ANALISIS.md) |
| 02 | Relaciones entre objetos y gestor de citas | [`src/semana2`](src/semana2) | [README](src/semana2/README.md) |
| 03 | Encapsulación, constructores y sobrecarga | [`src/semana3`](src/semana3) | [Mejoras](src/semana3/MEJORAS.md) |
| 04 | Herencia y `toString()` | [`src/Semana4`](src/Semana4) | [Jerarquía](src/Semana4/JERARQUIA.md) |
| 05 | Polimorfismo (sobrecarga y sobrescritura) | [`src/semana5`](src/semana5) | [Polimorfismo](src/semana5/POLIMORFISMO.md) |

## Cómo ejecutarlo

Requisitos: JDK 17 o superior.

```bash
git clone https://github.com/mpdayan1804/bc-poo-java-dayan-mape.git
cd bc-poo-java-dayan-mape

# Compilar todas las semanas
javac -d out $(find src -name "*.java")

# Ejecutar la demo de una semana (semana1, semana2, semana3, Semana4 o semana5)
java -cp out semana5.Main
```

También puedes abrir la carpeta en IntelliJ IDEA y ejecutar el `Main` de cada paquete.

### Ejemplo de salida (semana 5)

```
==================================================
     PRUEBA SEMANA 05: POLIMORFISMO Y SOBRECARGA
==================================================

--- 1. Sobrecarga de Métodos (Overloading) ---
Corte y Color (sin dscto): $238,000.00
Manicure (con 10% dscto): $64,260.00
```

## Autora

**Dayan Lorena Mape Forero**, estudiante de Tecnología en Desarrollo y Análisis de Datos, Bogotá, Colombia. [GitHub](https://github.com/mpdayan1804)

Bootcamp POO Java · Ficha 3228973A · Instructor: Erick Granados Torres
