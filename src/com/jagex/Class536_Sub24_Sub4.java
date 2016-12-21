/* Class536_Sub24_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub24_Sub4 extends Class536_Sub24 {
	Class353 this$0;
	int anInt11703;

	void method9589(Class536_Sub15 class536_sub15) {
		class536_sub15.method9501(anInt11703 * 759345833, 1033187062);
	}

	void method9585(RSByteBuffer class536_sub33, int i) {
		anInt11703 = class536_sub33.readUnsignedShort() * 1289097625;
		class536_sub33.readUnsignedByte(-540017427);
		if (class536_sub33.readUnsignedByte(198652656) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
	}

	void method9584(Class536_Sub15 class536_sub15, int i) {
		class536_sub15.method9501(anInt11703 * 759345833, 1961501027);
	}

	void method9586(RSByteBuffer class536_sub33) {
		anInt11703 = class536_sub33.readUnsignedShort() * 1289097625;
		class536_sub33.readUnsignedByte(1296535658);
		if (class536_sub33.readUnsignedByte(984457436) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
	}

	void method9587(Class536_Sub15 class536_sub15) {
		class536_sub15.method9501(anInt11703 * 759345833, 1484226066);
	}

	void method9588(RSByteBuffer class536_sub33) {
		anInt11703 = class536_sub33.readUnsignedShort() * 1289097625;
		class536_sub33.readUnsignedByte(535337542);
		if (class536_sub33.readUnsignedByte(-1135458885) != 255) {
			class536_sub33.off -= 516175515;
			class536_sub33.method9711(702869087);
		}
	}

	void method9590(Class536_Sub15 class536_sub15) {
		class536_sub15.method9501(anInt11703 * 759345833, 2120184665);
	}

	Class536_Sub24_Sub4(Class353 class353) {
		this$0 = class353;
		anInt11703 = -1289097625;
	}

	static final void method10697(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		long l = (long) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		long l_0_ = (long) (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		long l_1_ = (long) (class668.anIntArray8541[2 + class668.anInt8542 * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (l * l_1_ / l_0_);
	}
}
