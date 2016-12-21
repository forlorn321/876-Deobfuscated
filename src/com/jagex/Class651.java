/* Class651 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class651 {
	public static final int anInt8475 = 2816;
	public static final int anInt8476 = 13156520;
	public static final float aFloat8477 = 1.1523438F;
	public static final int anInt8478 = 16777215;
	public static final float aFloat8479 = 1.2F;
	public static final int anInt8480 = -50;
	public static final int anInt8481 = 2816;
	public static final int anInt8482 = -50;
	public static final int anInt8483 = 0;
	static final int anInt8484 = 5000;
	public static final float aFloat8485 = 0.69921875F;
	public static final int anInt8486 = -60;
	public static final int anInt8487 = 2816;

	static {
		new Class436(0.6F, 0.6F, 0.6F);
		new Class436(0.3F, 0.3F, 0.3F);
		new Class436(0.3F, 0.3F, 0.5F);
	}

	Class651() throws Throwable {
		throw new Error();
	}

	static final void method7861(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		i_1_--;
		if (class251.aStringArray2657 == null || i_1_ >= class251.aStringArray2657.length || null == class251.aStringArray2657[i_1_])
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.aStringArray2657[i_1_];
	}

	public static Class2 method7862(Class461 class461, int i, int i_2_, Interface4 interface4, int i_3_) {
		byte[] is = class461.method5556(i, i_2_, (byte) 1);
		if (is == null)
			return null;
		return new Class2(is, interface4);
	}

	public static boolean method7863(boolean bool, byte i) {
		boolean bool_4_ = Class677.aClass167_8609.method2124();
		if (bool_4_ != bool) {
			if (bool) {
				if (!Class677.aClass167_8609.method2122())
					bool = false;
			} else
				Class677.aClass167_8609.method2123();
			if (bool_4_ != bool) {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub34_10787, bool ? 1 : 0, (byte) 1);
				Class27.method763(2011442935);
				return true;
			}
			return false;
		}
		return true;
	}

	static void method7864(Class167 class167, int i, int i_5_, int i_6_, int i_7_, int i_8_, Class184 class184, Class2 class2, String string, byte i_9_) {
		int i_10_ = (255 - -1593467459 * Class42.anInt509 - 1566263285 * Class70.anInt781);
		if (i_10_ < 0)
			i_10_ = 0;
		if (null == Class536_Sub5.aClass143_10418 || null == Class247_Sub1.aClass143_9969) {
			if (Class398.aClass461_4122.method5580(Class28.anInt260 * -1034889975, -964514165) && Class398.aClass461_4122.method5580((-1675910631 * (Class710_Sub16.anInt10862)), -964514165)) {
				Class536_Sub5.aClass143_10418 = (class167.method2082(Class181.method2718(Class398.aClass461_4122, -1034889975 * Class28.anInt260, 0), true));
				Class179 class179 = Class181.method2718(Class398.aClass461_4122, (-1675910631 * Class710_Sub16.anInt10862), 0);
				Class247_Sub1.aClass143_9969 = class167.method2082(class179, true);
				class179.method2648();
				Class640.aClass143_8311 = class167.method2082(class179, true);
			} else
				class167.method2063(i, i_5_, i_6_, i_8_, (i_10_ << 24 | -1070393461 * Class105.anInt1253), 1);
		}
		if (Class536_Sub5.aClass143_10418 != null && Class247_Sub1.aClass143_9969 != null) {
			int i_11_ = ((i_6_ - Class247_Sub1.aClass143_9969.method1720() * 2) / Class536_Sub5.aClass143_10418.method1720());
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				Class536_Sub5.aClass143_10418.method1728((i + Class247_Sub1.aClass143_9969.method1720() + i_12_ * Class536_Sub5.aClass143_10418.method1720()), i_5_);
			Class247_Sub1.aClass143_9969.method1728(i, i_5_);
			Class640.aClass143_8311.method1728(i_6_ + i - Class640.aClass143_8311.method1720(), i_5_);
		}
		class184.method2763(string, 3 + i, (-1214764847 * class2.anInt91 + i_5_ + (20 - class2.anInt91 * -1214764847) / 2), 1559126045 * Class158.anInt1743 | ~0xffffff, -1, (byte) -45);
		class167.method2063(i, i_8_ + i_5_, i_6_, i_7_ - i_8_, i_10_ << 24 | -1070393461 * Class105.anInt1253, 1);
	}
}
