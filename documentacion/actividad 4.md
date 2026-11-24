# 4. ACTIVIDAD 4. ARGUMENTACIÓN FINAL

## 4.1. Comparación de las alternativas planteadas

Las alternativas desarrolladas cumplen diferentes funciones dentro de la
propuesta del módulo inteligente de orientación del campus. La
recursividad permite resolver problemas mediante llamadas sucesivas;
Merge Sort organiza los tiempos de recorrido; DFS y BFS permiten
explorar las conexiones del grafo; mientras que A\* utiliza los costos y
una estimación de la distancia restante para buscar una ruta
conveniente.

  -------------------------------------------------------------------------------
  Alternativa    Finalidad      Eficiencia        Ventajas       Limitaciones
  -------------- -------------- ----------------- -------------- ----------------
  Recursividad   Resolver un    O(n) en tiempo y  Permite        El ejemplo del
  (factorial)    problema       espacio para el   comprender la  factorial no
                 mediante       factorial.        división de un tiene una
                 llamadas de                      problema en    aplicación
                 una función a                    pasos más      directa en la
                 sí misma.                        pequeños y el  búsqueda de
                                                  uso de casos   rutas del
                                                  base.          campus.

  Merge Sort     Ordenar los    O(n log n) en     Mantiene un    Requiere espacio
                 tiempos de     tiempo y O(n) en  rendimiento    auxiliar y el
                 recorrido de   espacio auxiliar. eficiente y    código
                 menor a mayor.                   permite        desarrollado
                                                  organizar los  ordena tiempos,
                                                  tiempos para   pero no conserva
                                                  identificar    la
                                                  los menores.   identificación
                                                                 de cada ruta.

  DFS            Recorrer los   O(V²) en la       Permite        No garantiza
                 lugares        implementación    explorar los   encontrar la
                 conectados     con matriz de     lugares        ruta más corta y
                 mediante una   adyacencia.       alcanzables y  puede recorrer
                 búsqueda en                      utiliza        lugares que no
                 profundidad.                     recursividad   forman parte del
                                                  para avanzar   camino más
                                                  entre          conveniente.
                                                  conexiones.    

  BFS            Recorrer el    O(V²) en la       Permite        No garantiza la
                 grafo por      implementación    encontrar una  menor distancia
                 niveles y      con matriz de     ruta con la    cuando las
                 encontrar una  adyacencia.       menor cantidad conexiones
                 ruta con el                      de aristas en  tienen
                 menor número                     un grafo no    diferentes
                 de conexiones.                   ponderado.     pesos.

  A\*            Buscar una     Depende del       Orienta la     Requiere definir
                 ruta           grafo, la         búsqueda hacia una heurística
                 considerando   heurística y la   el destino y   adecuada y puede
                 el costo       implementación.   permite        consumir más
                 acumulado y la                   encontrar      recursos en
                 distancia                        rutas de menor grafos grandes.
                 estimada hasta                   costo cuando   
                 el destino.                      se cumplen las 
                                                  condiciones de 
                                                  la heurística. 
  -------------------------------------------------------------------------------

**Nota:** V representa la cantidad de vértices y E la cantidad de
aristas del grafo. Las complejidades de DFS y BFS corresponden a la
implementación desarrollada con matriz de adyacencia, no a una
implementación con listas de adyacencia. Los tiempos y distancias
utilizados en los ejemplos son datos simulados.

## 4.2. Solución recomendada y justificación

Se recomienda implementar el algoritmo A\* para el módulo de orientación
del campus, debido a que permite buscar rutas considerando la distancia
recorrida y una estimación del costo restante hasta el destino. Esto
permite orientar la búsqueda hacia una alternativa de menor distancia.

En la prueba desarrollada, se consideró como punto de partida la Entrada
y como destino las Aulas. El algoritmo BFS encontró la ruta Entrada →
Cafetería → Aulas, con una distancia total de 350 metros. Por su parte,
A\* encontró la ruta Entrada → Biblioteca → Laboratorio → Aulas, con una
distancia de 300 metros.

La comparación muestra que A\* obtuvo una ruta 50 metros más corta que
la encontrada por BFS. Esto se debe a que BFS prioriza la cantidad de
conexiones, mientras que A\* considera las distancias entre los lugares
y la estimación del recorrido restante.

Por estas razones, A\* es la alternativa recomendada para el módulo, ya
que se ajusta mejor al objetivo de orientar a los usuarios hacia una
ruta de menor distancia. DFS y BFS pueden mantenerse como algoritmos
complementarios para explorar y comparar los recorridos del campus.

## 4.3. Relación con aplicaciones básicas de IA vistas en el curso

La propuesta se relaciona con la búsqueda de rutas, una aplicación en la
que se utilizan algoritmos para encontrar caminos entre diferentes
ubicaciones. En este caso, el campus se representa mediante un grafo,
donde los lugares funcionan como nodos y las conexiones entre ellos
representan los caminos disponibles.

El algoritmo A\* se vincula con esta aplicación porque utiliza una
función de evaluación que considera el costo acumulado desde el punto de
partida y una estimación del costo restante hasta el destino. De esta
manera, puede orientar la búsqueda y seleccionar una ruta conveniente
según las distancias establecidas.

También se relaciona con la toma de decisiones, porque el módulo compara
diferentes recorridos y selecciona una alternativa de acuerdo con el
criterio de menor distancia. Así, la información procesada permite
ofrecer una orientación basada en los costos de desplazamiento y no
únicamente en la cantidad de conexiones.

Por tanto, la propuesta aplica conceptos de búsqueda y toma de
decisiones mediante algoritmos, utilizando A\* como principal
alternativa para resolver el problema de orientación dentro del campus.

## 4.4. Conclusión grupal

El desarrollo de las actividades permite integrar diferentes técnicas de
algoritmos y estructuras de datos para plantear una solución al problema
de orientación dentro del campus. La recursividad permite comprender
cómo resolver problemas mediante llamadas sucesivas; Merge Sort permite
ordenar los tiempos de recorrido; y los grafos representan los lugares y
sus conexiones, facilitando la aplicación de los algoritmos DFS y BFS.

Finalmente, A\* complementa esta propuesta al considerar las distancias
entre los lugares y una estimación del costo restante para buscar una
ruta de menor distancia. En el ejemplo desarrollado, obtuvo un recorrido
de 300 metros, frente a los 350 metros encontrados por BFS.

En conjunto, estas técnicas permiten organizar la información, explorar
las conexiones y comparar alternativas de recorrido. Por ello, se
considera que la combinación de ordenamiento, grafos y algoritmos de
búsqueda proporciona una solución adecuada para el módulo inteligente de
orientación del campus.
