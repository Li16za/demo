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
-- Table structure for table `sotrudniki`
--

DROP TABLE IF EXISTS `sotrudniki`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sotrudniki` (
  `id` int NOT NULL,
  `fio` varchar(245) DEFAULT NULL,
  `role` int NOT NULL,
  `login` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `last_sing_in` timestamp NULL DEFAULT NULL,
  `type_sign_in` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_idx` (`role`),
  KEY `type_idx` (`type_sign_in`),
  CONSTRAINT `role` FOREIGN KEY (`role`) REFERENCES `dictionary` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sotrudniki`
--

LOCK TABLES `sotrudniki` WRITE;
/*!40000 ALTER TABLE `sotrudniki` DISABLE KEYS */;
INSERT INTO `sotrudniki` VALUES (101,'Иванов Иван Иванович',4,'Ivanov@namecomp.ru','2L6KZG','2022-05-15 10:13:00',1),(102,'Петров Петр Петрович',4,'petrov@namecomp.ru','uzWC67','2022-05-15 10:13:00',1),(103,'Федоров Федор Федорович',6,'fedorov@namecomp.ru','8ntwUp','2022-05-15 10:13:00',1),(104,'Миронов Вениамин Куприянович',5,'mironov@namecomp.ru','YOyhfR','2022-05-15 10:13:00',1),(105,'Ширяев Ермолай Вениаминович',5,'shiryev@namecomp.ru','RSbvHv','2022-05-15 10:13:00',0),(106,'Игнатов Кассиан Васильевич',5,'ignatov@namecomp.ru','rwVDh9','2022-05-15 10:13:00',1),(107,'Хохлов Владимир Мэлсович',4,'hohlov@namecomp.ru','LdNyos','2022-05-15 10:13:00',1),(108,'Стрелков Мстислав Георгьевич',4,'strelkov@namecomp.ru','gynQMT','2022-05-15 10:13:00',0),(109,'Беляева Лилия Наумовна',4,'belyeva@@namecomp.ru','AtnDjr','2022-05-15 10:13:00',1),(110,'Смирнова Ульяна Гордеевна',4,'smirnova@@namecomp.ru','JlFRCZ','2022-05-15 10:13:00',1);
/*!40000 ALTER TABLE `sotrudniki` ENABLE KEYS */;
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
