CREATE TABLE pessoa(
	id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50),
  idade INT
);

CREATE TABLE gondola(
cadeira INT AUTO_INCREMENT PRIMARY KEY,
assento1 INT,
assento2 INT,
FOREIGN KEY (assento1) REFERENCES pessoa(id_pessoa),
FOREIGN KEY (assento2) REFERENCES pessoa(id_pessoa)
);

INSERT INTO pessoa(nome, idade) VALUES("carla", 10);
INSERT INTO pessoa(nome, idade) VALUES("pedro", 35);
INSERT INTO pessoa(nome, idade) VALUES("ana",15);
INSERT INTO gondola(assento1, assento2) VALUES (2,3);

SELECT * FROM pessoa;
SELECT * FROM gondola;
