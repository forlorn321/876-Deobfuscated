/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class110 {
	static Class507 aClass507_1377;

	Class110() throws Throwable {
		throw new Error();
	}

	static final void method1452(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class300.method4027(class251, class234, class668, (byte) 48);
	}

	static final void method1453(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class295.method3978(class251, class668, (byte) 47);
	}

	static final void method1454(Class668 class668, int i) {
		if (client.anInt11289 * -1484801557 == 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -2;
		else if (-1484801557 * client.anInt11289 == 1)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11288 * 142551095;
	}

	static final void method1455(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class73 class73 = (Class73) Class207.aClass34_Sub22_2244.method70(i_1_, (byte) 16);
		if (class73.method1128((byte) 76))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((Class612) client.aClass515_11066.method6280(-1073841494).method70(i_0_, (byte) 88)).method7291(i_1_, class73.aString805, -1938439974);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class612) client.aClass515_11066.method6280(-1073841494).method70(i_0_, (byte) -37)).method7290(i_1_, 1566477951 * class73.anInt803, 410724759));
	}

	public static void method1456(int i, String string, int i_2_) {
		int i_3_ = Class95.anInt1156 * -1482773169;
		int[] is = Class95.anIntArray1157;
		boolean bool = false;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_4_]];
			if (class649_sub1_sub5_sub1_sub2 != null && (class649_sub1_sub5_sub1_sub2 != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) && class649_sub1_sub5_sub1_sub2.aString12184 != null && class649_sub1_sub5_sub1_sub2.aString12184.equalsIgnoreCase(string)) {
				OutgoingPacket class414 = null;
				if (i == 1)
					class414 = OutgoingPacket.aClass414_4510;
				else if (i == 2)
					class414 = OutgoingPacket.aClass414_4470;
				else if (i == 3)
					class414 = OutgoingPacket.aClass414_4445;
				else if (i == 4)
					class414 = OutgoingPacket.aClass414_4495;
				else if (5 == i)
					class414 = OutgoingPacket.aClass414_4416;
				else if (i == 6)
					class414 = OutgoingPacket.aClass414_4469;
				else if (7 == i)
					class414 = OutgoingPacket.aClass414_4409;
				else if (8 == i)
					class414 = OutgoingPacket.aClass414_4474;
				else if (i == 9)
					class414 = OutgoingPacket.aClass414_4480;
				else if (10 == i)
					class414 = OutgoingPacket.aClass414_4422;
				if (null != class414) {
					Class536_Sub23 class536_sub23 = Class213.method3075(class414, (client.aClass106_11322.aClass15_1258), 1097761268);
					class536_sub23.aClass536_Sub33_Sub2_10528.method9737(is[i_4_], -1952316498);
					class536_sub23.aClass536_Sub33_Sub2_10528.method9728(0, (byte) 86);
					client.aClass106_11322.method1409(class536_sub23, -147770641);
				}
				bool = true;
				break;
			}
		}
		if (!bool)
			Class173_Sub1.method8634(4, new StringBuilder().append(Class38.aClass38_431.method840(Class459.aClass664_5178, 1958934299)).append(string).toString(), -1101290493);
	}
}
