-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: colegio
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `cc` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  PRIMARY KEY (`cc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (456,'Pedro','Perez',20),(741,'Leon','Escobar',30),(789,'Maria','Gómez',23),(852,'Luisa','Jaramillo',28),(963,'Lina','Giraldo',21);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante_has_materias`
--

DROP TABLE IF EXISTS `estudiante_has_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante_has_materias` (
  `Estudiante_cc` int NOT NULL,
  `Materias_codigo` int NOT NULL,
  PRIMARY KEY (`Estudiante_cc`,`Materias_codigo`),
  KEY `fk_Estudiante_has_Materias_Materias1_idx` (`Materias_codigo`),
  KEY `fk_Estudiante_has_Materias_Estudiante_idx` (`Estudiante_cc`),
  CONSTRAINT `fk_Estudiante_has_Materias_Estudiante` FOREIGN KEY (`Estudiante_cc`) REFERENCES `estudiante` (`cc`),
  CONSTRAINT `fk_Estudiante_has_Materias_Materias1` FOREIGN KEY (`Materias_codigo`) REFERENCES `materias` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante_has_materias`
--

LOCK TABLES `estudiante_has_materias` WRITE;
/*!40000 ALTER TABLE `estudiante_has_materias` DISABLE KEYS */;
INSERT INTO `estudiante_has_materias` VALUES (741,1),(963,1),(456,2),(789,2),(852,2),(963,2),(741,3),(789,3),(852,3),(456,4),(741,4),(789,4),(852,4);
/*!40000 ALTER TABLE `estudiante_has_materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `codigo` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `horario` time DEFAULT NULL,
  `creditos` int DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (1,'Matemáticas','10:00:00',4),(2,'Lenguaje','14:00:00',3),(3,'Ciencias','13:00:00',4),(4,'Inglés','11:00:00',3);
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiasjuan`
--

DROP TABLE IF EXISTS `materiasjuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiasjuan` (
  `materia` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiasjuan`
--

LOCK TABLES `materiasjuan` WRITE;
/*!40000 ALTER TABLE `materiasjuan` DISABLE KEYS */;
INSERT INTO `materiasjuan` VALUES ('Lenguaje','Pedro'),('Inglés','Pedro');
/*!40000 ALTER TABLE `materiasjuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `materiasjuanv`
--

DROP TABLE IF EXISTS `materiasjuanv`;
/*!50001 DROP VIEW IF EXISTS `materiasjuanv`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `materiasjuanv` AS SELECT 
 1 AS `MateriasJuan`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `materiasjuanv`
--

/*!50001 DROP VIEW IF EXISTS `materiasjuanv`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `materiasjuanv` AS select `m`.`nombre` AS `MateriasJuan` from ((`materias` `m` join `estudiante` `e`) join `estudiante_has_materias` `h`) where ((`e`.`cc` = `h`.`Estudiante_cc`) and (`m`.`codigo` = `h`.`Materias_codigo`) and (`e`.`nombre` = 'Pedro')) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-25 18:56:50
