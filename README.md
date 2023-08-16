# Sistema de Gestión de Empleados

Este proyecto consiste en un sistema de gestión de empleados implementado en Java. Permite crear y administrar información de empleados administrativos y operarios.

## Contenido

- [Descripción](#descripción)
- [Clases](#clases)
- [Uso](#uso)
- [Ejemplo](#ejemplo)
- [Contribución](#contribución)

## Descripción

El sistema está diseñado para manejar dos tipos de empleados: Empleado Administrativo y Operario. Cada uno de estos tipos tiene atributos específicos, pero ambos heredan atributos comunes de la clase base Empleado.

## Clases

### Empleado

La clase base Empleado contiene los siguientes atributos:

- `cedula`: número de identificación del empleado.
- `direccion`: dirección del empleado.
- `fechaNacimiento`: fecha de nacimiento del empleado.
- `telefono1`: primer número de teléfono del empleado.
- `telefono2`: segundo número de teléfono del empleado.
- `nombre`: nombre del empleado.

Además, proporciona métodos para consultar cada uno de estos atributos.

### EmpleadoAdministrativo

La clase EmpleadoAdministrativo hereda de Empleado y agrega el atributo:

- `area`: área en la que trabaja el empleado administrativo.

Además, proporciona el método `crearEmpleadoAdministrativo` para mostrar los detalles del empleado administrativo.

### Operario

La clase Operario también hereda de Empleado y agrega el atributo:

- `antiguedad`: antigüedad del operario en años.

Además, proporciona el método `consultarAntiguedad` para obtener la antigüedad del operario.

## Ejemplo

```java
public class Main {
    public static void main(String[] args) {
        // Crear un empleado administrativo y un operario
        EmpleadoAdministrativo empleadoAdmin = new EmpleadoAdministrativo("123456789", "Dirección1", "1990-01-01",
                "111-111-1111", "222-222-2222", "Juan", "Recursos Humanos");

        Operario operario = new Operario("987654321", "Dirección2", "1985-05-05", "333-333-3333", "444-444-4444",
                "Carlos", 3);

        // Mostrar detalles de los empleados
        System.out.println("Detalles del Empleado Administrativo:");
        // ...

        System.out.println("\nDetalles del Operario:");
        // ...
    }
}