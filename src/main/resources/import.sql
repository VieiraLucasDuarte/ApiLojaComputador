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

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
VALUES (2, 'Placa Mãe Gigabyte B550M Aorus Elite, AMD AM4, Micro ATX, DDR4', '','O G403 entra no ringue com a nova geração do sensor HERO 25K. Prepare-se para um mouse com rastreamento 1:1 no próximo nível, faixa de sensibilidade de 100-25.600 DPI, além de suavização, filtragem e aceleração nulas.',850.00, true, 77, '../../../assets/imgProduct/placaMaeAMD.jpg');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (2, 'Mouse Gamer Logitech G403 HERO com RGB LIGHTSYNC, 6 Botões Programáveis, Ajuste de Peso e Sensor HERO 25K - 910-005631', '',
   'As placas-mãe da série de jogos B550 usam um design de MOSFETs PWM + baixo RDS (on) digital de 5 + 3 fases para oferecer suporte aos processadores AMD Ryzen de 3ª geração.',
    200.00, true, 89, '../../../assets/imgProduct/mouseG403.jpg');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Teclado Mecânico Gamer Redragon Kumara, Anti-Ghosting, LED Vermelho, Switch Outemu Blue, ABNT2, Preto - K552-2 (PT-BLUE)', '',
   'O teclado mais vendido do Brasil! A opção de qualidade, performance e benefício mais escolhida, agora em ABNT2 com o padrão Double Shoot Injection.',
    139.99, true, 100, '../../../assets/imgProduct/tecladoKumara.png');


INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Computador Gamer Completo 3green, Intel Core I5, 8Gb, SSD 256Gb, Windows 10 - Kit Gamer Com Headset + Monitor 20', '',
   'Computador completo com especificação técnica acima da concorrência',
    1.138, true, 20, '../../../assets/imgProduct/pcCompleto.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Computador Completo 24 Polegadas, 3green Intel Core I5, 16GB, SSD 512GB', '',
   'Computador completo com especificação técnica acima da concorrência',
    1.092, true, 20, '../../../assets/imgProduct/segundoPC.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Headset Gamer Redragon Zeus X, Chroma Mk.II, RGB, Surround 7.1, USB, Drivers 53MM, Preto/Vermelho - H510-RGB', '',
   'HeadSet muito bom',
    249.90, true, 20, '../../../assets/imgProduct/headSet.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Headset Gamer Redragon Lamia 2, RGB, 7.1, 40mm, Suporte Incluso - H320RGB-1', '',
   'HeadSet muito bom',
    149.90, true, 20, '../../../assets/imgProduct/2headSet.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Mouse com fio USB Logitech M90 com Design Ambidestro e Facilidade Plug and Play - 910-004053', '',
   'Mouse muito bom',
    28.90, true, 20, '../../../assets/imgProduct/mouse2.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (3, 'Mouse Gamer HyperX Pulsefire Haste RGB, 16000 DPI - 4P5P9AA', '',
   'Mouse muito bom',
    189.90, true, 20, '../../../assets/imgProduct/mouse3.png');

INSERT INTO PRODUTO (CATEGORIA_ID, NOME, Descricao_Curta, Descricao_Longa, valor, promocao, quantidade, imagem)
  VALUES (4, 'Controle Sony Dualshock 4 PS4, Sem Fio, Azul - CUH-ZCT2U', '',
   'Controle muito bom',
    299.90, true, 20, '../../../assets/imgProduct/controleps4.png');

INSERT INTO PESSOA (LOGIN, SENHA) VALUES ('lucas', '123')

