# 📄 POLIMORFISMO.md - Semana 05

## Dominio: Sala de Belleza - Estilo y Glamour

Este documento detalla la aplicación de polimorfismo por sobrecarga y sobrescritura en la jerarquía de servicios (`Service`, `HairService`, `NailService`).

### 1. Polimorfismo por Sobrecarga (Overloading)

Se implementó la sobrecarga del método `calcularPrecioFinal()` en la clase padre `Service`:

* **`calcularPrecioFinal()`:** Calcula el precio con IVA, sin aplicar descuentos.
* **`calcularPrecioFinal(double discountRate)`:** Calcula el precio con IVA, aplicando una tasa de descuento proporcionada.

Esto permite que el código sea flexible al calcular el costo final en diferentes contextos de venta.

### 2. Polimorfismo por Sobrescritura (Overriding)

El comportamiento de cálculo fue modificado en las clases hijas para incluir la lógica de negocio específica:

| Clase | Método Sobrescrito | Lógica Adicional |
| :--- | :--- | :--- |
| **`HairService`** | `calcularPrecioFinal()` | Añade el recargo (`COLOR_SURCHARGE = $50,000`) si `isColorRequired` es `true`. |
| **`NailService`** | `calcularPrecioFinal()` | Añade el costo de diseño (`ART_DESIGN_COST = $20,000`) si `hasArtDesign` es `true`. |

Al llamar a `servicio.calcularPrecioFinal()`, Java ejecuta el método correcto para el objeto específico (Hair o Nail), logrando el polimorfismo dinámico.

### 3. Polimorfismo en Tiempo de Ejecución (Dynamic Binding)

* **Clase Gestora:** `ServiceManager.java`
* **Implementación:** El método `procesarCalculoDePrecios()` utiliza un **`ArrayList<Service>`** (Colección Polimórfica).
* **Demostración:** Cuando se llama a `service.calcularPrecioFinal(descuentoGlobal)` dentro del bucle del gestor, la máquina virtual de Java determina en **tiempo de ejecución** cuál es la versión sobrescrita correcta del método (`HairService` o `NailService`) para ejecutar el cálculo exacto del precio final.

### 4. Uso del Método `toString()`

El método `toString()` fue sobrescrito en la clase padre (`Service`) y sobrescrito nuevamente en cada subclase. Al imprimir un objeto hijo, se llama a la versión sobrescrita del hijo, el cual incluye información específica antes de llamar a `super.toString()` para obtener la información base.