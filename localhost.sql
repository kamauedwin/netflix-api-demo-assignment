-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 09, 2019 at 06:49 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `netflix`
--
CREATE DATABASE IF NOT EXISTS `netflix` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `netflix`;

-- --------------------------------------------------------

--
-- Table structure for table `Clients`
--

CREATE TABLE `Clients` (
  `clientID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `isPaid` tinyint(1) NOT NULL,
  `userRole` text COLLATE utf8_bin NOT NULL,
  `viewingID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `Clients`
--

INSERT INTO `Clients` (`clientID`, `userID`, `isPaid`, `userRole`, `viewingID`) VALUES
(1, 1, 1, 'Client', 1),
(2, 1, 1, 'Client', 2);

-- --------------------------------------------------------

--
-- Table structure for table `Media`
--

CREATE TABLE `Media` (
  `mediaID` int(10) NOT NULL,
  `mediaName` text COLLATE utf8_bin NOT NULL,
  `mediaCategory` text COLLATE utf8_bin NOT NULL,
  `mediaType` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `Media`
--

INSERT INTO `Media` (`mediaID`, `mediaName`, `mediaCategory`, `mediaType`) VALUES
(1, 'First Blood', 'Action', 'Original'),
(2, 'Rambo', 'Action', 'Original');

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `userID` int(10) NOT NULL,
  `userName` text COLLATE utf8_bin NOT NULL,
  `password` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`userID`, `userName`, `password`) VALUES
(1, 'user1', 'password'),
(2, 'user2', 'password'),
(3, 'user3', 'password'),
(4, 'user4', 'password'),
(5, 'user5', 'password');

-- --------------------------------------------------------

--
-- Table structure for table `Viewing`
--

CREATE TABLE `Viewing` (
  `viewingID` int(10) NOT NULL,
  `mediaID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `Viewing`
--

INSERT INTO `Viewing` (`viewingID`, `mediaID`) VALUES
(1, 1),
(2, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Clients`
--
ALTER TABLE `Clients`
  ADD PRIMARY KEY (`clientID`),
  ADD KEY `clientID` (`clientID`,`userID`),
  ADD KEY `mediaID` (`viewingID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `Media`
--
ALTER TABLE `Media`
  ADD PRIMARY KEY (`mediaID`),
  ADD KEY `mediaID` (`mediaID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`userID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `Viewing`
--
ALTER TABLE `Viewing`
  ADD PRIMARY KEY (`viewingID`),
  ADD KEY `viewingID` (`viewingID`),
  ADD KEY `mediaID` (`mediaID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Clients`
--
ALTER TABLE `Clients`
  MODIFY `clientID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=456594;

--
-- AUTO_INCREMENT for table `Media`
--
ALTER TABLE `Media`
  MODIFY `mediaID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `Viewing`
--
ALTER TABLE `Viewing`
  MODIFY `viewingID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Clients`
--
ALTER TABLE `Clients`
  ADD CONSTRAINT `Clients_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `Users` (`userID`),
  ADD CONSTRAINT `Clients_ibfk_2` FOREIGN KEY (`viewingID`) REFERENCES `Viewing` (`viewingID`);

--
-- Constraints for table `Viewing`
--
ALTER TABLE `Viewing`
  ADD CONSTRAINT `Viewing_ibfk_1` FOREIGN KEY (`mediaID`) REFERENCES `Media` (`mediaID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
