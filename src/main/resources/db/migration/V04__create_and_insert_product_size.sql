CREATE TABLE `product_size` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `id_product` BIGINT(20) NOT NULL,
  `id_size` BIGINT(20) NOT NULL,
  `amount` INT(5) NOT NULL,
  PRIMARY KEY (`id`,`id_product`,`id_size`),
  KEY `FK2_product_size_idsize_idx` (`id_size`),
  CONSTRAINT `FK1_product_size_idproduct` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`),
  CONSTRAINT `FK2_product_size_idsize` FOREIGN KEY (`id_size`) REFERENCES `size` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- INSERT INTO `product_size` (`id_product`, `id_size`, `amount`) VALUES ('1', '1', '2');
-- INSERT INTO `product_size` (`id_product`, `id_size`, `amount`) VALUES ('1', '2', '1');
-- INSERT INTO `product_size` (`id_product`, `id_size`, `amount`) VALUES ('2', '3', '1');
-- INSERT INTO `product_size` (`id_product`, `id_size`, `amount`) VALUES ('3', '4', '1');

