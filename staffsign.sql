-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 04, 2017 at 07:39 PM
-- Server version: 5.5.17
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
-- Table structure for table `staffsign`
--

CREATE TABLE IF NOT EXISTS `staffsign` (
  `Id` int(222) NOT NULL AUTO_INCREMENT,
  `StaffNo` varchar(222) NOT NULL,
  `Name` varchar(222) NOT NULL,
  `IdNo` int(222) NOT NULL,
  `Department` varchar(222) NOT NULL,
  `PhoneNo` varchar(222) NOT NULL,
  `SignIn` varchar(222) NOT NULL,
  `SignOut` varchar(222) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `staffsign`
--

INSERT INTO `staffsign` (`Id`, `StaffNo`, `Name`, `IdNo`, `Department`, `PhoneNo`, `SignIn`, `SignOut`) VALUES
(1, '1234', 'Sisa kk Juma', 34156789, 'Computing Sciences', '0723021508', '2017-05-04 11:27:38.481', 'pending'),
(2, '1234', 'Sisa kk Juma', 34156789, 'Computing Sciences', '0723021508', '2017-05-04 11:27:58.231', 'pending');
