/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class540 {
	int anInt7157;
	Class537 this$0;
	int anInt7158;
	int anInt7159;
	Class541[] aClass541Array7160;
	public static Class461 aClass461_7161;

	void method6514(int i) {
		int i_0_ = 1 << 1946639593 * anInt7157 + anInt7158 * -432722435;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
			aClass541Array7160[i_1_].method6522(-460970050);
	}

	void method6515(int i, int i_2_, byte i_3_) {
		if (null == aClass541Array7160 || anInt7157 * 1946639593 != i_2_ || i != -432722435 * anInt7158) {
			anInt7158 = i * -1460791467;
			anInt7159 = -1213828859 * ((1 << i) - 1);
			anInt7157 = i_2_ * 2121218905;
			int i_4_ = 1 << anInt7158 * -432722435 + anInt7157 * 1946639593;
			aClass541Array7160 = new Class541[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				aClass541Array7160[i_5_] = new Class541(this);
		}
	}

	void method6516() {
		int i = 1 << 1946639593 * anInt7157 + anInt7158 * -432722435;
		for (int i_6_ = 0; i_6_ < i; i_6_++)
			aClass541Array7160[i_6_].method6522(-460970050);
	}

	Class541 method6517(int i, byte i_7_, byte i_8_) {
		return (aClass541Array7160[(((i & anInt7159 * 113095629) << 1946639593 * anInt7157) + ((i_7_ & 0xff) >>> 8 - 1946639593 * anInt7157))]);
	}

	void method6518(int i, int i_9_) {
		if (null == aClass541Array7160 || anInt7157 * 1946639593 != i_9_ || i != -432722435 * anInt7158) {
			anInt7158 = i * -1460791467;
			anInt7159 = -1213828859 * ((1 << i) - 1);
			anInt7157 = i_9_ * 2121218905;
			int i_10_ = 1 << anInt7158 * -432722435 + anInt7157 * 1946639593;
			aClass541Array7160 = new Class541[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass541Array7160[i_11_] = new Class541(this);
		}
	}

	Class540(Class537 class537) {
		this$0 = class537;
	}

	static final void method6519(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		if (class668.anIntArray8541[1867269829 * class668.anInt8542] <= class668.anIntArray8541[1867269829 * class668.anInt8542 + 1])
			class668.anInt8564 += (class668.anIntArray8537[-1640738851 * class668.anInt8564] * -1531084683);
	}

	static final void method6520(Class668 class668, int i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_13_ = i_12_ >> 16;
		if (null == Class463.aClass234Array5227[i_13_])
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class463.aClass234Array5227[i_13_].icomponentDefinitions[i_12_].anInt2558) * -1413662187;
	}

	static final void method6521(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_14_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_15_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		ItemTypeDecoder class1 = ((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_14_, (byte) -19));
		if (i_15_ >= 1 && i_15_ <= 5 && null != class1.inventoryOptions[i_15_ - 1])
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class1.inventoryOptions[i_15_ - 1];
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}
}
