# Ejercicio para modelar clases en Java : Gimnasio con socios y actividades


# Parte 1

### Resumen
Se desea modelar el sistema de acceso para un gimnasio donde se realizan actividades, por ejemplo Karate, natacion, musculación, etc. En principio las actividades son por demanda expontanea, es decir que las personas pueden ingresar 

### Actividades
Una actividad tiene un nombre y un id. Cada actividad se realiza por única vez, si una actividad es recurrente tendrá un id distinto.



### Tipos de socios

- Socio full: Puede realizar todas las actividades de manera ilimitada
- Socio por actividades: Puede realizar una lista especifica de actividades asignadas, sin limite, pero solo las asignadas.
- SocioPorCantActividades: Puede realizar una cantidad finita de actividades, que se iran descontando a medida que son utilizadas.
- SocioPrueba: Puede realizar una unica actividad a eleccion por unica vez. No se puede renovar esta actividad.

### Aclaraciones
- Pueden utilizarse otras clases en caso de considerar necesario, como por ejemplo una clase para validar el acceso.



# Parte 2

Se necesitan algunos requerimientos extras para el sistema. Se debe hacer un refactor (de ser necesario) para cumplir lo siguiente:

- Un socio debe poder cambiar de condición, por ejemplo si le gustó la clase de prueba puede pasar de socio de prueba a socio full, luego de haber abonado la membresía.
- El gimnasio ahora cuenta con actividades en la nueva pileta, pero para ingresar a la pilete se debe validar que cada persona que desee participar cuente con una revisión médica. Toda actividad que se realice en la pileta debe exigir este requisito para su ingreso.
- Todo socio puede ingresar a la pilete si tiene la revisión médica, incluso si es socio de prueba.
- Para controlar el aforo se debe implementar una cantidad máxima de personas por cada actividad, una vez alcanzada la cantidad máxima, el sistema no debe permitir ingresar a más personas, independientemente de su condición.
