/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class592 {
	int flagId;
	String countryName;

	Class592() {
		/* empty */
	}

	static final void method7115(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub43_10780), 0, (byte) 1);
		Class27.method763(1921443807);
		client.aBool11015 = false;
	}

	static void method7116(Class536_Sub18_Sub6 class536_sub18_sub6, int i, int i_0_) {
		if (Class70.aBool752) {
			Class2 class2 = Class231.method3316(1508759438);
			int i_1_ = 0;
			for (Class536_Sub18_Sub9 class536_sub18_sub9 = (Class536_Sub18_Sub9) class536_sub18_sub6.aClass700_11683.method8248(-897015246); class536_sub18_sub9 != null; class536_sub18_sub9 = (Class536_Sub18_Sub9) class536_sub18_sub6.aClass700_11683.method8241(672372138)) {
				int i_2_ = Class141.method1713(class536_sub18_sub9, class2, (byte) 11);
				if (i_2_ > i_1_)
					i_1_ = i_2_;
			}
			i_1_ += 8;
			int i_3_ = ((-606992075 * class536_sub18_sub6.anInt11685 * (Class70.anInt749 * 2934691)) + 21);
			Class507.anInt6915 = 433397039 * ((Class70.aBool780 ? 26 : 22) + (2934691 * Class70.anInt749 * (-606992075 * class536_sub18_sub6.anInt11685)));
			int i_4_ = Class2.anInt95 * 917143623 + -467577567 * Class312.anInt3487;
			if (i_4_ + i_1_ > -1804846931 * Class144.anInt1679)
				i_4_ = -467577567 * Class312.anInt3487 - i_1_;
			if (i_4_ < 0)
				i_4_ = 0;
			int i_5_ = (Class70.aBool780 ? 1 + (20 + class2.anInt91 * -1214764847) : 31);
			int i_6_ = 1 + (i - i_5_ + -1214764847 * class2.anInt91);
			if (i_3_ + i_6_ > 589116499 * Class34_Sub6.anInt10965)
				i_6_ = 589116499 * Class34_Sub6.anInt10965 - i_3_;
			if (i_6_ < 0)
				i_6_ = 0;
			Class283.anInt3184 = i_4_ * 1646577253;
			Class70.anInt767 = 1115542635 * i_6_;
			Canvas_Sub1.anInt11875 = i_1_ * 1133606643;
			Class70.aClass536_Sub18_Sub6_754 = class536_sub18_sub6;
		}
	}

	public static int method7117(int i) {
		if (!Class187.method2780(-485532610))
			return 0;
		return -437673201 * Class575.anInt7649;
	}

	static final void method7118(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class497.aString5550.startsWith("mac") ? 1 : 0;
	}
}
