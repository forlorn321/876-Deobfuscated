/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class574 {
	static Class574 aClass574_7632;
	static Class574 aClass574_7633;
	static Class574 aClass574_7634 = new Class574(0);
	int anInt7635;

	static Class574[] method9619() {
		return (new Class574[] { aClass574_7632, aClass574_7634, aClass574_7633 });
	}

	Class574(int i) {
		anInt7635 = -1283334327 * i;
	}

	static {
		aClass574_7633 = new Class574(1);
		aClass574_7632 = new Class574(2);
	}

	static Class574[] method9620() {
		return (new Class574[] { aClass574_7632, aClass574_7634, aClass574_7633 });
	}

	static Class574[] method9621() {
		return (new Class574[] { aClass574_7632, aClass574_7634, aClass574_7633 });
	}

	static final void method9622(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class253.method4696(class243, class240, class665, 1499792429);
	}

	public static int method9623(byte i) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class180 class180 = Class700_Sub34.method17259(0, canvas, null, null, null, null, null, null, 0, (byte) 111);
		long l = Class234.method4347(-1408626088);
		for (int i_0_ = 0; i_0_ < 10000; i_0_++)
			class180.method3076(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i_1_ = (int) (Class234.method4347(-1408626088) - l);
		class180.method3174(0, 0, 100, 100, -16777216, 1840198220);
		class180.method3081((byte) 93);
		return i_1_;
	}

	static final void method9624(Class665 class665, int i) {
		Class208_Sub10.aClass296_Sub1_9923.method5368(417269819);
	}

	static final void method9625(Class665 class665, byte i) throws Exception_Sub6 {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class208_Sub10.aClass296_Sub1_9923.method5346(Class535.method8981(i_2_, -732925638), true, 1032920337);
		client.aBool11119 = true;
	}

	public static void method9626(int i, byte i_3_) {
		Class25 class25 = (Class25) Class529_Sub1.aHashMap10782.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt236 = 1896267987 * Class529_Sub1.anInt10784;
		class25.anInt235 = Class529_Sub1.anInt10791 * 1656762787;
		Class529_Sub1.aHashMap10782.put(Integer.valueOf(i), class25);
	}

	static final void method9627(Class665 class665, int i) {
		Class289.method5227(-720615507);
	}

	static final void method9628(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2553 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -413286125;
		Class430.method6876(class243, (byte) 11);
		if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394)
			Class208_Sub21.method15637(-254728301 * class243.anInt2504, (byte) -83);
	}

	public static Class527_Sub34_Sub1 method9629(int i, int i_4_, int i_5_, int i_6_, short i_7_) {
		synchronized (Class527_Sub34_Sub1.aClass527_Sub34_Sub1Array11810) {
			Class527_Sub34_Sub1 class527_sub34_sub1;
			if (Class281.anInt3189 * 1993086343 == 0)
				class527_sub34_sub1 = new Class527_Sub34_Sub1();
			else
				class527_sub34_sub1 = (Class527_Sub34_Sub1.aClass527_Sub34_Sub1Array11810[(Class281.anInt3189 -= -1166696393) * 1993086343]);
			class527_sub34_sub1.anInt11808 = i * -546762977;
			class527_sub34_sub1.anInt11814 = -648251755 * i_4_;
			class527_sub34_sub1.anInt11799 = i_5_ * 996370719;
			class527_sub34_sub1.anInt11811 = i_6_ * 1221087995;
			class527_sub34_sub1.aLong11812 = Class234.method4347(-1408626088) * -6368162815598308977L;
			Class527_Sub34_Sub1 class527_sub34_sub1_8_ = class527_sub34_sub1;
			return class527_sub34_sub1_8_;
		}
	}

	public static Class687[] method9630(int i) {
		return (new Class687[] { Class687.aClass687_8678, Class687.aClass687_8676, Class687.aClass687_8679, Class687.aClass687_8675, Class687.aClass687_8677 });
	}
}
