/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class579 implements Interface66 {
	public static Class579 aClass579_7650;
	public static Class579 aClass579_7651 = new Class579("", 10, new Class462[] { Class462.aClass462_5153 }, null);
	public static Class579 aClass579_7652;
	public static Class579 aClass579_7653;
	public static Class579 aClass579_7654;
	public static Class579 aClass579_7655;
	public static Class579 aClass579_7656;
	public static Class579 aClass579_7657 = new Class579("", 11, new Class462[] { Class462.aClass462_5153 }, null);
	static Class579 aClass579_7658;
	public static Class579 aClass579_7659;
	public static Class579 aClass579_7660;
	public static Class579 aClass579_7661;
	public static Class579 aClass579_7662;
	public static Class579 aClass579_7663;
	public static Class579 aClass579_7664;
	public static Class579 aClass579_7665 = new Class579("", 12, new Class462[] { Class462.aClass462_5153 }, null);
	public static Class579 aClass579_7666;
	public static Class579 aClass579_7667;
	public static Class579 aClass579_7668;
	public static Class579 aClass579_7669;
	static Class579 aClass579_7670;
	static Class579 aClass579_7671;
	public int anInt7672;
	static int anInt7673;

	Class579(String string, int i, boolean bool, Class462[] class462s, boolean bool_0_, Class462[] class462s_1_) {
		anInt7672 = i * -283044667;
	}

	Class579(String string, int i) {
		this(string, i, false, null, false, null);
	}

	Class579(String string, int i, Class462[] class462s, Class462[] class462s_2_) {
		this(string, i, class462s != null, class462s, class462s_2_ != null, class462s_2_);
	}

	public int method91() {
		return 1025329677 * anInt7672;
	}

	public int method87() {
		return 1025329677 * anInt7672;
	}

	Class579(String string, int i, boolean bool, boolean bool_4_) {
		this(string, i, bool, null, bool_4_, null);
	}

	public int method42() {
		return 1025329677 * anInt7672;
	}

	static {
		aClass579_7653 = new Class579("", 13, new Class462[] { Class462.aClass462_5153 }, null);
		aClass579_7654 = new Class579("", 14, new Class462[] { Class462.aClass462_5153 }, null);
		aClass579_7655 = new Class579("", 15, new Class462[] { Class462.aClass462_5153, Class462.aClass462_5255, Class462.aClass462_5255 }, null);
		aClass579_7656 = new Class579("", 16, new Class462[] { Class462.aClass462_5153, Class462.aClass462_5255, Class462.aClass462_5255 }, null);
		aClass579_7666 = new Class579("", 17, new Class462[] { Class462.aClass462_5153, Class462.aClass462_5255, Class462.aClass462_5255 }, null);
		aClass579_7658 = new Class579("", 18);
		aClass579_7652 = new Class579("", 19);
		aClass579_7659 = new Class579("", 20, new Class462[] { Class462.aClass462_5131, Class462.aClass462_5255 }, null);
		aClass579_7661 = new Class579("", 21);
		aClass579_7662 = new Class579("", 22);
		aClass579_7663 = new Class579("", 23, new Class462[] { Class462.aClass462_5135 }, null);
		aClass579_7664 = new Class579("", 24);
		aClass579_7668 = new Class579("", 25);
		aClass579_7669 = new Class579("", 26);
		aClass579_7667 = new Class579("", 27);
		aClass579_7650 = new Class579("", 28);
		aClass579_7660 = new Class579_Sub1("", 29, true, false);
		aClass579_7670 = new Class579("", 73, true, true);
		aClass579_7671 = new Class579("", 76, true, false);
	}

	static final void method9652(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class171_Sub2.method15336(class243, class665, (byte) 35);
	}

	static final void method9653(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 460563837 * Class666.anInt8553;
	}

	public static void method9654(Class527_Sub8 class527_sub8, Class527_Sub8 class527_sub8_5_, int i) {
		if (null != class527_sub8.aClass527_Sub8_10402)
			class527_sub8.method16057((byte) -30);
		class527_sub8.aClass527_Sub8_10402 = class527_sub8_5_.aClass527_Sub8_10402;
		class527_sub8.aClass527_Sub8_10400 = class527_sub8_5_;
		class527_sub8.aClass527_Sub8_10402.aClass527_Sub8_10400 = class527_sub8;
		class527_sub8.aClass527_Sub8_10400.aClass527_Sub8_10402 = class527_sub8;
	}

	static final void method9655(Class665 class665, byte i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_6_, 1714323197);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2525 * 1620847621;
	}

	static final void method9656(Class665 class665, byte i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_7_ = ((String) class665.anObjectArray8541[1 + class665.anInt8528 * 318492261]);
		if ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string_7_;
	}
}
