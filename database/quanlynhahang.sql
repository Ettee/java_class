CREATE DATABASE  IF NOT EXISTS `quanlynhahang` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quanlynhahang`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlynhahang
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

--
-- Table structure for table `booking_detail`
--

DROP TABLE IF EXISTS `booking_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_detail` (
  `idbooking_detail` int NOT NULL AUTO_INCREMENT,
  `id_booking` int NOT NULL,
  `id_dichvu` int NOT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`idbooking_detail`),
  KEY `fk_dichvu_idx` (`id_dichvu`),
  KEY `fk_booking_idx` (`id_booking`),
  CONSTRAINT `fk_booking` FOREIGN KEY (`id_booking`) REFERENCES `booking` (`id_booking`),
  CONSTRAINT `fk_dichvu` FOREIGN KEY (`id_dichvu`) REFERENCES `dichvu` (`id_dichvu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_detail`
--

LOCK TABLES `booking_detail` WRITE;
/*!40000 ALTER TABLE `booking_detail` DISABLE KEYS */;
INSERT INTO `booking_detail` VALUES (1,1,1,100000,1),(2,1,2,100000,1),(3,1,3,100000,1),(4,2,3,100000,1),(5,3,2,100000,1);
/*!40000 ALTER TABLE `booking_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `id_dichvu` int NOT NULL AUTO_INCREMENT,
  `name_dichvu` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `desc_dichvu` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae',
  `price_dichvu` decimal(10,0) DEFAULT '100000',
  PRIMARY KEY (`id_dichvu`),
  UNIQUE KEY `name_dichvu_UNIQUE` (`name_dichvu`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'dichvu_1','test update thanh cong',100000),(2,'dichvu_2','condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae',100000),(3,'dichvu_3','condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae',100000),(4,'dichvu_4','condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae',100000),(5,'dichvu_5','condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae',100000),(6,'dichvu_6','lorem isum alabatrap',20000);
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id_menu` int NOT NULL AUTO_INCREMENT,
  `name_menu` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `desc_menu` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'món 1, món 2, món 3, món 4, món 5,món 6',
  `price_menu` decimal(10,0) DEFAULT '5000000',
  PRIMARY KEY (`id_menu`),
  UNIQUE KEY `name_menu_UNIQUE` (`name_menu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'menu_1','món 1, món 2, món 3, món 4, món 5,món 6',5000000),(2,'menu_2','món 1, món 2, món 3, món 4, món 5,món 6',5000000),(3,'menu_3','món 1, món 2, món 3, món 4, món 5,món 6',5000000),(4,'menu_4','món 1, món 2, món 3, món 4, món 5,món 6',5000000),(5,'menu_5','món 1, món 2, món 3, món 4, món 5,món 6',5000000);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `name_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type_user` int NOT NULL,
  `avarta` varchar(2083) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png',
  `password_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `name_user_UNIQUE` (`name_user`),
  KEY `fk_user_type_idx` (`type_user`),
  CONSTRAINT `fk_user_type` FOREIGN KEY (`type_user`) REFERENCES `user_type` (`id_type`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin_1',1,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png',NULL),(2,'nhanvien_1',2,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png',NULL),(3,'nhanvien_2',2,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png',NULL),(4,'khachhang1',3,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png','123'),(5,'khachhang2',3,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png','123'),(6,'khachhang3',3,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png','123'),(7,'khachhang4',3,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/1024px-User-avatar.svg.png','123'),(9,'test user 1',3,'C:\\Users\\Ettee\\eclipse-workspace\\quan-ly-nha-hang\\avarta\\240422900_1517392101936747_2651765129623238631_n.jpg','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_type` (
  `id_type` int NOT NULL AUTO_INCREMENT,
  `name_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'admin'),(2,'nhân viên'),(3,'khách hàng');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-03 21:17:21
