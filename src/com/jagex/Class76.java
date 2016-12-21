/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class76 implements Interface6 {
	Class461 aClass461_820;
	Class199 aClass199_821;

	Class76(Class461 class461, int i) {
		aClass461_820 = class461;
		aClass199_821 = new Class199(i);
	}

	void method1143(int i, int i_0_) {
		aClass199_821 = new Class199(i);
	}

	void method1144(byte i) {
		synchronized (aClass199_821) {
			aClass199_821.method2884((byte) -115);
		}
	}

	void method1145(int i) {
		aClass199_821 = new Class199(i);
	}

	void method1146(byte i) {
		synchronized (aClass199_821) {
			aClass199_821.method2892(668368644);
		}
	}

	void method1147(int i) {
		synchronized (aClass199_821) {
			aClass199_821.method2883(i, -1453318444);
		}
	}

	void method1148() {
		synchronized (aClass199_821) {
			aClass199_821.method2884((byte) -90);
		}
	}

	void method1149() {
		synchronized (aClass199_821) {
			aClass199_821.method2884((byte) -1);
		}
	}

	void method1150(int i, int i_1_) {
		synchronized (aClass199_821) {
			aClass199_821.method2883(i, -1129873823);
		}
	}

	void method1151(int i) {
		synchronized (aClass199_821) {
			aClass199_821.method2883(i, -1475333867);
		}
	}

	void method1152() {
		synchronized (aClass199_821) {
			aClass199_821.method2892(297904279);
		}
	}

	void method1153() {
		synchronized (aClass199_821) {
			aClass199_821.method2892(-775106015);
		}
	}

	void method1154() {
		synchronized (aClass199_821) {
			aClass199_821.method2892(45041653);
		}
	}

	public static void method1155(int i, int i_2_, int i_3_, int i_4_, Class612 class612, Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1, Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2, int i_5_) {
		Class536_Sub3 class536_sub3 = new Class536_Sub3();
		class536_sub3.anInt10364 = -358839083 * i;
		class536_sub3.anInt10367 = -537587733 * (i_2_ << 9);
		class536_sub3.anInt10369 = (i_3_ << 9) * -1373921313;
		if (class612 != null) {
			class536_sub3.aClass612_10374 = class612;
			int i_6_ = class612.anInt8002 * -1981381335;
			int i_7_ = class612.anInt7980 * -90266503;
			if (i_4_ == 1 || i_4_ == 3) {
				i_6_ = -90266503 * class612.anInt7980;
				i_7_ = class612.anInt8002 * -1981381335;
			}
			class536_sub3.anInt10370 = (i_6_ + i_2_ << 9) * -456576489;
			class536_sub3.anInt10371 = (i_3_ + i_7_ << 9) * 1536397313;
			class536_sub3.anInt10388 = -1153005485 * class612.anInt7946;
			class536_sub3.anInt10375 = (1037704243 * class612.anInt7991 << 9) * -924360927;
			class536_sub3.anInt10376 = class612.anInt7959 * -1086542465;
			class536_sub3.anInt10391 = -254492049 * class612.anInt7967;
			class536_sub3.anInt10392 = -1344405515 * class612.anInt7961;
			class536_sub3.anIntArray10365 = class612.anIntArray7997;
			class536_sub3.anInt10393 = 292238255 * class612.anInt8006;
			class536_sub3.anInt10377 = -1203970473 * class612.anInt8005;
			class536_sub3.anInt10368 = -367575189 * (class612.anInt7992 * 1795211159 << 9);
			if (null != class612.anIntArray7988) {
				class536_sub3.aBool10385 = true;
				class536_sub3.method9392(-1374920528);
			}
			if (null != class536_sub3.anIntArray10365)
				class536_sub3.anInt10394 = ((class536_sub3.anInt10391 * 1942209471 + (int) (Math.random() * (double) ((class536_sub3.anInt10392 * 1109598061) - (1942209471 * class536_sub3.anInt10391)))) * -951577747);
			Class536_Sub3.aClass708_10363.method8335(class536_sub3, -1963791305);
			Class184_Sub2.aClass211_9442.method2998((-1095423089 * (class536_sub3.anInt10388)), 2076280788);
			Class184_Sub2.aClass211_9442.method3034(class536_sub3.anIntArray10365, (byte) 100);
		} else if (null != class649_sub1_sub5_sub1_sub1) {
			class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378 = class649_sub1_sub5_sub1_sub1;
			Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
			if (null != class296.anIntArray3304) {
				class536_sub3.aBool10385 = true;
				class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -73);
			}
			if (null != class296) {
				class536_sub3.anInt10370 = -456576489 * (830254667 * class296.anInt3272 + i_2_ << 9);
				class536_sub3.anInt10371 = 1536397313 * (i_3_ + class296.anInt3272 * 830254667 << 9);
				class536_sub3.anInt10388 = Class536_Sub20.method9567(class649_sub1_sub5_sub1_sub1, 1818086605) * -1239313553;
				class536_sub3.anInt10375 = -924360927 * (-796350477 * class296.anInt3276 << 9);
				class536_sub3.anInt10376 = -930050451 * class296.anInt3295;
				class536_sub3.anInt10393 = -1407500957 * class296.anInt3335;
				class536_sub3.anInt10377 = -2052515789 * class296.anInt3322;
				class536_sub3.anInt10368 = (1797691849 * class296.anInt3324 << 9) * -367575189;
				Class184_Sub2.aClass211_9442.method2998(-1037321689 * class296.anInt3319, 2113365868);
				Class184_Sub2.aClass211_9442.method2998(class296.anInt3320 * -1335145847, 2097469684);
				Class184_Sub2.aClass211_9442.method2998(class296.anInt3321 * -369448145, 2123852422);
				Class184_Sub2.aClass211_9442.method2998(-3853097 * class296.anInt3326, 2131097922);
			}
			Class536_Sub3.aClass708_10386.method8335(class536_sub3, -580047815);
		} else if (null != class649_sub1_sub5_sub1_sub2) {
			class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379 = class649_sub1_sub5_sub1_sub2;
			class536_sub3.anInt10370 = (i_2_ + class649_sub1_sub5_sub1_sub2.method10874(1355242333) << 9) * -456576489;
			class536_sub3.anInt10371 = (i_3_ + class649_sub1_sub5_sub1_sub2.method10874(1355242333) << 9) * 1536397313;
			class536_sub3.anInt10388 = (Class266.method3695(class649_sub1_sub5_sub1_sub2, 512073795) * -1239313553);
			class536_sub3.anInt10375 = (-924360927 * (class649_sub1_sub5_sub1_sub2.anInt12199 * 692832581 << 9));
			class536_sub3.anInt10376 = -717330677 * class649_sub1_sub5_sub1_sub2.anInt12178;
			class536_sub3.anInt10393 = 849893632;
			class536_sub3.anInt10377 = 1153726720;
			class536_sub3.anInt10368 = 0;
			Class536_Sub3.aClass4_10366.method560(class536_sub3, (long) (1710020215 * class649_sub1_sub5_sub1_sub2.anInt11889));
			Class184_Sub2.aClass211_9442.method2998(class649_sub1_sub5_sub1_sub2.anInt12193 * -1674002969, 2091568735);
			Class184_Sub2.aClass211_9442.method2998(1606140095 * class649_sub1_sub5_sub1_sub2.anInt12198, 2079640533);
			Class184_Sub2.aClass211_9442.method2998(381085537 * class649_sub1_sub5_sub1_sub2.anInt12195, 2101457028);
			Class184_Sub2.aClass211_9442.method2998(984444251 * class649_sub1_sub5_sub1_sub2.anInt12196, 2104762361);
		}
	}

	public static void method1156(Class570 class570, int i, int i_8_, Class666 class666, Class649_Sub1_Sub1_Sub1 class649_sub1_sub1_sub1, int i_9_) {
		Class668 class668 = Class586.method7063((byte) 5);
		class668.aClass649_Sub1_Sub1_Sub1_8556 = class649_sub1_sub1_sub1;
		Class57.method970(class570, i, i_8_, class668, -937344189);
		class668.aClass649_Sub1_Sub1_Sub1_8556 = null;
	}

	static final void method1157(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub40_10745.method10246(-2026593254);
	}
}
