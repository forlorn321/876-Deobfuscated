/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class217 implements Interface27 {
	int anInt2281;
	int anInt2282;
	Class214 this$0;
	public static Class459 aClass459_2283;

	public void method151(Class219 class219) {
		class219.method3998(anInt2282 * -2085662447, anInt2281 * -1411801575, (byte) 53);
		class219.method3992(anInt2282 * -2085662447, -94225673).method3942(393467099);
	}

	public void method150(Class219 class219, int i) {
		class219.method3998(anInt2282 * -2085662447, anInt2281 * -1411801575, (byte) 26);
		class219.method3992(anInt2282 * -2085662447, -1666701130).method3942(-875975113);
	}

	Class217(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2282 = class527_sub38.readUnsignedShort() * 1391050737;
		anInt2281 = class527_sub38.readUnsignedByte() * -1527980503;
	}

	static final void method3969(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
			char c = string.charAt(i_0_);
			if (c == '<')
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = stringbuilder.toString();
	}

	static final void method3970(int i, Class243 class243, Class665 class665, int i_1_) {
		if (i < 1 || i > 10)
			throw new RuntimeException();
		Class331_Sub3.method15766(i, -254728301 * class243.anInt2504, class243.anInt2675 * -927924265, "", 472161400);
	}

	static final void method3971(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4165((byte) 41);
	}

	static int method3972(CharSequence charsequence, int i, boolean bool, int i_2_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		int i_5_ = 0;
		int i_6_ = charsequence.length();
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			int i_8_ = charsequence.charAt(i_7_);
			if (i_7_ == 0) {
				if (45 == i_8_) {
					bool_3_ = true;
					continue;
				}
				if (43 == i_8_ && bool)
					continue;
			}
			if (i_8_ >= 48 && i_8_ <= 57)
				i_8_ -= 48;
			else if (i_8_ >= 65 && i_8_ <= 90)
				i_8_ -= 55;
			else if (i_8_ >= 97 && i_8_ <= 122)
				i_8_ -= 87;
			else
				throw new NumberFormatException();
			if (i_8_ >= i)
				throw new NumberFormatException();
			if (bool_3_)
				i_8_ = -i_8_;
			int i_9_ = i * i_5_ + i_8_;
			if (i_9_ / i != i_5_)
				throw new NumberFormatException();
			i_5_ = i_9_;
			bool_4_ = true;
		}
		if (!bool_4_)
			throw new NumberFormatException();
		return i_5_;
	}

	public static void method3973(int i, int i_10_, int i_11_) {
		Class529_Sub1.anInt10783 = (i - Class529_Sub1.anInt7137) * 2049864907;
		Class635.anInt8302 = -1224612011 * (i_10_ - Class529_Sub1.anInt7138);
		Class529_Sub1.anInt10779 = -1449615877;
		Class529_Sub1.anInt10772 = -1784395681;
		Class146.method2401((byte) 124);
	}

	static void method3974(int i, int i_12_, int i_13_, int i_14_, Class18 class18, boolean bool, int i_15_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class527_Sub1 class527_sub1 = (Class527_Sub1) Class527_Sub1.aClass14_10333.method709(l);
		if (null == class527_sub1) {
			class527_sub1 = new Class527_Sub1();
			Class527_Sub1.aClass14_10333.method714(class527_sub1, l);
		}
		if (class527_sub1.anIntArray10332.length <= i_12_) {
			int[] is = new int[1 + i_12_];
			int[] is_16_ = new int[i_12_ + 1];
			Class18[] class18s = null;
			if (null != class527_sub1.aClass18Array10335)
				class18s = new Class18[i_12_ + 1];
			for (int i_17_ = 0; i_17_ < class527_sub1.anIntArray10332.length; i_17_++) {
				is[i_17_] = class527_sub1.anIntArray10332[i_17_];
				is_16_[i_17_] = class527_sub1.anIntArray10330[i_17_];
				if (null != class527_sub1.aClass18Array10335)
					class18s[i_17_] = class527_sub1.aClass18Array10335[i_17_];
			}
			for (int i_18_ = class527_sub1.anIntArray10332.length; i_18_ < i_12_; i_18_++) {
				is[i_18_] = -1;
				is_16_[i_18_] = 0;
			}
			class527_sub1.anIntArray10332 = is;
			class527_sub1.anIntArray10330 = is_16_;
			class527_sub1.aClass18Array10335 = class18s;
		}
		class527_sub1.anIntArray10332[i_12_] = i_13_;
		class527_sub1.anIntArray10330[i_12_] = i_14_;
		if (null != class18) {
			if (class527_sub1.aClass18Array10335 == null)
				class527_sub1.aClass18Array10335 = new Class18[class527_sub1.anIntArray10332.length];
			class527_sub1.aClass18Array10335[i_12_] = class18;
		} else if (null != class527_sub1.aClass18Array10335)
			class527_sub1.aClass18Array10335[i_12_] = null;
	}
}
