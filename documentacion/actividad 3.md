# ACTIVIDAD 3: MODELADO DEL PROBLEMA MEDIANTE GRAFOS

## 3.1. Representación del problema con un grafo

**Responsable: Luisanni**

Para el módulo de orientación del campus representamos los lugares y los caminos entre ellos como un grafo.

- **Nodos:** son los lugares del campus. Usamos 5: Entrada, Biblioteca, Cafetería, Laboratorio y Aulas.
- **Aristas:** son los caminos o pasillos que unen dos lugares. Tenemos 5:
  - Entrada – Biblioteca
  - Entrada – Cafetería
  - Biblioteca – Laboratorio
  - Cafetería – Aulas
  - Laboratorio – Aulas
- **Sentido de las conexiones:** el grafo es **no dirigido**, porque por un pasillo se puede ir y volver. Si se puede ir de la Entrada a la Biblioteca, también se puede regresar de la Biblioteca a la Entrada.

En el código guardamos el grafo en una matriz llamada `caminos`. Un **1** quiere decir que hay camino entre los dos lugares y un **0** que no hay camino:

|             | Entrada | Biblioteca | Cafetería | Laboratorio | Aulas |
|-------------|:-------:|:----------:|:---------:|:-----------:|:-----:|
| Entrada     | 0 | 1 | 1 | 0 | 0 |
| Biblioteca  | 1 | 0 | 0 | 1 | 0 |
| Cafetería   | 1 | 0 | 0 | 0 | 1 |
| Laboratorio | 0 | 1 | 0 | 0 | 1 |
| Aulas       | 0 | 0 | 1 | 1 | 0 |

Como el grafo es no dirigido, la matriz sale igual de los dos lados de la diagonal.

## 3.2. Situaciones para usar DFS y BFS

### DFS (búsqueda en profundidad)

DFS avanza por un camino lo más lejos que puede y, cuando ya no tiene a dónde ir, regresa para probar otro camino. Lo hicimos **recursivo**: el caso base es cuando el lugar ya fue visitado (`return`), y si no, se marca, se muestra y se llama otra vez con cada lugar vecino.

**Situación donde conviene:** cuando hay que **pasar por todos los lugares del campus**, por ejemplo la ronda de un vigilante que debe revisar cada ambiente, o cuando queremos comprobar si existe algún camino para llegar a un lugar. Aquí no importa si el camino es el más corto, lo importante es recorrer todo.

### BFS (búsqueda en amplitud)

BFS visita primero todos los lugares que están al lado del punto de inicio, luego los que están a dos pasos, y así sucesivamente. Para eso usa una **cola** (`front` y `rear`), como la que vimos en clase.

**Situación donde conviene:** cuando un **alumno nuevo quiere llegar a un lugar pasando por la menor cantidad de pasillos**, por ejemplo de la Entrada a las Aulas. Como BFS avanza por niveles, el primer camino que encuentra es el que tiene menos tramos.

### Demostración en Java

El proyecto está en la carpeta `PA4Actividad3` (abrir en NetBeans y darle a Run). El código también está en `PA4/src/main/java/actividad3.java`.

Resultado en NetBeans:
```
Recorrido DFS:
Entrada
Biblioteca
Laboratorio
Aulas
Cafeteria
--------------
Recorrido BFS:
Entrada
Biblioteca
Cafeteria
Laboratorio
Aulas
```

Con el mismo grafo y empezando en la Entrada, DFS se va por la Biblioteca hasta el fondo (Laboratorio y Aulas) y deja la Cafetería para el final. En cambio, BFS primero visita los dos lugares más cercanos a la Entrada (Biblioteca y Cafetería) y después los que están más lejos.

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
