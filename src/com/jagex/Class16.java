/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class16 implements Interface6 {
	boolean aBool174;
	Class461 aClass461_175;
	Class664 aClass664_176;
	Class199 aClass199_177 = new Class199(50);
	Class607 aClass607_178 = new Class607(250);
	Class11 aClass11_179 = new Class11();
	Interface12 anInterface12_180;
	int anInt181;
	String[] aStringArray182;
	String[] aStringArray183;

	void method644(int i) {
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method645() {
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -117);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	Class143 method646(Class167 class167, Class167 class167_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, boolean bool_4_, int i_5_, Class184 class184, Class617 class617, Class628 class628, Interface12 interface12, int i_6_) {
		if (!bool_4_) {
			Class143 class143 = method666(class167_0_, i, i_1_, i_2_, i_3_, i_5_, class617, -438709473);
			if (class143 != null)
				return class143;
		}
		ItemTypeDecoder class1 = (ItemTypeDecoder) interface12.method70(i, (byte) -100);
		if (i_1_ > 1 && null != class1.stackIds) {
			int i_7_ = -1;
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				if (i_1_ >= class1.stackAmounts[i_8_] && 0 != class1.stackAmounts[i_8_])
					i_7_ = class1.stackIds[i_8_];
			}
			if (i_7_ != -1)
				class1 = (ItemTypeDecoder) interface12.method70(i_7_, (byte) -6);
		}
		int[] is = class1.method513(class167, class167_0_, i_1_, i_2_, i_3_, bool, i_5_, class184, class617, class628, 1983241245);
		if (is == null)
			return null;
		Class143 class143;
		if (bool_4_)
			class143 = class167.method2081(is, 0, 36, 36, 32, (byte) -93);
		else
			class143 = class167_0_.method2081(is, 0, 36, 36, 32, (byte) -60);
		if (!bool_4_) {
			Class11 class11 = new Class11();
			class11.anInt145 = class167_0_.anInt1850 * -513298993;
			class11.anInt139 = 387676257 * i;
			class11.anInt141 = 1766411843 * i_1_;
			class11.anInt140 = -448654543 * i_2_;
			class11.anInt143 = 478205853 * i_3_;
			class11.anInt144 = i_5_ * -1135314035;
			class11.aBool142 = class617 != null;
			aClass607_178.method7225(class143, class11);
		}
		return class143;
	}

	void method647(boolean bool, int i) {
		if (bool != aBool174) {
			aBool174 = bool;
			method649(2133586571);
		}
	}

	void method648(int i, short i_9_) {
		anInt181 = i * -1432869493;
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -61);
		}
	}

	void method649(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -81);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method650() {
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -8);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method651(int i, int i_10_) {
		synchronized (aClass199_177) {
			aClass199_177.method2883(i, -1437700175);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7227(i);
		}
	}

	void method652(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2892(105317731);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7228();
		}
	}

	void method653(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2883(i, -1691074841);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7227(i);
		}
	}

	void method654(boolean bool) {
		if (bool != aBool174) {
			aBool174 = bool;
			method649(-1418789092);
		}
	}

	void method655(boolean bool) {
		if (bool != aBool174) {
			aBool174 = bool;
			method649(-2066255427);
		}
	}

	void method656() {
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -1);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method657(int i) {
		anInt181 = i * -1432869493;
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -90);
		}
	}

	void method658(int i) {
		anInt181 = i * -1432869493;
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -96);
		}
	}

	void method659(int i) {
		anInt181 = i * -1432869493;
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -56);
		}
	}

	void method660(int i) {
		anInt181 = i * -1432869493;
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -66);
		}
	}

	void method661() {
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method662() {
		synchronized (aClass199_177) {
			aClass199_177.method2884((byte) -28);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	Class16(GameMode class670, Class664 class664, boolean bool, Class461 class461, Interface12 interface12) {
		aClass664_176 = class664;
		aBool174 = bool;
		aClass461_175 = class461;
		anInterface12_180 = interface12;
		if (class670 == GameMode.aClass670_8568)
			aStringArray182 = new String[] { null, null, Class38.aClass38_461.method840(aClass664_176, 1718619298), null, null, Class38.aClass38_459.method840(aClass664_176, 1955475016) };
		else
			aStringArray182 = new String[] { null, null, Class38.aClass38_461.method840(aClass664_176, 2096276904), null, null, null };
		aStringArray183 = new String[] { null, null, null, null, Class38.aClass38_318.method840(aClass664_176, 2026715877) };
	}

	void method663(boolean bool) {
		if (bool != aBool174) {
			aBool174 = bool;
			method649(-459375358);
		}
	}

	void method664() {
		synchronized (aClass607_178) {
			aClass607_178.method7229();
		}
	}

	void method665(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2883(i, -1582656788);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7227(i);
		}
	}

	Class143 method666(Class167 class167, int i, int i_11_, int i_12_, int i_13_, int i_14_, Class617 class617, int i_15_) {
		aClass11_179.anInt145 = class167.anInt1850 * -513298993;
		aClass11_179.anInt139 = 387676257 * i;
		aClass11_179.anInt141 = i_11_ * 1766411843;
		aClass11_179.anInt140 = i_12_ * -448654543;
		aClass11_179.anInt143 = i_13_ * 478205853;
		aClass11_179.anInt144 = -1135314035 * i_14_;
		aClass11_179.aBool142 = null != class617;
		return (Class143) aClass607_178.method7222(aClass11_179);
	}

	void method667(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2883(i, -1432917872);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7227(i);
		}
	}

	void method668(int i) {
		synchronized (aClass199_177) {
			aClass199_177.method2883(i, -1247355518);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7227(i);
		}
	}

	void method669() {
		synchronized (aClass199_177) {
			aClass199_177.method2892(-371496009);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7228();
		}
	}

	void method670() {
		synchronized (aClass199_177) {
			aClass199_177.method2892(1115204853);
		}
		synchronized (aClass607_178) {
			aClass607_178.method7228();
		}
	}

	static final void method671(Class668 class668, int i) {
		Class690 class690 = Class147.method1814(1356781718);
		String string = Class15.method641(-1453320574);
		if (string == null)
			string = "";
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class690.method78();
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}
}
