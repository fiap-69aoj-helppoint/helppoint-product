CREATE TABLE `color` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `color` (`description`) VALUES ('#ff0000');
INSERT INTO `color` (`description`) VALUES ('#0005d1');
INSERT INTO `color` (`description`) VALUES ('#00af2e');
