CREATE TABLE `size_color` (
  `id_size` BIGINT(20) NOT NULL,
  `id_color` BIGINT(20) NOT NULL,
  `amount` INT(5) NOT NULL,
  PRIMARY KEY (`id_size`,`id_color`),
  KEY `FK2_size_color_idcolor_idx` (`id_color`),
  CONSTRAINT `FK1_size_color_idsize` FOREIGN KEY (`id_size`) REFERENCES `size` (`id`),
  CONSTRAINT `FK2_size_color_idcolor` FOREIGN KEY (`id_color`) REFERENCES `color` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
