/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class637 {
	int anInt8296;
	Class708 aClass708_8297 = new Class708();
	long aLong8298;
	long aLong8299 = 1062840532039316127L;
	int anInt8300;
	public static int anInt8301;

	abstract void method7624(int i);

	void method7625(short i) {
		if (method7632((byte) 0)) {
			Class536_Sub23 class536_sub23 = null;
			int i_0_ = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			Iterator iterator = aClass708_8297.iterator();
			while (iterator.hasNext()) {
				Class536_Sub31 class536_sub31 = (Class536_Sub31) iterator.next();
				if (null != class536_sub23 && (-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_0_ >= 252 - (6 + method7629(1030757703))))
					break;
				class536_sub31.method6484(1868837382);
				int i_3_ = class536_sub31.method9643((byte) 1);
				if (i_3_ < -1)
					i_3_ = -1;
				else if (i_3_ > 65534)
					i_3_ = 65534;
				int i_4_ = class536_sub31.method9647(-1923481374);
				if (i_4_ < -1)
					i_4_ = -1;
				else if (i_4_ > 65534)
					i_4_ = 65534;
				if (378418169 * anInt8296 == i_4_ && i_3_ == anInt8300 * -740264383)
					class536_sub31.method9641(-1403836927);
				else {
					if (class536_sub23 == null) {
						class536_sub23 = method7633(1875354728);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0, 465637339);
						i_0_ = -810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off);
						class536_sub23.aClass536_Sub33_Sub2_10528.off += 1032351030;
						i_1_ = 0;
						i_2_ = 0;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					if (1257646413264406655L * aLong8298 != -1L) {
						i_5_ = i_4_ - anInt8296 * 378418169;
						i_6_ = i_3_ - anInt8300 * -740264383;
						i_7_ = (int) ((class536_sub31.method9645((byte) -54) - 1257646413264406655L * aLong8298) / 20L);
						i_1_ += (class536_sub31.method9645((byte) -45) - 1257646413264406655L * aLong8298) % 20L;
					} else {
						i_5_ = i_4_;
						i_6_ = i_3_;
						i_7_ = 2147483647;
					}
					anInt8296 = -1053024695 * i_4_;
					anInt8300 = i_3_ * 2056952257;
					if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32 && i_6_ <= 31) {
						i_5_ += 32;
						i_6_ += 32;
						class536_sub23.aClass536_Sub33_Sub2_10528.writeShort((i_5_ << 6) + (i_7_ << 12) + i_6_, -1778059594);
					} else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127 && i_6_ >= -128 && i_6_ <= 127) {
						i_5_ += 128;
						i_6_ += 128;
						class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(128 + i_7_, 465637339);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(i_6_ + (i_5_ << 8), -1778059594);
					} else if (i_7_ < 32) {
						class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_7_ + 192, 465637339);
						if (i_4_ == -1 || -1 == i_3_)
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(-2147483648, -149241618);
						else
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i_4_ | i_3_ << 16, -149241618);
					} else {
						class536_sub23.aClass536_Sub33_Sub2_10528.writeShort((i_7_ & 0x1fff) + 57344, -1778059594);
						if (i_4_ == -1 || i_3_ == -1)
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(-2147483648, -149241618);
						else
							class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i_4_ | i_3_ << 16, -149241618);
					}
					i_2_++;
					method7627(class536_sub23.aClass536_Sub33_Sub2_10528, class536_sub31, -82248126);
					aLong8298 = (class536_sub31.method9645((byte) -74) * -8003679466240051329L);
					class536_sub31.method9641(-2099117372);
				}
			}
			if (class536_sub23 != null) {
				class536_sub23.aClass536_Sub33_Sub2_10528.method9699(-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_0_, 1446927489);
				int i_8_ = (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off);
				class536_sub23.aClass536_Sub33_Sub2_10528.off = i_0_ * 516175515;
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_1_ / i_2_, 465637339);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_1_ % i_2_, 465637339);
				class536_sub23.aClass536_Sub33_Sub2_10528.off = i_8_ * 516175515;
				client.aClass106_11322.method1409(class536_sub23, 1389331639);
			}
		}
		method7624(369851848);
	}

	void method7626(int i) {
		aClass708_8297.method8304(454036827);
		aLong8299 = 1062840532039316127L;
		aLong8298 = 8003679466240051329L;
		anInt8296 = 1053024695;
		anInt8300 = -2056952257;
	}

	abstract void method7627(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31, int i);

	int method7628(Class536_Sub31 class536_sub31, int i, int i_9_) {
		long l;
		if (aLong8299 * 2729456374420379297L == -1L)
			l = (long) i;
		else {
			l = (class536_sub31.method9645((byte) 38) - 2729456374420379297L * aLong8299);
			if (l > (long) i)
				l = (long) i;
		}
		aLong8299 = class536_sub31.method9645((byte) -1) * -1062840532039316127L;
		return (int) l;
	}

	abstract int method7629(int i);

	void method7630() {
		aClass708_8297.method8304(454036827);
		aLong8299 = 1062840532039316127L;
		aLong8298 = 8003679466240051329L;
		anInt8296 = 1053024695;
		anInt8300 = -2056952257;
	}

	abstract void method7631();

	abstract boolean method7632(byte i);

	abstract Class536_Sub23 method7633(int i);

	Class637() {
		aLong8298 = 8003679466240051329L;
		anInt8296 = 1053024695;
		anInt8300 = -2056952257;
	}

	abstract Class536_Sub23 method7634();

	abstract int method7635();

	abstract void method7636(RSByteBuffer class536_sub33, Class536_Sub31 class536_sub31);

	void method7637() {
		aClass708_8297.method8304(454036827);
		aLong8299 = 1062840532039316127L;
		aLong8298 = 8003679466240051329L;
		anInt8296 = 1053024695;
		anInt8300 = -2056952257;
	}

	void method7638() {
		aClass708_8297.method8304(454036827);
		aLong8299 = 1062840532039316127L;
		aLong8298 = 8003679466240051329L;
		anInt8296 = 1053024695;
		anInt8300 = -2056952257;
	}

	abstract boolean method7639();

	void method7640(Class536_Sub31 class536_sub31, int i) {
		aClass708_8297.method8335(class536_sub31, -2087982194);
	}

	static final void method7641(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static int method7642(CharSequence charsequence, char c, byte i) {
		int i_10_ = 0;
		int i_11_ = charsequence.length();
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			if (charsequence.charAt(i_12_) == c)
				i_10_++;
		}
		return i_10_;
	}

	static String method7643(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_13_ = l; l_13_ != 0L; l_13_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_14_ = l;
			l /= 37L;
			char c = Class673.aCharArray8581[(int) (l_14_ - l * 37L)];
			if ('_' == c) {
				int i_15_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_15_, Character.toUpperCase(stringbuilder.charAt(i_15_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}
}
