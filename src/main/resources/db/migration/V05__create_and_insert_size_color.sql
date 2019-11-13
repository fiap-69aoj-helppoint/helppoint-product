CREATE TABLE `size_color` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `id_product_size` BIGINT(20) NOT NULL,
  `name` VARCHAR(10) NOT NULL,
  `amount` INT(5) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK1_size_color_idproductsize` FOREIGN KEY (`id_product_size`) REFERENCES `product_size` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- INSERT INTO `size_color` (`id_size`, `id_color`, `amount`) VALUES ('1', '1', '1');
-- INSERT INTO `size_color` (`id_size`, `id_color`, `amount`) VALUES ('1', '2', '1');
-- INSERT INTO `size_color` (`id_size`, `id_color`, `amount`) VALUES ('2', '2', '1');
-- INSERT INTO `size_color` (`id_size`, `id_color`, `amount`) VALUES ('3', '3', '1');
-- INSERT INTO `size_color` (`id_size`, `id_color`, `amount`) VALUES ('4', '3', '1');