INSERT INTO tb_departamento(name) VALUES ('Gestão');
INSERT INTO tb_departamento(name) VALUES ('AT');

INSERT INTO tb_usuario(departamento_id, name, email) VALUES (1, 'Michele', 'michele@gmail.com');
INSERT INTO tb_usuario(departamento_id, name, email) VALUES (1, 'Adriana', 'adriana@gmail.com');
INSERT INTO tb_usuario(departamento_id, name, email) VALUES (2, 'Filipe', 'filipe@gmail.com');

INSERT INTO tb_agendamentos(usuario_id, data, desc_agendamento) VALUES (1, '2023-07-21', 'Reunião Alinhamento');
INSERT INTO tb_agendamentos(usuario_id, data, desc_agendamento) VALUES (2, '2023-07-21', 'Reunião Alinhamento');
INSERT INTO tb_agendamentos(usuario_id, data, desc_agendamento) VALUES (3, '2023-07-21', 'Reunião Alinhamento');
