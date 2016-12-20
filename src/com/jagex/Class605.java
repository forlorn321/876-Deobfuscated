/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class605 {
	static Class604_Sub1[] aClass604_Sub1Array7968;
	static final int anInt7969 = 1;
	public static int anInt7970;
	static boolean aBool7971 = false;
	public static int anInt7972;
	static final int anInt7973 = -1;
	static Class598[] aClass598Array7974;
	static final int anInt7975 = 2;

	static void method10043(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -6);
		aClass598Array7974 = new Class598[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			aClass598Array7974[i_0_] = new Class598();
			aClass598Array7974[i_0_].anInt7850 = class527_sub38.readUnsignedSmart((byte) -83) * -1202865957;
			aClass598Array7974[i_0_].aString7851 = class527_sub38.readVersionedString(90180177);
		}
		anInt7972 = class527_sub38.readUnsignedSmart((byte) -109) * -1965065081;
		Class638.anInt8321 = class527_sub38.readUnsignedSmart((byte) -15) * 1078339301;
		Class318.anInt3535 = class527_sub38.readUnsignedSmart((byte) -126) * 1621037041;
		aClass604_Sub1Array7968 = new Class604_Sub1[1 + (Class638.anInt8321 * 1671964397 - 451447095 * anInt7972)];
		for (int i_1_ = 0; i_1_ < -1134558959 * Class318.anInt3535; i_1_++) {
			int i_2_ = class527_sub38.readUnsignedSmart((byte) -67);
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array7968[i_2_] = new Class604_Sub1();
			class604_sub1.anInt7966 = class527_sub38.readUnsignedByte() * -588629823;
			class604_sub1.anInt7962 = class527_sub38.readInt() * -1385232667;
			class604_sub1.anInt10580 = class527_sub38.readUnsignedSmart((byte) -16) * -1898239091;
			if (class604_sub1.anInt10580 * -1126166715 != 0)
				class604_sub1.aString10581 = class527_sub38.readVersionedString(90180177);
			class604_sub1.anInt10579 = -708085763 * (451447095 * anInt7972 + i_2_);
			class604_sub1.aString10578 = class527_sub38.readVersionedString(90180177);
			class604_sub1.aString10577 = class527_sub38.readVersionedString(90180177);
		}
		anInt7970 = class527_sub38.readInt() * 2124488377;
		aBool7971 = true;
	}

	public static Class604_Sub1 method10044(int i) {
		if (!aBool7971 || i < anInt7972 * 451447095 || i > Class638.anInt8321 * 1671964397)
			return null;
		return aClass604_Sub1Array7968[i - anInt7972 * 451447095];
	}

	static void method10045(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -95);
		aClass598Array7974 = new Class598[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			aClass598Array7974[i_3_] = new Class598();
			aClass598Array7974[i_3_].anInt7850 = class527_sub38.readUnsignedSmart((byte) -119) * -1202865957;
			aClass598Array7974[i_3_].aString7851 = class527_sub38.readVersionedString(90180177);
		}
		anInt7972 = class527_sub38.readUnsignedSmart((byte) -15) * -1965065081;
		Class638.anInt8321 = class527_sub38.readUnsignedSmart((byte) -45) * 1078339301;
		Class318.anInt3535 = class527_sub38.readUnsignedSmart((byte) -56) * 1621037041;
		aClass604_Sub1Array7968 = new Class604_Sub1[1 + (Class638.anInt8321 * 1671964397 - 451447095 * anInt7972)];
		for (int i_4_ = 0; i_4_ < -1134558959 * Class318.anInt3535; i_4_++) {
			int i_5_ = class527_sub38.readUnsignedSmart((byte) -51);
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array7968[i_5_] = new Class604_Sub1();
			class604_sub1.anInt7966 = class527_sub38.readUnsignedByte() * -588629823;
			class604_sub1.anInt7962 = class527_sub38.readInt() * -1385232667;
			class604_sub1.anInt10580 = class527_sub38.readUnsignedSmart((byte) -10) * -1898239091;
			if (class604_sub1.anInt10580 * -1126166715 != 0)
				class604_sub1.aString10581 = class527_sub38.readVersionedString(90180177);
			class604_sub1.anInt10579 = -708085763 * (451447095 * anInt7972 + i_5_);
			class604_sub1.aString10578 = class527_sub38.readVersionedString(90180177);
			class604_sub1.aString10577 = class527_sub38.readVersionedString(90180177);
		}
		anInt7970 = class527_sub38.readInt() * 2124488377;
		aBool7971 = true;
	}

	static void method10046(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -24);
		aClass598Array7974 = new Class598[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aClass598Array7974[i_6_] = new Class598();
			aClass598Array7974[i_6_].anInt7850 = class527_sub38.readUnsignedSmart((byte) -18) * -1202865957;
			aClass598Array7974[i_6_].aString7851 = class527_sub38.readVersionedString(90180177);
		}
		anInt7972 = class527_sub38.readUnsignedSmart((byte) -11) * -1965065081;
		Class638.anInt8321 = class527_sub38.readUnsignedSmart((byte) -71) * 1078339301;
		Class318.anInt3535 = class527_sub38.readUnsignedSmart((byte) -34) * 1621037041;
		aClass604_Sub1Array7968 = new Class604_Sub1[1 + (Class638.anInt8321 * 1671964397 - 451447095 * anInt7972)];
		for (int i_7_ = 0; i_7_ < -1134558959 * Class318.anInt3535; i_7_++) {
			int i_8_ = class527_sub38.readUnsignedSmart((byte) -53);
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array7968[i_8_] = new Class604_Sub1();
			class604_sub1.anInt7966 = class527_sub38.readUnsignedByte() * -588629823;
			class604_sub1.anInt7962 = class527_sub38.readInt() * -1385232667;
			class604_sub1.anInt10580 = class527_sub38.readUnsignedSmart((byte) -103) * -1898239091;
			if (class604_sub1.anInt10580 * -1126166715 != 0)
				class604_sub1.aString10581 = class527_sub38.readVersionedString(90180177);
			class604_sub1.anInt10579 = -708085763 * (451447095 * anInt7972 + i_8_);
			class604_sub1.aString10578 = class527_sub38.readVersionedString(90180177);
			class604_sub1.aString10577 = class527_sub38.readVersionedString(90180177);
		}
		anInt7970 = class527_sub38.readInt() * 2124488377;
		aBool7971 = true;
	}

	Class605() throws Throwable {
		throw new Error();
	}

	static void method10047(RSByteBuffer class527_sub38) {
		for (int i = 0; i < -1134558959 * Class318.anInt3535; i++) {
			int i_9_ = class527_sub38.readUnsignedSmart((byte) -26);
			int i_10_ = class527_sub38.readUnsignedShort();
			if (i_10_ == 65535)
				i_10_ = -1;
			if (aClass604_Sub1Array7968[i_9_] != null)
				aClass604_Sub1Array7968[i_9_].anInt7967 = -2006613705 * i_10_;
		}
	}

	public static void method10048(int[] is, Object[] objects, int i, int i_11_, int i_12_) {
		if (i < i_11_) {
			int i_13_ = (i + i_11_) / 2;
			int i_14_ = i;
			int i_15_ = is[i_13_];
			is[i_13_] = is[i_11_];
			is[i_11_] = i_15_;
			Object object = objects[i_13_];
			objects[i_13_] = objects[i_11_];
			objects[i_11_] = object;
			int i_16_ = i_15_ == 2147483647 ? 0 : 1;
			for (int i_17_ = i; i_17_ < i_11_; i_17_++) {
				if (is[i_17_] < (i_17_ & i_16_) + i_15_) {
					int i_18_ = is[i_17_];
					is[i_17_] = is[i_14_];
					is[i_14_] = i_18_;
					Object object_19_ = objects[i_17_];
					objects[i_17_] = objects[i_14_];
					objects[i_14_++] = object_19_;
				}
			}
			is[i_11_] = is[i_14_];
			is[i_14_] = i_15_;
			objects[i_11_] = objects[i_14_];
			objects[i_14_] = object;
			method10048(is, objects, i, i_14_ - 1, -1802252098);
			method10048(is, objects, 1 + i_14_, i_11_, -972372352);
		}
	}

	static final void method10049(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 297393241) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2531 = Class103.method1800(string, class665, (byte) -103);
		class243.aBool2606 = true;
	}

	static final void method10050(Class665 class665, int i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 75) != Class301.aClass301_3413)
			throw new RuntimeException();
		((Class327_Sub1) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0)).method15703((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1, 102380841);
	}
}
