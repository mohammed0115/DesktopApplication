-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 01, 2016 at 08:59 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hospital`
--
CREATE DATABASE IF NOT EXISTS `hospital` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `hospital`;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `id` int(4) NOT NULL,
  `dep_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `dep_name`) VALUES
(1, 'Orthopedic'),
(2, 'Cardiology'),
(3, 'general'),
(4, 'Cardiology');

-- --------------------------------------------------------

--
-- Table structure for table `doctorsignup`
--

CREATE TABLE IF NOT EXISTS `doctorsignup` (
  `doct_id` int(4) NOT NULL,
  `doct_name` varchar(50) DEFAULT NULL,
  `department` tinyint(1) unsigned DEFAULT NULL,
  `specialization` varchar(20) DEFAULT NULL,
  `phonenumber` char(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`doct_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctorsignup`
--

INSERT INTO `doctorsignup` (`doct_id`, `doct_name`, `department`, `specialization`, `phonenumber`, `address`, `email`) VALUES
(1, 'mohammed', 1, 'a', '0929513619', 'Bhriy', 'hahawaps@gmail.com'),
(2, 'aill', 1, 'ss', '0929513619', 'b', 'hahawaps@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_bloodtest`
--

CREATE TABLE IF NOT EXISTS `hospital_bloodtest` (
  `patienttype` varchar(20) DEFAULT NULL,
  `patientid` int(4) DEFAULT NULL,
  `patientname` varchar(20) DEFAULT NULL,
  `mediclatestype` varchar(20) DEFAULT NULL,
  `bloodgroup` varchar(20) DEFAULT NULL,
  `haemoglobin` varchar(20) DEFAULT NULL,
  `bloodsugar` varchar(20) DEFAULT NULL,
  `sacid` varchar(20) DEFAULT NULL,
  `description` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_bloodtest`
--

INSERT INTO `hospital_bloodtest` (`patienttype`, `patientid`, `patientname`, `mediclatestype`, `bloodgroup`, `haemoglobin`, `bloodsugar`, `sacid`, `description`) VALUES
('In-Patient', 1002, 'Jayachand', 'Blood Test', 'O+ve', '12.3 ', '94 mg/dl ', '2.5 mg/dl', 'Normal'),
('In-Patient', 1002, 'Jayachand', 'Blood Test', 'O+ve', '25', '23', '56', 'Normal'),
('In-Patient', 1001, 'suresh', 'Blood Test', 'O+ve', '70', '64', '15', 'Normal'),
('In-Patient', 1001, 'suresh', 'Blood Test', '0+ve', 'gf', 'dgd', 'dggf', 'dddgf'),
('In-Patient', 1002, 'Jayachand', 'Blood Test', NULL, NULL, NULL, NULL, NULL),
('In-Patient', 1003, 'Naresh', 'Blood Test', 'b', '11', '12', 'yell', 'a'),
('In-Patient', 1002, 'Jayachand', 'Blood Test', 'b', '5', '6', 'ddadaad', 'a'),
('In-Patient', 1002, 'Jayachand', 'Blood Test', 'dawada', 'aadada', 'axasxaaaxas', 'sad', 'ca');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_dischargesummary`
--

CREATE TABLE IF NOT EXISTS `hospital_dischargesummary` (
  `dis_id` int(4) NOT NULL AUTO_INCREMENT,
  `patientid` int(4) NOT NULL,
  `joindate` datetime DEFAULT NULL,
  `dischargedate` datetime DEFAULT NULL,
  PRIMARY KEY (`dis_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `hospital_dischargesummary`
--

INSERT INTO `hospital_dischargesummary` (`dis_id`, `patientid`, `joindate`, `dischargedate`) VALUES
(12, 1, '2016-04-06 00:00:00', '2016-12-06 00:00:00'),
(16, 5, '2016-07-28 22:45:54', '2016-07-30 22:45:54');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_inpatient`
--

CREATE TABLE IF NOT EXISTS `hospital_inpatient` (
  `patientname` varchar(20) DEFAULT NULL,
  `patientid` int(4) NOT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `phoneres` bigint(8) DEFAULT NULL,
  `phonemob` bigint(8) DEFAULT NULL,
  `maritual` varchar(20) DEFAULT NULL,
  `occupation` varchar(20) DEFAULT NULL,
  `admid` int(4) DEFAULT NULL,
  `admdate` datetime DEFAULT NULL,
  `admtime` datetime DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `symtoms` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `wardno` int(4) DEFAULT NULL,
  `bedno` int(4) DEFAULT NULL,
  `doctor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`patientid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_inpatient`
--

INSERT INTO `hospital_inpatient` (`patientname`, `patientid`, `gender`, `age`, `address`, `phoneres`, `phonemob`, `maritual`, `occupation`, `admid`, `admdate`, `admtime`, `status`, `symtoms`, `department`, `wardno`, `bedno`, `doctor`) VALUES
('suresh', 1001, 'male', 21, 'hyd', 234, 987456, 'single', 'student', 102, '2008-10-31 11:23:24', '1900-01-01 05:02:00', 'pending', 'fever', 'general', 101, 5, 'Teja'),
('Jayachand', 1002, 'Male', 23, 'Hyderabad', 987654312, 654123, 'Unmarried', 'Employee', 103, '2008-10-31 00:00:00', '2008-10-31 11:41:00', 'Starting', 'Vomtings', 'Cardiology', 15, 3, 'teja'),
('Naresh', 1003, 'Male', 25, 'Hyd', 325461, 98648, 'Married', 'nto', 104, '2008-11-03 00:00:00', '2008-11-03 13:45:00', 'Starting', 'fever', 'Gynacology', 32, 1, 'arun'),
('cxcxxv', 1004, 'Male', 23, 'dfjhfekk', 355, 12432555, 'Married', 'former', 105, '2010-03-14 00:00:00', '2010-03-14 19:59:00', '...select...', 'kdfg', 'Cardiology', 2, 3, 'rana'),
('khalid', 1005, 'Male', 23, 'medani', 130254563, 312924104, 'Married', 'farmer', 106, '2016-04-18 00:00:00', '2016-04-18 02:34:00', 'Starting', 'ggg', 'Gynacology', 21, 15, 'rana');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_operation`
--

CREATE TABLE IF NOT EXISTS `hospital_operation` (
  `oper_id` int(4) NOT NULL,
  `patienttype` varchar(20) DEFAULT NULL,
  `patientid` int(4) DEFAULT NULL,
  `refdoctor` tinyint(1) unsigned DEFAULT NULL,
  `operationtype` varchar(20) DEFAULT NULL,
  `operatonresult` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_operation`
--

INSERT INTO `hospital_operation` (`oper_id`, `patienttype`, `patientid`, `refdoctor`, `operationtype`, `operatonresult`) VALUES
(2, '1', 2, 2, 'Heart', 'Fail'),
(4, '2', 5, 1, 'Heart', 'Success'),
(0, '2', 4, 2, 'Brain', 'Fail');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_outpatient`
--

CREATE TABLE IF NOT EXISTS `hospital_outpatient` (
  `patientname` varchar(20) DEFAULT NULL,
  `patientid` int(4) NOT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `assigndoctor` varchar(20) DEFAULT NULL,
  `phoneres` bigint(8) DEFAULT NULL,
  `phonemob` bigint(8) DEFAULT NULL,
  `opdate` datetime DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`patientid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_outpatient`
--

INSERT INTO `hospital_outpatient` (`patientname`, `patientid`, `gender`, `age`, `address`, `assigndoctor`, `phoneres`, `phonemob`, `opdate`, `department`) VALUES
('Chinna', 2001, 'male', 27, 'Hyd', 'Dr.Venkateswararao', 12345, 654123, '2008-10-29 12:01:16', 'Orthopedic'),
('Chinnareddy', 2002, 'Male', 28, 'srnagar', 'Dr.venkateswarao', 1234, 9874564231, '2008-10-30 00:00:00', 'Orthopedic'),
('df', 2003, 'Male', 34, 'rgdfgdg', 'Dr.Ramarao', 523512, 373663389, '2010-03-14 00:00:00', 'Neurology'),
('fgf', 2004, 'Male', 34, 'dgdfg', 'Dr.venkateswarao', 4323, 33555, '2010-03-14 00:00:00', 'Neurology');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_patientinfo`
--

CREATE TABLE IF NOT EXISTS `hospital_patientinfo` (
  `pid` int(4) DEFAULT NULL,
  `patientname` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `doctor` varchar(20) DEFAULT NULL,
  KEY `FK__hospital_pa__pid__47A6A41B` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_patientinfo`
--

INSERT INTO `hospital_patientinfo` (`pid`, `patientname`, `age`, `department`, `doctor`) VALUES
(1003, 'Naresh', '25', 'Gynacology', 'Arun'),
(1003, 'Naresh', '25', 'Gynacology', 'ali'),
(1002, 'mohd', '23', 'Cardiology', NULL),
(1002, 'mohd', '23', 'Cardiology', NULL),
(1004, 'cxcxxv', '23', 'Cardiology', 'mohd gad');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_pharmacy`
--

CREATE TABLE IF NOT EXISTS `hospital_pharmacy` (
  `patienttype` varchar(20) DEFAULT NULL,
  `patientid` int(4) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `patientname` varchar(20) DEFAULT NULL,
  `medicine` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital_pharmacy`
--

INSERT INTO `hospital_pharmacy` (`patienttype`, `patientid`, `department`, `patientname`, `medicine`) VALUES
('Out-Patient', 2002, 'Orthopedic', 'Chinnareddy', 'sulphurdrug'),
('Out-Patient', 2002, 'Orthopedic', 'Chinnareddy', 'sulphurdrug'),
('In-Patient', 1002, 'Cardiology', 'Jayachand', 'fepanil'),
('In-Patient', 1001, 'general', 'suresh', 'fdfff'),
('In-Patient', 1004, 'Cardiology', 'cxcxxv', 'fdfff'),
('In-Patient', 1004, 'Cardiology', 'cxcxxv', 'bf'),
('In-Patient', 1003, 'Gynacology', 'Naresh', 'banadol'),
('In-Patient', 1003, 'Gynacology', 'Naresh', 'banadol'),
('In-Patient', 1003, 'Gynacology', 'Naresh', 'banadol'),
('Out-Patient', 1005, 'OutPatient', NULL, 'OutPatient');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_surgeryinfo`
--

CREATE TABLE IF NOT EXISTS `hospital_surgeryinfo` (
  `sur_id` int(4) NOT NULL AUTO_INCREMENT,
  `pid` int(4) DEFAULT NULL,
  `department` int(4) DEFAULT NULL,
  `doctor` int(4) DEFAULT NULL,
  `surgerydate` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sur_id`),
  KEY `FK_hospital_surgeryinfo_department` (`department`),
  KEY `FK_hospital_surgeryinfo_doctorsignup` (`doctor`),
  KEY `FK_hospital_surgeryinfo_patientinfo` (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `hospital_surgeryinfo`
--

INSERT INTO `hospital_surgeryinfo` (`sur_id`, `pid`, `department`, `doctor`, `surgerydate`) VALUES
(1, 1, 1, 1, '2016-12-13'),
(2, 2, 2, 2, '2016-12-14'),
(3, 3, 1, 2, '2016-12-14'),
(6, 4, 2, 2, '2016-12-12');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_urintest`
--

CREATE TABLE IF NOT EXISTS `hospital_urintest` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `patienttype` tinyint(1) unsigned DEFAULT NULL,
  `patientid` tinyint(1) unsigned DEFAULT NULL,
  `mediclatestype` tinyint(1) unsigned DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `clarity` varchar(20) DEFAULT NULL,
  `odor` varchar(20) DEFAULT NULL,
  `specificgravity` varchar(20) DEFAULT NULL,
  `glucose` varchar(20) DEFAULT NULL,
  `description` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `hospital_urintest`
--

INSERT INTO `hospital_urintest` (`id`, `patienttype`, `patientid`, `mediclatestype`, `color`, `clarity`, `odor`, `specificgravity`, `glucose`, `description`) VALUES
(1, 1, 1, 2, '1', '1', '1', NULL, '1', '1'),
(2, 2, 2, 1, '2', '2', NULL, '2', '2', '2'),
(3, 2, 3, 2, '3', '3', '3', '3', '3', '3'),
(4, 2, 4, 2, '555', '222555', '5555222', '555555', '5555555555', '55555'),
(5, 2, 5, 1, NULL, '111', '1111111', '111111111', '1111', '11111111111'),
(6, 1, 1, 1, NULL, '5454554', 'ewewew', 'erewrw', 'gutufur', 'k7rswyjyrderyh4sgregesgy\r\ntdjtdfft'),
(7, 1, 2, 2, '31231', '312312', '3123123', '12312', '12312', '312312312'),
(8, 2, 2, 1, '2312cecrqewc', '2312cecrqewc', '8989', 'afcdf', 'da', 'acfadsfsafcafewafax'),
(9, 1, 5, 1, '654321`', '654321`', '123456', '123456', '123456', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `pass` varchar(50) NOT NULL DEFAULT '',
  `username` varchar(70) NOT NULL,
  `Email` varchar(120) NOT NULL,
  `id` int(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`pass`, `username`, `Email`, `id`) VALUES
('moh', 'moh', 'moh@org.com', 1),
('123', 'salim', 'salim@gmail.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `mediclatestype`
--

CREATE TABLE IF NOT EXISTS `mediclatestype` (
  `id` int(4) NOT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mediclatestype`
--

INSERT INTO `mediclatestype` (`id`, `name`) VALUES
(1, 'Blood Test'),
(2, 'Urin Tset');

-- --------------------------------------------------------

--
-- Table structure for table `patientinfo`
--

CREATE TABLE IF NOT EXISTS `patientinfo` (
  `pid` int(4) NOT NULL AUTO_INCREMENT,
  `patientname` varchar(50) DEFAULT NULL,
  `age` tinyint(1) unsigned DEFAULT NULL,
  `gender` int(4) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phoneres` char(10) DEFAULT NULL,
  `phonemob` char(10) DEFAULT NULL,
  `patienttype` tinyint(1) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `FK_patientinfo_sex` (`gender`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `patientinfo`
--

INSERT INTO `patientinfo` (`pid`, `patientname`, `age`, `gender`, `address`, `phoneres`, `phonemob`, `patienttype`) VALUES
(1, 'mohammed abdullah', 22, 1, 'alhayj yeussf', '0929513619', '0903819815', 1),
(2, 'sara', 19, 2, 'kaka', '01225577', '0434343434', 1),
(3, 'hassn', 26, 1, 'kassla', '09212434', '034234242', 1),
(4, 'hnan', 43, 2, 'khrtoom', '09545454', '093534232', 2),
(5, 'mushaayer', 33, 2, 'jousy', '3532525', '52352332', 2),
(6, 'mohammed', 45, 2, 'khrtoom', '0325', '2255', 1),
(7, 'aill', 45, 1, 'koko', NULL, '090000', 1),
(8, 'hamid', 78, 1, 'marwi', '012325666', '0366544555', 2),
(9, 'yaser', 45, 1, 'waw', NULL, '090000', 1),
(11, 'asgxaxjahakj', 45, 1, 'gjbjhj', NULL, '12233', 1),
(12, 'kjhkjk', 20, 1, 'ghhj', '54548', '8488', 2);

-- --------------------------------------------------------

--
-- Table structure for table `patienttype`
--

CREATE TABLE IF NOT EXISTS `patienttype` (
  `id` int(4) NOT NULL,
  `patienttypeValue` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `patienttype`
--

INSERT INTO `patienttype` (`id`, `patienttypeValue`) VALUES
(1, 'Out-Patient'),
(2, 'In-Patient');

-- --------------------------------------------------------

--
-- Table structure for table `patient_in_uot`
--

CREATE TABLE IF NOT EXISTS `patient_in_uot` (
  `id_pa` int(4) NOT NULL AUTO_INCREMENT,
  `patientid` int(4) NOT NULL,
  `maritual` varchar(20) DEFAULT NULL,
  `occupation` varchar(20) DEFAULT NULL,
  `admid` int(4) DEFAULT NULL,
  `admdate` varchar(10) DEFAULT NULL,
  `admtime` datetime DEFAULT NULL,
  `symtoms` varchar(20) DEFAULT NULL,
  `department` tinyint(1) unsigned DEFAULT NULL,
  `wardno` int(4) DEFAULT NULL,
  `bedno` int(4) DEFAULT NULL,
  `doctor` tinyint(1) unsigned DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `status1` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`id_pa`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `patient_in_uot`
--

INSERT INTO `patient_in_uot` (`id_pa`, `patientid`, `maritual`, `occupation`, `admid`, `admdate`, `admtime`, `symtoms`, `department`, `wardno`, `bedno`, `doctor`, `status`, `status1`) VALUES
(1, 1, 'single1', 'student11', 101, '2016-12-06', '1900-01-01 04:05:46', 'fever', 2, 101, 101, 1, 'mohammed', 1),
(2, 2, '12', '12', 12, '2016-12-06', '1900-01-01 03:32:35', '12', 1, 12, 12, 1, '12', 2),
(4, 5, NULL, NULL, NULL, '2016-07-21', NULL, NULL, 2, NULL, NULL, 1, NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy`
--

CREATE TABLE IF NOT EXISTS `pharmacy` (
  `id_pharmacy` int(4) NOT NULL AUTO_INCREMENT,
  `patienttype` int(4) DEFAULT NULL,
  `patientid` int(4) DEFAULT NULL,
  `department` int(4) DEFAULT NULL,
  `medicine` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_pharmacy`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `pharmacy`
--

INSERT INTO `pharmacy` (`id_pharmacy`, `patienttype`, `patientid`, `department`, `medicine`) VALUES
(1, 2, 1, 3, 'mohammed'),
(2, 2, 5, 4, ',moi');

-- --------------------------------------------------------

--
-- Table structure for table `sex`
--

CREATE TABLE IF NOT EXISTS `sex` (
  `id` int(4) NOT NULL,
  `name` char(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sex`
--

INSERT INTO `sex` (`id`, `name`) VALUES
(1, 'male'),
(2, 'famale');

-- --------------------------------------------------------

--
-- Table structure for table `t1`
--

CREATE TABLE IF NOT EXISTS `t1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `t1`
--

INSERT INTO `t1` (`id`, `pname`) VALUES
(1, 'moh'),
(3, 'moh'),
(4, '12365'),
(5, ''),
(6, 'txtMyName'),
(7, '????'),
(8, '????');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `uservb`
--

CREATE TABLE IF NOT EXISTS `uservb` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `uservb`
--

INSERT INTO `uservb` (`username`, `password`) VALUES
('Venni', 'uppala'),
('Raj', 'Bond');

-- --------------------------------------------------------

--
-- Table structure for table `value`
--

CREATE TABLE IF NOT EXISTS `value` (
  `state` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `value`
--

INSERT INTO `value` (`state`, `city`) VALUES
('AndhraPradesh', 'Hyderabad'),
('AndhraPradesh', 'Hyderabad'),
('AndhraPradesh', 'Vijayawada'),
('AndhraPradesh', 'Visakahapatnam'),
('AndhraPradesh', 'Tirupathi'),
('Tamilnadu', 'Tnagar'),
('Tamilnadu', 'Annanagar'),
('Tamilnadu', 'Vadapalni'),
('Karnataka', 'Banglore'),
('Maharashtra', 'Mumbai'),
('Maharashtra', 'Pune'),
('Madhypradesh', 'Bhopal');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hospital_patientinfo`
--
ALTER TABLE `hospital_patientinfo`
  ADD CONSTRAINT `FK__hospital_pa__pid__0880433F` FOREIGN KEY (`pid`) REFERENCES `hospital_inpatient` (`patientid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK__hospital_pa__pid__47A6A41B` FOREIGN KEY (`pid`) REFERENCES `hospital_inpatient` (`patientid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `hospital_surgeryinfo`
--
ALTER TABLE `hospital_surgeryinfo`
  ADD CONSTRAINT `FK_hospital_surgeryinfo_department` FOREIGN KEY (`department`) REFERENCES `department` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_hospital_surgeryinfo_doctorsignup` FOREIGN KEY (`doctor`) REFERENCES `doctorsignup` (`doct_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_hospital_surgeryinfo_patientinfo` FOREIGN KEY (`pid`) REFERENCES `patientinfo` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patientinfo`
--
ALTER TABLE `patientinfo`
  ADD CONSTRAINT `patientinfo_ibfk_1` FOREIGN KEY (`gender`) REFERENCES `patienttype` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
