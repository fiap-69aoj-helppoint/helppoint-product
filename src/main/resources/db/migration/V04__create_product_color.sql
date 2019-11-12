CREATE TABLE `product_color` (
  `id_product` BIGINT(20) NOT NULL,
  `id_color` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id_product`,`id_color`),
  KEY `FK2_product_color_idcolor_idx` (`id_color`),
  CONSTRAINT `FK1_product_color_idproduct` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`),
  CONSTRAINT `FK2_product_color_idcolor` FOREIGN KEY (`id_color`) REFERENCES `color` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
