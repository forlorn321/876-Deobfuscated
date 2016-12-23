/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class215 {
	Class211 this$0;
	List aList2303;
	static Class174 aClass174_2304;

	void method3084(Class479 class479, byte i) {
		aList2303.add(class479);
	}

	boolean method3085(Class479 class479, int i) {
		return aList2303.contains(class479);
	}

	Class215(Class211 class211) {
		this$0 = class211;
		aList2303 = new ArrayList();
	}

	List method3086(byte i) {
		return aList2303;
	}

	void method3087(Class479 class479, int i) {
		aList2303.remove(class479);
	}

	public static void method3088(int i, int i_0_, int i_1_, int i_2_) {
		Class467.method5689(new Class41_Sub1(i, i_0_, i_1_, client.handshakeStage * -275818405, -2073269917 * Class176.aClass460_1936.anInt5195, 917679433 * Class176.aClass460_1936.anInt5196, Class176.aClass460_1936.method5528((byte) 1), Class176.aClass460_1936.method5523(1164928782), Class246.aClass466_2473.method5675(1244260260)), -1789365624);
	}

	static final void method3089(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static final void method3090(Class668 class668, int i) {
		int i_3_ = 0;
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < Class275.aClass459_Sub1Array3024.length; i_5_++) {
			if (Class275.aClass459_Sub1Array3024[i_5_] != null && Class275.aClass459_Sub1Array3024[i_5_].method9240(-2073757269)) {
				i_3_ += Class275.aClass459_Sub1Array3024[i_5_].method9236(653672513);
				i_4_ += Class275.aClass459_Sub1Array3024[i_5_].method9238((byte) -40);
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0 == i_3_ ? 0 : i_4_ * 100 / i_3_;
	}
}
