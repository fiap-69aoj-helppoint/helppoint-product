CREATE TABLE `color` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(10) NOT NULL,
  `description` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `color` (`name`,`description`) VALUES ('red', 'Vermelho');
INSERT INTO `color` (`name`,`description`) VALUES ('white', 'Branco');
INSERT INTO `color` (`name`,`description`) VALUES ('green', 'Verde');
INSERT INTO `color` (`name`,`description`) VALUES ('blue', 'Azul');