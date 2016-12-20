/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class Class492 {
	public int anInt5484;
	public int anInt5485;
	byte aByte5486;
	public int anInt5487;
	public int anInt5488;
	public int anInt5489;

	static Class18 method7983(RSByteBuffer class527_sub38, Class95_Sub1 class95_sub1) {
		Class18 class18 = new Class18(class95_sub1);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (255 == i)
				break;
			Class475 class475 = (Class475) Class516.method8610(com.jagex.Class475.class, i, (byte) 89);
			for (;;) {
				int i_0_ = class527_sub38.readUnsignedByte();
				if (255 == i_0_)
					break;
				class527_sub38.anInt10689 -= 1474750881;
				Class425 class425 = class95_sub1.method14484(class527_sub38, class475, (byte) 2);
				if (class425 != null)
					class18.method18(494563151 * class425.anInt4803, class425.anObject4804, 1212588214);
			}
		}
		return class18;
	}

	public int method7984() {
		return (aByte5486 & 0x8) == 8 ? 1 : 0;
	}

	public int method7985(int i) {
		return aByte5486 & 0x7;
	}

	public int method7986(int i) {
		return (aByte5486 & 0x8) == 8 ? 1 : 0;
	}

	static Class18 method7987(RSByteBuffer class527_sub38, Class95_Sub1 class95_sub1) {
		Class18 class18 = new Class18(class95_sub1);
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (255 == i)
				break;
			Class475 class475 = (Class475) Class516.method8610(com.jagex.Class475.class, i, (byte) 29);
			for (;;) {
				int i_1_ = class527_sub38.readUnsignedByte();
				if (255 == i_1_)
					break;
				class527_sub38.anInt10689 -= 1474750881;
				Class425 class425 = class95_sub1.method14484(class527_sub38, class475, (byte) 2);
				if (class425 != null)
					class18.method18(494563151 * class425.anInt4803, class425.anObject4804, 1127947718);
			}
		}
		return class18;
	}

	public Class492(RSByteBuffer class527_sub38, Class95_Sub1 class95_sub1) {
		aByte5486 = class527_sub38.readByte();
		anInt5485 = class527_sub38.readUnsignedShort() * -1832388077;
		anInt5489 = class527_sub38.readInt() * 2145080055;
		anInt5487 = class527_sub38.readInt() * 735973339;
		anInt5488 = class527_sub38.readInt() * -1199437369;
		anInt5484 = class527_sub38.readInt() * -1374845915;
		if (class95_sub1 != null)
			Class665.method11054(class527_sub38, class95_sub1, 1963070759);
	}

	public Class492() {
		/* empty */
	}

	public int method7988() {
		return (aByte5486 & 0x8) == 8 ? 1 : 0;
	}

	static final void method7989(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, 898321320);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class296.method5503(class243, class240, class665, ((Class627.aClass527_Sub21_8187 == class665.aClass527_Sub21_8537) ? Class237.aClass237_2383 : Class237.aClass237_2384), (byte) 1);
	}

	static final void method7990(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_3_ == -1 && i_4_ == -1)
			class243.aClass243_2588 = null;
		else
			class243.aClass243_2588 = Class447.method7260(i_3_, i_4_, 2064547939);
	}

	static final void method7991(Class665 class665, byte i) {
		Class574.method9626((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), (byte) 7);
	}

	static final void method7992(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub3_10605.method16860((byte) 0) ? 1 : 0;
	}

	static final void method7993(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_5_, 1822878551);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -2004765635 * class243.anInt2533;
	}

	public static void method7994(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		Class527_Sub2 class527_sub2 = null;
		for (Class527_Sub2 class527_sub2_13_ = ((Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) 20997)); null != class527_sub2_13_; class527_sub2_13_ = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534)) {
			if (class527_sub2_13_.anInt10348 * 1986250821 == i && 1182093437 * class527_sub2_13_.anInt10346 == i_6_ && class527_sub2_13_.anInt10345 * -677418425 == i_7_ && i_8_ == 966881501 * class527_sub2_13_.anInt10358) {
				class527_sub2 = class527_sub2_13_;
				break;
			}
		}
		if (null == class527_sub2) {
			class527_sub2 = new Class527_Sub2();
			class527_sub2.anInt10348 = 1876429453 * i;
			class527_sub2.anInt10358 = -136255627 * i_8_;
			class527_sub2.anInt10346 = i_6_ * -1468356395;
			class527_sub2.anInt10345 = 759242615 * i_7_;
			if (i_6_ >= 0 && i_7_ >= 0 && i_6_ < client.aClass509_11072.method8284((byte) 55) && i_7_ < client.aClass509_11072.method8285(-1805804451))
				Class154.method2536(class527_sub2, (byte) -36);
			Class527_Sub2.aClass694_10357.method14147(class527_sub2, -1060170333);
		}
		class527_sub2.anInt10351 = i_9_ * 283693689;
		class527_sub2.anInt10344 = 348777617 * i_10_;
		class527_sub2.anInt10352 = -1226239417 * i_11_;
		class527_sub2.aBool10355 = true;
		class527_sub2.aBool10356 = false;
	}

	public static Class563 method7995(Socket socket, int i, int i_14_) throws IOException {
		return new Class563_Sub1(socket, i);
	}

	static final void method7996(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_15_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_16_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_15_, -2085308340));
		if (i_16_ >= 1 && i_16_ <= 5 && class9.aStringArray102[i_16_ - 1] != null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class9.aStringArray102[i_16_ - 1];
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}
}
