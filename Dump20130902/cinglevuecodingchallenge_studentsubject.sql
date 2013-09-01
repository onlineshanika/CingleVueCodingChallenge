CREATE DATABASE  IF NOT EXISTS `cinglevuecodingchallenge` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `cinglevuecodingchallenge`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: cinglevuecodingchallenge
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `studentsubject`
--

DROP TABLE IF EXISTS `studentsubject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentsubject` (
  `idstudentsubject` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `idSubject` int(11) DEFAULT NULL,
  `idyear` int(11) DEFAULT NULL,
  `marks` double DEFAULT NULL,
  PRIMARY KEY (`idstudentsubject`),
  UNIQUE KEY `unqueIndex_marks` (`idStudent`,`idSubject`,`idyear`),
  KEY `fk_student_studentsubject_idx` (`idStudent`),
  KEY `fk_subject_studentsubject_idx` (`idSubject`),
  KEY `fk_year_studentsubject_idx` (`idyear`),
  CONSTRAINT `fk_student_studentsubject` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idstudent`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_subject_studentsubject` FOREIGN KEY (`idSubject`) REFERENCES `subject` (`idsubject`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_year_studentsubject` FOREIGN KEY (`idyear`) REFERENCES `year_` (`idyear`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentsubject`
--

LOCK TABLES `studentsubject` WRITE;
/*!40000 ALTER TABLE `studentsubject` DISABLE KEYS */;
INSERT INTO `studentsubject` VALUES (1,1,1,4,23),(2,2,1,1,53),(3,3,3,1,53),(4,4,3,1,53),(5,5,1,3,73),(6,6,1,1,73),(7,7,1,4,13),(8,8,3,1,53),(9,9,1,3,53),(10,10,1,1,23),(11,11,1,1,23),(12,12,1,3,23),(13,13,1,1,23),(14,14,1,1,23),(15,15,1,1,23),(16,16,1,1,23),(17,17,1,1,23),(18,18,1,1,23),(19,19,1,1,23),(21,1,2,2,23),(22,2,2,2,53),(23,3,2,2,53),(24,4,2,2,53),(25,5,2,4,73),(26,6,2,2,73),(27,7,2,4,13),(28,8,2,2,53),(29,9,2,4,53),(30,10,2,2,23),(31,11,3,2,23),(32,12,3,4,23),(33,13,2,2,23),(34,14,3,2,23),(35,15,2,3,23),(36,16,2,4,23),(37,17,2,2,23),(38,18,2,2,23),(39,19,2,2,23);
/*!40000 ALTER TABLE `studentsubject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-09-02  0:06:30
