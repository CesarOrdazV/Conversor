# Conversor de moneda - Challenge ONE Java

<h4 align="center">:construction: Proyecto en construcción :construction:</h4>

Este proyecto responde al challenge: [Challenge Back End Java - Conversor](https://www.aluracursos.com/challenges/oracle-one-back-end/conversordemoneda/sprint01) del programa [ONE](https://www.oracle.com/mx/education/oracle-next-education/) para el grupo G5.

La principal funcionalidad del producto desarrollado corresponde con un conversor entre Pesos Mexicanos (MXN) y las siguientes divisas:

* Dolar Estadounidense (USD).
* Euro (EUR).
* Libras Esterlinas (GBP).
* Yen Japonés (JPY).
* Won Surcoreano (KRW).

En un futuro se espera agregar más funcionalidades de conversión.

El programa consume la API [Open Exchange Rates](https://openexchangerates.org/) la cual posee una versión sin costo pero requiere una APP_ID. Para utilizar su propia APP_ID guadela en el archivo `.env/info.key` en el directorio del proyecto bajo el formato:

```
---- BEGIN KEY ----
'Aquí va su APP_ID' 
---- END KEY ----
```
