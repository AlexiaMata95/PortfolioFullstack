  -- 1) Insertar las habilidades con IDs fijos y nivel por defecto (por ejemplo, nivel 1)
INSERT INTO certificates (name, issuer, year) VALUES
('Fundamentos de computo en Google Cloud', 'Google Cloud Skills Boost', 2025),
('Desarrollo Web Fullstack Java', 'AIFYC Institute, Texas', 2024),
('Desarrollo Web Fullstack JavaScript', ' UCAMP por UTel', 2023),
('Ciberseguridad de Google', 'Google Careers Certificate', 2023),
('Análisis de datos de Google', 'Google Careers Certificate', 2023);

-- 2) Mapear cada certificate a sus categorías (subconsulta para obtener certificate_id)
INSERT INTO certificate_categories (certificate_id, category_id) VALUES
  ((SELECT id FROM certificates WHERE name='Fundamentos de computo en Google Cloud'), 11),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack Java'), 1),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack Java'), 2),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack Java'), 7),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack JavaScript'), 1),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack JavaScript'), 2),
  ((SELECT id FROM certificates WHERE name='Desarrollo Web Fullstack JavaScript'), 7),
  ((SELECT id FROM certificates WHERE name='Ciberseguridad de Google'), 12),
  ((SELECT id FROM certificates WHERE name='Análisis de datos de Google'), 5),
  ((SELECT id FROM certificates WHERE name='Análisis de datos de Google'), 9);