
# 4. ACTIVIDAD 4. ARGUMENTACIÓN FINAL

## 4.1. Comparación de las alternativas planteadas

Las alternativas desarrolladas cumplen diferentes funciones dentro de la propuesta del módulo inteligente de orientación del campus. La recursividad permite resolver problemas mediante llamadas sucesivas; Merge Sort organiza los tiempos de recorrido; DFS y BFS permiten explorar las conexiones del grafo; mientras que A* utiliza los costos y una estimación de la distancia restante para buscar una ruta conveniente.

| Alternativa | Finalidad | Eficiencia | Ventajas | Limitaciones |
|---|---|---|---|---|
| Recursividad (factorial) | Resolver un problema mediante llamadas de una función a sí misma. | O(n) en tiempo y espacio para el factorial. | Permite comprender la división de un problema en pasos más pequeños y el uso de casos base. | El ejemplo del factorial no tiene una aplicación directa en la búsqueda de rutas del campus. |
| Merge Sort | Ordenar los tiempos de recorrido de menor a mayor. | O(n log n) en tiempo y O(n) en espacio auxiliar. | Mantiene un rendimiento eficiente y permite organizar los tiempos para identificar los menores. | Requiere espacio auxiliar y el código desarrollado ordena tiempos, pero no conserva la identificación de cada ruta. |
| DFS | Recorrer los lugares conectados mediante una búsqueda en profundidad. | O(V²) en la implementación con matriz de adyacencia. | Permite explorar los lugares alcanzables y utiliza recursividad para avanzar entre conexiones. | No garantiza encontrar la ruta más corta y puede recorrer lugares que no forman parte del camino más conveniente. |
| BFS | Recorrer el grafo por niveles y encontrar una ruta con el menor número de conexiones. | O(V²) en la implementación con matriz de adyacencia. | Permite encontrar una ruta con la menor cantidad de aristas en un grafo no ponderado. | No garantiza la menor distancia cuando las conexiones tienen diferentes pesos. |
| A* | Buscar una ruta considerando el costo acumulado y la distancia estimada hasta el destino. | Depende del grafo, la heurística y la implementación. | Orienta la búsqueda hacia el destino y permite encontrar rutas de menor costo cuando se cumplen las condiciones de la heurística. | Requiere definir una heurística adecuada y puede consumir más recursos en grafos grandes. |

**Nota:** V representa la cantidad de vértices y E la cantidad de aristas del grafo. Las complejidades de DFS y BFS corresponden a la implementación desarrollada con matriz de adyacencia, no a una implementación con listas de adyacencia. Los tiempos y distancias utilizados en los ejemplos son datos simulados.

## 4.2. Solución recomendada y justificación

Se recomienda implementar el algoritmo A* para el módulo de orientación del campus, debido a que permite buscar rutas considerando la distancia recorrida y una estimación del costo restante hasta el destino. Esto permite orientar la búsqueda hacia una alternativa de menor distancia.

En la prueba desarrollada, se consideró como punto de partida la Entrada y como destino las Aulas. El algoritmo BFS encontró la ruta Entrada → Cafetería → Aulas, con una distancia total de 350 metros. Por su parte, A* encontró la ruta Entrada → Biblioteca → Laboratorio → Aulas, con una distancia de 300 metros.

La comparación muestra que A* obtuvo una ruta 50 metros más corta que la encontrada por BFS. Esto se debe a que BFS prioriza la cantidad de conexiones, mientras que A* considera las distancias entre los lugares y la estimación del recorrido restante.

Por estas razones, A* es la alternativa recomendada para el módulo, ya que se ajusta mejor al objetivo de orientar a los usuarios hacia una ruta de menor distancia. DFS y BFS pueden mantenerse como algoritmos complementarios para explorar y comparar los recorridos del campus.

## 4.3. Relación con aplicaciones básicas de IA vistas en el curso

La propuesta se relaciona con la búsqueda de rutas, una aplicación en la que se utilizan algoritmos para encontrar caminos entre diferentes ubicaciones. En este caso, el campus se representa mediante un grafo, donde los lugares funcionan como nodos y las conexiones entre ellos representan los caminos disponibles.

El algoritmo A* se vincula con esta aplicación porque utiliza una función de evaluación que considera el costo acumulado desde el punto de partida y una estimación del costo restante hasta el destino. De esta manera, puede orientar la búsqueda y seleccionar una ruta conveniente según las distancias establecidas.

También se relaciona con la toma de decisiones, porque el módulo compara diferentes recorridos y selecciona una alternativa de acuerdo con el criterio de menor distancia. Así, la información procesada permite ofrecer una orientación basada en los costos de desplazamiento y no únicamente en la cantidad de conexiones.

Por tanto, la propuesta aplica conceptos de búsqueda y toma de decisiones mediante algoritmos, utilizando A* como principal alternativa para resolver el problema de orientación dentro del campus.

## 4.4. Conclusión grupal

El desarrollo de las actividades permite integrar diferentes técnicas de algoritmos y estructuras de datos para plantear una solución al problema de orientación dentro del campus. La recursividad permite comprender cómo resolver problemas mediante llamadas sucesivas; Merge Sort permite ordenar los tiempos de recorrido; y los grafos representan los lugares y sus conexiones, facilitando la aplicación de los algoritmos DFS y BFS.

Finalmente, A* complementa esta propuesta al considerar las distancias entre los lugares y una estimación del costo restante para buscar una ruta de menor distancia. En el ejemplo desarrollado, obtuvo un recorrido de 300 metros, frente a los 350 metros encontrados por BFS.

En conjunto, estas técnicas permiten organizar la información, explorar las conexiones y comparar alternativas de recorrido. Por ello, se considera que la combinación de ordenamiento, grafos y algoritmos de búsqueda proporciona una solución adecuada para el módulo inteligente de orientación del campus.

