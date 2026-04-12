## ANALISIS TECNICO

# getFirst(), getLast(), reversed()
- La introduccion de getFirst() y getLast() en Java 21 mejora la legibilidad 
- anterior mente, Empleado primeroLegacy = listaEmpleados.get(0); habia que especificar la pocision inicial y con -1 la posicion final.
- Evita error IndexOutOfBoundsException.
- El metodo reversed(), este metodo itera de forma mas eficiente evita el Collections.reverse() este modifica la lista original o bubles for manuales complejos.

# ventajas: 
- codigo mas limpio,al usar reversed() se obtiene la vista inversa de la lista, actualiza automaticamente a la lista original sin generar mas copias, espacio en memoria.


  