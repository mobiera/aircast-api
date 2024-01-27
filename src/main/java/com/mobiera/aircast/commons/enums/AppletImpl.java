package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum AppletImpl implements Serializable {

	WIB(0),
	SAT(1),
	SAT_GEMALTO(2),
	SLEEPY(3),
	PICO(4),
	ISMS(5),
	PICO_SEMPERVIRENT(6),
	F007(7),
	F008(8),
	F009(9),
	F010(10),
	F011(11),
	F012(12),
	F013(13),
	F014(14),
	F015(15),
	F016(16),
	F017(17),
	F018(18),
	F019(19),
	F020(20),
	F021(21),
	F022(22),
	F023(23),
	F024(24),
	F025(25),
	F026(26),
	F027(27),
	F028(28),
	F029(29),
	F030(30),
	F031(31),
	F032(32),
	F033(33),
	F034(34),
	F035(35),
	F036(36),
	F037(37),
	F038(38),
	F039(39),
	F040(40),
	F041(41),
	F042(42),
	F043(43),
	F044(44),
	F045(45),
	F046(46),
	F047(47),
	F048(48),
	F049(49),
	F050(50),
	F051(51),
	F052(52),
	F053(53),
	F054(54),
	F055(55),
	F056(56),
	F057(57),
	F058(58),
	F059(59),
	F060(60),
	F061(61),
	F062(62),
	F063(63),
	F064(64),
	F065(65),
	F066(66),
	F067(67),
	F068(68),
	F069(69),
	F070(70),
	F071(71),
	F072(72),
	F073(73),
	F074(74),
	F075(75),
	F076(76),
	F077(77),
	F078(78),
	F079(79),
	F080(80),
	F081(81),
	F082(82),
	F083(83),
	F084(84),
	F085(85),
	F086(86),
	F087(87),
	F088(88),
	F089(89),
	F090(90),
	F091(91),
	F092(92),
	F093(93),
	F094(94),
	F095(95),
	F096(96),
	F097(97),
	F098(98),
	F099(99),
	F100(100),
	F101(101),
	F102(102),
	F103(103),
	F104(104),
	F105(105),
	F106(106),
	F107(107),
	F108(108),
	F109(109),
	F110(110),
	F111(111),
	F112(112),
	F113(113),
	F114(114),
	F115(115),
	F116(116),
	F117(117),
	F118(118),
	F119(119),
	F120(120),
	F121(121),
	F122(122),
	F123(123),
	F124(124),
	F125(125),
	F126(126),
	F127(127),
	F128(128),
	F129(129),
	F130(130),
	F131(131),
	F132(132),
	F133(133),
	F134(134),
	F135(135),
	F136(136),
	F137(137),
	F138(138),
	F139(139),
	F140(140),
	F141(141),
	F142(142),
	F143(143),
	F144(144),
	F145(145),
	F146(146),
	F147(147),
	F148(148),
	F149(149),
	F150(150),
	F151(151),
	F152(152),
	F153(153),
	F154(154),
	F155(155),
	F156(156),
	F157(157),
	F158(158),
	F159(159),
	F160(160),
	F161(161),
	F162(162),
	F163(163),
	F164(164),
	F165(165),
	F166(166),
	F167(167),
	F168(168),
	F169(169),
	F170(170),
	F171(171),
	F172(172),
	F173(173),
	F174(174),
	F175(175),
	F176(176),
	F177(177),
	F178(178),
	F179(179),
	F180(180),
	F181(181),
	F182(182),
	F183(183),
	F184(184),
	F185(185),
	F186(186),
	F187(187),
	F188(188),
	F189(189),
	F190(190),
	F191(191),
	F192(192),
	F193(193),
	F194(194),
	F195(195),
	F196(196),
	F197(197),
	F198(198),
	F199(199),
	
	F200(200),
	F201(201),
	F202(202),
	F203(203),
	F204(204),
	F205(205),
	F206(206),
	F207(207),
	F208(208),
	F209(209),
	F210(210),
	F211(211),
	F212(212),
	F213(213),
	F214(214),
	F215(215),
	F216(216),
	F217(217),
	F218(218),
	F219(219),
	F220(220),
	F221(221),
	F222(222),
	F223(223),
	F224(224),
	F225(225),
	F226(226),
	F227(227),
	F228(228),
	F229(229),
	F230(230),
	F231(231),
	F232(232),
	F233(233),
	F234(234),
	F235(235),
	F236(236),
	F237(237),
	F238(238),
	F239(239),
	F240(240),
	F241(241),
	F242(242),
	F243(243),
	F244(244),
	F245(245),
	F246(246),
	F247(247),
	F248(248),
	F249(249),
	F250(250),
	RAM(251),
	RFM(252),
	BINARY_SMS(253),
	TEXT_SMS(254);

	private AppletImpl(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}
	
	
	public static AppletImpl getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return WIB;
			case 1: return SAT;
			case 2: return SAT_GEMALTO;
			case 3: return SLEEPY;
			case 4: return PICO;
			case 5: return ISMS;
			case 6: return PICO_SEMPERVIRENT;
			case 7: return F007;
			case 8: return F008;
			case 9: return F009;
			case 10: return F010;
			case 11: return F011;
			case 12: return F012;
			case 13: return F013;
			case 14: return F014;
			case 15: return F015;
			case 16: return F016;
			case 17: return F017;
			case 18: return F018;
			case 19: return F019;
			case 20: return F020;
			case 21: return F021;
			case 22: return F022;
			case 23: return F023;
			case 24: return F024;
			case 25: return F025;
			case 26: return F026;
			case 27: return F027;
			case 28: return F028;
			case 29: return F029;
			case 30: return F030;
			case 31: return F031;
			case 32: return F032;
			case 33: return F033;
			case 34: return F034;
			case 35: return F035;
			case 36: return F036;
			case 37: return F037;
			case 38: return F038;
			case 39: return F039;
			case 40: return F040;
			case 41: return F041;
			case 42: return F042;
			case 43: return F043;
			case 44: return F044;
			case 45: return F045;
			case 46: return F046;
			case 47: return F047;
			case 48: return F048;
			case 49: return F059;
			case 50: return F050;
			case 51: return F051;
			case 52: return F052;
			case 53: return F053;
			case 54: return F054;
			case 55: return F055;
			case 56: return F056;
			case 57: return F057;
			case 58: return F058;
			case 59: return F059;
			case 60: return F060;
			case 61: return F061;
			case 62: return F062;
			case 63: return F063;
			case 64: return F064;
			case 65: return F065;
			case 66: return F066;
			case 67: return F067;
			case 68: return F068;
			case 69: return F069;
			case 70: return F070;
			case 71: return F071;
			case 72: return F072;
			case 73: return F073;
			case 74: return F074;
			case 75: return F075;
			case 76: return F076;
			case 77: return F077;
			case 78: return F078;
			case 79: return F079;
			case 80: return F080;
			case 81: return F081;
			case 82: return F082;
			case 83: return F083;
			case 84: return F084;
			case 85: return F085;
			case 86: return F086;
			case 87: return F087;
			case 88: return F088;
			case 89: return F089;
			case 90: return F090;
			case 91: return F091;
			case 92: return F092;
			case 93: return F093;
			case 94: return F094;
			case 95: return F095;
			case 96: return F096;
			case 97: return F097;
			case 98: return F098;
			case 99: return F099;
			
			case 100: return F100;
			case 101: return F101;
			case 102: return F102;
			case 103: return F103;
			case 104: return F104;
			case 105: return F105;
			case 106: return F106;
			case 107: return F107;
			case 108: return F108;
			case 109: return F109;
			case 110: return F110;
			case 111: return F111;
			case 112: return F112;
			case 113: return F113;
			case 114: return F114;
			case 115: return F115;
			case 116: return F116;
			case 117: return F117;
			case 118: return F118;
			case 119: return F119;
			case 120: return F120;
			case 121: return F121;
			case 122: return F122;
			case 123: return F123;
			case 124: return F124;
			case 125: return F125;
			case 126: return F126;
			case 127: return F127;
			case 128: return F128;
			case 129: return F129;
			case 130: return F130;
			case 131: return F131;
			case 132: return F132;
			case 133: return F133;
			case 134: return F134;
			case 135: return F135;
			case 136: return F136;
			case 137: return F137;
			case 138: return F138;
			case 139: return F139;
			case 140: return F140;
			case 141: return F141;
			case 142: return F142;
			case 143: return F143;
			case 144: return F144;
			case 145: return F145;
			case 146: return F146;
			case 147: return F147;
			case 148: return F148;
			case 149: return F159;
			case 150: return F150;
			case 151: return F151;
			case 152: return F152;
			case 153: return F153;
			case 154: return F154;
			case 155: return F155;
			case 156: return F156;
			case 157: return F157;
			case 158: return F158;
			case 159: return F159;
			case 160: return F160;
			case 161: return F161;
			case 162: return F162;
			case 163: return F163;
			case 164: return F164;
			case 165: return F165;
			case 166: return F166;
			case 167: return F167;
			case 168: return F168;
			case 169: return F169;
			case 170: return F170;
			case 171: return F171;
			case 172: return F172;
			case 173: return F173;
			case 174: return F174;
			case 175: return F175;
			case 176: return F176;
			case 177: return F177;
			case 178: return F178;
			case 179: return F179;
			case 180: return F180;
			case 181: return F181;
			case 182: return F182;
			case 183: return F183;
			case 184: return F184;
			case 185: return F185;
			case 186: return F186;
			case 187: return F187;
			case 188: return F188;
			case 189: return F189;
			case 190: return F190;
			case 191: return F191;
			case 192: return F192;
			case 193: return F193;
			case 194: return F194;
			case 195: return F195;
			case 196: return F196;
			case 197: return F197;
			case 198: return F198;
			case 199: return F199;
			
			case 200: return F200;
			case 201: return F201;
			case 202: return F202;
			case 203: return F203;
			case 204: return F204;
			case 205: return F205;
			case 206: return F206;
			case 207: return F207;
			case 208: return F208;
			case 209: return F209;
			case 210: return F210;
			case 211: return F211;
			case 212: return F212;
			case 213: return F213;
			case 214: return F214;
			case 215: return F215;
			case 216: return F216;
			case 217: return F217;
			case 218: return F218;
			case 219: return F219;
			case 220: return F220;
			case 221: return F221;
			case 222: return F222;
			case 223: return F223;
			case 224: return F224;
			case 225: return F225;
			case 226: return F226;
			case 227: return F227;
			case 228: return F228;
			case 229: return F229;
			case 230: return F230;
			case 231: return F231;
			case 232: return F232;
			case 233: return F233;
			case 234: return F234;
			case 235: return F235;
			case 236: return F236;
			case 237: return F237;
			case 238: return F238;
			case 239: return F239;
			case 240: return F240;
			case 241: return F241;
			case 242: return F242;
			case 243: return F243;
			case 244: return F244;
			case 245: return F245;
			case 246: return F246;
			case 247: return F247;
			case 248: return F248;
			case 249: return F249;
			case 250: return F250;
			
			
			case 251: return RAM;
			case 252: return RFM;
			case 253: return BINARY_SMS;
			case 254: return TEXT_SMS;
			default: return null;
		}
	}

	
	public String getValue() {
		return this.name();
	}
	private String label;
	public String getLabel() {
		return label;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return this.toString();
	}
}