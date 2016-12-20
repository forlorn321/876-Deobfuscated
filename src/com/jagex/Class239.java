/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class239 implements Interface27 {
	Class214 this$0;
	int anInt2390;
	int anInt2391;

	Class239(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2391 = class527_sub38.readUnsignedShort() * -1029308775;
		anInt2390 = class527_sub38.readUnsignedByte() * 783504195;
	}

	public void method150(Class219 class219, int i) {
		class219.method4043(2145875369 * anInt2391, anInt2390 * 1044140395, -293454493);
		class219.method3992(2145875369 * anInt2391, 1784373771).method3942(-1620553565);
	}

	public void method151(Class219 class219) {
		class219.method4043(2145875369 * anInt2391, anInt2390 * 1044140395, -944755794);
		class219.method3992(2145875369 * anInt2391, 2125062292).method3942(-1683744439);
	}

	public static boolean method4377(int i, int i_0_) {
		return ((i >= -1736797763 * Class596.aClass596_7835.anInt7844 && i <= Class596.aClass596_7838.anInt7844 * -1736797763) || -1736797763 * Class596.aClass596_7824.anInt7844 == i);
	}

	static final void method4378(Class665 class665, short i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class324.method5728(class243, class240, class665, (byte) -35);
	}

	static final void method4379(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_1_, 2044764133)).anInt98) * -1099072041 == 1 ? 1 : 0;
	}

	static final void method4380(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class498.aString5584.startsWith("linux") ? 1 : 0;
	}

	public static boolean method4381(char c, short i) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	static final void method4382(Class665 class665, byte i) {
		if (Class314.anIntArray3507 == null || (Class403.anInt4164 * -1735275681 >= Class314.anIntArray3507.length))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = ((Class314.anIntArray3507[(Class403.anInt4164 += -1858383713) * -1735275681 - 1]) & 0xffff);
	}
}
