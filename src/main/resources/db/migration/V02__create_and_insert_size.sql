CREATE TABLE `size` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `size` (`description`) VALUES ('P');
INSERT INTO `size` (`description`) VALUES ('M');
INSERT INTO `size` (`description`) VALUES ('G');