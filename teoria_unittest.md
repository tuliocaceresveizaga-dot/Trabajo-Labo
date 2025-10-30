# teoria de unit testing
Las pruebas unitarias consisten en probar las partes más pequeñas del código, como si se tratara de un método que verifica la corrección del código ejecutándolo una por una. Es una parte clave del desarrollo de software que mejora la calidad del código al probar cada unidad de forma aislada.
## como usar 
rimero configura un proyecto de pruebas, luego escribe casos de prueba concisos que validen un único comportamiento a la vez
#### pasos
##### Analiza y planifica:
 Identifica las partes de tu código que necesitan pruebas y crea un plan de casos de prueba, incluyendo escenarios normales y de error.
##### Configura el entorno:
 Crea un nuevo proyecto de pruebas unitarias en tu solución (por ejemplo, usando NUnit o JUnit) y agrega una referencia al proyecto que quieres probar.
##### Escribe los casos de prueba:
Crea un método de prueba para validar un único comportamiento.
##### Utiliza un enfoque de tres pasos:
 Arrange (prepara las variables y el estado), Act (ejecuta la unidad de código a probar) y Assert (verifica que el resultado sea el esperado).
Incluye pruebas para escenarios positivos y negativos (por ejemplo, entradas válidas e inválidas).
##### Ejecuta las pruebas:
Usa el "Explorador de pruebas" de tu IDE o la línea de comandos para ejecutar las pruebas.
Verifica si todos los casos de prueba pasan.
##### Revisa y depura:
 Si una prueba falla, depura el código de la unidad para encontrar y corregir el error. Vuelve a ejecutar la prueba para asegurarte de que ahora funciona correctamente.
##### Automatiza las pruebas:
 Configura la ejecución automática de las pruebas, por ejemplo, al hacer commits o antes de desplegar, para asegurar que los cambios no rompan la funcionalidad existente. 
## por que usar 
El unit testing es clave para garantizar que cada módulo de software funcione correctamente antes de integrarlo con el resto del sistema. Este enfoque estructurado permite a los equipos de desarrollo detectar errores rápidamente, mejorar la estabilidad del software y optimizar los tiempos de entrega, verificando que el bloque de código se ejecuta según lo esperado, de acuerdo con la lógica teórica del desarrollador.
## cuando usar 
para verificar que las unidades de código más pequeñas, como funciones o métodos, funcionen correctamente de forma aislada 
### momentos claves para usar 
- #### Al principio del desarrollo:
 Son el primer nivel de prueba, ayudando a identificar errores temprano en el código, antes de que sea más costoso y complicado de corregir.
- #### Durante el desarrollo:
 Realízalas a medida que escribes cada unidad de código para asegurar que cada parte funciona como se espera.
- #### Antes de integrar el código:
 Úsalas para validar componentes individuales antes de combinarlos con otras partes de la aplicación, asegurando que cada módulo funciona correctamente.
- #### Antes de hacer cambios importantes:
 Útil al refactorizar el código para tener una red de seguridad que te asegure que no introduces nuevos errores.
- #### Antes de enviar cambios: 
Actívalas antes de subir tus cambios a una rama en un sistema de control de versiones para prevenir errores en el código principal.
- #### Antes de implementar una actualización: 
Ejecútalas antes de poner en producción una nueva versión del software para garantizar que las nuevas funcionalidades no rompen las existentes.
- #### Como parte del ciclo de desarrollo: 
Implementa pruebas unitarias automatizadas que se ejecuten regularmente, por ejemplo, con un cronograma establecido, para un monitoreo constante. 