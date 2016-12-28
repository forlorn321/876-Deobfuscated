/* Class536_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub3 extends Class536 {
	static Class708 aClass708_10363 = new Class708();
	int anInt10364;
	int[] anIntArray10365;
	static Class4 aClass4_10366;
	int anInt10367;
	int anInt10368;
	int anInt10369;
	int anInt10370;
	int anInt10371;
	Class436 aClass436_10372 = new Class436(0.0F, 0.0F, 0.0F);
	Class436 aClass436_10373 = new Class436(0.0F, 0.0F, 0.0F);
	Class612 aClass612_10374;
	int anInt10375;
	int anInt10376;
	int anInt10377;
	NPC aClass649_Sub1_Sub5_Sub1_Sub1_10378;
	Player aClass649_Sub1_Sub5_Sub1_Sub2_10379;
	static final int anInt10380 = 0;
	static final int anInt10381 = 1;
	static final int anInt10382 = 2;
	static final int anInt10383 = 3;
	int anInt10384 = 0;
	boolean aBool10385;
	static Class708 aClass708_10386 = new Class708();
	Class479 aClass479_10387;
	int anInt10388;
	Class479 aClass479_10389;
	static final int anInt10390 = 512;
	int anInt10391;
	int anInt10392;
	int anInt10393;
	int anInt10394;

	public static void method9391(boolean bool) {
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10363.method8308(1867269829); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass708_10363.method8311(983244320)) {
			if (null != class536_sub3.aClass479_10389) {
				class536_sub3.aClass479_10389.method5774(150, (byte) 32);
				Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
				class536_sub3.aClass479_10389 = null;
			}
			if (class536_sub3.aClass479_10387 != null) {
				class536_sub3.aClass479_10387.method5774(150, (byte) 32);
				Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10387, -1092963117);
				class536_sub3.aClass479_10387 = null;
			}
			class536_sub3.method6484();
		}
		if (bool) {
			for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10386.method8308(1867269829); class536_sub3 != null; class536_sub3 = ((Class536_Sub3) aClass708_10386.method8311(1100575997))) {
				if (null != class536_sub3.aClass479_10389) {
					class536_sub3.aClass479_10389.method5774(150, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				class536_sub3.method6484();
			}
			for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass4_10366.method562(-1504316821); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass4_10366.method567(199184599)) {
				if (class536_sub3.aClass479_10389 != null) {
					class536_sub3.aClass479_10389.method5774(150, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				class536_sub3.method6484();
			}
		}
	}

	void method9392(int i) {
		int i_0_ = -1095423089 * anInt10388;
		if (null != aClass612_10374) {
			Class612 class612 = (aClass612_10374.method7293(Class465_Sub1.aClass96_10352, (1542697723 * client.anInt11074 == 4 ? (Interface18) Class193.anInterface18_2191 : Class465_Sub1.aClass96_10352), (byte) 111));
			if (class612 != null) {
				anInt10388 = class612.anInt7946 * -1153005485;
				anInt10375 = (class612.anInt7991 * 1037704243 << 9) * -924360927;
				anInt10376 = class612.anInt7959 * -1086542465;
				anInt10391 = -254492049 * class612.anInt7967;
				anInt10392 = class612.anInt7961 * -1344405515;
				anIntArray10365 = class612.anIntArray7997;
				anInt10393 = class612.anInt8006 * 292238255;
				anInt10377 = class612.anInt8005 * -1203970473;
			} else {
				anInt10388 = 1239313553;
				anInt10375 = 0;
				anInt10376 = 0;
				anInt10391 = 0;
				anInt10392 = 0;
				anIntArray10365 = null;
				anInt10393 = 849893632;
				anInt10377 = 1153726720;
				anInt10368 = 0;
			}
		} else if (aClass649_Sub1_Sub5_Sub1_Sub1_10378 != null) {
			int i_1_ = (Class536_Sub20.method9567(aClass649_Sub1_Sub5_Sub1_Sub1_10378, -1712288270));
			if (i_0_ != i_1_) {
				anInt10388 = -1239313553 * i_1_;
				Class296 class296 = aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass296_12174;
				if (null != class296.anIntArray3304)
					class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -53);
				if (class296 != null) {
					anInt10375 = -924360927 * (class296.anInt3276 * -796350477 << 9);
					anInt10368 = (class296.anInt3324 * 1797691849 << 9) * -367575189;
					anInt10376 = class296.anInt3295 * -930050451;
					anInt10393 = -1407500957 * class296.anInt3335;
					anInt10377 = -2052515789 * class296.anInt3322;
				} else {
					anInt10368 = 0;
					anInt10375 = 0;
					anInt10376 = 0;
					anInt10393 = 849893632;
					anInt10377 = 1153726720;
				}
			}
		} else if (null != aClass649_Sub1_Sub5_Sub1_Sub2_10379) {
			anInt10388 = Class266.method3695(aClass649_Sub1_Sub5_Sub1_Sub2_10379, -295219525) * -1239313553;
			anInt10375 = (692832581 * aClass649_Sub1_Sub5_Sub1_Sub2_10379.transformNPC << 9) * -924360927;
			anInt10368 = 0;
			anInt10376 = -717330677 * aClass649_Sub1_Sub5_Sub1_Sub2_10379.anInt12178;
			anInt10393 = 849893632;
			anInt10377 = 1153726720;
		}
		if (i_0_ != anInt10388 * -1095423089 && null != aClass479_10389 && aClass479_10389 != null) {
			aClass479_10389.method5774(100, (byte) 32);
			Class184_Sub2.aClass211_9442.method3002(aClass479_10389, -1092963117);
			aClass479_10389 = null;
		}
	}

	static {
		aClass4_10366 = new Class4(16);
	}

	public static void method9393() {
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10363.method8308(1867269829); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass708_10363.method8311(1275459802)) {
			if (class536_sub3.aBool10385)
				class536_sub3.method9392(-1187355040);
		}
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10386.method8308(1867269829); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass708_10386.method8311(1919019621)) {
			if (class536_sub3.aBool10385)
				class536_sub3.method9392(-2039837890);
		}
	}

	Class536_Sub3() {
		/* empty */
	}

	public static void method9394(int i, int i_2_, int i_3_, int i_4_) {
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10363.method8308(1867269829); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass708_10363.method8311(1354337838))
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_2_, i_3_, i_4_, 972546450);
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass708_10386.method8308(1867269829); null != class536_sub3; class536_sub3 = (Class536_Sub3) aClass708_10386.method8311(1249485628)) {
			int i_5_ = 1;
			Class589 class589 = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10877(-1534649980);
			int i_6_ = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass688_Sub3_11914.method8120((byte) 25);
			if (-1 == i_6_ || (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass688_Sub3_11914.aBool10975))
				i_5_ = 0;
			else if (class589.anInt7751 * -1967774449 == i_6_ || i_6_ == 1554006571 * class589.anInt7752 || i_6_ == class589.anInt7754 * -461301069 || -1062537651 * class589.anInt7741 == i_6_)
				i_5_ = 2;
			else if (i_6_ == class589.anInt7755 * 1910615395 || 183104283 * class589.anInt7766 == i_6_ || 592656773 * class589.anInt7758 == i_6_ || i_6_ == class589.anInt7757 * -1930617513)
				i_5_ = 3;
			if (class536_sub3.anInt10384 * 1130756623 != i_5_) {
				int i_7_ = (Class536_Sub20.method9567(class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378, 429042723));
				Class296 class296 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass296_12174);
				if (null != class296.anIntArray3304)
					class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -1);
				if (null == class296 || -1 == i_7_) {
					class536_sub3.anInt10388 = 1239313553;
					class536_sub3.anInt10384 = -1384663825 * i_5_;
				} else if (i_7_ != -1095423089 * class536_sub3.anInt10388) {
					boolean bool = false;
					if (class536_sub3.aClass479_10389 != null) {
						class536_sub3.anInt10376 -= 852218368;
						if (-540425639 * class536_sub3.anInt10376 <= 0) {
							class536_sub3.aClass479_10389.method5774(100, (byte) 32);
							Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
							class536_sub3.aClass479_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class536_sub3.anInt10376 = -930050451 * class296.anInt3295;
						class536_sub3.anInt10388 = i_7_ * -1239313553;
						class536_sub3.anInt10384 = -1384663825 * i_5_;
					}
				} else {
					class536_sub3.anInt10384 = i_5_ * -1384663825;
					class536_sub3.anInt10376 = class296.anInt3295 * -930050451;
				}
			}
			Class436 class436 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method7837().aClass436_4823);
			class536_sub3.anInt10367 = (int) class436.aFloat4850 * -537587733;
			class536_sub3.anInt10370 = ((int) class436.aFloat4850 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10874() << 8)) * -456576489;
			class536_sub3.anInt10369 = (int) class436.aFloat4853 * -1373921313;
			class536_sub3.anInt10371 = ((int) class436.aFloat4853 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10874() << 8)) * 1536397313;
			class536_sub3.anInt10364 = -358839083 * (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aByte10839);
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_2_, i_3_, i_4_, 940095958);
		}
		for (Class536_Sub3 class536_sub3 = (Class536_Sub3) aClass4_10366.method562(-1900569642); class536_sub3 != null; class536_sub3 = (Class536_Sub3) aClass4_10366.method567(281464409)) {
			int i_8_ = 1;
			Class589 class589 = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10877(1007100720);
			int i_9_ = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aClass688_Sub3_11914.method8120((byte) 81);
			if (-1 == i_9_ || (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aClass688_Sub3_11914.aBool10975))
				i_8_ = 0;
			else if (i_9_ == class589.anInt7751 * -1967774449 || 1554006571 * class589.anInt7752 == i_9_ || i_9_ == -461301069 * class589.anInt7754 || i_9_ == -1062537651 * class589.anInt7741)
				i_8_ = 2;
			else if (i_9_ == class589.anInt7755 * 1910615395 || i_9_ == class589.anInt7766 * 183104283 || class589.anInt7758 * 592656773 == i_9_ || i_9_ == -1930617513 * class589.anInt7757)
				i_8_ = 3;
			if (i_8_ != class536_sub3.anInt10384 * 1130756623) {
				int i_10_ = (Class266.method3695(class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379, 952916077));
				if (i_10_ != -1095423089 * class536_sub3.anInt10388) {
					boolean bool = false;
					if (class536_sub3.aClass479_10389 != null) {
						class536_sub3.anInt10376 -= 852218368;
						if (-540425639 * class536_sub3.anInt10376 <= 0) {
							class536_sub3.aClass479_10389.method5774(100, (byte) 32);
							Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
							class536_sub3.aClass479_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class536_sub3.anInt10376 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.anInt12178) * -717330677;
						class536_sub3.anInt10388 = i_10_ * -1239313553;
						class536_sub3.anInt10384 = -1384663825 * i_8_;
					}
				} else {
					class536_sub3.anInt10376 = -717330677 * (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.anInt12178);
					class536_sub3.anInt10384 = i_8_ * -1384663825;
				}
			}
			Class436 class436 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method7837().aClass436_4823);
			class536_sub3.anInt10367 = -537587733 * (int) class436.aFloat4850;
			class536_sub3.anInt10370 = ((int) class436.aFloat4850 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10874() << 8)) * -456576489;
			class536_sub3.anInt10369 = -1373921313 * (int) class436.aFloat4853;
			class536_sub3.anInt10371 = ((int) class436.aFloat4853 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10874() << 8)) * 1536397313;
			class536_sub3.anInt10364 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aByte10839 * -358839083);
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_2_, i_3_, i_4_, 721272876);
		}
	}
}
