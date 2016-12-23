/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class390 {
	public static Class390 aClass390_4048;
	public static Class390 aClass390_4049;
	public static Class390 aClass390_4050;
	public static Class390 aClass390_4051;
	public static Class390 aClass390_4052;
	public static Class390 aClass390_4053;
	public static Class390 aClass390_4054;
	public int anInt4055;
	public static Class390 aClass390_4056 = new Class390(1);
	public static Class390 aClass390_4057;
	public static Class390 aClass390_4058;
	public static Class390 aClass390_4059;

	static {
		aClass390_4049 = new Class390(2);
		aClass390_4059 = new Class390(2);
		aClass390_4051 = new Class390(2);
		aClass390_4052 = new Class390(1);
		aClass390_4053 = new Class390(1);
		aClass390_4050 = new Class390(1);
		aClass390_4054 = new Class390(2);
		aClass390_4048 = new Class390(1);
		aClass390_4057 = new Class390(2);
		aClass390_4058 = new Class390(1);
	}

	Class390(int i) {
		anInt4055 = 1792521559 * i;
	}

	public static Class398 method4854(RSByteBuffer class536_sub33, byte i) {
		int i_0_ = class536_sub33.readBigSmart((byte) 1);
		Class395 class395 = (Class333_Sub3.method9230(1586724215)[class536_sub33.readUnsignedByte()]);
		Class399 class399 = (Class266.method3692(878827744)[class536_sub33.readUnsignedByte()]);
		int i_1_ = class536_sub33.readShort((byte) -36);
		int i_2_ = class536_sub33.readShort((byte) -37);
		return new Class398(i_0_, class395, class399, i_1_, i_2_);
	}

	public static void method4855(Class282 class282, int i) {
		Class266.aClass282_2866 = class282;
	}

	static final void method4856(Class251 class251, Class234 class234, boolean bool, int i, Class668 class668, byte i_3_) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		if (class251.anInt2546 * -809980533 == -1 && !class234.aBool2379) {
			Class226.method3283(-1591767037 * class251.anInt2559, -103858361);
			Class294.method3975(class251.anInt2559 * -1591767037, (byte) -20);
			Class616.method7338(class251.anInt2559 * -1591767037, (byte) 119);
		}
		if (-1 == i_4_) {
			class251.anInt2601 = -1782707337;
			class251.anInt2602 = -1639447419;
			class251.anInt2711 = 180322533;
		} else {
			class251.anInt2711 = i_4_ * -180322533;
			class251.anInt2712 = -1232317485 * i_5_;
			class251.aBool2671 = bool;
			Class1 class1 = ((Class1) Class111.aClass34_Sub13_1391.method70(i_4_, (byte) -108));
			class251.anInt2551 = -1128581953 * class1.anInt54;
			class251.anInt2547 = -1144059129 * class1.anInt30;
			class251.anInt2609 = 497715903 * class1.anInt31;
			class251.anInt2658 = -626830593 * class1.anInt32;
			class251.anInt2606 = class1.anInt33 * 598613137;
			class251.anInt2613 = class1.anInt47 * -1637174665;
			class251.anInt2595 = i * -680399271;
			if (class251.anInt2614 * -555385111 > 0)
				class251.anInt2613 = (1235581280 * class251.anInt2613 / (-555385111 * class251.anInt2614) * -1926815261);
			else if (class251.anInt2569 * 101683265 > 0)
				class251.anInt2613 = (1235581280 * class251.anInt2613 / (101683265 * class251.anInt2569) * -1926815261);
		}
	}

	static final void method4857(int i) {
		int i_6_ = 256 + 48434688 * Class440.anInt4874;
		int i_7_ = Class606.anInt7898 * 1754388992 + 256;
		int i_8_ = (Class54.method944(i_6_, i_7_, -989431627 * Class320.anInt3539, 1540257398) - -1655704623 * Class653.anInt8491);
		if (Class234.anInt2381 * -1497935111 >= 100) {
			Class637.anInt8301 = Class440.anInt4874 * 1474287104 + -1330152192;
			Class685.anInt8665 = -1060159744 + Class606.anInt7898 * 724215296;
			Class205_Sub21.anInt9958 = (Class54.method944(-1607026219 * Class637.anInt8301, -1646092097 * Class685.anInt8665, -989431627 * Class320.anInt3539, 1977091344) - Class653.anInt8491 * -1655704623) * -300318539;
		} else {
			if (Class637.anInt8301 * -1607026219 < i_6_) {
				Class637.anInt8301 += (((i_6_ - -1607026219 * Class637.anInt8301) * (-1497935111 * Class234.anInt2381) / 1000) + 819919625 * Class584_Sub1.anInt10560) * 1420867453;
				if (Class637.anInt8301 * -1607026219 > i_6_)
					Class637.anInt8301 = 1420867453 * i_6_;
			}
			if (-1607026219 * Class637.anInt8301 > i_6_) {
				Class637.anInt8301 -= 1420867453 * (Class584_Sub1.anInt10560 * 819919625 + (-1497935111 * Class234.anInt2381 * (-1607026219 * Class637.anInt8301 - i_6_) / 1000));
				if (-1607026219 * Class637.anInt8301 < i_6_)
					Class637.anInt8301 = 1420867453 * i_6_;
			}
			if (Class205_Sub21.anInt9958 * -1598853731 < i_8_) {
				Class205_Sub21.anInt9958 += ((Class234.anInt2381 * -1497935111 * (i_8_ - -1598853731 * Class205_Sub21.anInt9958) / 1000) + 819919625 * Class584_Sub1.anInt10560) * -300318539;
				if (Class205_Sub21.anInt9958 * -1598853731 > i_8_)
					Class205_Sub21.anInt9958 = i_8_ * -300318539;
			}
			if (Class205_Sub21.anInt9958 * -1598853731 > i_8_) {
				Class205_Sub21.anInt9958 -= (819919625 * Class584_Sub1.anInt10560 + (Class234.anInt2381 * -1497935111 * (Class205_Sub21.anInt9958 * -1598853731 - i_8_) / 1000)) * -300318539;
				if (-1598853731 * Class205_Sub21.anInt9958 < i_8_)
					Class205_Sub21.anInt9958 = -300318539 * i_8_;
			}
			if (Class685.anInt8665 * -1646092097 < i_7_) {
				Class685.anInt8665 += (717279039 * (819919625 * Class584_Sub1.anInt10560 + ((i_7_ - -1646092097 * Class685.anInt8665) * (Class234.anInt2381 * -1497935111) / 1000)));
				if (Class685.anInt8665 * -1646092097 > i_7_)
					Class685.anInt8665 = 717279039 * i_7_;
			}
			if (Class685.anInt8665 * -1646092097 > i_7_) {
				Class685.anInt8665 -= (717279039 * ((-1497935111 * Class234.anInt2381 * (Class685.anInt8665 * -1646092097 - i_7_) / 1000) + Class584_Sub1.anInt10560 * 819919625));
				if (Class685.anInt8665 * -1646092097 < i_7_)
					Class685.anInt8665 = 717279039 * i_7_;
			}
		}
		i_6_ = 256 + Class438.anInt4868 * -590130688;
		i_7_ = Class550.anInt7412 * -28297728 + 256;
		i_8_ = (Class54.method944(i_6_, i_7_, -989431627 * Class320.anInt3539, 2095566403) - -565938271 * Class184_Sub6.anInt9934);
		int i_9_ = i_6_ - -1607026219 * Class637.anInt8301;
		int i_10_ = i_8_ - Class205_Sub21.anInt9958 * -1598853731;
		int i_11_ = i_7_ - -1646092097 * Class685.anInt8665;
		int i_12_ = (int) Math.sqrt((double) (i_11_ * i_11_ + i_9_ * i_9_));
		int i_13_ = ((int) (Math.atan2((double) i_10_, (double) i_12_) * 2607.5945876176133) & 0x3fff);
		int i_14_ = ((int) (Math.atan2((double) i_9_, (double) i_11_) * -2607.5945876176133) & 0x3fff);
		if (i_13_ < 1024)
			i_13_ = 1024;
		if (i_13_ > 3072)
			i_13_ = 3072;
		if (62800801 * Class141.anInt1658 < i_13_) {
			Class141.anInt1658 += 269246561 * ((-699510373 * Class460_Sub1.anInt10291 * (i_13_ - 62800801 * Class141.anInt1658 >> 3) / 1000) + 1604835643 * Class593.anInt7811 << 3);
			if (62800801 * Class141.anInt1658 > i_13_)
				Class141.anInt1658 = 269246561 * i_13_;
		}
		if (Class141.anInt1658 * 62800801 > i_13_) {
			Class141.anInt1658 -= (269246561 * ((1604835643 * Class593.anInt7811 + ((62800801 * Class141.anInt1658 - i_13_ >> 3) * (Class460_Sub1.anInt10291 * -699510373) / 1000)) << 3));
			if (62800801 * Class141.anInt1658 < i_13_)
				Class141.anInt1658 = 269246561 * i_13_;
		}
		int i_15_ = i_14_ - 158223895 * Class144.anInt1681;
		if (i_15_ > 8192)
			i_15_ -= 16384;
		if (i_15_ < -8192)
			i_15_ += 16384;
		i_15_ >>= 3;
		if (i_15_ > 0) {
			Class144.anInt1681 += 402508199 * ((Class460_Sub1.anInt10291 * -699510373 * i_15_ / 1000) + Class593.anInt7811 * 1604835643 << 3);
			Class144.anInt1681 = (158223895 * Class144.anInt1681 & 0x3fff) * 402508199;
		}
		if (i_15_ < 0) {
			Class144.anInt1681 -= 402508199 * ((-699510373 * Class460_Sub1.anInt10291 * -i_15_ / 1000) + 1604835643 * Class593.anInt7811 << 3);
			Class144.anInt1681 = 402508199 * (Class144.anInt1681 * 158223895 & 0x3fff);
		}
		int i_16_ = i_14_ - 158223895 * Class144.anInt1681;
		if (i_16_ > 8192)
			i_16_ -= 16384;
		if (i_16_ < -8192)
			i_16_ += 16384;
		if (i_16_ < 0 && i_15_ > 0 || i_16_ > 0 && i_15_ < 0)
			Class144.anInt1681 = 402508199 * i_14_;
		Class304.anInt3440 = 0;
	}

	public static void method4858(Class570 class570, int i, int i_17_, Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i_18_, int i_19_) {
		Class668 class668 = Class586.method7063((byte) 5);
		class668.aClass649_Sub1_Sub5_Sub1_8554 = class649_sub1_sub5_sub1;
		class668.anInt8560 = 404228879 * i_18_;
		Class57.method970(class570, i, i_17_, class668, -1944139963);
		class668.aClass649_Sub1_Sub5_Sub1_8554 = null;
		class668.anInt8560 = -404228879;
	}

	static final void method4859(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class307.anInt3454 * -1061117261;
	}
}
