-- Crear base de datos
CREATE DATABASE IF NOT EXISTS db_tienda;
USE db_tienda;

-- Crear tabla de productos
CREATE TABLE IF NOT EXISTS products (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price DOUBLE NOT NULL,
  price_formatted VARCHAR(50),
  description VARCHAR(500),
  image VARCHAR(255)
);

-- Insertar productos iniciales
INSERT INTO products (name, price, price_formatted, description, image) VALUES
('Taza de gato negro', 2990, '$2.990', 'Taza de gato negro', 'taza1.jpg'),
('Hervidor generico', 12500, '$12.500', 'hervidor de agua generico y economico', 'hervidor1.webp'),
('Mouse Inalambrico', 20000, '$20.000', 'Mouse inalambrico con buena precision', 'mouse.webp'),
('Tostador Manual', 1900, '$1.900', 'Tostador manual para pan', 'tostador.webp'),
('USB Sandisk', 5000, '$5.000', 'USB SanDisk de 64GB', 'usb.avif'),
('Sanduchera Eléctrica', 12000, '$12.000', 'sanduchera electrica para preparar ricos sándwiches', 'sandwich.webp'),
('Disco Duro Toshiba', 44990, '$44.990', 'Disco Duro de 4TB', 'discoduro.webp'),
('Lapicero de madera', 25000, '$25.000', 'Lapicero de madera', 'lapicero.jpg'),
('Libro de Español', 9900, '$9.900', 'Libro de Español - todo en uno para dummies', 'libro.jpg'),
('Sombrero Aus', 17900, '$17.900', 'Sombrero Aus', 'SombreroAus.avif'),
('Teclado Mecánico', 24900, '$24.900', 'Teclado negro gamer mecánico', 'teclado.jpg'),
('Plancha a Vapor', 22000, '$22.000', 'Plancha a Vapor', 'plancha.jpg');
