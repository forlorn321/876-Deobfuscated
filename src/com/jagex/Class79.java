/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class79 {
	static Class79 aClass79_824;
	static Class79 aClass79_825;
	static Class79 aClass79_826 = new Class79(26, 0);
	static Class79 aClass79_827;
	static Class79 aClass79_828;
	static Class79 aClass79_829;
	static Class79 aClass79_830;
	int anInt831;
	static Class79 aClass79_832;
	static Class79 aClass79_833;
	static Class79 aClass79_834;
	static Class79 aClass79_835;
	static Class79 aClass79_836;
	static Class79 aClass79_837;
	static Class79 aClass79_838;
	static Class79 aClass79_839;
	static Class79 aClass79_840;
	static Class79 aClass79_841;
	static Class79 aClass79_842;
	static Class79 aClass79_843;
	static Class79 aClass79_844;
	static Class79 aClass79_845;
	static Class79 aClass79_846;
	static Class79 aClass79_847;
	static Class79 aClass79_848;
	static Class79 aClass79_849;
	static Class79 aClass79_850;
	static Class79 aClass79_851;
	static Class79 aClass79_852;
	static Class79 aClass79_853;
	static Class79 aClass79_854 = new Class79(19, 1);
	public int anInt855;
	static Class79 aClass79_856;

	Class79(int i, int i_0_) {
		anInt855 = -15941253 * i;
		anInt831 = i_0_ * 150013601;
	}

	static {
		aClass79_851 = new Class79(27, 2);
		aClass79_827 = new Class79(16, 3);
		aClass79_828 = new Class79(15, 10);
		aClass79_829 = new Class79(11, 11);
		aClass79_830 = new Class79(23, 12);
		aClass79_824 = new Class79(22, 13);
		aClass79_832 = new Class79(25, 14);
		aClass79_833 = new Class79(5, 15);
		aClass79_834 = new Class79(9, 16);
		aClass79_853 = new Class79(17, 17);
		aClass79_836 = new Class79(21, 20);
		aClass79_837 = new Class79(24, 21);
		aClass79_838 = new Class79(0, 22);
		aClass79_856 = new Class79(4, 30);
		aClass79_840 = new Class79(30, 31);
		aClass79_841 = new Class79(28, 32);
		aClass79_839 = new Class79(14, 33);
		aClass79_843 = new Class79(2, 40);
		aClass79_844 = new Class79(3, 41);
		aClass79_845 = new Class79(7, 42);
		aClass79_846 = new Class79(6, 43);
		aClass79_847 = new Class79(13, 50);
		aClass79_849 = new Class79(29, 51);
		aClass79_848 = new Class79(1, 52);
		aClass79_850 = new Class79(10, 53);
		aClass79_835 = new Class79(20, 60);
		aClass79_825 = new Class79(8, 61);
		aClass79_842 = new Class79(12, 70);
		aClass79_852 = new Class79(18, 255);
	}

	static final void method1160(Class649_Sub1 class649_sub1, int i, boolean bool, boolean bool_1_, int i_2_) {
		int i_3_;
		int i_4_;
		if (class649_sub1 instanceof Class649_Sub1_Sub5 && class649_sub1 instanceof Interface59) {
			Class649_Sub1_Sub5 class649_sub1_sub5 = (Class649_Sub1_Sub5) class649_sub1;
			int i_5_ = (1 + (class649_sub1_sub5.aShort11864 - class649_sub1_sub5.aShort11867) << 9);
			int i_6_ = ((class649_sub1_sub5.aShort11870 - class649_sub1_sub5.aShort11865 + 1) << 9);
			i_3_ = (class649_sub1_sub5.aShort11867 << 9) + i_5_ / 2;
			i_4_ = i_6_ / 2 + (class649_sub1_sub5.aShort11865 << 9);
		} else {
			Class436 class436 = class649_sub1.method7837().aClass436_4823;
			i_3_ = (int) class436.aFloat4850;
			i_4_ = (int) class436.aFloat4853;
		}
		Class672.method8024(class649_sub1.aByte10839, i_3_, i_4_, 0, i, bool, bool_1_, -2131275969);
	}

	public static void method1161(int i, int i_7_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(3, (long) i);
		class536_sub18_sub5.method10669(1217977185);
	}

	static final void method1162(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class390.method4856(class251, class234, true, 1, class668, (byte) -65);
	}
}
