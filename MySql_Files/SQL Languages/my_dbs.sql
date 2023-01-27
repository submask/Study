/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80030
Source Host           : localhost:3306
Source Database       : my_dbs

Target Server Type    : MYSQL
Target Server Version : 80030
File Encoding         : 65001

Date: 2022-11-05 15:44:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int NOT NULL,
  `course_name` varchar(20) NOT NULL,
  `course_type` varchar(20) NOT NULL,
  `tid` int NOT NULL,
  `count` tinyint NOT NULL,
  `course_add` varchar(20) NOT NULL,
  `id` int DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `tid` (`tid`),
  KEY `cname_fk` (`course_name`),
  KEY `id_fk` (`id`),
  CONSTRAINT `cname_fk` FOREIGN KEY (`course_name`) REFERENCES `teacher_info` (`course`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `teacher_info` (`tid`),
  CONSTRAINT `id_fk` FOREIGN KEY (`id`) REFERENCES `student_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('2341411', '数据库设计', '数据库应用', '20101', '5', 'A403', '2012121501');
INSERT INTO `course` VALUES ('2341412', '大数据原理', '大数据应用', '20102', '34', 'A402', '2020103502');
INSERT INTO `course` VALUES ('2341413', 'Vue框架设计', '框架开发', '20103', '24', 'A402', '2020103501');
INSERT INTO `course` VALUES ('2341414', '数据挖掘与数据仓库', '大数据应用', '20104', '32', 'A402', '2020103504');
INSERT INTO `course` VALUES ('2341415', '网络爬虫', '大数据应用', '20105', '32', 'A401', '2020103502');
INSERT INTO `course` VALUES ('2341416', 'web应用设计', '框架开发', '20106', '32', 'B610', '2020103503');
INSERT INTO `course` VALUES ('2341417', '高等数学', '社会人文', '20107', '64', 'A414', '2121103001');
INSERT INTO `course` VALUES ('2341418', '大学英语', '社会人文', '20108', '64', 'B111', '2020103503');
INSERT INTO `course` VALUES ('2341419', '马克思原理', '社会人文', '20109', '52', 'B211', '2020103505');
INSERT INTO `course` VALUES ('2341420', '大学体育', '社会人文', '20110', '23', '操场', '2121103001');
INSERT INTO `course` VALUES ('2341421', '概率论与数理统计', '社会人文', '20111', '52', 'B312', '2020103503');

-- ----------------------------
-- Table structure for major_info
-- ----------------------------
DROP TABLE IF EXISTS `major_info`;
CREATE TABLE `major_info` (
  `mid` varchar(20) NOT NULL,
  `major_name` varchar(50) NOT NULL,
  `class_name` varchar(50) NOT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of major_info
-- ----------------------------
INSERT INTO `major_info` VALUES ('BD2302101', '大数据分析与大数据统计', '201');
INSERT INTO `major_info` VALUES ('BD2302102', '大数据深度分析', '202');
INSERT INTO `major_info` VALUES ('BD2302103', '大数据分析与大数据统计', '202');
INSERT INTO `major_info` VALUES ('BD2302104', '大数据分析与大数据统计', '205');
INSERT INTO `major_info` VALUES ('BD2302105', '大数据分析与大数据统计', '204');
INSERT INTO `major_info` VALUES ('BD2302106', '大数据分析与大数据统计', '203');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int NOT NULL,
  `course_id` int NOT NULL,
  `score` int NOT NULL,
  PRIMARY KEY (`id`,`course_id`),
  KEY `courseid` (`course_id`),
  CONSTRAINT `courseid` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `student_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('2012121501', '2341411', '66');
INSERT INTO `score` VALUES ('2012121501', '2341413', '88');
INSERT INTO `score` VALUES ('2020103502', '2341412', '99');
INSERT INTO `score` VALUES ('2020103502', '2341415', '88');
INSERT INTO `score` VALUES ('2020103503', '2341411', '99');
INSERT INTO `score` VALUES ('2020103503', '2341416', '66');
INSERT INTO `score` VALUES ('2020103503', '2341418', '77');
INSERT INTO `score` VALUES ('2020103503', '2341421', '88');
INSERT INTO `score` VALUES ('2020103504', '2341414', '75');
INSERT INTO `score` VALUES ('2020103505', '2341419', '90');
INSERT INTO `score` VALUES ('2121103001', '2341417', '88');
INSERT INTO `score` VALUES ('2121103001', '2341420', '67');

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` int NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `age` varchar(10) NOT NULL,
  `birthday` date NOT NULL,
  `political` varchar(10) NOT NULL,
  `place` varchar(50) NOT NULL,
  `phone` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('2012121501', '萧思', '男', '22', '2010-07-10', '中共党员', '湖北省咸宁市通山县新标路810号', '17785824036');
INSERT INTO `student_info` VALUES ('2020103501', '谭进', '男', '25', '2010-07-10', '群众', '河南省南阳市淅川县建设路558号', '13585824036');
INSERT INTO `student_info` VALUES ('2020103502', '杨兴', '男', '18', '2010-07-10', '共青团员', '江西省赣州市全南县南环路621号', '13585842036');
INSERT INTO `student_info` VALUES ('2020103503', '段阳菲', '女', '24', '2010-07-10', '共青团员', '河北省沧州市黄骅市教育路前庞村第三片区223号', '13312214582');
INSERT INTO `student_info` VALUES ('2020103504', '谭芳', '女', '24', '2010-07-10', '群众', '北京市丰台区槐房北路德鑫嘉园', '17323564566');
INSERT INTO `student_info` VALUES ('2020103505', '林歧', '男', '25', '2010-07-10', '中共党员', '天津市滨海新区官港南路与迎宾路交口', '14723568023');
INSERT INTO `student_info` VALUES ('2121103001', '贺若菲', '女', '22', '2010-07-10', '群众', '甘肃省天水市武山县贾家坪自然村第一片区23号', '13850231490');

-- ----------------------------
-- Table structure for student_status
-- ----------------------------
DROP TABLE IF EXISTS `student_status`;
CREATE TABLE `student_status` (
  `gid` varchar(20) NOT NULL,
  `into_time` date NOT NULL,
  `out_time` date NOT NULL,
  `education` varchar(10) NOT NULL,
  `id` int NOT NULL,
  `mid` varchar(20) NOT NULL,
  `degree` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`gid`),
  KEY `fk_id` (`id`),
  KEY `fku_id` (`mid`),
  CONSTRAINT `fk_id` FOREIGN KEY (`id`) REFERENCES `student_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of student_status
-- ----------------------------
INSERT INTO `student_status` VALUES ('G2301', '2020-09-05', '2024-06-29', '本科', '2012121501', 'BD2302102', '学士');
INSERT INTO `student_status` VALUES ('G2302', '2020-09-05', '2023-06-29', '大专', '2020103502', 'BD2302101', '');
INSERT INTO `student_status` VALUES ('G2303', '2020-09-05', '2023-06-29', '大专', '2020103503', 'BD2302103', '');
INSERT INTO `student_status` VALUES ('G2304', '2020-09-05', '2024-06-29', '本科', '2020103504', 'BD2302104', '学士');
INSERT INTO `student_status` VALUES ('G2305', '2020-09-05', '2024-06-29', '本科', '2020103505', 'BD2302105', '学士');
INSERT INTO `student_status` VALUES ('G2306', '2020-09-05', '2024-06-29', '本科', '2121103001', 'BD2302107', '学士');

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `tid` int NOT NULL,
  `teacher_name` varchar(10) NOT NULL,
  `course` varchar(20) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `phone` bigint NOT NULL,
  `out_into` tinyint(1) NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `course` (`course`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('20101', '小李', '数据库设计', '国科数字产业学院', '17780830567', '0');
INSERT INTO `teacher_info` VALUES ('20102', '小朱', '大数据原理', '国科数字产业学院', '17780890771', '0');
INSERT INTO `teacher_info` VALUES ('20103', '小恒', 'Vue框架设计', '国科数字产业学院', '177845340771', '0');
INSERT INTO `teacher_info` VALUES ('20104', '小匡', '数据挖掘与数据仓库', '国科数字产业学院', '183845340771', '1');
INSERT INTO `teacher_info` VALUES ('20105', '小萧', '网络爬虫', '国科数字产业学院', '177342321311', '0');
INSERT INTO `teacher_info` VALUES ('20106', '小杜', 'web应用设计', '国科数字产业学院', '17777090771', '0');
INSERT INTO `teacher_info` VALUES ('20107', '郑芳', '高等数学', '通识教育学院', '18980890771', '0');
INSERT INTO `teacher_info` VALUES ('20108', '李仁', '大学英语', '通识教育学院', '17712890771', '0');
INSERT INTO `teacher_info` VALUES ('20109', '戴芳琪', '马克思原理', '马克思学院', '17780890771', '0');
INSERT INTO `teacher_info` VALUES ('20110', '倪云畦', '大学体育', '教育学院', '17780890771', '0');
INSERT INTO `teacher_info` VALUES ('20111', '黄秦', '概率论与数理统计', '通识教育学院', '17780890771', '0');
