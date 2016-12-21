/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class538 {
	Class316[] aClass316Array7153;
	static final int anInt7154 = 4096;
	Class524[] aClass524Array7155;
	static byte[] aByteArray7156 = new byte[2048];

	static {
		int i = 22;
		int i_0_ = 2;
		aByteArray7156[0] = (byte) 0;
		aByteArray7156[1] = (byte) 1;
		for (int i_1_ = 2; i_1_ < i; i_1_++) {
			int i_2_ = 1 << (i_1_ >> 1) - 1;
			int i_3_ = 0;
			while (i_3_ < i_2_) {
				aByteArray7156[i_0_] = (byte) i_1_;
				i_3_++;
				i_0_++;
			}
		}
	}

	Class538() {
		Class229.method3290(1684581994);
		aClass524Array7155 = new Class524[4096];
		new Class334();
		aClass316Array7153 = new Class316[4];
		new Class316(4);
		new Class529_Sub1(this);
		new Class529_Sub1(this);
		new Class528(this);
		for (int i = 0; i < 4096; i++)
			aClass524Array7155[i] = new Class524(this);
		for (int i = 0; i < 4; i++)
			aClass316Array7153[i] = new Class316(6);
	}

	public static void method6509(Class395 class395, Class399 class399, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		Class100.aClass395_1191 = class395;
		Class100.aClass399_1184 = class399;
		Class100.anInt1183 = i * -2001094357;
		Class100.anInt1185 = i_4_ * -1746932359;
		Class100.anInt1187 = i_5_ * -957030695;
		Class100.anInt1188 = -1868533957 * i_6_;
		Class100.anInt1189 = -1270194405 * i_7_;
		Class577.anInt7689 = -1935289429 * i_8_;
		Class576.anInt7683 = i_9_ * 322204039;
		Class100.aClass179_1186 = null;
		Class100.aClass179_1192 = null;
		Class100.aClass179_1193 = null;
		Class246.anInt2466 = -1564059165 * i_10_;
		Class100.anInt1190 = -435932029 * i_11_;
		Class301_Sub1.method9201(-992355075);
		Class34_Sub8.aBool10968 = true;
	}

	static void method6510(int i, boolean bool, int i_13_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(22, (long) i);
		class536_sub18_sub5.method10659(1684169074);
		class536_sub18_sub5.anInt11675 = (bool ? 1 : 0) * 1577826219;
	}
}
