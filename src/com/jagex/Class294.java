/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class294 implements Interface20 {
	public Class324 method123(int i, int i_0_) {
		return (Class324) Class56.aClass34_Sub14_608.method70(i, (byte) 77);
	}

	public Class153 method127(Class458 class458, int i) {
		return (Class153) ((Interface12) Class622.aMap8128.get(class458)).method70(i, (byte) -58);
	}

	public Class324 method122(int i) {
		return (Class324) Class56.aClass34_Sub14_608.method70(i, (byte) 22);
	}

	public Class153 method125(Class458 class458, int i) {
		return (Class153) ((Interface12) Class622.aMap8128.get(class458)).method70(i, (byte) -11);
	}

	public Class153 method126(Class458 class458, int i) {
		return (Class153) ((Interface12) Class622.aMap8128.get(class458)).method70(i, (byte) 28);
	}

	public Class153 method128(Class458 class458, int i) {
		return (Class153) ((Interface12) Class622.aMap8128.get(class458)).method70(i, (byte) -37);
	}

	public Class153 method124(Class458 class458, int i, int i_1_) {
		return (Class153) ((Interface12) Class622.aMap8128.get(class458)).method70(i, (byte) -46);
	}

	static void method3971(Class536_Sub30 class536_sub30, byte i) {
		Class37.aClass301_Sub1_302 = new Class301_Sub1(client.aClass24_11138);
		Class37.aClass301_Sub1_302.method4033(Class293.aClass293_3246, -693000904);
		try {
			Class333_Sub1 class333_sub1 = ((Class333_Sub1) Class37.aClass301_Sub1_302.method4031((Class290.aClass290_3222), false, -2059294459));
			Class706_Sub3 class706_sub3 = ((Class706_Sub3) Class37.aClass301_Sub1_302.method4082(Class300.aClass300_3357, false, (byte) 0));
			class333_sub1.method9160(class536_sub30, 932993598);
			class706_sub3.method10279(new Class425(0.0F, 0.0F, 0.0F), 1893971552);
			Class37.aClass301_Sub1_302.method4039(Class436.method5257(99999.0F, 99999.0F, 99999.0F), 2017443017);
			Class37.aClass301_Sub1_302.method4037(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 178705339);
			Class37.aClass301_Sub1_302.method4040(Class436.method5257(99999.0F, 99999.0F, 99999.0F), (byte) 120);
			Class37.aClass301_Sub1_302.method4036(Class436.method5257(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 263350573);
		} catch (Exception_Sub3 exception_sub3) {
			/* empty */
		}
		Class37.anInt301 = Class329.aClass550_3601.method6656(-826888612) * 1066863451;
		Class229.anInt2363 = Class329.aClass550_3601.method6657(-1084649709) * -1290347163;
		Class37.aBool303 = true;
	}

	public static void method3972(boolean bool, int i) {
		if (bool != Class575.aBool7659) {
			Class382.method4821((short) 20841);
			Class575.aBool7659 = bool;
		}
	}

	static final void method3973(Class668 class668, int i) {
		if (Class683.aClass301_Sub1_8651.method4062(276195302) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10290((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]), 271023129);
	}

	static final void method3974(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (423156687 * client.anInt11160 != 0 || ((!client.aBool11078 || client.aBool11163) && !client.aBool11166)) {
			String string_2_ = string.toLowerCase();
			int i_3_ = 0;
			if (string_2_.startsWith(Class38.aClass38_462.method840(Language.aClass664_8524, 1766526427))) {
				i_3_ = 0;
				string = string.substring(Class38.aClass38_462.method840(Language.aClass664_8524, 1432466778).length());
			} else if (string_2_.startsWith(Class38.aClass38_463.method840(Language.aClass664_8524, 1620738155))) {
				i_3_ = 1;
				string = string.substring(Class38.aClass38_463.method840(Language.aClass664_8524, 1708169635).length());
			} else if (string_2_.startsWith(Class38.aClass38_374.method840(Language.aClass664_8524, 1540388125))) {
				i_3_ = 2;
				string = string.substring(Class38.aClass38_374.method840(Language.aClass664_8524, 1497110864).length());
			} else if (string_2_.startsWith(Class38.aClass38_354.method840(Language.aClass664_8524, 2029845967))) {
				i_3_ = 3;
				string = string.substring(Class38.aClass38_354.method840(Language.aClass664_8524, 1742955502).length());
			} else if (string_2_.startsWith(Class38.aClass38_466.method840(Language.aClass664_8524, 2033143576))) {
				i_3_ = 4;
				string = string.substring(Class38.aClass38_466.method840(Language.aClass664_8524, 1734204704).length());
			} else if (string_2_.startsWith(Class38.aClass38_467.method840(Language.aClass664_8524, 1309960090))) {
				i_3_ = 5;
				string = string.substring(Class38.aClass38_467.method840(Language.aClass664_8524, 1416211294).length());
			} else if (string_2_.startsWith(Class38.aClass38_468.method840(Language.aClass664_8524, 2028626404))) {
				i_3_ = 6;
				string = string.substring(Class38.aClass38_468.method840(Language.aClass664_8524, 1922932621).length());
			} else if (string_2_.startsWith(Class38.aClass38_361.method840(Language.aClass664_8524, 1657291585))) {
				i_3_ = 7;
				string = string.substring(Class38.aClass38_361.method840(Language.aClass664_8524, 1635823559).length());
			} else if (string_2_.startsWith(Class38.aClass38_324.method840(Language.aClass664_8524, 1625273835))) {
				i_3_ = 8;
				string = string.substring(Class38.aClass38_324.method840(Language.aClass664_8524, 1403557395).length());
			} else if (string_2_.startsWith(Class38.aClass38_394.method840(Language.aClass664_8524, 2074117365))) {
				i_3_ = 9;
				string = string.substring(Class38.aClass38_394.method840(Language.aClass664_8524, 1818643303).length());
			} else if (string_2_.startsWith(Class38.aClass38_304.method840(Language.aClass664_8524, 1700373128))) {
				i_3_ = 10;
				string = string.substring(Class38.aClass38_304.method840(Language.aClass664_8524, 1322137862).length());
			} else if (string_2_.startsWith(Class38.aClass38_473.method840(Language.aClass664_8524, 1634674671))) {
				i_3_ = 11;
				string = string.substring(Class38.aClass38_473.method840(Language.aClass664_8524, 1861089894).length());
			} else if (Language.aClass664_8524 != Class459.CLIENT_PARAMS) {
				if (string_2_.startsWith(Class38.aClass38_462.method840(Class459.CLIENT_PARAMS, 1989369832))) {
					i_3_ = 0;
					string = string.substring(Class38.aClass38_462.method840(Class459.CLIENT_PARAMS, 2030568789).length());
				} else if (string_2_.startsWith(Class38.aClass38_463.method840(Class459.CLIENT_PARAMS, 1648010882))) {
					i_3_ = 1;
					string = string.substring(Class38.aClass38_463.method840(Class459.CLIENT_PARAMS, 1432217601).length());
				} else if (string_2_.startsWith(Class38.aClass38_374.method840(Class459.CLIENT_PARAMS, 1419447031))) {
					i_3_ = 2;
					string = string.substring(Class38.aClass38_374.method840(Class459.CLIENT_PARAMS, 1906724575).length());
				} else if (string_2_.startsWith(Class38.aClass38_354.method840(Class459.CLIENT_PARAMS, 2036438541))) {
					i_3_ = 3;
					string = string.substring(Class38.aClass38_354.method840(Class459.CLIENT_PARAMS, 1495778965).length());
				} else if (string_2_.startsWith(Class38.aClass38_466.method840(Class459.CLIENT_PARAMS, 2070768185))) {
					i_3_ = 4;
					string = string.substring(Class38.aClass38_466.method840(Class459.CLIENT_PARAMS, 1361704893).length());
				} else if (string_2_.startsWith(Class38.aClass38_467.method840(Class459.CLIENT_PARAMS, 1962384580))) {
					i_3_ = 5;
					string = string.substring(Class38.aClass38_467.method840(Class459.CLIENT_PARAMS, 1681814451).length());
				} else if (string_2_.startsWith(Class38.aClass38_468.method840(Class459.CLIENT_PARAMS, 1689857487))) {
					i_3_ = 6;
					string = string.substring(Class38.aClass38_468.method840(Class459.CLIENT_PARAMS, 1877384069).length());
				} else if (string_2_.startsWith(Class38.aClass38_361.method840(Class459.CLIENT_PARAMS, 2118267758))) {
					i_3_ = 7;
					string = string.substring(Class38.aClass38_361.method840(Class459.CLIENT_PARAMS, 1318856358).length());
				} else if (string_2_.startsWith(Class38.aClass38_324.method840(Class459.CLIENT_PARAMS, 2004386609))) {
					i_3_ = 8;
					string = string.substring(Class38.aClass38_324.method840(Class459.CLIENT_PARAMS, 1894399284).length());
				} else if (string_2_.startsWith(Class38.aClass38_394.method840(Class459.CLIENT_PARAMS, 1773659300))) {
					i_3_ = 9;
					string = string.substring(Class38.aClass38_394.method840(Class459.CLIENT_PARAMS, 1553185480).length());
				} else if (string_2_.startsWith(Class38.aClass38_304.method840(Class459.CLIENT_PARAMS, 1700153333))) {
					i_3_ = 10;
					string = string.substring(Class38.aClass38_304.method840(Class459.CLIENT_PARAMS, 2101655161).length());
				} else if (string_2_.startsWith(Class38.aClass38_473.method840(Class459.CLIENT_PARAMS, 2073077586))) {
					i_3_ = 11;
					string = string.substring(Class38.aClass38_473.method840(Class459.CLIENT_PARAMS, 1561787673).length());
				}
			}
			string_2_ = string.toLowerCase();
			int i_4_ = 0;
			if (string_2_.startsWith(Class38.aClass38_474.method840(Language.aClass664_8524, 1841387297))) {
				i_4_ = 1;
				string = string.substring(Class38.aClass38_474.method840(Language.aClass664_8524, 1443287139).length());
			} else if (string_2_.startsWith(Class38.aClass38_420.method840(Language.aClass664_8524, 2026200677))) {
				i_4_ = 2;
				string = string.substring(Class38.aClass38_420.method840(Language.aClass664_8524, 2074091302).length());
			} else if (string_2_.startsWith(Class38.aClass38_476.method840(Language.aClass664_8524, 2087573889))) {
				i_4_ = 3;
				string = string.substring(Class38.aClass38_476.method840(Language.aClass664_8524, 1393041746).length());
			} else if (string_2_.startsWith(Class38.aClass38_477.method840(Language.aClass664_8524, 1840250587))) {
				i_4_ = 4;
				string = string.substring(Class38.aClass38_477.method840(Language.aClass664_8524, 2145748492).length());
			} else if (string_2_.startsWith(Class38.aClass38_367.method840(Language.aClass664_8524, 1704143490))) {
				i_4_ = 5;
				string = string.substring(Class38.aClass38_367.method840(Language.aClass664_8524, 1470577934).length());
			} else if (Language.aClass664_8524 != Class459.CLIENT_PARAMS) {
				if (string_2_.startsWith(Class38.aClass38_474.method840(Class459.CLIENT_PARAMS, 1973254152))) {
					i_4_ = 1;
					string = string.substring(Class38.aClass38_474.method840(Class459.CLIENT_PARAMS, 1327524846).length());
				} else if (string_2_.startsWith(Class38.aClass38_420.method840(Class459.CLIENT_PARAMS, 1802015113))) {
					i_4_ = 2;
					string = string.substring(Class38.aClass38_420.method840(Class459.CLIENT_PARAMS, 1867889218).length());
				} else if (string_2_.startsWith(Class38.aClass38_476.method840(Class459.CLIENT_PARAMS, 1398683073))) {
					i_4_ = 3;
					string = string.substring(Class38.aClass38_476.method840(Class459.CLIENT_PARAMS, 1485249496).length());
				} else if (string_2_.startsWith(Class38.aClass38_477.method840(Class459.CLIENT_PARAMS, 1490580031))) {
					i_4_ = 4;
					string = string.substring(Class38.aClass38_477.method840(Class459.CLIENT_PARAMS, 1318294314).length());
				} else if (string_2_.startsWith(Class38.aClass38_367.method840(Class459.CLIENT_PARAMS, 1621507716))) {
					i_4_ = 5;
					string = string.substring(Class38.aClass38_367.method840(Class459.CLIENT_PARAMS, 1632878429).length());
				}
			}
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.PUBLIC_CHAT, class106.aClass15_1258, 1391429175);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
			int i_5_ = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_3_);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_4_);
			Class100.method1334(class536_sub23.aClass536_Sub33_Sub2_10528, string, -2111850483);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9699((class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525) - i_5_, 2143837318);
			class106.method1409(class536_sub23, 1367045889);
		}
	}

	public static void method3975(int i, byte i_6_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(8, (long) i);
		class536_sub18_sub5.method10669(-1175218142);
	}

	static final void method3976(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_7_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_8_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class39.aClass450_490.method5424(i_7_, 1595761143).aCharArray11759[i_8_]);
	}
}
