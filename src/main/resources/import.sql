INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('CATEGORIA PC', true);

INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('HARDWARE', true);

INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('PERIFERICO', true);

INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('subacategoria', false, 1);


INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem) VALUES (1, 'Computador', 'Computador bem do top', 'Computador gigantesco', 10.0, true, 100, '../../../assets/imgProduct/pcCompleto.jpg');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem) VALUES (2, 'TECLADO', 'teclado do luz', 'teclado com luz bem grande', 10.0, true, 100, '../../../assets/imgProduct/pcCompleto.jpg');



INSERT INTO PESSOA (NOME, SENHA) VALUES ('lucas', '123')

