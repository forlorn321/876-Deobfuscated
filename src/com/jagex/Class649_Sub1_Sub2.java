/* Class649_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class649_Sub1_Sub2 extends Class649_Sub1 {
	Class536_Sub19[] aClass536_Sub19Array11753;
	int anInt11754 = 0;
	public short aShort11755;

	int method9959(Class536_Sub19[] class536_sub19s, byte i) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			anInt11754 = (method9950(((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405), aClass536_Sub19Array11753, 1082482060) * -876373995);
			aBool8468 = false;
		}
		for (int i_0_ = 0; i_0_ < anInt11754 * 1302820669; i_0_++)
			class536_sub19s[i_0_] = aClass536_Sub19Array11753[i_0_];
		return 1302820669 * anInt11754;
	}

	boolean method9982(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aClass544_7426.method6601(aByte10840, ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405), ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444)));
	}

	boolean method9948(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aClass544_7426.method6601(aByte10840, ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405), ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444)));
	}

	boolean method9949(int i) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aBoolArrayArray7471[(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444) - -1629030593 * aClass553_10838.anInt7454))][(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444) - -1430999951 * aClass553_10838.anInt7455))]);
	}

	int method9979(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			anInt11754 = (method9950(((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405), aClass536_Sub19Array11753, 534921964) * -876373995);
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11754 * 1302820669; i++)
			class536_sub19s[i] = aClass536_Sub19Array11753[i];
		return 1302820669 * anInt11754;
	}

	int method9981(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			anInt11754 = (method9950(((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405), aClass536_Sub19Array11753, -352723920) * -876373995);
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11754 * 1302820669; i++)
			class536_sub19s[i] = aClass536_Sub19Array11753[i];
		return 1302820669 * anInt11754;
	}

	int method9980(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			anInt11754 = (method9950(((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405), aClass536_Sub19Array11753, -92806564) * -876373995);
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11754 * 1302820669; i++)
			class536_sub19s[i] = aClass536_Sub19Array11753[i];
		return 1302820669 * anInt11754;
	}

	Class649_Sub1_Sub2(Class553 class553, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		super(class553);
		aClass536_Sub19Array11753 = new Class536_Sub19[4];
		aByte10839 = (byte) i_3_;
		aByte10840 = (byte) i_4_;
		aShort11755 = (short) i_5_;
		method7841(new Class436((float) i, (float) i_1_, (float) i_2_));
		for (int i_6_ = 0; i_6_ < 4; i_6_++)
			aClass536_Sub19Array11753[i_6_] = null;
	}

	boolean method9983() {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aBoolArrayArray7471[(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444) - -1629030593 * aClass553_10838.anInt7454))][(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444) - -1430999951 * aClass553_10838.anInt7455))]);
	}

	static char method10751(char c, Class664 class664, byte i) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && Class664.aClass664_8521 != class664)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if ('\u00dd' == c)
				return 'Y';
			if ('\u00df' == c)
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if (c == '\u00e7')
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if (c == '\u00f1' && Class664.aClass664_8521 != class664)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if (c == '\u00fd' || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if (c == '\u0153')
			return 'o';
		if ('\u0178' == c)
			return 'Y';
		return c;
	}
}
