

### Descripción
Esta aplicación está diseñada para facilitar la gestión de inventarios mediante la creación de recibos, registro de ventas, alertas de bajo stock y administración del inventario (agregar/eliminar productos).

---

## **Características**
1. **Gestión de Inventarios:**
   - Agregar nuevos productos.
   - Actualizar o eliminar productos existentes.
   - Consultar información sobre productos en inventario.

2. **Registro de Ventas:**
   - Registrar ventas y actualizar automáticamente el inventario.
   - Generar recibos en formato texto.

3. **Alertas de Bajo Stock:**
   - Sistema de notificaciones automáticas para productos con niveles de stock bajos.

4. **Arquitectura Modular:**
   - Cliente: JavaFX (interfaz gráfica) o una interfaz web básica.
   - Servidor: Spring Boot como API RESTful.
   - Base de datos: MySQL/PostgreSQL.

5. **Pruebas Automáticas:**
   - JUnit para asegurar la calidad del código.

---

## **Requisitos del Sistema**
1. **Cliente:**
   - JDK 17 o superior.
   - JavaFX (si usas una interfaz gráfica local).
   - Navegador web (si optas por la interfaz web).

2. **Servidor:**
   - JDK 17 o superior.
   - Framework Spring Boot.
   - Base de datos MySQL/PostgreSQL instalada.

3. **Integración Continua:**
   - GitHub Actions configurado para ejecutar pruebas automáticamente.


## **Cómo Configurar y Ejecutar el Proyecto**

### 1. **Clonar el Repositorio**
```bash
git clone https://github.com/usuario/gestion-inventario.git
cd gestion-inventario
```

### 2. **Configurar la Base de Datos**
- Crea una base de datos en MySQL o PostgreSQL con el nombre `Boutique_Inventario`.
- Actualiza el archivo `application.properties` con las credenciales de tu base de datos:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/Boutique_Inventario
  spring.datasource.username=TU_USUARIO
  spring.datasource.password=TU_CONTRASEÑA
  spring.jpa.hibernate.ddl-auto=update
  ```

### 3. **Compilar y Ejecutar el Servidor**
```bash
./mvnw spring-boot:run
```

### 4. **Ejecutar el Cliente (JavaFX o Web)**
- **JavaFX:**
  - Navega a la carpeta `/src/main/java/boutiqueInventory/ui/MainFrame`.
  - Ejecuta el archivo principal `MainFrame.java`.

- **Web:**
  - Abre tu navegador y accede a `http://localhost:8080`.

---

## **Pruebas Automáticas**
1. Ejecutar pruebas con JUnit:
   ```bash
   ./mvnw test
   ```
2. Todas las pruebas están ubicadas en la carpeta `/test`.

---

## **Contribuciones**
1. Crea una rama nueva para cada funcionalidad:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
2. Envía un *Pull Request* para revisión antes de fusionar con `develop`.

---

## **Tareas Futuras**
1. Exportar recibos en formato PDF.
2. Crear una interfaz gráfica avanzada.
3. Optimizar el rendimiento para grandes volúmenes de datos.
