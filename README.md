# PetStore API - Documentación del Proyecto

Este proyecto es una aplicación Java que utiliza Spring Boot 3.1.4 para exponer un conjunto de operaciones CRUD a través de una API REST. El objetivo principal del proyecto es proporcionar una experiencia práctica para comprender cómo funcionan las operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) en el contexto de una API REST, utilizando una base de datos MySQL como sistema de almacenamiento.

## Integrantes del Equipo

- Yesid Alejandro Martinez
- Luis Alfonso Rojas Martinez
- Silvia
- Alejandro
- David

## Requisitos del Entorno

- Java Development Kit (JDK) versión 17 o superior.
- Spring Boot Core 3.1.4.
- Base de datos MySQL.


## Uso de la API

Esta API proporciona las siguientes operaciones CRUD para gestionar información sobre una tienda de mascotas:

- **GET /pets**: Obtiene la lista de todas las mascotas.
- **GET /pets/{id}**: Obtiene una mascota por su ID.
- **POST /pets**: Crea una nueva mascota.
- **PUT /pets/{id}**: Actualiza la información de una mascota existente.
- **DELETE /pets/{id}**: Elimina una mascota por su ID.
