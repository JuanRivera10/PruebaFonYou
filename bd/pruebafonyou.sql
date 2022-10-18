-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-10-2022 a las 05:46:40
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebafonyou`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `id` int(10) UNSIGNED NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Ciudad` varchar(100) DEFAULT NULL,
  `id_estudiante` int(11) DEFAULT NULL,
  `id_zonah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id`, `Nombre`, `Edad`, `Ciudad`, `id_estudiante`, `id_zonah`) VALUES
(5, 'Juan', 23, 'Bogota', 1, 1),
(6, 'Lionel', 32, 'Buenos Aires', 2, 2),
(7, 'Marck', 28, 'Bangkok', 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen`
--

CREATE TABLE `examen` (
  `id` int(10) UNSIGNED NOT NULL,
  `Pregunta1` varchar(250) DEFAULT NULL,
  `Pregunta2` varchar(250) DEFAULT NULL,
  `Pregunta3` varchar(100) DEFAULT NULL,
  `Pregunta4` varchar(250) DEFAULT NULL,
  `id_examen` int(11) DEFAULT NULL,
  `id_zonah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `examen`
--

INSERT INTO `examen` (`id`, `Pregunta1`, `Pregunta2`, `Pregunta3`, `Pregunta4`, `id_examen`, `id_zonah`) VALUES
(10, 'Capital de colombia', 'Por que se caracteriza colombia', 'Maximo goleador de la seleccion colombia', 'Ave representativa de colombia', 1, 1),
(11, 'Capital de Aregentina', 'Por que se caracteriza Aregentina', 'Maximo goleador de la seleccion Aregentina', 'Presidente de Aregentina', 2, 2),
(12, 'Que moneda se usa en Bangkok', 'Presidente de Bangkok', 'A que pais pertenece Bangkok', 'Comida tipica de Bangkok', 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestasestudiante`
--

CREATE TABLE `respuestasestudiante` (
  `id` int(10) UNSIGNED NOT NULL,
  `Respuesta1` varchar(250) DEFAULT NULL,
  `Respuesta2` varchar(250) DEFAULT NULL,
  `Respuesta3` varchar(250) DEFAULT NULL,
  `Respuesta4` varchar(250) DEFAULT NULL,
  `idEstudiante` int(11) DEFAULT NULL,
  `idExamen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestasexamen`
--

CREATE TABLE `respuestasexamen` (
  `id` int(10) UNSIGNED NOT NULL,
  `Respuesta1` varchar(250) DEFAULT NULL,
  `Respuesta2` varchar(250) DEFAULT NULL,
  `Respuesta3` varchar(100) DEFAULT NULL,
  `Respuesta4` varchar(250) DEFAULT NULL,
  `id_examen` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuestasexamen`
--

INSERT INTO `respuestasexamen` (`id`, `Respuesta1`, `Respuesta2`, `Respuesta3`, `Respuesta4`, `id_examen`) VALUES
(14, 'Bogota', 'Cafe', 'Falcao', 'Condor', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zonahoraria`
--

CREATE TABLE `zonahoraria` (
  `id` int(10) UNSIGNED NOT NULL,
  `idZonaH` int(11) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `zonahoraria`
--

INSERT INTO `zonahoraria` (`id`, `idZonaH`, `Descripcion`) VALUES
(1, 1, '(UTC-05:00) Bogotá, Lima, Quito\" a \"(UTC-05:00) Bogotá, Lima, Quito, Rio Branco'),
(2, 2, 'Zona horaria de Buenos Aires, Argentina (GMT-3)'),
(3, 3, 'Zona horaria de Bangkok, Tailandia (GMT+7)');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_zonah` (`id_zonah`),
  ADD KEY `id_zonah_2` (`id_zonah`);

--
-- Indices de la tabla `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `respuestasestudiante`
--
ALTER TABLE `respuestasestudiante`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `respuestasexamen`
--
ALTER TABLE `respuestasexamen`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `zonahoraria`
--
ALTER TABLE `zonahoraria`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idZonaH` (`idZonaH`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `examen`
--
ALTER TABLE `examen`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `respuestasestudiante`
--
ALTER TABLE `respuestasestudiante`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `respuestasexamen`
--
ALTER TABLE `respuestasexamen`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `zonahoraria`
--
ALTER TABLE `zonahoraria`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
