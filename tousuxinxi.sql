/*
 Navicat Premium Data Transfer

 Source Server         : YUHANG
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : qinshibaoxiu

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 19:28:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tousuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `tousuxinxi`;
CREATE TABLE `tousuxinxi`  (
  `orders` int(11) NOT NULL,
  `dormitory` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `item` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`orders`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tousuxinxi
-- ----------------------------
INSERT INTO `tousuxinxi` VALUES (1, '1111', '灯', '爆了');
INSERT INTO `tousuxinxi` VALUES (7, '4111', '灯', '有点烂');
INSERT INTO `tousuxinxi` VALUES (12, '1122', '床', '烂了');

SET FOREIGN_KEY_CHECKS = 1;
