-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2020 a las 23:11:09
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `controlecolar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adminis`
--

CREATE TABLE `adminis` (
  `id` int(10) NOT NULL,
  `ApellidoP` varchar(30) NOT NULL,
  `ApellidoM` varchar(30) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `FechaNacimiento` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `RFC` varchar(18) NOT NULL,
  `Sexo` varchar(15) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `CedulaProfe` varchar(15) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `FolioEmpleado` int(15) NOT NULL,
  `Hentrada` varchar(5) NOT NULL,
  `Hsalida` varchar(5) NOT NULL,
  `Puesto` varchar(20) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `adminis`
--

INSERT INTO `adminis` (`id`, `ApellidoP`, `ApellidoM`, `Nombre`, `FechaNacimiento`, `CURP`, `RFC`, `Sexo`, `Telefono`, `CedulaProfe`, `Direccion`, `FolioEmpleado`, `Hentrada`, `Hsalida`, `Puesto`, `Correo`, `Contraseña`) VALUES
(1, 'Reunel', 'Tolkien', 'Gandalf', '03/01/1892', '123456789012345678', '12345678', 'Hombre', 12345, '4r5g', 'Londres', 1, '2:00', '3:00', 'Director', 'Tolkien@gandalf.com', 'hobit123'),
(2, 'Escutia', 'Ceja', 'Elkevin', '15/01/2000', 'EUCK11587654', '15151515', 'Hombre', 72913, 'SIMONA', 'Doroteo', 2, '2:00', '3:00', 'SubDirector', 'Tolkien@gandalf.com', 'gnomo115'),
(3, 'Garduño', 'Fernandez', 'Zelda', '04/10/2000', '287567934795678329', '0000000', 'Mujer', 722453, 'FEDG104', 'Santiago', 3, '2:00', '3:00', 'SubDirector', 'Daniela@gmail.com', 'yonas200');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(10) NOT NULL,
  `Grado` int(2) NOT NULL,
  `Grupo` varchar(5) NOT NULL,
  `ApellidoP` varchar(20) NOT NULL,
  `ApellidoM` varchar(20) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `fechaNacimiento` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `sexo` int(15) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `NomMadre` varchar(40) NOT NULL,
  `NomPadre` varchar(40) NOT NULL,
  `FolioAlumno` int(10) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `contrasenia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificaciones`
--

CREATE TABLE `calificaciones` (
  `id` int(11) NOT NULL,
  `id_Alumno` int(11) NOT NULL,
  `id_Materia` int(11) NOT NULL,
  `Calificacion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contadorreg`
--

CREATE TABLE `contadorreg` (
  `id` int(11) NOT NULL,
  `adminis` int(11) NOT NULL,
  `alumnos` int(11) NOT NULL,
  `profesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contadorreg`
--

INSERT INTO `contadorreg` (`id`, `adminis`, `alumnos`, `profesor`) VALUES
(0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `id` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `grado` int(10) NOT NULL,
  `grupo` varchar(10) NOT NULL,
  `horaI` int(11) NOT NULL,
  `horaF` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `id` int(11) NOT NULL,
  `Grado` int(11) NOT NULL,
  `Grupo` varchar(10) NOT NULL,
  `Nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `id` int(11) NOT NULL,
  `Grado` int(5) NOT NULL,
  `Grupo` varchar(5) NOT NULL,
  `ApellidoP` varchar(20) NOT NULL,
  `ApellidoM` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `fechaNacimiento` varchar(10) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `CedulaProf` varchar(15) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `RFC` varchar(18) NOT NULL,
  `Hentrada` varchar(5) NOT NULL,
  `Hsalida` varchar(5) NOT NULL,
  `Correo` varchar(20) NOT NULL,
  `Contrasenia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `adminis`
--
ALTER TABLE `adminis`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `calificaciones`
--
ALTER TABLE `calificaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
