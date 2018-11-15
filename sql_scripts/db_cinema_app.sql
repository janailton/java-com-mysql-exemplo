-- phpMyAdmin SQL Dump
-- version 4.0.10.20
-- https://www.phpmyadmin.net
--
-- Máquina: 127.0.0.1
-- Data de Criação: 30-Out-2018 às 17:27
-- Versão do servidor: 5.5.55
-- versão do PHP: 5.4.45

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `db_cinema_app`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_movies`
--

CREATE TABLE IF NOT EXISTS `tb_movies` (
  `id_movie` int(11) NOT NULL,
  `mov_title` varchar(50) NOT NULL,
  `mov_rating` varchar(8) NOT NULL,
  `mov_list_cine_is_playing` int(10) NOT NULL,
  `mov_show_time_1` datetime NOT NULL,
  `mov_show_time_2` datetime NOT NULL,
  `mov_show_time_3` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
