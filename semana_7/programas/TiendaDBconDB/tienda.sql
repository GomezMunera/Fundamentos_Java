-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tienda
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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cc` int NOT NULL,
  `nombre_1` varchar(45) DEFAULT NULL,
  `nombre_2` varchar(45) DEFAULT NULL,
  `apellido_1` varchar(45) DEFAULT NULL,
  `apellido_2` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `contacto_1` varchar(45) DEFAULT NULL,
  `contacto_2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2154578,'Juan','Alberto','Martinez','Gacha','Medellín','3012225546','3235566'),(3256598,'Luisa',NULL,'Restrepo','Ocampo','Pereira',NULL,'3002654879'),(4565897,'Leon','Daniel','Gomez','Hoyos','Manizales','3104569872','3255648'),(4587863,'Joaquín','Emilio','Correa','Guzmán','Cartagena',NULL,'3125648792');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle`
--

DROP TABLE IF EXISTS `detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle` (
  `Productos_cod_barras` int NOT NULL,
  `Factura_num_compra` int NOT NULL,
  PRIMARY KEY (`Factura_num_compra`,`Productos_cod_barras`),
  KEY `fk_Productos_has_Factura_Factura1_idx` (`Factura_num_compra`),
  KEY `fk_Productos_has_Factura_Productos1_idx` (`Productos_cod_barras`),
  CONSTRAINT `fk_Productos_has_Factura_Factura1` FOREIGN KEY (`Factura_num_compra`) REFERENCES `factura` (`num_compra`),
  CONSTRAINT `fk_Productos_has_Factura_Productos1` FOREIGN KEY (`Productos_cod_barras`) REFERENCES `productos` (`cod_barras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle`
--

LOCK TABLES `detalle` WRITE;
/*!40000 ALTER TABLE `detalle` DISABLE KEYS */;
INSERT INTO `detalle` VALUES (11111111,1),(22222222,1),(33333333,1),(11111111,2),(22222222,2),(22222222,3),(33333333,3);
/*!40000 ALTER TABLE `detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `num_compra` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `Cliente_cc` int NOT NULL,
  `ventas_Vendedor_num_compra` int NOT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `Vendedor_ccVendedor` int NOT NULL,
  PRIMARY KEY (`num_compra`,`ventas_Vendedor_num_compra`),
  KEY `fk_Factura_Cliente1_idx` (`Cliente_cc`),
  KEY `fk_Factura_Vendedor1_idx` (`Vendedor_ccVendedor`),
  CONSTRAINT `fk_Factura_Cliente1` FOREIGN KEY (`Cliente_cc`) REFERENCES `cliente` (`cc`),
  CONSTRAINT `fk_Factura_Vendedor1` FOREIGN KEY (`Vendedor_ccVendedor`) REFERENCES `vendedor` (`ccVendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,20,4587863,11111,'Medellin',1234567),(2,20,3256598,11112,'Medellin',1234567),(3,20,2154578,11113,'Medellin',6547891),(4,20,2154578,11114,'Medellin',9876543);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `precio` int DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `cod_barras` int NOT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`cod_barras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1500,'panPrueba',11111111,200),(1000,'azucarPrueba',22222222,300),(2000,'lechePrueba',33333333,400);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedor`
--

DROP TABLE IF EXISTS `vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendedor` (
  `ccVendedor` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contrasena` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ccVendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (1234567,'Benito','Garcia','Beniga23','789321'),(6547891,'Luis','Amador','lam123','456798'),(9876543,'Sara','Valencia','Sval32','798465');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-28  1:30:58
