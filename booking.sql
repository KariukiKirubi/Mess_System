-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 03, 2017 at 05:27 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mess`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
  `Id` int(22) NOT NULL AUTO_INCREMENT,
  `RegNo` varchar(22) NOT NULL,
  `Name` varchar(22) NOT NULL,
  `BookingNo` varchar(222) NOT NULL,
  `Subject` varchar(222) NOT NULL,
  `EventDate` varchar(222) NOT NULL,
  `EventTime` varchar(222) NOT NULL,
  `Date` varchar(222) NOT NULL,
  `Time` varchar(222) NOT NULL,
  `Message` varchar(777) NOT NULL,
  `PnoneNo` varchar(222) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `booking`
--

