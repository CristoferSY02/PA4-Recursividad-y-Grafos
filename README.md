# README — Evaluación PA4

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
> **Código:** 4134  
> **Evaluación:** PA4  
> **Equipo:** Equipo 6

## 1. Integrantes

| **Integrante** | **Responsabilidad principal** | **Aporte realizado** |
|---|---|---|
| Luis Cristofer Siñani Yauri | Actividad 1 – Recursividad aplicada | Desarrolló el algoritmo recursivo para validar las ubicaciones del campus, explicó su funcionamiento y analizó los casos base y recursivo. También gestionó el repositorio en GitHub y elaboró el README. |
| Carlos César Jiménez Jauregui | Actividad 2 – Ordenamiento recursivo | Desarrolló el algoritmo Merge Sort, incluyendo la división de los datos, el proceso de combinación y la obtención del resultado ordenado. |
| Luisanni Andreina Oviedo Woscichowski | Actividad 3 – Grafo, DFS y BFS | Desarrolló la representación del campus mediante nodos y aristas y el análisis de los algoritmos DFS y BFS. |
| Milthom Wilbert Florez Somcco | Actividad 3 – Algoritmo heurístico A* | Desarrolló el análisis del algoritmo A* y su aplicación en la búsqueda de rutas orientadas hacia un destino. |
| Geraldine Ana Paola Gomez Atanacio | Actividad 4 – Argumentación final | Desarrolló la comparación de las alternativas, la justificación técnica de la solución recomendada y su relación con aplicaciones básicas de inteligencia artificial. |

## 2. Descripción y objetivo

**Problema:**

Una institución desea construir un módulo inteligente de orientación dentro de un campus. El sistema debe organizar información, analizar rutas posibles entre ubicaciones y justificar qué camino o recorrido resulta más conveniente según el contexto.

**Objetivo:**

Proponer una solución para el módulo de orientación del campus mediante la aplicación de recursividad, ordenamiento recursivo, grafos y algoritmos de búsqueda, comparando alternativas de recorrido y justificando las decisiones técnicas.

**Solución desarrollada:**

Se desarrolló una solución en Java que integra diferentes técnicas de algoritmos y estructuras de datos para representar las ubicaciones del campus, validar destinos, ordenar tiempos de recorrido y buscar rutas entre los lugares. Se utilizaron Apache NetBeans para el desarrollo y ejecución de los programas y GitHub para organizar y almacenar el código fuente, la documentación y las evidencias.
**Documentación complementaria:** [Ver Actividad 1](documentacion/actividad%201.md)

**Documentación complementaria:** [Ver Actividad 2](documentacion/actividad%202.md)

**Documentación complementaria:** [Ver Actividad 3](documentacion/actividad%203.md)

**Documentación complementaria:** [Ver Actividad 4](documentacion/actividad%204.md)
### Actividad 1. Recursividad aplicada

Se implementó el método recursivo `buscarLugar(nombre, indice)` para validar si una ubicación ingresada pertenece al campus y obtener su posición dentro del arreglo de lugares. Se identificaron los casos base, el caso recursivo y la condición de finalización.

**Documentación complementaria:** [Ver Actividad 1](documentaci%C3%B3n/actividad%201.md)

### Actividad 2. Ordenamiento recursivo

Se desarrolló el algoritmo Merge Sort para ordenar un conjunto de tiempos de recorrido. Se aplicó el proceso de división de los datos en grupos más pequeños y su posterior combinación hasta obtener los valores ordenados de menor a mayor.

**Documentación complementaria:** [Ver Actividad 2](documentaci%C3%B3n/actividad%202.md)

### Actividad 3. Modelado del problema mediante grafos

Se representó el campus mediante un grafo, identificando sus nodos, aristas y conexiones. Se implementaron y analizaron los recorridos DFS y BFS, además del algoritmo heurístico A* para orientar la búsqueda hacia un destino considerando los costos de recorrido y una estimación del costo restante.

**Documentación complementaria:** [Ver Actividad 3](documentaci%C3%B3n/actividad%203.md)

### Actividad 4. Argumentación final

Se compararon las alternativas desarrolladas mediante sus resultados y criterios de evaluación. Se justificó la elección de A* como la opción más conveniente para el módulo de orientación en el escenario evaluado y se relacionó la propuesta con aplicaciones básicas de inteligencia artificial.

**Documentación complementaria:** [Ver Actividad 4](documentaci%C3%B3n/actividad%204.md)

## 3. Cómo ejecutar o revisar

