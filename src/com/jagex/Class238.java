/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class238 implements Interface27 {
	Class214 this$0;
	static Class147[] aClass147Array2388;
	static Class459 aClass459_2389;

	public void method150(Class219 class219, int i) {
		class219.method4051(-996689913);
	}

	Class238(Class214 class214) {
		this$0 = class214;
	}

	public void method151(Class219 class219) {
		class219.method4051(-250322628);
	}

	static void method4373(Class180 class180, int i) {
		if ((Class106.anInt1321 * 577629891 != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) && client.aClass509_11072.method8314(911653630) != null) {
			Class234.method4347(-1408626088);
			if (Class293.method5292(class180, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), -1345824229))
				Class106.anInt1321 = -1830047253 * (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864);
		}
	}

	static void method4374(long[] ls, Object[] objects, int i, int i_0_, byte i_1_) {
		if (i < i_0_) {
			int i_2_ = (i_0_ + i) / 2;
			int i_3_ = i;
			long l = ls[i_2_];
			ls[i_2_] = ls[i_0_];
			ls[i_0_] = l;
			Object object = objects[i_2_];
			objects[i_2_] = objects[i_0_];
			objects[i_0_] = object;
			int i_4_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
				if (ls[i_5_] < l + (long) (i_5_ & i_4_)) {
					long l_6_ = ls[i_5_];
					ls[i_5_] = ls[i_3_];
					ls[i_3_] = l_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_3_];
					objects[i_3_++] = object_7_;
				}
			}
			ls[i_0_] = ls[i_3_];
			ls[i_3_] = l;
			objects[i_0_] = objects[i_3_];
			objects[i_3_] = object;
			method4374(ls, objects, i, i_3_ - 1, (byte) -107);
			method4374(ls, objects, 1 + i_3_, i_0_, (byte) -70);
		}
	}

	static final void method4375(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1322772099 * client.anInt11171;
	}

	static void method4376(int i) {
		if (-1927019389 * client.anInt11048 == 19)
			Class666.method13742(-1578247527);
		client.aClass109_11066.method1968((byte) 72);
		Class700_Sub35.method17268((byte) -7);
		Class333.aBool3628 = true;
		Class171_Sub1_Sub3.method17968((byte) -30);
		for (int i_8_ = 0; i_8_ < client.aClass100Array11025.length; i_8_++)
			client.aClass100Array11025[i_8_] = null;
		client.aBool11188 = false;
		client.anInt11195 = ((int) (Math.random() * 100.0) - 50) * -661349667;
		client.anInt11213 = ((int) (Math.random() * 110.0) - 55) * -697325023;
		client.anInt11099 = ((int) (Math.random() * 80.0) - 40) * -867196655;
		client.anInt11088 = ((int) (Math.random() * 120.0) - 60) * 302279291;
		client.anInt10991 = ((int) (Math.random() * 30.0) - 20) * -998726409;
		client.aFloat11112 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class144.method2390((short) 20423);
		for (int i_9_ = 0; i_9_ < 2048; i_9_++)
			client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_9_] = null;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = null;
		client.anInt11059 = 0;
		client.anInt11030 = 0;
		client.aClass14_10989.method721(597613746);
		client.aClass694_11290.method14105((byte) 100);
		client.aClass14_11184.method721(838804944);
		client.aClass705_11182.method14332(-1509538209);
		client.aClass14_11253.method721(-1629539062);
		Class527_Sub2.aClass694_10357 = new Class694();
		Class527_Sub2.aClass694_10359 = new Class694();
		Class321.anInt3552 = 0;
		Class452.anInt4963 = 0;
		Class568.anInt7614 = 0;
		Class498.anInt5586 = 0;
		Class208_Sub11.anInt9926 = 0;
		Class405.anInt4196 = 0;
		Class170.anInt1881 = 0;
		Class447.anInt4930 = 0;
		Class209.anInt2246 = 0;
		Class78.anInt801 = 0;
		if (-1 != -2119864417 * client.anInt11237)
			Class112.method2017(-2119864417 * client.anInt11237, 716174115);
		for (Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method713((byte) 88); null != class527_sub41; class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method717(-871355107))) {
			if (!class527_sub41.method8736(-2126519674)) {
				class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method713((byte) -86));
				if (class527_sub41 == null)
					break;
			}
			Class231.method4326(class527_sub41, true, false, 1872998589);
		}
		client.anInt11237 = 1087640481;
		client.aClass14_11276 = new Class14(8);
		Class602.method10008(774410659);
		client.aClass243_11196 = null;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			client.aStringArray11262[i_10_] = null;
			client.aBoolArray11177[i_10_] = false;
			client.anIntArray11175[i_10_] = -1;
		}
		Class318.method5685(-1511501578);
		client.aBool11017 = true;
		for (int i_11_ = 0; i_11_ < 102; i_11_++)
			client.aBoolArray11310[i_11_] = true;
		for (int i_12_ = 0; i_12_ < 3; i_12_++) {
			for (int i_13_ = 0; i_13_ < 8; i_13_++)
				client.aClass492ArrayArray11272[i_12_][i_13_] = new Class492();
		}
		client.aClass509_11072.method8397(1402333330).method10252((short) -1016);
		client.aBool11119 = true;
		Class602.aShortArray7935 = Class295.aShortArray3275 = Class9.aShortArray78 = new short[256];
		Class485.aString5463 = Class53.aClass53_660.method1290(Class144_Sub1.aClass671_8995, (byte) -2);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub13_10608, Class204.aClass527_Sub31_2213.aClass700_Sub13_10607.method16964((byte) -113), 1268722435);
		client.anInt11069 = 0;
		Class107.method1928((byte) 0);
		Class59.aClass638_724 = null;
		Class395.aLong4106 = 0L;
	}
}
