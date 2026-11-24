# 4. ACTIVIDAD 4. ARGUMENTACIÓN FINAL

## 4.1. Comparación de las alternativas planteadas

Las alternativas desarrolladas cumplen diferentes funciones dentro del módulo inteligente de orientación del campus. En el código integrador de la Actividad 4 se reúnen estas técnicas para validar el destino, buscar rutas y comparar los resultados obtenidos. La recursividad permite validar la existencia de un lugar mediante llamadas sucesivas; Merge Sort ordena los resultados de los algoritmos de búsqueda; DFS y BFS exploran las conexiones del grafo; mientras que A* busca una ruta considerando el costo acumulado y una estimación del costo restante hasta el destino.

| Alternativa | Finalidad | Eficiencia | Ventajas | Limitaciones |
|---|---|---|---|---|
| Recursividad (`buscarLugar`) | Buscar y validar un lugar dentro del arreglo de ubicaciones. | O(n) en tiempo y O(n) en espacio de llamadas. | Permite realizar una búsqueda secuencial mediante llamadas recursivas y detenerse cuando encuentra el destino. | Recorre los elementos uno por uno y puede requerir varias llamadas si el lugar está al final del arreglo. |
| Merge Sort | Ordenar los resultados de los algoritmos según el costo de la ruta y, en caso de empate, los nodos explorados. | O(k log k) en tiempo y O(k) en espacio auxiliar. | Organiza los resultados y permite establecer un ranking de las alternativas. | Requiere espacio auxiliar y, en este caso, ordena únicamente tres resultados. |
| DFS | Buscar una ruta mediante la exploración en profundidad del grafo. | O(V²) con matriz de adyacencia. | Utiliza recursividad y permite encontrar un camino hacia el destino. | No garantiza encontrar la ruta de menor costo y devuelve el primer camino que encuentra. |
| BFS | Buscar una ruta recorriendo el grafo por niveles. | O(V²) con matriz de adyacencia. | Encuentra una ruta con el menor número de conexiones en un grafo no ponderado. | No garantiza el menor costo cuando las conexiones tienen diferentes pesos. |
| A* | Buscar una ruta considerando el costo acumulado y la estimación del costo restante. | Depende del grafo, la heurística y la implementación. | Orienta la búsqueda hacia el destino y permite encontrar una ruta de menor costo cuando se cumplen las condiciones de la heurística. | Requiere definir una heurística adecuada y realizar cálculos adicionales durante la búsqueda. |

**Nota:** V representa la cantidad de vértices, E la cantidad de aristas y k la cantidad de resultados que se ordenan. Las complejidades de DFS y BFS corresponden a la implementación desarrollada con matriz de adyacencia, no a una implementación con listas de adyacencia. Los costos de los tramos y la heurística utilizados en la prueba son datos simulados.

## 4.2. Solución recomendada y justificación

Se recomienda implementar el algoritmo A* para el módulo de orientación del campus, debido a que permite buscar rutas considerando el costo acumulado desde el punto de partida y una estimación del costo restante hasta el destino. Para ello, utiliza la función de evaluación f(n) = g(n) + h(n), que orienta la búsqueda hacia la meta.

En la prueba desarrollada se consideró como punto de partida la Entrada y como destino las Aulas. DFS encontró la ruta Entrada → Biblioteca → Laboratorio → Aulas, con un costo total de 9 unidades. Por su parte, BFS y A* encontraron la ruta Entrada → Cafetería → Aulas, con un costo de 5 unidades.

Aunque BFS y A* obtuvieron la misma ruta y el mismo costo, A* exploró 3 nodos, mientras que BFS exploró 5. DFS exploró 4 nodos y obtuvo una ruta de mayor costo.

Por estos resultados, A* ocupa el primer lugar en el ranking generado mediante Merge Sort, debido a que presenta el menor costo y, en caso de empate, explora menos nodos. Por ello, se considera la alternativa más conveniente para el módulo de orientación en la prueba realizada.

## 4.3. Relación con aplicaciones básicas de IA vistas en el curso

La propuesta se relaciona con la búsqueda de rutas, una aplicación en la que se utilizan algoritmos para encontrar caminos entre diferentes ubicaciones. En este caso, el campus se representa mediante un grafo, donde los lugares funcionan como nodos y las conexiones entre ellos representan los caminos disponibles.

El algoritmo A* se vincula con esta aplicación porque utiliza una función de evaluación que considera el costo acumulado desde el punto de partida y una estimación del costo restante hasta el destino. De esta manera, orienta la búsqueda hacia una ruta conveniente según los costos establecidos.

También se relaciona con la toma de decisiones, porque el programa compara los resultados de DFS, BFS y A* mediante sus costos y la cantidad de nodos explorados. Para realizar esta comparación, utiliza Merge Sort y establece un ranking que permite identificar la alternativa más conveniente.

Por tanto, la propuesta aplica conceptos de búsqueda y toma de decisiones mediante algoritmos, utilizando A* como alternativa recomendada para resolver el problema de orientación dentro del campus.

## 4.4. Conclusión grupal

El desarrollo de las actividades permitió integrar diferentes técnicas de algoritmos y estructuras de datos para plantear una solución al problema de orientación dentro del campus. La recursividad permite validar los lugares mediante llamadas sucesivas; Merge Sort permite ordenar los resultados de las rutas; y los grafos representan las ubicaciones y sus conexiones para aplicar los algoritmos DFS, BFS y A*.

En la prueba realizada, DFS encontró una ruta de costo 9, mientras que BFS y A* encontraron una ruta de costo 5. Aunque ambos obtuvieron el mismo recorrido, A* exploró menos nodos, por lo que ocupó el primer lugar en el ranking generado mediante Merge Sort.

En conjunto, estas técnicas permiten representar el problema, explorar las conexiones y comparar las alternativas de recorrido. Los resultados muestran que A* es la opción más conveniente para el módulo de orientación en el escenario evaluado.
