/*
 Navicat Premium Data Transfer

 Source Server         : VM-182
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : 192.168.0.182:3306
 Source Schema         : mybatis_design

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 01/08/2020 13:56:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `birthday` datetime(0) NULL DEFAULT NULL COMMENT '生日',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (41, '老王', '2018-02-27 17:47:08', '男', '北京');
INSERT INTO `user` VALUES (42, '小二王', '2018-03-02 15:09:37', '女', '北京金燕龙');
INSERT INTO `user` VALUES (43, '小二王', '2018-03-04 11:34:34', '女', '北京金燕龙');
INSERT INTO `user` VALUES (46, '老王', '2018-03-07 17:37:26', '男', '北京');
INSERT INTO `user` VALUES (48, '小马宝莉', '2018-03-08 11:44:00', '女', '北京修正');

SET FOREIGN_KEY_CHECKS = 1;
