/*
Navicat MySQL Data Transfer

Source Server         : 127
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : user_manage

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2014-10-16 09:33:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小张', '北京路120号', '13678909871');
INSERT INTO `user` VALUES ('2', '小王', '天津路230号', '13578909876');
INSERT INTO `user` VALUES ('3', '小李', '上海路280号', '13987654569');
INSERT INTO `user` VALUES ('4', '小周', '广州路380号', '13689098765');
INSERT INTO `user` VALUES ('5', '小红', '成都路370号', '13689008705');
