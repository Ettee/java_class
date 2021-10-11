-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlynhahang
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sanh_cuoi`
--

DROP TABLE IF EXISTS `sanh_cuoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanh_cuoi` (
  `id_sanh_cuoi` int NOT NULL AUTO_INCREMENT,
  `name_sanh_cuoi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price_sanhcuoi_sang` decimal(10,0) DEFAULT '10000000',
  `price_sanhcuoi_trua` decimal(10,0) DEFAULT '15000000',
  `price_sanhcuoi_toi` decimal(10,0) DEFAULT '20000000',
  `price_sanhcuoi_sang_cuoituan` decimal(10,0) DEFAULT '20000000',
  `price_sanhcuoi_trua_cuoituan` decimal(10,0) DEFAULT '25000000',
  `price_sanhcuoi_toi_cuoituan` decimal(10,0) DEFAULT '30000000',
  PRIMARY KEY (`id_sanh_cuoi`),
  UNIQUE KEY `name_sanh_cuoi_UNIQUE` (`name_sanh_cuoi`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanh_cuoi`
--

LOCK TABLES `sanh_cuoi` WRITE;
/*!40000 ALTER TABLE `sanh_cuoi` DISABLE KEYS */;
INSERT INTO `sanh_cuoi` VALUES (1,'sanhcuoi_1',10000000,15000000,20000000,20000000,25000000,30000000),(2,'sanhcuoi_2',10000000,15000000,20000000,20000000,25000000,30000000),(3,'sanhcuoi_3',10000000,15000000,20000000,20000000,25000000,30000000),(4,'sanhcuoi_4',10000000,15000000,20000000,20000000,25000000,30000000),(5,'sanhcuoi_5',10000000,15000000,20000000,20000000,25000000,30000000);
/*!40000 ALTER TABLE `sanh_cuoi` ENABLE KEYS */;
UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-11 21:07:12
