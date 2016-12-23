/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class611 implements Interface75 {
	static Class611 aClass611_7923;
	static Class611 aClass611_7924 = new Class611(0);
	static Class611 aClass611_7925;
	static Class611 aClass611_7926;
	static Class611 aClass611_7927;
	static Class611 aClass611_7928 = new Class611(1);
	int anInt7929;
	public static Class602 aClass602_7930;

	public int method78() {
		return -619782195 * anInt7929;
	}

	public int method12() {
		return -619782195 * anInt7929;
	}

	static {
		aClass611_7925 = new Class611(2);
		aClass611_7923 = new Class611(3);
		aClass611_7927 = new Class611(4);
		aClass611_7926 = new Class611(5);
	}

	public int method73() {
		return -619782195 * anInt7929;
	}

	Class611(int i) {
		anInt7929 = i * 1288774917;
	}

	static final void method7277(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		String string_0_ = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4457, client.aClass106_11218.aClass15_1258, 2065455689);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort((Class555.method6802(string, 883535022) + Class555.method6802(string_0_, -420371775)), -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string_0_);
		client.aClass106_11218.method1409(class536_sub23, 1718592966);
	}

	static void method7278(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i, int i_1_) {
		if (class649_sub1_sub5_sub1.anIntArray11913 != null) {
			Class680 class680 = ((Class680) Class682.method8091(Class680.method8069(-542859176), i, 1858049507));
			int i_2_ = (class649_sub1_sub5_sub1.anIntArray11913[class680.method8070(-180980128)]);
			if (i_2_ != class649_sub1_sub5_sub1.aClass688_11925.method8120((byte) 100)) {
				class649_sub1_sub5_sub1.aClass688_11925.method8123(i_2_, class649_sub1_sub5_sub1.aClass688_11925.method8129(-911524879), 147330925);
				class649_sub1_sub5_sub1.anInt11948 = class649_sub1_sub5_sub1.anInt11957 * 1389534931;
			}
		}
	}

	static void method7279(int i) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4443, class106.aClass15_1258, 1030764888);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(client.anInt11063 * -1672186801);
		class106.method1409(class536_sub23, -76972843);
	}

	static void method7280(Class167 class167, Class536_Sub41 class536_sub41, Class248 class248, int i) {
		Class143 class143 = class248.method3432(class167, 1184117658);
		if (class143 != null) {
			int i_3_ = class143.method1720();
			if (class143.method1752() > i_3_)
				i_3_ = class143.method1752();
			int i_4_ = 10;
			int i_5_ = 2090600221 * class536_sub41.anInt10797;
			int i_6_ = -279793543 * class536_sub41.anInt10798;
			int i_7_ = 0;
			int i_8_ = 0;
			if (class248.aString2483 != null) {
				i_8_ = Class618.aClass2_8091.method538(class248.aString2483, (Class144.anInt1679 * -1804846931), 0, null, (byte) 3);
				i_7_ = Class618.aClass2_8091.method541(class248.aString2483, (Class144.anInt1679 * -1804846931), null, 601823666);
			}
			int i_9_ = i_3_ / 2 + class536_sub41.anInt10797 * 2090600221;
			int i_10_ = class536_sub41.anInt10798 * -279793543;
			if (i_5_ < Class542_Sub1.anInt7227 + i_3_) {
				i_5_ = Class542_Sub1.anInt7227;
				i_9_ = (i_4_ + (Class542_Sub1.anInt7227 + i_3_ / 2) + i_7_ / 2 + 5);
			} else if (i_5_ > Class542_Sub1.anInt7190 - i_3_) {
				i_5_ = Class542_Sub1.anInt7190 - i_3_;
				i_9_ = Class542_Sub1.anInt7190 - i_3_ / 2 - i_4_ - i_7_ / 2 - 5;
			}
			if (i_6_ < i_3_ + Class542_Sub1.anInt7199) {
				i_6_ = Class542_Sub1.anInt7199;
				i_10_ = i_3_ / 2 + (Class542_Sub1.anInt7199 + i_4_);
			} else if (i_6_ > Class542_Sub1.anInt7230 - i_3_) {
				i_6_ = Class542_Sub1.anInt7230 - i_3_;
				i_10_ = Class542_Sub1.anInt7230 - i_3_ / 2 - i_4_ - i_8_;
			}
			int i_11_ = ((int) (Math.atan2((double) (i_5_ - 2090600221 * (class536_sub41.anInt10797)), (double) (i_6_ - -279793543 * (class536_sub41.anInt10798))) / 3.141592653589793 * 32767.0) & 0xffff);
			class143.method1735((float) i_3_ / 2.0F + (float) i_5_, (float) i_6_ + (float) i_3_ / 2.0F, 4096, i_11_);
			int i_12_ = -2;
			int i_13_ = -2;
			int i_14_ = -2;
			int i_15_ = -2;
			if (null != class248.aString2483) {
				i_12_ = i_9_ - i_7_ / 2 - 5;
				i_13_ = i_10_;
				i_14_ = i_12_ + i_7_ + 10;
				i_15_ = 3 + (i_8_ + i_13_);
				if (0 != class248.anInt2494 * 637992035)
					class167.method2057(i_12_, i_13_, i_14_ - i_12_, i_15_ - i_13_, class248.anInt2494 * 637992035, (short) -20097);
				if (-796455303 * class248.anInt2491 != 0)
					class167.method2056(i_12_, i_13_, i_14_ - i_12_, i_15_ - i_13_, class248.anInt2491 * -796455303, -886586835);
				Class34_Sub19.aClass184_10977.method2743(class248.aString2483, i_9_, i_10_, i_7_, i_8_, ~0xffffff | -1877457153 * class248.anInt2484, 163177097 * Class542_Sub1.aClass622_7228.anInt8124, 1, 0, 0, null, null, null, 0, 0, -297855319);
			}
			if (-1 != 400801363 * class248.anInt2481 || class248.aString2483 != null) {
				Class536_Sub7 class536_sub7 = new Class536_Sub7(class536_sub41);
				class536_sub7.anInt10429 = 808445941 * (i_5_ - i_3_ / 2);
				class536_sub7.anInt10422 = -1109983361 * (i_5_ + i_3_ / 2);
				class536_sub7.anInt10425 = (i_6_ - i_3_) * 1098580597;
				class536_sub7.anInt10423 = i_6_ * 2115548231;
				class536_sub7.anInt10421 = -1229233847 * i_12_;
				class536_sub7.anInt10424 = -1723553063 * i_14_;
				class536_sub7.anInt10427 = i_13_ * -1838853613;
				class536_sub7.anInt10428 = i_15_ * 1031708437;
				Class648.aClass708_8457.method8335(class536_sub7, -415494091);
			}
		}
	}

	static final void method7281(Class668 class668, int i) {
		if (0 != class668.anInt8552 * 2100083885) {
			Class646 class646 = (class668.aClass646Array8540[(class668.anInt8552 -= -119535835) * 2100083885]);
			class668.aClass536_Sub18_Sub16_8547 = class646.aClass536_Sub18_Sub16_8355;
			class668.aClass499Array8545 = class668.aClass536_Sub18_Sub16_8547.aClass499Array11797;
			class668.anIntArray8537 = class668.aClass536_Sub18_Sub16_8547.anIntArray11798;
			class668.anInt8564 = class646.anInt8356 * -736746551;
			class668.anIntArray8550 = class646.anIntArray8357;
			class668.anObjectArray8561 = class646.anObjectArray8358;
			class668.aLongArray8538 = class646.aLongArray8359;
		}
	}
}
