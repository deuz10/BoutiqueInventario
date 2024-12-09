Gestión de Inventario  

Una solución simple y eficiente para manejar el control de productos en inventarios, diseñada para pequeñas y medianas empresas.  

---

Tabla de Contenidos
1. Descripción  
2. Problemas Identificado
3. Solución
4. Arquitectura 
5. Requerimientos
6. Instalación
7. Configuración  
8. Uso
    - Referencia para Usuarios Finales
    - [Referencia para usuarios finales
9. Contribución
10. Roadmap

---

1.Descripción
La aplicación de Gestión de Inventario permite a los usuarios realizar tareas esenciales como agregar y eliminar productos, consultar el stock disponible y registrar ventas. Este sistema busca simplificar la administración de inventarios y facilitar las operaciones diarias.  



2.Problema Identificado
1. **Control manual de inventarios:** Genera ineficiencias y errores en el manejo de productos.  
2. **Falta de automatización:** Los registros de ventas y movimientos de stock suelen realizarse de forma manual.  
3. **Interfaz básica:** Las herramientas actuales no son intuitivas ni flexibles para usuarios finales.  

---

3.Solución
1. **Funciones actuales:**  
   - Agregar y eliminar productos al inventario.  
   - Consultar el stock disponible en tiempo real.  
   - Registrar ventas y actualizar automáticamente el stock.  
2. **Futuras mejoras:**  
   - Notificaciones automáticas de bajo stock.  
   - Generación de recibos de ventas.  
   - Mejora de la interfaz gráfica para facilitar el uso.  

---

### **Diagrama de Arquitectura**  
```plaintext
          [ Cliente ]
         (JavaFX/UI Web)
              |
              V
 [ Servidor de Aplicación ]
 (Spring Boot - API REST)
              |
              V
     [ Base de Datos ]
     (MySQL/PostgreSQL)


---

5.Requerimientos

Tecnológicos

1. Servidor de Aplicación: Spring Boot.


2. Base de Datos: MySQL o PostgreSQL.



Paquetes Adicionales

Maven para la gestión de dependencias.

JUnit para pruebas unitarias.


Versiones Requeridas

Java: JDK 17 o superior.

Base de datos: MySQL 8.0 o PostgreSQL 14.0.

Maven: 3.8.5 o superior.



---

Instalación

Ambiente de Desarrollo

1. Clona el repositorio:

git clone https://github.com/usuario/gestion-inventario.git
cd gestion-inventario


2. Configura el archivo application.properties para la base de datos.


3. Ejecuta la aplicación:

./mvnw spring-boot:run



Ejecutar Pruebas Manualmente

1. Corre las pruebas unitarias:

./mvnw test



Implementación en Producción

1. Despliega el proyecto en un servidor local o en la nube (ejemplo: Heroku).




---

Configuración

Archivos de Configuración

application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/inventario_db
spring.datasource.username=usuario
spring.datasource.password=contraseña


Requerimientos de Configuración

Configura los valores de conexión a la base de datos.

Ajusta las propiedades según el entorno (desarrollo/producción).



---

Uso

Referencia para Usuarios Finales

1. Agregar Producto: Desde la sección de inventario, selecciona "Agregar Producto" e ingresa los detalles necesarios.


2. Eliminar Producto: Selecciona el producto deseado y elimina su registro desde la misma sección.


3. Consultar Stock: Revisa la lista de productos con su stock disponible en la sección de inventario.


4. Registrar Ventas: Accede a "Ventas", selecciona el producto, ingresa la cantidad y confirma la operación.



Referencia para Administradores

1. Gestión de Usuarios: Aún no disponible (futuro desarrollo).


2. Configuración de Alertas: Será incluido en próximas actualizaciones.




---

Contribución

Pasos para Contribuir

1. Clona el repositorio:

git clone https://github.com/usuario/gestion-inventario.git
cd gestion-inventario


2. Crea un nuevo branch:

git checkout -b feature/nueva-funcionalidad


3. Realiza tus cambios y envía el branch:

git push origin feature/nueva-funcionalidad


4. Envía un pull request y espera aprobación.




---

Roadmap

Próximos pasos:

1. Alertas de bajo stock: Notificaciones automáticas para productos por debajo del límite establecido.


2. Generación de recibos: Creación de recibos en formato PDF para cada venta registrada.


3. Mejora de la interfaz: Desarrollo de una interfaz más intuitiva y fácil de usar para todos los usuarios.

