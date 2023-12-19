create database admsalas;
use admsalas;
show tables;

CREATE TABLE professor (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (45),
    senha VARCHAR(45)
	);
    
CREATE TABLE sala (
	numero INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(45) NOT NULL, 
    disponivel BIT NOT NULL 
);

CREATE TABLE acessos(
	id INT PRIMARY KEY AUTO_INCREMENT,
    retirada DATE NOT NULL,
    devolucao DATE NOT NULL,
    professor_id INT NOT NULL,
    FOREIGN KEY(professor_id) REFERENCES professor(id),
    sala_num INT NOT NULL,
    FOREIGN KEY(sala_num) REFERENCES sala(numero)
);

select * from sala;
select * from professor;

ALTER TABLE acessos MODIFY COLUMN devolucao VARCHAR(45) NULL;

select * from acessos;

ALTER TABLE acessos MODIFY COLUMN retirada VARCHAR(45) NULL;