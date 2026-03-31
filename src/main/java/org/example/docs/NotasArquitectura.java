package org.example.docs;

public class NotasArquitectura {
    /*DIFERENCIA DE ENFOQUE: JAVA 8 (LEGACY) VS JAVA 17/21 (LTS)

    Java 8 (2014 - enfoque legacy)
    Introdujo cambios importantes como:
        - Lambdas
        - Streams API
        - Optional

    Enfoque:
        Programacion funcional inicial
        Codigo aun muy imperactivo
        Verbosidad alta en estructuras tradicionales (if, switch,etc.)

    Limitaciones:
        switch poco expresivo (necesita break, fall-through)
        No hay pattern maching
        Manejo de tipos mas manual
        Mayor probabilidad de errores humanos
    Java 17 /21 (LTS moderno):
    Enfoque evolucionado hacia:
        -Codigo declarativo
        -Seguridad en tiempo de compiacion
        -Menos errores y mas legibilidad

    Caracteristicas claves:
        Switch expresions
        Pattern maching (instanceof y switch)
        records (modelos inmutables simples)
        Sealed Classes (control de jerarquias)

    Ventajas:
        Menos codigo boilerplate
        Eliminacion de casting manual
        Exhaustividad (el compilador obliga a cubrir casos)
        codigo mas mantenible y seguro

    Java 8 = Base funcional + imperativo
    Java 17/21 = Lenguaje moderno, expresivo y seguro por diseño
     */


    /*
    JVM Y GESTION DE MEMORIA

    La JVM es responsable de:
        Ejecutar el bytecode
        Administrar la memoria
        Gestionar el ciclo de vida de los objetos
    Estructura de memoria principal:

    HEAP (monticulo):
        Donde se almacenanlos objetos (new)
        Compartido entre todos los hilos
    STACK (pila)
        Variables locales y llamadas a metodos
        Cada hilo tiene su propio satack
    Metaspace
        Informacion de clases cargadas
    */
    /*

     * ♻️ GARBAGE COLLECTOR (GC)

     * El Garbage Collector se encarga de:
     * - Liberar memoria automáticamente
     * - Eliminar objetos que ya no se usan

     * 🔹 ¿Cómo sabe qué eliminar?
     *
     * Usa el concepto de "Reachability" (alcanzabilidad):
     * - Si un objeto NO tiene referencias → es candidato a eliminación


     * 🔹 División del Heap:

     * 1. Young Generation:
     *    - Objetos nuevos
     *    - Se eliminan rápidamente (alta rotación)

     *    Subdivisiones:
     *      * Eden
     *      * Survivor (S0 y S1)
     *
     * 2. Old Generation:
     *    - Objetos que sobreviven más tiempo


     * 🔹 Tipos de GC:
     *
     * - Minor GC:
     *      Limpia Young Generation
     *      Rápido y frecuente

     * - Major / Full GC:
     *      Limpia todo el Heap
     *      Más costoso (puede pausar la app)


     * 🔹 Algoritmos modernos (Java 17/21):

     * - G1 GC (Garbage First):
     *      * Divide el heap en regiones
     *      * Prioriza liberar memoria más eficiente

     * - ZGC / Shenandoah:
     *      * Pausas ultra cortas (low-latency)
     *      * Ideal para sistemas grandes


     * 🔹 Optimización automática:

     * La JVM:
     * - Ajusta tamaños de memoria dinámicamente
     * - Recolecta objetos según uso real
     * - Minimiza pausas (Stop-The-World)


     * 🔹 Ejemplo conceptual:
     *
     * Object obj = new Object();

     * - Se crea en Eden (Young Gen)
     * - Si sobrevive varios GC → pasa a Old Gen
     * - Si pierde referencia → GC lo elimina


     Importante:
     * En Java NO gestionas memoria manualmente.
     * El GC lo hace por ti, optimizando rendimiento y evitando fugas.

     */

}
