# ACTIVIDAD 1: RECURSIVIDAD 

## Introducción
En esta actividad trabajamos con **recursividad**, una técnica donde una función se llama a sí misma para resolver un problema dividiéndolo en partes más pequeñas hasta llegar a un punto de parada.
En `PA4/src/main/java/actividad1.java`, implementamos el cálculo del factorial de un número entero `n` (`n!`), que consiste en multiplicar `n` por todos los números enteros positivos anteriores hasta llegar a `1` (por ejemplo, `5! = 5 × 4 × 3 × 2 × 1 = 120`).
Como cada llamada recursiva espera el resultado de la siguiente para terminar de multiplicarse, es fundamental tener un **caso base** que detenga el proceso y evite un bucle infinito.

## 1. Caso base y llamada recursiva
La recursividad funciona en dos partes clave:
1. **Caso base:** Detiene la recursión cuando `n <= 1`, devolviendo `1` (ya que `1! = 1` y `0! = 1`).
2. **Llamada recursiva:** Cuando `n > 1`, multiplica `n` por el resultado de `factorial(n - 1)`, reduciendo el problema en `1` en cada paso.

Si no existiera el caso base, el método seguiría llamándose (`factorial(0)`, `factorial(-1)`, etc.) hasta provocar un error de desbordamiento de pila (`StackOverflowError`).

### Algoritmo Factorial(n)
```text
Inicio
    Si n <= 1 entonces
        Retornar 1
    Fin Si
    Retornar n * Factorial(n - 1)
Fin
