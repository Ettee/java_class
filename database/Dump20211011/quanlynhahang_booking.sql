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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `id_booking` int NOT NULL AUTO_INCREMENT,
  `id_sanh_cuoi` int DEFAULT NULL,
  `id_user` int DEFAULT NULL,
  `id_menu` int DEFAULT NULL,
  `time_booking` datetime NOT NULL DEFAULT (now()),
  `total_price` decimal(10,0) DEFAULT '0',
  `check_out` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_booking`),
  KEY `fk_booking_sanhcuoi_idx` (`id_sanh_cuoi`),
  KEY `fk_booking_user_idx` (`id_user`),
  KEY `fk_booking_menu_idx` (`id_menu`),
  CONSTRAINT `fk_booking_menu` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id_menu`),
  CONSTRAINT `fk_booking_sanhcuoi` FOREIGN KEY (`id_sanh_cuoi`) REFERENCES `sanh_cuoi` (`id_sanh_cuoi`),
  CONSTRAINT `fk_booking_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,1,4,1,'2021-10-09 21:20:10',0,0),(2,2,5,1,'2021-10-09 21:20:36',0,0),(3,3,7,2,'2021-10-10 14:12:03',0,0);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-11 21:07:11
