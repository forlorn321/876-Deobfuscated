/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class314 {
	String aString3501;
	String aString3502;
	String aString3503;
	public static int anInt3504;

	Class314(String string, String string_0_, String string_1_) {
		aString3503 = string;
		aString3502 = string_0_;
		aString3501 = string_1_;
	}

	static final void method4201(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (0 != client.anInt11289 * -1484801557 && i_2_ < 1857706641 * client.anInt11293)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aClass30Array11295[i_2_].aString263;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static final void method4202(Class668 class668, short i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.shadowQualitySetting), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		client.aClass515_11066.method6319(-773336384);
		Class27.method763(1962815800);
		client.aBool11015 = false;
	}

	static void method4203(int i) {
		if (Class205_Sub9.method9064(client.anInt11101 * -708374433, -1470631645)) {
			if (client.aClass106_11218.method1413((short) 12376) == null)
				Class673.method8026(1, -1798113843);
			else
				Class673.method8026(0, -1798113843);
		} else if (1 == client.anInt11101 * -708374433 || -708374433 * client.anInt11101 == 3)
			Class673.method8026(16, -1798113843);
		else if (-708374433 * client.anInt11101 == 4)
			Class673.method8026(16, -1798113843);
	}

	static final void method4204(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (i_3_ & 1 << i_4_) != 0 ? 1 : 0;
	}
}
