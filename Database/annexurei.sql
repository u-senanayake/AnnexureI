-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2015 at 03:55 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `annexurei`
--

-- --------------------------------------------------------

--
-- Table structure for table `audit`
--

CREATE TABLE IF NOT EXISTS `audit` (
  `id` varchar(10) NOT NULL,
  `audit_1` int(11) NOT NULL,
  `audit_2` int(11) NOT NULL,
  `audit_3` int(11) NOT NULL,
  `audit_4` int(11) NOT NULL,
  `audit_5` int(11) NOT NULL,
  `audit_6` int(11) NOT NULL,
  `audit_7` int(11) NOT NULL,
  `audit_8` int(11) NOT NULL,
  `audit_9` int(11) NOT NULL,
  `audit_10` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `audit`
--

INSERT INTO `audit` (`id`, `audit_1`, `audit_2`, `audit_3`, `audit_4`, `audit_5`, `audit_6`, `audit_7`, `audit_8`, `audit_9`, `audit_10`) VALUES
('910651455V', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `audit_6`
--

CREATE TABLE IF NOT EXISTS `audit_6` (
  `id` varchar(10) NOT NULL,
  `audit_1` int(11) NOT NULL,
  `audit_2` int(11) NOT NULL,
  `audit_3` int(11) NOT NULL,
  `audit_4` int(11) NOT NULL,
  `audit_5` int(11) NOT NULL,
  `audit_6` int(11) NOT NULL,
  `audit_7` int(11) NOT NULL,
  `audit_8` int(11) NOT NULL,
  `audit_9` int(11) NOT NULL,
  `audit_10` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `audit_12`
--

CREATE TABLE IF NOT EXISTS `audit_12` (
  `id` varchar(10) NOT NULL,
  `audit_1` int(11) NOT NULL,
  `audit_2` int(11) NOT NULL,
  `audit_3` int(11) NOT NULL,
  `audit_4` int(11) NOT NULL,
  `audit_5` int(11) NOT NULL,
  `audit_6` int(11) NOT NULL,
  `audit_7` int(11) NOT NULL,
  `audit_8` int(11) NOT NULL,
  `audit_9` int(11) NOT NULL,
  `audit_10` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `blood_test`
--

CREATE TABLE IF NOT EXISTS `blood_test` (
  `id` varchar(10) NOT NULL,
  `alt_sgpt` varchar(20) NOT NULL,
  `gamma` varchar(20) NOT NULL,
  `mcv` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_test`
--

INSERT INTO `blood_test` (`id`, `alt_sgpt`, `gamma`, `mcv`) VALUES
('910651455V', 'aa', 'vvb', 'cc');

-- --------------------------------------------------------

--
-- Table structure for table `blood_test_6`
--

CREATE TABLE IF NOT EXISTS `blood_test_6` (
  `id` varchar(10) NOT NULL,
  `alt_sgpt` varchar(20) NOT NULL,
  `gamma` varchar(20) NOT NULL,
  `mcv` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `blood_test_12`
--

CREATE TABLE IF NOT EXISTS `blood_test_12` (
  `id` varchar(10) NOT NULL,
  `alt_sgpt` varchar(20) NOT NULL,
  `gamma` varchar(20) NOT NULL,
  `mcv` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mini`
--

CREATE TABLE IF NOT EXISTS `mini` (
  `alcohol_dependence_current` varchar(5) NOT NULL,
  `alcohol_abuse_current` varchar(5) NOT NULL,
  `psychotic_disoeder_current` varchar(5) NOT NULL,
  `psychotic_disoeder_lifetime` varchar(5) NOT NULL,
  `id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mini`
--

INSERT INTO `mini` (`alcohol_dependence_current`, `alcohol_abuse_current`, `psychotic_disoeder_current`, `psychotic_disoeder_lifetime`, `id`) VALUES
('yes', 'yes', 'yes', 'yes', '910651455V');

-- --------------------------------------------------------

--
-- Table structure for table `mmqa`
--

CREATE TABLE IF NOT EXISTS `mmqa` (
  `id` varchar(10) NOT NULL,
  `mmqa_1` varchar(2) NOT NULL,
  `mmqa_2` varchar(2) NOT NULL,
  `mmqa_3` varchar(2) NOT NULL,
  `mmqa_4` varchar(2) NOT NULL,
  `mmqa_5` varchar(2) NOT NULL,
  `mmqa_6` varchar(2) NOT NULL,
  `mmqa_7` varchar(2) NOT NULL,
  `mmqa_8` varchar(2) NOT NULL,
  `mmqa_9` varchar(2) NOT NULL,
  `mmqa_10` varchar(2) NOT NULL,
  `mmqa_11` varchar(2) NOT NULL,
  `mmqa_12` varchar(2) NOT NULL,
  `mmqa_13` varchar(2) NOT NULL,
  `mmqa_14` varchar(2) NOT NULL,
  `mmqa_15` varchar(2) NOT NULL,
  `mmqa_16` varchar(2) NOT NULL,
  `mmqa_17` varchar(2) NOT NULL,
  `mmqa_18` varchar(2) NOT NULL,
  `mmqa_19` varchar(2) NOT NULL,
  `mmqa_20` varchar(2) NOT NULL,
  `mmqa_21` varchar(2) NOT NULL,
  `mmqa_22` varchar(2) NOT NULL,
  `mmqa_23` varchar(2) NOT NULL,
  `mmqa_24` varchar(2) NOT NULL,
  `mmqa_25` varchar(2) NOT NULL,
  `mmqa_26` varchar(2) NOT NULL,
  `mmqa_27` varchar(2) NOT NULL,
  `mmqa_28` varchar(2) NOT NULL,
  `mmqa_29` varchar(2) NOT NULL,
  `mmqa_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mmqa`
--

INSERT INTO `mmqa` (`id`, `mmqa_1`, `mmqa_2`, `mmqa_3`, `mmqa_4`, `mmqa_5`, `mmqa_6`, `mmqa_7`, `mmqa_8`, `mmqa_9`, `mmqa_10`, `mmqa_11`, `mmqa_12`, `mmqa_13`, `mmqa_14`, `mmqa_15`, `mmqa_16`, `mmqa_17`, `mmqa_18`, `mmqa_19`, `mmqa_20`, `mmqa_21`, `mmqa_22`, `mmqa_23`, `mmqa_24`, `mmqa_25`, `mmqa_26`, `mmqa_27`, `mmqa_28`, `mmqa_29`, `mmqa_30`) VALUES
('910651455V', 'TA', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'TD', 'TD', 'D', 'D', 'D', 'D', 'TD', 'TD', 'TD', 'TD', 'TD', 'TD', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D');

-- --------------------------------------------------------

--
-- Table structure for table `mmqa_6`
--

CREATE TABLE IF NOT EXISTS `mmqa_6` (
  `id` varchar(10) NOT NULL,
  `mmqa_1` varchar(2) NOT NULL,
  `mmqa_2` varchar(2) NOT NULL,
  `mmqa_3` varchar(2) NOT NULL,
  `mmqa_4` varchar(2) NOT NULL,
  `mmqa_5` varchar(2) NOT NULL,
  `mmqa_6` varchar(2) NOT NULL,
  `mmqa_7` varchar(2) NOT NULL,
  `mmqa_8` varchar(2) NOT NULL,
  `mmqa_9` varchar(2) NOT NULL,
  `mmqa_10` varchar(2) NOT NULL,
  `mmqa_11` varchar(2) NOT NULL,
  `mmqa_12` varchar(2) NOT NULL,
  `mmqa_13` varchar(2) NOT NULL,
  `mmqa_14` varchar(2) NOT NULL,
  `mmqa_15` varchar(2) NOT NULL,
  `mmqa_16` varchar(2) NOT NULL,
  `mmqa_17` varchar(2) NOT NULL,
  `mmqa_18` varchar(2) NOT NULL,
  `mmqa_19` varchar(2) NOT NULL,
  `mmqa_20` varchar(2) NOT NULL,
  `mmqa_21` varchar(2) NOT NULL,
  `mmqa_22` varchar(2) NOT NULL,
  `mmqa_23` varchar(2) NOT NULL,
  `mmqa_24` varchar(2) NOT NULL,
  `mmqa_25` varchar(2) NOT NULL,
  `mmqa_26` varchar(2) NOT NULL,
  `mmqa_27` varchar(2) NOT NULL,
  `mmqa_28` varchar(2) NOT NULL,
  `mmqa_29` varchar(2) NOT NULL,
  `mmqa_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mmqa_12`
--

CREATE TABLE IF NOT EXISTS `mmqa_12` (
  `id` varchar(10) NOT NULL,
  `mmqa_1` varchar(2) NOT NULL,
  `mmqa_2` varchar(2) NOT NULL,
  `mmqa_3` varchar(2) NOT NULL,
  `mmqa_4` varchar(2) NOT NULL,
  `mmqa_5` varchar(2) NOT NULL,
  `mmqa_6` varchar(2) NOT NULL,
  `mmqa_7` varchar(2) NOT NULL,
  `mmqa_8` varchar(2) NOT NULL,
  `mmqa_9` varchar(2) NOT NULL,
  `mmqa_10` varchar(2) NOT NULL,
  `mmqa_11` varchar(2) NOT NULL,
  `mmqa_12` varchar(2) NOT NULL,
  `mmqa_13` varchar(2) NOT NULL,
  `mmqa_14` varchar(2) NOT NULL,
  `mmqa_15` varchar(2) NOT NULL,
  `mmqa_16` varchar(2) NOT NULL,
  `mmqa_17` varchar(2) NOT NULL,
  `mmqa_18` varchar(2) NOT NULL,
  `mmqa_19` varchar(2) NOT NULL,
  `mmqa_20` varchar(2) NOT NULL,
  `mmqa_21` varchar(2) NOT NULL,
  `mmqa_22` varchar(2) NOT NULL,
  `mmqa_23` varchar(2) NOT NULL,
  `mmqa_24` varchar(2) NOT NULL,
  `mmqa_25` varchar(2) NOT NULL,
  `mmqa_26` varchar(2) NOT NULL,
  `mmqa_27` varchar(2) NOT NULL,
  `mmqa_28` varchar(2) NOT NULL,
  `mmqa_29` varchar(2) NOT NULL,
  `mmqa_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mmqb`
--

CREATE TABLE IF NOT EXISTS `mmqb` (
  `id` varchar(10) NOT NULL,
  `mmqb_1` varchar(2) NOT NULL,
  `mmqb_2` varchar(2) NOT NULL,
  `mmqb_3` varchar(2) NOT NULL,
  `mmqb_4` varchar(2) NOT NULL,
  `mmqb_5` varchar(2) NOT NULL,
  `mmqb_6` varchar(2) NOT NULL,
  `mmqb_7` varchar(2) NOT NULL,
  `mmqb_8` varchar(2) NOT NULL,
  `mmqb_9` varchar(2) NOT NULL,
  `mmqb_10` varchar(2) NOT NULL,
  `mmqb_11` varchar(2) NOT NULL,
  `mmqb_12` varchar(2) NOT NULL,
  `mmqb_13` varchar(2) NOT NULL,
  `mmqb_14` varchar(2) NOT NULL,
  `mmqb_15` varchar(2) NOT NULL,
  `mmqb_16` varchar(2) NOT NULL,
  `mmqb_17` varchar(2) NOT NULL,
  `mmqb_18` varchar(2) NOT NULL,
  `mmqb_19` varchar(2) NOT NULL,
  `mmqb_20` varchar(2) NOT NULL,
  `mmqb_21` varchar(2) NOT NULL,
  `mmqb_22` varchar(2) NOT NULL,
  `mmqb_23` varchar(2) NOT NULL,
  `mmqb_24` varchar(2) NOT NULL,
  `mmqb_25` varchar(2) NOT NULL,
  `mmqb_26` varchar(2) NOT NULL,
  `mmqb_27` varchar(2) NOT NULL,
  `mmqb_28` varchar(2) NOT NULL,
  `mmqb_29` varchar(2) NOT NULL,
  `mmqb_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mmqb`
--

INSERT INTO `mmqb` (`id`, `mmqb_1`, `mmqb_2`, `mmqb_3`, `mmqb_4`, `mmqb_5`, `mmqb_6`, `mmqb_7`, `mmqb_8`, `mmqb_9`, `mmqb_10`, `mmqb_11`, `mmqb_12`, `mmqb_13`, `mmqb_14`, `mmqb_15`, `mmqb_16`, `mmqb_17`, `mmqb_18`, `mmqb_19`, `mmqb_20`, `mmqb_21`, `mmqb_22`, `mmqb_23`, `mmqb_24`, `mmqb_25`, `mmqb_26`, `mmqb_27`, `mmqb_28`, `mmqb_29`, `mmqb_30`) VALUES
('910651455V', 'TA', 'TA', 'TA', 'TA', 'TA', 'TA', 'TA', 'TA', 'TA', 'TA', 'TD', 'TD', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'TD', 'D', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `mmqb_6`
--

CREATE TABLE IF NOT EXISTS `mmqb_6` (
  `id` varchar(10) NOT NULL,
  `mmqb_1` varchar(2) NOT NULL,
  `mmqb_2` varchar(2) NOT NULL,
  `mmqb_3` varchar(2) NOT NULL,
  `mmqb_4` varchar(2) NOT NULL,
  `mmqb_5` varchar(2) NOT NULL,
  `mmqb_6` varchar(2) NOT NULL,
  `mmqb_7` varchar(2) NOT NULL,
  `mmqb_8` varchar(2) NOT NULL,
  `mmqb_9` varchar(2) NOT NULL,
  `mmqb_10` varchar(2) NOT NULL,
  `mmqb_11` varchar(2) NOT NULL,
  `mmqb_12` varchar(2) NOT NULL,
  `mmqb_13` varchar(2) NOT NULL,
  `mmqb_14` varchar(2) NOT NULL,
  `mmqb_15` varchar(2) NOT NULL,
  `mmqb_16` varchar(2) NOT NULL,
  `mmqb_17` varchar(2) NOT NULL,
  `mmqb_18` varchar(2) NOT NULL,
  `mmqb_19` varchar(2) NOT NULL,
  `mmqb_20` varchar(2) NOT NULL,
  `mmqb_21` varchar(2) NOT NULL,
  `mmqb_22` varchar(2) NOT NULL,
  `mmqb_23` varchar(2) NOT NULL,
  `mmqb_24` varchar(2) NOT NULL,
  `mmqb_25` varchar(2) NOT NULL,
  `mmqb_26` varchar(2) NOT NULL,
  `mmqb_27` varchar(2) NOT NULL,
  `mmqb_28` varchar(2) NOT NULL,
  `mmqb_29` varchar(2) NOT NULL,
  `mmqb_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mmqb_12`
--

CREATE TABLE IF NOT EXISTS `mmqb_12` (
  `id` varchar(10) NOT NULL,
  `mmqb_1` varchar(2) NOT NULL,
  `mmqb_2` varchar(2) NOT NULL,
  `mmqb_3` varchar(2) NOT NULL,
  `mmqb_4` varchar(2) NOT NULL,
  `mmqb_5` varchar(2) NOT NULL,
  `mmqb_6` varchar(2) NOT NULL,
  `mmqb_7` varchar(2) NOT NULL,
  `mmqb_8` varchar(2) NOT NULL,
  `mmqb_9` varchar(2) NOT NULL,
  `mmqb_10` varchar(2) NOT NULL,
  `mmqb_11` varchar(2) NOT NULL,
  `mmqb_12` varchar(2) NOT NULL,
  `mmqb_13` varchar(2) NOT NULL,
  `mmqb_14` varchar(2) NOT NULL,
  `mmqb_15` varchar(2) NOT NULL,
  `mmqb_16` varchar(2) NOT NULL,
  `mmqb_17` varchar(2) NOT NULL,
  `mmqb_18` varchar(2) NOT NULL,
  `mmqb_19` varchar(2) NOT NULL,
  `mmqb_20` varchar(2) NOT NULL,
  `mmqb_21` varchar(2) NOT NULL,
  `mmqb_22` varchar(2) NOT NULL,
  `mmqb_23` varchar(2) NOT NULL,
  `mmqb_24` varchar(2) NOT NULL,
  `mmqb_25` varchar(2) NOT NULL,
  `mmqb_26` varchar(2) NOT NULL,
  `mmqb_27` varchar(2) NOT NULL,
  `mmqb_28` varchar(2) NOT NULL,
  `mmqb_29` varchar(2) NOT NULL,
  `mmqb_30` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `id` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `race` varchar(20) NOT NULL,
  `town` varchar(20) NOT NULL,
  `employeement` varchar(30) NOT NULL,
  `date_birth` date NOT NULL,
  `register_date` date NOT NULL,
  `date_t6` date DEFAULT NULL,
  `date_t12` date DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `contact_person` varchar(100) NOT NULL,
  `adress` varchar(70) NOT NULL,
  `refered_by` varchar(20) NOT NULL,
  `age` varchar(15) NOT NULL,
  `diognosis` varchar(50) NOT NULL,
  `level_motivation` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `name`, `gender`, `religion`, `race`, `town`, `employeement`, `date_birth`, `register_date`, `date_t6`, `date_t12`, `email`, `telephone`, `contact_person`, `adress`, `refered_by`, `age`, `diognosis`, `level_motivation`) VALUES
('123456789V', 'Test name', 'male', 'buddhist', 'sinhala', 'apura', 'none', '2015-12-13', '2015-12-13', '2015-12-13', '2015-12-13', 'aa', 'aaa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa'),
('910651455V', 'Udayanga Senanayake', 'Male', 'Buddhism', 'Sinhala', 'Rajangane', 'Nune', '1991-03-05', '2015-12-13', '2015-12-13', '2015-12-13', 'mail@udayanga.me', '0715612313', 'none', 'Senavil, Rajangane', 'OPD-NHSL', '35 or below', 'Harmfull use of alcohol', 'High');

-- --------------------------------------------------------

--
-- Table structure for table `q_lef_q_sf`
--

CREATE TABLE IF NOT EXISTS `q_lef_q_sf` (
  `id` varchar(10) NOT NULL,
  `q_lef_q_sf_1` int(11) NOT NULL,
  `q_lef_q_sf_2` int(11) NOT NULL,
  `q_lef_q_sf_3` int(11) NOT NULL,
  `q_lef_q_sf_4` int(11) NOT NULL,
  `q_lef_q_sf_5` int(11) NOT NULL,
  `q_lef_q_sf_6` int(11) NOT NULL,
  `q_lef_q_sf_7` int(11) NOT NULL,
  `q_lef_q_sf_8` int(11) NOT NULL,
  `q_lef_q_sf_9` int(11) NOT NULL,
  `q_lef_q_sf_10` int(11) NOT NULL,
  `q_lef_q_sf_11` int(11) NOT NULL,
  `q_lef_q_sf_12` int(11) NOT NULL,
  `q_lef_q_sf_13` int(11) NOT NULL,
  `q_lef_q_sf_14` int(11) NOT NULL,
  `q_lef_q_sf_15` int(11) NOT NULL,
  `q_lef_q_sf_16` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `q_lef_q_sf`
--

INSERT INTO `q_lef_q_sf` (`id`, `q_lef_q_sf_1`, `q_lef_q_sf_2`, `q_lef_q_sf_3`, `q_lef_q_sf_4`, `q_lef_q_sf_5`, `q_lef_q_sf_6`, `q_lef_q_sf_7`, `q_lef_q_sf_8`, `q_lef_q_sf_9`, `q_lef_q_sf_10`, `q_lef_q_sf_11`, `q_lef_q_sf_12`, `q_lef_q_sf_13`, `q_lef_q_sf_14`, `q_lef_q_sf_15`, `q_lef_q_sf_16`) VALUES
('910651455V', 1, 1, 2, 2, 2, 2, 2, 2, 5, 5, 4, 4, 4, 4, 4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `q_lef_q_sf_6`
--

CREATE TABLE IF NOT EXISTS `q_lef_q_sf_6` (
  `id` varchar(10) NOT NULL,
  `q_lef_q_sf_1` int(11) NOT NULL,
  `q_lef_q_sf_2` int(11) NOT NULL,
  `q_lef_q_sf_3` int(11) NOT NULL,
  `q_lef_q_sf_4` int(11) NOT NULL,
  `q_lef_q_sf_5` int(11) NOT NULL,
  `q_lef_q_sf_6` int(11) NOT NULL,
  `q_lef_q_sf_7` int(11) NOT NULL,
  `q_lef_q_sf_8` int(11) NOT NULL,
  `q_lef_q_sf_9` int(11) NOT NULL,
  `q_lef_q_sf_10` int(11) NOT NULL,
  `q_lef_q_sf_11` int(11) NOT NULL,
  `q_lef_q_sf_12` int(11) NOT NULL,
  `q_lef_q_sf_13` int(11) NOT NULL,
  `q_lef_q_sf_14` int(11) NOT NULL,
  `q_lef_q_sf_15` int(11) NOT NULL,
  `q_lef_q_sf_16` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `q_lef_q_sf_12`
--

CREATE TABLE IF NOT EXISTS `q_lef_q_sf_12` (
  `id` varchar(10) NOT NULL,
  `q_lef_q_sf_1` int(11) NOT NULL,
  `q_lef_q_sf_2` int(11) NOT NULL,
  `q_lef_q_sf_3` int(11) NOT NULL,
  `q_lef_q_sf_4` int(11) NOT NULL,
  `q_lef_q_sf_5` int(11) NOT NULL,
  `q_lef_q_sf_6` int(11) NOT NULL,
  `q_lef_q_sf_7` int(11) NOT NULL,
  `q_lef_q_sf_8` int(11) NOT NULL,
  `q_lef_q_sf_9` int(11) NOT NULL,
  `q_lef_q_sf_10` int(11) NOT NULL,
  `q_lef_q_sf_11` int(11) NOT NULL,
  `q_lef_q_sf_12` int(11) NOT NULL,
  `q_lef_q_sf_13` int(11) NOT NULL,
  `q_lef_q_sf_14` int(11) NOT NULL,
  `q_lef_q_sf_15` int(11) NOT NULL,
  `q_lef_q_sf_16` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE IF NOT EXISTS `state` (
  `T0_audit` varchar(1) NOT NULL,
  `T0_tlfb` varchar(1) NOT NULL,
  `T0_mmqa` varchar(1) NOT NULL,
  `T0_mmqb` varchar(1) NOT NULL,
  `T0_qles_qsf` varchar(1) NOT NULL,
  `T6_tlfb` varchar(1) NOT NULL,
  `T6_mmqa` varchar(1) NOT NULL,
  `T6_mmqb` varchar(1) NOT NULL,
  `T6_qles_qsf` varchar(1) NOT NULL,
  `T6_blood` varchar(1) NOT NULL,
  `T12_audit` varchar(1) NOT NULL,
  `T12_tlfb` varchar(1) NOT NULL,
  `T12_mmqa` varchar(1) NOT NULL,
  `T12_mmqb` varchar(1) NOT NULL,
  `T12_qles_qsf` varchar(1) NOT NULL,
  `T12_blood` varchar(1) NOT NULL,
  `id` varchar(10) NOT NULL,
  `T0_blood` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `state`
--

INSERT INTO `state` (`T0_audit`, `T0_tlfb`, `T0_mmqa`, `T0_mmqb`, `T0_qles_qsf`, `T6_tlfb`, `T6_mmqa`, `T6_mmqb`, `T6_qles_qsf`, `T6_blood`, `T12_audit`, `T12_tlfb`, `T12_mmqa`, `T12_mmqb`, `T12_qles_qsf`, `T12_blood`, `id`, `T0_blood`) VALUES
('y', 'y', 'y', 'y', 'y', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', '910651455V', 'y');

-- --------------------------------------------------------

--
-- Table structure for table `tlfb`
--

CREATE TABLE IF NOT EXISTS `tlfb` (
  `id` varchar(10) NOT NULL,
  `tlfb_1` int(11) NOT NULL,
  `tlfb_2` int(11) NOT NULL,
  `tlfb_3` int(11) NOT NULL,
  `tlfb_4` int(11) NOT NULL,
  `tlfb_5` int(11) NOT NULL,
  `tlfb_6` int(11) NOT NULL,
  `tlfb_7` int(11) NOT NULL,
  `tlfb_8` int(11) NOT NULL,
  `tlfb_9` int(11) NOT NULL,
  `tlfb_10` int(11) NOT NULL,
  `tlfb_11` int(11) NOT NULL,
  `tlfb_12` int(11) NOT NULL,
  `tlfb_13` int(11) NOT NULL,
  `tlfb_14` int(11) NOT NULL,
  `tlfb_15` int(11) NOT NULL,
  `tlfb_16` int(11) NOT NULL,
  `tlfb_17` int(11) NOT NULL,
  `tlfb_18` int(11) NOT NULL,
  `tlfb_19` int(11) NOT NULL,
  `tlfb_20` int(11) NOT NULL,
  `tlfb_21` int(11) NOT NULL,
  `tlfb_22` int(11) NOT NULL,
  `tlfb_23` int(11) NOT NULL,
  `tlfb_24` int(11) NOT NULL,
  `tlfb_25` int(11) NOT NULL,
  `tlfb_26` int(11) NOT NULL,
  `tlfb_27` int(11) NOT NULL,
  `tlfb_28` int(11) NOT NULL,
  `tlfb_29` int(11) NOT NULL,
  `tlfb_30` int(11) NOT NULL,
  `tlfb_31` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tlfb`
--

INSERT INTO `tlfb` (`id`, `tlfb_1`, `tlfb_2`, `tlfb_3`, `tlfb_4`, `tlfb_5`, `tlfb_6`, `tlfb_7`, `tlfb_8`, `tlfb_9`, `tlfb_10`, `tlfb_11`, `tlfb_12`, `tlfb_13`, `tlfb_14`, `tlfb_15`, `tlfb_16`, `tlfb_17`, `tlfb_18`, `tlfb_19`, `tlfb_20`, `tlfb_21`, `tlfb_22`, `tlfb_23`, `tlfb_24`, `tlfb_25`, `tlfb_26`, `tlfb_27`, `tlfb_28`, `tlfb_29`, `tlfb_30`, `tlfb_31`) VALUES
('910651455V', 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);

-- --------------------------------------------------------

--
-- Table structure for table `tlfb_6`
--

CREATE TABLE IF NOT EXISTS `tlfb_6` (
  `id` varchar(10) NOT NULL,
  `tlfb_1` int(11) NOT NULL,
  `tlfb_2` int(11) NOT NULL,
  `tlfb_3` int(11) NOT NULL,
  `tlfb_4` int(11) NOT NULL,
  `tlfb_5` int(11) NOT NULL,
  `tlfb_6` int(11) NOT NULL,
  `tlfb_7` int(11) NOT NULL,
  `tlfb_8` int(11) NOT NULL,
  `tlfb_9` int(11) NOT NULL,
  `tlfb_10` int(11) NOT NULL,
  `tlfb_11` int(11) NOT NULL,
  `tlfb_12` int(11) NOT NULL,
  `tlfb_13` int(11) NOT NULL,
  `tlfb_14` int(11) NOT NULL,
  `tlfb_15` int(11) NOT NULL,
  `tlfb_16` int(11) NOT NULL,
  `tlfb_17` int(11) NOT NULL,
  `tlfb_18` int(11) NOT NULL,
  `tlfb_19` int(11) NOT NULL,
  `tlfb_20` int(11) NOT NULL,
  `tlfb_21` int(11) NOT NULL,
  `tlfb_22` int(11) NOT NULL,
  `tlfb_23` int(11) NOT NULL,
  `tlfb_24` int(11) NOT NULL,
  `tlfb_25` int(11) NOT NULL,
  `tlfb_26` int(11) NOT NULL,
  `tlfb_27` int(11) NOT NULL,
  `tlfb_28` int(11) NOT NULL,
  `tlfb_29` int(11) NOT NULL,
  `tlfb_30` int(11) NOT NULL,
  `tlfb_31` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tlfb_12`
--

CREATE TABLE IF NOT EXISTS `tlfb_12` (
  `id` varchar(10) NOT NULL,
  `tlfb_1` int(11) NOT NULL,
  `tlfb_2` int(11) NOT NULL,
  `tlfb_3` int(11) NOT NULL,
  `tlfb_4` int(11) NOT NULL,
  `tlfb_5` int(11) NOT NULL,
  `tlfb_6` int(11) NOT NULL,
  `tlfb_7` int(11) NOT NULL,
  `tlfb_8` int(11) NOT NULL,
  `tlfb_9` int(11) NOT NULL,
  `tlfb_10` int(11) NOT NULL,
  `tlfb_11` int(11) NOT NULL,
  `tlfb_12` int(11) NOT NULL,
  `tlfb_13` int(11) NOT NULL,
  `tlfb_14` int(11) NOT NULL,
  `tlfb_15` int(11) NOT NULL,
  `tlfb_16` int(11) NOT NULL,
  `tlfb_17` int(11) NOT NULL,
  `tlfb_18` int(11) NOT NULL,
  `tlfb_19` int(11) NOT NULL,
  `tlfb_20` int(11) NOT NULL,
  `tlfb_21` int(11) NOT NULL,
  `tlfb_22` int(11) NOT NULL,
  `tlfb_23` int(11) NOT NULL,
  `tlfb_24` int(11) NOT NULL,
  `tlfb_25` int(11) NOT NULL,
  `tlfb_26` int(11) NOT NULL,
  `tlfb_27` int(11) NOT NULL,
  `tlfb_28` int(11) NOT NULL,
  `tlfb_29` int(11) NOT NULL,
  `tlfb_30` int(11) NOT NULL,
  `tlfb_31` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_name` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_name`, `password`) VALUES
('user', 'pass');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
