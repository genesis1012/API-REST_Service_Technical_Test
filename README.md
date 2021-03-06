# API-REST_Service_Technical_Test
automatización servicio rest api y ejecución desde pipeline en Jenkins

1. instalación de jenkins
se debe tener instalado jenkins el cual se puede descargar en el siguiente link https://www.jenkins.io/download/

2. creación y configuración de tarea tipo pipeline
- en el inicio de jenkins creamos una nueva tarea

![image](https://user-images.githubusercontent.com/32232213/131258186-9195f076-45be-49c9-9524-15fa159ba1a0.png)

- colocamos nombre a la tarea, seleccionamos de tipo pipeline y damos en OK

![image](https://user-images.githubusercontent.com/32232213/131258220-45573254-8e69-4748-8281-052c5fa56d41.png)

- configuramos el Build Triggers, escogemos consultar repositorio SCM, colocamos 5 asteriscos separados por coma (,) lo cual indica que cada minuto se validara si hay cambios en el repositori para ejecutar el pipeline

![image](https://user-images.githubusercontent.com/32232213/131258303-6f492661-437d-4cb1-a983-49779ddb6f7c.png)

- en la parte de pipeline escogemos una definición de tipo Pipeline script from SCM, en la parte de SCM escogemos Git, en el Repository URL colocamos la URL del repositorio en GITHUB.

![image](https://user-images.githubusercontent.com/32232213/131258406-539d6b20-dbde-4b95-a51e-2977b6230387.png)

- los demás campos los dejamos por defecto y en la parte final, en el campo Script Path colocamos la ruta con el archivo Jenkins, en mi caso tengo el archivo en el directorio principal por tal motivo solo coloco el nombre del archivo, y le damos guardar

![image](https://user-images.githubusercontent.com/32232213/131258470-d849b225-4285-41c3-bf0d-b1695e390da5.png)

NOTA: para tener la url del repositorio de GITHUB, en la parte principal en la parte de clonar, escogemos SSH y copiamos la url que nos muestra.

![image](https://user-images.githubusercontent.com/32232213/131258508-76f260f5-6d25-420d-a7de-e615e30bd64b.png)

3. Con esta configuración, se ejecutará el pipeline definido en la raíz del proyecto cada que se detecte un cambio en el repositorio de GITHUB.

4. ejecución manual del proyecto.
- para ejecutar el proyecto desde jenkins solo basta con darte en Construir ahora

![image](https://user-images.githubusercontent.com/32232213/131258725-310da5ce-d44f-42a9-83e0-396703b7d080.png)

- en caso de ejecutar desde consola solo escribiendo Gardle clean test estando desde consola parado en la raíz del proyecto

- en caso de ejecutar desde el IDE de Intellij se puede desde el mismo runner

![image](https://user-images.githubusercontent.com/32232213/131258883-24372914-d19a-41a0-bd6b-115bc3bfa369.png)



# Saludos!
