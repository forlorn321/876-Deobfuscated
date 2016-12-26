/* Class649_Sub1_Sub5_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub5_Sub6 extends Class649_Sub1_Sub5 {
	int anInt12136;
	boolean aBool12137;
	boolean aBool12138;
	public int anInt12139;
	public int anInt12140;
	int anInt12141;
	int anInt12142;
	double aDouble12143;
	public int anInt12144;
	int anInt12145;
	int anInt12146;
	boolean aBool12147 = false;
	Class627 aClass627_12148;
	double aDouble12149;
	double aDouble12150;
	double aDouble12151;
	double aDouble12152;
	Class688 aClass688_12153;
	int anInt12154;
	public int anInt12155;
	int anInt12156;
	int anInt12157;

	final boolean method9940(int i) {
		return false;
	}

	boolean method9974(int i) {
		return false;
	}

	boolean method9942(int i) {
		return aBool12138;
	}

	public final void method11045(int i) {
		aBool12147 = true;
		Class431 class431 = new Class431(method7837());
		class431.aClass436_4823.aFloat4850 += aDouble12143 * (double) i;
		class431.aClass436_4823.aFloat4853 += (double) i * aDouble12149;
		if (aBool12137)
			class431.aClass436_4823.aFloat4852 = (float) (Class54.method944((int) (class431.aClass436_4823.aFloat4850), (int) (class431.aClass436_4823.aFloat4853), aByte10839, 2029548989) - anInt12157 * 1417726395);
		else if (-1 != 1477671255 * anInt12141) {
			class431.aClass436_4823.aFloat4852 += ((double) i * (aDouble12152 * 0.5 * (double) i) + aDouble12151 * (double) i);
			aDouble12151 += (double) i * aDouble12152;
		} else
			class431.aClass436_4823.aFloat4852 += aDouble12151 * (double) i;
		class431.aClass425_4822.method5090(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12151, aDouble12150));
		Class425 class425 = Class425.method5081();
		class425.method5090(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12143, aDouble12149) - 3.1415927F));
		class431.aClass425_4822.method5096(class425);
		class425.method5080();
		method7843(class431);
		if (aClass688_12153.method8138(1, 1945207597) && aClass688_12153.method8135(-853976221))
			aClass688_12153.method8137(-1611983154);
	}

	public int method9958() {
		return -671867239 * anInt12136;
	}

	public Class559 method9946(Class167 class167, int i) {
		return null;
	}

	public final void method11046(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		if (!aBool12147) {
			float f = (float) i - class436.aFloat4850;
			float f_4_ = (float) i_0_ - class436.aFloat4853;
			float f_5_ = (float) Math.sqrt((double) (f_4_ * f_4_ + f * f));
			if (0.0F != f_5_) {
				class436.aFloat4850 += (float) (-1492406045 * anInt12142) * f / f_5_;
				class436.aFloat4853 += f_4_ * (float) (-1492406045 * anInt12142) / f_5_;
			}
			if (aBool12137)
				class436.aFloat4852 = (float) (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, aByte10839, 1603306522) - anInt12157 * 1417726395);
			method7841(class436);
		}
		double d = (double) (anInt12140 * 668402135 + 1 - i_2_);
		aDouble12143 = (double) ((float) i - class436.aFloat4850) / d;
		aDouble12149 = (double) ((float) i_0_ - class436.aFloat4853) / d;
		aDouble12150 = Math.sqrt(aDouble12143 * aDouble12143 + aDouble12149 * aDouble12149);
		if (-1 != 1477671255 * anInt12141) {
			if (!aBool12147)
				aDouble12151 = -aDouble12150 * Math.tan((double) (1477671255 * anInt12141) * 0.02454369);
			aDouble12152 = 2.0 * ((double) ((float) i_1_ - class436.aFloat4852) - d * aDouble12151) / (d * d);
		} else
			aDouble12151 = (double) ((float) i_1_ - class436.aFloat4852) / d;
		class436.method5239();
	}

	public int method9941() {
		return -671867239 * anInt12136;
	}

	public final void method11047(int i, byte i_6_) {
		aBool12147 = true;
		Class431 class431 = new Class431(method7837());
		class431.aClass436_4823.aFloat4850 += aDouble12143 * (double) i;
		class431.aClass436_4823.aFloat4853 += (double) i * aDouble12149;
		if (aBool12137)
			class431.aClass436_4823.aFloat4852 = (float) (Class54.method944((int) (class431.aClass436_4823.aFloat4850), (int) (class431.aClass436_4823.aFloat4853), aByte10839, 2097496379) - anInt12157 * 1417726395);
		else if (-1 != 1477671255 * anInt12141) {
			class431.aClass436_4823.aFloat4852 += ((double) i * (aDouble12152 * 0.5 * (double) i) + aDouble12151 * (double) i);
			aDouble12151 += (double) i * aDouble12152;
		} else
			class431.aClass436_4823.aFloat4852 += aDouble12151 * (double) i;
		class431.aClass425_4822.method5090(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12151, aDouble12150));
		Class425 class425 = Class425.method5081();
		class425.method5090(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12143, aDouble12149) - 3.1415927F));
		class431.aClass425_4822.method5096(class425);
		class425.method5080();
		method7843(class431);
		if (aClass688_12153.method8138(1, 1774749057) && aClass688_12153.method8135(1175999910))
			aClass688_12153.method8137(2031001933);
	}

	void method10837() {
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = aShort11864 = (short) (int) (class436.aFloat4850 / 512.0F);
		aShort11865 = aShort11870 = (short) (int) (class436.aFloat4853 / 512.0F);
	}

	Class563 method9944(Class167 class167, byte i) {
		Class177 class177 = method11049(class167, 2048, -1454127383);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		method11053(class167, class177, class433, -700759766);
		Class563 class563 = Class225.method3212(false, 784504079);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12148) {
			Class166 class166 = aClass627_12148.method7476();
			class167.method2351(class166);
		}
		aBool12138 = class177.method2511();
		class177.method2579();
		anInt12136 = class177.method2562() * -1752738391;
		return class563;
	}

	void method9945(Class167 class167, int i) {
		Class177 class177 = method11049(class167, 0, -1454127383);
		if (null != class177) {
			Class433 class433 = method7851();
			anInt12136 = class177.method2562() * -1752738391;
			class177.method2579();
			method11053(class167, class177, class433, -196527845);
		}
	}

	void method10836(short i) {
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = aShort11864 = (short) (int) (class436.aFloat4850 / 512.0F);
		aShort11865 = aShort11870 = (short) (int) (class436.aFloat4853 / 512.0F);
	}

	public void method11048(int i) {
		if (aClass627_12148 != null)
			aClass627_12148.method7469();
	}

	Class563 method9965(Class167 class167) {
		Class177 class177 = method11049(class167, 2048, -1454127383);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		method11053(class167, class177, class433, -141613111);
		Class563 class563 = Class225.method3212(false, -1926514599);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12148) {
			Class166 class166 = aClass627_12148.method7476();
			class167.method2351(class166);
		}
		aBool12138 = class177.method2511();
		class177.method2579();
		anInt12136 = class177.method2562() * -1752738391;
		return class563;
	}

	boolean method9939(Class167 class167, int i, int i_7_, byte i_8_) {
		return false;
	}

	Class177 method11049(Class167 class167, int i, int i_9_) {
		Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(anInt12146 * -912182165, (byte) 100));
		return class677.method8045(class167, i, aClass688_12153, (byte) 2, -1341839390);
	}

	final void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_10_, int i_11_, boolean bool, int i_12_) {
		throw new IllegalStateException();
	}

	final void method9986(int i) {
		throw new IllegalStateException();
	}

	public int method11050() {
		return anInt12145 * -1233241225;
	}

	public int method11051(int i) {
		return anInt12145 * -1233241225;
	}

	public int method9984() {
		return -671867239 * anInt12136;
	}

	public Class559 method9955(Class167 class167) {
		return null;
	}

	public Class559 method9961(Class167 class167) {
		return null;
	}

	public Class559 method9962(Class167 class167) {
		return null;
	}

	public void method11052() {
		if (aClass627_12148 != null)
			aClass627_12148.method7469();
	}

	Class563 method9985(Class167 class167) {
		Class177 class177 = method11049(class167, 2048, -1454127383);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		method11053(class167, class177, class433, -1130041492);
		Class563 class563 = Class225.method3212(false, -1350901971);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12148) {
			Class166 class166 = aClass627_12148.method7476();
			class167.method2351(class166);
		}
		aBool12138 = class177.method2511();
		class177.method2579();
		anInt12136 = class177.method2562() * -1752738391;
		return class563;
	}

	boolean method9957(Class167 class167, int i, int i_13_) {
		return false;
	}

	public Class649_Sub1_Sub5_Sub6(Class553 class553, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean bool, int i_26_, int i_27_) {
		super(class553, i_14_, i_15_, i_16_, Class54.method944(i_16_, i_17_, i_14_, 1774632470) - i_18_, i_17_, i_16_ >> 9, i_16_ >> 9, i_17_ >> 9, i_17_ >> 9, false, (byte) 0);
		anInt12136 = 0;
		aBool12138 = false;
		anInt12145 = 0;
		anInt12146 = i * 16767043;
		anInt12139 = i_19_ * 538606269;
		anInt12140 = 1903198695 * i_20_;
		anInt12141 = -2074836377 * i_21_;
		anInt12142 = i_22_ * 29562059;
		anInt12156 = i_23_ * 1049067645;
		anInt12144 = i_24_ * 1509101755;
		anInt12157 = i_18_ * 1652396915;
		anInt12155 = i_25_ * -1394553781;
		aBool12137 = bool;
		aBool12147 = false;
		anInt12154 = i_26_ * 722212921;
		anInt12145 = i_27_ * -1486156217;
		int i_28_ = (((Class677) Class633.aClass34_Sub15_8260.method70(-912182165 * anInt12146, (byte) 54)).anInt8607 * -1078340929);
		aClass688_12153 = new Class688_Sub2(this, false);
		aClass688_12153.method8122(i_28_, -961183154);
		method9968(1, 972414302);
	}

	boolean method9987() {
		return false;
	}

	void method9975(Class167 class167) {
		Class177 class177 = method11049(class167, 0, -1454127383);
		if (null != class177) {
			Class433 class433 = method7851();
			anInt12136 = class177.method2562() * -1752738391;
			class177.method2579();
			method11053(class167, class177, class433, -1220662506);
		}
	}

	boolean method9969(Class167 class167, int i, int i_29_) {
		return false;
	}

	void method9967(Class167 class167) {
		Class177 class177 = method11049(class167, 0, -1454127383);
		if (null != class177) {
			Class433 class433 = method7851();
			anInt12136 = class177.method2562() * -1752738391;
			class177.method2579();
			method11053(class167, class177, class433, -2023894356);
		}
	}

	boolean method9971(Class167 class167, int i, int i_30_) {
		return false;
	}

	final boolean method9938() {
		return false;
	}

	void method11053(Class167 class167, Class177 class177, Class433 class433, int i) {
		class177.method2513(class433);
		Class172[] class172s = class177.method2514();
		Class156[] class156s = class177.method2515();
		if ((aClass627_12148 == null || aClass627_12148.aBool8168) && (null != class172s || null != class156s))
			aClass627_12148 = Class627.method7484(client.cycles, true);
		if (aClass627_12148 != null) {
			aClass627_12148.method7474(class167, (long) client.cycles, class172s, class156s, false);
			aClass627_12148.method7473(aByte10839, aShort11867, aShort11864, aShort11865, aShort11870);
		}
	}

	final boolean method9973() {
		return false;
	}

	final void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_31_, int i_32_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_33_, int i_34_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method11054(int i) {
		if (!aBool12147) {
			if (anInt12156 * 591263957 != 0) {
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
				if (1542697723 * client.anInt11074 == 4)
					class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt12156 * 591263957 - 1].method2804(1925207321);
				else if (anInt12156 * 591263957 < 0) {
					int i_35_ = -(591263957 * anInt12156) - 1;
					if (client.anInt11156 * -1791435655 == i_35_)
						class649_sub1_sub5_sub1 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_35_]);
				} else {
					int i_36_ = 591263957 * anInt12156 - 1;
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_36_));
					if (null != class536_sub13)
						class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468);
				}
				if (class649_sub1_sub5_sub1 != null) {
					Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
					method7842(class436.aFloat4850, (float) (Class54.method944((int) (class436.aFloat4850), (int) (class436.aFloat4853), aByte10839, 1520176654) - 1417726395 * anInt12157), class436.aFloat4853);
					if (anInt12154 * 1878021641 >= 0) {
						Class589 class589 = class649_sub1_sub5_sub1.method10877(-407676368);
						int i_37_ = 0;
						int i_38_ = 0;
						if (class589.anIntArrayArray7749 != null && null != (class589.anIntArrayArray7749[1878021641 * anInt12154])) {
							i_37_ += (class589.anIntArrayArray7749[1878021641 * anInt12154][0]);
							i_38_ += (class589.anIntArrayArray7749[anInt12154 * 1878021641][2]);
						}
						if (class589.anIntArrayArray7775 != null && (class589.anIntArrayArray7775[anInt12154 * 1878021641]) != null) {
							i_37_ += (class589.anIntArrayArray7775[1878021641 * anInt12154][0]);
							i_38_ += (class589.anIntArrayArray7775[anInt12154 * 1878021641][2]);
						}
						if (0 != i_37_ || 0 != i_38_) {
							int i_39_ = class649_sub1_sub5_sub1.aClass62_11940.method1047((byte) 16);
							int i_40_ = i_39_;
							if (null != class649_sub1_sub5_sub1.anIntArray11918 && (class649_sub1_sub5_sub1.anIntArray11918[anInt12154 * 1878021641]) != -1)
								i_40_ = (class649_sub1_sub5_sub1.anIntArray11918[1878021641 * anInt12154]);
							int i_41_ = i_40_ - i_39_ & 0x3fff;
							int i_42_ = Class447.anIntArray4906[i_41_];
							int i_43_ = Class447.anIntArray4921[i_41_];
							int i_44_ = i_42_ * i_38_ + i_37_ * i_43_ >> 14;
							i_38_ = i_43_ * i_38_ - i_42_ * i_37_ >> 14;
							i_37_ = i_44_;
							Class436 class436_45_ = Class436.method5240(method7837().aClass436_4823);
							class436_45_.aFloat4850 += (float) i_37_;
							class436_45_.aFloat4853 += (float) i_38_;
							method7841(class436_45_);
							class436_45_.method5239();
						}
					}
				}
			}
		}
	}

	void method10838() {
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = aShort11864 = (short) (int) (class436.aFloat4850 / 512.0F);
		aShort11865 = aShort11870 = (short) (int) (class436.aFloat4853 / 512.0F);
	}

	public int method9960(int i) {
		return -671867239 * anInt12136;
	}

	public Class559 method9963(Class167 class167) {
		return null;
	}

	public final void method11055(int i, int i_46_, int i_47_, int i_48_) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		if (!aBool12147) {
			float f = (float) i - class436.aFloat4850;
			float f_49_ = (float) i_46_ - class436.aFloat4853;
			float f_50_ = (float) Math.sqrt((double) (f_49_ * f_49_ + f * f));
			if (0.0F != f_50_) {
				class436.aFloat4850 += (float) (-1492406045 * anInt12142) * f / f_50_;
				class436.aFloat4853 += f_49_ * (float) (-1492406045 * anInt12142) / f_50_;
			}
			if (aBool12137)
				class436.aFloat4852 = (float) (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, aByte10839, 2123471172) - anInt12157 * 1417726395);
			method7841(class436);
		}
		double d = (double) (anInt12140 * 668402135 + 1 - i_48_);
		aDouble12143 = (double) ((float) i - class436.aFloat4850) / d;
		aDouble12149 = (double) ((float) i_46_ - class436.aFloat4853) / d;
		aDouble12150 = Math.sqrt(aDouble12143 * aDouble12143 + aDouble12149 * aDouble12149);
		if (-1 != 1477671255 * anInt12141) {
			if (!aBool12147)
				aDouble12151 = -aDouble12150 * Math.tan((double) (1477671255 * anInt12141) * 0.02454369);
			aDouble12152 = 2.0 * ((double) ((float) i_47_ - class436.aFloat4852) - d * aDouble12151) / (d * d);
		} else
			aDouble12151 = (double) ((float) i_47_ - class436.aFloat4852) / d;
		class436.method5239();
	}

	public void method11056() {
		if (!aBool12147) {
			if (anInt12156 * 591263957 != 0) {
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
				if (1542697723 * client.anInt11074 == 4)
					class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt12156 * 591263957 - 1].method2804(1927514153);
				else if (anInt12156 * 591263957 < 0) {
					int i = -(591263957 * anInt12156) - 1;
					if (client.anInt11156 * -1791435655 == i)
						class649_sub1_sub5_sub1 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i]);
				} else {
					int i = 591263957 * anInt12156 - 1;
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i));
					if (null != class536_sub13)
						class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468);
				}
				if (class649_sub1_sub5_sub1 != null) {
					Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
					method7842(class436.aFloat4850, (float) (Class54.method944((int) (class436.aFloat4850), (int) (class436.aFloat4853), aByte10839, 1583368409) - 1417726395 * anInt12157), class436.aFloat4853);
					if (anInt12154 * 1878021641 >= 0) {
						Class589 class589 = class649_sub1_sub5_sub1.method10877(-1182840841);
						int i = 0;
						int i_51_ = 0;
						if (class589.anIntArrayArray7749 != null && null != (class589.anIntArrayArray7749[1878021641 * anInt12154])) {
							i += (class589.anIntArrayArray7749[1878021641 * anInt12154][0]);
							i_51_ += (class589.anIntArrayArray7749[anInt12154 * 1878021641][2]);
						}
						if (class589.anIntArrayArray7775 != null && (class589.anIntArrayArray7775[anInt12154 * 1878021641]) != null) {
							i += (class589.anIntArrayArray7775[1878021641 * anInt12154][0]);
							i_51_ += (class589.anIntArrayArray7775[anInt12154 * 1878021641][2]);
						}
						if (0 != i || 0 != i_51_) {
							int i_52_ = class649_sub1_sub5_sub1.aClass62_11940.method1047((byte) 16);
							int i_53_ = i_52_;
							if (null != class649_sub1_sub5_sub1.anIntArray11918 && (class649_sub1_sub5_sub1.anIntArray11918[anInt12154 * 1878021641]) != -1)
								i_53_ = (class649_sub1_sub5_sub1.anIntArray11918[1878021641 * anInt12154]);
							int i_54_ = i_53_ - i_52_ & 0x3fff;
							int i_55_ = Class447.anIntArray4906[i_54_];
							int i_56_ = Class447.anIntArray4921[i_54_];
							int i_57_ = i_55_ * i_51_ + i * i_56_ >> 14;
							i_51_ = i_56_ * i_51_ - i_55_ * i >> 14;
							i = i_57_;
							Class436 class436_58_ = Class436.method5240(method7837().aClass436_4823);
							class436_58_.aFloat4850 += (float) i;
							class436_58_.aFloat4853 += (float) i_51_;
							method7841(class436_58_);
							class436_58_.method5239();
						}
					}
				}
			}
		}
	}

	public void method11057() {
		if (!aBool12147) {
			if (anInt12156 * 591263957 != 0) {
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
				if (1542697723 * client.anInt11074 == 4)
					class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt12156 * 591263957 - 1].method2804(1673614355);
				else if (anInt12156 * 591263957 < 0) {
					int i = -(591263957 * anInt12156) - 1;
					if (client.anInt11156 * -1791435655 == i)
						class649_sub1_sub5_sub1 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i]);
				} else {
					int i = 591263957 * anInt12156 - 1;
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i));
					if (null != class536_sub13)
						class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468);
				}
				if (class649_sub1_sub5_sub1 != null) {
					Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
					method7842(class436.aFloat4850, (float) (Class54.method944((int) (class436.aFloat4850), (int) (class436.aFloat4853), aByte10839, 2021149909) - 1417726395 * anInt12157), class436.aFloat4853);
					if (anInt12154 * 1878021641 >= 0) {
						Class589 class589 = class649_sub1_sub5_sub1.method10877(-1045612444);
						int i = 0;
						int i_59_ = 0;
						if (class589.anIntArrayArray7749 != null && null != (class589.anIntArrayArray7749[1878021641 * anInt12154])) {
							i += (class589.anIntArrayArray7749[1878021641 * anInt12154][0]);
							i_59_ += (class589.anIntArrayArray7749[anInt12154 * 1878021641][2]);
						}
						if (class589.anIntArrayArray7775 != null && (class589.anIntArrayArray7775[anInt12154 * 1878021641]) != null) {
							i += (class589.anIntArrayArray7775[1878021641 * anInt12154][0]);
							i_59_ += (class589.anIntArrayArray7775[anInt12154 * 1878021641][2]);
						}
						if (0 != i || 0 != i_59_) {
							int i_60_ = class649_sub1_sub5_sub1.aClass62_11940.method1047((byte) 16);
							int i_61_ = i_60_;
							if (null != class649_sub1_sub5_sub1.anIntArray11918 && (class649_sub1_sub5_sub1.anIntArray11918[anInt12154 * 1878021641]) != -1)
								i_61_ = (class649_sub1_sub5_sub1.anIntArray11918[1878021641 * anInt12154]);
							int i_62_ = i_61_ - i_60_ & 0x3fff;
							int i_63_ = Class447.anIntArray4906[i_62_];
							int i_64_ = Class447.anIntArray4921[i_62_];
							int i_65_ = i_63_ * i_59_ + i * i_64_ >> 14;
							i_59_ = i_64_ * i_59_ - i_63_ * i >> 14;
							i = i_65_;
							Class436 class436_66_ = Class436.method5240(method7837().aClass436_4823);
							class436_66_.aFloat4850 += (float) i;
							class436_66_.aFloat4853 += (float) i_59_;
							method7841(class436_66_);
							class436_66_.method5239();
						}
					}
				}
			}
		}
	}

	public void method11058() {
		if (!aBool12147) {
			if (anInt12156 * 591263957 != 0) {
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
				if (1542697723 * client.anInt11074 == 4)
					class649_sub1_sub5_sub1 = Class193.aClass189Array2180[anInt12156 * 591263957 - 1].method2804(1355280013);
				else if (anInt12156 * 591263957 < 0) {
					int i = -(591263957 * anInt12156) - 1;
					if (client.anInt11156 * -1791435655 == i)
						class649_sub1_sub5_sub1 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
					else
						class649_sub1_sub5_sub1 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i]);
				} else {
					int i = 591263957 * anInt12156 - 1;
					Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i));
					if (null != class536_sub13)
						class649_sub1_sub5_sub1 = ((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468);
				}
				if (class649_sub1_sub5_sub1 != null) {
					Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
					method7842(class436.aFloat4850, (float) (Class54.method944((int) (class436.aFloat4850), (int) (class436.aFloat4853), aByte10839, 1679866973) - 1417726395 * anInt12157), class436.aFloat4853);
					if (anInt12154 * 1878021641 >= 0) {
						Class589 class589 = class649_sub1_sub5_sub1.method10877(-1031105460);
						int i = 0;
						int i_67_ = 0;
						if (class589.anIntArrayArray7749 != null && null != (class589.anIntArrayArray7749[1878021641 * anInt12154])) {
							i += (class589.anIntArrayArray7749[1878021641 * anInt12154][0]);
							i_67_ += (class589.anIntArrayArray7749[anInt12154 * 1878021641][2]);
						}
						if (class589.anIntArrayArray7775 != null && (class589.anIntArrayArray7775[anInt12154 * 1878021641]) != null) {
							i += (class589.anIntArrayArray7775[1878021641 * anInt12154][0]);
							i_67_ += (class589.anIntArrayArray7775[anInt12154 * 1878021641][2]);
						}
						if (0 != i || 0 != i_67_) {
							int i_68_ = class649_sub1_sub5_sub1.aClass62_11940.method1047((byte) 16);
							int i_69_ = i_68_;
							if (null != class649_sub1_sub5_sub1.anIntArray11918 && (class649_sub1_sub5_sub1.anIntArray11918[anInt12154 * 1878021641]) != -1)
								i_69_ = (class649_sub1_sub5_sub1.anIntArray11918[1878021641 * anInt12154]);
							int i_70_ = i_69_ - i_68_ & 0x3fff;
							int i_71_ = Class447.anIntArray4906[i_70_];
							int i_72_ = Class447.anIntArray4921[i_70_];
							int i_73_ = i_71_ * i_67_ + i * i_72_ >> 14;
							i_67_ = i_72_ * i_67_ - i_71_ * i >> 14;
							i = i_73_;
							Class436 class436_74_ = Class436.method5240(method7837().aClass436_4823);
							class436_74_.aFloat4850 += (float) i;
							class436_74_.aFloat4853 += (float) i_67_;
							method7841(class436_74_);
							class436_74_.method5239();
						}
					}
				}
			}
		}
	}

	public final void method11059(int i) {
		aBool12147 = true;
		Class431 class431 = new Class431(method7837());
		class431.aClass436_4823.aFloat4850 += aDouble12143 * (double) i;
		class431.aClass436_4823.aFloat4853 += (double) i * aDouble12149;
		if (aBool12137)
			class431.aClass436_4823.aFloat4852 = (float) (Class54.method944((int) (class431.aClass436_4823.aFloat4850), (int) (class431.aClass436_4823.aFloat4853), aByte10839, 1645246440) - anInt12157 * 1417726395);
		else if (-1 != 1477671255 * anInt12141) {
			class431.aClass436_4823.aFloat4852 += ((double) i * (aDouble12152 * 0.5 * (double) i) + aDouble12151 * (double) i);
			aDouble12151 += (double) i * aDouble12152;
		} else
			class431.aClass436_4823.aFloat4852 += aDouble12151 * (double) i;
		class431.aClass425_4822.method5090(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12151, aDouble12150));
		Class425 class425 = Class425.method5081();
		class425.method5090(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12143, aDouble12149) - 3.1415927F));
		class431.aClass425_4822.method5096(class425);
		class425.method5080();
		method7843(class431);
		if (aClass688_12153.method8138(1, 2142374809) && aClass688_12153.method8135(-1580525461))
			aClass688_12153.method8137(-2102609495);
	}

	Class563 method9966(Class167 class167) {
		Class177 class177 = method11049(class167, 2048, -1454127383);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		method11053(class167, class177, class433, -1451534106);
		Class563 class563 = Class225.method3212(false, 614921985);
		class177.method2490(class433, aClass178Array10842[0], 0);
		if (null != aClass627_12148) {
			Class166 class166 = aClass627_12148.method7476();
			class167.method2351(class166);
		}
		aBool12138 = class177.method2511();
		class177.method2579();
		anInt12136 = class177.method2562() * -1752738391;
		return class563;
	}

	boolean method9956() {
		return aBool12138;
	}

	final boolean method9972() {
		return false;
	}

	final void method9976() {
		throw new IllegalStateException();
	}

	public final void method11060(int i) {
		aBool12147 = true;
		Class431 class431 = new Class431(method7837());
		class431.aClass436_4823.aFloat4850 += aDouble12143 * (double) i;
		class431.aClass436_4823.aFloat4853 += (double) i * aDouble12149;
		if (aBool12137)
			class431.aClass436_4823.aFloat4852 = (float) (Class54.method944((int) (class431.aClass436_4823.aFloat4850), (int) (class431.aClass436_4823.aFloat4853), aByte10839, 2084487969) - anInt12157 * 1417726395);
		else if (-1 != 1477671255 * anInt12141) {
			class431.aClass436_4823.aFloat4852 += ((double) i * (aDouble12152 * 0.5 * (double) i) + aDouble12151 * (double) i);
			aDouble12151 += (double) i * aDouble12152;
		} else
			class431.aClass436_4823.aFloat4852 += aDouble12151 * (double) i;
		class431.aClass425_4822.method5090(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12151, aDouble12150));
		Class425 class425 = Class425.method5081();
		class425.method5090(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12143, aDouble12149) - 3.1415927F));
		class431.aClass425_4822.method5096(class425);
		class425.method5080();
		method7843(class431);
		if (aClass688_12153.method8138(1, 1682347026) && aClass688_12153.method8135(153162675))
			aClass688_12153.method8137(732663301);
	}

	public void method11061() {
		if (aClass627_12148 != null)
			aClass627_12148.method7469();
	}

	public void method11062() {
		if (aClass627_12148 != null)
			aClass627_12148.method7469();
	}
}
