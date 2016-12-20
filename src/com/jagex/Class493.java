/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Date;

public class Class493 {
	static Class493 aClass493_5490;
	static Class493 aClass493_5491;
	static Class493 aClass493_5492;
	static Class493 aClass493_5493;
	static Class493 aClass493_5494 = new Class493(1);
	static Class493 aClass493_5495 = new Class493(6);
	static Class493 aClass493_5496;
	int anInt5497;

	static {
		aClass493_5492 = new Class493(5);
		aClass493_5493 = new Class493(0);
		aClass493_5491 = new Class493(3);
		aClass493_5490 = new Class493(2);
		aClass493_5496 = new Class493(4);
	}

	Class493(int i) {
		anInt5497 = i * -384370491;
	}

	public static void method7997(String string, byte i) {
		if (Class107.aStringArray1327 == null)
			Class599.method9921((short) -20444);
		client.aCalendar11302.setTime(new Date(Class234.method4347(-1408626088)));
		int i_0_ = client.aCalendar11302.get(11);
		int i_1_ = client.aCalendar11302.get(12);
		int i_2_ = client.aCalendar11302.get(13);
		String string_3_ = new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append(":").append(i_1_ / 10).append(i_1_ % 10).append(":").append(i_2_ / 10).append(i_2_ % 10).toString();
		String[] strings = Class592.method9875(string, '\n', (short) -6512);
		for (int i_4_ = 0; i_4_ < strings.length; i_4_++) {
			for (int i_5_ = -2080366569 * Class107.anInt1329; i_5_ > 0; i_5_--)
				Class107.aStringArray1327[i_5_] = Class107.aStringArray1327[i_5_ - 1];
			Class107.aStringArray1327[0] = new StringBuilder().append(string_3_).append(": ").append(strings[i_4_]).toString();
			if (null != Class503.aFileOutputStream6884) {
				try {
					Class503.aFileOutputStream6884.write(Class539.method8999(new StringBuilder().append(Class107.aStringArray1327[0]).append("\n").toString(), (short) -3646));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (Class107.anInt1329 * -2080366569 < Class107.aStringArray1327.length - 1) {
				Class107.anInt1329 += -1679878233;
				if (Class107.anInt1331 * 656150623 > 0)
					Class107.anInt1331 += -2131080289;
			}
		}
	}

	static final void method7998(Class665 class665, byte i) {
		class665.anIntArray8546[(class665.anIntArray8545[891367231 * class665.anInt8527])] = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
	}

	static final void method7999(Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_7_ = Class266.method5047(i_6_, 502800329);
		if (i_7_ < 0)
			throw new RuntimeException();
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_7_;
	}

	static final void method8000(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-1922525903);
	}

	public static Class527_Sub30 method8001(byte i) {
		if (Class529_Sub1.aClass694_7147 == null || Class529_Sub1.aClass691_10771 == null)
			return null;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) Class529_Sub1.aClass691_10771.next(); null != class527_sub30; class527_sub30 = (Class527_Sub30) Class529_Sub1.aClass691_10771.next()) {
			Class249 class249 = ((Class249) (Class529_Sub1.aClass24_Sub12_7164.method81(-558184067 * class527_sub30.anInt10567, 1943907365)));
			if (null != class249 && class249.aBool2776 && class249.method4638(Class529_Sub1.anInterface20_7121, Class529_Sub1.anInterface18_7120, 1949405825))
				return class527_sub30;
		}
		return null;
	}

	static final void method8002(Class665 class665, int i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4155(i_8_, -2026059101);
	}
}
