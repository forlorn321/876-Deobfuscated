/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class598 {
	int anInt7850;
	String aString7851;
	public static Class144_Sub1 aClass144_Sub1_7852;

	Class598() {
		/* empty */
	}

	static final void method9916(Class665 class665, int i) {
		Class160 class160 = (Class160) (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[class665.anInt8527 * 891367231]);
		Interface19 interface19 = ((Interface19) (class665.anIntArray8545[891367231 * class665.anInt8527] == 0 ? class665.aMap8523.get(class160.aClass465_1745) : class665.aMap8536.get(class160.aClass465_1745)));
		Class475 class475 = class160.aClass462_1748.method7606(-557443968);
		if (Class475.aClass475_5374 == class475)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = interface19.method101(class160, 1096407173);
		else if (class475 == Class475.aClass475_5375)
			class665.aLongArray8529[(class665.anInt8530 += 32636613) * -2076258291 - 1] = interface19.method113(class160, (byte) 54);
		else if (class475 == Class475.aClass475_5376) {
			try {
				String string = (String) interface19.method106(class160, 221099667);
				if (string == null)
					string = "null";
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		} else
			throw new RuntimeException();
	}

	static final void method9917(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class708.aClass463_8847.method7621(i_0_, 1018325854).anIntArray11864[i_1_]);
	}

	static final void method9918(Class665 class665, int i) {
		Class527_Sub30 class527_sub30 = Class493.method8001((byte) 9);
		if (null == class527_sub30) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -558184067 * class527_sub30.anInt10567;
			int i_2_ = (class527_sub30.anInt10566 * -452236327 << 28 | (Class529.anInt7137 + 208579007 * class527_sub30.anInt10568) << 14 | (class527_sub30.anInt10565 * -1499963557 + Class529.anInt7138));
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_2_;
		}
	}
}
