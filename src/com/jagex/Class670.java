/* Class670 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class670 {
	static Class670 aClass670_8568 = new Class670();
	public static Class670 aClass670_8569 = new Class670();
	static Class670 aClass670_8570 = new Class670();

	Class670() {
		/* empty */
	}

	static String method13762(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_0_ = l; l_0_ != 0L; l_0_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_1_ = l;
			l /= 37L;
			char c = Class663.aCharArray8516[(int) (l_1_ - 37L * l)];
			if ('_' == c) {
				int i_2_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_2_, Character.toUpperCase(stringbuilder.charAt(i_2_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static void method13763(Class665 class665, byte i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), 1181150590)).aString2841;
	}

	static void method13764(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, Class527_Sub8_Sub7 class527_sub8_sub7, Class174 class174, Class22 class22, int i_9_, int i_10_, int i_11_) {
		if (i > i_4_ && i < i_4_ + i_6_ && i_3_ > i_8_ - class22.anInt215 * -63286397 - 1 && i_3_ < i_8_ + class22.anInt213 * 672688101 && class527_sub8_sub7.aBool11648)
			i_9_ = i_10_;
		int[] is = Class700_Sub41.method17315(class527_sub8_sub7, -1419422402);
		String string = Class72.method1496(class527_sub8_sub7, (byte) -103);
		if (is != null)
			string = new StringBuilder().append(string).append(Class370.method6358(is, 1306397243)).toString();
		class174.method2789(string, 3 + i_4_, i_8_, i_9_, 0, client.aRandom11092, Class610.anInt8001, Class191.aClass147Array2138, null, 805196302);
		if (class527_sub8_sub7.aBool11645)
			Class452.aClass147_4962.method2415(5 + i_4_ + class22.method781(string, Class191.aClass147Array2138, (short) 386), i_8_ - class22.anInt215 * -63286397);
	}

	static final void method13765(Class243 class243, Class665 class665, int i) {
		Class22 class22 = class243.method4553(Class211.aClass420_2256, client.anInterface50_11053, -1674314069);
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Point point = class22.method789(class243.aString2578, -1054537975 * class243.anInt2511, -409542683 * class243.anInt2579, i_12_, Class191.aClass147Array2138, -262575904);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = point.x;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = point.y;
	}
}
