# Kata 2
## Objetivo
El objetivo de esta práctica es practicar la separación de responsabilidades en Java utilizando las abstracciones de flujo InputStream y OutputStream. Se busca que el programa sea capaz:
- Leer un conjunto de datos _(dataset de monstruos en D&D en formato CSV)_ mediante flujos de entrada.
- Transformar las filas de texto en entidades de dominio (Monster).
- Calcular un resumen o estadística a partir de los datos.
- Escribir el resultado obtenido en un flujo de salida genérico (OutputStream).   
## Compilacion y estructura de la entrega
Para empezar se deberá dirigir a la opcion de **Clone Repository** en su entorno de desarrollo IntelliJ IDEA y poner el enlace al repositorio correspondiente (https://github.com/TheRubils/kata2.git) sabiendo que se esta usando Oracle OpenJDK 25. El proyecto se divide en:
- Monster.java: Entidad de dominio (record) que representa una fila del dataset con sus atributos.
- MonsterLoader.java: Interfaz que define el contrato de carga basado en InputStream.
- CsvMonsterLoader.java: Implementación de la interfaz _"MonsterLoader"_ que procesa ficheros CSV línea a línea, omite la cabecera y transforma cada línea de texto en un objeto Monster controlando errores de formato.
- MonsterAnalyzer.java: Componente encargado de la lógica de negocio. Utiliza Streams de Java para agrupar y contar los monstruos según su libro de origen (sourcebook).
- MonsterWriter.java: Componente responsable de volcar el resumen calculado en cualquier OutputStream de manera eficiente mediante búferes.
- Main.java: Orquestador principal que conecta el InputStream (origen), el proceso de carga, el análisis, y el OutputStream.

Para comprobar el correcto funcionamiento del programa, deberá dirigirse a la clase Main y ejecutar el programa. Se puede realizar de forma manual o mas comodamente presionando _Mayús+F10_.
## Video
- Enlance: [Kata_2](https://youtu.be/IvnTqPmwViQ)
## Verificacion
Para asegurar el correcto funcionamiento de la aplicación bajo distintos escenarios, se han realizado las siguientes verificaciones:
1. Prueba con fichero correcto y salida por consola
2. Prueba de desacoplamiento de salidas (Escritura en fichero)
3. Prueba de robustez ante formato incorrecto
