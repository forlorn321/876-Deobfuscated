/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class459 {
	public static Language CLIENT_PARAMS;
	public static Class34_Sub9 aClass34_Sub9_5179;
	static int anInt5180;

	abstract ReferenceTable getReferenceTable(byte i);

	abstract void method5506(int i);

	abstract ReferenceTable method5507();

	abstract void method5508(int i, int i_0_);

	abstract ReferenceTable method5509();

	abstract ReferenceTable method5510();

	Class459() {
		/* empty */
	}

	abstract int method5511(int i, byte i_1_);

	abstract byte[] method5512(int i);

	abstract void method5513(int i);

	abstract byte[] method5514(int i, int i_2_);

	abstract void method5515(int i);

	abstract int method5516(int i);

	abstract int method5517(int i);

	public static Class579 method5518(RSByteBuffer class536_sub33, int i) {
		int i_3_ = class536_sub33.readUnsignedByte();
		int[] is = new int[i_3_];
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
			is[i_4_] = class536_sub33.readUnsignedByte();
		return new Class579(is);
	}

	static final void method5519(Class668 class668, int i) {
		if (Class331_Sub2.aClass549_10049.method6638(86, (byte) 0))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method5520(Class668 class668, byte i) {
		if (Class683.aClass301_Sub1_8651.method4062(-754512515) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10285((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]), -1744165217);
	}
}
