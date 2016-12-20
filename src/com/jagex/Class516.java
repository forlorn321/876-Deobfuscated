/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class516 {
	static Class516 aClass516_7048;
	public static Class516 aClass516_7049 = new Class516();
	static Class516 aClass516_7050 = new Class516();

	static {
		aClass516_7048 = new Class516();
	}

	Class516() {
		/* empty */
	}

	public static void method8606(boolean bool, byte i) {
		if (null == Class290.aClass300_3229)
			Class97.method1749(102380841);
		if (bool)
			Class290.aClass300_3229.method5526((byte) 0);
	}

	static final void method8607(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class555.method9409(class674.aClass243_8587, i_0_, i_1_, (byte) 21);
	}

	static final void method8608(Class665 class665, byte i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -109) != Class309.aClass309_3459)
			throw new RuntimeException();
		((Class696_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5472(1001937391)).method17151((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 755018329);
	}

	static void method8609(Class665 class665, int i) {
		int i_2_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 - 3];
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 - 2];
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1];
		class665.anInt8526 -= 307142523;
		if (i_2_ > class665.anIntArray8538[i_3_])
			throw new RuntimeException();
		if (i_2_ > class665.anIntArray8538[i_4_])
			throw new RuntimeException();
		if (i_4_ == i_3_)
			throw new RuntimeException();
		Class149.method2492(class665.anIntArrayArray8542[i_3_], class665.anIntArrayArray8542[i_4_], 0, i_2_ - 1, 918650110);
	}

	public static Interface76 method8610(Class var_class, int i, byte i_5_) {
		synchronized (Class664.aMap8518) {
			Map map = (Map) Class664.aMap8518.get(var_class);
			if (null == map) {
				map = new HashMap();
				Interface76[] interface76s = (Interface76[]) var_class.getEnumConstants();
				for (int i_6_ = 0; i_6_ < interface76s.length; i_6_++) {
					Interface76 interface76 = interface76s[i_6_];
					map.put(Integer.valueOf(interface76.method87()), interface76);
				}
				Class664.aMap8518.put(var_class, map);
			}
			Interface76 interface76 = (Interface76) map.get(Integer.valueOf(i));
			return interface76;
		}
	}

	static final void method8611(Class665 class665, int i) {
		client.aClass243_11150 = null;
		client.aClass243_11205 = null;
	}
}
