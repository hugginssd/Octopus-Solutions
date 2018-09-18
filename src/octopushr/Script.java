/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr;

/**
 *
 * @author user
 */
public class Script {
    
//    -- phpMyAdmin SQL Dump
//-- version 4.7.9
//-- https://www.phpmyadmin.net/
//--
//-- Host: 127.0.0.1
//-- Generation Time: Aug 04, 2018 at 03:08 PM
//-- Server version: 10.1.31-MariaDB
//-- PHP Version: 7.2.3
//
//SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
//SET AUTOCOMMIT = 0;
//START TRANSACTION;
//SET time_zone = "+00:00";
//
//
///*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
///*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
///*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
///*!40101 SET NAMES utf8mb4 */;
//
//--
//-- Database: `octopus`
//--
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblagdocument`
//--
//
//CREATE TABLE `tblagdocument` (
//  `id` int(11) NOT NULL,
//  `docid` int(11) NOT NULL,
//  `sourcedocid` varchar(30) NOT NULL,
//  `doctype` varchar(30) NOT NULL,
//  `docdate` date NOT NULL,
//  `sourcerefnumber` varchar(60) NOT NULL,
//  `sorcerefnumber2` varchar(60) NOT NULL,
//  `sourcerefnumber3` varchar(60) NOT NULL,
//  `clientnumber` varchar(30) NOT NULL,
//  `clientname` varchar(60) NOT NULL,
//  `vatnumber` varchar(30) NOT NULL,
//  `address` text NOT NULL,
//  `tell` varchar(30) NOT NULL,
//  `fax` varchar(30) NOT NULL,
//  `email` text NOT NULL,
//  `glcode` varchar(30) NOT NULL,
//  `currency` varchar(30) NOT NULL,
//  `vatpc` double(18,2) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6)
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblagdocumentitems`
//--
//
//CREATE TABLE `tblagdocumentitems` (
//  `id` int(11) NOT NULL,
//  `docitemid` varchar(30) NOT NULL,
//  `docid` varchar(30) NOT NULL,
//  `glcode` varchar(30) NOT NULL,
//  `item` varchar(30) NOT NULL,
//  `qty` int(11) NOT NULL,
//  `currency` varchar(30) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `itemcode` varchar(30) NOT NULL,
//  `lineref` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblagerrordocument`
//--
//
//CREATE TABLE `tblagerrordocument` (
//  `id` int(11) NOT NULL,
//  `docid` int(11) NOT NULL,
//  `sourcedocid` varchar(30) NOT NULL,
//  `doctype` varchar(30) NOT NULL,
//  `docdate` date NOT NULL,
//  `sourcerefnumber` varchar(30) NOT NULL,
//  `sourcerefnumber2` varchar(30) NOT NULL,
//  `sourcerefnumber3` varchar(30) NOT NULL,
//  `clientname` varchar(60) NOT NULL,
//  `clientnumber` varchar(30) NOT NULL,
//  `vatnumber` varchar(30) NOT NULL,
//  `address` text NOT NULL,
//  `tell` varchar(30) NOT NULL,
//  `fax` varchar(30) NOT NULL,
//  `email` text NOT NULL,
//  `glcode` varchar(30) NOT NULL,
//  `currency` varchar(30) NOT NULL,
//  `vatpc` double(18,2) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `error` text NOT NULL,
//  `manuallyposted` bit(6) NOT NULL,
//  `datemanuallyposted` date NOT NULL,
//  `manuallypostedby` varchar(30) NOT NULL,
//  `usererror` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblagerrordocumentitems`
//--
//
//CREATE TABLE `tblagerrordocumentitems` (
//  `id` int(11) NOT NULL,
//  `docitemid` varchar(30) NOT NULL,
//  `docid` varchar(30) NOT NULL,
//  `glcode` varchar(60) NOT NULL,
//  `item` varchar(60) NOT NULL,
//  `qty` int(11) NOT NULL,
//  `currency` varchar(30) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `error` text NOT NULL,
//  `itemcode` varchar(30) NOT NULL,
//  `lineref` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblallocationhistory`
//--
//
//CREATE TABLE `tblallocationhistory` (
//  `id` int(11) NOT NULL,
//  `allocationhistoryid` varchar(30) NOT NULL,
//  `postid` varchar(30) NOT NULL,
//  `shiftpattern` varchar(30) NOT NULL,
//  `ispattern` bit(6) NOT NULL,
//  `guardnumber` int(11) NOT NULL,
//  `datechanged` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `username` varchar(100) NOT NULL,
//  `employee` varchar(100) NOT NULL,
//  `balancedsystemid` int(11) NOT NULL,
//  `zoneid` int(11) NOT NULL,
//  `postnumber` varchar(60) NOT NULL,
//  `changetype` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblallocations`
//--
//
//CREATE TABLE `tblallocations` (
//  `id` int(11) NOT NULL,
//  `siteid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `postid` varchar(30) NOT NULL,
//  `pattern` varchar(100) NOT NULL,
//  `patterncode` varchar(30) NOT NULL,
//  `ispermanent` bit(6) NOT NULL,
//  `guardnumber` int(11) NOT NULL,
//  `allocationsid` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblallowances`
//--
//
//CREATE TABLE `tblallowances` (
//  `id` int(11) NOT NULL,
//  `allowanceid` int(11) NOT NULL,
//  `allowancedesc` text NOT NULL,
//  `allowancesymbol` varchar(30) NOT NULL,
//  `allowancepaidby` varchar(30) NOT NULL,
//  `allowanceamount` double(18,2) NOT NULL,
//  `shifttypestring` varchar(30) NOT NULL,
//  `payrollallowancecode` varchar(12) NOT NULL,
//  `isearning` bit(6) NOT NULL,
//  `allowancepaidbyci` int(11) NOT NULL,
//  `code` varchar(12) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `taxable` bit(6) NOT NULL,
//  `pensionable` bit(6) NOT NULL,
//  `percentageofbasic` bit(6) NOT NULL,
//  `startdate` date NOT NULL,
//  `enddate` date NOT NULL,
//  `exemption` double(18,2) NOT NULL,
//  `systemdefined` bit(6) NOT NULL,
//  `value` double(18,2) NOT NULL,
//  `visible` bit(6) NOT NULL,
//  `gradecodefrom` varchar(12) NOT NULL,
//  `gradeidfrom` int(11) NOT NULL,
//  `gradeidto` int(11) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `recurring` bit(6) NOT NULL,
//  `description` text NOT NULL,
//  `allowancededuction` varchar(1) NOT NULL,
//  `allowablededuction` bit(6) NOT NULL,
//  `loan` bit(6) NOT NULL,
//  `disallowance` bit(6) NOT NULL,
//  `medicaltaxcredit` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(60) NOT NULL,
//  `machinecreatedon` varchar(60) NOT NULL,
//  `gradecodeto` varchar(12) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodifed` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `classcn` varchar(30) NOT NULL,
//  `useinwagetorevenue` bit(6) NOT NULL,
//  `useintimeandattendance` bit(6) NOT NULL,
//  `maxamount` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblallowdeductimport`
//--
//
//CREATE TABLE `tblallowdeductimport` (
//  `id` int(11) NOT NULL,
//  `allowdeductid` int(11) NOT NULL,
//  `empid` int(11) NOT NULL,
//  `code` varchar(255) NOT NULL,
//  `fnumber` varchar(30) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `balance` double(18,2) NOT NULL,
//  `loanamount` double(18,2) NOT NULL,
//  `type` varchar(30) NOT NULL,
//  `count` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetcodes`
//--
//
//CREATE TABLE `tblassetcodes` (
//  `id` int(11) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `assettypecodeid` varchar(30) NOT NULL,
//  `assetcode` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `reorderlever` int(11) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `userdeleted` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datedeleted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lifespandays` int(11) NOT NULL,
//  `issueprice` double(18,2) NOT NULL,
//  `qtymultiplier` double(4,2) NOT NULL,
//  `linkedto` int(11) NOT NULL,
//  `purchaseprice` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetinventorytran`
//--
//
//CREATE TABLE `tblassetinventorytran` (
//  `id` int(11) NOT NULL,
//  `assetinventoritranid` int(11) NOT NULL,
//  `siteid` varchar(30) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `posted` bit(6) NOT NULL,
//  `postedby` varchar(30) NOT NULL,
//  `dateposted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `notes` text NOT NULL,
//  `datetran` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usertran` varchar(30) NOT NULL,
//  `trantype` varchar(30) NOT NULL,
//  `ownerc` int(11) NOT NULL,
//  `vehicleregnumber` varchar(30) NOT NULL,
//  `referenceint` varchar(30) NOT NULL,
//  `jobref` varchar(30) NOT NULL,
//  `tranmachine` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetinvtranitems`
//--
//
//CREATE TABLE `tblassetinvtranitems` (
//  `id` int(11) NOT NULL,
//  `assetinvtranitemid` int(11) NOT NULL,
//  `assetinventorytranid` int(11) NOT NULL,
//  `assettypecodeid` int(11) NOT NULL,
//  `assetcodeid` int(11) NOT NULL,
//  `assetid` int(11) NOT NULL,
//  `expreturndate` date NOT NULL,
//  `qty` int(11) NOT NULL,
//  `actreturndate` date NOT NULL,
//  `issueconditionc` int(11) NOT NULL,
//  `returnconditionc` int(11) NOT NULL,
//  `assetstockid` int(11) NOT NULL,
//  `issuedbeforelifespan` bit(6) NOT NULL,
//  `totalreturnedqty` double(18,2) NOT NULL,
//  `returnref` varchar(30) NOT NULL,
//  `returnqty` double(18,2) NOT NULL,
//  `returnuser` varchar(30) NOT NULL,
//  `returnpostdate` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `returnmachine` varchar(30) NOT NULL,
//  `returnasassetcodeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetreceiving`
//--
//
//CREATE TABLE `tblassetreceiving` (
//  `id` int(11) NOT NULL,
//  `assetreceiptid` varchar(30) NOT NULL,
//  `invoicenumber` varchar(30) NOT NULL,
//  `supplierid` varchar(30) NOT NULL,
//  `dateinv` date NOT NULL,
//  `notes` text NOT NULL,
//  `datecaptured` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `posted` bit(6) NOT NULL,
//  `dateposted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `cancelled` bit(6) NOT NULL,
//  `userposted` varchar(30) NOT NULL,
//  `usercancelled` varchar(30) NOT NULL,
//  `usercapture` varchar(30) NOT NULL,
//  `datecancelled` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `ownerc` int(11) NOT NULL,
//  `referenceint` varchar(30) NOT NULL,
//  `total` double(18,2) NOT NULL,
//  `totalvat` double(18,2) NOT NULL,
//  `vatpc` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetreceivingitems`
//--
//
//CREATE TABLE `tblassetreceivingitems` (
//  `id` int(11) NOT NULL,
//  `assetid` int(11) NOT NULL,
//  `assetreceiptid` varchar(30) NOT NULL,
//  `assettypecodeid` varchar(30) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `assetcode` varchar(30) NOT NULL,
//  `binc` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `expirydate` date NOT NULL,
//  `qty` int(11) NOT NULL,
//  `unitprice` double(18,2) NOT NULL,
//  `serialnumber` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetrepairs`
//--
//
//CREATE TABLE `tblassetrepairs` (
//  `id` int(11) NOT NULL,
//  `repairid` varchar(30) NOT NULL,
//  `assetid` varchar(30) NOT NULL,
//  `datesent` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datereturned` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `costofrepair` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `usersent` varchar(30) NOT NULL,
//  `userreceived` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassets`
//--
//
//CREATE TABLE `tblassets` (
//  `id` int(11) NOT NULL,
//  `assetid` varchar(30) NOT NULL,
//  `assettypecodeid` varchar(30) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `assetcode` varchar(30) NOT NULL,
//  `expirydate` date NOT NULL,
//  `name` varchar(60) NOT NULL,
//  `decommissioned` bit(6) NOT NULL,
//  `allocated` bit(6) NOT NULL,
//  `binc` varchar(100) NOT NULL,
//  `lastassetinvtransitemsid` varchar(100) NOT NULL,
//  `assettypecode` varchar(100) NOT NULL,
//  `serialnumber` varchar(100) NOT NULL,
//  `decomreason` varchar(100) NOT NULL,
//  `decomreasonc` varchar(100) NOT NULL,
//  `decomdate` date NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `userdecom` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `sentforrepairs` bit(6) NOT NULL,
//  `condition` varchar(30) NOT NULL,
//  `ownerc` int(11) NOT NULL,
//  `functional` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetstockadjustments`
//--
//
//CREATE TABLE `tblassetstockadjustments` (
//  `id` int(11) NOT NULL,
//  `assetstockadjustmentsid` varchar(30) NOT NULL,
//  `assetstockid` varchar(16) NOT NULL,
//  `date` date NOT NULL,
//  `adjustedby` varchar(30) NOT NULL,
//  `qtybefore` double(18,2) NOT NULL,
//  `qtyafter` double(18,2) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6)
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetstocks`
//--
//
//CREATE TABLE `tblassetstocks` (
//  `id` int(11) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `assetcode` varchar(30) NOT NULL,
//  `expirydate` date NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `assettypecodeid` varchar(30) NOT NULL,
//  `binc` varchar(30) NOT NULL,
//  `qty` int(11) NOT NULL,
//  `lastassetreceiptid` varchar(30) NOT NULL,
//  `lastassetinvtransitemsid` varchar(30) NOT NULL,
//  `deleted` varchar(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `userdeleted` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datedeleted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `assetstockid` varchar(30) NOT NULL,
//  `ownerc` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassetstockshistory`
//--
//
//CREATE TABLE `tblassetstockshistory` (
//  `id` int(11) NOT NULL,
//  `assetstockhistoryid` varchar(30) NOT NULL,
//  `assettype` varchar(60) NOT NULL,
//  `assetstockid` varchar(30) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `qty` int(11) NOT NULL,
//  `maxprice` double(18,2) NOT NULL,
//  `avgprice` double(18,2) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6)
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblassettypes`
//--
//
//CREATE TABLE `tblassettypes` (
//  `id` int(11) NOT NULL,
//  `assettypecodeid` int(11) NOT NULL,
//  `assettypecode` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `description` text NOT NULL,
//  `consumable` bit(6) NOT NULL,
//  `invcategoryc` int(11) NOT NULL,
//  `assetallocationcode` varchar(30) NOT NULL,
//  `reorderlever` int(30) NOT NULL,
//  `expires` bit(6) NOT NULL,
//  `serialnumber` varchar(30) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `userdeleted` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `datedeleted` datetime(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblattendanceexporttemp`
//--
//
//CREATE TABLE `tblattendanceexporttemp` (
//  `id` int(11) NOT NULL,
//  `zone` varchar(30) NOT NULL,
//  `forcenumber` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `surname` varchar(30) NOT NULL,
//  `attendance` varchar(30) NOT NULL,
//  `count` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblbalancedsystem`
//--
//
//CREATE TABLE `tblbalancedsystem` (
//  `id` int(11) NOT NULL,
//  `balancedsystemid` varchar(30) NOT NULL,
//  `balancedsystemname` varchar(60) NOT NULL,
//  `templateid` varchar(30) NOT NULL,
//  `zone` varchar(30) NOT NULL,
//  `balanced` bit(6) NOT NULL,
//  `notes` text NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `isrelieversystem` bit(6) NOT NULL,
//  `ismonthlybalancedsystem` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblbank`
//--
//
//CREATE TABLE `tblbank` (
//  `id` int(11) NOT NULL,
//  `bankid` int(11) NOT NULL,
//  `bankname` varchar(60) NOT NULL,
//  `deleted` mediumtext NOT NULL,
//  `datecreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `orgaccountnumber` varchar(30) NOT NULL,
//  `orgaccounttype` varchar(2) NOT NULL,
//  `orgsortcode` varchar(30) NOT NULL,
//  `destinationsortcode` varchar(30) NOT NULL,
//  `headerid` varchar(3) NOT NULL,
//  `headersenderid` varchar(9) NOT NULL,
//  `headerrecieverid` varchar(9) NOT NULL,
//  `headerfileid` int(11) NOT NULL,
//  `headerworkcode` varchar(15) NOT NULL,
//  `headersfiversion` int(11) NOT NULL,
//  `headersendername` varchar(30) NOT NULL,
//  `headerreceivername` varchar(30) NOT NULL,
//  `headerpackagename` varchar(30) NOT NULL,
//  `traileid` varchar(3) NOT NULL,
//  `trailercurrencycode` varchar(3) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblbankbranch`
//--
//
//CREATE TABLE `tblbankbranch` (
//  `id` int(11) NOT NULL,
//  `bankbranchid` int(12) NOT NULL,
//  `bankid` int(12) NOT NULL,
//  `branchcode` varchar(30) NOT NULL,
//  `branchname` varchar(50) DEFAULT NULL,
//  `deleted` bit(6) DEFAULT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) DEFAULT NULL,
//  `machinecreatedon` varchar(30) DEFAULT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) DEFAULT NULL,
//  `lastmachinemodifiedon` varchar(30) DEFAULT NULL,
//  `rowversion` int(12) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblbilling`
//--
//
//CREATE TABLE `tblbilling` (
//  `id` int(11) NOT NULL,
//  `billingid` int(12) NOT NULL,
//  `billingdate` datetime(6) NOT NULL,
//  `totalamount` double(12,0) NOT NULL,
//  `notes` text NOT NULL,
//  `datebatchprocessed` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `batchverifyedby` varchar(50) NOT NULL,
//  `assignedto` varchar(50) NOT NULL,
//  `billingref` varchar(50) NOT NULL,
//  `accountmanagerid` varchar(25) NOT NULL,
//  `datecreated` date NOT NULL,
//  `usercreated` varchar(50) NOT NULL,
//  `machinecreatedon` varchar(50) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(50) NOT NULL,
//  `lastmachinemodifiedon` varchar(50) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblbillinginvoices`
//--
//
//CREATE TABLE `tblbillinginvoices` (
//  `id` int(11) NOT NULL,
//  `billinginvoicesid` int(12) NOT NULL,
//  `billingid` int(12) NOT NULL,
//  `invoiceid` int(12) NOT NULL,
//  `assignedto` varchar(50) NOT NULL,
//  `dateprocessed` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//  `notes` text NOT NULL,
//  `error` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcasualtyboard`
//--
//
//CREATE TABLE `tblcasualtyboard` (
//  `id` int(11) NOT NULL,
//  `casultytypeid` varchar(30) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `dateentered` date NOT NULL,
//  `expectedenddate` date NOT NULL,
//  `actualenddate` date NOT NULL,
//  `notes` text NOT NULL,
//  `zoneid` varchar(12) NOT NULL,
//  `casualtyboardentryid` varchar(12) NOT NULL,
//  `shiftpattern` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcasualtyboardattendance`
//--
//
//CREATE TABLE `tblcasualtyboardattendance` (
//  `id` int(11) NOT NULL,
//  `casualtyboardattendanceid` varchar(30) NOT NULL,
//  `attendancedate` date NOT NULL,
//  `shifttype` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcasualtytypes`
//--
//
//CREATE TABLE `tblcasualtytypes` (
//  `id` int(11) NOT NULL,
//  `casualtytypeid` varchar(30) NOT NULL,
//  `casualtyname` varchar(100) NOT NULL,
//  `casualtydescription` text NOT NULL,
//  `duration` int(11) NOT NULL,
//  `shifttype` int(11) NOT NULL,
//  `overstayshifttype` int(11) NOT NULL,
//  `pendingterminations` bit(6) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcheckhistory`
//--
//
//CREATE TABLE `tblcheckhistory` (
//  `id` int(11) NOT NULL,
//  `checkid` varchar(30) NOT NULL,
//  `checkcode` varchar(30) NOT NULL,
//  `checkeditemcode` varchar(30) NOT NULL,
//  `checkeditemc` int(11) NOT NULL,
//  `checkedby` varchar(30) NOT NULL,
//  `checkdate` date NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblchecks`
//--
//
//CREATE TABLE `tblchecks` (
//  `id` int(11) NOT NULL,
//  `checkcode` varchar(30) NOT NULL,
//  `name` varchar(100) NOT NULL,
//  `description` text NOT NULL,
//  `applicabilityc` int(11) NOT NULL,
//  `recheckperiod` int(11) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datelastedit` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `user` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblchecksgroup`
//--
//
//CREATE TABLE `tblchecksgroup` (
//  `id` int(11) NOT NULL,
//  `checkcode` varchar(30) NOT NULL,
//  `checkeditemcode` varchar(30) NOT NULL,
//  `checkeditemidentity` int(11) NOT NULL,
//  `checkeditemtypec` varchar(30) NOT NULL,
//  `notes` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datelastedit` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `user` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblchecksregister`
//--
//
//CREATE TABLE `tblchecksregister` (
//  `id` int(11) NOT NULL,
//  `checkcode` varchar(30) NOT NULL,
//  `checkeditemcode` varchar(30) NOT NULL,
//  `checkeditemtypec` int(11) NOT NULL,
//  `checkeditemidentity` int(11) NOT NULL,
//  `checkedby` varchar(30) NOT NULL,
//  `datelastchecked` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `notes` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datelastedit` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `user` varchar(30) NOT NULL,
//  `key` int(11) NOT NULL,
//  `singlecheckpassed` bit(6) NOT NULL,
//  `assignedbygroup` bit(6) NOT NULL,
//  `checksregister` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblclients`
//--
//
//CREATE TABLE `tblclients` (
//  `id` int(11) NOT NULL,
//  `clientid` int(12) NOT NULL,
//  `ownerclientid` int(12) DEFAULT NULL,
//  `accountnumber` varchar(50) DEFAULT NULL,
//  `accountname` varchar(100) DEFAULT NULL,
//  `vatnumber` varchar(30) DEFAULT NULL,
//  `bpn` varchar(30) DEFAULT NULL,
//  `firstname` varchar(30) DEFAULT NULL,
//  `lastname` varchar(30) DEFAULT NULL,
//  `physicaladdress` varchar(100) DEFAULT NULL,
//  `contactaddress` varchar(100) DEFAULT NULL,
//  `telephonenumber` varchar(25) DEFAULT NULL,
//  `faxnumber` varchar(25) DEFAULT NULL,
//  `emailaddress` varchar(50) DEFAULT NULL,
//  `tag` varchar(30) DEFAULT NULL,
//  `openingdate` date DEFAULT NULL,
//  `closingdate` date DEFAULT NULL,
//  `createdby` varchar(12) DEFAULT NULL,
//  `closedby` varchar(12) DEFAULT NULL,
//  `closedstatus` bit(6) DEFAULT NULL,
//  `supplier` bit(6) DEFAULT NULL,
//  `systemaccount` bit(6) DEFAULT NULL,
//  `bussinesssectorcn` varchar(12) DEFAULT NULL,
//  `billpersite` bit(6) DEFAULT NULL,
//  `usesitebillingaddress` bit(6) DEFAULT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(50) DEFAULT NULL,
//  `machinecreatedon` varchar(50) DEFAULT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) DEFAULT NULL,
//  `lastmachinemodifiedon` varchar(30) DEFAULT NULL,
//  `rowversion` int(11) DEFAULT NULL,
//  `accountmanageruserid` int(11) DEFAULT NULL,
//  `autobilling` bit(6) DEFAULT NULL,
//  `notes` text
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcompanybranches`
//--
//
//CREATE TABLE `tblcompanybranches` (
//  `id` int(11) NOT NULL,
//  `branchid` varchar(30) NOT NULL,
//  `branchname` varchar(1000) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblcompanybranches`
//--
//
//INSERT INTO `tblcompanybranches` (`id`, `branchid`, `branchname`) VALUES
//(1, 'LBR001', 'HARARE SOUTH');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcompanydetails`
//--
//
//CREATE TABLE `tblcompanydetails` (
//  `id` int(11) NOT NULL,
//  `companycode` varchar(12) NOT NULL,
//  `companyname` varchar(100) NOT NULL,
//  `industry` varchar(100) NOT NULL,
//  `annualrevenue` double(12,2) NOT NULL,
//  `yearestablished` year(4) NOT NULL,
//  `siccode` varchar(6) NOT NULL,
//  `primaryproduct` varchar(100) NOT NULL,
//  `secondaryproduct` varchar(100) NOT NULL,
//  `telephone` varchar(30) NOT NULL,
//  `fax` varchar(30) NOT NULL,
//  `website` text NOT NULL,
//  `nosalescalss` bit(1) NOT NULL,
//  `nopostal` bit(1) NOT NULL,
//  `address` text NOT NULL,
//  `towncity` varchar(25) NOT NULL,
//  `countrystate` varchar(100) NOT NULL,
//  `postal` varchar(10) NOT NULL,
//  `zipcode` varchar(100) NOT NULL,
//  `numberofemployees` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblcompanydetails`
//--
//
//INSERT INTO `tblcompanydetails` (`id`, `companycode`, `companyname`, `industry`, `annualrevenue`, `yearestablished`, `siccode`, `primaryproduct`, `secondaryproduct`, `telephone`, `fax`, `website`, `nosalescalss`, `nopostal`, `address`, `towncity`, `countrystate`, `postal`, `zipcode`, `numberofemployees`) VALUES
//(1, 'CCO1', 'CAPS HOLDINGS (PVT) LTD', 'SOFTWARE', 50000.00, 2013, '34635', 'MEDICINE', 'SOFTWARE', '+0454745645', '65435643', 'www.capsholdings.co.zw', b'1', b'0', 'HARARE, SOUTYHERTON', 'HARARE', 'HARARE', 'HARARE', 'ZW', 500),
//(2, 'CCO2', 'BELINA PAYROLL (PVT) LTD', 'COMPUTER', 50000.00, 2013, '46754', 'SOFTWARE', 'NONE', '+046323456', '4326543', 'www.belinapayroll.co.zw', b'0', b'1', 'VAN PRAAGH, PRINCE EDWARD\nHARARE, MILTON PARK', 'HARARE', 'HARARE', '+263', 'ZW', 500),
//(3, 'CCO3', 'BELVEDERE MEDICAL CENTRE (PVT) LTD', 'HEALTH', 500000.00, 2013, '456354', 'HEALTH', 'NONE', '+0435346334', '34534', 'www.belvedere.co.zw', b'0', b'0', 'BELVEDERE', 'HARARE', 'HARARE', '+263', 'ZW', 500),
//(4, 'CCO4', 'DSGFDS', 'CHEMICAL', 345345.00, 2013, '354543', 'DFGHFDH', 'FDGH', '4365436', 'YERT', 'rtyrtey', b'0', b'0', 'GDSGDSAG', 'DSAG', 'DSGADSA', 'GDSG', 'DSGADAS', 3453);
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblcountry`
//--
//
//CREATE TABLE `tblcountry` (
//  `id` int(11) NOT NULL,
//  `zipcode` varchar(12) NOT NULL,
//  `country` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblcountry`
//--
//
//INSERT INTO `tblcountry` (`id`, `zipcode`, `country`) VALUES
//(1, 'AN', 'ANGOLA'),
//(2, '	BW', 'BOTSWANA'),
//(3, '	DRC', 'DEMOCRATIC REPUBLIC OF CONGO'),
//(4, '	LS', 'LESOTHO'),
//(5, '	MD', 'MADAGASCAR'),
//(6, '	MW', 'MALAWI'),
//(7, '	MR', 'MAURITIUS'),
//(8, '	MZ', 'MOZAMBIQUE'),
//(9, 'NM', 'NAMIBIA'),
//(10, 'SY', 'SYCHELLES'),
//(11, 'SA', 'SOUTH AFRICA'),
//(12, 'SW', 'SWAZILAND'),
//(13, '	TZ', 'TANZANIA'),
//(14, 'ZA', 'ZAMBIA'),
//(15, 'ZW', 'ZIMBABWE');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldeletethistableassetstockinvtranitems`
//--
//
//CREATE TABLE `tbldeletethistableassetstockinvtranitems` (
//  `id` int(11) NOT NULL,
//  `assetstockinvtranitemsid` varchar(30) NOT NULL,
//  `assetinventorytranid` varchar(30) NOT NULL,
//  `assetcodeid` varchar(30) NOT NULL,
//  `qty` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldepartments`
//--
//
//CREATE TABLE `tbldepartments` (
//  `id` int(11) NOT NULL,
//  `departmentid` varchar(30) NOT NULL,
//  `departmentname` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tbldepartments`
//--
//
//INSERT INTO `tbldepartments` (`id`, `departmentid`, `departmentname`) VALUES
//(1, 'DPT001', 'ADMIN'),
//(2, 'DPT002', 'OPERATIONS'),
//(3, 'DPT003', 'OPERATIONS'),
//(4, 'DPT004', 'MARKETING'),
//(5, 'DPT005', 'HUMAN RESOURCES'),
//(6, 'DPT006', 'RECEPTION');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldependance`
//--
//
//CREATE TABLE `tbldependance` (
//  `id` int(11) NOT NULL,
//  `spousename` varchar(30) NOT NULL,
//  `spousesurname` varchar(30) NOT NULL,
//  `numberofdependance` int(11) NOT NULL,
//  `dependancenotes` text NOT NULL,
//  `employeeid` varchar(25) NOT NULL,
//  `relationship` varchar(1000) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldeploymentsheetmessages`
//--
//
//CREATE TABLE `tbldeploymentsheetmessages` (
//  `id` int(11) NOT NULL,
//  `messagedetail` varchar(50) DEFAULT NULL,
//  `shifttype` varchar(30) DEFAULT NULL,
//  `startdate` date DEFAULT NULL,
//  `enddate` date DEFAULT NULL,
//  `broadcaster` varchar(30) DEFAULT NULL,
//  `authoriser` varchar(50) DEFAULT NULL,
//  `datecreated` date DEFAULT NULL,
//  `userwhocreated` varchar(50) DEFAULT NULL,
//  `parades` varchar(100) DEFAULT NULL,
//  `broadcast` int(11) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldeploymentsheetnew`
//--
//
//CREATE TABLE `tbldeploymentsheetnew` (
//  `id` int(11) NOT NULL,
//  `deploymentsheetid` int(25) NOT NULL,
//  `deploymentdate` date DEFAULT NULL,
//  `officer` int(12) DEFAULT NULL,
//  `preparedby` varchar(30) DEFAULT NULL,
//  `preparationdate` date NOT NULL,
//  `datelastmodified` datetime(6) DEFAULT NULL,
//  `userlastmodified` varchar(30) DEFAULT NULL,
//  `shiftdate` datetime(6) DEFAULT NULL,
//  `shifttype` varchar(12) NOT NULL,
//  `paradingpoint` int(12) DEFAULT NULL,
//  `marked` bit(6) DEFAULT NULL,
//  `verified` bit(6) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldeploymentsheetweekly`
//--
//
//CREATE TABLE `tbldeploymentsheetweekly` (
//  `id` int(11) NOT NULL,
//  `deploymentsheetid` int(12) NOT NULL,
//  `deploymentdate` date DEFAULT NULL,
//  `paradingpoint` int(12) DEFAULT NULL,
//  `shift` varchar(12) DEFAULT NULL,
//  `month` date DEFAULT NULL,
//  `year` year(4) DEFAULT NULL,
//  `weekstarting` datetime(6) DEFAULT NULL,
//  `weekending` datetime(6) DEFAULT NULL,
//  `supervisor` int(11) DEFAULT NULL,
//  `securitymanager` int(11) DEFAULT NULL,
//  `preparedby` int(11) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldeploymentsheetweeklyentry`
//--
//
//CREATE TABLE `tbldeploymentsheetweeklyentry` (
//  `id` int(11) NOT NULL,
//  `deploymentsheetentryid` int(12) NOT NULL,
//  `deploymentsheetid` int(12) DEFAULT NULL,
//  `balancedsystemid` int(12) DEFAULT NULL,
//  `counter` int(12) DEFAULT NULL,
//  `employee` varchar(12) DEFAULT NULL,
//  `monday` varchar(12) DEFAULT NULL,
//  `tuesday` varchar(12) DEFAULT NULL,
//  `wednesday` varchar(12) DEFAULT NULL,
//  `thursday` varchar(12) DEFAULT NULL,
//  `friday` varchar(12) DEFAULT NULL,
//  `saturday` varchar(12) DEFAULT NULL,
//  `sunday` varchar(12) DEFAULT NULL,
//  `post` varchar(12) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldesignation`
//--
//
//CREATE TABLE `tbldesignation` (
//  `id` int(11) NOT NULL,
//  `designationid` varchar(16) NOT NULL,
//  `designation` varchar(30) NOT NULL,
//  `notes` text
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tbldesignation`
//--
//
//INSERT INTO `tbldesignation` (`id`, `designationid`, `designation`, `notes`) VALUES
//(1, 'DG001', 'SOFTWARE DEVELOPER', 'NEWL APPOINTED SOFTWARE DEVELOPER'),
//(2, 'DG002', 'SENIOR SOFTWARE ENGINEER', '3 YEARS EXPERIENCE'),
//(3, 'DG003', 'SENIOR DATA SCIENTIST', '4 YEARS EXPERIENCE'),
//(4, 'DG004', 'MANAGER', '10 YEARS EXPERIENCE'),
//(5, 'DG005', 'SECRETARY', '2 YEARS EXPERIENCE');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldisciplinary`
//--
//
//CREATE TABLE `tbldisciplinary` (
//  `id` int(11) NOT NULL,
//  `dateterminationnotice` date NOT NULL,
//  `dateterminated` date NOT NULL,
//  `terminationreason` varchar(30) NOT NULL,
//  `terminationby` varchar(30) NOT NULL,
//  `activeind` bit(6) NOT NULL,
//  `suspendedind` bit(30) NOT NULL,
//  `disciplinaryid` int(12) NOT NULL,
//  `employeeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldutyattendanceallowancenew`
//--
//
//CREATE TABLE `tbldutyattendanceallowancenew` (
//  `id` int(11) NOT NULL,
//  `shiftid` int(11) NOT NULL,
//  `allowanceid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbldutyattendancenew`
//--
//
//CREATE TABLE `tbldutyattendancenew` (
//  `id` int(11) NOT NULL,
//  `shiftid` int(12) NOT NULL,
//  `deploymentsheetid` varchar(25) DEFAULT NULL,
//  `postid` varchar(12) DEFAULT NULL,
//  `employee` varchar(25) DEFAULT NULL,
//  `starttime` time DEFAULT NULL,
//  `endtime` time DEFAULT NULL,
//  `paraded` bit(6) DEFAULT NULL,
//  `notes` text
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblebsecgroup`
//--
//
//CREATE TABLE `tblebsecgroup` (
//  `id` int(11) NOT NULL,
//  `gro_up` varchar(12) DEFAULT NULL,
//  `description` varchar(100) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblebsecgroupaccess`
//--
//
//CREATE TABLE `tblebsecgroupaccess` (
//  `id` int(11) NOT NULL,
//  `gro_up` varchar(50) NOT NULL,
//  `accessright` varchar(100) DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblebsecstaticrights`
//--
//
//CREATE TABLE `tblebsecstaticrights` (
//  `id` int(11) NOT NULL,
//  `accessright` varchar(100) DEFAULT NULL,
//  `menu` varchar(100) DEFAULT NULL,
//  `parentmenu` varchar(100) DEFAULT NULL,
//  `reportname` int(30) DEFAULT NULL,
//  `hidden` bit(6) DEFAULT NULL,
//  `capturedate` date DEFAULT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblebsecusergroups`
//--
//
//CREATE TABLE `tblebsecusergroups` (
//  `id` int(11) NOT NULL,
//  `staffcode` varchar(100) NOT NULL,
//  `group` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblebusers`
//--
//
//CREATE TABLE `tblebusers` (
//  `id` int(11) NOT NULL,
//  `staffcode` varchar(30) DEFAULT NULL,
//  `surname` varchar(30) DEFAULT NULL,
//  `firstname` varchar(30) DEFAULT NULL,
//  `position` varchar(30) DEFAULT NULL,
//  `ext` varchar(12) DEFAULT NULL,
//  `email` varchar(100) DEFAULT NULL,
//  `nationalid` varchar(16) DEFAULT NULL,
//  `departmentid` varchar(16) DEFAULT NULL,
//  `roleid` varchar(16) DEFAULT NULL,
//  `mobile` varchar(25) DEFAULT NULL,
//  `datecreated` date NOT NULL,
//  `usercreated` varchar(100) DEFAULT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(100) DEFAULT NULL,
//  `deleted` bit(1) NOT NULL,
//  `connected` bit(1) NOT NULL,
//  `workstation` varchar(100) DEFAULT NULL,
//  `password` varchar(100) DEFAULT NULL,
//  `userid` int(11) NOT NULL,
//  `authtokendate` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `authtoken` varchar(300) DEFAULT NULL,
//  `lastauthdate` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6)
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblebusers`
//--
//
//INSERT INTO `tblebusers` (`id`, `staffcode`, `surname`, `firstname`, `position`, `ext`, `email`, `nationalid`, `departmentid`, `roleid`, `mobile`, `datecreated`, `usercreated`, `lastdatemodified`, `lastusermodified`, `deleted`, `connected`, `workstation`, `password`, `userid`, `authtokendate`, `authtoken`, `lastauthdate`) VALUES
//(1, '567', 'GFJHGF', 'UYTR', NULL, NULL, 'TUYTUTYU', 'TYUTY', 'DPT002', 'RL001', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '123456', 1, '2018-06-08 09:27:27.384916', NULL, '2018-06-08 00:00:00.000000'),
//(3, 'EMP002', 'MAFIGU', 'HUGGINS', NULL, NULL, 'mafiguhuggins@gmail.com', '45-195645A45', 'DPT001', 'RL001', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '123456', 1, '2018-06-08 15:34:05.228348', NULL, '2018-06-08 00:00:00.000000'),
//(4, 'EMP003', 'MAFIGU', 'HUGGINS', NULL, NULL, '2', '523456', 'DPT002', 'RL001', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '12', 1, '2018-06-08 16:00:39.625521', NULL, '2018-06-08 00:00:00.000000'),
//(5, 'EMP004', 'DGD', 'HUGG', NULL, NULL, 'CBCX', 'SGDF', 'DPT001', 'RL002', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '12', 1, '2018-06-08 16:02:15.539007', NULL, '2018-06-08 00:00:00.000000'),
//(6, 'EMP005', 'DFHG', 'FDHGFD', NULL, NULL, 'FDGH', 'FD', 'DPT002', 'RL001', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '12', 1, '2018-06-08 16:03:29.695249', NULL, '2018-06-08 00:00:00.000000'),
//(7, 'EMP006', 'DFGH', 'DHFG', NULL, NULL, 'FGDH', 'DFHG', 'DPT001', 'RL002', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '12', 1, '2018-06-08 16:04:21.618218', NULL, '2018-06-08 00:00:00.000000'),
//(10, 'EMP007', 'FDH', 'DFHG', NULL, NULL, 'JHGFD', 'DFHGT', 'DPT002', 'RL001', NULL, '2018-06-08', 'user-PC', '2018-06-08', 'USER-PC', b'0', b'1', 'USER-PC', '12', 1, '2018-06-08 16:11:25.199446', NULL, '2018-06-08 00:00:00.000000');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblemployeeaddress`
//--
//
//CREATE TABLE `tblemployeeaddress` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(25) NOT NULL,
//  `datecreated` date NOT NULL,
//  `addresstype` varchar(12) NOT NULL,
//  `addressline1` varchar(60) NOT NULL,
//  `addressline2` varchar(60) NOT NULL,
//  `addressline3` int(11) NOT NULL,
//  `areacode` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblemployeeallowdeduct`
//--
//
//CREATE TABLE `tblemployeeallowdeduct` (
//  `id` int(11) NOT NULL,
//  `employeeallowdeductid` varchar(12) NOT NULL,
//  `allowdeductid` varchar(12) NOT NULL,
//  `employeeid` varchar(12) NOT NULL,
//  `factor` double(9,2) NOT NULL,
//  `amount` double(9,2) NOT NULL,
//  `startdate` date NOT NULL,
//  `enddate` date NOT NULL,
//  `creditor` varchar(30) NOT NULL,
//  `amountowing` double(9,2) DEFAULT NULL,
//  `paymentrate` double(9,2) DEFAULT NULL,
//  `interestpaid` double(9,2) DEFAULT NULL,
//  `writeoff` bit(6) NOT NULL,
//  `notes` text NOT NULL,
//  `deleted` bit(6) DEFAULT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) DEFAULT NULL,
//  `machinecreatedon` varchar(30) DEFAULT NULL,
//  `lastdatemodified` datetime(6) DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `originalamount` double(9,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblexternaluploads`
//--
//
//CREATE TABLE `tblexternaluploads` (
//  `id` int(11) NOT NULL,
//  `deductioncode` varchar(30) NOT NULL,
//  `regnumber` varchar(30) NOT NULL,
//  `accountnumber` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `surname` varchar(30) NOT NULL,
//  `trantype` varchar(30) NOT NULL,
//  `tranamount` double(18,2) NOT NULL,
//  `totalamount` double(18,2) NOT NULL,
//  `ratepermonth` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `errors` text NOT NULL,
//  `uploaderror` bit(6) NOT NULL,
//  `inputid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfinancialpayperiod`
//--
//
//CREATE TABLE `tblfinancialpayperiod` (
//  `id` int(11) NOT NULL,
//  `financialpayperiodid` int(11) NOT NULL,
//  `financialyearid` int(11) NOT NULL,
//  `periodseqno` int(11) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL,
//  `paydate` date NOT NULL,
//  `finperiodlocked` bit(6) NOT NULL,
//  `current` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfinancialyear`
//--
//
//CREATE TABLE `tblfinancialyear` (
//  `id` int(11) NOT NULL,
//  `financialyearid` int(12) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfuelcoupon`
//--
//
//CREATE TABLE `tblfuelcoupon` (
//  `id` int(11) NOT NULL,
//  `couponid` int(11) NOT NULL,
//  `quantityoffueltobeissued` int(11) NOT NULL,
//  `dateissued` datetime(6) NOT NULL,
//  `personissuedto` int(11) NOT NULL,
//  `issuername` varchar(60) NOT NULL,
//  `notes` text NOT NULL,
//  `registrationnumber` varchar(60) NOT NULL,
//  `typeoffuelusedc` int(12) NOT NULL,
//  `datefueldisbursed` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `odometerreading` int(11) NOT NULL,
//  `sourcerserve` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfuelpurchase`
//--
//
//CREATE TABLE `tblfuelpurchase` (
//  `id` int(11) NOT NULL,
//  `purchaseid` int(11) NOT NULL,
//  `dateofpurchase` date NOT NULL,
//  `invoicenumber` int(11) NOT NULL,
//  `totalcost` double(9,2) NOT NULL,
//  `personwhoreceivedc` int(11) NOT NULL,
//  `typeoffuelusedc` int(12) NOT NULL,
//  `amountbought` double(9,2) NOT NULL,
//  `finalized` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfuelreserves`
//--
//
//CREATE TABLE `tblfuelreserves` (
//  `id` int(11) NOT NULL,
//  `reserveid` int(11) NOT NULL,
//  `reservename` varchar(100) NOT NULL,
//  `reservecapacity` int(11) NOT NULL,
//  `typeoffuelusedc` int(11) NOT NULL,
//  `comments` text NOT NULL,
//  `currentfuelcapacity` double(9,2) NOT NULL,
//  `currentfuelavailableforcoupons` double(9,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblfueltankrefill`
//--
//
//CREATE TABLE `tblfueltankrefill` (
//  `id` int(11) NOT NULL,
//  `purchaseid` int(11) NOT NULL,
//  `destinationtank` double(9,2) NOT NULL,
//  `quantity` double(9,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblgrades`
//--
//
//CREATE TABLE `tblgrades` (
//  `id` int(11) NOT NULL,
//  `gradeid` int(12) NOT NULL,
//  `grade` varchar(12) NOT NULL,
//  `gradeshortdesc` varchar(12) NOT NULL,
//  `gradelongdesc` varchar(100) NOT NULL,
//  `category` varchar(30) NOT NULL,
//  `cbagrade` varchar(30) NOT NULL,
//  `commissioned` bit(6) NOT NULL,
//  `departmentc` int(12) NOT NULL,
//  `basicwage` double(9,2) NOT NULL,
//  `hourwage` double(9,2) NOT NULL,
//  `billingrate` double(9,2) NOT NULL,
//  `overtimerate` double(9,2) NOT NULL,
//  `gradeweight` double(9,2) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` date NOT NULL,
//  `usercreated` varchar(50) NOT NULL,
//  `machinecreatedon` varchar(50) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(50) NOT NULL,
//  `lastmachinemodifiedon` datetime(6) NOT NULL,
//  `rowversion` int(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblgradesalaries`
//--
//
//CREATE TABLE `tblgradesalaries` (
//  `id` int(11) NOT NULL,
//  `grade` varchar(12) NOT NULL,
//  `dateeffected` date NOT NULL,
//  `servingyears` int(11) NOT NULL,
//  `basicamount` double(9,2) NOT NULL,
//  `rateperhour` double(9,2) NOT NULL,
//  `ratepershift` double(9,2) NOT NULL,
//  `dateended` date NOT NULL,
//  `active` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblgratuity`
//--
//
//CREATE TABLE `tblgratuity` (
//  `id` int(11) NOT NULL,
//  `serviceyears` int(11) NOT NULL,
//  `pcwageonterm` double(9,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblguardpaypoints`
//--
//
//CREATE TABLE `tblguardpaypoints` (
//  `id` int(11) NOT NULL,
//  `fnumberok` varchar(255) NOT NULL,
//  `force` varchar(255) NOT NULL,
//  `name` varchar(255) NOT NULL,
//  `surname` varchar(255) NOT NULL,
//  `grade` varchar(255) NOT NULL,
//  `nssa` varchar(255) NOT NULL,
//  `bank` varchar(255) NOT NULL,
//  `bankaccount` varchar(255) NOT NULL,
//  `paypoint` varchar(255) NOT NULL,
//  `paypointfixed` varchar(255) NOT NULL,
//  `costcenter` varchar(255) NOT NULL,
//  `wage` double(18,2) NOT NULL,
//  `paypointid` float NOT NULL,
//  `empid` int(11) NOT NULL,
//  `costcenterid` int(11) NOT NULL,
//  `bankid` int(11) NOT NULL,
//  `gradeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblguards`
//--
//
//CREATE TABLE `tblguards` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(11) NOT NULL,
//  `firstname` varchar(16) DEFAULT NULL,
//  `middlename` varchar(16) NOT NULL,
//  `surname` varchar(16) DEFAULT NULL,
//  `gender` varchar(6) DEFAULT NULL,
//  `dateofbirth` date DEFAULT NULL,
//  `placeofbirth` varchar(30) DEFAULT NULL,
//  `picture` longblob,
//  `appearancenotes` text,
//  `gradeid` int(11) DEFAULT NULL,
//  `idno` varchar(30) DEFAULT NULL,
//  `healthnotes` text,
//  `married` bit(1) DEFAULT NULL,
//  `active` bit(1) NOT NULL,
//  `verified` bit(1) NOT NULL,
//  `bankid` int(11) DEFAULT NULL,
//  `bankbranchid` int(11) DEFAULT NULL,
//  `branchid` varchar(30) NOT NULL,
//  `designationid` varchar(12) DEFAULT NULL,
//  `departmentid` varchar(12) DEFAULT NULL,
//  `datestarted` date DEFAULT NULL,
//  `firstsystempaydate` date DEFAULT NULL,
//  `post` varchar(30) DEFAULT NULL,
//  `contractrunoutdate` date DEFAULT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifedon` varchar(30) NOT NULL
//) ENGINE=MyISAM DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblguards`
//--
//
//INSERT INTO `tblguards` (`id`, `employeeid`, `firstname`, `middlename`, `surname`, `gender`, `dateofbirth`, `placeofbirth`, `picture`, `appearancenotes`, `gradeid`, `idno`, `healthnotes`, `married`, `active`, `verified`, `bankid`, `bankbranchid`, `branchid`, `designationid`, `departmentid`, `datestarted`, `firstsystempaydate`, `post`, `contractrunoutdate`, `datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`, `lastmachinemodifedon`) VALUES
//(1, 'EMP001', 'HUGGINS', 'T', 'MAFIGU', 'MALE', '2018-06-14', NULL, NULL, NULL, NULL, '45-195645A45', NULL, NULL, b'0', b'0', NULL, NULL, '', 'LABEL', 'DPT001', NULL, NULL, NULL, NULL, '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-18 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(2, 'EMP002', 'SAMUEL', 'K', 'CONWELL', 'MALE', '2018-06-14', NULL, NULL, NULL, NULL, '45-195645A45', NULL, NULL, b'0', b'0', NULL, NULL, '', 'DG001', 'DPT002', NULL, NULL, NULL, NULL, '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(3, 'EMP003', 'HELLENA', 'S', 'SEMEDOV', 'MALE', '2018-06-14', NULL, NULL, NULL, NULL, '45-195645A45', NULL, NULL, b'0', b'0', NULL, NULL, '', 'LABEL', 'DPT004', NULL, NULL, NULL, NULL, '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-18 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(4, 'EMP004', 'ELTON', 'D', 'NEZBERT', 'MALE', '2018-06-14', NULL, NULL, NULL, NULL, '45-195645A45', NULL, b'1', b'0', b'0', NULL, NULL, 'LBR001', 'DG001', 'DPT001', NULL, NULL, NULL, NULL, '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-14 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(5, 'EMP005', 'ruvarashe', 'pedra', 'chipamuriwo', 'FEMALE', '1997-06-24', NULL, NULL, NULL, NULL, '63-1421434B45', NULL, NULL, b'0', b'0', NULL, NULL, '', 'DG004', 'DPT005', NULL, NULL, NULL, NULL, '2018-06-19 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-19 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(6, 'EMP006', 'tanaka', 'm', 'semedov', 'MALE', '2018-06-19', NULL, NULL, NULL, NULL, '63-464566N65', NULL, NULL, b'0', b'0', NULL, NULL, '', 'DG003', 'DPT005', NULL, NULL, NULL, NULL, '2018-06-19 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-06-19 00:00:00.000000', 'USER-PC', 'USER-PC'),
//(7, 'EMP007', 'MARIA', 'OVONO', 'NGEMA', 'FEMALE', '2018-06-19', NULL, NULL, NULL, NULL, '4365EGF753-6765', NULL, NULL, b'0', b'0', NULL, NULL, '', 'LABEL', 'DPT003', NULL, NULL, NULL, NULL, '2018-06-19 00:00:00.000000', 'USER-PC', 'USER-PC', '2018-07-17 00:00:00.000000', 'USER-PC', 'USER-PC');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblguardskillshistory`
//--
//
//CREATE TABLE `tblguardskillshistory` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(16) NOT NULL,
//  `skillsid` varchar(16) NOT NULL,
//  `dateacquired` date NOT NULL,
//  `institute` varchar(30) NOT NULL,
//  `grade` varchar(12) NOT NULL,
//  `mark` double(3,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblhearingactions`
//--
//
//CREATE TABLE `tblhearingactions` (
//  `id` int(11) NOT NULL,
//  `actiontaken` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `description` text NOT NULL,
//  `hearingid` varchar(25) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblhearings`
//--
//
//CREATE TABLE `tblhearings` (
//  `id` int(11) NOT NULL,
//  `hearingid` varchar(25) NOT NULL,
//  `employeeid` varchar(25) NOT NULL,
//  `incidentid` int(11) NOT NULL,
//  `hearingdate` date NOT NULL,
//  `actiontaken` varchar(12) NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblholidays`
//--
//
//CREATE TABLE `tblholidays` (
//  `id` int(11) NOT NULL,
//  `holidaycode` varchar(12) NOT NULL,
//  `holiday` varchar(30) NOT NULL,
//  `date` date NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblincidents`
//--
//
//CREATE TABLE `tblincidents` (
//  `id` int(11) NOT NULL,
//  `incidentno` varchar(12) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `shift` varchar(16) NOT NULL,
//  `involvedemployee` varchar(30) NOT NULL,
//  `obno` int(11) NOT NULL,
//  `subject` varchar(16) NOT NULL,
//  `reportedby` varchar(30) NOT NULL,
//  `reportdate` date NOT NULL,
//  `employeeidreportedto` varchar(12) NOT NULL,
//  `reporttime` time(6) NOT NULL,
//  `reportingmode` varchar(30) NOT NULL,
//  `incidenttime` time(6) NOT NULL,
//  `incidentdate` date NOT NULL,
//  `incidenttype` varchar(12) NOT NULL,
//  `violationnumber` varchar(12) NOT NULL,
//  `incidentdescription` text NOT NULL,
//  `actiontaken` varchar(100) NOT NULL,
//  `policeinvolved` bit(6) NOT NULL,
//  `policeofficer` varchar(30) NOT NULL,
//  `policestation` varchar(50) NOT NULL,
//  `casenumber` varchar(30) NOT NULL,
//  `policedetective` varchar(30) NOT NULL,
//  `contactaddress` varchar(100) NOT NULL,
//  `contacttelnumber` varchar(30) NOT NULL,
//  `contactemail` varchar(30) NOT NULL,
//  `incidentstatus` bit(6) NOT NULL,
//  `furtheractionrequired` bit(6) NOT NULL,
//  `neccode` int(10) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `createdby` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblincidentypes`
//--
//
//CREATE TABLE `tblincidentypes` (
//  `id` int(11) NOT NULL,
//  `incidenttypeid` int(11) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `description` varchar(100) NOT NULL,
//  `violationnumber` varchar(12) NOT NULL,
//  `writtenwarning` bit(6) NOT NULL,
//  `finalwrittenwarning` bit(6) NOT NULL,
//  `twoweeksretraining` bit(6) NOT NULL,
//  `termination` bit(6) NOT NULL,
//  `onedaysuspension` bit(6) NOT NULL,
//  `twodaysuspension` bit(6) NOT NULL,
//  `dismissal` bit(6) NOT NULL,
//  `instantdismissal` bit(6) NOT NULL,
//  `demotion` bit(6) NOT NULL,
//  `twoweekssuspension` bit(6) NOT NULL,
//  `summarydismissal` bit(6) NOT NULL,
//  `deduction` bit(6) NOT NULL,
//  `allowanceid` int(6) NOT NULL,
//  `enforcementperiod` int(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblinvoice`
//--
//
//CREATE TABLE `tblinvoice` (
//  `id` int(11) NOT NULL,
//  `invoiceid` int(11) NOT NULL,
//  `invoiceref` varchar(25) NOT NULL,
//  `ref` varchar(25) NOT NULL,
//  `invoicedate` date NOT NULL,
//  `type` varchar(30) NOT NULL,
//  `clientid` varchar(16) NOT NULL,
//  `clientaccountnumber` varchar(12) NOT NULL,
//  `clientname` varchar(100) NOT NULL,
//  `accountmanagerusername` varchar(100) NOT NULL,
//  `address` varchar(100) NOT NULL,
//  `tel` varchar(16) NOT NULL,
//  `email` varchar(50) NOT NULL,
//  `fax` varchar(12) NOT NULL,
//  `vat` varchar(30) NOT NULL,
//  `bpn` bit(6) NOT NULL,
//  `proforma` varchar(30) NOT NULL,
//  `proformainvoiceonref` int(11) NOT NULL,
//  `notes` text NOT NULL,
//  `total` double(9,2) NOT NULL,
//  `totalvat` double(9,2) NOT NULL,
//  `vatpc` double(9,2) NOT NULL,
//  `datecollected` date NOT NULL,
//  `datepaid` date NOT NULL,
//  `createdby` int(6) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `creditnoteref` varchar(30) NOT NULL,
//  `creditnotedate` date NOT NULL,
//  `creditnotenotes` text NOT NULL,
//  `postedinvoice` bit(6) NOT NULL,
//  `postedcreditnote` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `currency` varchar(16) NOT NULL,
//  `fileid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblinvoicelineitems`
//--
//
//CREATE TABLE `tblinvoicelineitems` (
//  `id` int(11) NOT NULL,
//  `lineitemid` int(11) NOT NULL,
//  `invoiceid` int(11) NOT NULL,
//  `glsalescode` varchar(30) NOT NULL,
//  `chargedescription` text NOT NULL,
//  `quantity` int(11) NOT NULL,
//  `amount` double(9,2) NOT NULL,
//  `rateid` int(11) NOT NULL,
//  `glaccountid` int(11) NOT NULL,
//  `fileid` int(11) NOT NULL,
//  `filetype` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `ratecode` varchar(12) NOT NULL,
//  `lineref` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblleave`
//--
//
//CREATE TABLE `tblleave` (
//  `id` int(11) NOT NULL,
//  `leaveid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `leavetypeid` int(11) NOT NULL,
//  `startdate` date NOT NULL,
//  `expectedreturndate` date NOT NULL,
//  `actualreturndate` date NOT NULL,
//  `effectivedaystaken` double(18,2) NOT NULL,
//  `daysencashed` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `daysencashedpaid` bit(6) NOT NULL,
//  `balance` double(9,2) NOT NULL,
//  `authority` varchar(30) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `employeeallowdeductid` int(11) NOT NULL,
//  `payrunid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblleavebalance`
//--
//
//CREATE TABLE `tblleavebalance` (
//  `id` int(11) NOT NULL,
//  `leavebalanceid` int(11) NOT NULL,
//  `leavetypeid` int(11) NOT NULL,
//  `personnelid` int(11) NOT NULL,
//  `balance` double(9,2) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblleavebankdob`
//--
//
//CREATE TABLE `tblleavebankdob` (
//  `id` int(11) NOT NULL,
//  `empid` int(11) NOT NULL,
//  `forcenumber` varchar(30) NOT NULL,
//  `fnumberok` varchar(30) NOT NULL,
//  `surname` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `dob` date NOT NULL,
//  `startdate` date NOT NULL,
//  `bankaccountok` varchar(30) NOT NULL,
//  `leavebal` double(18,2) NOT NULL,
//  `leavebankdobid` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblleavetype`
//--
//
//CREATE TABLE `tblleavetype` (
//  `id` int(11) NOT NULL,
//  `leavetypeid` int(11) NOT NULL,
//  `leavecode` varchar(12) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `description` text NOT NULL,
//  `payable` bit(6) NOT NULL,
//  `payrate` double(9,2) NOT NULL,
//  `canbeencashed` bit(6) NOT NULL,
//  `annualtotaldaysallowable` int(11) NOT NULL,
//  `leaveceiling` int(11) NOT NULL,
//  `shifttypeid` int(11) NOT NULL,
//  `overstayshifttypeid` int(11) NOT NULL,
//  `defaultduration` int(11) NOT NULL,
//  `leavetypecn` varchar(12) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `systemdefined` bit(6) NOT NULL,
//  `showonpayslip` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblleaveupload`
//--
//
//CREATE TABLE `tblleaveupload` (
//  `id` int(11) NOT NULL,
//  `forcenumber` varchar(255) NOT NULL,
//  `firstname` varchar(255) NOT NULL,
//  `surname` varchar(255) NOT NULL,
//  `f4` varchar(255) NOT NULL,
//  `leave` double(18,2) NOT NULL,
//  `leaveuploadid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblloancashrepayment`
//--
//
//CREATE TABLE `tblloancashrepayment` (
//  `id` int(11) NOT NULL,
//  `allowdeductloancashrepaymentid` int(11) NOT NULL,
//  `allowdeductloanid` int(11) NOT NULL,
//  `paymentdate` date NOT NULL,
//  `amount` double(9,2) NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblmedicaldetails`
//--
//
//CREATE TABLE `tblmedicaldetails` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(12) NOT NULL,
//  `bloodgroup` varchar(12) NOT NULL,
//  `healthproblems` varchar(10000) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblmedicaldetails`
//--
//
//INSERT INTO `tblmedicaldetails` (`id`, `employeeid`, `bloodgroup`, `healthproblems`) VALUES
//(1, 'EMP004', 'OXY04', 'OBESITY');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblmessageclass`
//--
//
//CREATE TABLE `tblmessageclass` (
//  `id` int(11) NOT NULL,
//  `messageclassid` int(11) NOT NULL,
//  `classdescription` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblmopnthlybalancedsystemposts`
//--
//
//CREATE TABLE `tblmopnthlybalancedsystemposts` (
//  `id` int(11) NOT NULL,
//  `monthlysystempostid` int(11) NOT NULL,
//  `balancedsystemid` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `postcolor` varchar(100) NOT NULL,
//  `postpattern` varchar(100) NOT NULL,
//  `replacementpattern` varchar(100) NOT NULL,
//  `patternposition` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblnextofkin`
//--
//
//CREATE TABLE `tblnextofkin` (
//  `id` int(11) NOT NULL,
//  `nextofkinid` varchar(12) NOT NULL,
//  `employeeid` varchar(30) NOT NULL,
//  `nextofkinname` varchar(30) NOT NULL,
//  `nextofkinsurname` varchar(30) NOT NULL,
//  `addnextofkinhome` varchar(100) NOT NULL,
//  `addnexkinbus` varchar(100) NOT NULL,
//  `phonenextkinhome` varchar(30) NOT NULL,
//  `phonenextkinbus` varchar(30) NOT NULL,
//  `relationshipnext` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblnotes`
//--
//
//CREATE TABLE `tblnotes` (
//  `id` int(11) NOT NULL,
//  `noteid` int(11) NOT NULL,
//  `itemcode` varchar(16) NOT NULL,
//  `groupcodec` int(11) NOT NULL,
//  `date` date NOT NULL,
//  `notes` text NOT NULL,
//  `user` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccurance`
//--
//
//CREATE TABLE `tbloccurance` (
//  `id` int(11) NOT NULL,
//  `occuranceid` int(11) NOT NULL,
//  `occurancebookid` int(11) NOT NULL,
//  `occurancetypeid` int(11) NOT NULL,
//  `reportdate` date NOT NULL,
//  `occurancedate` date NOT NULL,
//  `referencenumber` varchar(30) NOT NULL,
//  `reportedto` varchar(60) NOT NULL,
//  `reportedby` varchar(60) NOT NULL,
//  `assignedtouserid` int(11) NOT NULL,
//  `subject` varchar(100) NOT NULL,
//  `description` text NOT NULL,
//  `rootcausecn` varchar(100) NOT NULL,
//  `actiontaken` varchar(100) NOT NULL,
//  `policeinvolved` bit(6) NOT NULL,
//  `policecasenumber` varchar(12) NOT NULL,
//  `policeofficer` varchar(60) NOT NULL,
//  `siteid` varchar(12) NOT NULL,
//  `sitename` varchar(30) NOT NULL,
//  `contactperson` varchar(100) NOT NULL,
//  `contactaddress` text NOT NULL,
//  `contacttelnumber` varchar(50) NOT NULL,
//  `contactemail` varchar(50) NOT NULL,
//  `notifycontact` bit(6) NOT NULL,
//  `statuscn` varchar(12) NOT NULL,
//  `preventitiveaction` varchar(1000) NOT NULL,
//  `duedate` date NOT NULL,
//  `closed` bit(6) NOT NULL,
//  `furtheractionrequired` bit(6) NOT NULL,
//  `zone` varchar(30) NOT NULL,
//  `lastoccuranceupdateid` int(11) NOT NULL,
//  `datecreated` datetime NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `supervisorempid` int(11) NOT NULL,
//  `supervisorforcenumber` varchar(30) NOT NULL,
//  `supervisorname` varchar(30) NOT NULL,
//  `supervisorsurname` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `smscontact` bit(6) NOT NULL,
//  `sitesysid` double(12,0) NOT NULL,
//  `billingqty` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccurancebook`
//--
//
//CREATE TABLE `tbloccurancebook` (
//  `id` int(11) NOT NULL,
//  `occurancebookid` int(11) NOT NULL,
//  `occurancebookname` varchar(100) NOT NULL,
//  `datecreated` date NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `occurancebookmanagerid` int(11) NOT NULL,
//  `restricted` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccurancebookallowedtypes`
//--
//
//CREATE TABLE `tbloccurancebookallowedtypes` (
//  `id` int(11) NOT NULL,
//  `occuranceallowedid` int(11) NOT NULL,
//  `occurancebookid` int(11) NOT NULL,
//  `occurancetypeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccuranceemployees`
//--
//
//CREATE TABLE `tbloccuranceemployees` (
//  `id` int(11) NOT NULL,
//  `occuranceemployeeid` int(11) NOT NULL,
//  `occuranceid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `forcenumber` varchar(25) NOT NULL,
//  `name` varchar(16) NOT NULL,
//  `surname` varchar(16) NOT NULL,
//  `nationaloffencecodeid` int(11) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccurancetype`
//--
//
//CREATE TABLE `tbloccurancetype` (
//  `id` int(11) NOT NULL,
//  `datecreated` date NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` date NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `occurancetypeid` int(11) NOT NULL,
//  `occurancecode` varchar(12) NOT NULL,
//  `occurancename` varchar(30) NOT NULL,
//  `occuranceclasscode` varchar(12) NOT NULL,
//  `positiveoccurance` varchar(12) NOT NULL,
//  `active` varchar(100) NOT NULL,
//  `occurancesubclascode` varchar(30) NOT NULL,
//  `defaultactivedays` int(11) NOT NULL,
//  `usercanextendactivedays` bit(6) NOT NULL,
//  `cannotifycontact` bit(6) NOT NULL,
//  `cansmscontact` bit(6) NOT NULL,
//  `smsassigneduser` bit(6) NOT NULL,
//  `rateid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloccuranceupdates`
//--
//
//CREATE TABLE `tbloccuranceupdates` (
//  `id` int(11) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `occuranceupdateid` int(11) NOT NULL,
//  `occuranceid` int(11) NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloffences`
//--
//
//CREATE TABLE `tbloffences` (
//  `id` int(11) NOT NULL,
//  `offencetypeid` int(11) NOT NULL,
//  `name` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloffensegrouping`
//--
//
//CREATE TABLE `tbloffensegrouping` (
//  `id` int(11) NOT NULL,
//  `groupid` int(11) NOT NULL,
//  `groupname` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloffensegrouplistingsublist`
//--
//
//CREATE TABLE `tbloffensegrouplistingsublist` (
//  `id` int(11) NOT NULL,
//  `offenselistingid` int(11) NOT NULL,
//  `offensegrouplistingsublistid` double(12,0) NOT NULL,
//  `offensegrouplistingsublistitemname` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloffensegroupverdict`
//--
//
//CREATE TABLE `tbloffensegroupverdict` (
//  `id` int(11) NOT NULL,
//  `groupid` int(11) NOT NULL,
//  `offensenumber` varchar(100) NOT NULL,
//  `verdict` varchar(100) NOT NULL,
//  `validity` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbloffensgrouplisting`
//--
//
//CREATE TABLE `tbloffensgrouplisting` (
//  `id` int(11) NOT NULL,
//  `groupid` int(11) NOT NULL,
//  `offenselistingid` int(11) NOT NULL,
//  `offenselistingname` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpatterns`
//--
//
//CREATE TABLE `tblpatterns` (
//  `id` int(11) NOT NULL,
//  `patternid` int(12) NOT NULL,
//  `pattern` int(60) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpaydetails`
//--
//
//CREATE TABLE `tblpaydetails` (
//  `id` int(11) NOT NULL,
//  `paypointci` varchar(12) NOT NULL,
//  `paypointprimaryid` varchar(16) NOT NULL,
//  `pensioner` bit(6) NOT NULL,
//  `totalcredits` double(9,2) NOT NULL,
//  `lastpaidfinancialperiodid` int(12) NOT NULL,
//  `paydatachanged` bit(6) NOT NULL,
//  `personalsignature` longblob NOT NULL,
//  `paystatus` varchar(30) NOT NULL,
//  `paydetailsid` varchar(30) NOT NULL,
//  `lastpaydate` date NOT NULL,
//  `payrunstage` varchar(12) NOT NULL,
//  `monthspaidinyear` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpaynetdata`
//--
//
//CREATE TABLE `tblpaynetdata` (
//  `id` int(11) NOT NULL,
//  `paynetdataid` int(11) NOT NULL,
//  `orgaccountnumber` varchar(30) NOT NULL,
//  `orgaccounttype` varchar(30) NOT NULL,
//  `orgsortcode` varchar(30) NOT NULL,
//  `trancode` varchar(30) NOT NULL,
//  `headerid` varchar(30) NOT NULL,
//  `headersenderid` varchar(30) NOT NULL,
//  `headerreceiverid` varchar(30) NOT NULL,
//  `hederfileid` int(11) NOT NULL,
//  `headerworkcode` varchar(12) NOT NULL,
//  `headersfiversion` int(11) NOT NULL,
//  `headersendername` varchar(30) NOT NULL,
//  `headerpackagename` varchar(30) NOT NULL,
//  `trailerid` varchar(3) NOT NULL,
//  `trailercurrencycode` varchar(3) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpaypoints`
//--
//
//CREATE TABLE `tblpaypoints` (
//  `id` int(11) NOT NULL,
//  `paypointid` int(11) NOT NULL,
//  `paypointname` varchar(100) NOT NULL,
//  `description` text NOT NULL,
//  `paradelist` varchar(100) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `userwhocreated` varchar(30) NOT NULL,
//  `payingpoint` bit(6) NOT NULL,
//  `paidbybankfile` bit(6) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayrun`
//--
//
//CREATE TABLE `tblpayrun` (
//  `id` int(11) NOT NULL,
//  `payrunid` int(11) NOT NULL,
//  `financialpayperiodidc` int(11) NOT NULL,
//  `payrungrouptype` varchar(12) NOT NULL,
//  `liverun` bit(6) NOT NULL,
//  `broadcastmsg` varchar(100) NOT NULL,
//  `notes` text NOT NULL,
//  `rundate` date NOT NULL,
//  `runuser` varchar(30) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodified` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `payfullbonus` bit(6) NOT NULL,
//  `paypartialbonus` bit(6) NOT NULL,
//  `bonusremarks` varchar(100) NOT NULL,
//  `bonusyear` int(11) NOT NULL,
//  `bonuspercentage` double(10,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayruncashdenomination`
//--
//
//CREATE TABLE `tblpayruncashdenomination` (
//  `id` int(11) NOT NULL,
//  `payruncashdenominationid` int(11) NOT NULL,
//  `payrunid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `paydenominationvalue` double(9,2) NOT NULL,
//  `qty` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayruncounter`
//--
//
//CREATE TABLE `tblpayruncounter` (
//  `id` int(11) NOT NULL,
//  `payruncounterid` int(11) NOT NULL,
//  `processed` int(11) NOT NULL,
//  `totalrecords` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayrungrouplist`
//--
//
//CREATE TABLE `tblpayrungrouplist` (
//  `id` int(11) NOT NULL,
//  `payrunlistid` int(11) NOT NULL,
//  `payrunid` int(11) NOT NULL,
//  `itemid` int(11) NOT NULL,
//  `itemname` varchar(60) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayruntaxband`
//--
//
//CREATE TABLE `tblpayruntaxband` (
//  `id` int(11) NOT NULL,
//  `payruntaxbandid` int(11) NOT NULL,
//  `lowerlimit` int(11) NOT NULL,
//  `upperlimit` int(11) NOT NULL,
//  `percentage` double(9,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayslip`
//--
//
//CREATE TABLE `tblpayslip` (
//  `id` int(11) NOT NULL,
//  `payslipid` int(11) NOT NULL,
//  `payrunid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `forcenumber` varchar(30) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `surname` varchar(30) NOT NULL,
//  `grade` varchar(30) NOT NULL,
//  `paradepoint` varchar(30) NOT NULL,
//  `payperiodid` int(11) NOT NULL,
//  `periodseqno` int(11) NOT NULL,
//  `paydate` date NOT NULL,
//  `nextpaydate` date NOT NULL,
//  `grossincome` double(9,2) NOT NULL,
//  `exemptions` double(9,2) NOT NULL,
//  `allowabledeductions` double(9,2) NOT NULL,
//  `taxablemoluments` double(9,2) NOT NULL,
//  `nontaxmoluments` double(18,2) NOT NULL,
//  `basicsalary` double(18,2) NOT NULL,
//  `annualleavebal` double(18,2) NOT NULL,
//  `occleavebal` double(18,2) NOT NULL,
//  `taxableallowances` double(18,2) NOT NULL,
//  `nontaxableallowances` double(18,2) NOT NULL,
//  `totalallowances` double(18,2) NOT NULL,
//  `totaldeductions` double(18,2) NOT NULL,
//  `netsalary` double(9,2) NOT NULL,
//  `methodofpaycn` varchar(30) NOT NULL,
//  `bank` varchar(30) NOT NULL,
//  `accountno` varchar(30) NOT NULL,
//  `personalmessage` varchar(100) NOT NULL,
//  `allmessages` varchar(100) NOT NULL,
//  `remarks` text NOT NULL,
//  `liverun` bit(6) NOT NULL,
//  `notpaidcn` varchar(30) NOT NULL,
//  `creditspaid` double(9,2) NOT NULL,
//  `ytdbasic` double(18,2) NOT NULL,
//  `ytdnetsalary` double(18,2) NOT NULL,
//  `ytdtaxemoluments` double(18,2) NOT NULL,
//  `ytdnontaxemoluments` double(18,2) NOT NULL,
//  `ytdgrossincome` double(18,2) NOT NULL,
//  `ytdexemptions` double(18,2) NOT NULL,
//  `ytdpension` double(18,2) NOT NULL,
//  `ytdpaye` double(18,2) NOT NULL,
//  `ytdnssa` double(18,2) NOT NULL,
//  `ytdallowances` double(18,2) NOT NULL,
//  `ytddeductions` double(18,2) NOT NULL,
//  `ytdtaxableallowances` double(18,2) NOT NULL,
//  `ytdnontaxableallowances` double(18,2) NOT NULL,
//  `ytdtaxcredits` double(18,2) NOT NULL,
//  `nssanumber` varchar(30) NOT NULL,
//  `ytdrecurringdeductions` double(18,2) NOT NULL,
//  `ytdnonrecurringdeductions` double(18,2) NOT NULL,
//  `pension` double(18,2) NOT NULL,
//  `paye` double(18,2) NOT NULL,
//  `nssa` double(18,2) NOT NULL,
//  `recurringallowancestotal` double(18,2) NOT NULL,
//  `nonrecurringallowancestotal` double(18,2) NOT NULL,
//  `ytdotherallowabledeductions` double(18,2) NOT NULL,
//  `ytdrecurringallowances` double(18,2) NOT NULL,
//  `ytdnonrecurringallowances` double(18,2) NOT NULL,
//  `zone` varchar(30) NOT NULL,
//  `bankbranch` varchar(30) NOT NULL,
//  `paypointci` int(11) NOT NULL,
//  `paypointcn` varchar(30) NOT NULL,
//  `aidslevy` double(18,2) NOT NULL,
//  `paypointprimaryid` int(30) NOT NULL,
//  `paypoitnprimaryname` varchar(30) NOT NULL,
//  `ytdextrabenefittax` double(18,2) NOT NULL,
//  `bankfileproduced` bit(6) NOT NULL,
//  `customfielda` varchar(60) NOT NULL,
//  `customfieldb` varchar(60) NOT NULL,
//  `customfieldc` varchar(60) NOT NULL,
//  `customfieldd` varchar(60) NOT NULL,
//  `customfielde` varchar(60) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayslipallowdeduct`
//--
//
//CREATE TABLE `tblpayslipallowdeduct` (
//  `id` int(11) NOT NULL,
//  `payslipallowdeducthistoryid` int(11) NOT NULL,
//  `paysliphistoryid` int(11) NOT NULL,
//  `allowdeductid` int(11) NOT NULL,
//  `allowdeductloanid` int(11) NOT NULL,
//  `allowdeductloanname` varchar(30) NOT NULL,
//  `creditoraccountnumber` varchar(30) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `shiftcount` double(9,2) NOT NULL,
//  `allowdeductclass` varchar(30) NOT NULL,
//  `allowdeductcode` varchar(30) NOT NULL,
//  `nonpayamount` double(18,2) NOT NULL,
//  `fullloanamount` double(18,2) NOT NULL,
//  `loanbalance` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpayslipunpaidallowdeduct`
//--
//
//CREATE TABLE `tblpayslipunpaidallowdeduct` (
//  `id` int(11) NOT NULL,
//  `payslipallowdeducthistoryid` int(11) NOT NULL,
//  `paysliphistoryid` int(11) NOT NULL,
//  `allowdeductid` int(11) NOT NULL,
//  `allowdeductloanid` int(11) NOT NULL,
//  `allowdeductname` varchar(30) NOT NULL,
//  `creditoraccountnumber` varchar(30) NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `allowancededuction` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpaystoppage`
//--
//
//CREATE TABLE `tblpaystoppage` (
//  `id` int(11) NOT NULL,
//  `payrunpaystopid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `paystoppagereason` int(50) NOT NULL,
//  `stopdate` date NOT NULL,
//  `stopagenotes` text NOT NULL,
//  `resumedate` date NOT NULL,
//  `resumptionnotes` text NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `paycurrentpayperiod` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpaytablenew`
//--
//
//CREATE TABLE `tblpaytablenew` (
//  `id` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `forcenumber` varchar(12) NOT NULL,
//  `firstname` varchar(30) NOT NULL,
//  `surname` varchar(30) NOT NULL,
//  `hrtype` varchar(12) NOT NULL,
//  `totalhours` double(5,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpersperincident`
//--
//
//CREATE TABLE `tblpersperincident` (
//  `id` int(11) NOT NULL,
//  `incidentno` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `involvementdesc` varchar(120) NOT NULL,
//  `notes` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpostallowances`
//--
//
//CREATE TABLE `tblpostallowances` (
//  `id` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `allowanceid` int(11) NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpostassetrequirements`
//--
//
//CREATE TABLE `tblpostassetrequirements` (
//  `id` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `assettypecode` int(11) NOT NULL,
//  `quantity` int(11) NOT NULL,
//  `quantityoutstanding` int(11) NOT NULL,
//  `billable` bit(6) NOT NULL,
//  `postassetreqid` int(11) NOT NULL,
//  `sitesysid` int(11) NOT NULL,
//  `assettypecodeid` int(11) NOT NULL,
//  `assetcodeid` int(11) NOT NULL,
//  `assetcode` varchar(30) NOT NULL,
//  `qtyissued` int(11) NOT NULL,
//  `rateid` int(12) NOT NULL,
//  `recurringbilling` bit(6) NOT NULL,
//  `lastbillingtodate` date NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `overridebillingamount` double(18,2) NOT NULL,
//  `overridebillingline` varchar(60) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpostmodifcationhistory`
//--
//
//CREATE TABLE `tblpostmodifcationhistory` (
//  `id` int(11) NOT NULL,
//  `postid` varchar(16) NOT NULL,
//  `postname` varchar(16) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `grade` varchar(12) NOT NULL,
//  `gender` varchar(12) NOT NULL,
//  `shifttype` int(11) NOT NULL,
//  `mondayreq` int(11) NOT NULL,
//  `tuesdayreq` int(11) NOT NULL,
//  `wednesdayreq` int(11) NOT NULL,
//  `thursdayreq` int(11) NOT NULL,
//  `fridayreq` int(11) NOT NULL,
//  `saturdayreq` int(11) NOT NULL,
//  `sundayreq` int(11) NOT NULL,
//  `holidayreq` int(11) NOT NULL,
//  `overridegrade` bit(6) NOT NULL,
//  `overridegender` bit(6) NOT NULL,
//  `overridebillingamount` double(18,2) NOT NULL,
//  `empid` int(11) NOT NULL,
//  `hours_fri_afternoon_shift` int(11) NOT NULL,
//  `hours_fri_day_shift` int(11) NOT NULL,
//  `hours_fri_night_shift` int(11) NOT NULL,
//  `hours_hol_afternoon_shift` int(11) NOT NULL,
//  `hours_hol_day_shift` int(11) NOT NULL,
//  `hours_hol_night_shift` int(11) NOT NULL,
//  `hours_mon_afternoon_shift` int(11) NOT NULL,
//  `hours_mon_day_shift` int(11) NOT NULL,
//  `hours_mon_night_shift` int(11) NOT NULL,
//  `hours_sat_afternoon_shift` int(11) NOT NULL,
//  `hours_sat_day_shift` int(11) NOT NULL,
//  `hours_sat_night_shift` int(11) NOT NULL,
//  `hours_sun_afternoon_shift` int(11) NOT NULL,
//  `hours_sun_day_shift` int(11) NOT NULL,
//  `hours_sun_night_shift` int(11) NOT NULL,
//  `hours_thur_afternoon_shift` int(11) NOT NULL,
//  `hours_thur_day_shift` int(11) NOT NULL,
//  `hours_thur_night_shift` int(11) NOT NULL,
//  `hours_tue_afternoon_shift` int(11) NOT NULL,
//  `hours_tue_day_shift` int(11) NOT NULL,
//  `hours_tue_night_shift` int(11) NOT NULL,
//  `hours_wed_afternoon_shift` int(11) NOT NULL,
//  `hours_wed_night_shift` int(11) NOT NULL,
//  `hours_wed_day_shift` int(11) NOT NULL,
//  `time_fri_afternoon_end` time(6) NOT NULL,
//  `time_fri_afternoon_start` time(6) NOT NULL,
//  `time_fri_night_end` time(6) NOT NULL,
//  `time_fri_night_start` time(6) NOT NULL,
//  `time_fri_day_end` time(6) NOT NULL,
//  `time_fri_day_start` time(6) NOT NULL,
//  `time_mon_afternoon_end` time(6) NOT NULL,
//  `time_mon_afternoon_start` time(6) NOT NULL,
//  `time_mon_day_end` time(6) NOT NULL,
//  `time_mon_day_start` time(6) NOT NULL,
//  `time_mon_night_end` time(6) NOT NULL,
//  `time_mon_night_start` time(6) NOT NULL,
//  `time_sat_afternoon_end` time(6) NOT NULL,
//  `time_sat_afternoon_start` time(6) NOT NULL,
//  `time_sat_day_end` time(6) NOT NULL,
//  `time_sat_day_start` time(6) NOT NULL,
//  `time_sat_night_end` time(6) NOT NULL,
//  `time_sat_night_start` time(6) NOT NULL,
//  `time_sun_afternoon_end` time(6) NOT NULL,
//  `time_sun_afternoon_start` time(6) NOT NULL,
//  `time_sun_day_end` time(6) NOT NULL,
//  `time_sun_day_start` time(6) NOT NULL,
//  `time_sun_night_end` time(6) NOT NULL,
//  `time_sun_night_start` time(6) NOT NULL,
//  `time_thur_afternoon_end` time(6) NOT NULL,
//  `time_thur_afternoon_start` time(6) NOT NULL,
//  `time_thur_day_end` time(6) NOT NULL,
//  `time_thur_day_start` time(6) NOT NULL,
//  `time_thur_night_end` time(6) NOT NULL,
//  `time_thur_night_start` time(6) NOT NULL,
//  `time_tue_afternoon_end` time(6) NOT NULL,
//  `time_tue_afternoon_start` time(6) NOT NULL,
//  `time_tue_day_end` time(6) NOT NULL,
//  `time_tue_day_start` time(6) NOT NULL,
//  `time_tue_night_end` time(6) NOT NULL,
//  `time_tue_night_start` time(6) NOT NULL,
//  `time_wedn_afternoon_end` time(6) NOT NULL,
//  `time_wedn_afternoon_start` time(6) NOT NULL,
//  `time_wedn_day_end` time(6) NOT NULL,
//  `time_wedn_day_start` time(6) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `commencementdate` date NOT NULL,
//  `enddate` date NOT NULL,
//  `paradingpoint` int(11) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `datemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `modifiedby` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblposts`
//--
//
//CREATE TABLE `tblposts` (
//  `id` int(11) NOT NULL,
//  `post` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblposttrainingrequirement`
//--
//
//CREATE TABLE `tblposttrainingrequirement` (
//  `id` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `subjectid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpromotions`
//--
//
//CREATE TABLE `tblpromotions` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(12) NOT NULL,
//  `grade` varchar(30) NOT NULL,
//  `dateofpromotions` date NOT NULL,
//  `notes` text NOT NULL,
//  `promotingofficer` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblpromotionsuccession`
//--
//
//CREATE TABLE `tblpromotionsuccession` (
//  `id` int(11) NOT NULL,
//  `grade` varchar(12) NOT NULL,
//  `servingyears` int(11) NOT NULL,
//  `targetgrade` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrates`
//--
//
//CREATE TABLE `tblrates` (
//  `id` int(11) NOT NULL,
//  `rateid` int(11) NOT NULL,
//  `ratetypecn` varchar(30) NOT NULL,
//  `applicabletocn` varchar(25) NOT NULL,
//  `ratecode` varchar(25) NOT NULL,
//  `ratename` varchar(30) NOT NULL,
//  `description` text NOT NULL,
//  `amount` double(18,2) NOT NULL,
//  `costamount` double(18,2) NOT NULL,
//  `glaccount` varchar(30) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitdependance`
//--
//
//CREATE TABLE `tblrecruitdependance` (
//  `id` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `spousename` varchar(30) NOT NULL,
//  `spousesurname` varchar(30) NOT NULL,
//  `numberofdependance` int(11) NOT NULL,
//  `dependancenotes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitnextkin`
//--
//
//CREATE TABLE `tblrecruitnextkin` (
//  `id` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `nextkinname` varchar(30) NOT NULL,
//  `nextkinsurname` varchar(30) NOT NULL,
//  `addnextkinhome` text NOT NULL,
//  `addnextofkinbus` text NOT NULL,
//  `phonenextkinhome` varchar(100) NOT NULL,
//  `phonenextkinbus` varchar(100) NOT NULL,
//  `relationshipnextkin` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitsbio`
//--
//
//CREATE TABLE `tblrecruitsbio` (
//  `id` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `firstname` varchar(16) NOT NULL,
//  `surname` varchar(16) NOT NULL,
//  `gender` varchar(6) NOT NULL,
//  `dateofbirth` date NOT NULL,
//  `placeofbirth` varchar(30) NOT NULL,
//  `countryoforigin` varchar(30) NOT NULL,
//  `picture` longblob NOT NULL,
//  `appearancenotes` text NOT NULL,
//  `idno` varchar(16) NOT NULL,
//  `healthnotes` text NOT NULL,
//  `married` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `discarded` bit(6) NOT NULL,
//  `uniformdeposit` double(18,2) NOT NULL,
//  `score` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitscontacts`
//--
//
//CREATE TABLE `tblrecruitscontacts` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(11) NOT NULL,
//  `areacode` varchar(16) NOT NULL,
//  `countrycode` varchar(16) NOT NULL,
//  `contacttelno` varchar(16) NOT NULL,
//  `addresslinephysicalone` text NOT NULL,
//  `addresslinephysicaltwo` text NOT NULL,
//  `addresslinephysicalthree` text NOT NULL,
//  `addrural` text NOT NULL,
//  `addlinepostalone` text NOT NULL,
//  `addlinepostaltwo` text NOT NULL,
//  `addlinepostalthree` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblrecruitscontacts`
//--
//
//INSERT INTO `tblrecruitscontacts` (`id`, `employeeid`, `areacode`, `countrycode`, `contacttelno`, `addresslinephysicalone`, `addresslinephysicaltwo`, `addresslinephysicalthree`, `addrural`, `addlinepostalone`, `addlinepostaltwo`, `addlinepostalthree`) VALUES
//(1, 'EMP004', '+263', '+263', '0782326160', '4058 Warren Park D, Harare', '4890 Warren Park D, Harare', '', 'Murehwa', '(04)3434434', '', '');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitsemploymentinfo`
//--
//
//CREATE TABLE `tblrecruitsemploymentinfo` (
//  `id` int(11) NOT NULL,
//  `datestarted` date NOT NULL,
//  `employedby` varchar(30) NOT NULL,
//  `appointmentletterind` bit(6) NOT NULL,
//  `remarks` text NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `nssa` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrecruitvillage`
//--
//
//CREATE TABLE `tblrecruitvillage` (
//  `id` int(11) NOT NULL,
//  `chief` varchar(30) NOT NULL,
//  `headman` varchar(30) NOT NULL,
//  `village` varchar(30) NOT NULL,
//  `fathername` varchar(30) NOT NULL,
//  `fathersurname` varchar(30) NOT NULL,
//  `mothername` varchar(30) NOT NULL,
//  `mothersurname` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrefrees`
//--
//
//CREATE TABLE `tblrefrees` (
//  `id` int(11) NOT NULL,
//  `referenceid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `nationalid` varchar(16) NOT NULL,
//  `refereeemployeeid` int(11) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `physicaladdress` text NOT NULL,
//  `postaladdress` text NOT NULL,
//  `telnumber` varchar(16) NOT NULL,
//  `celnumber` varchar(16) NOT NULL,
//  `busaddress` text NOT NULL,
//  `bustelnumber` varchar(16) NOT NULL,
//  `relationship` varchar(30) NOT NULL,
//  `dateofreference` date NOT NULL,
//  `checked` bit(6) NOT NULL,
//  `checkedby` varchar(30) NOT NULL,
//  `checkedbydate` date NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrelievers`
//--
//
//CREATE TABLE `tblrelievers` (
//  `id` int(11) NOT NULL,
//  `siteid` varchar(12) NOT NULL,
//  `employeeid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblrelieverslisting`
//--
//
//CREATE TABLE `tblrelieverslisting` (
//  `id` int(11) NOT NULL,
//  `relieverid` int(11) NOT NULL,
//  `paradepoint` varchar(16) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `mondaypost` varchar(16) NOT NULL,
//  `tuesdaypost` varchar(16) NOT NULL,
//  `wednesdaypost` varchar(16) NOT NULL,
//  `thursdaypost` varchar(16) NOT NULL,
//  `fridaypost` varchar(16) NOT NULL,
//  `saturdaypost` varchar(16) NOT NULL,
//  `sundaypost` varchar(16) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblreligion`
//--
//
//CREATE TABLE `tblreligion` (
//  `id` int(11) NOT NULL,
//  `religionid` varchar(12) NOT NULL,
//  `religion` varchar(100) NOT NULL,
//  `employeeid` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblreportpump`
//--
//
//CREATE TABLE `tblreportpump` (
//  `id` int(11) NOT NULL,
//  `reportid` varchar(16) NOT NULL,
//  `taskname` varchar(30) NOT NULL,
//  `description` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `actionargs` varchar(100) NOT NULL,
//  `triggerfrequency` varchar(16) NOT NULL,
//  `triggerdetails` varchar(60) NOT NULL,
//  `startdate` date NOT NULL,
//  `enddate` date NOT NULL,
//  `entityid` varchar(16) NOT NULL,
//  `published` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblscanneddocuments`
//--
//
//CREATE TABLE `tblscanneddocuments` (
//  `id` int(11) NOT NULL,
//  `identitynumber` varchar(30) NOT NULL,
//  `documentname` varchar(100) NOT NULL,
//  `notes` text NOT NULL,
//  `scanneddocument` longblob NOT NULL,
//  `entitytypec` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblscheduledshhiftallowances`
//--
//
//CREATE TABLE `tblscheduledshhiftallowances` (
//  `id` int(11) NOT NULL,
//  `shiftid` int(11) NOT NULL,
//  `allowanceid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblschedulesnew`
//--
//
//CREATE TABLE `tblschedulesnew` (
//  `id` int(11) NOT NULL,
//  `shiftid` int(11) NOT NULL,
//  `deploymentsheetid` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `starttime` time NOT NULL,
//  `endtime` time NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblshifttypes`
//--
//
//CREATE TABLE `tblshifttypes` (
//  `id` int(11) NOT NULL,
//  `shifttypeid` int(11) NOT NULL,
//  `shifttype` varchar(100) NOT NULL,
//  `shifttypedescription` text NOT NULL,
//  `datecapture` date NOT NULL,
//  `issystemdefined` bit(6) NOT NULL,
//  `isexception` bit(6) NOT NULL,
//  `masterschedule` bit(6) NOT NULL,
//  `liveschedule` bit(6) NOT NULL,
//  `actualschedule` bit(6) NOT NULL,
//  `twodayhours` int(11) NOT NULL,
//  `threedayhours` int(11) NOT NULL,
//  `twodaystart` time(6) NOT NULL,
//  `twodayend` time(6) NOT NULL,
//  `threedaystart` time(6) NOT NULL,
//  `threedayend` time(6) NOT NULL,
//  `allowanceimplication` int(11) NOT NULL,
//  `paid` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsiteallowances`
//--
//
//CREATE TABLE `tblsiteallowances` (
//  `id` int(11) NOT NULL,
//  `siteid` varchar(12) NOT NULL,
//  `allowanceid` int(11) NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsiteguardexclusions`
//--
//
//CREATE TABLE `tblsiteguardexclusions` (
//  `id` int(11) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `employedid` int(11) NOT NULL,
//  `dateexcluded` date NOT NULL,
//  `reason` varchar(100) NOT NULL,
//  `siteguardexclusionid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsiterequirements`
//--
//
//CREATE TABLE `tblsiterequirements` (
//  `id` int(11) NOT NULL,
//  `postid` int(11) NOT NULL,
//  `postname` varchar(16) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `grade` varchar(16) NOT NULL,
//  `gender` varchar(12) NOT NULL,
//  `shifttype` varchar(16) NOT NULL,
//  `mondayreq` int(11) NOT NULL,
//  `tuesdayreq` int(11) NOT NULL,
//  `wednesdayreq` int(11) NOT NULL,
//  `thursdayreq` int(11) NOT NULL,
//  `fridayreq` int(11) NOT NULL,
//  `saturdayreq` int(11) NOT NULL,
//  `sundayreq` int(11) NOT NULL,
//  `holidayreq` int(11) NOT NULL,
//  `overridegrade` int(11) NOT NULL,
//  `overridegender` int(11) NOT NULL,
//  `overridebillingamount` double(18,2) NOT NULL,
//  `empid` int(11) NOT NULL,
//  `hours_fri_afternoon_shift` int(11) NOT NULL,
//  `hours_fri_day_shift` int(11) NOT NULL,
//  `hours_fri_night_shift` int(11) NOT NULL,
//  `hours_hol_afternoon_shift` int(11) NOT NULL,
//  `hours_hol_day_shift` int(11) NOT NULL,
//  `hours_hol_night_shift` int(11) NOT NULL,
//  `hours_mon_afternoon_shift` int(11) NOT NULL,
//  `hours_mon_day_shift` int(11) NOT NULL,
//  `hours_mon_night_shift` int(11) NOT NULL,
//  `hours_sat_afternoon_shift` int(11) NOT NULL,
//  `hours_sat_day_shift` int(11) NOT NULL,
//  `hours_sat_night_shift` int(11) NOT NULL,
//  `hours_sun_afternoon_shift` int(11) NOT NULL,
//  `hours_sun_day_shift` int(11) NOT NULL,
//  `hours_sun_night_shift` int(11) NOT NULL,
//  `hours_thur_afternoon_shift` int(11) NOT NULL,
//  `hours_thur_day_shift` int(11) NOT NULL,
//  `hours_thur_night_shift` int(11) NOT NULL,
//  `hours_tue_afternoon_shift` int(11) NOT NULL,
//  `hours_tue_day_shift` int(11) NOT NULL,
//  `hours_tue_night_shift` int(11) NOT NULL,
//  `hours_wedn_afternoon_shift` int(11) NOT NULL,
//  `hours_wedn_day_shift` int(11) NOT NULL,
//  `hours_wedn_night_shift` int(11) NOT NULL,
//  `time_hol_afternoon_end` time(6) NOT NULL,
//  `time_hol_afternoon_start` time(6) NOT NULL,
//  `time_hol_night_end` time(6) NOT NULL,
//  `time_hol_night_start` time(6) NOT NULL,
//  `time_hol_day_end` time(6) NOT NULL,
//  `time_hol_day_start` time(6) NOT NULL,
//  `time_mon_afternoon_end` time(6) NOT NULL,
//  `time_mon_afternoon_start` time(6) NOT NULL,
//  `time_mon_day_end` time(6) NOT NULL,
//  `time_mon_day_start` time(6) NOT NULL,
//  `time_mon_night_end` time(6) NOT NULL,
//  `time_mon_night_start` time(6) NOT NULL,
//  `time_tue_afternoon_end` time(6) NOT NULL,
//  `time_tue_afternoon_start` time(6) NOT NULL,
//  `time_tue_day_end` time(6) NOT NULL,
//  `time_tue_day_start` time(6) NOT NULL,
//  `time_tue_night_end` time(6) NOT NULL,
//  `time_tue_night_start` time(6) NOT NULL,
//  `time_wedn_afternoon_end` time(6) NOT NULL,
//  `time_wedn_afternoon_start` time(6) NOT NULL,
//  `time_wedn_day_end` time(6) NOT NULL,
//  `time_wedn_day_start` time(6) NOT NULL,
//  `time_wedn_night_end` time(6) NOT NULL,
//  `time_wedn_night_start` time(6) NOT NULL,
//  `time_thur_afternoon_end` time(6) NOT NULL,
//  `time_thur_afternoon_start` time(6) NOT NULL,
//  `time_thur_day_end` time(6) NOT NULL,
//  `time_thur_day_start` time(6) NOT NULL,
//  `time_thur_night_end` time(6) NOT NULL,
//  `time_thur_night_start` time(6) NOT NULL,
//  `time_fri_afternoon_end` time(6) NOT NULL,
//  `time_fri_afternoon_start` time(6) NOT NULL,
//  `time_fri_day_end` time(6) NOT NULL,
//  `time_fri_day_start` time(6) NOT NULL,
//  `time_fri_night_end` time(6) NOT NULL,
//  `time_fri_night_start` time(6) NOT NULL,
//  `time_sat_afternoon_end` time(6) NOT NULL,
//  `time_sat_afternoon_start` time(6) NOT NULL,
//  `time_sat_night_end` time(6) NOT NULL,
//  `time_sat_night_start` time(6) NOT NULL,
//  `time_sat_day_end` time(6) NOT NULL,
//  `time_sat_day_start` time(6) NOT NULL,
//  `time_sun_afternoon_end` time(6) NOT NULL,
//  `time_sun_afternoon_start` time(6) NOT NULL,
//  `time_sun_night_end` time(6) NOT NULL,
//  `time_sun_night_start` time(6) NOT NULL,
//  `time_sun_day_end` time(6) NOT NULL,
//  `time_sun_day_start` time(6) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `commencementdate` date NOT NULL,
//  `enddate` date NOT NULL,
//  `paradingpoint` int(11) NOT NULL,
//  `preferedparadingpoint` varchar(30) NOT NULL,
//  `displayview` int(11) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `createdby` varchar(30) NOT NULL,
//  `datedeleted` date NOT NULL,
//  `deletedby` varchar(30) NOT NULL,
//  `billable` bit(6) NOT NULL,
//  `rateid` int(11) NOT NULL,
//  `lastbillingtodate` date NOT NULL,
//  `overridebillingline` varchar(60) NOT NULL,
//  `wrnotes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsiterequirementsother`
//--
//
//CREATE TABLE `tblsiterequirementsother` (
//  `id` int(11) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `assettypecode` varchar(16) NOT NULL,
//  `qty` int(11) NOT NULL,
//  `quantityoutstanding` int(11) NOT NULL,
//  `postid` varchar(16) NOT NULL,
//  `assetcodeid` varchar(16) NOT NULL,
//  `issuedqty` int(11) NOT NULL,
//  `reissueperiod` int(11) NOT NULL,
//  `lastissuedate` date NOT NULL,
//  `usercreated` varchar(12) NOT NULL,
//  `userdeleted` varchar(16) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `datedeleted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `reqotherid` int(11) NOT NULL,
//  `rateid` int(11) NOT NULL,
//  `recurringbilling` bit(6) NOT NULL,
//  `lastbillingtodate` date NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsites`
//--
//
//CREATE TABLE `tblsites` (
//  `id` int(11) NOT NULL,
//  `siteid` varchar(12) NOT NULL,
//  `areacode` varchar(30) NOT NULL,
//  `telno` varchar(16) NOT NULL,
//  `faxno` varchar(16) NOT NULL,
//  `contactnoone` varchar(16) NOT NULL,
//  `contactnotwo` varchar(16) NOT NULL,
//  `emergencyadd` text NOT NULL,
//  `emergencytel` varchar(16) NOT NULL,
//  `physicaladdress` text NOT NULL,
//  `surbub` text NOT NULL,
//  `citytownid` int(11) NOT NULL,
//  `postaladdress` text NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL,
//  `terminationreason` varchar(100) NOT NULL,
//  `holidayreq` bit(6) NOT NULL,
//  `shiftsperday` int(11) NOT NULL,
//  `emailaddress` varchar(100) NOT NULL,
//  `suspended` bit(6) NOT NULL,
//  `dayshift` bit(6) NOT NULL,
//  `afternoonshift` bit(6) NOT NULL,
//  `nightshift` bit(6) NOT NULL,
//  `accountnumber` varchar(16) NOT NULL,
//  `tag` varchar(100) NOT NULL,
//  `natureofbusinessc` int(11) NOT NULL,
//  `sitesysid` int(11) NOT NULL,
//  `clientid` int(11) NOT NULL,
//  `sitetypecn` varchar(60) NOT NULL,
//  `targetpcprofit` double(18,2) NOT NULL,
//  `discountname` varchar(100) NOT NULL,
//  `discountpc` double(18,2) NOT NULL COMMENT 'Double precision floating point instead of FLOAT datatype for all monetary values',
//  `wrnotes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsitesuspensions`
//--
//
//CREATE TABLE `tblsitesuspensions` (
//  `id` int(11) NOT NULL,
//  `suspensionid` varchar(16) NOT NULL,
//  `siteid` varchar(16) NOT NULL,
//  `datefrom` date NOT NULL,
//  `dateto` date NOT NULL,
//  `suspensionreason` varchar(100) NOT NULL,
//  `active` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblskills`
//--
//
//CREATE TABLE `tblskills` (
//  `id` int(11) NOT NULL,
//  `skillid` int(11) NOT NULL,
//  `skilldesc` varchar(100) NOT NULL,
//  `skilldesclong` varchar(100) NOT NULL,
//  `validityperiod` bigint(100) NOT NULL,
//  `courseid` int(11) NOT NULL,
//  `active` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsocialmedia`
//--
//
//CREATE TABLE `tblsocialmedia` (
//  `id` int(11) NOT NULL,
//  `socialmediaid` varchar(12) NOT NULL,
//  `employeeid` varchar(12) NOT NULL,
//  `socialmedialink` varchar(1000) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblsocialmedia`
//--
//
//INSERT INTO `tblsocialmedia` (`id`, `socialmediaid`, `employeeid`, `socialmedialink`) VALUES
//(1, 'SCL001', 'EMP004', 'facebook.com/octopusinc');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsstnotifications`
//--
//
//CREATE TABLE `tblsstnotifications` (
//  `id` int(11) NOT NULL,
//  `notificationid` varchar(16) NOT NULL,
//  `notificationdate` datetime(6) NOT NULL,
//  `objectid` int(11) NOT NULL,
//  `objectname` varchar(100) NOT NULL,
//  `emailadds` text NOT NULL,
//  `ccemail` text NOT NULL,
//  `bccemail` text NOT NULL,
//  `smsnotification` text NOT NULL,
//  `notificationtype` varchar(500) NOT NULL,
//  `subject` text NOT NULL,
//  `attachementfilename` text NOT NULL,
//  `message` text NOT NULL,
//  `attachment` varchar(500) NOT NULL,
//  `sendretry` tinyint(4) NOT NULL,
//  `lasterror` varchar(500) NOT NULL,
//  `emailsent` bit(6) NOT NULL,
//  `smssent` bit(6) NOT NULL,
//  `successfullyprocessed` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsstnotificationsubscriptions`
//--
//
//CREATE TABLE `tblsstnotificationsubscriptions` (
//  `id` int(11) NOT NULL,
//  `notificationsubscriptionid` int(11) NOT NULL,
//  `userid` int(11) NOT NULL,
//  `entityid` int(11) NOT NULL,
//  `entitytypename` varchar(60) NOT NULL,
//  `notifyoncreated` bit(6) NOT NULL,
//  `notifyonupdated` bit(6) NOT NULL,
//  `notifyonoverdue` bit(6) NOT NULL,
//  `notifyclosed` bit(6) NOT NULL,
//  `rowversion` int(11) NOT NULL,
//  `datecreated` datetime(6) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `active` bit(6) NOT NULL,
//  `subtoemail` bit(6) NOT NULL,
//  `subtosms` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsstreporting`
//--
//
//CREATE TABLE `tblsstreporting` (
//  `id` int(11) NOT NULL,
//  `reportid` int(11) NOT NULL,
//  `reportgroups` int(100) NOT NULL,
//  `code` varchar(12) NOT NULL,
//  `name` varchar(100) NOT NULL,
//  `customreport` bit(6) NOT NULL,
//  `idparametername` varchar(30) NOT NULL,
//  `timespanname` varchar(30) NOT NULL,
//  `sql` varchar(50000) NOT NULL,
//  `reportfile` longblob NOT NULL,
//  `reportfilename` varchar(60) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `machinecreatedon` int(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodiedon` varchar(30) NOT NULL,
//  `rowversion` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsuppliers`
//--
//
//CREATE TABLE `tblsuppliers` (
//  `id` int(11) NOT NULL,
//  `supplierid` int(11) NOT NULL,
//  `suppliername` varchar(100) NOT NULL,
//  `telephonenumber` varchar(30) NOT NULL,
//  `physicaladdress` text NOT NULL,
//  `postaltaddress` text NOT NULL,
//  `contactperson` varchar(30) NOT NULL,
//  `emailaddress` text NOT NULL,
//  `website` text NOT NULL,
//  `notes` text NOT NULL,
//  `faxnumber` varchar(30) NOT NULL,
//  `suppliercode` varchar(30) NOT NULL,
//  `taxvatnumber` varchar(30) NOT NULL,
//  `deleted` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `userdeleted` varchar(30) NOT NULL,
//  `datedeleted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6)
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblswitchpairing`
//--
//
//CREATE TABLE `tblswitchpairing` (
//  `id` int(11) NOT NULL,
//  `employee1` int(11) NOT NULL,
//  `employee2` int(11) NOT NULL,
//  `datepaired` date NOT NULL,
//  `datelastswitched` date NOT NULL,
//  `switchinterval` int(11) NOT NULL,
//  `pairingactive` bit(6) NOT NULL,
//  `pairingid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblswitchpairingsettings`
//--
//
//CREATE TABLE `tblswitchpairingsettings` (
//  `id` int(11) NOT NULL,
//  `settingid` int(11) NOT NULL,
//  `settingkey` varchar(30) NOT NULL,
//  `settingname` varchar(30) NOT NULL,
//  `value` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsysbackup`
//--
//
//CREATE TABLE `tblsysbackup` (
//  `id` int(11) NOT NULL,
//  `type` int(11) NOT NULL,
//  `name` varchar(30) NOT NULL,
//  `folder` varchar(100) NOT NULL,
//  `recursivetimeday` int(11) NOT NULL,
//  `incremental` bit(6) NOT NULL,
//  `sysbackupid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsyssettings`
//--
//
//CREATE TABLE `tblsyssettings` (
//  `id` int(11) NOT NULL,
//  `settingid` int(11) NOT NULL,
//  `settingname` varchar(60) NOT NULL,
//  `type` varchar(16) NOT NULL,
//  `stringname` varchar(100) NOT NULL,
//  `string` varchar(30) NOT NULL,
//  `numericname` varchar(30) NOT NULL,
//  `numericc` double(12,6) NOT NULL,
//  `textname` varchar(30) NOT NULL,
//  `text` text NOT NULL,
//  `visible` bit(6) NOT NULL,
//  `createdby` varchar(30) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `rowguid` varchar(500) NOT NULL,
//  `binarydata` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystembackup`
//--
//
//CREATE TABLE `tblsystembackup` (
//  `id` int(11) NOT NULL,
//  `backupid` int(11) NOT NULL,
//  `databasename` varchar(100) NOT NULL,
//  `typec` int(11) NOT NULL,
//  `backupname` varchar(100) NOT NULL,
//  `filename` varchar(100) NOT NULL,
//  `recursivetimeday` datetime(6) NOT NULL,
//  `incrementalvalue` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemcodes`
//--
//
//CREATE TABLE `tblsystemcodes` (
//  `id` int(11) NOT NULL,
//  `itemid` int(11) NOT NULL,
//  `groupid` int(11) NOT NULL,
//  `itemname` varchar(100) NOT NULL,
//  `itemdesc` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `lastadatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `visible` bit(6) NOT NULL,
//  `systemcodesid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemcodesgroups`
//--
//
//CREATE TABLE `tblsystemcodesgroups` (
//  `id` int(11) NOT NULL,
//  `codesgroupid` int(11) NOT NULL,
//  `groupname` varchar(30) NOT NULL,
//  `groupdesc` varchar(100) NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `usercreated` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `lastusermodified` varchar(30) NOT NULL,
//  `visible` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemmessages`
//--
//
//CREATE TABLE `tblsystemmessages` (
//  `id` int(11) NOT NULL,
//  `systemmessageid` int(11) NOT NULL,
//  `systemid` int(11) NOT NULL,
//  `messagecontent` text NOT NULL,
//  `messageclassid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `postid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemposts`
//--
//
//CREATE TABLE `tblsystemposts` (
//  `id` int(11) NOT NULL,
//  `balancedsystemid` int(11) NOT NULL,
//  `systempostid` int(11) NOT NULL,
//  `postnumber` int(11) NOT NULL,
//  `systempostname` varchar(60) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemsettings`
//--
//
//CREATE TABLE `tblsystemsettings` (
//  `id` int(11) NOT NULL,
//  `companyid` int(11) NOT NULL,
//  `systemsettingsid` varchar(30) NOT NULL,
//  `companyname` varchar(100) NOT NULL,
//  `companyregistrationname` varchar(100) NOT NULL,
//  `physicaladdress` text NOT NULL,
//  `postaladdress` text NOT NULL,
//  `emailaddress` text NOT NULL,
//  `badgelogo` longblob NOT NULL,
//  `companylogo` longblob NOT NULL,
//  `website` text NOT NULL,
//  `telephonenumber` varchar(16) NOT NULL,
//  `defaultdayshiftstarttime` time(6) NOT NULL,
//  `defaultnightshiftstarttime` time(6) NOT NULL,
//  `defautdayshiftendtime` time(6) NOT NULL,
//  `defaultnightshiftendtime` time(6) NOT NULL,
//  `startdayofweek` date NOT NULL,
//  `paymonthstartday` date NOT NULL,
//  `paymonthenddate` date NOT NULL,
//  `normalweeklyworkhours` double(5,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemtemplates`
//--
//
//CREATE TABLE `tblsystemtemplates` (
//  `id` int(11) NOT NULL,
//  `templateid` int(11) NOT NULL,
//  `templatename` varchar(30) NOT NULL,
//  `notes` text NOT NULL,
//  `templatestring` varchar(50000) NOT NULL,
//  `workingshifts` int(11) NOT NULL,
//  `shifttype` varchar(16) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblsystemupdatestate`
//--
//
//CREATE TABLE `tblsystemupdatestate` (
//  `id` int(11) NOT NULL,
//  `totalrecords` int(11) NOT NULL,
//  `currentrecord` int(11) NOT NULL,
//  `currentoperation` varchar(100) NOT NULL,
//  `stemupdatestate` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbltrainingcourses`
//--
//
//CREATE TABLE `tbltrainingcourses` (
//  `id` int(11) NOT NULL,
//  `courseid` int(11) NOT NULL,
//  `coursename` varchar(100) NOT NULL,
//  `description` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `validityperiod` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tbluserroles`
//--
//
//CREATE TABLE `tbluserroles` (
//  `id` int(11) NOT NULL,
//  `roleid` varchar(30) NOT NULL,
//  `rolename` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tbluserroles`
//--
//
//INSERT INTO `tbluserroles` (`id`, `roleid`, `rolename`) VALUES
//(1, 'RL001', 'ADMIN'),
//(2, 'RL002', 'SUPERVISOR'),
//(3, 'RL003', 'HR'),
//(4, 'RL004', 'OPERATIONS OFFICER'),
//(5, 'RL005', 'ACOUNTANT'),
//(7, 'RL006', 'RECEPTION'),
//(8, 'RL008', 'MARKETING');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehicle`
//--
//
//CREATE TABLE `tblvehicle` (
//  `id` int(11) NOT NULL,
//  `registrationnumber` int(11) NOT NULL,
//  `model` varchar(100) NOT NULL,
//  `make` varchar(100) NOT NULL,
//  `typeofbodyc` varchar(100) NOT NULL,
//  `color` varchar(60) NOT NULL,
//  `yearfirstissued` year(4) NOT NULL,
//  `enginenumber` varchar(60) NOT NULL,
//  `chasisnumber` varchar(60) NOT NULL,
//  `typeoffuelusedc` varchar(30) NOT NULL,
//  `registrationbooknumber` varchar(30) NOT NULL,
//  `insurancecompanyc` varchar(30) NOT NULL,
//  `insurancebroker` varchar(30) NOT NULL,
//  `insuranceexpirydate` date NOT NULL,
//  `insuredvalue` double(18,2) NOT NULL,
//  `datepurchased` date NOT NULL,
//  `supplier` varchar(100) NOT NULL,
//  `valueatpurchase` double(18,2) NOT NULL,
//  `milageatpurchase` double(18,2) NOT NULL,
//  `carradio` bit(6) NOT NULL,
//  `commsradio` bit(6) NOT NULL,
//  `alarmed` bit(6) NOT NULL,
//  `departmentc` varchar(30) NOT NULL,
//  `tankcapacity` double(18,2) NOT NULL,
//  `currenttankcontents` double(18,2) NOT NULL,
//  `sparewheelandkit` bit(6) NOT NULL,
//  `notes` text NOT NULL,
//  `active` bit(6) NOT NULL,
//  `lastcheckid` int(11) NOT NULL,
//  `lastpetrolid` int(11) NOT NULL,
//  `goneforrepair` bit(6) NOT NULL,
//  `onpatrol` bit(6) NOT NULL,
//  `goneforservice` bit(6) NOT NULL,
//  `latestodometerreading` double(6,0) NOT NULL,
//  `monthlybudgetedfuel` double(12,2) NOT NULL,
//  `custodian` varchar(16) NOT NULL,
//  `depreciation` double(18,2) NOT NULL,
//  `leasehire` double(18,2) NOT NULL,
//  `nextservicedue` date NOT NULL,
//  `serviceintervalkms` double(18,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclecheck`
//--
//
//CREATE TABLE `tblvehiclecheck` (
//  `id` int(11) NOT NULL,
//  `vehiclecheckid` varchar(12) NOT NULL,
//  `regnumber` varchar(30) NOT NULL,
//  `date` date NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `fuel` bit(6) NOT NULL,
//  `fuelnotes` text NOT NULL,
//  `oil` bit(6) NOT NULL,
//  `oilnotes` text NOT NULL,
//  `water` bit(6) NOT NULL,
//  `waternotes` text NOT NULL,
//  `tyrepressure` bit(6) NOT NULL,
//  `tyrepressurenotes` text NOT NULL,
//  `body` bit(6) NOT NULL,
//  `bodynotes` text NOT NULL,
//  `battery` bit(6) NOT NULL,
//  `batterynotes` text NOT NULL,
//  `brakefluid` bit(6) NOT NULL,
//  `brakefluidnotes` text NOT NULL,
//  `fanbelt` bit(6) NOT NULL,
//  `fanbeltnotes` text NOT NULL,
//  `oilleakage` bit(6) NOT NULL,
//  `oilleakagenotes` text NOT NULL,
//  `headlights` bit(6) NOT NULL,
//  `headlightsnotes` text NOT NULL,
//  `indicators` bit(6) NOT NULL,
//  `indicatorsnotes` text NOT NULL,
//  `stopandtaillights` bit(6) NOT NULL,
//  `stopandtaillightsnotes` text NOT NULL,
//  `parklights` bit(6) NOT NULL,
//  `parkslightsnotes` text NOT NULL,
//  `wipers` bit(6) NOT NULL,
//  `wipersnotes` text NOT NULL,
//  `footbrake` bit(6) NOT NULL,
//  `footbrakenotes` text NOT NULL,
//  `handbrake` int(6) NOT NULL,
//  `handbrakenotes` text NOT NULL,
//  `dashboard` int(6) NOT NULL,
//  `dashboardnotes` text NOT NULL,
//  `windscreen` bit(6) NOT NULL,
//  `windscreennotes` text NOT NULL,
//  `windows` bit(6) NOT NULL,
//  `windowsnotes` text NOT NULL,
//  `seatbelt` bit(6) NOT NULL,
//  `seatbeltnotes` text NOT NULL,
//  `mats` bit(6) NOT NULL,
//  `mirror` bit(6) NOT NULL,
//  `mirrornotes` text NOT NULL,
//  `sparewheel` bit(6) NOT NULL,
//  `sparewheelnotes` text NOT NULL,
//  `jackhandleandspanner` bit(6) NOT NULL,
//  `jackhandleandspannernotes` text NOT NULL,
//  `carradio` bit(6) NOT NULL,
//  `carradionotes` text NOT NULL,
//  `commsradio` bit(6) NOT NULL,
//  `commsradionotes` text NOT NULL,
//  `aerial` bit(6) NOT NULL,
//  `aerialnotes` text NOT NULL,
//  `alarm` bit(6) NOT NULL,
//  `alarmnotes` text NOT NULL,
//  `fuelcaplock` bit(6) NOT NULL,
//  `fuelcaplocknotes` text NOT NULL,
//  `heaterunits` bit(6) NOT NULL,
//  `heaterunitsnotes` text NOT NULL,
//  `appearance` text NOT NULL,
//  `odometer` bigint(20) NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclefuelconsumptionlog`
//--
//
//CREATE TABLE `tblvehiclefuelconsumptionlog` (
//  `id` int(11) NOT NULL,
//  `registrationnumber` varchar(30) NOT NULL,
//  `month` double(6,0) NOT NULL,
//  `fuelconsumed` double(6,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclepatrol`
//--
//
//CREATE TABLE `tblvehiclepatrol` (
//  `id` int(11) NOT NULL,
//  `vehiclepatrolid` int(11) NOT NULL,
//  `registrationnumber` varchar(30) NOT NULL,
//  `dateout` datetime(6) NOT NULL,
//  `datein` datetime(6) NOT NULL,
//  `driver` int(11) NOT NULL,
//  `passenger` int(11) NOT NULL,
//  `kilometresin` varchar(30) NOT NULL,
//  `kilometresout` varchar(30) NOT NULL,
//  `areaspatrolled` text NOT NULL,
//  `notes` text NOT NULL,
//  `vehiclecheckinid` int(30) NOT NULL,
//  `vehiclecheckouid` varchar(30) NOT NULL,
//  `timein` time(6) NOT NULL,
//  `timout` time(6) NOT NULL,
//  `authorisedby` varchar(30) NOT NULL,
//  `approvedby` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclerecurringsubscriptions`
//--
//
//CREATE TABLE `tblvehiclerecurringsubscriptions` (
//  `id` int(11) NOT NULL,
//  `vehiclerecurringsubscriptionid` varchar(16) NOT NULL,
//  `registrationnumber` varchar(16) NOT NULL,
//  `subscriptiontypec` double(12,0) NOT NULL,
//  `notes` text NOT NULL,
//  `dateofsubscription` datetime(6) NOT NULL,
//  `expirydate` date NOT NULL,
//  `active` bit(6) NOT NULL,
//  `subscriptionamount` double(18,2) NOT NULL,
//  `newrecord` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclerepairs`
//--
//
//CREATE TABLE `tblvehiclerepairs` (
//  `id` int(11) NOT NULL,
//  `vehiclerepairid` int(11) NOT NULL,
//  `registrationnumber` varchar(16) NOT NULL,
//  `datesent` date NOT NULL,
//  `datereturned` date NOT NULL,
//  `costofrepair` double(18,2) NOT NULL,
//  `notes` text NOT NULL,
//  `vehicleserviceid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclervicetype`
//--
//
//CREATE TABLE `tblvehiclervicetype` (
//  `id` int(11) NOT NULL,
//  `vehicleservicetypeid` int(11) NOT NULL,
//  `typename` text NOT NULL,
//  `typedescription` text NOT NULL,
//  `affectsnextdueforservice` bit(6) NOT NULL,
//  `active` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehicleservice`
//--
//
//CREATE TABLE `tblvehicleservice` (
//  `id` int(11) NOT NULL,
//  `vehicleserviceid` varchar(30) NOT NULL,
//  `registrationnumber` varchar(30) NOT NULL,
//  `servicetypec` int(11) NOT NULL,
//  `garage` varchar(100) NOT NULL,
//  `dateserviced` date NOT NULL,
//  `kilomitrage` double(18,2) NOT NULL,
//  `nextkilomitre` double(18,2) NOT NULL,
//  `costofservice` double(18,2) NOT NULL,
//  `remarks` text NOT NULL,
//  `assetinventorytranid` int(11) NOT NULL,
//  `serviceref` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehicleserviceitems`
//--
//
//CREATE TABLE `tblvehicleserviceitems` (
//  `id` int(11) NOT NULL,
//  `vehicleserviceitemsid` int(11) NOT NULL,
//  `vehicleserviceid` int(11) NOT NULL,
//  `vehicleservicetypec` int(11) NOT NULL,
//  `vehiclesundryitemid` int(11) NOT NULL,
//  `unitprice` double(18,2) NOT NULL,
//  `quantity` double(18,2) NOT NULL,
//  `assetinvtranitemsid` int(11) NOT NULL,
//  `description` text NOT NULL,
//  `assettypecode` varchar(30) NOT NULL,
//  `linetotal` double(38,6) NOT NULL,
//  `itemname` varchar(30) NOT NULL,
//  `source` varchar(1) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvehiclesundries`
//--
//
//CREATE TABLE `tblvehiclesundries` (
//  `id` int(11) NOT NULL,
//  `vehiclesundriesitemid` varchar(30) NOT NULL,
//  `vehiclesundryname` varchar(100) NOT NULL,
//  `unitsofmeasurement` varchar(30) NOT NULL,
//  `notes` text NOT NULL,
//  `vehicleserviceitemtypec` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblvillage`
//--
//
//CREATE TABLE `tblvillage` (
//  `id` int(11) NOT NULL,
//  `villageid` varchar(30) NOT NULL,
//  `employeeid` varchar(12) NOT NULL,
//  `village` varchar(30) NOT NULL,
//  `chief` varchar(30) NOT NULL,
//  `headman` varchar(30) NOT NULL,
//  `fathername` varchar(30) NOT NULL,
//  `fathersurname` varchar(30) NOT NULL,
//  `mothername` varchar(30) NOT NULL,
//  `mothersurname` varchar(30) NOT NULL,
//  `languagespeak` varchar(30) NOT NULL,
//  `languagewrite` varchar(30) NOT NULL,
//  `ethnicorigin` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblvillage`
//--
//
//INSERT INTO `tblvillage` (`id`, `villageid`, `employeeid`, `village`, `chief`, `headman`, `fathername`, `fathersurname`, `mothername`, `mothersurname`, `languagespeak`, `languagewrite`, `ethnicorigin`) VALUES
//(1, 'VL001', 'EMP004', 'UZUMBA', 'UZUMBA', 'UZUMBA', 'THOMAS', 'UZUMBA', 'MAGRET', 'PFUNGWE', 'SHONA', 'ENGLISH', 'TOKO');
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblwfdefaults`
//--
//
//CREATE TABLE `tblwfdefaults` (
//  `id` int(11) NOT NULL,
//  `setupsection` varchar(50) NOT NULL,
//  `setupkey` int(30) NOT NULL,
//  `setupvalue` varchar(200) NOT NULL,
//  `wfdefaultsid` varchar(30) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblwfmworkorders`
//--
//
//CREATE TABLE `tblwfmworkorders` (
//  `id` int(11) NOT NULL,
//  `wfmworkordersid` varchar(30) NOT NULL,
//  `workordertypeid` varchar(30) NOT NULL,
//  `to` text NOT NULL,
//  `from` text NOT NULL,
//  `subject` text NOT NULL,
//  `message` text NOT NULL,
//  `pccomplete` int(11) NOT NULL,
//  `dateclosed` date NOT NULL,
//  `deadlinedate` date NOT NULL,
//  `datecreated` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `deleted` bit(6) NOT NULL,
//  `datedeleted` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `deletedby` varchar(30) NOT NULL,
//  `cc` text NOT NULL,
//  `parentid` int(11) NOT NULL,
//  `employeeid` int(11) NOT NULL,
//  `siteid` varchar(12) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblwfmworkordertype`
//--
//
//CREATE TABLE `tblwfmworkordertype` (
//  `id` int(11) NOT NULL,
//  `wfmworkordertypeid` varchar(30) NOT NULL,
//  `name` text NOT NULL,
//  `description` text NOT NULL,
//  `sendto` text NOT NULL,
//  `copyto` text NOT NULL,
//  `defaultprocessingperiod` int(11) NOT NULL,
//  `defaultmessage` text NOT NULL,
//  `defaultsubject` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblwfmworkorderupdates`
//--
//
//CREATE TABLE `tblwfmworkorderupdates` (
//  `id` int(11) NOT NULL,
//  `wfmworkorderupdatesid` varchar(12) NOT NULL,
//  `user` varchar(30) NOT NULL,
//  `date` date NOT NULL,
//  `message` text NOT NULL,
//  `wfmworkorderid` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblworkexperience`
//--
//
//CREATE TABLE `tblworkexperience` (
//  `id` int(11) NOT NULL,
//  `employeeid` varchar(11) NOT NULL,
//  `nameofemployer` text,
//  `addressofemployer` text,
//  `telephonenumber` varchar(16) DEFAULT NULL,
//  `datefrom` date DEFAULT NULL,
//  `dateto` date DEFAULT NULL,
//  `title` text,
//  `totalexperience` double(12,2) DEFAULT NULL,
//  `experiencewithus` double(12,2) DEFAULT NULL,
//  `monthlysalary` double(18,2) DEFAULT NULL,
//  `monthlyincome` double(18,2) DEFAULT NULL,
//  `reasonforleaving` text,
//  `notes` text
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Dumping data for table `tblworkexperience`
//--
//
//INSERT INTO `tblworkexperience` (`id`, `employeeid`, `nameofemployer`, `addressofemployer`, `telephonenumber`, `datefrom`, `dateto`, `title`, `totalexperience`, `experiencewithus`, `monthlysalary`, `monthlyincome`, `reasonforleaving`, `notes`) VALUES
//(1, 'EMP001', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 500.00, NULL, NULL, NULL),
//(2, 'EMP001', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 500.00, NULL, NULL, NULL),
//(3, 'EMP001', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 500.00, NULL, NULL, NULL),
//(4, 'EMP002', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 500.00, NULL, NULL, NULL),
//(5, 'EMP003', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 500.00, NULL, NULL, NULL),
//(6, 'EMP004', NULL, NULL, NULL, '2018-06-14', NULL, 'SOFTWARE DEVELOPER', 5.00, 5.00, 5000.00, NULL, NULL, NULL),
//(7, 'EMP005', NULL, NULL, NULL, '2018-06-19', NULL, 'MANAGER', 6.00, 4.00, 5000.00, NULL, NULL, NULL),
//(8, 'EMP006', NULL, NULL, NULL, '2018-06-19', NULL, 'SENIOR DATA SCIENTIST', 8.00, 4.00, 800.00, NULL, NULL, NULL),
//(9, 'EMP007', NULL, NULL, NULL, '2018-06-19', NULL, 'SENIOR DATA SCIENTIST', 7.00, 4.00, 7000.00, NULL, NULL, NULL);
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblyeartodate`
//--
//
//CREATE TABLE `tblyeartodate` (
//  `id` int(11) NOT NULL,
//  `ytdtaxcredits` double(12,2) NOT NULL,
//  `ytdbasic` double(12,2) NOT NULL,
//  `ytdnetsalary` double(12,2) NOT NULL,
//  `ytdtaxemoluments` double(12,2) NOT NULL,
//  `ytdnontaxemoluments` double(12,2) NOT NULL,
//  `ytdgrossincome` double(12,2) NOT NULL,
//  `ytdexemptions` double(12,2) NOT NULL,
//  `ytdpension` double(12,2) NOT NULL,
//  `ytdpaye` double(12,2) NOT NULL,
//  `ytdnssa` double(12,2) NOT NULL,
//  `ytdallowances` double(12,2) NOT NULL,
//  `ytddeductions` double(12,2) NOT NULL,
//  `ytdtaxableallowances` double(12,2) NOT NULL,
//  `ytdnontaxableallowances` double(12,2) NOT NULL,
//  `ytdotherallowabledeductions` double(12,2) NOT NULL,
//  `ytdrecurringdeductions` double(12,2) NOT NULL,
//  `ytdnonrecurringdeductions` double(12,2) NOT NULL,
//  `ytdrecurringallowances` double(12,2) NOT NULL,
//  `ytdnonrecurringallowances` double(12,2) NOT NULL,
//  `usercreated` varchar(30) NOT NULL,
//  `lastusermodified` varchar(30) NOT NULL,
//  `lastmachinemodifiedon` varchar(30) NOT NULL,
//  `lastdatemodified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
//  `employeeid` varchar(12) NOT NULL,
//  `ytdextrabenefittax` double(12,2) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblzonemanagers`
//--
//
//CREATE TABLE `tblzonemanagers` (
//  `id` int(11) NOT NULL,
//  `zoneid` varchar(30) NOT NULL,
//  `staffcode` varchar(30) NOT NULL,
//  `schedules` bit(6) NOT NULL,
//  `attendance` bit(6) NOT NULL,
//  `employeerecords` bit(6) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblzones`
//--
//
//CREATE TABLE `tblzones` (
//  `id` int(11) NOT NULL,
//  `zoneid` varchar(30) NOT NULL,
//  `zonename` varchar(100) NOT NULL,
//  `notes` text NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//-- --------------------------------------------------------
//
//--
//-- Table structure for table `tblzonesparadingposts`
//--
//
//CREATE TABLE `tblzonesparadingposts` (
//  `id` int(11) NOT NULL,
//  `zonesparadingpostsid` varchar(30) NOT NULL,
//  `zoneid` varchar(30) NOT NULL,
//  `zonesparadingpostsname` varchar(100) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//
//--
//-- Indexes for dumped tables
//--
//
//--
//-- Indexes for table `tblagdocument`
//--
//ALTER TABLE `tblagdocument`
//  ADD PRIMARY KEY (`id`,`docid`);
//
//--
//-- Indexes for table `tblagdocumentitems`
//--
//ALTER TABLE `tblagdocumentitems`
//  ADD PRIMARY KEY (`id`,`docitemid`);
//
//--
//-- Indexes for table `tblagerrordocument`
//--
//ALTER TABLE `tblagerrordocument`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `docid` (`docid`);
//
//--
//-- Indexes for table `tblagerrordocumentitems`
//--
//ALTER TABLE `tblagerrordocumentitems`
//  ADD PRIMARY KEY (`id`,`docitemid`);
//
//--
//-- Indexes for table `tblallocationhistory`
//--
//ALTER TABLE `tblallocationhistory`
//  ADD PRIMARY KEY (`id`,`allocationhistoryid`);
//
//--
//-- Indexes for table `tblallocations`
//--
//ALTER TABLE `tblallocations`
//  ADD PRIMARY KEY (`id`,`allocationsid`);
//
//--
//-- Indexes for table `tblallowances`
//--
//ALTER TABLE `tblallowances`
//  ADD PRIMARY KEY (`id`,`allowanceid`);
//
//--
//-- Indexes for table `tblallowdeductimport`
//--
//ALTER TABLE `tblallowdeductimport`
//  ADD PRIMARY KEY (`id`,`allowdeductid`);
//
//--
//-- Indexes for table `tblassetcodes`
//--
//ALTER TABLE `tblassetcodes`
//  ADD PRIMARY KEY (`id`,`assetcodeid`);
//
//--
//-- Indexes for table `tblassetinventorytran`
//--
//ALTER TABLE `tblassetinventorytran`
//  ADD PRIMARY KEY (`id`,`assetinventoritranid`);
//
//--
//-- Indexes for table `tblassetinvtranitems`
//--
//ALTER TABLE `tblassetinvtranitems`
//  ADD PRIMARY KEY (`id`,`assetinvtranitemid`);
//
//--
//-- Indexes for table `tblassetreceiving`
//--
//ALTER TABLE `tblassetreceiving`
//  ADD PRIMARY KEY (`id`,`assetreceiptid`);
//
//--
//-- Indexes for table `tblassetreceivingitems`
//--
//ALTER TABLE `tblassetreceivingitems`
//  ADD PRIMARY KEY (`id`,`assetreceiptid`),
//  ADD UNIQUE KEY `serialnumber` (`serialnumber`);
//
//--
//-- Indexes for table `tblassetrepairs`
//--
//ALTER TABLE `tblassetrepairs`
//  ADD PRIMARY KEY (`id`,`repairid`);
//
//--
//-- Indexes for table `tblassets`
//--
//ALTER TABLE `tblassets`
//  ADD PRIMARY KEY (`id`,`assetid`);
//
//--
//-- Indexes for table `tblassetstockadjustments`
//--
//ALTER TABLE `tblassetstockadjustments`
//  ADD PRIMARY KEY (`id`,`assetstockadjustmentsid`);
//
//--
//-- Indexes for table `tblassetstocks`
//--
//ALTER TABLE `tblassetstocks`
//  ADD PRIMARY KEY (`id`,`assetcodeid`,`assetstockid`);
//
//--
//-- Indexes for table `tblassetstockshistory`
//--
//ALTER TABLE `tblassetstockshistory`
//  ADD PRIMARY KEY (`id`,`assetstockhistoryid`);
//
//--
//-- Indexes for table `tblassettypes`
//--
//ALTER TABLE `tblassettypes`
//  ADD PRIMARY KEY (`id`,`assettypecodeid`,`serialnumber`);
//
//--
//-- Indexes for table `tblattendanceexporttemp`
//--
//ALTER TABLE `tblattendanceexporttemp`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblbalancedsystem`
//--
//ALTER TABLE `tblbalancedsystem`
//  ADD PRIMARY KEY (`id`,`balancedsystemid`);
//
//--
//-- Indexes for table `tblbank`
//--
//ALTER TABLE `tblbank`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `bankid` (`bankid`);
//
//--
//-- Indexes for table `tblbankbranch`
//--
//ALTER TABLE `tblbankbranch`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `bankbranchid` (`bankbranchid`);
//
//--
//-- Indexes for table `tblbilling`
//--
//ALTER TABLE `tblbilling`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `billingid` (`billingid`);
//
//--
//-- Indexes for table `tblbillinginvoices`
//--
//ALTER TABLE `tblbillinginvoices`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `billinginvoicesid` (`billinginvoicesid`);
//
//--
//-- Indexes for table `tblcasualtyboard`
//--
//ALTER TABLE `tblcasualtyboard`
//  ADD PRIMARY KEY (`id`,`casultytypeid`);
//
//--
//-- Indexes for table `tblcasualtyboardattendance`
//--
//ALTER TABLE `tblcasualtyboardattendance`
//  ADD PRIMARY KEY (`id`,`casualtyboardattendanceid`);
//
//--
//-- Indexes for table `tblcasualtytypes`
//--
//ALTER TABLE `tblcasualtytypes`
//  ADD PRIMARY KEY (`id`,`casualtytypeid`);
//
//--
//-- Indexes for table `tblcheckhistory`
//--
//ALTER TABLE `tblcheckhistory`
//  ADD PRIMARY KEY (`id`,`checkid`);
//
//--
//-- Indexes for table `tblchecks`
//--
//ALTER TABLE `tblchecks`
//  ADD PRIMARY KEY (`id`,`checkcode`);
//
//--
//-- Indexes for table `tblchecksgroup`
//--
//ALTER TABLE `tblchecksgroup`
//  ADD PRIMARY KEY (`id`,`checkcode`);
//
//--
//-- Indexes for table `tblchecksregister`
//--
//ALTER TABLE `tblchecksregister`
//  ADD PRIMARY KEY (`id`,`checksregister`);
//
//--
//-- Indexes for table `tblcompanybranches`
//--
//ALTER TABLE `tblcompanybranches`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `branchid` (`branchid`);
//
//--
//-- Indexes for table `tblcompanydetails`
//--
//ALTER TABLE `tblcompanydetails`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblcountry`
//--
//ALTER TABLE `tblcountry`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `zipcode` (`zipcode`);
//
//--
//-- Indexes for table `tbldeletethistableassetstockinvtranitems`
//--
//ALTER TABLE `tbldeletethistableassetstockinvtranitems`
//  ADD PRIMARY KEY (`id`,`assetstockinvtranitemsid`);
//
//--
//-- Indexes for table `tbldepartments`
//--
//ALTER TABLE `tbldepartments`
//  ADD PRIMARY KEY (`id`,`departmentid`);
//
//--
//-- Indexes for table `tbldependance`
//--
//ALTER TABLE `tbldependance`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tbldeploymentsheetmessages`
//--
//ALTER TABLE `tbldeploymentsheetmessages`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tbldeploymentsheetnew`
//--
//ALTER TABLE `tbldeploymentsheetnew`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `deploymentsheetid` (`deploymentsheetid`);
//
//--
//-- Indexes for table `tbldeploymentsheetweekly`
//--
//ALTER TABLE `tbldeploymentsheetweekly`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `deploymentsheetid` (`deploymentsheetid`);
//
//--
//-- Indexes for table `tbldeploymentsheetweeklyentry`
//--
//ALTER TABLE `tbldeploymentsheetweeklyentry`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `deploymentsheetentryid` (`deploymentsheetentryid`);
//
//--
//-- Indexes for table `tbldesignation`
//--
//ALTER TABLE `tbldesignation`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `designationid` (`designationid`);
//
//--
//-- Indexes for table `tbldisciplinary`
//--
//ALTER TABLE `tbldisciplinary`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `disciplinaryid` (`disciplinaryid`);
//
//--
//-- Indexes for table `tbldutyattendanceallowancenew`
//--
//ALTER TABLE `tbldutyattendanceallowancenew`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tbldutyattendancenew`
//--
//ALTER TABLE `tbldutyattendancenew`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `shiftid` (`shiftid`);
//
//--
//-- Indexes for table `tblebsecgroup`
//--
//ALTER TABLE `tblebsecgroup`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblebsecgroupaccess`
//--
//ALTER TABLE `tblebsecgroupaccess`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblebsecstaticrights`
//--
//ALTER TABLE `tblebsecstaticrights`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblebsecusergroups`
//--
//ALTER TABLE `tblebsecusergroups`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblebusers`
//--
//ALTER TABLE `tblebusers`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `staffcode` (`staffcode`),
//  ADD UNIQUE KEY `email` (`email`),
//  ADD UNIQUE KEY `nationalid` (`nationalid`);
//
//--
//-- Indexes for table `tblemployeeaddress`
//--
//ALTER TABLE `tblemployeeaddress`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblemployeeallowdeduct`
//--
//ALTER TABLE `tblemployeeallowdeduct`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeallowdeductid` (`employeeallowdeductid`);
//
//--
//-- Indexes for table `tblexternaluploads`
//--
//ALTER TABLE `tblexternaluploads`
//  ADD PRIMARY KEY (`id`,`deductioncode`,`inputid`);
//
//--
//-- Indexes for table `tblfinancialpayperiod`
//--
//ALTER TABLE `tblfinancialpayperiod`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `financialpayperiodid` (`financialpayperiodid`);
//
//--
//-- Indexes for table `tblfinancialyear`
//--
//ALTER TABLE `tblfinancialyear`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `financialyearid` (`financialyearid`);
//
//--
//-- Indexes for table `tblfuelcoupon`
//--
//ALTER TABLE `tblfuelcoupon`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `couponid` (`couponid`);
//
//--
//-- Indexes for table `tblfuelpurchase`
//--
//ALTER TABLE `tblfuelpurchase`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `purchaseid` (`purchaseid`);
//
//--
//-- Indexes for table `tblfuelreserves`
//--
//ALTER TABLE `tblfuelreserves`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `reserveid` (`reserveid`);
//
//--
//-- Indexes for table `tblfueltankrefill`
//--
//ALTER TABLE `tblfueltankrefill`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `purchaseid` (`purchaseid`);
//
//--
//-- Indexes for table `tblgrades`
//--
//ALTER TABLE `tblgrades`
//  ADD PRIMARY KEY (`gradeid`),
//  ADD UNIQUE KEY `id` (`id`);
//
//--
//-- Indexes for table `tblgradesalaries`
//--
//ALTER TABLE `tblgradesalaries`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblgratuity`
//--
//ALTER TABLE `tblgratuity`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblguardpaypoints`
//--
//ALTER TABLE `tblguardpaypoints`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblguards`
//--
//ALTER TABLE `tblguards`
//  ADD PRIMARY KEY (`employeeid`),
//  ADD KEY `id` (`id`);
//
//--
//-- Indexes for table `tblguardskillshistory`
//--
//ALTER TABLE `tblguardskillshistory`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `skillsid` (`skillsid`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblhearingactions`
//--
//ALTER TABLE `tblhearingactions`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `hearingid` (`hearingid`);
//
//--
//-- Indexes for table `tblhearings`
//--
//ALTER TABLE `tblhearings`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `hearingid` (`hearingid`);
//
//--
//-- Indexes for table `tblholidays`
//--
//ALTER TABLE `tblholidays`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `holidaycode` (`holidaycode`);
//
//--
//-- Indexes for table `tblincidents`
//--
//ALTER TABLE `tblincidents`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `incidentno` (`incidentno`);
//
//--
//-- Indexes for table `tblincidentypes`
//--
//ALTER TABLE `tblincidentypes`
//  ADD PRIMARY KEY (`id`,`incidenttypeid`);
//
//--
//-- Indexes for table `tblinvoice`
//--
//ALTER TABLE `tblinvoice`
//  ADD PRIMARY KEY (`id`,`invoiceid`);
//
//--
//-- Indexes for table `tblinvoicelineitems`
//--
//ALTER TABLE `tblinvoicelineitems`
//  ADD PRIMARY KEY (`id`,`lineitemid`);
//
//--
//-- Indexes for table `tblleave`
//--
//ALTER TABLE `tblleave`
//  ADD PRIMARY KEY (`id`,`leaveid`);
//
//--
//-- Indexes for table `tblleavebalance`
//--
//ALTER TABLE `tblleavebalance`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `leavebalanceid` (`leavebalanceid`);
//
//--
//-- Indexes for table `tblleavebankdob`
//--
//ALTER TABLE `tblleavebankdob`
//  ADD PRIMARY KEY (`id`,`leavebankdobid`);
//
//--
//-- Indexes for table `tblleavetype`
//--
//ALTER TABLE `tblleavetype`
//  ADD PRIMARY KEY (`id`,`leavetypeid`);
//
//--
//-- Indexes for table `tblleaveupload`
//--
//ALTER TABLE `tblleaveupload`
//  ADD PRIMARY KEY (`id`,`leaveuploadid`);
//
//--
//-- Indexes for table `tblloancashrepayment`
//--
//ALTER TABLE `tblloancashrepayment`
//  ADD PRIMARY KEY (`id`,`allowdeductloancashrepaymentid`);
//
//--
//-- Indexes for table `tblmedicaldetails`
//--
//ALTER TABLE `tblmedicaldetails`
//  ADD PRIMARY KEY (`id`,`employeeid`);
//
//--
//-- Indexes for table `tblmessageclass`
//--
//ALTER TABLE `tblmessageclass`
//  ADD PRIMARY KEY (`id`,`messageclassid`);
//
//--
//-- Indexes for table `tblmopnthlybalancedsystemposts`
//--
//ALTER TABLE `tblmopnthlybalancedsystemposts`
//  ADD PRIMARY KEY (`id`,`monthlysystempostid`);
//
//--
//-- Indexes for table `tblnextofkin`
//--
//ALTER TABLE `tblnextofkin`
//  ADD PRIMARY KEY (`id`,`nextofkinid`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblnotes`
//--
//ALTER TABLE `tblnotes`
//  ADD PRIMARY KEY (`id`,`noteid`);
//
//--
//-- Indexes for table `tbloccurance`
//--
//ALTER TABLE `tbloccurance`
//  ADD PRIMARY KEY (`id`,`occuranceid`);
//
//--
//-- Indexes for table `tbloccurancebook`
//--
//ALTER TABLE `tbloccurancebook`
//  ADD PRIMARY KEY (`id`,`occurancebookid`);
//
//--
//-- Indexes for table `tbloccurancebookallowedtypes`
//--
//ALTER TABLE `tbloccurancebookallowedtypes`
//  ADD PRIMARY KEY (`id`,`occuranceallowedid`);
//
//--
//-- Indexes for table `tbloccuranceemployees`
//--
//ALTER TABLE `tbloccuranceemployees`
//  ADD PRIMARY KEY (`id`,`occuranceemployeeid`);
//
//--
//-- Indexes for table `tbloccurancetype`
//--
//ALTER TABLE `tbloccurancetype`
//  ADD PRIMARY KEY (`id`,`occurancetypeid`);
//
//--
//-- Indexes for table `tbloccuranceupdates`
//--
//ALTER TABLE `tbloccuranceupdates`
//  ADD PRIMARY KEY (`id`,`occuranceupdateid`);
//
//--
//-- Indexes for table `tbloffences`
//--
//ALTER TABLE `tbloffences`
//  ADD PRIMARY KEY (`id`,`offencetypeid`);
//
//--
//-- Indexes for table `tbloffensegrouping`
//--
//ALTER TABLE `tbloffensegrouping`
//  ADD PRIMARY KEY (`id`,`groupid`);
//
//--
//-- Indexes for table `tbloffensegrouplistingsublist`
//--
//ALTER TABLE `tbloffensegrouplistingsublist`
//  ADD PRIMARY KEY (`id`,`offensegrouplistingsublistid`);
//
//--
//-- Indexes for table `tbloffensegroupverdict`
//--
//ALTER TABLE `tbloffensegroupverdict`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tbloffensgrouplisting`
//--
//ALTER TABLE `tbloffensgrouplisting`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpatterns`
//--
//ALTER TABLE `tblpatterns`
//  ADD PRIMARY KEY (`id`,`patternid`);
//
//--
//-- Indexes for table `tblpaydetails`
//--
//ALTER TABLE `tblpaydetails`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `paydetailsid` (`paydetailsid`);
//
//--
//-- Indexes for table `tblpaynetdata`
//--
//ALTER TABLE `tblpaynetdata`
//  ADD PRIMARY KEY (`id`,`paynetdataid`);
//
//--
//-- Indexes for table `tblpaypoints`
//--
//ALTER TABLE `tblpaypoints`
//  ADD PRIMARY KEY (`id`,`paypointid`);
//
//--
//-- Indexes for table `tblpayrun`
//--
//ALTER TABLE `tblpayrun`
//  ADD PRIMARY KEY (`id`,`payrunid`);
//
//--
//-- Indexes for table `tblpayruncashdenomination`
//--
//ALTER TABLE `tblpayruncashdenomination`
//  ADD PRIMARY KEY (`id`,`payruncashdenominationid`);
//
//--
//-- Indexes for table `tblpayruncounter`
//--
//ALTER TABLE `tblpayruncounter`
//  ADD PRIMARY KEY (`id`,`payruncounterid`);
//
//--
//-- Indexes for table `tblpayrungrouplist`
//--
//ALTER TABLE `tblpayrungrouplist`
//  ADD PRIMARY KEY (`id`,`payrunlistid`);
//
//--
//-- Indexes for table `tblpayruntaxband`
//--
//ALTER TABLE `tblpayruntaxband`
//  ADD PRIMARY KEY (`id`,`payruntaxbandid`);
//
//--
//-- Indexes for table `tblpayslip`
//--
//ALTER TABLE `tblpayslip`
//  ADD PRIMARY KEY (`id`,`payslipid`);
//
//--
//-- Indexes for table `tblpayslipallowdeduct`
//--
//ALTER TABLE `tblpayslipallowdeduct`
//  ADD PRIMARY KEY (`id`,`payslipallowdeducthistoryid`);
//
//--
//-- Indexes for table `tblpayslipunpaidallowdeduct`
//--
//ALTER TABLE `tblpayslipunpaidallowdeduct`
//  ADD PRIMARY KEY (`id`,`payslipallowdeducthistoryid`);
//
//--
//-- Indexes for table `tblpaystoppage`
//--
//ALTER TABLE `tblpaystoppage`
//  ADD PRIMARY KEY (`id`,`payrunpaystopid`);
//
//--
//-- Indexes for table `tblpaytablenew`
//--
//ALTER TABLE `tblpaytablenew`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpersperincident`
//--
//ALTER TABLE `tblpersperincident`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpostallowances`
//--
//ALTER TABLE `tblpostallowances`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpostassetrequirements`
//--
//ALTER TABLE `tblpostassetrequirements`
//  ADD PRIMARY KEY (`id`,`postassetreqid`);
//
//--
//-- Indexes for table `tblpostmodifcationhistory`
//--
//ALTER TABLE `tblpostmodifcationhistory`
//  ADD PRIMARY KEY (`id`,`postid`),
//  ADD UNIQUE KEY `id_postid` (`id`,`postid`) USING BTREE;
//
//--
//-- Indexes for table `tblposts`
//--
//ALTER TABLE `tblposts`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblposttrainingrequirement`
//--
//ALTER TABLE `tblposttrainingrequirement`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpromotions`
//--
//ALTER TABLE `tblpromotions`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblpromotionsuccession`
//--
//ALTER TABLE `tblpromotionsuccession`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblrates`
//--
//ALTER TABLE `tblrates`
//  ADD PRIMARY KEY (`id`,`rateid`);
//
//--
//-- Indexes for table `tblrecruitdependance`
//--
//ALTER TABLE `tblrecruitdependance`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblrecruitnextkin`
//--
//ALTER TABLE `tblrecruitnextkin`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblrecruitsbio`
//--
//ALTER TABLE `tblrecruitsbio`
//  ADD PRIMARY KEY (`id`,`employeeid`);
//
//--
//-- Indexes for table `tblrecruitscontacts`
//--
//ALTER TABLE `tblrecruitscontacts`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblrecruitsemploymentinfo`
//--
//ALTER TABLE `tblrecruitsemploymentinfo`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`,`id`);
//
//--
//-- Indexes for table `tblrecruitvillage`
//--
//ALTER TABLE `tblrecruitvillage`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblrefrees`
//--
//ALTER TABLE `tblrefrees`
//  ADD PRIMARY KEY (`id`,`referenceid`);
//
//--
//-- Indexes for table `tblrelievers`
//--
//ALTER TABLE `tblrelievers`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblrelieverslisting`
//--
//ALTER TABLE `tblrelieverslisting`
//  ADD PRIMARY KEY (`id`,`relieverid`);
//
//--
//-- Indexes for table `tblreligion`
//--
//ALTER TABLE `tblreligion`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `religionid` (`religionid`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblreportpump`
//--
//ALTER TABLE `tblreportpump`
//  ADD PRIMARY KEY (`id`,`reportid`);
//
//--
//-- Indexes for table `tblscanneddocuments`
//--
//ALTER TABLE `tblscanneddocuments`
//  ADD PRIMARY KEY (`id`,`identitynumber`);
//
//--
//-- Indexes for table `tblscheduledshhiftallowances`
//--
//ALTER TABLE `tblscheduledshhiftallowances`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblschedulesnew`
//--
//ALTER TABLE `tblschedulesnew`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblshifttypes`
//--
//ALTER TABLE `tblshifttypes`
//  ADD PRIMARY KEY (`id`,`shifttypeid`);
//
//--
//-- Indexes for table `tblsiteallowances`
//--
//ALTER TABLE `tblsiteallowances`
//  ADD PRIMARY KEY (`id`,`allowanceid`);
//
//--
//-- Indexes for table `tblsiteguardexclusions`
//--
//ALTER TABLE `tblsiteguardexclusions`
//  ADD PRIMARY KEY (`id`,`siteguardexclusionid`);
//
//--
//-- Indexes for table `tblsiterequirementsother`
//--
//ALTER TABLE `tblsiterequirementsother`
//  ADD PRIMARY KEY (`id`);
//
//--
//-- Indexes for table `tblsites`
//--
//ALTER TABLE `tblsites`
//  ADD PRIMARY KEY (`id`,`siteid`);
//
//--
//-- Indexes for table `tblsitesuspensions`
//--
//ALTER TABLE `tblsitesuspensions`
//  ADD PRIMARY KEY (`id`,`suspensionid`);
//
//--
//-- Indexes for table `tblskills`
//--
//ALTER TABLE `tblskills`
//  ADD PRIMARY KEY (`id`,`skillid`);
//
//--
//-- Indexes for table `tblsocialmedia`
//--
//ALTER TABLE `tblsocialmedia`
//  ADD PRIMARY KEY (`id`,`socialmediaid`);
//
//--
//-- Indexes for table `tblsstnotifications`
//--
//ALTER TABLE `tblsstnotifications`
//  ADD PRIMARY KEY (`id`,`notificationid`);
//
//--
//-- Indexes for table `tblsstnotificationsubscriptions`
//--
//ALTER TABLE `tblsstnotificationsubscriptions`
//  ADD PRIMARY KEY (`id`,`notificationsubscriptionid`);
//
//--
//-- Indexes for table `tblsstreporting`
//--
//ALTER TABLE `tblsstreporting`
//  ADD PRIMARY KEY (`id`,`reportid`);
//
//--
//-- Indexes for table `tblsuppliers`
//--
//ALTER TABLE `tblsuppliers`
//  ADD PRIMARY KEY (`id`,`supplierid`);
//
//--
//-- Indexes for table `tblswitchpairing`
//--
//ALTER TABLE `tblswitchpairing`
//  ADD PRIMARY KEY (`id`,`pairingid`);
//
//--
//-- Indexes for table `tblswitchpairingsettings`
//--
//ALTER TABLE `tblswitchpairingsettings`
//  ADD PRIMARY KEY (`id`,`settingid`);
//
//--
//-- Indexes for table `tblsysbackup`
//--
//ALTER TABLE `tblsysbackup`
//  ADD PRIMARY KEY (`id`,`sysbackupid`);
//
//--
//-- Indexes for table `tblsyssettings`
//--
//ALTER TABLE `tblsyssettings`
//  ADD PRIMARY KEY (`id`,`settingid`),
//  ADD UNIQUE KEY `rowguid` (`rowguid`);
//
//--
//-- Indexes for table `tblsystembackup`
//--
//ALTER TABLE `tblsystembackup`
//  ADD PRIMARY KEY (`id`,`backupid`);
//
//--
//-- Indexes for table `tblsystemcodes`
//--
//ALTER TABLE `tblsystemcodes`
//  ADD PRIMARY KEY (`id`,`systemcodesid`);
//
//--
//-- Indexes for table `tblsystemcodesgroups`
//--
//ALTER TABLE `tblsystemcodesgroups`
//  ADD PRIMARY KEY (`id`,`codesgroupid`);
//
//--
//-- Indexes for table `tblsystemmessages`
//--
//ALTER TABLE `tblsystemmessages`
//  ADD PRIMARY KEY (`id`,`systemmessageid`);
//
//--
//-- Indexes for table `tblsystemposts`
//--
//ALTER TABLE `tblsystemposts`
//  ADD PRIMARY KEY (`id`,`systempostid`);
//
//--
//-- Indexes for table `tblsystemsettings`
//--
//ALTER TABLE `tblsystemsettings`
//  ADD PRIMARY KEY (`id`,`companyid`,`systemsettingsid`);
//
//--
//-- Indexes for table `tblsystemtemplates`
//--
//ALTER TABLE `tblsystemtemplates`
//  ADD PRIMARY KEY (`id`,`templateid`);
//
//--
//-- Indexes for table `tblsystemupdatestate`
//--
//ALTER TABLE `tblsystemupdatestate`
//  ADD PRIMARY KEY (`id`,`stemupdatestate`);
//
//--
//-- Indexes for table `tbltrainingcourses`
//--
//ALTER TABLE `tbltrainingcourses`
//  ADD PRIMARY KEY (`id`,`courseid`);
//
//--
//-- Indexes for table `tbluserroles`
//--
//ALTER TABLE `tbluserroles`
//  ADD PRIMARY KEY (`id`,`roleid`);
//
//--
//-- Indexes for table `tblvehicle`
//--
//ALTER TABLE `tblvehicle`
//  ADD PRIMARY KEY (`id`,`registrationnumber`),
//  ADD UNIQUE KEY `enginenumber` (`enginenumber`);
//
//--
//-- Indexes for table `tblvehiclecheck`
//--
//ALTER TABLE `tblvehiclecheck`
//  ADD PRIMARY KEY (`id`,`vehiclecheckid`);
//
//--
//-- Indexes for table `tblvehiclefuelconsumptionlog`
//--
//ALTER TABLE `tblvehiclefuelconsumptionlog`
//  ADD PRIMARY KEY (`id`,`registrationnumber`);
//
//--
//-- Indexes for table `tblvehiclepatrol`
//--
//ALTER TABLE `tblvehiclepatrol`
//  ADD PRIMARY KEY (`id`,`vehiclepatrolid`);
//
//--
//-- Indexes for table `tblvehiclerecurringsubscriptions`
//--
//ALTER TABLE `tblvehiclerecurringsubscriptions`
//  ADD PRIMARY KEY (`id`,`vehiclerecurringsubscriptionid`);
//
//--
//-- Indexes for table `tblvehiclerepairs`
//--
//ALTER TABLE `tblvehiclerepairs`
//  ADD PRIMARY KEY (`id`,`vehiclerepairid`);
//
//--
//-- Indexes for table `tblvehiclervicetype`
//--
//ALTER TABLE `tblvehiclervicetype`
//  ADD PRIMARY KEY (`id`,`vehicleservicetypeid`);
//
//--
//-- Indexes for table `tblvehicleservice`
//--
//ALTER TABLE `tblvehicleservice`
//  ADD PRIMARY KEY (`id`,`vehicleserviceid`);
//
//--
//-- Indexes for table `tblvehicleserviceitems`
//--
//ALTER TABLE `tblvehicleserviceitems`
//  ADD PRIMARY KEY (`id`,`vehicleserviceitemsid`);
//
//--
//-- Indexes for table `tblvehiclesundries`
//--
//ALTER TABLE `tblvehiclesundries`
//  ADD PRIMARY KEY (`id`,`vehiclesundriesitemid`);
//
//--
//-- Indexes for table `tblvillage`
//--
//ALTER TABLE `tblvillage`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `villageid` (`villageid`);
//
//--
//-- Indexes for table `tblwfdefaults`
//--
//ALTER TABLE `tblwfdefaults`
//  ADD PRIMARY KEY (`id`,`wfdefaultsid`);
//
//--
//-- Indexes for table `tblwfmworkorders`
//--
//ALTER TABLE `tblwfmworkorders`
//  ADD PRIMARY KEY (`id`,`wfmworkordersid`);
//
//--
//-- Indexes for table `tblwfmworkordertype`
//--
//ALTER TABLE `tblwfmworkordertype`
//  ADD PRIMARY KEY (`id`,`wfmworkordertypeid`);
//
//--
//-- Indexes for table `tblwfmworkorderupdates`
//--
//ALTER TABLE `tblwfmworkorderupdates`
//  ADD PRIMARY KEY (`id`,`wfmworkorderupdatesid`);
//
//--
//-- Indexes for table `tblworkexperience`
//--
//ALTER TABLE `tblworkexperience`
//  ADD PRIMARY KEY (`id`,`employeeid`);
//
//--
//-- Indexes for table `tblyeartodate`
//--
//ALTER TABLE `tblyeartodate`
//  ADD PRIMARY KEY (`id`),
//  ADD UNIQUE KEY `employeeid` (`employeeid`);
//
//--
//-- Indexes for table `tblzonemanagers`
//--
//ALTER TABLE `tblzonemanagers`
//  ADD PRIMARY KEY (`id`,`zoneid`);
//
//--
//-- Indexes for table `tblzones`
//--
//ALTER TABLE `tblzones`
//  ADD PRIMARY KEY (`id`,`zoneid`);
//
//--
//-- Indexes for table `tblzonesparadingposts`
//--
//ALTER TABLE `tblzonesparadingposts`
//  ADD PRIMARY KEY (`id`,`zonesparadingpostsid`);
//
//--
//-- AUTO_INCREMENT for dumped tables
//--
//
//--
//-- AUTO_INCREMENT for table `tblagdocument`
//--
//ALTER TABLE `tblagdocument`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblagdocumentitems`
//--
//ALTER TABLE `tblagdocumentitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblagerrordocument`
//--
//ALTER TABLE `tblagerrordocument`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblagerrordocumentitems`
//--
//ALTER TABLE `tblagerrordocumentitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblallocationhistory`
//--
//ALTER TABLE `tblallocationhistory`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblallocations`
//--
//ALTER TABLE `tblallocations`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblallowances`
//--
//ALTER TABLE `tblallowances`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblallowdeductimport`
//--
//ALTER TABLE `tblallowdeductimport`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetcodes`
//--
//ALTER TABLE `tblassetcodes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetinventorytran`
//--
//ALTER TABLE `tblassetinventorytran`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetinvtranitems`
//--
//ALTER TABLE `tblassetinvtranitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetreceiving`
//--
//ALTER TABLE `tblassetreceiving`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetreceivingitems`
//--
//ALTER TABLE `tblassetreceivingitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetrepairs`
//--
//ALTER TABLE `tblassetrepairs`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassets`
//--
//ALTER TABLE `tblassets`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetstockadjustments`
//--
//ALTER TABLE `tblassetstockadjustments`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetstocks`
//--
//ALTER TABLE `tblassetstocks`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassetstockshistory`
//--
//ALTER TABLE `tblassetstockshistory`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblassettypes`
//--
//ALTER TABLE `tblassettypes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblattendanceexporttemp`
//--
//ALTER TABLE `tblattendanceexporttemp`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblbalancedsystem`
//--
//ALTER TABLE `tblbalancedsystem`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblbank`
//--
//ALTER TABLE `tblbank`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblbankbranch`
//--
//ALTER TABLE `tblbankbranch`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblbilling`
//--
//ALTER TABLE `tblbilling`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblbillinginvoices`
//--
//ALTER TABLE `tblbillinginvoices`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblcasualtyboard`
//--
//ALTER TABLE `tblcasualtyboard`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblcasualtytypes`
//--
//ALTER TABLE `tblcasualtytypes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblcheckhistory`
//--
//ALTER TABLE `tblcheckhistory`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblchecks`
//--
//ALTER TABLE `tblchecks`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblchecksgroup`
//--
//ALTER TABLE `tblchecksgroup`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblchecksregister`
//--
//ALTER TABLE `tblchecksregister`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblcompanybranches`
//--
//ALTER TABLE `tblcompanybranches`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `tblcompanydetails`
//--
//ALTER TABLE `tblcompanydetails`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
//
//--
//-- AUTO_INCREMENT for table `tblcountry`
//--
//ALTER TABLE `tblcountry`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
//
//--
//-- AUTO_INCREMENT for table `tbldeletethistableassetstockinvtranitems`
//--
//ALTER TABLE `tbldeletethistableassetstockinvtranitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldepartments`
//--
//ALTER TABLE `tbldepartments`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
//
//--
//-- AUTO_INCREMENT for table `tbldependance`
//--
//ALTER TABLE `tbldependance`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldeploymentsheetmessages`
//--
//ALTER TABLE `tbldeploymentsheetmessages`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldeploymentsheetnew`
//--
//ALTER TABLE `tbldeploymentsheetnew`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldeploymentsheetweekly`
//--
//ALTER TABLE `tbldeploymentsheetweekly`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldeploymentsheetweeklyentry`
//--
//ALTER TABLE `tbldeploymentsheetweeklyentry`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldesignation`
//--
//ALTER TABLE `tbldesignation`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
//
//--
//-- AUTO_INCREMENT for table `tbldisciplinary`
//--
//ALTER TABLE `tbldisciplinary`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldutyattendanceallowancenew`
//--
//ALTER TABLE `tbldutyattendanceallowancenew`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbldutyattendancenew`
//--
//ALTER TABLE `tbldutyattendancenew`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblebsecgroup`
//--
//ALTER TABLE `tblebsecgroup`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblebsecgroupaccess`
//--
//ALTER TABLE `tblebsecgroupaccess`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblebsecstaticrights`
//--
//ALTER TABLE `tblebsecstaticrights`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblebsecusergroups`
//--
//ALTER TABLE `tblebsecusergroups`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblebusers`
//--
//ALTER TABLE `tblebusers`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
//
//--
//-- AUTO_INCREMENT for table `tblemployeeaddress`
//--
//ALTER TABLE `tblemployeeaddress`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblemployeeallowdeduct`
//--
//ALTER TABLE `tblemployeeallowdeduct`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblexternaluploads`
//--
//ALTER TABLE `tblexternaluploads`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfinancialpayperiod`
//--
//ALTER TABLE `tblfinancialpayperiod`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfinancialyear`
//--
//ALTER TABLE `tblfinancialyear`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfuelcoupon`
//--
//ALTER TABLE `tblfuelcoupon`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfuelpurchase`
//--
//ALTER TABLE `tblfuelpurchase`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfuelreserves`
//--
//ALTER TABLE `tblfuelreserves`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblfueltankrefill`
//--
//ALTER TABLE `tblfueltankrefill`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblgrades`
//--
//ALTER TABLE `tblgrades`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblgradesalaries`
//--
//ALTER TABLE `tblgradesalaries`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblgratuity`
//--
//ALTER TABLE `tblgratuity`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblguardpaypoints`
//--
//ALTER TABLE `tblguardpaypoints`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblguards`
//--
//ALTER TABLE `tblguards`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
//
//--
//-- AUTO_INCREMENT for table `tblguardskillshistory`
//--
//ALTER TABLE `tblguardskillshistory`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblhearingactions`
//--
//ALTER TABLE `tblhearingactions`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblhearings`
//--
//ALTER TABLE `tblhearings`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblholidays`
//--
//ALTER TABLE `tblholidays`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblincidentypes`
//--
//ALTER TABLE `tblincidentypes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblinvoice`
//--
//ALTER TABLE `tblinvoice`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblinvoicelineitems`
//--
//ALTER TABLE `tblinvoicelineitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblleave`
//--
//ALTER TABLE `tblleave`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblleavebalance`
//--
//ALTER TABLE `tblleavebalance`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblleavebankdob`
//--
//ALTER TABLE `tblleavebankdob`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblleavetype`
//--
//ALTER TABLE `tblleavetype`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblleaveupload`
//--
//ALTER TABLE `tblleaveupload`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblloancashrepayment`
//--
//ALTER TABLE `tblloancashrepayment`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblmedicaldetails`
//--
//ALTER TABLE `tblmedicaldetails`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `tblmessageclass`
//--
//ALTER TABLE `tblmessageclass`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblmopnthlybalancedsystemposts`
//--
//ALTER TABLE `tblmopnthlybalancedsystemposts`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblnextofkin`
//--
//ALTER TABLE `tblnextofkin`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblnotes`
//--
//ALTER TABLE `tblnotes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloccurance`
//--
//ALTER TABLE `tbloccurance`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloccurancebook`
//--
//ALTER TABLE `tbloccurancebook`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloccurancebookallowedtypes`
//--
//ALTER TABLE `tbloccurancebookallowedtypes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloccuranceemployees`
//--
//ALTER TABLE `tbloccuranceemployees`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloccurancetype`
//--
//ALTER TABLE `tbloccurancetype`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloffences`
//--
//ALTER TABLE `tbloffences`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloffensegrouping`
//--
//ALTER TABLE `tbloffensegrouping`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloffensegrouplistingsublist`
//--
//ALTER TABLE `tbloffensegrouplistingsublist`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbloffensegroupverdict`
//--
//ALTER TABLE `tbloffensegroupverdict`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpatterns`
//--
//ALTER TABLE `tblpatterns`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpaydetails`
//--
//ALTER TABLE `tblpaydetails`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpaynetdata`
//--
//ALTER TABLE `tblpaynetdata`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpaypoints`
//--
//ALTER TABLE `tblpaypoints`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayrun`
//--
//ALTER TABLE `tblpayrun`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayruncashdenomination`
//--
//ALTER TABLE `tblpayruncashdenomination`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayruncounter`
//--
//ALTER TABLE `tblpayruncounter`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayrungrouplist`
//--
//ALTER TABLE `tblpayrungrouplist`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayruntaxband`
//--
//ALTER TABLE `tblpayruntaxband`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayslipallowdeduct`
//--
//ALTER TABLE `tblpayslipallowdeduct`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpayslipunpaidallowdeduct`
//--
//ALTER TABLE `tblpayslipunpaidallowdeduct`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpaystoppage`
//--
//ALTER TABLE `tblpaystoppage`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpaytablenew`
//--
//ALTER TABLE `tblpaytablenew`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpersperincident`
//--
//ALTER TABLE `tblpersperincident`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpostallowances`
//--
//ALTER TABLE `tblpostallowances`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblposts`
//--
//ALTER TABLE `tblposts`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblposttrainingrequirement`
//--
//ALTER TABLE `tblposttrainingrequirement`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblpromotionsuccession`
//--
//ALTER TABLE `tblpromotionsuccession`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrates`
//--
//ALTER TABLE `tblrates`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrecruitdependance`
//--
//ALTER TABLE `tblrecruitdependance`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrecruitnextkin`
//--
//ALTER TABLE `tblrecruitnextkin`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrecruitsbio`
//--
//ALTER TABLE `tblrecruitsbio`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrecruitscontacts`
//--
//ALTER TABLE `tblrecruitscontacts`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `tblrecruitvillage`
//--
//ALTER TABLE `tblrecruitvillage`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrefrees`
//--
//ALTER TABLE `tblrefrees`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrelievers`
//--
//ALTER TABLE `tblrelievers`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblrelieverslisting`
//--
//ALTER TABLE `tblrelieverslisting`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblreligion`
//--
//ALTER TABLE `tblreligion`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblreportpump`
//--
//ALTER TABLE `tblreportpump`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblschedulesnew`
//--
//ALTER TABLE `tblschedulesnew`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblshifttypes`
//--
//ALTER TABLE `tblshifttypes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsiteallowances`
//--
//ALTER TABLE `tblsiteallowances`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsiteguardexclusions`
//--
//ALTER TABLE `tblsiteguardexclusions`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsites`
//--
//ALTER TABLE `tblsites`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsitesuspensions`
//--
//ALTER TABLE `tblsitesuspensions`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblskills`
//--
//ALTER TABLE `tblskills`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsocialmedia`
//--
//ALTER TABLE `tblsocialmedia`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `tblsstnotifications`
//--
//ALTER TABLE `tblsstnotifications`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsstnotificationsubscriptions`
//--
//ALTER TABLE `tblsstnotificationsubscriptions`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsstreporting`
//--
//ALTER TABLE `tblsstreporting`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsuppliers`
//--
//ALTER TABLE `tblsuppliers`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblswitchpairingsettings`
//--
//ALTER TABLE `tblswitchpairingsettings`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsysbackup`
//--
//ALTER TABLE `tblsysbackup`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsyssettings`
//--
//ALTER TABLE `tblsyssettings`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystembackup`
//--
//ALTER TABLE `tblsystembackup`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemcodes`
//--
//ALTER TABLE `tblsystemcodes`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemcodesgroups`
//--
//ALTER TABLE `tblsystemcodesgroups`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemmessages`
//--
//ALTER TABLE `tblsystemmessages`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemposts`
//--
//ALTER TABLE `tblsystemposts`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemsettings`
//--
//ALTER TABLE `tblsystemsettings`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemtemplates`
//--
//ALTER TABLE `tblsystemtemplates`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblsystemupdatestate`
//--
//ALTER TABLE `tblsystemupdatestate`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbltrainingcourses`
//--
//ALTER TABLE `tbltrainingcourses`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tbluserroles`
//--
//ALTER TABLE `tbluserroles`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
//
//--
//-- AUTO_INCREMENT for table `tblvehicle`
//--
//ALTER TABLE `tblvehicle`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclecheck`
//--
//ALTER TABLE `tblvehiclecheck`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclefuelconsumptionlog`
//--
//ALTER TABLE `tblvehiclefuelconsumptionlog`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclepatrol`
//--
//ALTER TABLE `tblvehiclepatrol`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclerecurringsubscriptions`
//--
//ALTER TABLE `tblvehiclerecurringsubscriptions`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclerepairs`
//--
//ALTER TABLE `tblvehiclerepairs`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclervicetype`
//--
//ALTER TABLE `tblvehiclervicetype`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehicleservice`
//--
//ALTER TABLE `tblvehicleservice`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehicleserviceitems`
//--
//ALTER TABLE `tblvehicleserviceitems`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvehiclesundries`
//--
//ALTER TABLE `tblvehiclesundries`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblvillage`
//--
//ALTER TABLE `tblvillage`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
//
//--
//-- AUTO_INCREMENT for table `tblwfdefaults`
//--
//ALTER TABLE `tblwfdefaults`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblwfmworkorders`
//--
//ALTER TABLE `tblwfmworkorders`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblwfmworkordertype`
//--
//ALTER TABLE `tblwfmworkordertype`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblwfmworkorderupdates`
//--
//ALTER TABLE `tblwfmworkorderupdates`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblworkexperience`
//--
//ALTER TABLE `tblworkexperience`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
//
//--
//-- AUTO_INCREMENT for table `tblyeartodate`
//--
//ALTER TABLE `tblyeartodate`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblzonemanagers`
//--
//ALTER TABLE `tblzonemanagers`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//
//--
//-- AUTO_INCREMENT for table `tblzonesparadingposts`
//--
//ALTER TABLE `tblzonesparadingposts`
//  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
//COMMIT;
//
///*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
///*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
///*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
//
//    
    
    
    
}
