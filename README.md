Resolución del ejercicio N°12  de la unidad 4 de programación 2.
El programa simula un sistema de procesamiento y escrutinio electoral basado en la Programación Orientada a Objetos (POO). Su propósito principal es gestionar el conteo de votos de diferentes tipos de boletas electorales de manera automatizada y polimórfica, aplicando reglas específicas de validación o penalización (como tachas o preferencias) a través de un centro de cómputos centralizado.

Clases y Componentes Utilizados
BoletaElectoral (Clase Abstracta)

Propósito: Actúa como la plantilla base para cualquier tipo de boleta. Define atributos comunes como el nombreCandidato y el partidoPolitico, y declara el método abstracto contarVoto(int cantidadEmitida) que las clases hijas están obligadas a implementar según su propia lógica.

BoletaIntendente (Clase Concreta / Hija)

Propósito: Modela la boleta para el cargo de Intendente. Sobrescribe el método de conteo aplicando la lógica particular para este estamento (por ejemplo, validando si el voto es íntegro o si se computa de forma directa).

BoletaConcejales (Clase Concreta / Hija)

Propósito: Modela la boleta para concejales. Implementa su propia regla de conteo, que suele contemplar restricciones por el uso de preferencias o listas de candidatos múltiples.

BoletaLegisladores (Clase Concreta / Hija)

Propósito: Modela la boleta destinada a legisladores. Aplica reglas de conteo específicas que pueden incluir validaciones de tachas de candidatos dentro de la lista.

CentroComputos (Clase Coordinadora)

Propósito: Funciona como el sistema central de procesamiento. Almacena una colección heterogénea (mixta) de boletas a través de la clase abstracta y se encarga de recorrerlas de forma polimórfica para totalizar la cantidad de sufragios válidos emitidos.
<img width="1032" height="306" alt="Captura de pantalla 2026-10-29 152316" src="https://github.com/user-attachments/assets/ac59ec4b-d7db-47d7-afc0-62cab138cab0" />
