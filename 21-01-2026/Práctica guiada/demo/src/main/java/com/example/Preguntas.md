**¿Qué ocurre si intentamos deserializar un JSON con un campo que no existe en la clase destino?**

Según la [guía de usuario de Gson](https://github.com/google/gson/blob/main/UserGuide.md#serializing-and-deserializing-generic-types):

> Durante la deserialización, una entrada que falta en JSON da como resultado que el campo correspondiente en el objeto se establezca en su valor predeterminado: nulo para los tipos de objeto, cero para los tipos numéricos y falso para los booleanos. No es necesario utilizar ninguna anotación para indicar que un campo debe incluirse para la serialización y deserialización. Todos los campos de la clase actual... se incluyen de forma predeterminada.

**Antes de continuar analice los métodos que tiene la clase e investigue en qué ayuda el GsonBuilder()**

PersonFileManager funciona como un gestor sencillo de modificación de archivos tomando como base un .json, donde los métodos de readAll y writeAll son los encargados de leerlo para deserializarlo, es decir, hacerlo objetos, y de serializarlo, o sea, sobreescribirlo.

Las operaciones de insertar, actualizar, borrar y obtener cargan la lista completa, realizan sus respectivas modificaciones o validaciones y vuelven a guardar con los nuevos cambios.

En este código, GsonBuilder() utiliza el método setPrettyPrinting tras su instancia, creando el json con un formato organizado (con saltos de línea y sangrías), a diferencia del constructor predeterminado. 