/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class545 {
	int anInt7268;
	byte[] aByteArray7269;
	float aFloat7270;
	int anInt7271;
	int anInt7272;
	int anInt7273;
	byte[] aByteArray7274;
	int anInt7275;
	int anInt7276;
	Class555 aClass555_7277;
	Class360_Sub1 this$0;

	int method6605(int i) {
		return 1390500653 * anInt7273;
	}

	Class545(Class360_Sub1 class360_sub1, Class555 class555, int i, float f, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		this$0 = class360_sub1;
		aClass555_7277 = class555;
		aByteArray7269 = new byte[i];
		aByteArray7274 = new byte[i_0_ / 8];
		anInt7273 = -1338594139 * aByteArray7269.length;
		aFloat7270 = f;
		anInt7276 = -285315047 * i_0_;
		anInt7272 = i_1_ * 676171969;
		anInt7268 = 0;
		anInt7271 = 0;
		anInt7275 = 0;
	}

	void method6606(byte[] is, int i, int i_3_, int i_4_) {
		int i_5_ = i;
		while (i_5_ < i_3_ + i) {
			aByteArray7269[1623137383 * anInt7268] = is[i_5_];
			aByteArray7269[1623137383 * anInt7268 + 1] = is[1 + i_5_];
			i_5_ += 2;
			anInt7268 += -1931444562;
			anInt7268 = anInt7268 * 1623137383 % aByteArray7269.length * -965722281;
			anInt7273 -= 1617779018;
		}
	}

	int method6607() {
		return 1390500653 * anInt7273;
	}

	static final void method6608(IComponentDefinitions class251, Class234 class234, Class668 class668, short i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1614359878) != null)
			string = string.substring(0, string.length() - 1);
		class251.onSubChangeHook = Class33.method796(string, class668, (short) -12967);
		class251.hasComponentHook = true;
	}

	static final void method6609(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class589 class589 = ((Class589) Class497.aClass34_Sub16_5554.method70(i_6_, (byte) -84));
		if (class589.anIntArray7742 != null && class589.anIntArray7742.length > 0) {
			int i_7_ = 0;
			int i_8_ = class589.anIntArray7743[0];
			for (int i_9_ = 1; i_9_ < class589.anIntArray7742.length; i_9_++) {
				if (class589.anIntArray7743[i_9_] > i_8_) {
					i_7_ = i_9_;
					i_8_ = class589.anIntArray7743[i_9_];
				}
			}
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class589.anIntArray7742[i_7_];
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class589.anInt7761 * 1438930045;
	}

	static void method6610(int i) {
		if (null != Class677.aClass167_8609) {
			client.aClass515_11066.method6259(-22798843);
			Class541.method6531(786572272);
			Class706_Sub2.method10262((byte) 119);
			Class270.method3713(-932594612);
			Class21.method711(1951851046);
			client.aClass515_11066.method6261(true, 2007522021);
			Class306.method4128(1620368976);
			Class40.method873(-356944396);
			Class558.method6817(false, -292795363);
			Class667.method8005(-1759297731);
			Class256.method3541((byte) 93);
			Class224.method3209(-422499871);
			for (int i_10_ = 0; i_10_ < client.aClass526Array11021.length; i_10_++) {
				if (client.aClass526Array11021[i_10_] != null)
					client.aClass526Array11021[i_10_].aClass177_7103 = null;
			}
			for (int i_11_ = 0; i_11_ < 2048; i_11_++) {
				Player class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_11_];
				if (null != class649_sub1_sub5_sub1_sub2) {
					for (int i_12_ = 0; i_12_ < (class649_sub1_sub5_sub1_sub2.aClass177Array11953).length; i_12_++)
						class649_sub1_sub5_sub1_sub2.aClass177Array11953[i_12_] = null;
				}
			}
			for (int i_13_ = 0; i_13_ < client.anInt11164 * -1683770117; i_13_++) {
				NPC class649_sub1_sub5_sub1_sub1 = ((NPC) client.aClass536_Sub13Array11044[i_13_].value);
				if (class649_sub1_sub5_sub1_sub1 != null) {
					for (int i_14_ = 0; i_14_ < (class649_sub1_sub5_sub1_sub1.aClass177Array11953).length; i_14_++)
						class649_sub1_sub5_sub1_sub1.aClass177Array11953[i_14_] = null;
				}
			}
			client.aClass4_11175.method561(-2117553523);
			Class677.aClass167_8609.method2005(778784407);
			Class677.aClass167_8609 = null;
		}
	}

	public static Interface71 method6611(Class461 class461, int i, Interface69 interface69, boolean bool, Class199 class199, int i_15_) {
		if (null != Class653.aClass360_8489) {
			if (bool)
				return new Class600(class461, i, Class653.aClass360_8489, interface69);
			return new Class591(class461, i, Class653.aClass360_8489, interface69, class199);
		}
		return null;
	}
}
