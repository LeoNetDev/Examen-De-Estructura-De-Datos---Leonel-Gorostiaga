# Evaluación Hito 3 - API REST Estructura de Datos

Este proyecto consiste en una API REST desarrollada con Spring Boot para la gestión de calificaciones, asientos de aula y una lista de estudiantes.

## Estructura del Proyecto
- **Parte 1**: Arreglo unidimensional para calificaciones (promedio, max, min).
- **Parte 2**: Arreglo bidimensional (5x5) para control de asientos de aula.
- **Parte 3**: Lista enlazada simple con algoritmos de ordenamiento y búsqueda.

## Instrucciones para ejecutar el proyecto
1. Clonar el repositorio.
2. Abrir en IntelliJ IDEA como un proyecto Maven.
3. Ejecutar la clase `TestApplication`.
4. La API estará disponible en `http://localhost:8080`.

## Endpoints y ejemplos de peticiones

### Parte 1: Notas
- **Agregar nota**: `GET /notas/agregar?valor=85`
- **Mostrar notas**: `GET /notas`
- **Estadísticas**: `/notas/promedio`, `/notas/max`, `/notas/min`

### Parte 2: Aula (Matriz 5x5)
- **Mostrar matriz**: `GET /aula`
- **Ocupar asiento**: `GET /aula/ocupar?fila=2&columna=3`
- **Liberar asiento**: `GET /aula/liberar?fila=2&columna=3`
- **Contar ocupados**: `GET /aula/ocupados`

### Parte 3: Estudiantes (Lista Enlazada)
- **Agregar**: `GET /estudiantes/agregar?nombre=Ana&puntaje=95`
- **Mostrar**: `GET /estudiantes`
- **Ordenar (Mayor a Menor)**: `GET /estudiantes/ordenados`
- **Buscar**: `GET /estudiantes/buscar/Juan`
