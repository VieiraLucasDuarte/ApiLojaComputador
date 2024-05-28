INSERT INTO CATEGORIA (DESCRICAO, ATIVO) values ('CATEGORIA PC', true);

INSERT INTO CATEGORIA (DESCRICAO, ATIVO) values ('HARDWARE', true);

INSERT INTO CATEGORIA (DESCRICAO, ATIVO) values ('PERIFERICO', true);

INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('subacategoria', false, 1);


INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade) values (1, 'Computador', 'Computador bem do top', 'Computador gigantesco', 10.0, true, 100);

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade) values (1, 'TECLADO', 'teclado do luz', 'teclado com luz bem grande', 10.0, true, 100);



