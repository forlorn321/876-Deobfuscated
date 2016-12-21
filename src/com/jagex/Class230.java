/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class230 implements Interface27 {
	int anInt2364;
	boolean aBool2365;
	Class213 this$0;

	public void method155(Class226 class226) {
		class226.method3236(-1157950953 * anInt2364, aBool2365, -494813110);
		class226.method3227(anInt2364 * -1157950953, -781094290).method3123(368312517);
	}

	public void method154(Class226 class226, short i) {
		class226.method3236(-1157950953 * anInt2364, aBool2365, -1081893980);
		class226.method3227(anInt2364 * -1157950953, -781094290).method3123(368312517);
	}

	public void method153(Class226 class226) {
		class226.method3236(-1157950953 * anInt2364, aBool2365, 276067389);
		class226.method3227(anInt2364 * -1157950953, -781094290).method3123(368312517);
	}

	Class230(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2364 = class536_sub33.readUnsignedShort((short) 6411) * 1640056231;
		aBool2365 = class536_sub33.readUnsignedByte(-1219696038) == 1;
	}

	static final void method3294(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class1 class1 = (Class1) Class111.aClass34_Sub13_1391.method70(i_0_, (byte) 102);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class1.anInt18 * -1423460053;
	}

	static final void method3295(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= -1349181388;
		float f = (float) class668.anIntArray8541[1867269829 * class668.anInt8542];
		float f_1_ = (float) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1]);
		float f_2_ = (float) (class668.anIntArray8541[2 + 1867269829 * class668.anInt8542]);
		float f_3_ = ((float) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 3]) / 1000.0F);
		Class683.aClass301_Sub1_8651.method4084(Class436.method5257(f, f_1_, f_2_), f_3_, (short) 21500);
	}

	static final void method3296(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class273.method3730(2, i_4_, i_5_, "", -2031217715);
	}

	static final void method3297(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class685.method8111(class251, class234, class668, 1700180549);
	}

	static final void method3298(Class251 class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2663 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1261514709;
	}
}
