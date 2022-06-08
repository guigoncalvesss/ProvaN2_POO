SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


DROP SCHEMA IF EXISTS `Vendaspoo` ;


CREATE SCHEMA IF NOT EXISTS `Vendaspoo` ;
USE `Vendaspoo` ;


DROP TABLE IF EXISTS `lojadb`.`produto` ;

CREATE TABLE IF NOT EXISTS `vendaspoo`.`produto` (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NULL,
  valorUnitario double,
  tipoUnidade VARCHAR(30),
  qtdEstoque int,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
insert into produto(nome,valorUnitario,tipoUnidade,qtdEstoque) values('Pao',15.0,'kilo',30);
select *from produto where id=1; 


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
