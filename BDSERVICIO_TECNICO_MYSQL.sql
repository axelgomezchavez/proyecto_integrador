/*
SQLyog Community v8.71 
MySQL - 5.5.5-10.1.40-MariaDB : Database - bdservicio_tecnico
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdservicio_tecnico` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bdservicio_tecnico`;

/*Table structure for table `cargo` */

DROP TABLE IF EXISTS `cargo`;

CREATE TABLE `cargo` (
  `idcargo` int(11) NOT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcargo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cargo` */

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(`idcliente`,`nombres`,`apellidos`,`direccion`,`telefono`) values (1111111,'ana','Florencia Tacle','av  republica 17','987478478'),(14789000,'saul','palmas torres','av sauce 1','77898888'),(14789887,'luis','torres santos','av lince 5','78788888');

/*Table structure for table `horario` */

DROP TABLE IF EXISTS `horario`;

CREATE TABLE `horario` (
  `idhorario` int(11) NOT NULL AUTO_INCREMENT,
  `idtecnico` int(11) DEFAULT NULL,
  `horario_entrada` varchar(50) DEFAULT NULL,
  `horario_salida` varchar(50) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idhorario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `horario` */

/*Table structure for table `programacion_atencion` */

DROP TABLE IF EXISTS `programacion_atencion`;

CREATE TABLE `programacion_atencion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(50) DEFAULT NULL,
  `hora` varchar(50) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idtecnico` int(11) DEFAULT NULL,
  `lugar` varchar(120) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `programacion_atencion` */

/*Table structure for table `respuesto` */

DROP TABLE IF EXISTS `respuesto`;

CREATE TABLE `respuesto` (
  `idrepuesto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `cantidad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idrepuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=478744401 DEFAULT CHARSET=latin1;

/*Data for the table `respuesto` */

insert  into `respuesto`(`idrepuesto`,`nombre`,`cantidad`) values (478744400,'desarmador','20');

/*Table structure for table `servicio` */

DROP TABLE IF EXISTS `servicio`;

CREATE TABLE `servicio` (
  `idatencion` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(50) DEFAULT NULL,
  `fecha_entrega` varchar(50) DEFAULT NULL,
  `tipo_atencion` varchar(50) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idtecnico` int(11) DEFAULT NULL,
  `serie` varchar(50) DEFAULT NULL,
  `tipo_electrodomestico` varchar(50) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `descripción` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `pago` decimal(10,2) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idatencion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `servicio` */

/*Table structure for table `tecnico` */

DROP TABLE IF EXISTS `tecnico`;

CREATE TABLE `tecnico` (
  `idtecnico` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`idtecnico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tecnico` */

insert  into `tecnico`(`idtecnico`,`nombres`,`apellidos`,`direccion`,`telefono`) values (942227777,'jaime','LozanoTorres','av  republica 17','987478472');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `contraseña` varchar(50) DEFAULT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`usuario`,`contraseña`,`cargo`) values (1,'admin','123','1'),(2,'jaime','12345','2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
