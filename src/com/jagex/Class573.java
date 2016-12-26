/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class573 {
	Class573() throws Throwable {
		throw new Error();
	}

	static final void method6939(short i) {
		Class685.anInt8663 -= 1228520531;
	}

	static final void method6940(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.aBool2594 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
	}

	static final void method6941(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1 != i_0_) {
			int i_1_ = i_0_ >> 14 & 0x3fff;
			int i_2_ = i_0_ & 0x3fff;
			Class598 class598 = client.aClass515_11066.method6255(-1746927349);
			i_1_ -= class598.anInt7839 * 1858049507;
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ >= client.aClass515_11066.method6321((byte) 46))
				i_1_ = client.aClass515_11066.method6321((byte) -94);
			i_2_ -= class598.anInt7840 * 1479112045;
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ >= client.aClass515_11066.method6243(177401017))
				i_2_ = client.aClass515_11066.method6243(177401017);
			Class658.anInt8498 = 662013517 * (256 + (i_1_ << 9));
			Class667.anInt8535 = ((i_2_ << 9) + 256) * -1594603721;
		} else {
			Class658.anInt8498 = -662013517;
			Class667.anInt8535 = 1594603721;
		}
	}

	static final void method6942(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub4_10759.method9903(-1361124104) ? 1 : 0;
	}
}
