/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class220 implements Interface42 {
	Class226 this$0;

	public float method279() {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10635.method17139((byte) -11) / 255.0F);
	}

	public float method278(int i) {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10635.method17139((byte) 92) / 255.0F);
	}

	Class220(Class226 class226) {
		this$0 = class226;
	}

	public static int method4068(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static final void method4069(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -1310500612);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class468.method7688(class243, class240, class665, 1963630269);
	}

	static final void method4070(Class665 class665, byte i) {
		class665.anInt8528 -= 1299028551;
		Class208.method3859((String) (class665.anObjectArray8541[318492261 * class665.anInt8528]), (String) (class665.anObjectArray8541[1 + class665.anInt8528 * 318492261]), (String) (class665.anObjectArray8541[class665.anInt8528 * 318492261 + 2]), ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1), true, -214974882);
	}

	static void method4071(Class527_Sub38_Sub2 class527_sub38_sub2, int i, int i_1_) {
		Class592 class592 = client.aClass509_11072.method8283((short) 18279);
		boolean bool = class527_sub38_sub2.method18469(1, -18014817) == 1;
		if (bool)
			Class105.anIntArray1306[(Class105.anInt1294 += -1816171541) * -673487677 - 1] = i;
		int i_2_ = class527_sub38_sub2.method18469(2, 810204476);
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (i_2_ == 0) {
			if (!bool) {
				if (client.anInt11070 * -899375681 == i)
					throw new RuntimeException();
				Class47 class47 = Class105.aClass47Array1296[i] = new Class47();
				Class679.method13904(673878859);
				class47.anInt497 = ((class640_sub1_sub2_sub1_sub2.aByte10864 << 28) + ((153371143 * class592.anInt7798 + class640_sub1_sub2_sub1_sub2.anIntArray11902[0]) >> 6 << 14) + ((class592.anInt7799 * -2029646807 + class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) >> 6)) * 224559645;
				if (-1 != class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047)
					class47.anInt496 = 712889473 * class640_sub1_sub2_sub1_sub2.anInt12178;
				else
					class47.anInt496 = class640_sub1_sub2_sub1_sub2.aClass61_11936.method1384((byte) 1) * -1598101049;
				class47.anInt495 = class640_sub1_sub2_sub1_sub2.anInt11910 * -17829839;
				class47.aClass210_498 = class640_sub1_sub2_sub1_sub2.aClass210_12185;
				class47.aBool499 = class640_sub1_sub2_sub1_sub2.aBool12180;
				if (class640_sub1_sub2_sub1_sub2.anInt12197 * 17034299 > 0)
					Class608.method10087(class640_sub1_sub2_sub1_sub2, 1789995548);
				client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
				if (class527_sub38_sub2.method18469(1, 750999352) != 0)
					Class522_Sub6.method15992(class527_sub38_sub2, i, 371006250);
			}
		} else if (1 == i_2_) {
			int i_3_ = class527_sub38_sub2.method18469(3, -129156353);
			int i_4_ = class527_sub38_sub2.method18469(1, -644815371);
			int i_5_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_6_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (1 == i_4_) {
				Class105.aByteArray1299[i] = Class679.aClass679_8623.aByte8627;
				int i_7_ = class527_sub38_sub2.method18469(2, -994219196);
				switch (i_7_) {
				case 3:
					class640_sub1_sub2_sub1_sub2.method18878(i_5_, i_6_ - 1, (Class105.aByteArray1299[i]), (byte) -17);
					break;
				case 1:
					class640_sub1_sub2_sub1_sub2.method18878(i_5_ - 1, i_6_, (Class105.aByteArray1299[i]), (byte) -21);
					break;
				case 2:
					class640_sub1_sub2_sub1_sub2.method18878(i_5_ + 1, i_6_, (Class105.aByteArray1299[i]), (byte) -30);
					break;
				case 0:
					class640_sub1_sub2_sub1_sub2.method18878(i_5_, 1 + i_6_, (Class105.aByteArray1299[i]), (byte) -124);
					break;
				}
			}
			if (0 == i_3_) {
				i_5_--;
				i_6_--;
			} else if (i_3_ == 1)
				i_6_--;
			else if (i_3_ == 2) {
				i_5_++;
				i_6_--;
			} else if (3 == i_3_)
				i_5_--;
			else if (i_3_ == 4)
				i_5_++;
			else if (5 == i_3_) {
				i_5_--;
				i_6_++;
			} else if (6 == i_3_)
				i_6_++;
			else if (7 == i_3_) {
				i_5_++;
				i_6_++;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_5_, i_6_, (Class105.aByteArray1299[i]), (byte) -123);
		} else if (2 == i_2_) {
			int i_8_ = class527_sub38_sub2.method18469(4, -1742399342);
			int i_9_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_10_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (0 == i_8_) {
				i_9_ -= 2;
				i_10_ -= 2;
			} else if (1 == i_8_) {
				i_9_--;
				i_10_ -= 2;
			} else if (2 == i_8_)
				i_10_ -= 2;
			else if (i_8_ == 3) {
				i_9_++;
				i_10_ -= 2;
			} else if (4 == i_8_) {
				i_9_ += 2;
				i_10_ -= 2;
			} else if (i_8_ == 5) {
				i_9_ -= 2;
				i_10_--;
			} else if (6 == i_8_) {
				i_9_ += 2;
				i_10_--;
			} else if (i_8_ == 7)
				i_9_ -= 2;
			else if (8 == i_8_)
				i_9_ += 2;
			else if (i_8_ == 9) {
				i_9_ -= 2;
				i_10_++;
			} else if (10 == i_8_) {
				i_9_ += 2;
				i_10_++;
			} else if (11 == i_8_) {
				i_9_ -= 2;
				i_10_ += 2;
			} else if (12 == i_8_) {
				i_9_--;
				i_10_ += 2;
			} else if (i_8_ == 13)
				i_10_ += 2;
			else if (14 == i_8_) {
				i_9_++;
				i_10_ += 2;
			} else if (i_8_ == 15) {
				i_9_ += 2;
				i_10_ += 2;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_9_, i_10_, (Class105.aByteArray1299[i]), (byte) -124);
		} else {
			int i_11_ = class527_sub38_sub2.method18469(1, 1541143606);
			if (0 == i_11_) {
				int i_12_ = class527_sub38_sub2.method18469(15, 829100687);
				int i_13_ = i_12_ >> 12 & 0x7;
				int i_14_ = (byte) (i_12_ >> 10) & 0x3;
				int i_15_ = i_12_ >> 5 & 0x1f;
				if (i_15_ > 15)
					i_15_ -= 32;
				int i_16_ = i_12_ & 0x1f;
				if (i_16_ > 15)
					i_16_ -= 32;
				int i_17_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + i_15_;
				int i_18_ = i_16_ + class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
				if (i_13_ == Class679.aClass679_8621.anInt8624 * -996176747)
					class640_sub1_sub2_sub1_sub2.method18886(i_17_, i_18_, -459676858);
				else {
					Class105.aByteArray1299[i] = (byte) (i_13_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_17_, i_18_, (Class105.aByteArray1299[i]), (byte) -125);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (class640_sub1_sub2_sub1_sub2.aByte10864 + i_14_ & 0x3);
				if (client.aClass509_11072.method8359(1584141474).method7706(i_17_, i_18_, (short) -2418))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i && (Class673.anInt8585 * 162317215 != class640_sub1_sub2_sub1_sub2.aByte10864))
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			} else {
				int i_19_ = class527_sub38_sub2.method18469(3, 1208183081);
				int i_20_ = class527_sub38_sub2.method18469(30, -1572423879);
				int i_21_ = i_20_ >> 28 & 0x3;
				int i_22_ = i_20_ >> 14 & 0x3fff;
				int i_23_ = i_20_ & 0x3fff;
				int i_24_ = (((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + 153371143 * class592.anInt7798 + i_22_) & 0x3fff) - 153371143 * class592.anInt7798);
				int i_25_ = (i_23_ + (class640_sub1_sub2_sub1_sub2.anIntArray11944[0] + -2029646807 * class592.anInt7799) & 0x3fff) - -2029646807 * class592.anInt7799;
				if (-996176747 * Class679.aClass679_8621.anInt8624 == i_19_)
					class640_sub1_sub2_sub1_sub2.method18886(i_24_, i_25_, 328148756);
				else {
					Class105.aByteArray1299[i] = (byte) (i_19_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_24_, i_25_, (Class105.aByteArray1299[i]), (byte) -93);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (i_21_ + class640_sub1_sub2_sub1_sub2.aByte10864 & 0x3);
				if (client.aClass509_11072.method8359(1799641620).method7706(i_24_, i_25_, (short) -8613))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i)
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			}
		}
	}
}
