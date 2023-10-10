-- vizualizar pessoas
SELECT * FROM tb_pessoa;
SELECT nome, fone FROM tb_pessoa;
SELECT cod_pessoa, fone, nome, email FROM tb_pessoa;
SELECT nome, email FROM tb_pessoa WHERE nome LIKE '%O' ; -- filtra pela ultima letra
SELECT nome, email FROM tb_pessoa WHERE nome LIKE 'B%' ; -- filtra pela primeira letra
SELECT nome, email FROM tb_pessoa WHERE email LIKE '%gmail%' ; -- filtra caso apareça em qq lugar
SELECT nome, email FROM tb_pessoa WHERE nome LIKE 'P%' OR nome LIKE 'M%' ; -- filtra plural
SELECT nome, email FROM tb_pessoa WHERE nome LIKE 'M%' AND email LIKE '%@gmail%' ;






-- cadastrar pessoas manualmente
-- comando INSERT
INSERT INTO tb_pessoa
(nome, fone, email) VALUES
('Bruno', '11949681849', 'brunogd148@gmail.com');
INSERT INTO tb_pessoa
(nome, fone, email) VALUES
('Pedro', '543345684', 'pedro23434423@gmail.com');

-- CREATE TABLE tb_pessoa(
	-- cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    -- nome VARCHAR(200) NOT NULL,
	-- fone VARCHAR(200) NULL,
    -- email VARCHAR(200) NOT NULL
-- );

-- USE 23232_usjt_psc_pessoas;
-- CREATE DATABASE 23232_usjt_psc_pessoas;