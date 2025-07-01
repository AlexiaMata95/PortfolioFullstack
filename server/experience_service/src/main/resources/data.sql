-- Inserciones en la tabla experience
INSERT INTO experience (id, company, position, date) VALUES
(1, 'Profeco', 'Especialista en administración de recursos', 'Mar 2025 - Actualidad'),
(2, 'Pintacomex', 'Pasante de desarrollo web con JAVA', 'Jul 2024 - Ene 2025'),
(3, 'CONAHCYT', 'Asistente de investigación en Inteligencia Artificial', 'Ene 2022 - Ene 2025');

-- Funciones para Profeco
DELETE FROM experience_functions WHERE experience_id = 1;
INSERT INTO experience_functions (experience_id, function) VALUES
(1, 'Lideré el rediseño de plataformas web institucionales, mejorando la accesibilidad digital y reduciendo los tiempos de carga en un 40%'),
(1, 'Desarrollé una intranet administrativa con autenticación dual, incluyendo una versión ligera para empleados con acceso a servicios clave'),
(1, 'Implementé lector QR y sincronización automática entre intranet y portal del empleado, optimizando la navegación entre sistemas');

-- Funciones para Pintacomex
DELETE FROM experience_functions WHERE experience_id = 2;
INSERT INTO experience_functions (experience_id, function) VALUES
(2, 'Diseñé microservicios de facturación compatibles con CFDI 4.0, mejorando la trazabilidad fiscal en ambientes móviles'),
(2, 'Construí una API de autorización de ventas sobre WhatsApp Graph API, ampliando los canales digitales de compra'),
(2, 'Integré pagos en línea a través de backend Java, mejorando la experiencia del cliente en puntos de venta');

-- Funciones para CONAHCYT
DELETE FROM experience_functions WHERE experience_id = 3;
INSERT INTO experience_functions (experience_id, function) VALUES
(3, 'Optimizé algoritmos de entrenamiento de redes neuronales en MATLAB, reduciendo los tiempos de cómputo en un 30%'),
(3, 'Desarrollé modelos predictivos energéticos avanzados, incrementando la precisión en simulaciones industriales'),
(3, 'Implementé algoritmos bioinspirados personalizados, mejorando la eficiencia de modelos IA en un 15%');
