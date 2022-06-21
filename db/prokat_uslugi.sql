-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: prokat
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `uslugi`
--

DROP TABLE IF EXISTS `uslugi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uslugi` (
  `id` int NOT NULL,
  `name` varchar(150) DEFAULT NULL,
  `code` varchar(45) NOT NULL,
  `cost_hour` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uslugi`
--

LOCK TABLES `uslugi` WRITE;
/*!40000 ALTER TABLE `uslugi` DISABLE KEYS */;
INSERT INTO `uslugi` VALUES (31,'Прокат опорного оборудования для катка','JUR8R','500'),(34,'Обучение катанию на коньках','JKFBJ09','1000'),(44,'Прокат салазок','DHBGFY563','450'),(45,'Прокат набора защитного оборудования','JFH7382','800'),(57,'Прокат ледянки','JHVSJF6','300'),(88,'Катание на Большом катке','DJHGBS982','400'),(89,'Прокат детских коньков','OIJNB12','800'),(92,'Прокат санок','HJBUJE21J','300'),(98,'Прокат шлема','63748HF','300'),(99,'Прокат вартушки','BSFBHV63','100'),(123,'Катание на горках','638VVNQ3','500'),(336,'Прокат коньков','8HFJHG443','1200'),(353,'Заточка коньков','87FDJKHJ','500');
/*!40000 ALTER TABLE `uslugi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-21 11:26:38
