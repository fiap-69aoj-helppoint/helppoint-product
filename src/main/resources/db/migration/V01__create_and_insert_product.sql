CREATE SCHEMA [IF NOT EXISTS] helppoint-product;

CREATE TABLE `product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(200) NOT NULL,
  `image` VARCHAR(250) NULL,
  `value` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Camiseta polo', '/assets/camisa-polo.jpg', '55.40');
INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Calça jeans', '/assets/jeans.jpg', '33.20');
INSERT INTO `product` (`description`, `image`, `value`) VALUES ('Jaqueta com capuz', '/assets/casaco.jpg', '1250.99');