INSERT INTO categories (name) VALUES
  ('Frontend'),
  ('Backend'),
  ('Databases'),
  ('Data Science'),
  ('Artificial Intelligence'),
  ('Soft Skills'),
  ('Programming Languages'),
  ('Testing'),
  ('Machine Learning'),
  ('Scientific Research');

  -- 1) Insertar las habilidades con IDs fijos y nivel por defecto (por ejemplo, nivel 1)
INSERT INTO skills (name, level) VALUES
  ('Java',                                                          'Avanzado'),
  ('Spring Boot',                                                   'Avanzado'),
  ('MySql',                                                         'Intermedio'),
  ('PostgreSQL',                                                    'Intermedio'),
  ('MongoDB',                                                       'Avanzado'),
  ('Inglés B2 (TOEFL 523)',                                         'Avanzado'),
  ('JavaScript',                                                    'Avanzado'),
  ('React',                                                         'Avanzado'),
  ('NodeJS',                                                        'Intermedio'),
  ('Google Cloud Platform',                                         'Intermedio'),
  ('JUnit',                                                         'Intermedio'),
  ('Mockito',                                                       'Intermedio'),
  ('Análisis de datos',                                             'Avanzado'),
  ('Automatización con Python',                                     'Intermedio'),
  ('Desarrollo de Redes Neuronales Artificiales y modelos de IA',   'Avanzado'),
  ('Atención al detalle',                                           'Avanzado'),
  ('Comunicación',                                                  'Avanzado'),
  ('Trabajo en equipo',                                             'Intermedio'),
  ('Investigación científica',                                      'Avanzado'),
  ('Manejo del estrés',                                             'Avanzado'),
  ('Inteligencia emocional',                                        'Avanzado'),
  ('Matlab',                                                        'Avanzado'),  
  ('PHP',                                                           'Intermedio');

-- 2) Mapear cada skill a sus categorías (subconsulta para obtener skill_id)
INSERT INTO skill_categories (skill_id, category_id) VALUES
  ((SELECT id FROM skills WHERE name='Java'),                   7),  -- Programming Languages
  ((SELECT id FROM skills WHERE name='Java'),                   2),  -- Backend
  ((SELECT id FROM skills WHERE name='Spring Boot'),            2),  -- Backend
  ((SELECT id FROM skills WHERE name='MySql'),                  3),  -- Databases
  ((SELECT id FROM skills WHERE name='PostgreSQL'),             3),  -- Databases
  ((SELECT id FROM skills WHERE name='MongoDB'),                3),  -- Databases
  ((SELECT id FROM skills WHERE name='Inglés B2 (TOEFL 523)'),  6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='JavaScript'),             1),  -- Frontend
  ((SELECT id FROM skills WHERE name='JavaScript'),             2),  -- Backend
  ((SELECT id FROM skills WHERE name='JavaScript'),             7),  -- Programming Languages
  ((SELECT id FROM skills WHERE name='React'),                  1),  -- Frontend
  ((SELECT id FROM skills WHERE name='NodeJS'),                 2),  -- Backend
  ((SELECT id FROM skills WHERE name='Google Cloud Platform'),  2),  -- Backend
  ((SELECT id FROM skills WHERE name='JUnit'),                  8),  -- Testing
  ((SELECT id FROM skills WHERE name='Mockito'),                8),  -- Testing
  ((SELECT id FROM skills WHERE name='Análisis de datos'),      4),  -- Data Science
  ((SELECT id FROM skills WHERE name='Automatización con Python'),4),-- Data Science
  ((SELECT id FROM skills WHERE name='Desarrollo de Redes Neuronales Artificiales y modelos de IA'),5),  -- Artificial Intelligence
  ((SELECT id FROM skills WHERE name='Atención al detalle'),    6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='Comunicación'),           6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='Trabajo en equipo'),      6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='Investigación científica'),10),-- Scientific Research
  ((SELECT id FROM skills WHERE name='Manejo del estrés'),      6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='Inteligencia emocional'), 6),  -- Soft Skills
  ((SELECT id FROM skills WHERE name='Matlab'),                 7),  -- Programming Languages
  ((SELECT id FROM skills WHERE name='Matlab'),                 4),  -- Data Science
  ((SELECT id FROM skills WHERE name='PHP'),                    7),  -- Programming Languages
  ((SELECT id FROM skills WHERE name='PHP'),                    2);  -- Backend