/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class486 implements Interface11 {
	public static int anInt5443;

	public Object method69(RSByteBuffer class536_sub33) {
		return new Class536_Sub30(class536_sub33);
	}

	public Object method68(RSByteBuffer class536_sub33, short i) {
		return new Class536_Sub30(class536_sub33);
	}

	public static Class686 method5858(byte i) {
		if (null == Class391.aClass686_4060)
			return Class686.aClass686_8666;
		return Class391.aClass686_4060;
	}

	static final void method5859(Class668 class668, int i) {
		int i_0_ = class668.anIntArray8537[-1640738851 * class668.anInt8564];
		class668.anInt8544 -= i_0_ * 1946079257;
		String string = Class489.method5876(class668.anObjectArray8543, 366709801 * class668.anInt8544, i_0_, 1439330416);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	public static void method5860(int i) {
		Class262.aMap2848.clear();
		Class262.aClass4_2847.method561(-2117553523);
		Class262.aClass700_2846.method8238(-2100096729);
		Class262.anInt2849 = 0;
	}

	static void method5861(int i, int i_1_, int i_2_) {
		if (Class644.aClass628_8352.aBool8218 || (1 != 1780207751 * Class70.anInt760 && (!Class532.aBool7124 || 2 != 1780207751 * Class70.anInt760 || !(Class228.aClass536_Sub18_Sub9_2359.aString11716.equals(Class38.aClass38_438.method840((Class459.CLIENT_PARAMS), 2131910364)))))) {
			Class2 class2 = Class231.method3316(1555934262);
			int i_3_ = (class2.method530(Class38.aClass38_435.method840(Class459.CLIENT_PARAMS, 1901654744), (byte) -120));
			int i_4_;
			if (!Class70.aBool753) {
				for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(1873292995))) {
					int i_5_ = Class141.method1713(class536_sub18_sub9, class2, (byte) 11);
					if (i_5_ > i_3_)
						i_3_ = i_5_;
				}
				i_3_ += 8;
				i_4_ = 21 + Class70.anInt749 * 2934691 * (Class70.anInt760 * 1780207751);
				Class153.anInt1719 = (Class70.anInt749 * 2934691 * (Class70.anInt760 * 1780207751) + (Class70.aBool780 ? 26 : 22)) * -1308182587;
			} else {
				for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(-2142322429)); null != class536_sub18_sub6; class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(1597512240))) {
					int i_6_;
					if (1 == -606992075 * class536_sub18_sub6.anInt11685)
						i_6_ = Class141.method1713(((Class536_Sub18_Sub9) (class536_sub18_sub6.aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)), class2, (byte) 11);
					else
						i_6_ = Class450.method5427(class536_sub18_sub6, class2, 1802285580);
					if (i_6_ > i_3_)
						i_3_ = i_6_;
				}
				i_3_ += 8;
				i_4_ = 21 + Class70.anInt761 * 1868462753 * (Class70.anInt749 * 2934691);
				Class153.anInt1719 = (((Class70.aBool780 ? 26 : 22) + Class70.anInt749 * 2934691 * (Class70.anInt761 * 1868462753)) * -1308182587);
			}
			i_3_ += 10;
			int i_7_ = i - i_3_ / 2;
			if (i_7_ + i_3_ > -1804846931 * Class144.anInt1679)
				i_7_ = -1804846931 * Class144.anInt1679 - i_3_;
			if (i_7_ < 0)
				i_7_ = 0;
			int i_8_ = i_1_;
			if (i_4_ + i_8_ > 589116499 * Class34_Sub6.anInt10965)
				i_8_ = 589116499 * Class34_Sub6.anInt10965 - i_4_;
			if (i_8_ < 0)
				i_8_ = 0;
			Class312.anInt3487 = i_7_ * -2011140383;
			Class70.anInt768 = i_8_ * -1929548765;
			Class2.anInt95 = i_3_ * -1162532489;
			Class70.anInt781 = (int) (Math.random() * 24.0) * -304223139;
			Class70.aBool752 = true;
		}
	}

	public static void method5862(int i, byte i_9_) {
		synchronized (Class617.aClass199_8081) {
			Class617.aClass199_8081.method2883(i, -1032069301);
		}
		synchronized (Class617.aClass199_8082) {
			Class617.aClass199_8082.method2883(i, -1366326229);
		}
	}
}
