/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class384 implements Interface49 {
	public int anInt4018;

	public Class390 method343(byte i) {
		return Class390.aClass390_4056;
	}

	public Class390 method344() {
		return Class390.aClass390_4056;
	}

	public Class390 method342() {
		return Class390.aClass390_4056;
	}

	Class384(int i) {
		anInt4018 = 328604615 * i;
	}

	static final void method4832(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class233.method3330(class251, class234, class668, -1384022228);
	}

	static final void method4833(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass30Array11295[i_1_].aBool264 ? 1 : 0;
	}

	static final void method4834(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_2_, (byte) -87)).anInt35) * -257082309;
	}

	static final void method4835(Class668 class668, byte i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub4_10759), i_3_, (byte) 1);
		Class27.method763(1996431080);
		client.aBool11015 = false;
	}

	static final void method4836(Class649_Sub1 class649_sub1, int i, boolean bool, int i_4_) {
		Class79.method1160(class649_sub1, i, false, bool, 573877212);
	}

	static final void method4837(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class98_Sub1_Sub2.method10505(class251, class234, class668, -160251184);
	}
}
