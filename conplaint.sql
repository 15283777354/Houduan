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

 Date: 01/01/2020 19:28:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for conplaint
-- ----------------------------
DROP TABLE IF EXISTS `conplaint`;
CREATE TABLE `conplaint`  (
  `order` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增，单号',
  `dormitory` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '寝室号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `item` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`order`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of conplaint
-- ----------------------------
INSERT INTO `conplaint` VALUES (1, '4111', '赵德强', '110', '灯', '灯每天晚上是一闪一闪的');
INSERT INTO `conplaint` VALUES (2, '4111', '小杭', '110110', '灯', '爆了');

SET FOREIGN_KEY_CHECKS = 1;
