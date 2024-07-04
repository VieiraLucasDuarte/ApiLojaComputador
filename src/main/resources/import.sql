INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('Computadores', true);
INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('Hardware', true);
INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('Periféricos', true);
INSERT INTO CATEGORIA (DESCRICAO, ATIVO) VALUES ('Acessórios Gamer', true);


INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Notebooks', false, 1);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Monitores', false, 1);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('PC', false, 1);

INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Coolers', false, 2);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Placas-Mãe', false, 2);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Placa de Vídeo', false, 2);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Memória RAM', false, 2);

INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Mouse', false, 3);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Gabinetes', false, 3);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Teclado', false, 3);

INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('Controles', false, 4);
INSERT INTO SUB_CATEGORIA (DESCRICAO, ATIVO, CATEGORIA_ID) VALUES ('HeadSet', false, 4);

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (2, 'As placas-mãe da série de jogos B550 usam um design de MOSFETs PWM + baixo RDS (on) digital de 5 + 3 fases para oferecer suporte aos processadores AMD Ryzen de 3ª geração, oferecendo incrível precisão no fornecimento de energia aos componentes que mais demandam energia, além de oferecer desempenho aprimorado do sistema.',850.00, true, 77, '../../../assets/imgProduct/placaMaeAMD.jpg');
INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (2, 'Mouse Gamer Logitech G403 HERO com RGB LIGHTSYNC, 6 Botões Programáveis, Ajuste de Peso e Sensor HERO 25K - 910-005631', '','As placas-mãe da série de jogos B550 usam um design de MOSFETs PWM + baixo RDS (on) digital de 5 + 3 fases para oferecer suporte aos processadores AMD Ryzen de 3ª geração.',200.00, true, 89, '../../../assets/imgProduct/mouseG403.jpg');
INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Teclado Mecânico Gamer Redragon Kumara, Anti-Ghosting, LED Vermelho, Switch Outemu Blue, ABNT2, Preto - K552-2 (PT-BLUE)', '','O teclado mais vendido do Brasil! A opção de qualidade, performance e benefício mais escolhida, agora em ABNT2 com o padrão Double Shoot Injection.',139.00, true, 100, '../../../assets/imgProduct/tecladoKumara.png');


INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Computador Gamer Completo 3green, Intel Core I5, 8Gb, SSD 256Gb, Windows 10 - Kit Gamer Com Headset + Monitor 20', '','Computador completo com especificação técnica acima da concorrência',1.138, true, 20, '../../../assets/imgProduct/pcCompleto.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Computador Completo 24 Polegadas, 3green Intel Core I5, 16GB, SSD 512GB', '','Computador completo com especificação técnica acima da concorrência',1.092, true, 20, '../../../assets/imgProduct/segundoPC.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Headset Gamer Redragon Zeus X, Chroma Mk.II, RGB, Surround 7.1, USB, Drivers 53MM, Preto/Vermelho - H510-RGB', '','HeadSet muito bom',249.90, true, 20, '../../../assets/imgProduct/headSet.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Headset Gamer Redragon Lamia 2, RGB, 7.1, 40mm, Suporte Incluso - H320RGB-1', '','HeadSet muito bom',149.90, true, 20, '../../../assets/imgProduct/2headSet.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Mouse com fio USB Logitech M90 com Design Ambidestro e Facilidade Plug and Play - 910-004053', '','Mouse muito bom',28.90, true, 20, '../../../assets/imgProduct/mouse2.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (3, 'Mouse Gamer HyperX Pulsefire Haste RGB, 16000 DPI - 4P5P9AA', '','Mouse muito bom',189.90, true, 20, '../../../assets/imgProduct/mouse3.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (4, 'Controle Sony Dualshock 4 PS4, Sem Fio, Azul - CUH-ZCT2U', '','Controle muito bom',299.90, true, 20, '../../../assets/imgProduct/controleps4.png');
INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (4, 'Controle Microsoft Xbox Carbon Black, Sem Fio, Para Xbox Series X e S, Preto - Qat-00007', '','Controle muito bom',299.90, true, 20, '../../../assets/imgProduct/controleXBOX.png');
INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)VALUES (4, 'Placa de Vídeo RTX 4060 O8G V2 Gaming ATS ASUS NVIDIA GeForce, 8GB GDDR6, DLSS, Ray Tracing, G-Sync - 90YV0JM2-M0NA00', '','Placa de Video DA TOP', 1989.90, true, 20, '../../../assets/imgProduct/4060.png');

INSERT INTO PESSOA (BAIRRO, CELULAR, COMPLEMENTO, CPF, ENDERECO, NOME, LOGIN, SENHA) VALUES ('Floresta', '984279403', 'apt 101', '99999999999', 'guarany', 'Lucas Duarte Vieira','lucas', '123');

insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(1,1,1,1)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(2,1,1,2)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(5,1,1,3)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(3,1,1,4)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(1,1,1,1)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(2,1,1,5)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(1,1,1,10)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(3,1,1,11)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(1,1,1,8)
insert into COMPRA (quantidade, valor, id_pessoa, id_produto) values(4,1,1,6)




