# Prerrequisitos
Para ejecutar el presente proyecto es importante tener instaladas las siguientes herramientas:
- Java Development Kit (JDK): Asegúrate de tener instalado JDK 8 o superior. 

- Maven: Serenity y Cucumber suelen gestionarse mediante Maven como herramienta de gestión de dependencias y construcción de proyectos.

- Serenity BDD y Cucumber Dependencies: Debes configurar las dependencias adecuadas en tu archivo pom.xml para Serenity BDD y Cucumber. Esto incluye las dependencias para Serenity, Cucumber, y las bibliotecas necesarias para la integración.

- Cucumber Plugins: Si vas a usar características avanzadas de Cucumber, como reportes HTML, asegúrate de tener los plugins correspondientes instalados en tu entorno de desarrollo.

- IDE: Puedes utilizar cualquier IDE compatible con Java, como IntelliJ IDEA, Eclipse, o VSCode. Una vez instalado deberas configurar los plugins adecuados para soportar Cucumber y Serenity BDD. 

# Directorio de carpetas 
- src
  - test
    - java  
      - jsonbase
        - definitions (aqui se encuentran los definitions por cada escenario @Given, @When, @Then)
        - pages (aqui se encuentran los identificadores por cada pagina)
        - steps (aqui encontraremos los steps levantados)
        - utilities 
        - Runner, este archivo nos permitira ejecutar la aplicacion.
    - resources
      - features
        - script.feature (este es el script en donde estan detallados los 3 escenarios solicitados en lenguaje Gherkin)
  - target (dentro de esta carpeta se encuentran los reportes generados cuando ejecutamos el suite de pruebas)
    - site
      - index.html
    
        
# Instrucciones de ejecución
1. Para crear un proyecto en serenity debes ejecutar

- mvn archetype:generate -DarchetypeGroupId=net.serenity-bdd -DarchetypeArtifactId=serenity-junit-archetype -DarchetypeVersion=2.5.8 -DgroupId=tu.paquete -DartifactId=nombre-proyecto -Dversion=1.0-SNAPSHOT

Reemplaza tu paquete con el nombre del paquete base de tu proyecto y nombre-proyecto con el nombre que desees para tu proyecto.


2. Para ejecutar el proyecto ejecutar
- mvn clean verify 

Este comando limpiará el proyecto y ejecutará todas las pruebas, generando reportes en la carpeta target/site.