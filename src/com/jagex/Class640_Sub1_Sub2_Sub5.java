/* Class640_Sub1_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub2_Sub5 extends Class640_Sub1_Sub2 {
	double aDouble12137;
	int anInt12138;
	public int anInt12139;
	public int anInt12140;
	public int anInt12141;
	int anInt12142;
	int anInt12143;
	double aDouble12144;
	int anInt12145;
	double aDouble12146;
	int anInt12147;
	boolean aBool12148 = false;
	int anInt12149;
	boolean aBool12150;
	public int anInt12151;
	double aDouble12152;
	double aDouble12153;
	Class695 aClass695_12154;
	int anInt12155 = 0;
	boolean aBool12156 = false;
	Class613 aClass613_12157;
	int anInt12158 = 0;

	public int method17076() {
		return 655482797 * anInt12155;
	}

	boolean method17069(int i) {
		return false;
	}

	boolean method17072(int i) {
		return aBool12156;
	}

	void method18335(byte i) {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	public int method18811(byte i) {
		return -697548983 * anInt12158;
	}

	public Class549 method17042(Class180 class180, int i) {
		return null;
	}

	public final void method18812(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		if (!aBool12148) {
			float f = (float) i - class442.aFloat4918;
			float f_4_ = (float) i_0_ - class442.aFloat4919;
			float f_5_ = (float) Math.sqrt((double) (f * f + f_4_ * f_4_));
			if (0.0F != f_5_) {
				class442.aFloat4918 += f * (float) (1072203553 * anInt12143) / f_5_;
				class442.aFloat4919 += f_4_ * (float) (1072203553 * anInt12143) / f_5_;
			}
			if (aBool12150)
				class442.aFloat4915 = (float) (Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5) - anInt12138 * 435401047);
			method10618(class442);
		}
		double d = (double) (-179474811 * anInt12141 + 1 - i_2_);
		aDouble12146 = (double) ((float) i - class442.aFloat4918) / d;
		aDouble12137 = (double) ((float) i_0_ - class442.aFloat4919) / d;
		aDouble12152 = Math.sqrt(aDouble12137 * aDouble12137 + aDouble12146 * aDouble12146);
		if (-1 != anInt12149 * -117635299) {
			if (!aBool12148)
				aDouble12144 = (-aDouble12152 * Math.tan(0.02454369 * (double) (-117635299 * anInt12149)));
			aDouble12153 = 2.0 * ((double) ((float) i_1_ - class442.aFloat4915) - aDouble12144 * d) / (d * d);
		} else
			aDouble12144 = (double) ((float) i_1_ - class442.aFloat4915) / d;
		class442.method7141();
	}

	public void method18813(int i) {
		if (!aBool12148) {
			if (0 != anInt12147 * 1148866185) {
				Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = null;
				if (-1481292237 * client.anInt11080 == 4)
					class640_sub1_sub2_sub1 = Class466.aClass196Array5314[1148866185 * anInt12147 - 1].method3717(597550295);
				else if (anInt12147 * 1148866185 < 0) {
					int i_6_ = -(anInt12147 * 1148866185) - 1;
					if (client.anInt11070 * -899375681 == i_6_)
						class640_sub1_sub2_sub1 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
					else
						class640_sub1_sub2_sub1 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_6_]);
				} else {
					int i_7_ = 1148866185 * anInt12147 - 1;
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_7_));
					if (null != class527_sub26)
						class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522);
				}
				if (class640_sub1_sub2_sub1 != null) {
					Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
					method10619(class442.aFloat4918, (float) ((Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5)) - 435401047 * anInt12138), class442.aFloat4919);
					if (-1102045805 * anInt12142 >= 0) {
						Class587 class587 = class640_sub1_sub2_sub1.method18542(-1977891423);
						int i_8_ = 0;
						int i_9_ = 0;
						if (class587.anIntArrayArray7744 != null && (class587.anIntArrayArray7744[anInt12142 * -1102045805]) != null) {
							i_8_ += (class587.anIntArrayArray7744[-1102045805 * anInt12142][0]);
							i_9_ += (class587.anIntArrayArray7744[anInt12142 * -1102045805][2]);
						}
						if (null != class587.anIntArrayArray7745 && (class587.anIntArrayArray7745[-1102045805 * anInt12142]) != null) {
							i_8_ += (class587.anIntArrayArray7745[anInt12142 * -1102045805][0]);
							i_9_ += (class587.anIntArrayArray7745[anInt12142 * -1102045805][2]);
						}
						if (0 != i_8_ || i_9_ != 0) {
							int i_10_ = class640_sub1_sub2_sub1.aClass61_11936.method1384((byte) 1);
							int i_11_ = i_10_;
							if (class640_sub1_sub2_sub1.anIntArray11935 != null && (class640_sub1_sub2_sub1.anIntArray11935[-1102045805 * anInt12142]) != -1)
								i_11_ = (class640_sub1_sub2_sub1.anIntArray11935[anInt12142 * -1102045805]);
							int i_12_ = i_11_ - i_10_ & 0x3fff;
							int i_13_ = Class428.anIntArray4825[i_12_];
							int i_14_ = Class428.anIntArray4819[i_12_];
							int i_15_ = i_8_ * i_14_ + i_13_ * i_9_ >> 14;
							i_9_ = i_9_ * i_14_ - i_13_ * i_8_ >> 14;
							i_8_ = i_15_;
							Class442 class442_16_ = Class442.method7139(method10637().aClass442_4927);
							class442_16_.aFloat4918 += (float) i_8_;
							class442_16_.aFloat4919 += (float) i_9_;
							method10618(class442_16_);
							class442_16_.method7141();
						}
					}
				}
			}
		}
	}

	public final void method18814(int i, int i_17_) {
		aBool12148 = true;
		Class445 class445 = new Class445(method10637());
		class445.aClass442_4927.aFloat4918 += aDouble12146 * (double) i;
		class445.aClass442_4927.aFloat4919 += (double) i * aDouble12137;
		if (aBool12150)
			class445.aClass442_4927.aFloat4915 = (float) (Class590.method9853((int) (class445.aClass442_4927.aFloat4918), (int) (class445.aClass442_4927.aFloat4919), aByte10864, (byte) 5) - anInt12138 * 435401047);
		else if (-1 != anInt12149 * -117635299) {
			class445.aClass442_4927.aFloat4915 += aDouble12144 * (double) i + (double) i * (aDouble12153 * 0.5 * (double) i);
			aDouble12144 += aDouble12153 * (double) i;
		} else
			class445.aClass442_4927.aFloat4915 += aDouble12144 * (double) i;
		class445.aClass438_4926.method7040(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12144, aDouble12152));
		Class438 class438 = Class438.method7020();
		class438.method7040(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12146, aDouble12137) - 3.1415927F));
		class445.aClass438_4926.method7019(class438);
		class438.method7021();
		method10640(class445);
		if (aClass695_12154.method14187(1, 1917478166) && aClass695_12154.method14177(2040620811))
			aClass695_12154.method14179(-320021444);
	}

	Class176 method18815(Class180 class180, int i, byte i_18_) {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt12145 * -942178499, -1622066231));
		return class685.method13931(class180, i, aClass695_12154, (byte) 2, (short) 25137);
	}

	Class558 method17040(Class180 class180, byte i) {
		Class176 class176 = method18815(class180, 2048, (byte) -60);
		if (null == class176)
			return null;
		Class432 class432 = method10612();
		method18817(class180, class176, class432, (byte) -94);
		Class558 class558 = Class171_Sub1.method14736(false, 1118216867);
		class176.method2889(class432, aClass169Array10863[0], 0);
		if (null != aClass613_12157) {
			Class182 class182 = aClass613_12157.method10139();
			class180.method3179(class182);
		}
		aBool12156 = class176.method2949();
		class176.method2893();
		anInt12155 = class176.method2896() * -1254433755;
		return class558;
	}

	void method17081(Class180 class180, int i) {
		Class176 class176 = method18815(class180, 0, (byte) -103);
		if (null != class176) {
			Class432 class432 = method10612();
			anInt12155 = class176.method2896() * -1254433755;
			class176.method2893();
			method18817(class180, class176, class432, (byte) -16);
		}
	}

	public void method18816() {
		if (!aBool12148) {
			if (0 != anInt12147 * 1148866185) {
				Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = null;
				if (-1481292237 * client.anInt11080 == 4)
					class640_sub1_sub2_sub1 = Class466.aClass196Array5314[1148866185 * anInt12147 - 1].method3717(1654864439);
				else if (anInt12147 * 1148866185 < 0) {
					int i = -(anInt12147 * 1148866185) - 1;
					if (client.anInt11070 * -899375681 == i)
						class640_sub1_sub2_sub1 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
					else
						class640_sub1_sub2_sub1 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i]);
				} else {
					int i = 1148866185 * anInt12147 - 1;
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i));
					if (null != class527_sub26)
						class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522);
				}
				if (class640_sub1_sub2_sub1 != null) {
					Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
					method10619(class442.aFloat4918, (float) ((Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5)) - 435401047 * anInt12138), class442.aFloat4919);
					if (-1102045805 * anInt12142 >= 0) {
						Class587 class587 = class640_sub1_sub2_sub1.method18542(-1770610275);
						int i = 0;
						int i_19_ = 0;
						if (class587.anIntArrayArray7744 != null && (class587.anIntArrayArray7744[anInt12142 * -1102045805]) != null) {
							i += (class587.anIntArrayArray7744[-1102045805 * anInt12142][0]);
							i_19_ += (class587.anIntArrayArray7744[anInt12142 * -1102045805][2]);
						}
						if (null != class587.anIntArrayArray7745 && (class587.anIntArrayArray7745[-1102045805 * anInt12142]) != null) {
							i += (class587.anIntArrayArray7745[anInt12142 * -1102045805][0]);
							i_19_ += (class587.anIntArrayArray7745[anInt12142 * -1102045805][2]);
						}
						if (0 != i || i_19_ != 0) {
							int i_20_ = class640_sub1_sub2_sub1.aClass61_11936.method1384((byte) 1);
							int i_21_ = i_20_;
							if (class640_sub1_sub2_sub1.anIntArray11935 != null && (class640_sub1_sub2_sub1.anIntArray11935[-1102045805 * anInt12142]) != -1)
								i_21_ = (class640_sub1_sub2_sub1.anIntArray11935[anInt12142 * -1102045805]);
							int i_22_ = i_21_ - i_20_ & 0x3fff;
							int i_23_ = Class428.anIntArray4825[i_22_];
							int i_24_ = Class428.anIntArray4819[i_22_];
							int i_25_ = i * i_24_ + i_23_ * i_19_ >> 14;
							i_19_ = i_19_ * i_24_ - i_23_ * i >> 14;
							i = i_25_;
							Class442 class442_26_ = Class442.method7139(method10637().aClass442_4927);
							class442_26_.aFloat4918 += (float) i;
							class442_26_.aFloat4919 += (float) i_19_;
							method10618(class442_26_);
							class442_26_.method7141();
						}
					}
				}
			}
		}
	}

	void method18817(Class180 class180, Class176 class176, Class432 class432, byte i) {
		class176.method2870(class432);
		Class167[] class167s = class176.method2915();
		Class159[] class159s = class176.method2916();
		if ((null == aClass613_12157 || aClass613_12157.aBool8026) && (class167s != null || null != class159s))
			aClass613_12157 = Class613.method10130(client.anInt11019, true);
		if (aClass613_12157 != null) {
			aClass613_12157.method10133(class180, (long) client.anInt11019, class167s, class159s, false);
			aClass613_12157.method10137(aByte10864, aShort11775, aShort11770, aShort11771, aShort11772);
		}
	}

	public void method18818(int i) {
		if (null != aClass613_12157)
			aClass613_12157.method10129();
	}

	boolean method17033(Class180 class180, int i, int i_27_, byte i_28_) {
		return false;
	}

	final boolean method17037(int i) {
		return false;
	}

	final void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_29_, int i_30_, boolean bool, int i_31_) {
		throw new IllegalStateException();
	}

	public final void method18819(int i, int i_32_, int i_33_, int i_34_) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		if (!aBool12148) {
			float f = (float) i - class442.aFloat4918;
			float f_35_ = (float) i_32_ - class442.aFloat4919;
			float f_36_ = (float) Math.sqrt((double) (f * f + f_35_ * f_35_));
			if (0.0F != f_36_) {
				class442.aFloat4918 += f * (float) (1072203553 * anInt12143) / f_36_;
				class442.aFloat4919 += f_35_ * (float) (1072203553 * anInt12143) / f_36_;
			}
			if (aBool12150)
				class442.aFloat4915 = (float) (Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5) - anInt12138 * 435401047);
			method10618(class442);
		}
		double d = (double) (-179474811 * anInt12141 + 1 - i_34_);
		aDouble12146 = (double) ((float) i - class442.aFloat4918) / d;
		aDouble12137 = (double) ((float) i_32_ - class442.aFloat4919) / d;
		aDouble12152 = Math.sqrt(aDouble12137 * aDouble12137 + aDouble12146 * aDouble12146);
		if (-1 != anInt12149 * -117635299) {
			if (!aBool12148)
				aDouble12144 = (-aDouble12152 * Math.tan(0.02454369 * (double) (-117635299 * anInt12149)));
			aDouble12153 = 2.0 * ((double) ((float) i_33_ - class442.aFloat4915) - aDouble12144 * d) / (d * d);
		} else
			aDouble12144 = (double) ((float) i_33_ - class442.aFloat4915) / d;
		class442.method7141();
	}

	boolean method17051() {
		return false;
	}

	final boolean method17045() {
		return false;
	}

	final void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_37_, int i_38_, boolean bool) {
		throw new IllegalStateException();
	}

	void method17056(Class180 class180) {
		Class176 class176 = method18815(class180, 0, (byte) -82);
		if (null != class176) {
			Class432 class432 = method10612();
			anInt12155 = class176.method2896() * -1254433755;
			class176.method2893();
			method18817(class180, class176, class432, (byte) -5);
		}
	}

	public Class549 method17064(Class180 class180) {
		return null;
	}

	public Class549 method17085(Class180 class180) {
		return null;
	}

	public Class549 method17057(Class180 class180) {
		return null;
	}

	public Class640_Sub1_Sub2_Sub5(Class555 class555, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, boolean bool, int i_51_, int i_52_) {
		super(class555, i_39_, i_40_, i_41_, Class590.method9853(i_41_, i_42_, i_39_, (byte) 5) - i_43_, i_42_, i_41_ >> 9, i_41_ >> 9, i_42_ >> 9, i_42_ >> 9, false, (byte) 0);
		anInt12145 = i * -1564094443;
		anInt12140 = i_44_ * -1787521057;
		anInt12141 = i_45_ * -1512089011;
		anInt12149 = i_46_ * 1036120885;
		anInt12143 = i_47_ * 1975893217;
		anInt12147 = i_48_ * -304379975;
		anInt12151 = i_49_ * 391801259;
		anInt12138 = -1224488345 * i_43_;
		anInt12139 = i_50_ * -244879979;
		aBool12150 = bool;
		aBool12148 = false;
		anInt12142 = -803698533 * i_51_;
		anInt12158 = i_52_ * 1645798137;
		int i_53_ = (((Class685) Class57.aClass24_Sub4_720.method81(anInt12145 * -942178499, -927189556)).anInt8671 * -1567837355);
		aClass695_12154 = new Class695_Sub3(this, false);
		aClass695_12154.method14165(i_53_, (byte) 44);
		method17050(1, (short) 20451);
	}

	Class558 method17070(Class180 class180) {
		Class176 class176 = method18815(class180, 2048, (byte) -68);
		if (null == class176)
			return null;
		Class432 class432 = method10612();
		method18817(class180, class176, class432, (byte) -47);
		Class558 class558 = Class171_Sub1.method14736(false, -1074543997);
		class176.method2889(class432, aClass169Array10863[0], 0);
		if (null != aClass613_12157) {
			Class182 class182 = aClass613_12157.method10139();
			class180.method3179(class182);
		}
		aBool12156 = class176.method2949();
		class176.method2893();
		anInt12155 = class176.method2896() * -1254433755;
		return class558;
	}

	Class558 method17063(Class180 class180) {
		Class176 class176 = method18815(class180, 2048, (byte) -111);
		if (null == class176)
			return null;
		Class432 class432 = method10612();
		method18817(class180, class176, class432, (byte) -104);
		Class558 class558 = Class171_Sub1.method14736(false, -850175351);
		class176.method2889(class432, aClass169Array10863[0], 0);
		if (null != aClass613_12157) {
			Class182 class182 = aClass613_12157.method10139();
			class180.method3179(class182);
		}
		aBool12156 = class176.method2949();
		class176.method2893();
		anInt12155 = class176.method2896() * -1254433755;
		return class558;
	}

	public int method17047(int i) {
		return 655482797 * anInt12155;
	}

	void method17071(Class180 class180) {
		Class176 class176 = method18815(class180, 0, (byte) -66);
		if (null != class176) {
			Class432 class432 = method10612();
			anInt12155 = class176.method2896() * -1254433755;
			class176.method2893();
			method18817(class180, class176, class432, (byte) -128);
		}
	}

	boolean method17066(Class180 class180, int i, int i_54_) {
		return false;
	}

	final boolean method17067() {
		return false;
	}

	public void method18820() {
		if (null != aClass613_12157)
			aClass613_12157.method10129();
	}

	final boolean method17068() {
		return false;
	}

	final void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_55_, int i_56_, boolean bool) {
		throw new IllegalStateException();
	}

	boolean method17052() {
		return false;
	}

	public Class549 method17058(Class180 class180) {
		return null;
	}

	final void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_57_, int i_58_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17074() {
		throw new IllegalStateException();
	}

	final void method17039(int i) {
		throw new IllegalStateException();
	}

	void method18341() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	public int method18821() {
		return -697548983 * anInt12158;
	}

	public int method18822() {
		return -697548983 * anInt12158;
	}

	public int method18823() {
		return -697548983 * anInt12158;
	}

	void method18338() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	public final void method18824(int i, int i_59_, int i_60_, int i_61_) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		if (!aBool12148) {
			float f = (float) i - class442.aFloat4918;
			float f_62_ = (float) i_59_ - class442.aFloat4919;
			float f_63_ = (float) Math.sqrt((double) (f * f + f_62_ * f_62_));
			if (0.0F != f_63_) {
				class442.aFloat4918 += f * (float) (1072203553 * anInt12143) / f_63_;
				class442.aFloat4919 += f_62_ * (float) (1072203553 * anInt12143) / f_63_;
			}
			if (aBool12150)
				class442.aFloat4915 = (float) (Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5) - anInt12138 * 435401047);
			method10618(class442);
		}
		double d = (double) (-179474811 * anInt12141 + 1 - i_61_);
		aDouble12146 = (double) ((float) i - class442.aFloat4918) / d;
		aDouble12137 = (double) ((float) i_59_ - class442.aFloat4919) / d;
		aDouble12152 = Math.sqrt(aDouble12137 * aDouble12137 + aDouble12146 * aDouble12146);
		if (-1 != anInt12149 * -117635299) {
			if (!aBool12148)
				aDouble12144 = (-aDouble12152 * Math.tan(0.02454369 * (double) (-117635299 * anInt12149)));
			aDouble12153 = 2.0 * ((double) ((float) i_60_ - class442.aFloat4915) - aDouble12144 * d) / (d * d);
		} else
			aDouble12144 = (double) ((float) i_60_ - class442.aFloat4915) / d;
		class442.method7141();
	}

	public void method18825() {
		if (!aBool12148) {
			if (0 != anInt12147 * 1148866185) {
				Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = null;
				if (-1481292237 * client.anInt11080 == 4)
					class640_sub1_sub2_sub1 = Class466.aClass196Array5314[1148866185 * anInt12147 - 1].method3717(-1965422607);
				else if (anInt12147 * 1148866185 < 0) {
					int i = -(anInt12147 * 1148866185) - 1;
					if (client.anInt11070 * -899375681 == i)
						class640_sub1_sub2_sub1 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
					else
						class640_sub1_sub2_sub1 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i]);
				} else {
					int i = 1148866185 * anInt12147 - 1;
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i));
					if (null != class527_sub26)
						class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522);
				}
				if (class640_sub1_sub2_sub1 != null) {
					Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
					method10619(class442.aFloat4918, (float) ((Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, aByte10864, (byte) 5)) - 435401047 * anInt12138), class442.aFloat4919);
					if (-1102045805 * anInt12142 >= 0) {
						Class587 class587 = class640_sub1_sub2_sub1.method18542(-1473038034);
						int i = 0;
						int i_64_ = 0;
						if (class587.anIntArrayArray7744 != null && (class587.anIntArrayArray7744[anInt12142 * -1102045805]) != null) {
							i += (class587.anIntArrayArray7744[-1102045805 * anInt12142][0]);
							i_64_ += (class587.anIntArrayArray7744[anInt12142 * -1102045805][2]);
						}
						if (null != class587.anIntArrayArray7745 && (class587.anIntArrayArray7745[-1102045805 * anInt12142]) != null) {
							i += (class587.anIntArrayArray7745[anInt12142 * -1102045805][0]);
							i_64_ += (class587.anIntArrayArray7745[anInt12142 * -1102045805][2]);
						}
						if (0 != i || i_64_ != 0) {
							int i_65_ = class640_sub1_sub2_sub1.aClass61_11936.method1384((byte) 1);
							int i_66_ = i_65_;
							if (class640_sub1_sub2_sub1.anIntArray11935 != null && (class640_sub1_sub2_sub1.anIntArray11935[-1102045805 * anInt12142]) != -1)
								i_66_ = (class640_sub1_sub2_sub1.anIntArray11935[anInt12142 * -1102045805]);
							int i_67_ = i_66_ - i_65_ & 0x3fff;
							int i_68_ = Class428.anIntArray4825[i_67_];
							int i_69_ = Class428.anIntArray4819[i_67_];
							int i_70_ = i * i_69_ + i_68_ * i_64_ >> 14;
							i_64_ = i_64_ * i_69_ - i_68_ * i >> 14;
							i = i_70_;
							Class442 class442_71_ = Class442.method7139(method10637().aClass442_4927);
							class442_71_.aFloat4918 += (float) i;
							class442_71_.aFloat4919 += (float) i_64_;
							method10618(class442_71_);
							class442_71_.method7141();
						}
					}
				}
			}
		}
	}

	Class176 method18826(Class180 class180, int i) {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt12145 * -942178499, -1502828570));
		return class685.method13931(class180, i, aClass695_12154, (byte) 2, (short) 14305);
	}

	Class176 method18827(Class180 class180, int i) {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt12145 * -942178499, 2088582464));
		return class685.method13931(class180, i, aClass695_12154, (byte) 2, (short) 32282);
	}

	void method18337() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	void method18336() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	final void method17075() {
		throw new IllegalStateException();
	}

	boolean method17053() {
		return aBool12156;
	}

	boolean method17048() {
		return aBool12156;
	}

	void method18339() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	void method18340() {
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = aShort11770 = (short) (int) (class442.aFloat4918 / 512.0F);
		aShort11771 = aShort11772 = (short) (int) (class442.aFloat4919 / 512.0F);
	}

	public void method18828() {
		if (null != aClass613_12157)
			aClass613_12157.method10129();
	}

	final void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_72_, int i_73_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method18829() {
		if (null != aClass613_12157)
			aClass613_12157.method10129();
	}

	public void method18830() {
		if (null != aClass613_12157)
			aClass613_12157.method10129();
	}
}
