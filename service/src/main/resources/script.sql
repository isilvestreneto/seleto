-- Editais
INSERT INTO edital (id, titulo, descricao, data_inicio, data_fim, criterios_default_aplicados)
VALUES (1, 'Processo Seletivo IFMT 2025', 'Edital para cursos técnicos.', '2025-06-01', '2025-06-30', true),
       (2, 'Vestibular de Inverno 2025', 'Seleção para cursos superiores.', '2025-07-01', '2025-07-31', true);

-- Candidatos
INSERT INTO candidato (id, nome, cpf, data_nascimento, email, telefone, status_inscricao, pontuacao_final)
VALUES (1, 'Alice Souza', '111.222.333-44', '2000-04-15', 'alice@email.com', '(65) 90000-0001', 'PENDENTE', 0.0),
       (2, 'Bruno Lima', '222.333.444-55', '1995-10-30', 'bruno@email.com', '(65) 90000-0002', 'PENDENTE', 0.0),
       (3, 'Carla Mendes', '333.444.555-66', '1988-02-20', 'carla@email.com', '(65) 90000-0003', 'PENDENTE', 0.0),
       (4, 'Daniel Costa', '444.555.666-77', '1999-07-10', 'daniel@email.com', '(65) 90000-0004', 'PENDENTE', 0.0),
       (5, 'Eduarda Freitas', '555.666.777-88', '2002-12-05', 'eduarda@email.com', '(65) 90000-0005', 'PENDENTE', 0.0);
