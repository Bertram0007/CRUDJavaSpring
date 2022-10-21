

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `last_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `salary` decimal(10, 4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `employee` VALUES (2, 'Lewis', 'Burson', 40700.0000);
INSERT INTO `employee` VALUES (3, 'Ian', 'Malcolm', 70000.0000);
INSERT INTO `employee` VALUES (4, 'Ellie', 'Sattler', 102000.0000);
INSERT INTO `employee` VALUES (5, 'Dennis', 'Nedry', 52000.0000);
INSERT INTO `employee` VALUES (6, 'John', 'Hammond', 89600.0000);
INSERT INTO `employee` VALUES (7, 'Ray', 'Arnold', 45000.0000);
INSERT INTO `employee` VALUES (8, 'Laura', 'Burnett', 80000.0000);
