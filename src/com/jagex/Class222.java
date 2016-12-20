/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class222 implements Interface27 {
	int anInt2314;
	Class214 this$0;

	public void method150(Class219 class219, int i) {
		class219.method4000(-1724916807 * anInt2314, 1604036228);
		class219.method3992(-1724916807 * anInt2314, 697665239);
	}

	Class222(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2314 = class527_sub38.readUnsignedShort() * -482887031;
	}

	public void method151(Class219 class219) {
		class219.method4000(-1724916807 * anInt2314, 1604036228);
		class219.method3992(-1724916807 * anInt2314, 172371384);
	}

	static void method4151(int i) {
		Class105.anInt1300 = 0;
		for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
			Class105.aClass527_Sub38Array1298[i_0_] = null;
			Class105.aClass527_Sub38Array1305[i_0_] = null;
			Class105.aByteArray1299[i_0_] = Class679.aClass679_8622.aByte8627;
			Class105.aClass47Array1296[i_0_] = null;
		}
	}

	static Class527_Sub8_Sub10 method4152(byte[] is, int i) {
		return new Class527_Sub8_Sub10(new RSByteBuffer(is), Class310.anInterface20_3490);
	}

	static final void method4153(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -66541143 * Class407.anInt4263;
	}
}
