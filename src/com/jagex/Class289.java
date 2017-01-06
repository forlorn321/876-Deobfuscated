/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class289 {
	static Class289 aClass289_3213;
	static Class289 aClass289_3214 = new Class289(0);
	static Class143 aClass143_3215;

	static {
		aClass289_3213 = new Class289(1);
	}

	Class289(int i) {
		/* empty */
	}

	static void method3917(Class668 class668, byte i) {
		class668.anIntArray8541[1867269829 * class668.anInt8542 - 1] = (((QuestTypeDecoder) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[(class668.anInt8542 * 1867269829) - 1]), (byte) 61)).anInt3032 * -829215053);
	}

	static final void method3918(Class668 class668, int i) {
		int i_0_ = class668.anIntArray8537[-1640738851 * class668.anInt8564];
		Class536_Sub18_Sub16 class536_sub18_sub16 = Class457.method5485(i_0_, 1847137805);
		if (class536_sub18_sub16 == null)
			throw new RuntimeException();
		int[] is = new int[520600665 * class536_sub18_sub16.anInt11795];
		Object[] objects = new Object[1265663029 * class536_sub18_sub16.anInt11799];
		long[] ls = new long[1971309879 * class536_sub18_sub16.anInt11802];
		for (int i_1_ = 0; i_1_ < class536_sub18_sub16.anInt11803 * 1177566815; i_1_++)
			is[i_1_] = (class668.anIntArray8541[(1867269829 * class668.anInt8542 - class536_sub18_sub16.anInt11803 * 1177566815 + i_1_)]);
		for (int i_2_ = 0; i_2_ < 1511652247 * class536_sub18_sub16.anInt11804; i_2_++)
			objects[i_2_] = (class668.anObjectArray8543[(class668.anInt8544 * 366709801 - class536_sub18_sub16.anInt11804 * 1511652247 + i_2_)]);
		for (int i_3_ = 0; i_3_ < class536_sub18_sub16.anInt11805 * -1943547927; i_3_++)
			ls[i_3_] = (class668.aLongArray8565[i_3_ + (1346022693 * class668.anInt8546 - -1943547927 * class536_sub18_sub16.anInt11805)]);
		class668.anInt8542 -= class536_sub18_sub16.anInt11803 * 1643700947;
		class668.anInt8544 -= class536_sub18_sub16.anInt11804 * 1573274047;
		class668.anInt8546 -= class536_sub18_sub16.anInt11805 * -1637378443;
		Class646 class646 = new Class646();
		class646.aClass536_Sub18_Sub16_8355 = class668.aClass536_Sub18_Sub16_8547;
		class646.anInt8356 = 1653565049 * class668.anInt8564;
		class646.anIntArray8357 = class668.anIntArray8550;
		class646.anObjectArray8358 = class668.anObjectArray8561;
		class646.aLongArray8359 = class668.aLongArray8538;
		if (2100083885 * class668.anInt8552 >= class668.aClass646Array8540.length)
			throw new RuntimeException();
		class668.aClass646Array8540[(class668.anInt8552 += -119535835) * 2100083885 - 1] = class646;
		class668.aClass536_Sub18_Sub16_8547 = class536_sub18_sub16;
		class668.aClass499Array8545 = class668.aClass536_Sub18_Sub16_8547.aClass499Array11797;
		class668.anIntArray8537 = class668.aClass536_Sub18_Sub16_8547.anIntArray11798;
		class668.anInt8564 = 1531084683;
		class668.anIntArray8550 = is;
		class668.anObjectArray8561 = objects;
		class668.aLongArray8538 = ls;
	}

	static final void method3919(Class668 class668, byte i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_5_ = ClientSetting.aClass536_Sub40_8843.musicVolumeSetting.method10213(2044352058);
		if (i_4_ != i_5_) {
			ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.musicVolumeSetting), i_4_, (byte) 1);
			Class27.method763(2015602225);
			client.aBool11015 = false;
		}
	}

	static final void method3920(Class668 class668, byte i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (Class360_Sub1.aClass94Array10168 != null && i_6_ < -918987073 * Class269.anInt2880 && (Class360_Sub1.aClass94Array10168[i_6_].aString1146.equalsIgnoreCase(Class565.MY_PLAYER.username)))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method3921(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((Player) class668.aClass649_Sub1_Sub5_Sub1_8554).method11085(true, (byte) 1);
	}
}
