/* Class208_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub16 extends Class208 {
	int anInt9938;
	int anInt9939;
	int anInt9940;
	int anInt9941;
	int anInt9942;
	int anInt9943;

	Class208_Sub16(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9943 = class527_sub38.readUnsignedShort() * 549681251;
		anInt9938 = class527_sub38.readUnsignedShort() * -74343627;
		anInt9940 = class527_sub38.readUnsignedShort() * 1637558709;
		anInt9941 = class527_sub38.readUnsignedShort() * 99296169;
		anInt9942 = class527_sub38.readUnsignedShort() * -965241161;
		anInt9939 = class527_sub38.readUnsignedShort() * 272595725;
	}

	public void method3848() {
		Class209.aClass191Array2242[-455947957 * anInt9943].method3681(0, -813958624);
		Class209.aClass191Array2242[anInt9938 * 1151213341].method3681(1, 170702417);
		client.anInt11124 = 0;
		client.anInt11126 = anInt9940 * -241435483;
		client.anInt11128 = 0;
		client.anInt11033 = 306268821 * anInt9942;
		client.anInt11130 = -1375208231 * anInt9939;
		client.anInt11125 = -1118587303;
		client.anInt11079 = 1236715043 * anInt9941;
		Class30.anInt265 = 1160590772;
		Class657.method11007(39159280);
		client.aBool11081 = true;
	}

	public void method3846(int i) {
		Class209.aClass191Array2242[-455947957 * anInt9943].method3681(0, -590886332);
		Class209.aClass191Array2242[anInt9938 * 1151213341].method3681(1, -1869014425);
		client.anInt11124 = 0;
		client.anInt11126 = anInt9940 * -241435483;
		client.anInt11128 = 0;
		client.anInt11033 = 306268821 * anInt9942;
		client.anInt11130 = -1375208231 * anInt9939;
		client.anInt11125 = -1118587303;
		client.anInt11079 = 1236715043 * anInt9941;
		Class30.anInt265 = 1160590772;
		Class657.method11007(39159280);
		client.aBool11081 = true;
	}

	public void method3851() {
		Class209.aClass191Array2242[-455947957 * anInt9943].method3681(0, -367210844);
		Class209.aClass191Array2242[anInt9938 * 1151213341].method3681(1, -68172395);
		client.anInt11124 = 0;
		client.anInt11126 = anInt9940 * -241435483;
		client.anInt11128 = 0;
		client.anInt11033 = 306268821 * anInt9942;
		client.anInt11130 = -1375208231 * anInt9939;
		client.anInt11125 = -1118587303;
		client.anInt11079 = 1236715043 * anInt9941;
		Class30.anInt265 = 1160590772;
		Class657.method11007(39159280);
		client.aBool11081 = true;
	}

	static final void method15626(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub32_10620.method14289(i_0_, 2015729810);
	}

	static final void method15627(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i) {
		if (null != class640_sub1_sub2_sub1.anIntArray11911 || null != class640_sub1_sub2_sub1.anIntArray11935) {
			boolean bool = true;
			Class592 class592 = client.aClass509_11072.method8283((short) 12884);
			for (int i_1_ = 0; i_1_ < class640_sub1_sub2_sub1.anIntArray11911.length; i_1_++) {
				int i_2_ = -1;
				if (class640_sub1_sub2_sub1.anIntArray11911 != null)
					i_2_ = class640_sub1_sub2_sub1.anIntArray11911[i_1_];
				if (i_2_ == -1) {
					if (!class640_sub1_sub2_sub1.method18531(i_1_, -1, -517380721))
						bool = false;
				} else {
					bool = false;
					boolean bool_3_ = false;
					boolean bool_4_ = false;
					Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
					int i_5_;
					int i_6_;
					if (-1073741824 == (i_2_ & ~0x3fffffff)) {
						int i_7_ = i_2_ & 0xfffffff;
						int i_8_ = i_7_ >> 14;
						int i_9_ = i_7_ & 0x3fff;
						i_5_ = ((int) class442.aFloat4918 - (512 * (i_8_ - 153371143 * class592.anInt7798) + 256));
						i_6_ = ((int) class442.aFloat4919 - (512 * (i_9_ - -2029646807 * class592.anInt7799) + 256));
					} else if (0 != (i_2_ & 0x8000)) {
						int i_10_ = i_2_ & 0x7fff;
						Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_10_]);
						if (class640_sub1_sub2_sub1_sub2 != null) {
							Class442 class442_11_ = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
							i_5_ = ((int) class442.aFloat4918 - (int) class442_11_.aFloat4918);
							i_6_ = ((int) class442.aFloat4919 - (int) class442_11_.aFloat4919);
						} else {
							class640_sub1_sub2_sub1.method18531(i_1_, -1, 2114604652);
							continue;
						}
					} else {
						Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_2_));
						if (class527_sub26 != null) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
							Class442 class442_12_ = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
							i_5_ = ((int) class442.aFloat4918 - (int) class442_12_.aFloat4918);
							i_6_ = ((int) class442.aFloat4919 - (int) class442_12_.aFloat4919);
						} else {
							class640_sub1_sub2_sub1.method18531(i_1_, -1, -1117808926);
							continue;
						}
					}
					if (0 != i_5_ || i_6_ != 0)
						class640_sub1_sub2_sub1.method18531(i_1_, (int) (Math.atan2((double) i_5_, (double) i_6_) * 2607.5945876176133) & 0x3fff, 1549812063);
				}
			}
			if (bool) {
				class640_sub1_sub2_sub1.anIntArray11911 = null;
				class640_sub1_sub2_sub1.anIntArray11935 = null;
			}
		}
	}

	public static int[] method15628(int i, int i_13_, int i_14_, int i_15_, int i_16_, float f, boolean bool, short i_17_) {
		int[] is = new int[i];
		Class527_Sub35_Sub1 class527_sub35_sub1 = new Class527_Sub35_Sub1();
		class527_sub35_sub1.anInt11840 = -940111103 * i_13_;
		class527_sub35_sub1.aBool11845 = bool;
		class527_sub35_sub1.anInt11841 = i_14_ * 2136005631;
		class527_sub35_sub1.anInt11842 = 1166412227 * i_15_;
		class527_sub35_sub1.anInt11843 = -4578145 * i_16_;
		class527_sub35_sub1.anInt11844 = -2067227147 * (int) (f * 4096.0F);
		class527_sub35_sub1.method18431((byte) -49);
		Class40.method1162(i, 1, 153371143);
		class527_sub35_sub1.method18429(0, is, (byte) 0);
		return is;
	}

	static final void method15629(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_18_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_19_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_20_ = 0;
		int i_21_ = i_19_ >>> 8;
		int i_22_ = i_19_ & 0xff;
		Class4 class4 = (Class4) Class431.aClass24_4851.method81(i_18_, 774821135);
		Class84 class84 = ((Class84) Class208_Sub2.aClass24_9868.method81(i_21_, -475027879));
		Class462[] class462s = class84.aClass462ArrayArray814[i_22_];
		Object[] objects = class4.method564(i_22_, -1961672675);
		if (null == objects && null != class84.anObjectArrayArray813)
			objects = class84.anObjectArrayArray813[i_22_];
		if (objects != null)
			i_20_ = objects.length / class462s.length;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_20_;
	}
}
