## 1. ACTIVIDAD 1. RECURSIVIDAD

### 1.1. Planteamiento y funcionamiento del algoritmo recursivo
La recursividad es una técnica en la que una función o método se invoca a sí mismo para resolver un problema dividiéndolo en subproblemas más pequeños hasta alcanzar una condición de parada. Este enfoque se relaciona con el principio de divide y vencerás, ya que descompone una tarea general en pasos sucesivos hasta llegar a un caso base que detiene el proceso y evita un bucle infinito o un error de desbordamiento de pila (`StackOverflowError`).

En el módulo inteligente de orientación dentro del campus, la recursividad se aplica mediante el método `buscarLugar(String nombre, int indice)` en `Actividad1.java`[cite: 12]. Este algoritmo recorre el arreglo de ubicaciones disponibles (`Entrada`, `Biblioteca`, `Cafeteria`, `Laboratorio` y `Aulas`) para verificar si el destino ingresado por el usuario pertenece al campus y obtener el índice (nodo) correspondiente[cite: 12].

| Elemento | Descripción en `buscarLugar(nombre, indice)` |
| :--- | :--- |
| **Caso base 1 (no encontrado)** | Si `indice >= lugares.length`, se han revisado todas las ubicaciones sin coincidencia y retorna `-1`[cite: 12]. |
| **Caso base 2 (encontrado)** | Si `lugares[indice].equalsIgnoreCase(nombre)`, se localiza el destino y retorna el `indice` del nodo[cite: 12]. |
| **Caso recursivo** | Si aún quedan posiciones por evaluar y no hay coincidencia, invoca a `buscarLugar(nombre, indice + 1)` para revisar el siguiente elemento[cite: 12]. |
| **Condición de finalización** | El parámetro `indice` incrementa de `1` en `1` en cada llamada, asegurando que el método termine al encontrar el lugar o alcanzar el final del arreglo[cite: 12]. |

### 1.2. Pseudocódigo
```text
Algoritmo buscarLugar(nombre, indice)
Inicio
    // Caso base 1: fin del arreglo sin coincidencias
    Si indice >= longitud(lugares) entonces
        Retornar -1
    Fin Si

    // Caso base 2: ubicación encontrada
    Si lugares[indice] == nombre entonces
        Retornar indice
    Fin Si

    // Caso recursivo: avanzar a la siguiente ubicación
    Retornar buscarLugar(nombre, indice + 1)
Fin

### 1.3. Traza y ejemplo de ejecución
Si el usuario ingresa "Cafeteria", el llamado inicial buscarLugar("Cafeteria", 0) realiza el siguiente recorrido:

Revisa indice = 0 ("Entrada"): no coincide y 0 < 5, por lo que llama a buscarLugar("Cafeteria", 1).

Revisa indice = 1 ("Biblioteca"): no coincide y 1 < 5, por lo que llama a buscarLugar("Cafeteria", 2).

Revisa indice = 2 ("Cafeteria"): coincide con el destino buscado (caso base 2) y retorna 2.

En consola, el programa valida el destino e indica que corresponde al Nodo 2 (Destino valido -> Cafeteria (Nodo 2)). Si el usuario ingresa una ubicación que no existe en el arreglo, la recursión avanza hasta indice == 5 (lugares.length), cumple el caso base 1 y retorna -1, mostrando el mensaje de error correspondiente.

### 1.4. Conclusión de la actividad
La implementación de buscarLugar demuestra cómo la recursividad permite validar y ubicar destinos dentro del campus mediante llamadas sucesivas bien acotadas. Al contar con casos base definidos y un avance controlado del índice, el algoritmo resuelve la búsqueda de forma ordenada y sirve como paso previo para identificar el nodo desde el cual operan los algoritmos de recorridos y rutas en el grafo.
