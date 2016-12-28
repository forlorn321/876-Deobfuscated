/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class457 {
	static final int anInt5158 = 6;
	static final int anInt5159 = 1;
	static final int anInt5160 = 3;
	static final int anInt5161 = 0;
	static final int anInt5162 = 4;
	static final int anInt5163 = 7;
	static final int anInt5164 = 2;

	Class457() throws Throwable {
		throw new Error();
	}

	static Class536_Sub18_Sub16 method5485(int i, int i_0_) {
		Class536_Sub18_Sub16 class536_sub18_sub16 = ((Class536_Sub18_Sub16) Class652.aClass195_8488.method2859((long) i));
		if (class536_sub18_sub16 != null)
			return class536_sub18_sub16;
		byte[] is = Class649_Sub1_Sub4_Sub2.aClass461_12021.method5556(i, 0, (byte) 1);
		if (is == null || is.length <= 1)
			return null;
		try {
			class536_sub18_sub16 = Class205_Sub14.method9076(is, -658088465);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		Class652.aClass195_8488.method2856(class536_sub18_sub16, (long) i);
		return class536_sub18_sub16;
	}

	static final void method5486(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -2052584478) != null)
			string = string.substring(0, string.length() - 1);
		class251.onClickRepeatHook = Class33.method796(string, class668, (short) -18473);
		class251.hasComponentHook = true;
	}

	static void method5487(Class668 class668, int i) {
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 - 3];
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542 - 2];
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542 - 1];
		class668.anInt8542 -= 61855783;
		if (i_1_ > class668.anIntArray8539[i_2_])
			throw new RuntimeException();
		if (i_1_ > class668.anIntArray8539[i_3_])
			throw new RuntimeException();
		if (i_2_ == i_3_)
			throw new RuntimeException();
		Class591.method7112(class668.anIntArrayArray8536[i_2_], class668.anIntArrayArray8536[i_3_], 0, i_1_ - 1, (byte) 47);
	}

	public static Interface75 method5488(Class var_class, int i, int i_4_) {
		synchronized (Class669.aMap8566) {
			Map map = (Map) Class669.aMap8566.get(var_class);
			if (map == null) {
				map = new HashMap();
				Interface75[] interface75s = (Interface75[]) var_class.getEnumConstants();
				for (int i_5_ = 0; i_5_ < interface75s.length; i_5_++) {
					Interface75 interface75 = interface75s[i_5_];
					map.put(Integer.valueOf(interface75.method78()), interface75);
				}
				Class669.aMap8566.put(var_class, map);
			}
			Interface75 interface75 = (Interface75) map.get(Integer.valueOf(i));
			return interface75;
		}
	}

	static final void method5489(Class668 class668, byte i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub11_10757.method8348(i_6_, -1102005131);
	}

	static final void method5490(int i) {
		Class397.aClass251Array4115 = null;
		Class527.method6432(-1959825479 * client.anInt11187, 0, 0, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965, 0, 0, -1, 87077000);
		if (null != Class397.aClass251Array4115) {
			Class620.method7404(Class397.aClass251Array4115, -1412584499, 0, 0, Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, -800528797 * Class581.anInt7698, -1952223945 * Class512.anInt6936, ((client.aClass251_11199 == Class107.aClass251_1323) ? -1 : (1139436581 * client.aClass251_11199.anInt2736)), true, -1996290674);
			Class397.aClass251Array4115 = null;
		}
	}

	static final void method5491(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_7_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_7_ >> 16];
		Class182.method2723(class251, class234, class668, (byte) -2);
	}

	static String method5492(int i, int i_8_, int i_9_) {
		int i_10_ = i_8_ - i;
		if (i_10_ < -9)
			return Class264.method3680(16711680, -2127013530);
		if (i_10_ < -6)
			return Class264.method3680(16723968, -1508318080);
		if (i_10_ < -3)
			return Class264.method3680(16740352, -2047507044);
		if (i_10_ < 0)
			return Class264.method3680(16756736, -1746743494);
		if (i_10_ > 9)
			return Class264.method3680(65280, -1433068406);
		if (i_10_ > 6)
			return Class264.method3680(4259584, -1224995447);
		if (i_10_ > 3)
			return Class264.method3680(8453888, -1951809254);
		if (i_10_ > 0)
			return Class264.method3680(12648192, -1958583512);
		return Class264.method3680(16776960, -1821428072);
	}
}