### Requisitos previos

- Apache NetBeans.
- JDK compatible con la configuración del proyecto.
- Git, si se desea clonar el repositorio desde la terminal.

### Pasos para revisar el proyecto

1. **Clonar el repositorio:** ejecutar el siguiente comando en CMD o terminal desde la carpeta donde se desea guardar el proyecto.

   ```bash
   git clone https://github.com/CristoferSY02/PA4-Recursividad-y-Grafos.git
   ```

2. **Abrir el proyecto:** iniciar Apache NetBeans, seleccionar `File > Open Project` y ubicar la carpeta `PA4` descargada del repositorio.

3. **Revisar el código:** ingresar a la carpeta `PA4/src/main/java` para consultar los archivos Java correspondientes a las actividades.

4. **Ejecutar los programas:** abrir la clase principal correspondiente a cada actividad y utilizar la opción `Run` de NetBeans para comprobar su funcionamiento.

5. **Revisar la documentación:** consultar la carpeta `documentación`, donde se encuentran los archivos Markdown con el desarrollo de las actividades.


## 4. Evidencias

En esta sección se presentan las capturas de pantalla que permiten verificar el desarrollo y la ejecución de las actividades.

- [Actividad 1](evidencias/actividad1.PNG)
- [Actividad 2](evidencias/actividad2.png)
- [Actividad 3](evidencias/actividad3.PNG)
- [Actividad 4](evidencias/actividad4.png)

Las evidencias se encuentran organizadas en la carpeta `evidencias` del repositorio.

## 5. Matriz de participación

| **Integrante** | **Desarrollo** | **Pruebas** | **Documentación** | **Participación** |
|---|---|---|---|---|
| Luis Cristofer Siñani Yauri | Alta | Alta | Alta | Desarrollo de la Actividad 1, implementación del algoritmo recursivo, gestión del repositorio y elaboración del README. |
| Carlos César Jiménez Jauregui | Alta | Alta | Alta | Desarrollo de la Actividad 2, implementación y comprobación del algoritmo Merge Sort. |
| Luisanni Andreina Oviedo Woscichowski | Alta | Alta | Alta | Desarrollo de la representación del grafo y de los algoritmos DFS y BFS correspondientes a la primera parte de la Actividad 3. |
| Milthom Wilbert Florez Somcco | Alta | Alta | Alta | Desarrollo y análisis del algoritmo heurístico A* correspondiente a la segunda parte de la Actividad 3. |
| Geraldine Ana Paola Gomez Atanacio | Alta | Alta | Alta | Desarrollo de la Actividad 4, comparación de alternativas y justificación técnica de la solución recomendada. |

## 6. Video de exposición

**Video de YouTube:** [Ver video de exposición](https://www.youtube.com/watch?v=jPsz1uESUMA)

## 7. Conclusiones

**Conclusión 1 – Actividad 1: Recursividad aplicada**

La implementación de la recursividad permitió comprender cómo un método puede llamarse a sí mismo para resolver una tarea mediante pasos sucesivos. El método `buscarLugar()` permitió validar las ubicaciones del campus e identificar la función de los casos base, el caso recursivo y la condición de finalización.

**Conclusión 2 – Actividad 2: Ordenamiento recursivo**

La aplicación de Merge Sort permitió comprender cómo dividir un conjunto de datos en partes más pequeñas y combinarlas para obtener una secuencia ordenada. Las pruebas realizadas permitieron comprobar el ordenamiento de los tiempos de recorrido de menor a mayor.

**Conclusión 3 – Actividad 3: Grafos, DFS y BFS**

La representación del campus mediante un grafo permitió organizar las ubicaciones como nodos y sus conexiones como aristas. Mediante DFS y BFS se identificaron diferentes formas de recorrer el grafo y encontrar caminos entre los lugares.

**Conclusión 4 – Actividad 3: Algoritmo A\***

El análisis de A* permitió comprender cómo utilizar el costo acumulado y una estimación del costo restante para orientar la búsqueda hacia un destino. La prueba realizada permitió comparar su recorrido con los resultados obtenidos mediante DFS y BFS.

**Conclusión 5 – Actividad 4: Argumentación final**

La comparación de los algoritmos permitió justificar la elección de A* para el módulo de orientación en el escenario evaluado. También se reconoció la aplicación de técnicas de búsqueda y toma de decisiones relacionadas con la inteligencia artificial, integrando los conocimientos desarrollados durante las actividades.

---

**Última actualización:** 25/11/2026
