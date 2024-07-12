# SerenityBDD-Demoblaze-Automatizando pruebas
Automatización de la pagina " https://www.demoblaze.com/"
Autor: David Coronel, Quito-Ecuador
---------------------------------------------------------------------------------------------------------------------------------------------------
Patron de diseño: Screenplay
Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java

---------------------------------------------------------------------------------------------------------------------------------------------------
1. Prerrequisitos:
	- Maquina local con el sistema operativo Windows 11
	- Microsoft Edge (Versión 126.0.2592.87)
	- IDE IntelliJ IDEA (Community Edition) version 2023.1.7
	- Maven version 3.9.6 (debe estar en la variable de entorno)
	- Gradle versión 7.6.1 (debe estar en la variable de entorno)
	- JDK versión 17  (debe estar en la variable de entorno)

Importante: Se utilizo el browser Microsoft Edge debido a la estabilidad que presenta al momento de ejecutar pruebas,
por lo que la automatización corre en este navegador. Es necesario tenerlo instalado.
---------------------------------------------------------------------------------------------------------------------------------------------------
2. Ejecución en el archivo
-Abrir los archivos de la carpeta "PE2E" dentro del programa Intellij IDEA.
-Dirigirse al ícono de Run y correr el test o (Mayús + F10)
---------------------------------------------------------------------------------------------------------------------------------------------------

3. Comandos para ejecución por consola
-Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno
./gradlew clean test
-Comando para ejecutar por feature
./gradlew test --tests "org.nttdata.runners.RunnerOpenWeb"
-Comando para generar reporte después que haya terminado un test (Por consola arrojara la ruta .html )
./gradlew reports
-Comando para limpiar la carpeta Target (Reportes)
./gradlew clearReports
---------------------------------------------------------------------------------------------------------------------------------------------------
4.Información adicional
-Para visualizar el reporte generado en Serenity nos dirigimos después de obtener el resultado del test a
"Main report" que se muestra en la parte final y se nos genera de la siguiente manera:

Main report: file:///C:/Users/David/Desktop/nttdata%20ejemplos/Ejemplo2/PE2E/target/site/serenity/index.html

Procedemos a dar click sobre el link generado y podremos visualizar el reporte

-El archivo readme.txt y conclusiones txt se encuentran dentro de la carpeta PE2E
