
# ACTIVIDAD 2: ORDENAMIENTO RECURSIVO

## Introducción

En esta actividad trabajamos con el **ordenamiento recursivo**, utilizando el algoritmo **Merge Sort**, también conocido como ordenamiento por mezcla.

Este algoritmo permite organizar una lista de números de menor a mayor mediante la técnica de dividir y vencerás.

En nuestro caso, utilizamos Merge Sort para ordenar los tiempos estimados de diferentes rutas dentro de un campus universitario, desde la ruta más rápida hasta la más lenta.

## 1. ¿Qué es Merge Sort?

Merge Sort es un algoritmo de ordenamiento que divide una lista grande en partes más pequeñas, hasta que cada parte contiene un solo elemento.

Después compara los elementos y los combina nuevamente en orden.

Este procedimiento utiliza la **recursividad**, porque una función vuelve a llamarse a sí misma para resolver partes más pequeñas del problema.

## 2. Funcionamiento del algoritmo

El algoritmo trabaja en los siguientes pasos:

1. Recibe una lista con los tiempos de las rutas.
2. Divide la lista en dos partes.
3. Vuelve a dividir cada parte mediante llamadas recursivas.
4. Cuando llega a elementos individuales, comienza a compararlos.
5. Finalmente combina los elementos ordenándolos de menor a mayor.

## 3. Pseudocódigo de Merge Sort

```text
INICIO

    Definir tiempos = [12, 5, 9, 3, 15, 7]

    Mostrar "Rutas antes de ordenar"
    Mostrar tiempos

    LLAMAR MergeSort(tiempos, 0, longitud - 1)

    Mostrar "Rutas después de ordenar"
    Mostrar tiempos

FIN


PROCEDIMIENTO MergeSort(datos, inicio, fin)

    SI inicio < fin ENTONCES

        medio = (inicio + fin) / 2

        MergeSort(datos, inicio, medio)

        MergeSort(datos, medio + 1, fin)

        Mezclar(datos, inicio, medio, fin)

    FIN SI

FIN PROCEDIMIENTO


PROCEDIMIENTO Mezclar(datos, inicio, medio, fin)

    Dividir los datos en dos arreglos

    Comparar los elementos de ambos arreglos

    Colocar primero el elemento menor

    Copiar los elementos restantes

    Obtener el arreglo ordenado

FIN PROCEDIMIENTO
```

## 4. Ejemplo de funcionamiento

Los tiempos iniciales de las rutas son:

`12, 5, 9, 3, 15, 7`

Después de aplicar el algoritmo Merge Sort, obtenemos:

`3, 5, 7, 9, 12, 15`

Esto significa que las rutas quedan organizadas desde la que necesita menos tiempo hasta la que necesita más tiempo.

## 5. ¿Cómo se divide el problema?

La lista inicial se divide en dos partes:

```text
[12, 5, 9]    [3, 15, 7]
```

Después continúa dividiéndose hasta obtener elementos individuales.

```text
[12] [5] [9] [3] [15] [7]
```

Finalmente, se comparan y combinan los elementos en orden ascendente.

La condición de finalización ocurre cuando la parte que se está procesando tiene un solo elemento o ninguno.

## 6. Utilidad en el campus universitario

Este algoritmo es útil porque permite organizar los tiempos estimados de las diferentes rutas del campus universitario.

De esta manera, el sistema inteligente puede mostrar primero las rutas que requieren menos tiempo de recorrido y facilitar la elección de los estudiantes.


