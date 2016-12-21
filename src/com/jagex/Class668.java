/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class668 {
	int[][] anIntArrayArray8536;
	int[] anIntArray8537;
	long[] aLongArray8538;
	int[] anIntArray8539 = new int[5];
	Class646[] aClass646Array8540;
	int[] anIntArray8541;
	int anInt8542;
	Object[] anObjectArray8543;
	int anInt8544;
	Class499[] aClass499Array8545;
	int anInt8546;
	Class536_Sub18_Sub16 aClass536_Sub18_Sub16_8547;
	boolean aBool8548;
	Class683 aClass683_8549;
	int[] anIntArray8550;
	Class382 aClass382_8551;
	int anInt8552;
	Class536_Sub15 aClass536_Sub15_8553;
	Class649_Sub1_Sub5_Sub1 aClass649_Sub1_Sub5_Sub1_8554;
	Interface59 anInterface59_8555;
	Class649_Sub1_Sub1_Sub1 aClass649_Sub1_Sub1_Sub1_8556;
	Map aMap8557;
	Map aMap8558;
	int anInt8559;
	int anInt8560;
	Object[] anObjectArray8561;
	Class683 aClass683_8562;
	Class350 aClass350_8563;
	int anInt8564;
	long[] aLongArray8565;

	Class668() {
		anIntArrayArray8536 = new int[5][5000];
		anIntArray8541 = new int[1000];
		anInt8542 = 0;
		anObjectArray8543 = new Object[1000];
		anInt8544 = 0;
		aLongArray8565 = new long[1000];
		anInt8546 = 0;
		anInt8552 = 0;
		aClass646Array8540 = new Class646[50];
		aClass683_8549 = new Class683();
		aClass683_8562 = new Class683();
		aMap8557 = new HashMap();
		aMap8558 = new HashMap();
		anInt8559 = 0;
		anInt8564 = 1531084683;
	}

	static final void method8006(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class248.method3446(class251, class234, class668, (short) -17560);
	}

	static final void method8007(Class251 class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1938074119) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2628 = Class33.method796(string, class668, (short) 2150);
		class251.aBool2666 = true;
	}

	static boolean method8008(int i, byte i_1_) {
		return (i == 44 || i == 45 || 46 == i || i == 47 || i == 48 || 49 == i || 50 == i || i == 51 || i == 52 || 53 == i || 15 == i);
	}

	static final void method8009(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		if (-1484799213 * class251.anInt2711 != -1)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2712 * -1880327077;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method8010(int i, int[] is, int i_2_) {
		if (i != -1 && Class644.method7794(i, is, 1454645175)) {
			Class251[] class251s = Class463.aClass234Array5227[i].aClass251Array2378;
			Class609.method7262(class251s, (byte) 1);
		}
	}

	public static void method8011(Class251 class251, int i) {
		if (client.anInt11246 * 2858739 == class251.anInt2627 * -677533051)
			client.aBoolArray11240[class251.anInt2736 * 1139436581] = true;
	}
}
