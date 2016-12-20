/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class110 {
	static final int anInt1380 = 502;
	public static boolean aBool1381;
	public static boolean aBool1382 = false;
	static final int anInt1383 = 10000;
	static final int anInt1384 = 101;
	static boolean aBool1385;
	static final int anInt1386 = 1000;
	static final long aLong1387 = 64425238954L;
	static final long aLong1388 = 60129613779L;
	static final float aFloat1389 = 1.3F;
	static final int anInt1390 = 50000;
	static final int anInt1391 = 100000;

	public static int method1984() {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) 52);
		Class193.method3699(class26_sub1, 2103264057);
		return class26_sub1.method853(-1428987915);
	}

	public static int method1985() {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) 92);
		Class193.method3699(class26_sub1, 414452696);
		return class26_sub1.method853(-1685387999);
	}

	static Class527_Sub31 method1986() {
		Class19 class19 = null;
		Class527_Sub31 class527_sub31 = new Class527_Sub31(client.aClass678_11259, 0);
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, false, (byte) 97);
			byte[] is = new byte[(int) class19.method752(2011327346)];
			int i;
			for (int i_0_ = 0; i_0_ < is.length; i_0_ += i) {
				i = class19.method753(is, i_0_, is.length - i_0_, (byte) 12);
				if (i == -1)
					throw new IOException();
			}
			class527_sub31 = new Class527_Sub31(new RSByteBuffer(is), client.aClass678_11259, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) -26);
		} catch (Exception exception) {
			/* empty */
		}
		return class527_sub31;
	}

	Class110() throws Throwable {
		throw new Error();
	}

	static void method1987(Class26_Sub1 class26_sub1) {
		class26_sub1.method16295(0, 2083967390);
		int i;
		if (Class515.anInt7045 * 814176903 >= 96) {
			int i_1_ = Class574.method9623((byte) -20);
			if (i_1_ <= 101) {
				Class6.method586((byte) 14);
				i = 4;
			} else if (i_1_ <= 502) {
				Class394.method6501(-1479771213);
				i = 3;
			} else if (i_1_ <= 1000) {
				Class211.method3879(-691052019);
				i = 2;
			} else {
				Class53.method1291(true, -2034576485);
				i = 1;
			}
			class26_sub1.method16294(0, i_1_, (byte) 10);
		} else {
			Class53.method1291(true, -2034576485);
			i = 1;
			class26_sub1.method16293(64, 1634495003);
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-705949908) != 0) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 1936945891);
			Class535.method8982(0, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 111);
		Class631.method10465(1576898293);
		class26_sub1.method16296(i, -630771839);
	}

	public static void method1988() {
		Class19 class19 = null;
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, true, (byte) 97);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 17);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) -88);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static int method1989() {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) -86);
		Class193.method3699(class26_sub1, -184163233);
		return class26_sub1.method853(-2039128267);
	}

	public static void method1990() {
		Class19 class19 = null;
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, true, (byte) 97);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 8);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) -70);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static int method1991() {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) 79);
		Class193.method3699(class26_sub1, -1318054243);
		return class26_sub1.method853(-2060046368);
	}

	public static void method1992(boolean bool) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 2080369046);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 1153197249);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 0, 229966316);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 801627502);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 0, 1468141527);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 1920367675);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 487852078);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 66628443);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1401342278);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, -73544724);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 663921629);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 281916121);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, -223530095);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1423223266);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 723217703);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 287554926);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, -22887162);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 462024580);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, 298200757);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 643636355);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 1, 2102652008);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(206529905).method10252((short) -10618);
		client.aBool11183 = true;
	}

	static {
		aBool1381 = false;
		aBool1385 = false;
	}

	static void method1993(Class26_Sub1 class26_sub1) {
		class26_sub1.method16295(0, 2083967390);
		int i;
		if (Class515.anInt7045 * 814176903 >= 96) {
			int i_2_ = Class574.method9623((byte) -9);
			if (i_2_ <= 101) {
				Class6.method586((byte) 14);
				i = 4;
			} else if (i_2_ <= 502) {
				Class394.method6501(-1716748637);
				i = 3;
			} else if (i_2_ <= 1000) {
				Class211.method3879(-187293421);
				i = 2;
			} else {
				Class53.method1291(true, -2034576485);
				i = 1;
			}
			class26_sub1.method16294(0, i_2_, (byte) 10);
		} else {
			Class53.method1291(true, -2034576485);
			i = 1;
			class26_sub1.method16293(64, 563264746);
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1411270499) != 0) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 1521088841);
			Class535.method8982(0, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 117);
		Class631.method10465(-2056939244);
		class26_sub1.method16296(i, 1454707872);
	}

	public static void method1994() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 1984676949);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 1466123241);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 1101876770);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, -70383395);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 323548412);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 2083384364);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 688588813);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1686451555);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 723850607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 539955939);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, -214447096);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 626208089);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 925080900);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 544253604);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 295171884);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1962710296);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 1339708385);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, -64450107);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, 1659274382);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 363210841);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 2, 651123026);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(2053159002).method10252((short) -13795);
		client.aBool11183 = true;
	}

	public static int method1995() {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) 52);
		Class193.method3699(class26_sub1, -270213240);
		return class26_sub1.method853(-1199160073);
	}

	static void method1996(Class26_Sub1 class26_sub1, int i, int i_3_) {
		class26_sub1.method16295(i, 2083967390);
		int i_4_;
		if (i_3_ > 100000) {
			Class6.method586((byte) 14);
			i_4_ = 4;
		} else if (i_3_ > 50000) {
			Class394.method6501(-161589278);
			i_4_ = 3;
		} else if (i_3_ > 10000) {
			Class211.method3879(1372053002);
			i_4_ = 2;
		} else {
			Class53.method1291(true, -2034576485);
			i_4_ = 1;
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-464219324) != i) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), i, 1433331280);
			Class535.method8982(i, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 103);
		Class631.method10465(-1896341050);
		class26_sub1.method16296(i_4_, -1126564195);
	}

	static void method1997(Class26_Sub1 class26_sub1, int i, int i_5_) {
		class26_sub1.method16295(i, 2083967390);
		int i_6_;
		if (i_5_ > 100000) {
			Class6.method586((byte) 14);
			i_6_ = 4;
		} else if (i_5_ > 50000) {
			Class394.method6501(-17716131);
			i_6_ = 3;
		} else if (i_5_ > 10000) {
			Class211.method3879(361917570);
			i_6_ = 2;
		} else {
			Class53.method1291(true, -2034576485);
			i_6_ = 1;
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-324735346) != i) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), i, 1407688971);
			Class535.method8982(i, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 105);
		Class631.method10465(1739196704);
		class26_sub1.method16296(i_6_, 1266351277);
	}

	public static void method1998() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 2, 335487159);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 2, 253901654);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 1328327967);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 166668201);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 1, -216122450);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 1, -138769082);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 1, 1328521741);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 1, -25625246);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 2, 1245055489);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 1, 2145497085);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 2, 371173672);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 1, 583838173);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 1490905537);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 481444533);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 2, -155950368);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 547670709);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 879813875);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 1, 1565146094);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 1, 1665711651);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 0, 150247976);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 4, 140756130);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(1504935621).method10252((short) -32118);
		client.aBool11183 = true;
	}

	public static void method1999() {
		Class19 class19 = null;
		try {
			class19 = Class32.method944("", client.aClass678_11259.aString8616, true, (byte) 97);
			RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 51);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method751((byte) -3);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method2000() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 2, 748865319);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 2, 292000112);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 83210948);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 610750174);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 1, 1232474612);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 1, 1608362968);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 1, 319368211);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 1, 571487041);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 1, 1903120656);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 1, 1458858453);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 271269354);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 1, 976767231);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 2092735899);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1470905294);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 1, 1945482907);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1100718375);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 75128841);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 1, 71777171);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 1, 1909806332);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 1, 794606513);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 3, 1452667000);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-610245308).method10252((short) -13906);
		client.aBool11183 = true;
	}

	public static void method2001() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 216351767);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 27223666);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 895471346);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 1654294630);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 1430870492);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 582440456);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 1105623350);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1268824969);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 101957741);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 457134459);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 1324786939);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 1967667891);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 1570876726);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1954905473);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 1925671917);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1785195558);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, -137213929);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 1472337090);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, -24215758);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 1482022448);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 2, 1416615942);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-176438690).method10252((short) -16458);
		client.aBool11183 = true;
	}

	static void method2002(Class26_Sub1 class26_sub1, int i, int i_7_) {
		class26_sub1.method16295(i, 2083967390);
		int i_8_;
		if (i_7_ > 100000) {
			Class6.method586((byte) 14);
			i_8_ = 4;
		} else if (i_7_ > 50000) {
			Class394.method6501(114964245);
			i_8_ = 3;
		} else if (i_7_ > 10000) {
			Class211.method3879(1352315749);
			i_8_ = 2;
		} else {
			Class53.method1291(true, -2034576485);
			i_8_ = 1;
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-486239737) != i) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), i, -106146896);
			Class535.method8982(i, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 127);
		Class631.method10465(-1733899724);
		class26_sub1.method16296(i_8_, -1444303297);
	}

	public static void method2003() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 866535046);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 547077254);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 1701789889);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 1444824521);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 608494620);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 119786138);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 1442453235);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1839488010);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 1004689935);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 1251775990);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 1553108359);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 1124854970);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 438282588);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1955149522);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 667709955);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1118327275);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 1238170099);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, -92725566);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, 1566777050);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 163279035);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 2, 978741200);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-1691235257).method10252((short) 1153);
		client.aBool11183 = true;
	}

	public static void method2004(boolean bool) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 475804226);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, -188829406);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 0, 924149058);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 564300885);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 0, 244748085);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 623389020);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 501304475);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 56358665);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1224262948);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 10392524);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, -94818489);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 1085952156);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 1149909483);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 2015738749);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 1939224350);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1538073411);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 1340957364);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 2023632498);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, 614183081);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 1914176777);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 1, 937775756);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-344987891).method10252((short) -21955);
		client.aBool11183 = true;
	}

	public static void method2005() {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 2, -176954986);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 2, 1543966017);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 1098456234);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 2114250604);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 1, -14082208);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 1, 884498777);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 1, 613343477);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 1, 108469026);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 1, 1804178282);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 1, 2113586901);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 511015316);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 1, -85909181);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, -131337958);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1497899753);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 1, 2117977091);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1300670571);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 2093374040);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 1, 591990089);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 1, 46796134);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 1, 729701649);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 3, 1998016601);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(37785911).method10252((short) -10331);
		client.aBool11183 = true;
	}

	public static void method2006(boolean bool) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 347692788);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 1759982299);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 0, 1208079048);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 365879009);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 0, 2025895873);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 1853231932);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 548041223);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 249212480);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1610913315);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 1309475365);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 616202928);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 478700105);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 1837530883);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 815579784);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 1226324466);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1310437322);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 1889916532);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 492838955);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, 736216167);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 1228605206);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 1, 1335318011);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(1844167194).method10252((short) -12778);
		client.aBool11183 = true;
	}

	public static void method2007(boolean bool) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 2095769346);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 1791358196);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 0, 1096496524);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 587372421);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 0, 39374604);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 1712792939);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, -30648999);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, 455452495);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 1137299022);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 85134668);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 12138462);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 1474979111);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, -217160765);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 1753358);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 896292458);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1330265183);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 1355232424);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 338631848);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, -181484420);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 90389504);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 1, 2061434977);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-426994884).method10252((short) -30426);
		client.aBool11183 = true;
	}

	static void method2008() {
		if (-776525997 * Class515.anInt7046 > 1)
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub31_10628), 4, 399505060);
		else
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub31_10628), 2, 221700172);
	}

	static void method2009() {
		if (-776525997 * Class515.anInt7046 > 1)
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub31_10628), 4, 465931933);
		else
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub31_10628), 2, 2008855620);
	}

	static final void method2010(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class665.anInt8526 -= 1023808410;
		class243.aBool2567 = true;
		class243.anInt2629 = Math.max(Math.min((class665.anIntArray8525[1769813785 * class665.anInt8526]), 2816), 0) * 1831544967;
		class243.anInt2633 = Math.max(Math.min((class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]), 2816), 0) * -93030573;
		class243.anInt2596 = Math.max(Math.min((class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]), 2816), 0) * -2147251911;
		int i_9_ = Math.max(Math.min((class665.anIntArray8525[1769813785 * class665.anInt8526 + 3]), 255), 0);
		int i_10_ = Math.max(Math.min((class665.anIntArray8525[class665.anInt8526 * 1769813785 + 4]), 255), 0);
		int i_11_ = Math.max(Math.min((class665.anIntArray8525[5 + 1769813785 * class665.anInt8526]), 255), 0);
		class243.anInt2574 = -180194171 * (i_9_ << 16 | i_10_ << 8 | i_11_);
		class243.anInt2568 = (1214013259 * class665.anIntArray8525[1769813785 * class665.anInt8526 + 6]);
		class243.anInt2569 = (class665.anIntArray8525[7 + 1769813785 * class665.anInt8526] * 1695657235);
		class243.anInt2550 = (class665.anIntArray8525[8 + class665.anInt8526 * 1769813785] * -1657553753);
		class243.anInt2575 = (class665.anIntArray8525[9 + class665.anInt8526 * 1769813785] * 1762150749);
		Class430.method6876(class243, (byte) 88);
	}

	static final void method2011(Class665 class665, int i) {
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_12_, 532924332);
		Class240 class240 = Class183.aClass240Array2100[i_12_ >> 16];
		Class302.method5575(class243, class240, class665, (short) -20158);
	}

	static final void method2012(Class665 class665, int i) {
		int i_13_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_13_, 1039867080);
		Class240 class240 = Class183.aClass240Array2100[i_13_ >> 16];
		Class400.method6532(class243, class240, class665, -1988260928);
	}

	static final void method2013(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class546.anInt7265 * 809456719 & 0x1;
	}
}
