-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2017 at 09:23 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blood`
--

-- --------------------------------------------------------

--
-- Table structure for table `abnegative`
--

CREATE TABLE `abnegative` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `abnegative`
--

INSERT INTO `abnegative` (`id`, `count`, `hospital_id`) VALUES
(1, 150, 14),
(2, 850, 15);

-- --------------------------------------------------------

--
-- Table structure for table `abpositive`
--

CREATE TABLE `abpositive` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `abpositive`
--

INSERT INTO `abpositive` (`id`, `count`, `hospital_id`) VALUES
(1, 240, 14);

-- --------------------------------------------------------

--
-- Table structure for table `anegative`
--

CREATE TABLE `anegative` (
  `id` int(10) NOT NULL,
  `count` int(100) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `anegative`
--

INSERT INTO `anegative` (`id`, `count`, `hospital_id`) VALUES
(1, 198, 14),
(2, 700, 15);

-- --------------------------------------------------------

--
-- Table structure for table `aplus`
--

CREATE TABLE `aplus` (
  `id` int(10) NOT NULL,
  `numberofbage` int(100) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `apositive`
--

CREATE TABLE `apositive` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `apositive`
--

INSERT INTO `apositive` (`id`, `count`, `hospital_id`) VALUES
(3, 101, 14);

-- --------------------------------------------------------

--
-- Table structure for table `bnegative`
--

CREATE TABLE `bnegative` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `bnegative`
--

INSERT INTO `bnegative` (`id`, `count`, `hospital_id`) VALUES
(1, 60, 14),
(2, 1200, 15);

-- --------------------------------------------------------

--
-- Table structure for table `bpositive`
--

CREATE TABLE `bpositive` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `bpositive`
--

INSERT INTO `bpositive` (`id`, `count`, `hospital_id`) VALUES
(1, 120, 14);

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `id` int(10) NOT NULL,
  `bloodtype` varchar(10) NOT NULL,
  `bloodstatus` varchar(50) NOT NULL,
  `Number_of_bags` int(50) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `ssn` int(10) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`id`, `bloodtype`, `bloodstatus`, `Number_of_bags`, `description`, `ssn`, `hospital_id`) VALUES
(9, 'O+', 'true', 5, 'status good', 8888, 14),
(11, 'O+', 'true', 3, 'status good', 8888, 15);

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `id` int(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `state` varchar(100) DEFAULT NULL,
  `street` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`id`, `name`, `email`, `password`, `state`, `street`) VALUES
(14, 'الدمرداش', 'el_dmardsh2017@gmail.com', '123', 'القاهرة', '6October'),
(15, 'المركز الاقليمى لنقل الدم بالاسكندرية', 'blood122@gmail.com', '0000', 'الاسكندرية', '6October');

-- --------------------------------------------------------

--
-- Table structure for table `onegative`
--

CREATE TABLE `onegative` (
  `id` int(100) NOT NULL,
  `count` int(100) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `onegative`
--

INSERT INTO `onegative` (`id`, `count`, `hospital_id`) VALUES
(1, 179, 14);

-- --------------------------------------------------------

--
-- Table structure for table `opositive`
--

CREATE TABLE `opositive` (
  `id` int(100) NOT NULL,
  `count` int(255) NOT NULL,
  `hospital_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `opositive`
--

INSERT INTO `opositive` (`id`, `count`, `hospital_id`) VALUES
(1, 76, 14);

-- --------------------------------------------------------

--
-- Table structure for table `phones`
--

