CREATE TABLE aluno (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	endereco VARCHAR(30),
	telefone VARCHAR(30),
	site VARCHAR(30),
	nota DECIMAL(10,1),
	caminho_foto VARCHAR(250),
	id_cliente BIGINT(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
