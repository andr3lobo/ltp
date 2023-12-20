create database admsalas;
use admsalas;

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
    retirada VARCHAR(45) NULL,
    devolucao VARCHAR(45) NULL,
    professor_id INT NOT NULL,
    FOREIGN KEY(professor_id) REFERENCES professor(id),
    sala_num INT NOT NULL,
    FOREIGN KEY(sala_num) REFERENCES sala(numero)
);

