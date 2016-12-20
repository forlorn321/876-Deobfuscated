/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class230 implements Interface42 {
	Class226 this$0;
	static int anInt2355;

	public float method279() {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10634.method17139((byte) -96) / 255.0F);
	}

	Class230(Class226 class226) {
		this$0 = class226;
	}

	public float method278(int i) {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10634.method17139((byte) -100) / 255.0F);
	}

	static char method4319(char c, Class671 class671, byte i) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && class671 != Class671.aClass671_8578)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if (c == '\u00dd')
				return 'Y';
			if ('\u00df' == c)
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if (c == '\u00f1' && Class671.aClass671_8578 != class671)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if ('\u0153' == c)
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	static void method4320(Class522_Sub2 class522_sub2, int i) {
		class522_sub2.aClass640_Sub1_Sub2_Sub1_10295 = null;
		if (-1635477087 * Class522_Sub2.anInt10294 < 20) {
			Class522_Sub2.aClass705_10299.method14322(class522_sub2, -2138591433);
			Class522_Sub2.anInt10294 += 961645153;
		}
	}

	static boolean method4321(int i, int i_0_) {
		if (9 == i || i == 10 || i == 11 || 12 == i || 13 == i || 1003 == i)
			return true;
		if (8 == i)
			return true;
		return false;
	}

	static void method4322(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(10, (long) i);
		class527_sub8_sub9.method18187(-1852385068);
		class527_sub8_sub9.anInt11676 = i_1_ * -281159195;
		class527_sub8_sub9.anInt11667 = i_2_ * -164049787;
		class527_sub8_sub9.anInt11678 = i_3_ * 1405416095;
	}
}
