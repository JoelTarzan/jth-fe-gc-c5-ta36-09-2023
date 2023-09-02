-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cientificos
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
-- Table structure for table `asignaciones`
--

DROP TABLE IF EXISTS `asignaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignaciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cientifico` varchar(8) DEFAULT NULL,
  `proyecto` char(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cientifico` (`cientifico`),
  KEY `proyecto` (`proyecto`),
  CONSTRAINT `asignaciones_ibfk_1` FOREIGN KEY (`cientifico`) REFERENCES `cientificos` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `asignaciones_ibfk_2` FOREIGN KEY (`proyecto`) REFERENCES `proyectos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignaciones`
--

LOCK TABLES `asignaciones` WRITE;
/*!40000 ALTER TABLE `asignaciones` DISABLE KEYS */;
INSERT INTO `asignaciones` VALUES (1,'1973229C','P001'),(2,'5854829H','P002'),(3,'2031992Z','P003'),(4,'6253716J','P004'),(5,'5035004Q','P005'),(6,'2176671J','P006'),(7,'3899130C','P007'),(8,'5289439C','P008'),(9,'2999386M','P009'),(10,'5944294G','P010');
/*!40000 ALTER TABLE `asignaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cientificos`
--

DROP TABLE IF EXISTS `cientificos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cientificos` (
  `dni` varchar(8) NOT NULL,
  `nom_apels` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cientificos`
--

LOCK TABLES `cientificos` WRITE;
/*!40000 ALTER TABLE `cientificos` DISABLE KEYS */;
INSERT INTO `cientificos` VALUES ('1973229C','Cristin Gravie'),('2031992Z','Greggory Bangley'),('2176671J','Leann Hare'),('2999386M','Nicoline Whellams'),('3899130C','Nicole O\'Deegan'),('5035004Q','Ingmar Fullard'),('5289439C','Claudianus Imeson'),('5854829H','Killie Fouldes'),('5944294G','Adah Waszczyk'),('6253716J','Lucie Bortolini');
/*!40000 ALTER TABLE `cientificos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyectos` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `horas` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
INSERT INTO `proyectos` VALUES ('P001','Proyecto Alpha',120),('P002','Proyecto Beta',80),('P003','Proyecto Gamma',200),('P004','Proyecto Delta',300),('P005','Proyecto Epsilon',50),('P006','Proyecto Zeta',180),('P007','Proyecto Eta',90),('P008','Proyecto Theta',240),('P009','Proyecto Iota',70),('P010','Proyecto Kappa',160);
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-02 19:15:06
