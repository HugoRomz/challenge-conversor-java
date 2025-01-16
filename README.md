# Java Conversor de Moneda

## Descripción

Este proyecto es un **Conversor de Moneda** desarrollado en Java que utiliza la **API Exchange Rate** para obtener tasas de cambio actualizadasy forma parte del **challenge de Alura Latam** dentro del curso de **ONE**.

## Características

- **Conversión Multimoneda:** Permite convertir entre múltiples monedas de forma rápida y precisa.
- **Tasas de Cambio en Tiempo Real:** Utiliza la API Exchange Rate para obtener las tasas más recientes.
- **Historial de Conversiones:** Guarda un registro de las conversiones realizadas durante la sesión.

## Tecnologías Utilizadas

- **Lenguaje de Programación:** Java 11
- **API:** Exchange Rate API
- **Control de Versiones:** Git y GitHub
- **Entorno de Desarrollo:** IntelliJ IDEA

## Instalación

### Prerrequisitos

- **Java JDK:** Asegúrate de tener instalado Java JDK 11 o superior.
- **API KEY** Tener la api key de Exchange Rate API

### Pasos

1. **Clonar el Repositorio:**
    ```bash
    git clone https://github.com/HugoRomz/challenge-conversor-java.git
    ```

2. **Navegar a la Carpeta del Proyecto:**
    ```bash
    cd nombre-de-la-carpeta
    ```

3. **Configurar la API Key:**
    - Regístrate en Exchange Rate API para obtener una API Key gratuita.
    - Crea un archivo llamado `config.properties` en la raíz del proyecto y añade la siguiente línea:
      ```
      API_KEY = TU_API_KEY_AQUÍ
      URL_API = https://v6.exchangerate-api.com/v6/ ó la url actualizada
      ```

## Uso

1. **Iniciar la Aplicación:**
    - Ejecuta el JAR o inicia desde tu IDE.

2. **Seleccionar Monedas:**
    - Elige la moneda de origen y la moneda de destino de las opciones disponibles.

3. **Ingresar la Cantidad:**
    - Introduce la cantidad que deseas convertir.

4. **Obtener Resultado:**
    - La aplicación mostrará el monto convertido basado en las tasas de cambio actuales.

5. **Ver Historial (Opcional):**
    - Revisa las conversiones realizadas durante la sesión.

## Ejemplo de Uso
```markdown
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
|   Sea bienvenido/a al Conversor de monedas :3   |
|-------------------------------------------------|
| 1) Realizar Conversión de Moneda                |
| 2) Consultar Historial                          |
|-------------------------------------------------|
| 3) Salir                                        |
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Elija una opción válida: 
1
Seleccione la moneda de origen:
1) USD
2) MXN
3) BRL
4) CLP
5) EUR
6) BOB
Opción: 2
Seleccione la moneda de destino:
1) USD
2) MXN
3) BRL
4) CLP
5) EUR
6) BOB
Opción: 1
Ingresa el monto a cambiar
5400
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 La conversión de 5400.0 [MXN] a [USD] es igual a: 263.79 [USD]

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   ```
