## Actividad 1: Recursividad aplicada

### Introducción
En esta actividad trabajamos con la **recursividad**, una técnica de programación en la que una función o método se invoca a sí mismo para resolver un problema dividiéndolo en instancias más pequeñas hasta alcanzar un punto de parada. Esta lógica se relaciona directamente con el principio de **divide y vencerás**, ya que permite descomponer una tarea mayor en subproblemas manejables, resolver cada caso de forma progresiva y combinar los resultados para obtener la respuesta final.

Para aplicar este enfoque al módulo inteligente de orientación dentro del campus, en el archivo `PA4/src/main/java/Actividad1.java` implementamos el método recursivo `buscarLugar(String nombre, int indice)`. Este algoritmo recorre el arreglo de ubicaciones registradas (`Entrada`, `Biblioteca`, `Cafeteria`, `Laboratorio` y `Aulas`) para validar si el destino ingresado por el usuario pertenece al campus y retornar el índice (nodo) correspondiente.

### 1. Casos base, llamada recursiva y condición de finalización
El funcionamiento recursivo del método `buscarLugar` se estructura en tres elementos fundamentales:

1. **Casos base (condiciones de parada):**
   * **Ubicación no encontrada:** Cuando `indice >= lugares.length`, significa que se revisaron todas las posiciones del arreglo sin éxito, por lo que retorna `-1`.
   * **Ubicación encontrada:** Cuando `lugares[indice].equalsIgnoreCase(nombre)`, la búsqueda se detiene y retorna el `indice` actual correspondiente al nodo del destino.
2. **Llamada recursiva:** Cuando aún quedan elementos por evaluar y no existe coincidencia en la posición actual, el método invoca a `buscarLugar(nombre, indice + 1)`, delegando la búsqueda al siguiente índice del arreglo.
3. **Condición de finalización:** En cada llamada recursiva el parámetro `indice` se incrementa en `1` hasta encontrar el lugar buscado o alcanzar `lugares.length`. Esto garantiza que el algoritmo siempre converja hacia un caso base y evita ciclos infinitos o un desbordamiento de pila (`StackOverflowError`).

### Pseudocódigo
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

    // Caso recursivo: avanzar al siguiente índice
    Retornar buscarLugar(nombre, indice + 1)
Fin
