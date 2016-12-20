/* Class527_Sub38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub38_Sub2 extends RSByteBuffer {
	static int[] anIntArray11847 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	Class2 aClass2_11848;
	int anInt11849;

	public void method18444() {
		anInt11849 = anInt10689 * -1221650088;
	}

	public void method18445(Class2 class2, int i) {
		aClass2_11848 = class2;
	}

	public Class527_Sub38_Sub2(int i) {
		super(i);
	}

	public int method18446(byte i) {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) 1919)) & 0xff);
	}

	public boolean method18447(byte i) {
		int i_0_ = ((buffer[-441238943 * anInt10689] - aClass2_11848.method525(-1251426305)) & 0xff);
		if (i_0_ < 128)
			return false;
		return true;
	}

	public int method18448() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -9729)) & 0xff);
	}

	public void method18449(byte[] is, int i, int i_1_, int i_2_) {
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
			is[i + i_3_] = (byte) ((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) 1638));
	}

	public void method18450(int i) {
		anInt11849 = anInt10689 * -1221650088;
	}

	public void method18451() {
		anInt11849 = anInt10689 * -1221650088;
	}

	public void method18452(int i) {
		anInt10689 = 1474750881 * ((anInt11849 * -1895316829 + 7) / 8);
	}

	public int method18453(int i, byte i_4_) {
		return 8 * i - anInt11849 * -1895316829;
	}

	public void method18454(byte[] is, int i, int i_5_) {
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			is[i + i_6_] = (byte) ((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) -10965));
	}

	public void method18455(int i) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i + aClass2_11848.method517((short) 324));
	}

	public int method18456() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -10006)) & 0xff);
	}

	public int method18457() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -13554)) & 0xff);
	}

	public int method18458() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -5816)) & 0xff);
	}

	public int method18459() {
		int i = ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) 833)) & 0xff);
		if (i < 128)
			return i;
		return ((i - 128 << 8) + (((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) 910)) & 0xff));
	}

	public void method18460(byte[] is, int i, int i_7_) {
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
			is[i + i_8_] = (byte) ((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) -10681));
	}

	public boolean method18461() {
		int i = ((buffer[-441238943 * anInt10689] - aClass2_11848.method525(-701968826)) & 0xff);
		if (i < 128)
			return false;
		return true;
	}

	public int method18462(int i) {
		return 8 * i - anInt11849 * -1895316829;
	}

	public int method18463() {
		int i = ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) 26382)) & 0xff);
		if (i < 128)
			return i;
		return ((i - 128 << 8) + (((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) -3965)) & 0xff));
	}

	public void method18464(int i, byte i_9_) {
		buffer[(anInt10689 += 1474750881) * -441238943 - 1] = (byte) (i + aClass2_11848.method517((short) 13399));
	}

	public int method18465(byte i) {
		int i_10_ = ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -11997)) & 0xff);
		if (i_10_ < 128)
			return i_10_;
		return ((i_10_ - 128 << 8) + (((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) 4508)) & 0xff));
	}

	public void method18466(byte[] is, int i, int i_11_) {
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
			is[i + i_12_] = (byte) ((buffer[(anInt10689 += 1474750881) * -441238943 - 1]) - aClass2_11848.method517((short) 6942));
	}

	public int method18467(int i) {
		int i_13_ = anInt11849 * -1895316829 >> 3;
		int i_14_ = 8 - (-1895316829 * anInt11849 & 0x7);
		int i_15_ = 0;
		anInt11849 += -134741749 * i;
		for (/**/; i > i_14_; i_14_ = 8) {
			i_15_ += ((buffer[i_13_++] & anIntArray11847[i_14_]) << i - i_14_);
			i -= i_14_;
		}
		if (i == i_14_)
			i_15_ += buffer[i_13_] & anIntArray11847[i_14_];
		else
			i_15_ += buffer[i_13_] >> i_14_ - i & anIntArray11847[i];
		return i_15_;
	}

	public void method18468() {
		anInt11849 = anInt10689 * -1221650088;
	}

	public int method18469(int i, int i_16_) {
		int i_17_ = anInt11849 * -1895316829 >> 3;
		int i_18_ = 8 - (-1895316829 * anInt11849 & 0x7);
		int i_19_ = 0;
		anInt11849 += -134741749 * i;
		for (/**/; i > i_18_; i_18_ = 8) {
			i_19_ += ((buffer[i_17_++] & anIntArray11847[i_18_]) << i - i_18_);
			i -= i_18_;
		}
		if (i == i_18_)
			i_19_ += buffer[i_17_] & anIntArray11847[i_18_];
		else
			i_19_ += buffer[i_17_] >> i_18_ - i & anIntArray11847[i];
		return i_19_;
	}

	public void method18470() {
		anInt10689 = 1474750881 * ((anInt11849 * -1895316829 + 7) / 8);
	}

	public void method18471() {
		anInt10689 = 1474750881 * ((anInt11849 * -1895316829 + 7) / 8);
	}

	public void method18472() {
		anInt10689 = 1474750881 * ((anInt11849 * -1895316829 + 7) / 8);
	}

	public void method18473() {
		anInt10689 = 1474750881 * ((anInt11849 * -1895316829 + 7) / 8);
	}

	public int method18474(int i) {
		return 8 * i - anInt11849 * -1895316829;
	}

	public int method18475(int i) {
		return 8 * i - anInt11849 * -1895316829;
	}

	public int method18476() {
		return ((buffer[(anInt10689 += 1474750881) * -441238943 - 1] - aClass2_11848.method517((short) -13914)) & 0xff);
	}

	static final void method18477(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub20_10606.method17105((byte) 15) ? 1 : 0;
	}
}
