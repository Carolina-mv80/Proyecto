/**
* Vamos a crear las rutas del servidor
* creamos un módulo por eso utilizamos express
* vamos a utilizar nuestra api rest api para 
* enviar y recibir datos en formato json
*/

const express = require('express');
const router = express.Router();

const empleadoCtrl = require('../Controllers/empleado.controller'); // Se importa el controlador de empleados - funcionalidades

router.get('/', empleadoCtrl.getEmpleados); // Rutas para obtener todos los empleados

router.post('/', empleadoCtrl.createEmpleados);//Ruta para crear un nuevo empleado y guardar en la bd

router.get('/:id', empleadoCtrl.getUnicoEmpleado);// Ruta para obtener un único empleado por su ID

router.put('/:id',empleadoCtrl.editarEmpleado); //Ruta para Actualizar los datos de un empleado específico por su ID

router.delete('/:id', empleadoCtrl.eliminarEmpleado); //Ruta para Eliminar un empleado específico por su ID

module.exports = router; // Se exporta el enrutador para que pueda ser utilizado en otros archivos