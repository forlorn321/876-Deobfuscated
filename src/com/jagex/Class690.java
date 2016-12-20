/* Class690 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public final class Class690 {
	int anInt8693;
	int anInt8694 = 16;
	int anInt8695 = 18002;
	int anInt8696 = 6;
	int anInt8697;
	int anInt8698;
	int anInt8699 = 258;
	int anInt8700;
	byte[][] aByteArrayArray8701;
	byte[] aByteArray8702;
	int anInt8703;
	int anInt8704;
	int anInt8705;
	byte aByte8706;
	int[][] anIntArrayArray8707;
	int anInt8708;
	int anInt8709 = 4096;
	int anInt8710;
	byte[] aByteArray8711;
	int anInt8712;
	int anInt8713;
	int[] anIntArray8714;
	int anInt8715;
	int[][] anIntArrayArray8716;
	int anInt8717;
	boolean[] aBoolArray8718;
	boolean[] aBoolArray8719;
	byte[] aByteArray8720;
	byte[] aByteArray8721;
	int[] anIntArray8722;
	int anInt8723 = 50;
	byte[] aByteArray8724;
	int anInt8725;
	int[] anIntArray8726;
	int[][] anIntArrayArray8727;
	byte[] aByteArray8728;
	int[] anIntArray8729;
	int anInt8730;

	Class690() {
		anInt8694 = 16;
		anInt8699 = 258;
		anInt8696 = 6;
		anInt8723 = 50;
		anInt8695 = 18002;
		anInt8700 = 0;
		anInt8703 = 0;
		anIntArray8714 = new int[256];
		anIntArray8726 = new int[257];
		aBoolArray8718 = new boolean[256];
		aBoolArray8719 = new boolean[16];
		aByteArray8720 = new byte[256];
		aByteArray8728 = new byte[4096];
		anIntArray8722 = new int[16];
		aByteArray8721 = new byte[18002];
		aByteArray8724 = new byte[18002];
		aByteArrayArray8701 = new byte[6][258];
		anIntArrayArray8707 = new int[6][258];
		anIntArrayArray8727 = new int[6][258];
		anIntArrayArray8716 = new int[6][258];
		anIntArray8729 = new int[6];
	}

	static final void method14001(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class409.method6570(class243, class665, 1903980452);
	}

	public static TwitchWebcamDevice method14002(String string, byte i) {
		if (Class585.aTwitchWebcamDeviceArray7709 == null)
			return null;
		for (int i_0_ = 0; i_0_ < Class585.aTwitchWebcamDeviceArray7709.length; i_0_++) {
			if (Class585.aTwitchWebcamDeviceArray7709[i_0_].aString1118.equals(string))
				return Class585.aTwitchWebcamDeviceArray7709[i_0_];
		}
		return null;
	}
}
