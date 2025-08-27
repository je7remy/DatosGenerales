
# System College – Datos Generales

> **Sistema de colegio (solo front-end de ingreso y módulos básicos)**
> Proyecto Java Web con JSP/Bootstrap orientado a la gestión de entidades académicas y consulta de usuarios.

## ✨ Características

* **Pantallas JSP** para:

  * Usuarios (búsqueda, consulta y resumen)
  * Regiones/Departamentos/Institutos
  * Cursos, Grados y Secciones
  * Menú principal y páginas de navegación
* **UI** con **Bootstrap 4**, **jQuery** y **DataTables** (exportación, filtros, paginación).
* Estructura compatible con **NetBeans** y **GlassFish/Payara** (incluye `glassfish-web.xml`).
* Artefacto **WAR** listo para desplegar (`dist/System_colllege.war`).
* Mapeos y utilidades **Hibernate 4.x** (configurable).

> Nota: el repositorio contiene principalmente el **front-end JSP/JS/CSS** y vistas de consulta. La lógica de negocio y el esquema de BD deben ajustarse según tu entorno.

---

## 🗂️ Estructura del proyecto

```
System colllege/
├─ build/                # Artefactos de compilación generados
├─ dist/                 # WAR empaquetado (listo para desplegar)
├─ nbproject/            # Metadatos de NetBeans (Ant)
├─ src/
│  ├─ java/
│  │  ├─ model/          # Clases y mapeos Hibernate (*.java / *.hbm.xml)
│  │  ├─ util/           # HibernateUtil
│  │  └─ Vista/          # Formularios/frames generados por IDE (swing forms)
│  └─ conf/              # MANIFEST.MF
├─ web/
│  ├─ Css/               # Estilos propios
│  ├─ bootstrap/         # Bootstrap (css/js)
│  ├─ datatables/        # DataTables y plugins (Buttons, etc.)
│  ├─ jquery/ js/        # jQuery / scripts propios (main.js, Busquedas.js)
│  ├─ WEB-INF/           # clases/ (compilados), libs/, configs (hibernate*.xml)
│  ├─ *.jsp              # Usuarios.jsp, Regional.jsp, Consulta*.jsp, Menu.jsp
│  └─ ...
├─ build.xml             # Script Ant (build/deploy)
└─ System_colllege.war   # (en /dist) artefacto generado
```

---

## 🧰 Tecnologías

* **Java 8** (recomendado)
* **JSP / Servlets**
* **Hibernate 4.3.x** (c3p0, slf4j, etc.)
* **Bootstrap 4**, **jQuery 3.x**, **DataTables 1.10.x** (+ Buttons)
* **NetBeans 8.x** (Ant)
* **GlassFish 4.x / Payara** o servidor compatible con Java EE 7

---

## 🚀 Puesta en marcha

### Opción A: Desplegar el WAR

1. Compila (si es necesario) o usa el artefacto existente: `dist/System_colllege.war`.
2. Sube el WAR a tu servidor (GlassFish/Payara/Tomcat).
3. Accede con tu navegador a la URL de la app (por ejemplo: `http://localhost:8080/System_colllege`).

### Opción B: Ejecutar desde NetBeans

1. Abre el proyecto **System colllege** en NetBeans.
2. Configura tu **servidor** (GlassFish/Payara) como “Server” del proyecto.
3. Ajusta la configuración de BD en `web/WEB-INF/hibernate.cfg.xml`.
4. Ejecuta con **Run** (F6).

---

## ⚙️ Configuración de base de datos (opcional)

El proyecto incluye clases y mapeos de ejemplo en `src/java/model/` (p. ej. `Customer`, `Product`, etc.).
Para conectar tu BD:

1. Edita `web/WEB-INF/hibernate.cfg.xml` con tu **driver**, **URL**, **usuario** y **clave**.
2. Revisa/ajusta los **mapeos** `*.hbm.xml` a tu esquema.
3. Asegura que las **librerías JDBC** estén disponibles en `WEB-INF/lib/` o en el servidor.

> Si usarás la app solo como **front-end de consulta** (mock/demo), puedes omitir la conexión real y trabajar con datos simulados en JSP/JS.

---

## 🧭 Páginas clave

* `Menu.jsp` – navegación principal
* `Usuarios.jsp`, `ConsultaUsuarios.jsp`, `BusquedaUsuarios.jsp`
* `Regional.jsp`, `ConsultaRegional.jsp`, `BusquedaRegional.jsp`
* `Departamento.jsp`, `Instituto.jsp`, `Curso.jsp`, `Grado.jsp`, `fseccion.jsp`
* Recursos estáticos: `web/Css/*.css`, `web/js/*.js`, `web/datatables/*`, `web/bootstrap/*`

---

## 🧪 Datos y exportaciones

La tabla de datos usa **DataTables + Buttons** para:

* Búsqueda y ordenamiento.
* Exportación (CSV/Excel/PDF/Print).
* Paginación y densidad de filas.

Si el botón de exportación no aparece, verifica que:

* Estén presentes `JSZip`, `pdfmake` y `vfs_fonts`.
* Se referencien correctamente los scripts en tus JSP.

---

## 🧱 Requisitos

* JDK 8+
* Servidor Java EE (GlassFish 4 / Payara 5 o Tomcat 8.5+)
* NetBeans 8.x (opcional, para desarrollo)
* Driver JDBC de tu motor (MySQL/PostgreSQL/SQLServer, etc.) si conectas BD

---

## 📦 Build con Ant

Comandos relevantes del `build.xml`:

* `clean` – limpia artefactos
* `compile` – compila fuentes
* `war` – empaqueta la aplicación (`dist/*.war`)
* `run/deploy` – según config del IDE/servidor

Ejemplo:

```bash
ant clean war
```

---

## 🔒 Estado del proyecto

Este repo se publica con fines **educativos/demostrativos** y contiene gran cantidad de **dependencias estáticas** (Bootstrap/DataTables/pdfmake).
Se recomienda modernizar gradualmente a:

* **Maven/Gradle** para dependencias.
* **JSTL/EL** y controladores claros (Servlets/REST).
* Separación de capas y DTOs.
* Migración a **Jakarta EE / Spring** según objetivos.

---

## 🗺️ Roadmap sugerido

* [ ] Página de **login** real (ahora es front-end)
* [ ] Integración con **BD** y DAOs/Servicios
* [ ] Control de sesión/roles
* [ ] Validaciones del lado servidor
* [ ] Internacionalización (ES/EN)
* [ ] Test funcional (Selenium/Playwright)

---

## 🤝 Contribuciones

¡Se aceptan PRs!
Propón issues con:

* Descripción breve
* Pasos para reproducir
* Capturas/logs (si aplica)

---

## 👤 Autor

**@je7remy** – Proyecto “DatosGenerales / System colllege”.
Si este README te fue útil, deja una ⭐ en el repo.

---
