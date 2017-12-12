/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : sryy

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 12/13/2017 00:02:15 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_fish_seaflight`
-- ----------------------------
DROP TABLE IF EXISTS `t_fish_seaflight`;
CREATE TABLE `t_fish_seaflight` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ship_code` varchar(50) DEFAULT NULL,
  `expert_profit_min` decimal(10,0) DEFAULT NULL,
  `expert_profit_max` decimal(10,0) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `departure_time` datetime DEFAULT NULL,
  `over_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_fish_ship`
-- ----------------------------
DROP TABLE IF EXISTS `t_fish_ship`;
CREATE TABLE `t_fish_ship` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ship_code` varchar(50) DEFAULT NULL,
  `ship_type` varchar(20) DEFAULT NULL,
  `ship_period` varchar(20) DEFAULT NULL,
  `ship_amount` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ship_level` varchar(50) DEFAULT NULL,
  `limit_period` int(11) DEFAULT NULL,
  `experience` int(11) DEFAULT NULL,
  `level` varchar(20) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
