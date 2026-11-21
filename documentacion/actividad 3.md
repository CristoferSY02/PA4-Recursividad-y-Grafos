# ACTIVIDAD 3: MODELADO DEL PROBLEMA MEDIANTE GRAFOS

## 3.3. Explicación del algoritmo heurístico A*

**Responsable: Milthom**

### ¿Qué es el algoritmo A*?

El algoritmo A* es un método de búsqueda que permite encontrar una ruta conveniente entre un punto de inicio y un destino. Para ello, analiza los costos de los recorridos y utiliza una estimación de la distancia que falta para llegar al objetivo.

### ¿Cómo funciona?

El algoritmo evalúa diferentes caminos y selecciona el que tiene el menor costo estimado para llegar al destino.

Utiliza la siguiente fórmula:

**f(n) = g(n) + h(n)**

- **f(n):** costo total estimado del recorrido.
- **g(n):** costo acumulado desde el punto inicial hasta el nodo actual.
- **h(n):** estimación del costo que falta para llegar al destino.

### Aplicación en el campus

En nuestro proyecto, el algoritmo A* puede ayudar a los estudiantes a encontrar una ruta conveniente entre las diferentes instalaciones de la institución.

Por ejemplo, si un estudiante se encuentra en la biblioteca y desea llegar a los laboratorios, el algoritmo analiza las conexiones disponibles y estima qué camino tiene el menor costo para alcanzar su destino.

### Importancia del algoritmo A*

El algoritmo A* es útil porque combina el costo del recorrido con una estimación hacia el objetivo. De esta manera, permite orientar la búsqueda hacia rutas convenientes y mejorar el desplazamiento de los estudiantes dentro del campus.
