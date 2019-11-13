CREATE TABLE `product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(200) NOT NULL,
  `image` VARCHAR(250) NULL,
  `value` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Camiseta polo', null, '55.40');
INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Calça jeans', null, '33.20');
INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Jaqueta com capuz', null, '1250.99');