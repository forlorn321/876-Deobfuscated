/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class206 implements Interface6 {
	Class199 aClass199_2236 = new Class199(100);
	Interface12 anInterface12_2237;

	void method2951(int i) {
		synchronized (aClass199_2236) {
			aClass199_2236.method2883(i, -1979988364);
		}
	}

	Class536_Sub18_Sub17 method2952(int i, int i_0_) {
		Class536_Sub18_Sub17 class536_sub18_sub17;
		synchronized (aClass199_2236) {
			class536_sub18_sub17 = (Class536_Sub18_Sub17) aClass199_2236.method2886((long) i);
			if (null == class536_sub18_sub17) {
				class536_sub18_sub17 = new Class536_Sub18_Sub17(i);
				aClass199_2236.method2881(class536_sub18_sub17, (long) i);
			}
			if (!class536_sub18_sub17.method10792(-1486439920)) {
				Class536_Sub18_Sub17 class536_sub18_sub17_1_ = null;
				return class536_sub18_sub17_1_;
			}
		}
		return class536_sub18_sub17;
	}

	Class206(Interface12 interface12, Class461 class461, Class461 class461_2_) {
		anInterface12_2237 = interface12;
		Class205_Sub12.method9072(class461, class461_2_, 2, 632254064);
	}

	void method2953(int i, byte i_3_) {
		synchronized (aClass199_2236) {
			aClass199_2236.method2883(i, -1752480675);
		}
	}

	void method2954(int i) {
		synchronized (aClass199_2236) {
			aClass199_2236.method2892(-63435548);
		}
	}

	void method2955() {
		synchronized (aClass199_2236) {
			aClass199_2236.method2884((byte) -107);
		}
	}

	void method2956(int i) {
		synchronized (aClass199_2236) {
			aClass199_2236.method2883(i, -1753316831);
		}
	}

	void method2957(int i) {
		synchronized (aClass199_2236) {
			aClass199_2236.method2884((byte) -91);
		}
	}

	static final void method2958(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2585 * -1382035527;
	}

	static boolean method2959(Class536_Sub33_Sub2 class536_sub33_sub2, int i, int i_4_) {
		int i_5_ = class536_sub33_sub2.method10780(2, 327616835);
		if (0 == i_5_) {
			if (class536_sub33_sub2.method10780(1, -364543081) != 0)
				method2959(class536_sub33_sub2, i, 1799303762);
			int i_6_ = class536_sub33_sub2.method10780(6, 1047253478);
			int i_7_ = class536_sub33_sub2.method10780(6, -701265041);
			boolean bool = class536_sub33_sub2.method10780(1, 1003948160) == 1;
			if (bool)
				Class95.anIntArray1160[(Class95.anInt1150 += -1305881103) * 38697745 - 1] = i;
			if (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i] != null)
				throw new RuntimeException();
			Class43 class43 = Class95.aClass43Array1162[i];
			Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i] = (new Class649_Sub1_Sub5_Sub1_Sub2(client.aClass515_11066.method6249(1569682681))));
			class649_sub1_sub5_sub1_sub2.anInt11889 = 675537735 * i;
			if (Class95.aClass536_Sub33Array1154[i] != null)
				class649_sub1_sub5_sub1_sub2.method11082(Class95.aClass536_Sub33Array1154[i], -37351772);
			if (Class95.aClass536_Sub33Array1155[i] != null)
				class649_sub1_sub5_sub1_sub2.method11091(Class95.aClass536_Sub33Array1155[i], -180153836);
			class649_sub1_sub5_sub1_sub2.method10893(class43.anInt511 * -1112850861, true, (byte) 9);
			class649_sub1_sub5_sub1_sub2.anInt11911 = class43.anInt512 * -1856936561;
			int i_8_ = class43.anInt514 * 566829387;
			int i_9_ = i_8_ >> 28;
			int i_10_ = i_8_ >> 14 & 0xff;
			int i_11_ = i_8_ & 0xff;
			Class598 class598 = client.aClass515_11066.method6255(-1205497904);
			int i_12_ = (i_10_ << 6) + i_6_ - 1858049507 * class598.anInt7839;
			int i_13_ = i_7_ + (i_11_ << 6) - class598.anInt7840 * 1479112045;
			class649_sub1_sub5_sub1_sub2.aClass210_12200 = class43.aClass210_513;
			class649_sub1_sub5_sub1_sub2.aBool12194 = class43.aBool510;
			class649_sub1_sub5_sub1_sub2.aByteArray11946[0] = Class95.aByteArray1153[i];
			class649_sub1_sub5_sub1_sub2.aByte10839 = class649_sub1_sub5_sub1_sub2.aByte10840 = (byte) i_9_;
			if (client.aClass515_11066.method6251(-129558261).method5466(i_12_, i_13_, (byte) -90))
				class649_sub1_sub5_sub1_sub2.aByte10840++;
			class649_sub1_sub5_sub1_sub2.method11087(i_12_, i_13_, (byte) 1);
			Class95.aClass43Array1162[i] = null;
			return true;
		}
		if (1 == i_5_) {
			int i_14_ = class536_sub33_sub2.method10780(2, 159921598);
			int i_15_ = 566829387 * Class95.aClass43Array1162[i].anInt514;
			Class95.aClass43Array1162[i].anInt514 = ((i_15_ & 0xfffffff) + ((i_14_ + (i_15_ >> 28) & 0x3) << 28)) * 246702179;
			return false;
		}
		if (2 == i_5_) {
			int i_16_ = class536_sub33_sub2.method10780(5, -1910610640);
			int i_17_ = i_16_ >> 3 & 0x3;
			int i_18_ = i_16_ & 0x7;
			int i_19_ = 566829387 * Class95.aClass43Array1162[i].anInt514;
			if (!Class95.$assertionsDisabled && (Class95.aByteArray1153[i] < 0 || Class95.aByteArray1153[i] > 3))
				throw new AssertionError();
			int i_20_ = (i_19_ >> 28) + i_17_ & 0x3;
			int i_21_ = i_19_ >> 14 & 0xff;
			int i_22_ = i_19_ & 0xff;
			if (i_18_ == 0) {
				i_21_--;
				i_22_--;
			}
			if (i_18_ == 1)
				i_22_--;
			if (i_18_ == 2) {
				i_21_++;
				i_22_--;
			}
			if (3 == i_18_)
				i_21_--;
			if (4 == i_18_)
				i_21_++;
			if (i_18_ == 5) {
				i_21_--;
				i_22_++;
			}
			if (6 == i_18_)
				i_22_++;
			if (7 == i_18_) {
				i_21_++;
				i_22_++;
			}
			Class682.method8091(Class680.method8069(-1655258556), Class95.aByteArray1153[i], 1858049507);
			Class95.aClass43Array1162[i].anInt514 = ((i_21_ << 14) + (i_20_ << 28) + i_22_) * 246702179;
			return false;
		}
		int i_23_ = class536_sub33_sub2.method10780(20, -1371851245);
		int i_24_ = i_23_ >> 18 & 0x3;
		int i_25_ = i_23_ >> 16 & 0x3;
		int i_26_ = i_23_ >> 8 & 0xff;
		int i_27_ = i_23_ & 0xff;
		int i_28_ = Class95.aClass43Array1162[i].anInt514 * 566829387;
		Class95.aByteArray1153[i] = (byte) (i_24_ - 1);
		if (!Class95.$assertionsDisabled && (Class95.aByteArray1153[i] < 0 || Class95.aByteArray1153[i] > 3))
			throw new AssertionError();
		int i_29_ = (i_28_ >> 28) + i_25_ & 0x3;
		int i_30_ = i_26_ + (i_28_ >> 14) & 0xff;
		int i_31_ = i_28_ + i_27_ & 0xff;
		Class682.method8091(Class680.method8069(-1796978673), i_24_ - 1, 1858049507);
		Class95.aClass43Array1162[i].anInt514 = (i_31_ + ((i_29_ << 28) + (i_30_ << 14))) * 246702179;
		return false;
	}

	public static String method2960(int i) {
		return Class640.method7673("www", false, -923644264);
	}

	static void method2961(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(4, (long) i);
		class536_sub18_sub5.method10659(2058080958);
		class536_sub18_sub5.anInt11675 = i_32_ * 1577826219;
		class536_sub18_sub5.anInt11659 = i_33_ * 824043525;
		class536_sub18_sub5.anInt11654 = -445749437 * i_34_;
	}

	static final void method2962(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1_36_, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		int i_44_ = class649_sub1_sub5_sub1_36_.method10879((byte) -69);
		if (i_44_ != -1) {
			Object object = null;
			Class143 class143 = (Class143) client.aClass199_11320.method2886((long) i_44_);
			if (null == class143) {
				Class179[] class179s = Class181.method2720(Class398.aClass461_4122, i_44_, 0);
				if (class179s == null)
					return;
				class143 = Class677.aClass167_8609.method2082(class179s[0], true);
				client.aClass199_11320.method2881(class143, (long) i_44_);
			}
			Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
			Class672.method8024(class649_sub1_sub5_sub1.aByte10839, (int) class436.aFloat4850, (int) class436.aFloat4853, class649_sub1_sub5_sub1.method10874(1355242333) * 256, 0, false, false, -2131275969);
			int i_45_ = (int) ((float) i_37_ + client.aFloatArray11133[0] - 18.0F);
			int i_46_ = (int) ((float) i_38_ + client.aFloatArray11133[1] - 16.0F - 54.0F);
			i_45_ += i / 4 * 18;
			i_46_ += 18 * (i % 4);
			class143.method1728(i_45_, i_46_);
			if (class649_sub1_sub5_sub1_36_ == class649_sub1_sub5_sub1)
				Class677.aClass167_8609.method2056(i_45_ - 1, i_46_ - 1, 18, 18, -256, 899542557);
			Class521_Sub5 class521_sub5 = Class473.method5741(-882667498);
			class521_sub5.aClass649_Sub1_Sub5_Sub1_10355 = class649_sub1_sub5_sub1_36_;
			class521_sub5.anInt10356 = i_45_ * 1782958269;
			class521_sub5.anInt10354 = 1533289725 * i_46_;
			class521_sub5.anInt10358 = 530786263 * (16 + i_45_);
			class521_sub5.anInt10359 = (i_46_ + 16) * -572523129;
			client.aClass695_11131.method8217(class521_sub5, -1592656950);
		}
	}
}
