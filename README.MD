# Proyecto: Ejemplos con Maven y Gradle en Java ☕

Este repositorio contiene dos proyectos Java independientes para demostrar el uso de dos herramientas fundamentales en el desarrollo moderno:

- **Maven** como gestor de dependencias y pruebas con JUnit.
- **Gradle** para manejo de logs con Log4j.

---

## 📁 Estructura del Repositorio

```
java-maven-gradle-ejemplos/
├── maven-calculadora/          # Proyecto Java con Maven y JUnit
└── gradle-registro-log4j/      # Proyecto Java con Gradle y Log4j
```

---

## ✅ Proyecto 1: `maven-calculadora`

Este proyecto implementa una clase `Calculadora` con funciones básicas de suma y resta, y pruebas unitarias usando **JUnit 5**.

### 📄 Archivos Clave

- `Calculadora.java`: contiene métodos `sumar()` y `restar()`.
- `CalculadoraTest.java`: pruebas unitarias con JUnit 5.
- `pom.xml`: archivo de configuración Maven.

### ▶️ Comandos para ejecutar

```bash
cd maven-calculadora
mvn clean test
```

### 📷 Captura esperada (consola)

```
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

### 📌 Dependencia en `pom.xml`
```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.9.1</version>
  <scope>test</scope>
</dependency>
```

---

## ✅ Proyecto 2: `gradle-registro-log4j`

Este segundo proyecto implementa una clase `RegistroApp` que usa **Log4j** para registrar mensajes en diferentes niveles (INFO, WARN, ERROR).

### 📄 Archivos Clave

- `RegistroApp.java`: contiene el `main()` con logs.
- `log4j2.xml`: configuración del sistema de logging.
- `build.gradle`: configuración de Gradle y dependencias.

### ▶️ Comandos para ejecutar

```bash
cd gradle-registro-log4j
./gradlew run
```
> En Windows PowerShell o CMD:
> ```bash
> gradlew.bat run
> ```

### 📷 Captura esperada (consola)

```
HH:mm:ss [main] INFO  RegistroApp - Inicio de la aplicación
HH:mm:ss [main] WARN  RegistroApp - Esto es una advertencia
HH:mm:ss [main] ERROR RegistroApp - Esto es un error crítico
```

### 📌 Dependencias en `build.gradle`

```groovy
implementation 'org.apache.logging.log4j:log4j-core:2.17.1'
implementation 'org.apache.logging.log4j:log4j-api:2.17.1'
```

---


## 🧠 Autor

- **Wilder Aristizábal**  
- SENA – Trimestre IV – Tecnología en Análisis y Desarrollo de Software