CREATE TABLE `phones` (
  `id` int(100) NOT NULL,
  `phoneNumber` varchar(15) NOT NULL,
  `id_hospital` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `phones`
--

INSERT INTO `phones` (`id`, `phoneNumber`, `id_hospital`) VALUES
(1, '010', 14),
(2, '012', 14),
(3, '034951963', 15),
(4, '034951971', 15),
(5, '011', 14);

-- --------------------------------------------------------

--
-- Table structure for table `timeclose`
--

CREATE TABLE `timeclose` (
  `id` int(100) NOT NULL,
  `time` time DEFAULT NULL,
  `date` date NOT NULL,
  `bloodtype` varchar(50) NOT NULL,
  `hospital_id` int(100) NOT NULL,
  `donor_ssn` int(100) NOT NULL,
  `flag` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `timeclose`
--

INSERT INTO `timeclose` (`id`, `time`, `date`, `bloodtype`, `hospital_id`, `donor_ssn`, `flag`) VALUES
(12, '02:00:00', '2017-07-04', '', 14, 8888, 0),
(21, '02:00:00', '2017-07-04', 'null', 14, 2703, 0);

-- --------------------------------------------------------

--
-- Table structure for table `time_space`
--

CREATE TABLE `time_space` (
  `id` int(10) NOT NULL,
  `time` time DEFAULT NULL,
  `hospital_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `time_space`
--

INSERT INTO `time_space` (`id`, `time`, `hospital_id`) VALUES
(32, '02:00:00', 14),
(35, '03:00:00', 14);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `birthdate` varchar(50) NOT NULL,
  `phonenumber` varchar(15) DEFAULT NULL,
  `type` varchar(50) NOT NULL,
  `ssn` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `password`, `address`, `email`, `birthdate`, `phonenumber`, `type`, `ssn`) VALUES
(1, 'ali salama', '1234', 'cairo egypt', 'ahmed.salama.fci2015@gmail.com', '10-9-1994', '01127618327', 'user', 8888),
(2, 'hossam ahmed', '1234', 'menofia', 'hossamahmed444@gmail.com', '2-2-1995', '01017654181', 'admin', 7777),
(3, 'ebrahim sultan', '1234', NULL, 'ebrahimhassan121@gmail.com', '26 June, 1994', '01275266439', 'user', 2703);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abnegative`
--
ALTER TABLE `abnegative`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `abpositive`
--
ALTER TABLE `abpositive`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `anegative`
--
ALTER TABLE `anegative`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `aplus`
--
ALTER TABLE `aplus`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `apositive`
--
ALTER TABLE `apositive`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `bnegative`
--
ALTER TABLE `bnegative`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `bpositive`
--
ALTER TABLE `bpositive`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `donor`
--
ALTER TABLE `donor`
  ADD KEY `id` (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `state` (`state`);

--
-- Indexes for table `onegative`
--
ALTER TABLE `onegative`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `opositive`
--
ALTER TABLE `opositive`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `phones`
--
ALTER TABLE `phones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `id_hospital` (`id_hospital`);

--
-- Indexes for table `timeclose`
--
ALTER TABLE `timeclose`
  ADD PRIMARY KEY (`id`),
  ADD KEY `is` (`id`),
  ADD KEY `hospital_id` (`hospital_id`),
  ADD KEY `donor_ssn` (`donor_ssn`),
  ADD KEY `time` (`time`);

--
-- Indexes for table `time_space`
--
ALTER TABLE `time_space`
  ADD UNIQUE KEY `time` (`time`),
  ADD KEY `id` (`id`),
  ADD KEY `hospital_id` (`hospital_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD KEY `id` (`id`),
  ADD KEY `ssn` (`ssn`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abnegative`
--
ALTER TABLE `abnegative`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `abpositive`
--
ALTER TABLE `abpositive`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `anegative`
--
ALTER TABLE `anegative`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `aplus`
--
ALTER TABLE `aplus`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `apositive`
--
ALTER TABLE `apositive`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `bnegative`
--
ALTER TABLE `bnegative`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `bpositive`
--
ALTER TABLE `bpositive`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `donor`
--
ALTER TABLE `donor`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `hospital`
--
ALTER TABLE `hospital`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `onegative`
--
ALTER TABLE `onegative`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `opositive`
--
ALTER TABLE `opositive`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `phones`
--
ALTER TABLE `phones`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `timeclose`
--
ALTER TABLE `timeclose`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT for table `time_space`
--
ALTER TABLE `time_space`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `abnegative`
--
ALTER TABLE `abnegative`
  ADD CONSTRAINT `abnegative_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `abpositive`
--
ALTER TABLE `abpositive`
  ADD CONSTRAINT `abpositive_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `anegative`
--
ALTER TABLE `anegative`
  ADD CONSTRAINT `anegative_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `aplus`
--
ALTER TABLE `aplus`
  ADD CONSTRAINT `aplus_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `apositive`
--
ALTER TABLE `apositive`
  ADD CONSTRAINT `apositive_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `bnegative`
--
ALTER TABLE `bnegative`
  ADD CONSTRAINT `bnegative_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `bpositive`
--
ALTER TABLE `bpositive`
  ADD CONSTRAINT `bpositive_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `donor`
--
ALTER TABLE `donor`
  ADD CONSTRAINT `donor_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `onegative`
--
ALTER TABLE `onegative`
  ADD CONSTRAINT `onegative_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `opositive`
--
ALTER TABLE `opositive`
  ADD CONSTRAINT `opositive_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `phones`
--
ALTER TABLE `phones`
  ADD CONSTRAINT `phones_ibfk_1` FOREIGN KEY (`id_hospital`) REFERENCES `hospital` (`id`);

--
-- Constraints for table `timeclose`
--
ALTER TABLE `timeclose`
  ADD CONSTRAINT `timeclose_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`),
  ADD CONSTRAINT `timeclose_ibfk_2` FOREIGN KEY (`donor_ssn`) REFERENCES `user` (`ssn`);

--
-- Constraints for table `time_space`
--
ALTER TABLE `time_space`
  ADD CONSTRAINT `time_space_ibfk_1` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
