-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2022 at 07:26 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `class_tb`
--

CREATE TABLE `class_tb` (
  `ClassId` int(11) NOT NULL,
  `ClassName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `class_tb`
--

INSERT INTO `class_tb` (`ClassId`, `ClassName`) VALUES
(1, 'Class II'),
(3, 'Class I');

-- --------------------------------------------------------

--
-- Table structure for table `result_tb`
--

CREATE TABLE `result_tb` (
  `ResultId` int(11) NOT NULL,
  `Obtained_Marks` varchar(1000) NOT NULL,
  `Total_Obtained_Marks` double NOT NULL,
  `Total_Marks` double NOT NULL,
  `Percentage` double NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `StudentId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result_tb`
--

INSERT INTO `result_tb` (`ResultId`, `Obtained_Marks`, `Total_Obtained_Marks`, `Total_Marks`, `Percentage`, `Grade`, `Status`, `StudentId`) VALUES
(1, '[70.0,80.0,90.0]', 240, 300, 80, 'A+', 'Passes', 6);

-- --------------------------------------------------------

--
-- Table structure for table `section_tb`
--

CREATE TABLE `section_tb` (
  `SectionId` int(11) NOT NULL,
  `SectionName` varchar(50) NOT NULL,
  `ClassId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `section_tb`
--

INSERT INTO `section_tb` (`SectionId`, `SectionName`, `ClassId`) VALUES
(2, 'A', 1),
(10, 'B', 1),
(11, 'C', 1),
(12, 'A', 3),
(13, 'B', 3),
(14, 'C', 3);

-- --------------------------------------------------------

--
-- Table structure for table `student_tb`
--

CREATE TABLE `student_tb` (
  `StudentId` int(11) NOT NULL,
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Fathername` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `ContactNo` varchar(20) NOT NULL,
  `Class` int(11) NOT NULL,
  `Section` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_tb`
--

INSERT INTO `student_tb` (`StudentId`, `Firstname`, `Lastname`, `Fathername`, `Address`, `ContactNo`, `Class`, `Section`) VALUES
(15, 'Muhammad Aqib', 'Akhter', 'Muhammad Waseem', 'FB Area', '03152831226', 1, 'B'),
(18, 'Muhammad Aqib', 'Akhter', 'Muhammad Waseem', 'FB Area 123', '03152831226', 1, 'B'),
(19, 'Anus', 'Ahmed', 'Khan', 'Shah Faisal', '0312645892', 1, 'B'),
(20, 'Muhammad Aqib Akhter', 'Akhter', 'Muhammad Waseem', 'FB Area 123', '03152831226', 1, 'B'),
(23, 'Moiz ', 'Khan', 'Khan', 'Landhi', '03125896', 3, 'B'),
(24, 'Moiz ', 'Khan', 'Khan', 'Landhi', '03125896', 3, 'B'),
(25, 'Moiz ', 'Khan', 'Khan', 'Landhi', '03125896', 3, 'B'),
(26, 'Adil', 'Amir', 'Amir', 'FB ARea', '03152831226', 1, 'A'),
(27, 'Adil', 'Amir', 'Muhammad Waseem', 'FB Area', '03152831226', 3, 'B'),
(28, 'Zain', 'Khan', 'Khan', 'abc', '123456789', 3, 'B'),
(29, 'Shayan', 'Malik', 'Malik', 'Nomaish Chorangi', '03125689', 3, 'A');

-- --------------------------------------------------------

--
-- Table structure for table `subject_tb`
--

CREATE TABLE `subject_tb` (
  `SubjectId` int(11) NOT NULL,
  `SubjectName` varchar(50) NOT NULL,
  `SubjectCode` varchar(10) NOT NULL,
  `ClassId` int(11) NOT NULL,
  `TeacherId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject_tb`
--

INSERT INTO `subject_tb` (`SubjectId`, `SubjectName`, `SubjectCode`, `ClassId`, `TeacherId`) VALUES
(1, 'Maths', 'MAT102', 1, 1),
(2, 'Physics', 'PHY102', 1, 1),
(3, 'Chemistry', 'CHEM102', 1, 1),
(4, 'Object Orented Programming', 'CSC101', 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_tb`
--

CREATE TABLE `teacher_tb` (
  `TeacherId` int(11) NOT NULL,
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `ContactNo` varchar(50) NOT NULL,
  `CNIC` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_tb`
--

INSERT INTO `teacher_tb` (`TeacherId`, `Firstname`, `Lastname`, `Qualification`, `ContactNo`, `CNIC`) VALUES
(2, 'Irfan Ali', 'Khundro', 'Master Of Computer Science', '03156891393', '42101-8227599-1'),
(3, 'Mansoor', 'Khoroo', 'Phd', '031226789', '42101-8227599-1'),
(5, 'Muhammad ', 'Ali', 'Master Of Mathmatics', '123456789', '4210182275991'),
(7, 'Ajab', 'Lashari', 'Master of English', '123456789', '42101-225599-2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class_tb`
--
ALTER TABLE `class_tb`
  ADD PRIMARY KEY (`ClassId`);

--
-- Indexes for table `result_tb`
--
ALTER TABLE `result_tb`
  ADD PRIMARY KEY (`ResultId`),
  ADD KEY `StudentId` (`StudentId`);

--
-- Indexes for table `section_tb`
--
ALTER TABLE `section_tb`
  ADD PRIMARY KEY (`SectionId`),
  ADD KEY `ClassId` (`ClassId`);

--
-- Indexes for table `student_tb`
--
ALTER TABLE `student_tb`
  ADD PRIMARY KEY (`StudentId`),
  ADD KEY `Class` (`Class`);

--
-- Indexes for table `subject_tb`
--
ALTER TABLE `subject_tb`
  ADD PRIMARY KEY (`SubjectId`),
  ADD KEY `ClassId` (`ClassId`),
  ADD KEY `TeacherId` (`TeacherId`);

--
-- Indexes for table `teacher_tb`
--
ALTER TABLE `teacher_tb`
  ADD PRIMARY KEY (`TeacherId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `class_tb`
--
ALTER TABLE `class_tb`
  MODIFY `ClassId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `result_tb`
--
ALTER TABLE `result_tb`
  MODIFY `ResultId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `section_tb`
--
ALTER TABLE `section_tb`
  MODIFY `SectionId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `student_tb`
--
ALTER TABLE `student_tb`
  MODIFY `StudentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `subject_tb`
--
ALTER TABLE `subject_tb`
  MODIFY `SubjectId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `teacher_tb`
--
ALTER TABLE `teacher_tb`
  MODIFY `TeacherId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `section_tb`
--
ALTER TABLE `section_tb`
  ADD CONSTRAINT `section_tb_ibfk_1` FOREIGN KEY (`ClassId`) REFERENCES `class_tb` (`ClassId`);

--
-- Constraints for table `student_tb`
--
ALTER TABLE `student_tb`
  ADD CONSTRAINT `student_tb_ibfk_1` FOREIGN KEY (`Class`) REFERENCES `class_tb` (`ClassId`);

--
-- Constraints for table `subject_tb`
--
ALTER TABLE `subject_tb`
  ADD CONSTRAINT `subject_tb_ibfk_1` FOREIGN KEY (`ClassId`) REFERENCES `class_tb` (`ClassId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
