/* Class536_Sub33_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class RSBitBuffer extends RSByteBuffer {
	int anInt11792;
	static int[] anIntArray11793 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	Class15 aClass15_11794;

	public void method10776(byte[] is, int i, int i_0_, int i_1_) {
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
			is[i + i_2_] = (byte) ((buffer[(off += 516175515) * -810172525 - 1]) - aClass15_11794.method628(873041966));
	}

	public int method10777(byte i) {
		return ((buffer[(off += 516175515) * -810172525 - 1] - aClass15_11794.method628(873041966)) & 0xff);
	}

	public int method10778(int i) {
		int i_3_ = (buffer[(off += 516175515) * -810172525 - 1] - aClass15_11794.method628(873041966)) & 0xff;
		if (i_3_ < 128)
			return i_3_;
		return ((i_3_ - 128 << 8) + ((buffer[(off += 516175515) * -810172525 - 1] - aClass15_11794.method628(873041966)) & 0xff));
	}

	public void initBitAccess() {
		anInt11792 = off * -1758662568;
	}

	public int readBits(int i) {
		int i_5_ = anInt11792 * 293388697 >> 3;
		int i_6_ = 8 - (293388697 * anInt11792 & 0x7);
		int i_7_ = 0;
		anInt11792 += i * -1966538071;
		for (/**/; i > i_6_; i_6_ = 8) {
			i_7_ += ((buffer[i_5_++] & anIntArray11793[i_6_]) << i - i_6_);
			i -= i_6_;
		}
		if (i_6_ == i)
			i_7_ += buffer[i_5_] & anIntArray11793[i_6_];
		else
			i_7_ += buffer[i_5_] >> i_6_ - i & anIntArray11793[i];
		return i_7_;
	}

	public void finishBitAccess(int i) {
		off = (7 + anInt11792 * 293388697) / 8 * 516175515;
	}

	public RSBitBuffer(int i) {
		super(i);
	}

	public void method10782(Class15 class15, int i) {
		aClass15_11794 = class15;
	}

	public void method10783(int i, byte i_8_) {
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i + aClass15_11794.method628(873041966));
	}

	public boolean method10784(int i) {
		int i_9_ = ((buffer[-810172525 * off] - aClass15_11794.method638((short) 8615)) & 0xff);
		if (i_9_ < 128)
			return false;
		return true;
	}

	public int method10785(int i, byte i_10_) {
		return i * 8 - anInt11792 * 293388697;
	}
}
