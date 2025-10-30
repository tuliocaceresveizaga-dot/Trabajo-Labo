# Teoria de maven o poetry 
Maven y Poetry son herramientas de gestión de proyectos, pero difieren en su enfoque principal: Maven, centrado en proyectos Java, se basa en un Modelo de Objeto de Proyecto (POM) para definir el ciclo de vida de compilación y sus dependencias; Poetry, enfocado en proyectos Python, utiliza un único archivo para gestionar dependencias, configuraciones y el empaquetado del proyecto. 
## como usar 
Maven se utiliza para la gestión de proyectos Java y funciona con un archivo pom.xml para definir dependencias y compilar el código. Poetry se usa en proyectos Python y gestiona las dependencias a través de un archivo pyproject.toml, creando entornos virtuales y automatizando el flujo de trabajo se les dejara un videoa para entender mejor  
[google](https://youtu.be/rE7zLuQv2IU)
## por que usar
### maven
Gestión de dependencias: Descarga y maneja automáticamente las librerías necesarias para el proyecto, evitando la búsqueda e instalación manual de archivos JAR.
Estructura de proyecto estándar: Promueve una estructura de directorios consistente para el proyecto, lo que facilita la comprensión y el mantenimiento.
Automatización: Unifica el proceso de compilación, pruebas, empaquetado y despliegue en un solo comando, definido en su archivo pom.xml.
### poetry
Gestión de dependencias: Declara las dependencias del proyecto en pyproject.toml, y Poetry se encarga de instalarlas y mantenerlas actualizadas automáticamente.
Entornos virtuales: Crea y administra el entorno virtual de Python para cada proyecto, manteniendo las dependencias aisladas.
Empaquetado y distribución: Facilita la creación de paquetes del proyecto para su distribución.
## cuando usar 
#### usa maven si:
- Estás trabajando con un proyecto Java.
- Necesitas automatizar la compilación, pruebas, empaquetado y despliegue.
- Quieres un sistema de compilación uniforme que aplique las mejores prácticas.
- La estandarización de la estructura del proyecto para facilitar la colaboración en equipos grandes es importante.
#### usa poetry si:
- Estás trabajando con un proyecto Python.
- Necesitas una alternativa más moderna a pip para la gestión de paquetes y dependencias.
- Quieres gestionar fácilmente el entorno virtual de tu proyecto.
- La gestión de dependencias de una manera más integrada y moderna es una prioridad. 