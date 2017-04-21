-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2017 at 04:53 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_buku`
--

-- --------------------------------------------------------

--
-- Table structure for table `comic`
--

CREATE TABLE IF NOT EXISTS `comic` (
  `no_id` char(10) NOT NULL,
  `judul_comic` char(40) NOT NULL,
  `pengarang` char(40) NOT NULL,
  `penerbit` char(40) NOT NULL,
  `harga` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comic`
--

INSERT INTO `comic` (`no_id`, `judul_comic`, `pengarang`, `penerbit`, `harga`) VALUES
('3301', 'Death Note', 'Kai Shinigami', 'Manga Comic', '39000'),
('3302', 'Naruto', 'Masashi Kimi', 'Elex Media Komputindo', '35000'),
('3303', 'Detective Conan', 'Osashi Mushi', 'Onizuka Tokyo', '42000'),
('3304', 'Doraemon', 'Fujiko F. Fujio', 'Elex Media Komputindo', '36000'),
('3305', 'Samurai X', 'Takeru Akagi', 'Okunimaru', '34000');

-- --------------------------------------------------------

--
-- Table structure for table `majalah`
--

CREATE TABLE IF NOT EXISTS `majalah` (
  `no_id` char(10) NOT NULL,
  `judul_majalah` char(40) NOT NULL,
  `penerbit` char(40) NOT NULL,
  `majalah_untuk` char(15) NOT NULL,
  `harga` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `majalah`
--

INSERT INTO `majalah` (`no_id`, `judul_majalah`, `penerbit`, `majalah_untuk`, `harga`) VALUES
('2201', 'majalah BOBO', 'Little Brown', 'anak-anak', '5000'),
('2203', 'Kidz Magazine', 'Yellow Jersey', 'anak-anak', '15000'),
('2204', 'majalah Socialite', 'Harmish Hilt', 'remaja', '17000'),
('2202', 'majalah GAUL', 'Velicya Putry', 'remaja', '10000');

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE IF NOT EXISTS `module` (
  `no_id` char(10) NOT NULL,
  `judul_buku` char(40) NOT NULL,
  `dosen_MK` char(40) NOT NULL,
  `module` char(40) NOT NULL,
  `harga` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`no_id`, `judul_buku`, `dosen_MK`, `module`, `harga`) VALUES
('1101', 'Undirected Graf', 'Sussy S.W', 'Matematika Diskrit', '38000'),
('1103', 'Multy Prosses', 'Tedjo Darmanto', 'System Operasi', '41000'),
('1104', 'Gerbang Logic', 'Aswan, MSI', 'Arsitektur Computer', '50000'),
('1102', 'Java Visual Object', 'Aan Dwianta', 'Pemograman III', '45000'),
('1105', 'User Interface', 'Dani Eka S.', 'Pengenalan Game', '37000'),
('1106', 'Matrixs 2 variable', 'Tedjo Darmanto', 'Logika Informatika', '41000'),
('1107', 'Data Array', 'Khoiridah H.S', 'Algoritma', '48000');

-- --------------------------------------------------------

--
-- Table structure for table `novel`
--

CREATE TABLE IF NOT EXISTS `novel` (
  `no_id` char(10) NOT NULL,
  `judul_novel` char(40) NOT NULL,
  `pengarang` char(40) NOT NULL,
  `penerbit` char(40) NOT NULL,
  `harga` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `novel`
--

INSERT INTO `novel` (`no_id`, `judul_novel`, `pengarang`, `penerbit`, `harga`) VALUES
('4401', 'Silent Hill', 'James Kynge', 'Sphere', '35000'),
('4402', 'Twilight Breaking Down', 'Elizabeth Noble', 'Time Warner Books', '50000'),
('4403', 'Alone In the Dark', 'Jeno Barcsay', 'DoubleDay', '30000'),
('4404', 'Land of the Dead', 'Steve Bloom', 'BlomsBurry', '35000');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE IF NOT EXISTS `pembayaran` (
  `no_id` char(10) NOT NULL,
  `nama` char(40) NOT NULL,
  `tgl_pinjam` char(40) NOT NULL,
  `tgl_kembali` char(40) NOT NULL,
  `total_biaya` char(45) NOT NULL,
  `bayar` char(15) NOT NULL,
  `sisa_biaya` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`no_id`, `nama`, `tgl_pinjam`, `tgl_kembali`, `total_biaya`, `bayar`, `sisa_biaya`) VALUES
(' 1102024', 'zza ibliizt', '22 January 2013', '02 February 2015', '184000', '184000', '[ LUNAS ]'),
(' 1101018', 'perdiana', '02 Maret 2012', '02 February 2015', '77000', '100000', '23000,-'),
(' 1102027', 'jaenudin mz', '05 Mey 2012', '06 Mey 2012', '182000', '168000', '-14000,-'),
(' 1102024', 'reza gilang pradana', '08 January 2013', '09 January 2013', '150000', '150000', '[ LUNAS ]'),
(' 696', 'onizuka', '07 July 2010', '05 Maret 2011', '198000', '200000', '2000,-');

-- --------------------------------------------------------

--
-- Table structure for table `sewa_buku`
--

CREATE TABLE IF NOT EXISTS `sewa_buku` (
  `id_buku` char(10) NOT NULL,
  `judul_buku` char(40) NOT NULL,
  `harga` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sewa_buku`
--

INSERT INTO `sewa_buku` (`id_buku`, `judul_buku`, `harga`) VALUES
('3301', 'Death Note', '39000');

-- --------------------------------------------------------

--
-- Table structure for table `tgl_kembali`
--

CREATE TABLE IF NOT EXISTS `tgl_kembali` (
  `no_id` char(10) NOT NULL,
  `nama` char(40) NOT NULL,
  `id_buku` char(40) NOT NULL,
  `judul_buku` char(40) NOT NULL,
  `date` char(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tgl_kembali`
--

INSERT INTO `tgl_kembali` (`no_id`, `nama`, `id_buku`, `judul_buku`, `date`) VALUES
(' 1102024', 'zza ibliizt', '3301', 'Death Note', '02 February 2015'),
(' 1101018', 'perdiana', '1101', 'Undirected Graf', '03 April 2013'),
(' 1102027', 'jaenudin mz', '1102', 'Java Visual Object', '06 Mey 2012'),
(' 1102024', 'reza gilang pradana', '4401', 'Silent Hill', '09 January 2013'),
(' 696', 'onizuka', '1102', 'Java Visual Object', '05 Maret 2011'),
(' 1130', 'Riki', '3301', 'Death Note', 'tgl February 2010');

-- --------------------------------------------------------

--
-- Table structure for table `tgl_pinjam`
--

CREATE TABLE IF NOT EXISTS `tgl_pinjam` (
  `no_id` char(10) NOT NULL,
  `nama` char(40) NOT NULL,
  `telp` char(15) NOT NULL,
  `alamat` char(50) NOT NULL,
  `jenis_kelamin` char(15) NOT NULL,
  `date` char(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tgl_pinjam`
--

INSERT INTO `tgl_pinjam` (`no_id`, `nama`, `telp`, `alamat`, `jenis_kelamin`, `date`) VALUES
(' 1102024', 'zza ibliizt', ' 085624340666', '02 - 02 no. 02', 'pria', '22 January 2013'),
(' 696', 'shinigami', ' 696', '696', 'pria', '06 Juny 2015'),
(' 1101018', 'perdiana', ' 089656387666', 'jl.cisaranten wetan', 'pria', '02 Maret 2012'),
(' 1102027', 'jaenudin mz', ' 08527348134', 'Jln. suka asih', 'pria', '05 Mey 2012'),
(' 1102024', 'reza gilang pradana', ' 085624340666', 'Jln. sukapura 02 / 02 no. 02', 'pria', '08 January 2013'),
(' 696', 'onizuka', ' 696', 'Hell', 'pria', '07 July 2010'),
('', '', '', '', 'wanita', '03 - bulan - 2015'),
(' 1130', 'Riki', ' 08963317736', 'Jl.', 'pria', '03 January 2015');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
