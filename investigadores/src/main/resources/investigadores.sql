-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: investigadores
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipos` (
  `num_serie` char(4) NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `facultad` int DEFAULT NULL,
  PRIMARY KEY (`num_serie`),
  KEY `facultad` (`facultad`),
  CONSTRAINT `equipos_ibfk_1` FOREIGN KEY (`facultad`) REFERENCES `facultades` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES ('0001','Equipo A',1),('0002','Equipo B',2),('0003','Equipo C',1),('0004','Equipo D',3),('0005','Equipo E',2),('0006','Equipo F',4),('0007','Equipo G',5),('0008','Equipo H',6),('0009','Equipo I',7),('0010','Equipo J',8);
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facultades`
--

DROP TABLE IF EXISTS `facultades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facultades` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facultades`
--

LOCK TABLES `facultades` WRITE;
/*!40000 ALTER TABLE `facultades` DISABLE KEYS */;
INSERT INTO `facultades` VALUES (1,'Facultad de Ciencias'),(2,'Facultad de Ingeniería'),(3,'Facultad de Medicina'),(4,'Facultad de Artes'),(5,'Facultad de Economía'),(6,'Facultad de Derecho'),(7,'Facultad de Letras'),(8,'Facultad de Psicología'),(9,'Facultad de Educación'),(10,'Facultad de Comunicación');
/*!40000 ALTER TABLE `facultades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investigadores`
--

DROP TABLE IF EXISTS `investigadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `investigadores` (
  `dni` varchar(8) NOT NULL,
  `nom_apels` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `facultad` int DEFAULT NULL,
  PRIMARY KEY (`dni`),
  KEY `facultad` (`facultad`),
  CONSTRAINT `investigadores_ibfk_1` FOREIGN KEY (`facultad`) REFERENCES `facultades` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investigadores`
--

LOCK TABLES `investigadores` WRITE;
/*!40000 ALTER TABLE `investigadores` DISABLE KEYS */;
INSERT INTO `investigadores` VALUES ('0893780A','María González',1),('1894075E','Juan Rodríguez',2),('2024487Q','Pedro Martínez',3),('2299134B','Laura Pérez',2),('3319220A','Lucía Torres',7),('3773638D','David Ramírez',6),('7074163Z','Sara Fernández',5),('7350476L','Ana López',1),('8526825E','Carlos Gómez',4),('9036500M','Luis Castro',8);
/*!40000 ALTER TABLE `investigadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(8) DEFAULT NULL,
  `num_serie` char(4) DEFAULT NULL,
  `comienzo` datetime DEFAULT NULL,
  `fin` datetime DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `dni` (`dni`),
  KEY `num_serie` (`num_serie`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `investigadores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`num_serie`) REFERENCES `equipos` (`num_serie`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,'0893780A','0001','2023-10-31 10:00:00','2023-10-31 12:00:00'),(2,'1894075E','0002','2023-07-22 14:00:00','2023-07-22 16:00:00'),(3,'7350476L','0003','2023-01-02 09:00:00','2023-01-02 11:00:00'),(4,'2024487Q','0004','2023-02-13 13:00:00','2023-02-13 15:00:00'),(5,'2299134B','0005','2023-11-30 16:00:00','2023-11-30 18:00:00'),(6,'8526825E','0006','2023-09-10 10:30:00','2023-09-10 12:30:00'),(7,'7074163Z','0007','2023-01-05 11:30:00','2023-01-05 13:30:00'),(8,'3773638D','0008','2023-03-09 15:30:00','2023-03-09 17:30:00'),(9,'3319220A','0009','2023-10-17 12:00:00','2023-10-17 14:00:00'),(10,'9036500M','0010','2023-12-24 14:30:00','2023-12-24 16:30:00');
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-03  1:45:00
