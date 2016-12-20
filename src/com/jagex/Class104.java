/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Map;

public class Class104 {
	String aString1285;
	public String aString1286;
	public byte aByte1287;
	public int anInt1288;
	public String aString1289;
	public String aString1290;
	static boolean aBool1291;
	public static Class95_Sub1_Sub2 aClass95_Sub1_Sub2_1292;
	public static Map aMap1293;

	Class104() {
		/* empty */
	}

	static final void method1804(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -928145282);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class329.method5811(class243, class240, class665, -964046224);
	}

	static final void method1805(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (Math.random() * (double) i_1_);
	}

	static final void method1806(Class665 class665, int i) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		Class174_Sub1.method14592(bool, 329281315);
	}

	static final void method1807(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static boolean method1808(int i, byte i_2_) {
		return i == 7 || 14 == i || i == 10 || i == 6 || 5 == i;
	}

	public static void method1809(int i, byte i_3_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(5, (long) i);
		class527_sub8_sub9.method18186(1269199237);
	}
}
