## Herencia abierta y Herencia sellada

- Abierta: 
  - cualquier clase que no sea (final) puede ser extendida por cualquier otra.
  - El problema es que el dominio del negocio esta desprotegido, alguien podria crear una subclase de mi clase que tiene atributos y metodos sensibles y el sistema lo aceptaria como valido.
  
- Sellada: Te permite declarar exactamente que clases tienen permiso para heredar, si una clase no esta lista de permitidas, java no dejara que compile. (JAVA 17-21)

## Seguridad del Diseño mediante Sellado

A diferencia de la herencia abierta, donde cualquier clase externa puede extender la lógica de negocio y potencialmente introducir comportamientos no deseados o estados inválidos, las Sealed Classes garantizan la integridad del dominio.

Al restringir la jerarquía a un conjunto predefinido de subclases, se elimina la 'fragilidad de la clase base'. Esto permite que el compilador realice un análisis de exhaustividad (exhaustiveness checking), asegurando que todas las variantes del sistema sean tratadas explícitamente y bloqueando cualquier intento de extensión no autorizada desde paquetes externos.

# Conceptos aprendidos :
  cuando uso sealed, el compilador te obliga a definir el destino de cada subclase permitida.
  hay 3 opciones en este caso:
    - final: cerrado total: nadie mas puede Heredar de esta clase. Es el fin de la rama.
    - sealed: cerrado parcial: Esta clase esta sellada y debe decidir a quien mas permite (permits).
    - non-sealed: Abierto. Rompes el sellado. A partir de aqui, cualquier clase puede heredar de esta clase.
  
  otro concepto aprendido es una regla de seguridad de Sealed Classes: El control de proximidad, para que una clase pueda Heredar de una clase sellada, ambas deben estar en el mismo paquete o modulo.