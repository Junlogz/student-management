/*
 Navicat Premium Data Transfer

 Source Server         : newlocal
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : student-management

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/05/2023 19:43:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES (1, '管理员1', 'admin', 'admin');
INSERT INTO `admin_info` VALUES (2, '管理员2', 'admin2', 'admin2');
INSERT INTO `admin_info` VALUES (3, '管理员3', 'admin3', 'admin3');
INSERT INTO `admin_info` VALUES (4, '管理员4', 'admin4', 'admin4');
INSERT INTO `admin_info` VALUES (5, '张三', 'zhangSan', 'zhangSan');
INSERT INTO `admin_info` VALUES (6, '原管理员', 'root', 'root');

-- ----------------------------
-- Table structure for course_info
-- ----------------------------
DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info`  (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `course_number` int(64) NULL DEFAULT NULL,
  `course_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `intro` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `type` tinyint(6) NULL DEFAULT NULL,
  `college` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_info
-- ----------------------------
INSERT INTO `course_info` VALUES (1, 1001, '神经网络', '必备课之一', 0, '智慧学院', '计算机科学与技术');
INSERT INTO `course_info` VALUES (2, 1002, '计算机操作原理', '必备课之一', 0, '智能制造学院', '计算机科学与技术');
INSERT INTO `course_info` VALUES (3, 1003, 'pr教程', 'pr教程', 1, '智能制造学院', '数字媒体');
INSERT INTO `course_info` VALUES (4, 1004, '乐理', '乐理', 1, '音乐舞蹈学院', '音乐学');
INSERT INTO `course_info` VALUES (5, 1005, '经济金融', '经济金融', 1, '会计学院', '会计');
INSERT INTO `course_info` VALUES (6, 1006, '经济金融2', '经济金融', 0, '会计学院', '会计');
INSERT INTO `course_info` VALUES (7, 1007, '法律学', '法律学', 0, '法学院', '法律');
INSERT INTO `course_info` VALUES (8, 1008, '体育健康', '体育健康', 0, '体育学院', '体育学');
INSERT INTO `course_info` VALUES (9, 1009, '风险评估', '金融学必备之一课程', 0, '工商学院', '工商管理');

-- ----------------------------
-- Table structure for grade_info
-- ----------------------------
DROP TABLE IF EXISTS `grade_info`;
CREATE TABLE `grade_info`  (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `student_id` int(16) NULL DEFAULT NULL,
  `course_id` int(16) NULL DEFAULT NULL,
  `teacher_id` int(16) NULL DEFAULT NULL,
  `score` int(16) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grade_info
-- ----------------------------
INSERT INTO `grade_info` VALUES (1, 1, 1, 1, 100);
INSERT INTO `grade_info` VALUES (2, 2, 2, 2, 95);
INSERT INTO `grade_info` VALUES (3, 3, 3, 3, 87);
INSERT INTO `grade_info` VALUES (4, 4, 4, 4, 60);
INSERT INTO `grade_info` VALUES (5, 5, 5, 5, 66);
INSERT INTO `grade_info` VALUES (6, 6, 6, 6, 88);
INSERT INTO `grade_info` VALUES (7, 4, 1, 1, 66);
INSERT INTO `grade_info` VALUES (8, 8, 5, 5, 71);
INSERT INTO `grade_info` VALUES (10, 7, 5, 5, 50);
INSERT INTO `grade_info` VALUES (12, 14, 9, 6, 0);

-- ----------------------------
-- Table structure for rewards_punishment_info
-- ----------------------------
DROP TABLE IF EXISTS `rewards_punishment_info`;
CREATE TABLE `rewards_punishment_info`  (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `student_id` int(16) NULL DEFAULT NULL,
  `rewards_punishment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `intro` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rewards_punishment_info
-- ----------------------------
INSERT INTO `rewards_punishment_info` VALUES (1, 1, '旷课惩罚', '因旷课超过40节课惩罚', '2023-03-06 14:53:37');
INSERT INTO `rewards_punishment_info` VALUES (2, 2, '奖学金奖励', '该生于2023年第一学期获得院级奖学金', '2023-03-05 10:38:18');
INSERT INTO `rewards_punishment_info` VALUES (3, 3, '逃课惩罚', '该生于2021年逃课', '2023-03-06 08:40:40');
INSERT INTO `rewards_punishment_info` VALUES (4, 4, '逃课惩罚', '该生于2023年逃课', '2023-04-14 01:29:58');
INSERT INTO `rewards_punishment_info` VALUES (5, 5, '逃课惩罚', '该生于2020年逃课6节', '2023-03-06 08:40:43');
INSERT INTO `rewards_punishment_info` VALUES (6, 6, '奖学金奖励', '该生于2021年第一学期获得校级奖学金', '2023-04-13 23:57:10');
INSERT INTO `rewards_punishment_info` VALUES (7, 7, '旷课惩罚', '因旷课超过40节课惩罚', '2023-03-06 08:40:46');
INSERT INTO `rewards_punishment_info` VALUES (8, 8, '逃课惩罚', '该生于2023年逃课', '2023-04-14 01:30:30');
INSERT INTO `rewards_punishment_info` VALUES (11, 11, '休学惩罚', '该生于2021年休学', '2023-04-13 23:57:49');
INSERT INTO `rewards_punishment_info` VALUES (12, 12, '逃课惩罚', '该生于2023年逃课', '2023-03-06 08:41:04');

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `student_number` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sex` tinyint(6) NULL DEFAULT NULL,
  `major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `college` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `age` int(12) NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (1, '张三1', '2019106040334', 1, '服装设计', '智能制造', 23, '123456');
INSERT INTO `student_info` VALUES (2, '张三2', '2019106040335', 1, '计算机科学与技术', '智能制造学院', 20, '123456');
INSERT INTO `student_info` VALUES (3, '张三3', '2019106040336', 0, '计算机科学与技术', '智能制造学院', 24, '123456');
INSERT INTO `student_info` VALUES (4, '张三4', '2019106040337', 1, '计算机科学与技术', '智能制造学院', 21, '987654');
INSERT INTO `student_info` VALUES (5, '张三5', '2019106040338', 0, '计算机科学与技术', '智能制造学院', 18, '123456');
INSERT INTO `student_info` VALUES (6, '张三6', '2019106040339', 0, '计算机科学与技术', '智能制造学院', 20, '123456');
INSERT INTO `student_info` VALUES (7, '张三7', '2019108830395', 0, '工商管理', '工商学院', 22, '123456');
INSERT INTO `student_info` VALUES (8, '张三8', '2019106040341', 0, '计算机科学与技术', '智能制造学院', 20, '123456');
INSERT INTO `student_info` VALUES (9, '张三9', '2019208040341', 1, '广告设计', '传播学院', 21, '123456');
INSERT INTO `student_info` VALUES (10, '张三10', '2019106040344', 0, '计算机科学与技术', '智能制造学院', 22, '123456');
INSERT INTO `student_info` VALUES (11, '张三11', '2019106040355', 0, '计算机科学与技术', '智能制造学院', 19, '123456');
INSERT INTO `student_info` VALUES (12, '张三12', '2019106040357', 0, '计算机科学与技术', '智能制造学院', 20, '123456');
INSERT INTO `student_info` VALUES (14, '王五', '2019108000000', 0, '中文外教', '外国语学院', 16, '123456');
INSERT INTO `student_info` VALUES (15, '赵六', '2019000123456', 0, '新媒体广告设计', '传播学院', 22, '000000');

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `teacher_number` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `sex` tinyint(6) NOT NULL,
  `age` int(12) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `prof` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `depart` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES (1, '20210506223', '三老师', 0, 30, '123456', '教授', '教务部门');
INSERT INTO `teacher_info` VALUES (2, '20210506224', '李老师', 1, 29, '123456', '教师', '研发部门');
INSERT INTO `teacher_info` VALUES (3, '20210506225', '王老师', 1, 29, '123456', '副教授', '宣传部门');
INSERT INTO `teacher_info` VALUES (4, '20210506226', '赵老师', 0, 35, '123456', '主任', '教务部门');
INSERT INTO `teacher_info` VALUES (5, '20210506227', '互老师', 1, 34, '123456', '教师', '财务部门');
INSERT INTO `teacher_info` VALUES (6, '20210506228', '让老师', 1, 32, '123456', '辅导员', '教务部门');
INSERT INTO `teacher_info` VALUES (7, '20210506229', '三老师', 0, 29, '123456', '教授', '法务部门');
INSERT INTO `teacher_info` VALUES (8, '20210506233', '四老师', 1, 30, '123456', '副教授', '选产部门');
INSERT INTO `teacher_info` VALUES (9, '20210506234', '五老师', 0, 27, '987654', '教授', '研发部门');
INSERT INTO `teacher_info` VALUES (10, '20210506235', '上老师', 1, 33, '123456', '教师', '教务部门');
INSERT INTO `teacher_info` VALUES (11, '20210506236', '与老师', 0, 36, '123456', '主任', '产品部门');
INSERT INTO `teacher_info` VALUES (12, '20210506237', '篇老师', 1, 29, '123456', '教授', '科研部门');
INSERT INTO `teacher_info` VALUES (13, '20190000100', '邓老师', 0, 31, '123456', '辅导员', '法务部门');

SET FOREIGN_KEY_CHECKS = 1;
