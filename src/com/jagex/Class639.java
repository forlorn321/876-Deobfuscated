/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class639 {
	static int anInt8306;
	static int anInt8307 = 0;
	public static int[] anIntArray8308;
	public static int[] anIntArray8309;
	public static int[] anIntArray8310;

	public static final int method7652(int i, int i_0_, int i_1_) {
		if (i_1_ > 243)
			i_0_ >>= 4;
		else if (i_1_ > 217)
			i_0_ >>= 3;
		else if (i_1_ > 192)
			i_0_ >>= 2;
		else if (i_1_ > 179)
			i_0_ >>= 1;
		return ((i & 0xff) >> 2 << 10) + (i_0_ >> 5 << 7) + (i_1_ >> 1);
	}

	static {
		anInt8306 = 0;
	}

	public static int method7653(int i, int i_2_) {
		i_2_ = i_2_ * (i & 0x7f) >> 7;
		if (i_2_ < 2)
			i_2_ = 2;
		else if (i_2_ > 126)
			i_2_ = 126;
		return (i & 0xff80) + i_2_;
	}

	Class639() throws Throwable {
		throw new Error();
	}

	static void method7654() {
		if (anIntArray8309 == null) {
			anIntArray8309 = new int[65536];
			anIntArray8310 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_3_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_4_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
				double d_5_ = (double) (i & 0x7f) / 128.0;
				double d_6_ = d_5_;
				double d_7_ = d_5_;
				double d_8_ = d_5_;
				if (0.0 != d_4_) {
					double d_9_;
					if (d_5_ < 0.5)
						d_9_ = d_5_ * (1.0 + d_4_);
					else
						d_9_ = d_4_ + d_5_ - d_4_ * d_5_;
					double d_10_ = 2.0 * d_5_ - d_9_;
					double d_11_ = 0.3333333333333333 + d_3_;
					if (d_11_ > 1.0)
						d_11_--;
					double d_12_ = d_3_;
					double d_13_ = d_3_ - 0.3333333333333333;
					if (d_13_ < 0.0)
						d_13_++;
					if (6.0 * d_11_ < 1.0)
						d_6_ = d_11_ * (6.0 * (d_9_ - d_10_)) + d_10_;
					else if (d_11_ * 2.0 < 1.0)
						d_6_ = d_9_;
					else if (3.0 * d_11_ < 2.0)
						d_6_ = d_10_ + 6.0 * ((d_9_ - d_10_) * (0.6666666666666666 - d_11_));
					else
						d_6_ = d_10_;
					if (6.0 * d_12_ < 1.0)
						d_7_ = d_12_ * ((d_9_ - d_10_) * 6.0) + d_10_;
					else if (d_12_ * 2.0 < 1.0)
						d_7_ = d_9_;
					else if (3.0 * d_12_ < 2.0)
						d_7_ = d_10_ + ((d_9_ - d_10_) * (0.6666666666666666 - d_12_) * 6.0);
					else
						d_7_ = d_10_;
					if (d_13_ * 6.0 < 1.0)
						d_8_ = d_10_ + (d_9_ - d_10_) * 6.0 * d_13_;
					else if (2.0 * d_13_ < 1.0)
						d_8_ = d_9_;
					else if (d_13_ * 3.0 < 2.0)
						d_8_ = d_10_ + 6.0 * ((0.6666666666666666 - d_13_) * (d_9_ - d_10_));
					else
						d_8_ = d_10_;
				}
				d_6_ = Math.pow(d_6_, d);
				d_7_ = Math.pow(d_7_, d);
				d_8_ = Math.pow(d_8_, d);
				int i_14_ = (int) (d_6_ * 256.0);
				int i_15_ = (int) (256.0 * d_7_);
				int i_16_ = (int) (d_8_ * 256.0);
				int i_17_ = (i_15_ << 8) + (i_14_ << 16) + i_16_;
				anIntArray8309[i] = i_17_ & 0xffffff;
				int i_18_ = i_14_ + ((i_16_ << 16) + (i_15_ << 8));
				anIntArray8310[i] = i_18_;
			}
		}
	}

	static void method7655() {
		if (anIntArray8309 == null) {
			anIntArray8309 = new int[65536];
			anIntArray8310 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_19_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
				double d_20_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
				double d_21_ = (double) (i & 0x7f) / 128.0;
				double d_22_ = d_21_;
				double d_23_ = d_21_;
				double d_24_ = d_21_;
				if (0.0 != d_20_) {
					double d_25_;
					if (d_21_ < 0.5)
						d_25_ = d_21_ * (1.0 + d_20_);
					else
						d_25_ = d_20_ + d_21_ - d_20_ * d_21_;
					double d_26_ = 2.0 * d_21_ - d_25_;
					double d_27_ = 0.3333333333333333 + d_19_;
					if (d_27_ > 1.0)
						d_27_--;
					double d_28_ = d_19_;
					double d_29_ = d_19_ - 0.3333333333333333;
					if (d_29_ < 0.0)
						d_29_++;
					if (6.0 * d_27_ < 1.0)
						d_22_ = d_27_ * (6.0 * (d_25_ - d_26_)) + d_26_;
					else if (d_27_ * 2.0 < 1.0)
						d_22_ = d_25_;
					else if (3.0 * d_27_ < 2.0)
						d_22_ = d_26_ + 6.0 * ((d_25_ - d_26_) * (0.6666666666666666 - d_27_));
					else
						d_22_ = d_26_;
					if (6.0 * d_28_ < 1.0)
						d_23_ = d_28_ * ((d_25_ - d_26_) * 6.0) + d_26_;
					else if (d_28_ * 2.0 < 1.0)
						d_23_ = d_25_;
					else if (3.0 * d_28_ < 2.0)
						d_23_ = d_26_ + ((d_25_ - d_26_) * (0.6666666666666666 - d_28_) * 6.0);
					else
						d_23_ = d_26_;
					if (d_29_ * 6.0 < 1.0)
						d_24_ = d_26_ + (d_25_ - d_26_) * 6.0 * d_29_;
					else if (2.0 * d_29_ < 1.0)
						d_24_ = d_25_;
					else if (d_29_ * 3.0 < 2.0)
						d_24_ = d_26_ + 6.0 * ((0.6666666666666666 - d_29_) * (d_25_ - d_26_));
					else
						d_24_ = d_26_;
				}
				d_22_ = Math.pow(d_22_, d);
				d_23_ = Math.pow(d_23_, d);
				d_24_ = Math.pow(d_24_, d);
				int i_30_ = (int) (d_22_ * 256.0);
				int i_31_ = (int) (256.0 * d_23_);
				int i_32_ = (int) (d_24_ * 256.0);
				int i_33_ = (i_31_ << 8) + (i_30_ << 16) + i_32_;
				anIntArray8309[i] = i_33_ & 0xffffff;
				int i_34_ = i_30_ + ((i_32_ << 16) + (i_31_ << 8));
				anIntArray8310[i] = i_34_;
			}
		}
	}

	public static int method7656(int i, int i_35_) {
		i_35_ = i_35_ * (i & 0x7f) >> 7;
		if (i_35_ < 2)
			i_35_ = 2;
		else if (i_35_ > 126)
			i_35_ = 126;
		return (i & 0xff80) + i_35_;
	}

	public static final int method7657(int i, int i_36_) {
		if (-1 == i)
			return 12345678;
		i_36_ = (i & 0x7f) * i_36_ >> 7;
		if (i_36_ < 2)
			i_36_ = 2;
		else if (i_36_ > 126)
			i_36_ = 126;
		return (i & 0xff80) + i_36_;
	}

	public static int method7658(int i, int i_37_) {
		i_37_ = i_37_ * (i & 0x7f) >> 7;
		if (i_37_ < 2)
			i_37_ = 2;
		else if (i_37_ > 126)
			i_37_ = 126;
		return (i & 0xff80) + i_37_;
	}

	public static int method7659(int i, int i_38_, int i_39_) {
		int i_40_ = 255 - i_39_;
		i_38_ = (i_39_ * (i_38_ & 0xff00ff) & ~0xff00ff | (i_38_ & 0xff00) * i_39_ & 0xff0000) >>> 8;
		return i_38_ + (((i & 0xff00ff) * i_40_ & ~0xff00ff | (i & 0xff00) * i_40_ & 0xff0000) >>> 8);
	}

	public static int method7660(int i, int i_41_) {
		int i_42_ = i_41_ >>> 24;
		int i_43_ = 255 - i_42_;
		i_41_ = ((i_41_ & 0xff00ff) * i_42_ & ~0xff00ff | i_42_ * (i_41_ & 0xff00) & 0xff0000) >>> 8;
		return i_41_ + ((i_43_ * (i & 0xff00ff) & ~0xff00ff | i_43_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static final int method7661(int i, int i_44_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_44_ < 2)
				i_44_ = 2;
			else if (i_44_ > 126)
				i_44_ = 126;
			return i_44_;
		}
		i_44_ = i_44_ * (i & 0x7f) >> 7;
		if (i_44_ < 2)
			i_44_ = 2;
		else if (i_44_ > 126)
			i_44_ = 126;
		return (i & 0xff80) + i_44_;
	}

	static final void method7662(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class395.method4881(class251, class234, class668, -537711627);
	}

	static final void method7663(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.transparency * 1425974027;
	}

	public static String method7664(CharSequence charsequence, byte i) {
		String string = Class637.method7643(Class324.method4275(charsequence, -1917116704));
		if (null == string)
			string = "";
		return string;
	}

	static final void method7665(Class668 class668, short i) {
		class668.anInt8542 -= 61855783;
		int i_45_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		boolean bool = (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542] == 1);
		int i_46_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 2];
		Class222 class222 = Class63.aClass226_717.method3227(i_45_, -781094290);
		if (class222.method3128(1533558183) == null)
			class222.method3143(client.anInterface28_11049, -2017811838);
		if (bool) {
			Class153_Sub1 class153_sub1 = ((Class153_Sub1) Class532.aClass98_Sub1_Sub1_7122.method70(i_46_, (byte) -48));
			switch (class153_sub1.aClass453_1716.aClass478_5077.anInt5383 * -1645921193) {
			case 3:
				class668.aLongArray8565[(class668.anInt8546 += 1792517805) * 1346022693 - 1] = class222.method3128(230801881).method23((-1786401803 * (class153_sub1.anInt1715)), (byte) 18);
				break;
			default:
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class222.method3128(904444317).method17(((class153_sub1.anInt1715) * -1786401803), 2080311311);
				break;
			case 0:
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class222.method3128(1028118135).method32(((class153_sub1.anInt1715) * -1786401803), -1917471938);
			}
		} else {
			Class324 class324 = ((Class324) Class56.aClass34_Sub14_608.method70(i_46_, (byte) -15));
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class324.method4263((class222.method3128(-1914608738).method32((class324.aClass153_3555.anInt1715 * -1786401803), -1258263599)), (byte) 12);
		}
	}

	static final void method7666(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aBool3724 ? 1 : 0;
	}

	static void method7667(int i, int i_47_, short i_48_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(5, (long) i);
		class536_sub18_sub5.method10659(1922149536);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_47_;
	}
}
