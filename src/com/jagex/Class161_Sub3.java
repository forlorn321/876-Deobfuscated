/* Class161_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class161_Sub3 extends Class161 {
	int anInt9605;
	int anInt9606;
	Class180_Sub2 aClass180_Sub2_9607;
	int anInt9608;
	int anInt9609;
	int anInt9610;
	int anInt9611;
	int[][][] anIntArrayArrayArray9612;
	float[][] aFloatArrayArray9613;
	int[][][] anIntArrayArrayArray9614;
	float aFloat9615 = 3.4028235E38F;
	float aFloat9616 = -3.4028235E38F;
	Class527_Sub11[][][] aClass527_Sub11ArrayArrayArray9617;
	int[][][] anIntArrayArrayArray9618;
	int[][][] anIntArrayArrayArray9619;
	int[][][] anIntArrayArrayArray9620;
	short[][] aShortArrayArray9621;
	float[][] aFloatArrayArray9622;
	Class355 aClass355_9623;
	Class527[] aClass527Array9624;
	byte[][] aByteArrayArray9625;
	Class694 aClass694_9626 = new Class694();
	byte[][] aByteArrayArray9627;
	Interface37 anInterface37_9628;
	int[][][] anIntArrayArrayArray9629;
	int anInt9630;
	int anInt9631;
	Interface37 anInterface37_9632;
	static final int anInt9633 = 74;
	int[] anIntArray9634;
	float[][] aFloatArrayArray9635;
	static final int anInt9636 = 1;
	Class14 aClass14_9637;
	Class527[] aClass527Array9638;
	int anInt9639;
	ByteBuffer aByteBuffer9640;
	ByteBuffer aByteBuffer9641;
	int anInt9642;
	int[] anIntArray9643 = new int[1];
	Class351 aClass351_9644;
	int anInt9645;
	int[] anIntArray9646;

	public boolean method2614(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		if (aClass351_9644 == null || class527_sub8_sub8 == null)
			return false;
		int i_3_ = (i - (i_0_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
		int i_4_ = (i_1_ - (i_0_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
		return aClass351_9644.method6188(class527_sub8_sub8, i_3_, i_4_);
	}

	public void method2587(int i, int i_5_, int i_6_) {
		i = Math.min(aByteArrayArray9627.length - 1, Math.max(0, i));
		i_5_ = Math.min(aByteArrayArray9627[i].length - 1, Math.max(0, i_5_));
		if ((aByteArrayArray9627[i][i_5_] & 0xff) < i_6_)
			aByteArrayArray9627[i][i_5_] = (byte) i_6_;
	}

	public void method2604(int i, int i_7_, int[] is, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub2_9607.aClass181_2059;
		if (is_10_ != null && anIntArrayArrayArray9620 == null)
			anIntArrayArrayArray9620 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_8_ != null && anIntArrayArrayArray9629 == null)
			anIntArrayArrayArray9629 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9612[i][i_7_] = is;
		anIntArrayArrayArray9614[i][i_7_] = is_9_;
		anIntArrayArrayArray9618[i][i_7_] = is_11_;
		anIntArrayArrayArray9619[i][i_7_] = is_12_;
		if (anIntArrayArrayArray9620 != null)
			anIntArrayArrayArray9620[i][i_7_] = is_10_;
		if (anIntArrayArrayArray9629 != null)
			anIntArrayArrayArray9629[i][i_7_] = is_8_;
		Class527_Sub11[] class527_sub11s = (aClass527_Sub11ArrayArrayArray9617[i][i_7_] = new Class527_Sub11[is_11_.length]);
		for (int i_15_ = 0; i_15_ < is_11_.length; i_15_++) {
			int i_16_ = is_13_[i_15_];
			int i_17_ = is_14_[i_15_];
			if ((anInt9611 & 0x20) != 0 && i_16_ != -1 && class181.method3544(i_16_, (byte) -61).aBool1806) {
				i_17_ = 128;
				i_16_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_17_ << 14) | (long) i_16_);
			Class527 class527;
			for (class527 = aClass14_9637.method709(l); class527 != null; class527 = aClass14_9637.method715(407663826)) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) class527;
				if (class527_sub11.anInt10435 == i_16_ && class527_sub11.aFloat10441 == (float) i_17_ && class527_sub11.aClass178_10436.method3059(class178, (byte) -34))
					break;
			}
			if (class527 == null) {
				class527_sub11s[i_15_] = new Class527_Sub11(this, i_16_, i_17_, class178);
				aClass14_9637.method714(class527_sub11s[i_15_], l);
			} else
				class527_sub11s[i_15_] = (Class527_Sub11) class527;
		}
		if (bool)
			aByteArrayArray9625[i][i_7_] |= 0x1;
		if (is_11_.length > anInt9639)
			anInt9639 = is_11_.length;
		anInt9631 += is_11_.length;
	}

	Class161_Sub3(Class180_Sub2 class180_sub2, int i, int i_18_, int i_19_, int i_20_, int[][] is, int[][] is_21_, int i_22_) {
		super(i_19_, i_20_, i_22_, is);
		anIntArray9634 = new int[1];
		anIntArray9646 = new int[1];
		aClass180_Sub2_9607 = class180_sub2;
		anInt9608 = anInt1753 * 1252000143 - 2;
		anInt9609 = 1 << anInt9608;
		anInt9610 = i;
		anInt9611 = i_18_;
		anIntArrayArrayArray9629 = new int[i_19_][i_20_][];
		aClass527_Sub11ArrayArrayArray9617 = new Class527_Sub11[i_19_][i_20_][];
		anIntArrayArrayArray9612 = new int[i_19_][i_20_][];
		anIntArrayArrayArray9614 = new int[i_19_][i_20_][];
		anIntArrayArrayArray9618 = new int[i_19_][i_20_][];
		anIntArrayArrayArray9619 = new int[i_19_][i_20_][];
		aShortArrayArray9621 = new short[i_19_ * i_20_][];
		aByteArrayArray9625 = new byte[i_19_][i_20_];
		aByteArrayArray9627 = new byte[i_19_ + 1][i_20_ + 1];
		aFloatArrayArray9622 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		aFloatArrayArray9635 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		aFloatArrayArray9613 = (new float[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
		for (int i_23_ = 0; i_23_ <= anInt1751 * -533476177; i_23_++) {
			for (int i_24_ = 0; i_24_ <= anInt1750 * 1210322533; i_24_++) {
				int i_25_ = anIntArrayArray1754[i_24_][i_23_];
				if ((float) i_25_ < aFloat9615)
					aFloat9615 = (float) i_25_;
				if ((float) i_25_ > aFloat9616)
					aFloat9616 = (float) i_25_;
				if (i_24_ > 0 && i_23_ > 0 && i_24_ < anInt1750 * 1210322533 && i_23_ < anInt1751 * -533476177) {
					int i_26_ = is_21_[i_24_ + 1][i_23_] - is_21_[i_24_ - 1][i_23_];
					int i_27_ = is_21_[i_24_][i_23_ + 1] - is_21_[i_24_][i_23_ - 1];
					float f = (float) (1.0 / Math.sqrt((double) (i_26_ * i_26_ + 4 * i_22_ * i_22_ + i_27_ * i_27_)));
					aFloatArrayArray9622[i_24_][i_23_] = (float) i_26_ * f;
					aFloatArrayArray9635[i_24_][i_23_] = (float) (-i_22_ * 2) * f;
					aFloatArrayArray9613[i_24_][i_23_] = (float) i_27_ * f;
				}
			}
		}
		aFloat9615--;
		aFloat9616++;
		aClass14_9637 = new Class14(128);
		if ((anInt9611 & 0x10) != 0)
			aClass351_9644 = new Class351(aClass180_Sub2_9607, this);
	}

	public void method2588() {
		if (anInt9631 <= 0) {
			aClass351_9644 = null;
			method15306();
		} else {
			byte[][] is = (new byte[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
			for (int i = 1; i < anInt1750 * 1210322533; i++) {
				for (int i_28_ = 1; i_28_ < anInt1751 * -533476177; i_28_++)
					is[i][i_28_] = (byte) ((aByteArrayArray9627[i - 1][i_28_] >> 2) + (aByteArrayArray9627[i + 1][i_28_] >> 3) + (aByteArrayArray9627[i][i_28_ - 1] >> 2) + (aByteArrayArray9627[i][i_28_ + 1] >> 3) + (aByteArrayArray9627[i][i_28_] >> 1));
			}
			aClass527Array9638 = new Class527[aClass14_9637.method711(-1409648774)];
			aClass14_9637.method708(aClass527Array9638, 1730342402);
			for (int i = 0; i < aClass527Array9638.length; i++)
				((Class527_Sub11) aClass527Array9638[i]).method16077(anInt9631);
			anInt9642 = 20;
			if (anIntArrayArrayArray9620 != null)
				anInt9642 += 4;
			if ((anInt9611 & 0x7) != 0)
				anInt9642 += 12;
			aByteBuffer9640 = aClass180_Sub2_9607.method14892(anInt9631 * 4);
			aByteBuffer9641 = aClass180_Sub2_9607.method14892(anInt9631 * anInt9642);
			Class527_Sub11[] class527_sub11s = new Class527_Sub11[anInt9631];
			int i = Class203.method3783(anInt9631 / 4, 1611647501);
			if (i < 1)
				i = 1;
			Class14 class14 = new Class14(i);
			Class527_Sub11[] class527_sub11s_29_ = new Class527_Sub11[anInt9639];
			for (int i_30_ = 0; i_30_ < anInt1750 * 1210322533; i_30_++) {
				for (int i_31_ = 0; i_31_ < anInt1751 * -533476177; i_31_++)
					method15314(i_30_, i_31_, is, class527_sub11s_29_, class14, class527_sub11s);
			}
			for (int i_32_ = 0; i_32_ < anInt9606; i_32_++) {
				Class527_Sub11 class527_sub11 = class527_sub11s[i_32_];
				if (class527_sub11 != null)
					class527_sub11.method16092(i_32_);
			}
			for (int i_33_ = 0; i_33_ < anInt1750 * 1210322533; i_33_++) {
				for (int i_34_ = 0; i_34_ < anInt1751 * -533476177; i_34_++) {
					short[] is_35_ = (aShortArrayArray9621[i_34_ * (anInt1750 * 1210322533) + i_33_]);
					if (is_35_ != null) {
						int i_36_ = 0;
						int i_37_ = 0;
						while (i_37_ < is_35_.length) {
							int i_38_ = is_35_[i_37_++] & 0xffff;
							int i_39_ = is_35_[i_37_++] & 0xffff;
							int i_40_ = is_35_[i_37_++] & 0xffff;
							Class527_Sub11 class527_sub11 = class527_sub11s[i_38_];
							Class527_Sub11 class527_sub11_41_ = class527_sub11s[i_39_];
							Class527_Sub11 class527_sub11_42_ = class527_sub11s[i_40_];
							Class527_Sub11 class527_sub11_43_ = null;
							if (class527_sub11 != null) {
								class527_sub11.method16095(i_33_, i_34_, i_36_);
								class527_sub11_43_ = class527_sub11;
							}
							if (class527_sub11_41_ != null) {
								class527_sub11_41_.method16095(i_33_, i_34_, i_36_);
								if (class527_sub11_43_ == null || ((class527_sub11_41_.aLong7106 * -8168620736534281759L) < (class527_sub11_43_.aLong7106 * -8168620736534281759L)))
									class527_sub11_43_ = class527_sub11_41_;
							}
							if (class527_sub11_42_ != null) {
								class527_sub11_42_.method16095(i_33_, i_34_, i_36_);
								if (class527_sub11_43_ == null || ((class527_sub11_42_.aLong7106 * -8168620736534281759L) < (class527_sub11_43_.aLong7106 * -8168620736534281759L)))
									class527_sub11_43_ = class527_sub11_42_;
							}
							if (class527_sub11_43_ != null) {
								if (class527_sub11 != null)
									class527_sub11_43_.method16092(i_38_);
								if (class527_sub11_41_ != null)
									class527_sub11_43_.method16092(i_39_);
								if (class527_sub11_42_ != null)
									class527_sub11_43_.method16092(i_40_);
								class527_sub11_43_.method16095(i_33_, i_34_, i_36_);
							}
							i_36_++;
						}
					}
				}
			}
			anInt9605 = 0;
			for (int i_44_ = 0; i_44_ < aClass527Array9638.length; i_44_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i_44_];
				if (class527_sub11.anInt10437 > 0)
					aClass527Array9638[anInt9605++] = class527_sub11;
			}
			aClass527Array9624 = new Class527[anInt9605];
			long[] ls = new long[anInt9605];
			for (int i_45_ = 0; i_45_ < anInt9605; i_45_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i_45_];
				ls[i_45_] = class527_sub11.aLong7106 * -8168620736534281759L;
				aClass527Array9624[i_45_] = class527_sub11;
			}
			Class509.method8418(ls, aClass527Array9624, (byte) -2);
			method15310();
		}
	}

	public void method2611(int i, int i_46_, int[] is, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, int[] is_53_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub2_9607.aClass181_2059;
		if (is_49_ != null && anIntArrayArrayArray9620 == null)
			anIntArrayArrayArray9620 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_47_ != null && anIntArrayArrayArray9629 == null)
			anIntArrayArrayArray9629 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9612[i][i_46_] = is;
		anIntArrayArrayArray9614[i][i_46_] = is_48_;
		anIntArrayArrayArray9618[i][i_46_] = is_50_;
		anIntArrayArrayArray9619[i][i_46_] = is_51_;
		if (anIntArrayArrayArray9620 != null)
			anIntArrayArrayArray9620[i][i_46_] = is_49_;
		if (anIntArrayArrayArray9629 != null)
			anIntArrayArrayArray9629[i][i_46_] = is_47_;
		Class527_Sub11[] class527_sub11s = (aClass527_Sub11ArrayArrayArray9617[i][i_46_] = new Class527_Sub11[is_50_.length]);
		for (int i_54_ = 0; i_54_ < is_50_.length; i_54_++) {
			int i_55_ = is_52_[i_54_];
			int i_56_ = is_53_[i_54_];
			if ((anInt9611 & 0x20) != 0 && i_55_ != -1 && class181.method3544(i_55_, (byte) -94).aBool1806) {
				i_56_ = 128;
				i_55_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_56_ << 14) | (long) i_55_);
			Class527 class527;
			for (class527 = aClass14_9637.method709(l); class527 != null; class527 = aClass14_9637.method715(-1240411651)) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) class527;
				if (class527_sub11.anInt10435 == i_55_ && class527_sub11.aFloat10441 == (float) i_56_ && class527_sub11.aClass178_10436.method3059(class178, (byte) 6))
					break;
			}
			if (class527 == null) {
				class527_sub11s[i_54_] = new Class527_Sub11(this, i_55_, i_56_, class178);
				aClass14_9637.method714(class527_sub11s[i_54_], l);
			} else
				class527_sub11s[i_54_] = (Class527_Sub11) class527;
		}
		if (bool)
			aByteArrayArray9625[i][i_46_] |= 0x1;
		if (is_50_.length > anInt9639)
			anInt9639 = is_50_.length;
		anInt9631 += is_50_.length;
	}

	void method15306() {
		if ((anInt9610 & 0x2) == 0) {
			anIntArrayArrayArray9614 = null;
			anIntArrayArrayArray9612 = null;
			anIntArrayArrayArray9618 = null;
		}
		anIntArrayArrayArray9620 = null;
		anIntArrayArrayArray9619 = null;
		anIntArrayArrayArray9629 = null;
		aClass527_Sub11ArrayArrayArray9617 = null;
		aByteArrayArray9627 = null;
		aClass14_9637 = null;
		aClass527Array9638 = null;
		aFloatArrayArray9613 = null;
		aFloatArrayArray9635 = null;
		aFloatArrayArray9622 = null;
	}

	public void method2631(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_57_, int i_58_, int i_59_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_60_ = (i - (i_57_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_61_ = (i_58_ - (i_57_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6184(class527_sub8_sub8, i_60_, i_61_);
		}
	}

	public void method2591(int i, int i_62_, int i_63_, boolean[][] bools, boolean bool, int i_64_) {
		if (aClass527Array9624 != null) {
			int i_65_ = i_63_ + i_63_ + 1;
			i_65_ *= i_65_;
			if (anIntArray9646.length < i_65_)
				anIntArray9646 = new int[i_65_];
			int i_66_ = i - i_63_;
			int i_67_ = i_66_;
			if (i_66_ < 0)
				i_66_ = 0;
			int i_68_ = i_62_ - i_63_;
			int i_69_ = i_68_;
			if (i_68_ < 0)
				i_68_ = 0;
			int i_70_ = i + i_63_;
			if (i_70_ > anInt1750 * 1210322533 - 1)
				i_70_ = anInt1750 * 1210322533 - 1;
			int i_71_ = i_62_ + i_63_;
			if (i_71_ > anInt1751 * -533476177 - 1)
				i_71_ = anInt1751 * -533476177 - 1;
			anInt9645 = 0;
			for (int i_72_ = i_66_; i_72_ <= i_70_; i_72_++) {
				boolean[] bools_73_ = bools[i_72_ - i_67_];
				for (int i_74_ = i_68_; i_74_ <= i_71_; i_74_++) {
					if (bools_73_[i_74_ - i_69_])
						anIntArray9646[anInt9645++] = i_74_ * (anInt1750 * 1210322533) + i_72_;
				}
			}
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_75_ = 0; i_75_ < aClass527Array9624.length; i_75_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_75_];
				class527_sub11.method16082(anIntArray9646, anInt9645);
			}
			int i_76_ = bytebuffer.position();
			Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
			aClass180_Sub2_9607.method14998();
			if (aClass180_Sub2_9607.anInt9562 > 0) {
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9607.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 0 & 0xff) / 255.0F));
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9607.aFloat9517));
				class326.aClass441_3589.method7123(aClass180_Sub2_9607.aClass427_9454);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9607.aFloat9565 - aClass180_Sub2_9607.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if (i_76_ != 0) {
				Interface44 interface44 = aClass180_Sub2_9607.method15136(i_76_ / 2);
				interface44.method213(0, i_76_, aClass180_Sub2_9607.aLong9439);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method15001(interface44);
				class326.method5770(Class427.aClass427_4808);
				if ((anInt9611 & 0x7) == 0) {
					int i_77_ = 0;
					for (int i_78_ = 0; i_78_ < aClass527Array9624.length; i_78_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_78_];
						if (class527_sub11.anInt10439 != 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, ((float) aClass180_Sub2_9607.anInt9557 + ((float) ((class527_sub11.aClass178_10436.anInt2051) * -1449092429) / 255.0F * (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777))));
								class326.aClass441_3587.method7128(1.0F / (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							boolean bool_79_ = false;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -20));
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								bool_79_ = !Class306.method5607(class163.aByte1801, -1088851960);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_77_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							class326.method5757(bool_79_);
							i_77_ += class527_sub11.anInt10439;
						}
					}
				} else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9607.aFloatArray9507[0], aClass180_Sub2_9607.aFloatArray9507[1], aClass180_Sub2_9607.aFloatArray9507[2]);
					class326.aClass442_3590.method7138((aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9583), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9513), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9448));
					int i_80_ = 0;
					for (int i_81_ = 0; i_81_ < aClass527Array9624.length; i_81_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_81_];
						if (class527_sub11.anInt10439 > 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								float f = 0.15F;
								class326.aClass441_3587.method7118(0.0F, 1.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f), 0.0F, 256.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							byte i_82_ = 11;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -91));
								i_82_ = class163.aByte1801;
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								class326.method5755(class163.aByte1775);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_80_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							switch (i_82_) {
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass180_Sub2_9607.aBool9597 && (anInt9611 & 0x8) != 0 && aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443.method18052((byte) -74)) {
									Class350_Sub1_Sub2 class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443);
									if (i_82_ == 2)
										class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9545);
									class350_sub1_sub2.aClass427_11533.method6750(aClass180_Sub2_9607.aClass427_9474);
									class350_sub1_sub2.aClass427_11527.method6815(1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F, 1.0F);
									class350_sub1_sub2.aClass442_11547.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
									Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -39));
									class350_sub1_sub2.anInt11543 = class163.aByte1775 * 2007712759;
									class350_sub1_sub2.anInt11545 = (class527_sub11.anInt10440 * -481045151);
									class350_sub1_sub2.anInt11546 = ((class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1) * 527612167);
									class350_sub1_sub2.anInt11531 = i_80_ * -1248930933;
									class350_sub1_sub2.anInt11548 = (class527_sub11.anInt10439 / 3 * -1274173737);
									class350_sub1_sub2.aClass441_11542.method7119(class326.aClass441_3587);
									class350_sub1_sub2.aClass442_11540.method7146(class326.aClass442_3588);
									class350_sub1_sub2.aClass441_11525.method7119(class326.aClass441_3589);
									class350_sub1_sub2.aClass442_11544.method7146(class326.aClass442_3581);
									class350_sub1_sub2.method18055(697909491);
								} else
									class326.method5758(0);
								break;
							case 6:
								class326.method5757(!Class306.method5607(i_82_, -1088851960));
								break;
							case 1:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5762();
								else
									class326.method5754(0);
								break;
							default:
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5772();
								else
									class326.method5758(0);
								break;
							case 7:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								class326.aClass427_3577.method6742();
								class326.anInterface39_3582 = aClass180_Sub2_9607.method14925();
								class326.method5760(0);
							}
							i_80_ += class527_sub11.anInt10439;
						}
					}
				}
			}
			if (!aClass694_9626.method14088(-447678035)) {
				aClass180_Sub2_9607.method15238(128);
				aClass180_Sub2_9607.method14951(false);
				Class442 class442 = new Class442(class326.aClass442_3581);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass694_9626.iterator();
				while (iterator.hasNext()) {
					Class527_Sub23 class527_sub23 = (Class527_Sub23) iterator.next();
					class527_sub23.method16239(class326, i, i_62_, i_63_, bools, bool);
				}
				class326.aClass442_3581.method7146(class442);
			}
			if (aClass351_9644 != null) {
				aClass180_Sub2_9607.method15238(1);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				Class427 class427 = aClass180_Sub2_9607.aClass427_9435;
				class427.method6742();
				class427.aFloatArray4807[13] = -1.0F;
				class326.method5770(class427);
				aClass351_9644.method6182(class326, i, i_62_, i_63_, bools, bool);
			}
		}
	}

	public void method2594(int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, boolean[][] bools) {
		if (anInt9631 > 0) {
			Interface44 interface44 = aClass180_Sub2_9607.method15136(anInt9630);
			int i_89_ = 0;
			int i_90_ = 32767;
			int i_91_ = -32768;
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_92_ = i_86_; i_92_ < i_88_; i_92_++) {
				int i_93_ = i_92_ * (anInt1750 * 1210322533) + i_85_;
				for (int i_94_ = i_85_; i_94_ < i_87_; i_94_++) {
					if (bools[i_94_ - i_85_][i_92_ - i_86_]) {
						short[] is = aShortArrayArray9621[i_93_];
						if (is != null) {
							for (int i_95_ = 0; i_95_ < is.length; i_95_++) {
								int i_96_ = is[i_95_] & 0xffff;
								if (i_96_ > i_91_)
									i_91_ = i_96_;
								if (i_96_ < i_90_)
									i_90_ = i_96_;
								bytebuffer.putShort((short) i_96_);
								i_89_++;
							}
						}
					}
					i_93_++;
				}
			}
			interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9607.aLong9439);
			if (i_89_ > 0) {
				aClass180_Sub2_9607.method14998();
				Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				aClass180_Sub2_9607.method15001(interface44);
				aClass180_Sub2_9607.method3180(Class432.aClass432_4853);
				float f = (float) aClass180_Sub2_9607.method3285(2068789425).method2728();
				float f_97_ = (float) aClass180_Sub2_9607.method3285(674499019).method2729();
				Class432 class432 = new Class432();
				Class432 class432_98_ = new Class432();
				class432.method6956(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class432_98_.method6892(((float) i_84_ / (256.0F * (float) (anInt1752 * 1048375491))), ((float) -i_84_ / (256.0F * (float) (anInt1752 * 1048375491))), 1.0F / (aFloat9616 - aFloat9615));
				class432_98_.method6896(((float) i - (float) (i_85_ * i_84_) / 256.0F), ((float) i_83_ + (float) (i_88_ * i_84_) / 256.0F), -aFloat9615 / (aFloat9616 - aFloat9615));
				class432_98_.method6893(2.0F / f, 2.0F / f_97_, 1.0F);
				class432_98_.method6896(-1.0F, -1.0F, 0.0F);
				aClass180_Sub2_9607.aClass432_9512.method6897(class432, class432_98_);
				aClass180_Sub2_9607.aClass427_9435.method6784(aClass180_Sub2_9607.aClass432_9512);
				aClass180_Sub2_9607.method3183(aClass180_Sub2_9607.aClass427_9435);
				class326.method5770(Class427.aClass427_4808);
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
				class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
				class326.aClass427_3583.method6742();
				class326.anInt3598 = i_90_;
				class326.anInt3597 = i_91_ - i_90_ + 1;
				class326.anInt3584 = 0;
				class326.anInt3599 = i_89_ / 3;
				if (aClass180_Sub2_9607.aBool9559) {
					aClass180_Sub2_9607.method3182(false);
					class326.method5757(false);
					aClass180_Sub2_9607.method3182(true);
				} else
					class326.method5757(false);
			}
		}
	}

	public Class527_Sub8_Sub8 method2597(int i, int i_99_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9625[i][i_99_] & 0x1) == 0)
			return null;
		int i_100_ = anInt1752 * 1048375491 >> aClass180_Sub2_9607.anInt9522;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_101_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_100_, i_100_)) {
			class527_sub8_sub8_sub2_101_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_101_.method18743();
		} else
			class527_sub8_sub8_sub2_101_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9607, i_100_, i_100_);
		class527_sub8_sub8_sub2_101_.method18741(0, 0, i_100_, i_100_);
		method15309(class527_sub8_sub8_sub2_101_, i, i_99_);
		return class527_sub8_sub8_sub2_101_;
	}

	public void method2592(int i, int i_102_, int[] is, int[] is_103_, int[] is_104_, int[] is_105_, int[] is_106_, int[] is_107_, int[] is_108_, int[] is_109_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub2_9607.aClass181_2059;
		if (is_105_ != null && anIntArrayArrayArray9620 == null)
			anIntArrayArrayArray9620 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_103_ != null && anIntArrayArrayArray9629 == null)
			anIntArrayArrayArray9629 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9612[i][i_102_] = is;
		anIntArrayArrayArray9614[i][i_102_] = is_104_;
		anIntArrayArrayArray9618[i][i_102_] = is_106_;
		anIntArrayArrayArray9619[i][i_102_] = is_107_;
		if (anIntArrayArrayArray9620 != null)
			anIntArrayArrayArray9620[i][i_102_] = is_105_;
		if (anIntArrayArrayArray9629 != null)
			anIntArrayArrayArray9629[i][i_102_] = is_103_;
		Class527_Sub11[] class527_sub11s = (aClass527_Sub11ArrayArrayArray9617[i][i_102_] = new Class527_Sub11[is_106_.length]);
		for (int i_110_ = 0; i_110_ < is_106_.length; i_110_++) {
			int i_111_ = is_108_[i_110_];
			int i_112_ = is_109_[i_110_];
			if ((anInt9611 & 0x20) != 0 && i_111_ != -1 && class181.method3544(i_111_, (byte) -70).aBool1806) {
				i_112_ = 128;
				i_111_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_112_ << 14) | (long) i_111_);
			Class527 class527;
			for (class527 = aClass14_9637.method709(l); class527 != null; class527 = aClass14_9637.method715(1583641269)) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) class527;
				if (class527_sub11.anInt10435 == i_111_ && class527_sub11.aFloat10441 == (float) i_112_ && class527_sub11.aClass178_10436.method3059(class178, (byte) 82))
					break;
			}
			if (class527 == null) {
				class527_sub11s[i_110_] = new Class527_Sub11(this, i_111_, i_112_, class178);
				aClass14_9637.method714(class527_sub11s[i_110_], l);
			} else
				class527_sub11s[i_110_] = (Class527_Sub11) class527;
		}
		if (bool)
			aByteArrayArray9625[i][i_102_] |= 0x1;
		if (is_106_.length > anInt9639)
			anInt9639 = is_106_.length;
		anInt9631 += is_106_.length;
	}

	public boolean method2598(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_113_, int i_114_, int i_115_, boolean bool) {
		if (aClass351_9644 == null || class527_sub8_sub8 == null)
			return false;
		int i_116_ = (i - (i_113_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
		int i_117_ = (i_114_ - (i_113_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
		return aClass351_9644.method6188(class527_sub8_sub8, i_116_, i_117_);
	}

	public void method2633(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_118_, int i_119_, int i_120_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_121_ = (i - (i_118_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_122_ = (i_119_ - (i_118_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6183(class527_sub8_sub8, i_121_, i_122_);
		}
	}

	void method15307() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	public void method2601(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9626.method14147(new Class527_Sub23(aClass180_Sub2_9607, this, class527_sub16, is), -540825337);
	}

	public void method2602(int i, int i_123_, int i_124_) {
		i = Math.min(aByteArrayArray9627.length - 1, Math.max(0, i));
		i_123_ = Math.min(aByteArrayArray9627[i].length - 1, Math.max(0, i_123_));
		if ((aByteArrayArray9627[i][i_123_] & 0xff) < i_124_)
			aByteArrayArray9627[i][i_123_] = (byte) i_124_;
	}

	public void method2603(int i, int i_125_, int i_126_) {
		i = Math.min(aByteArrayArray9627.length - 1, Math.max(0, i));
		i_125_ = Math.min(aByteArrayArray9627[i].length - 1, Math.max(0, i_125_));
		if ((aByteArrayArray9627[i][i_125_] & 0xff) < i_126_)
			aByteArrayArray9627[i][i_125_] = (byte) i_126_;
	}

	public void method2589(int i, int i_127_, int[] is, int[] is_128_, int[] is_129_, int[] is_130_, int[] is_131_, int[] is_132_, int[] is_133_, int[] is_134_, int[] is_135_, int[] is_136_, int[] is_137_, Class178 class178, boolean bool) {
		int i_138_ = is_134_.length;
		int[] is_139_ = new int[i_138_ * 3];
		int[] is_140_ = new int[i_138_ * 3];
		int[] is_141_ = new int[i_138_ * 3];
		int[] is_142_ = new int[i_138_ * 3];
		int[] is_143_ = new int[i_138_ * 3];
		int[] is_144_ = new int[i_138_ * 3];
		int[] is_145_ = is_128_ != null ? new int[i_138_ * 3] : null;
		int[] is_146_ = is_130_ != null ? new int[i_138_ * 3] : null;
		int i_147_ = 0;
		for (int i_148_ = 0; i_148_ < i_138_; i_148_++) {
			int i_149_ = is_131_[i_148_];
			int i_150_ = is_132_[i_148_];
			int i_151_ = is_133_[i_148_];
			is_139_[i_147_] = is[i_149_];
			is_140_[i_147_] = is_129_[i_149_];
			is_141_[i_147_] = is_134_[i_148_];
			is_143_[i_147_] = is_136_[i_148_];
			is_144_[i_147_] = is_137_[i_148_];
			is_142_[i_147_] = is_135_ != null ? is_135_[i_148_] : is_134_[i_148_];
			if (is_128_ != null)
				is_145_[i_147_] = is_128_[i_149_];
			if (is_130_ != null)
				is_146_[i_147_] = is_130_[i_149_];
			i_147_++;
			is_139_[i_147_] = is[i_150_];
			is_140_[i_147_] = is_129_[i_150_];
			is_141_[i_147_] = is_134_[i_148_];
			is_143_[i_147_] = is_136_[i_148_];
			is_144_[i_147_] = is_137_[i_148_];
			is_142_[i_147_] = is_135_ != null ? is_135_[i_148_] : is_134_[i_148_];
			if (is_128_ != null)
				is_145_[i_147_] = is_128_[i_150_];
			if (is_130_ != null)
				is_146_[i_147_] = is_130_[i_150_];
			i_147_++;
			is_139_[i_147_] = is[i_151_];
			is_140_[i_147_] = is_129_[i_151_];
			is_141_[i_147_] = is_134_[i_148_];
			is_143_[i_147_] = is_136_[i_148_];
			is_144_[i_147_] = is_137_[i_148_];
			is_142_[i_147_] = is_135_ != null ? is_135_[i_148_] : is_134_[i_148_];
			if (is_128_ != null)
				is_145_[i_147_] = is_128_[i_151_];
			if (is_130_ != null)
				is_146_[i_147_] = is_130_[i_151_];
			i_147_++;
		}
		method2604(i, i_127_, is_139_, is_145_, is_140_, is_146_, is_141_, is_142_, is_143_, is_144_, class178, bool);
	}

	public void method2600(int i, int i_152_, int i_153_, boolean[][] bools, boolean bool, int i_154_) {
		if (aClass527Array9624 != null) {
			int i_155_ = i_153_ + i_153_ + 1;
			i_155_ *= i_155_;
			if (anIntArray9646.length < i_155_)
				anIntArray9646 = new int[i_155_];
			int i_156_ = i - i_153_;
			int i_157_ = i_156_;
			if (i_156_ < 0)
				i_156_ = 0;
			int i_158_ = i_152_ - i_153_;
			int i_159_ = i_158_;
			if (i_158_ < 0)
				i_158_ = 0;
			int i_160_ = i + i_153_;
			if (i_160_ > anInt1750 * 1210322533 - 1)
				i_160_ = anInt1750 * 1210322533 - 1;
			int i_161_ = i_152_ + i_153_;
			if (i_161_ > anInt1751 * -533476177 - 1)
				i_161_ = anInt1751 * -533476177 - 1;
			anInt9645 = 0;
			for (int i_162_ = i_156_; i_162_ <= i_160_; i_162_++) {
				boolean[] bools_163_ = bools[i_162_ - i_157_];
				for (int i_164_ = i_158_; i_164_ <= i_161_; i_164_++) {
					if (bools_163_[i_164_ - i_159_])
						anIntArray9646[anInt9645++] = i_164_ * (anInt1750 * 1210322533) + i_162_;
				}
			}
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_165_ = 0; i_165_ < aClass527Array9624.length; i_165_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_165_];
				class527_sub11.method16082(anIntArray9646, anInt9645);
			}
			int i_166_ = bytebuffer.position();
			Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
			aClass180_Sub2_9607.method14998();
			if (aClass180_Sub2_9607.anInt9562 > 0) {
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9607.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 0 & 0xff) / 255.0F));
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9607.aFloat9517));
				class326.aClass441_3589.method7123(aClass180_Sub2_9607.aClass427_9454);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9607.aFloat9565 - aClass180_Sub2_9607.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if (i_166_ != 0) {
				Interface44 interface44 = aClass180_Sub2_9607.method15136(i_166_ / 2);
				interface44.method213(0, i_166_, aClass180_Sub2_9607.aLong9439);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method15001(interface44);
				class326.method5770(Class427.aClass427_4808);
				if ((anInt9611 & 0x7) == 0) {
					int i_167_ = 0;
					for (int i_168_ = 0; i_168_ < aClass527Array9624.length; i_168_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_168_];
						if (class527_sub11.anInt10439 != 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, ((float) aClass180_Sub2_9607.anInt9557 + ((float) ((class527_sub11.aClass178_10436.anInt2051) * -1449092429) / 255.0F * (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777))));
								class326.aClass441_3587.method7128(1.0F / (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							boolean bool_169_ = false;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -108));
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								bool_169_ = !Class306.method5607(class163.aByte1801, -1088851960);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_167_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							class326.method5757(bool_169_);
							i_167_ += class527_sub11.anInt10439;
						}
					}
				} else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9607.aFloatArray9507[0], aClass180_Sub2_9607.aFloatArray9507[1], aClass180_Sub2_9607.aFloatArray9507[2]);
					class326.aClass442_3590.method7138((aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9583), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9513), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9448));
					int i_170_ = 0;
					for (int i_171_ = 0; i_171_ < aClass527Array9624.length; i_171_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_171_];
						if (class527_sub11.anInt10439 > 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								float f = 0.15F;
								class326.aClass441_3587.method7118(0.0F, 1.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f), 0.0F, 256.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							byte i_172_ = 11;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -16));
								i_172_ = class163.aByte1801;
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								class326.method5755(class163.aByte1775);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_170_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							switch (i_172_) {
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass180_Sub2_9607.aBool9597 && (anInt9611 & 0x8) != 0 && aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443.method18052((byte) -26)) {
									Class350_Sub1_Sub2 class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443);
									if (i_172_ == 2)
										class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9545);
									class350_sub1_sub2.aClass427_11533.method6750(aClass180_Sub2_9607.aClass427_9474);
									class350_sub1_sub2.aClass427_11527.method6815(1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F, 1.0F);
									class350_sub1_sub2.aClass442_11547.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
									Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -106));
									class350_sub1_sub2.anInt11543 = class163.aByte1775 * 2007712759;
									class350_sub1_sub2.anInt11545 = (class527_sub11.anInt10440 * -481045151);
									class350_sub1_sub2.anInt11546 = ((class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1) * 527612167);
									class350_sub1_sub2.anInt11531 = i_170_ * -1248930933;
									class350_sub1_sub2.anInt11548 = (class527_sub11.anInt10439 / 3 * -1274173737);
									class350_sub1_sub2.aClass441_11542.method7119(class326.aClass441_3587);
									class350_sub1_sub2.aClass442_11540.method7146(class326.aClass442_3588);
									class350_sub1_sub2.aClass441_11525.method7119(class326.aClass441_3589);
									class350_sub1_sub2.aClass442_11544.method7146(class326.aClass442_3581);
									class350_sub1_sub2.method18055(-527312405);
								} else
									class326.method5758(0);
								break;
							case 6:
								class326.method5757(!Class306.method5607(i_172_, -1088851960));
								break;
							case 1:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5762();
								else
									class326.method5754(0);
								break;
							default:
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5772();
								else
									class326.method5758(0);
								break;
							case 7:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								class326.aClass427_3577.method6742();
								class326.anInterface39_3582 = aClass180_Sub2_9607.method14925();
								class326.method5760(0);
							}
							i_170_ += class527_sub11.anInt10439;
						}
					}
				}
			}
			if (!aClass694_9626.method14088(353122851)) {
				aClass180_Sub2_9607.method15238(128);
				aClass180_Sub2_9607.method14951(false);
				Class442 class442 = new Class442(class326.aClass442_3581);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass694_9626.iterator();
				while (iterator.hasNext()) {
					Class527_Sub23 class527_sub23 = (Class527_Sub23) iterator.next();
					class527_sub23.method16239(class326, i, i_152_, i_153_, bools, bool);
				}
				class326.aClass442_3581.method7146(class442);
			}
			if (aClass351_9644 != null) {
				aClass180_Sub2_9607.method15238(1);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				Class427 class427 = aClass180_Sub2_9607.aClass427_9435;
				class427.method6742();
				class427.aFloatArray4807[13] = -1.0F;
				class326.method5770(class427);
				aClass351_9644.method6182(class326, i, i_152_, i_153_, bools, bool);
			}
		}
	}

	public void method2606(int i, int i_173_, int[] is, int[] is_174_, int[] is_175_, int[] is_176_, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, Class178 class178, boolean bool) {
		Class181 class181 = aClass180_Sub2_9607.aClass181_2059;
		if (is_176_ != null && anIntArrayArrayArray9620 == null)
			anIntArrayArrayArray9620 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		if (is_174_ != null && anIntArrayArrayArray9629 == null)
			anIntArrayArrayArray9629 = new int[anInt1750 * 1210322533][anInt1751 * -533476177][];
		anIntArrayArrayArray9612[i][i_173_] = is;
		anIntArrayArrayArray9614[i][i_173_] = is_175_;
		anIntArrayArrayArray9618[i][i_173_] = is_177_;
		anIntArrayArrayArray9619[i][i_173_] = is_178_;
		if (anIntArrayArrayArray9620 != null)
			anIntArrayArrayArray9620[i][i_173_] = is_176_;
		if (anIntArrayArrayArray9629 != null)
			anIntArrayArrayArray9629[i][i_173_] = is_174_;
		Class527_Sub11[] class527_sub11s = (aClass527_Sub11ArrayArrayArray9617[i][i_173_] = new Class527_Sub11[is_177_.length]);
		for (int i_181_ = 0; i_181_ < is_177_.length; i_181_++) {
			int i_182_ = is_179_[i_181_];
			int i_183_ = is_180_[i_181_];
			if ((anInt9611 & 0x20) != 0 && i_182_ != -1 && class181.method3544(i_182_, (byte) -23).aBool1806) {
				i_183_ = 128;
				i_182_ = -1;
			}
			long l = ((long) (class178.anInt2051 * -1449092429) << 48 | (long) (class178.anInt2050 * 112490777) << 42 | (long) (class178.anInt2055 * -2080392837) << 28 | (long) (i_183_ << 14) | (long) i_182_);
			Class527 class527;
			for (class527 = aClass14_9637.method709(l); class527 != null; class527 = aClass14_9637.method715(-1904387701)) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) class527;
				if (class527_sub11.anInt10435 == i_182_ && class527_sub11.aFloat10441 == (float) i_183_ && class527_sub11.aClass178_10436.method3059(class178, (byte) -7))
					break;
			}
			if (class527 == null) {
				class527_sub11s[i_181_] = new Class527_Sub11(this, i_182_, i_183_, class178);
				aClass14_9637.method714(class527_sub11s[i_181_], l);
			} else
				class527_sub11s[i_181_] = (Class527_Sub11) class527;
		}
		if (bool)
			aByteArrayArray9625[i][i_173_] |= 0x1;
		if (is_177_.length > anInt9639)
			anInt9639 = is_177_.length;
		anInt9631 += is_177_.length;
	}

	public void method2607(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, boolean[][] bools) {
		if (anInt9631 > 0) {
			Interface44 interface44 = aClass180_Sub2_9607.method15136(anInt9630);
			int i_190_ = 0;
			int i_191_ = 32767;
			int i_192_ = -32768;
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_193_ = i_187_; i_193_ < i_189_; i_193_++) {
				int i_194_ = i_193_ * (anInt1750 * 1210322533) + i_186_;
				for (int i_195_ = i_186_; i_195_ < i_188_; i_195_++) {
					if (bools[i_195_ - i_186_][i_193_ - i_187_]) {
						short[] is = aShortArrayArray9621[i_194_];
						if (is != null) {
							for (int i_196_ = 0; i_196_ < is.length; i_196_++) {
								int i_197_ = is[i_196_] & 0xffff;
								if (i_197_ > i_192_)
									i_192_ = i_197_;
								if (i_197_ < i_191_)
									i_191_ = i_197_;
								bytebuffer.putShort((short) i_197_);
								i_190_++;
							}
						}
					}
					i_194_++;
				}
			}
			interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9607.aLong9439);
			if (i_190_ > 0) {
				aClass180_Sub2_9607.method14998();
				Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				aClass180_Sub2_9607.method15001(interface44);
				aClass180_Sub2_9607.method3180(Class432.aClass432_4853);
				float f = (float) aClass180_Sub2_9607.method3285(1953456385).method2728();
				float f_198_ = (float) aClass180_Sub2_9607.method3285(1104657047).method2729();
				Class432 class432 = new Class432();
				Class432 class432_199_ = new Class432();
				class432.method6956(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class432_199_.method6892(((float) i_185_ / (256.0F * (float) (anInt1752 * 1048375491))), ((float) -i_185_ / (256.0F * (float) (anInt1752 * 1048375491))), 1.0F / (aFloat9616 - aFloat9615));
				class432_199_.method6896((float) i - (float) (i_186_ * i_185_) / 256.0F, (float) i_184_ + (float) (i_189_ * i_185_) / 256.0F, -aFloat9615 / (aFloat9616 - aFloat9615));
				class432_199_.method6893(2.0F / f, 2.0F / f_198_, 1.0F);
				class432_199_.method6896(-1.0F, -1.0F, 0.0F);
				aClass180_Sub2_9607.aClass432_9512.method6897(class432, class432_199_);
				aClass180_Sub2_9607.aClass427_9435.method6784(aClass180_Sub2_9607.aClass432_9512);
				aClass180_Sub2_9607.method3183(aClass180_Sub2_9607.aClass427_9435);
				class326.method5770(Class427.aClass427_4808);
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
				class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
				class326.aClass427_3583.method6742();
				class326.anInt3598 = i_191_;
				class326.anInt3597 = i_192_ - i_191_ + 1;
				class326.anInt3584 = 0;
				class326.anInt3599 = i_190_ / 3;
				if (aClass180_Sub2_9607.aBool9559) {
					aClass180_Sub2_9607.method3182(false);
					class326.method5757(false);
					aClass180_Sub2_9607.method3182(true);
				} else
					class326.method5757(false);
			}
		}
	}

	public void method2608(int i, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, boolean[][] bools) {
		if (anInt9631 > 0) {
			Interface44 interface44 = aClass180_Sub2_9607.method15136(anInt9630);
			int i_206_ = 0;
			int i_207_ = 32767;
			int i_208_ = -32768;
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_209_ = i_203_; i_209_ < i_205_; i_209_++) {
				int i_210_ = i_209_ * (anInt1750 * 1210322533) + i_202_;
				for (int i_211_ = i_202_; i_211_ < i_204_; i_211_++) {
					if (bools[i_211_ - i_202_][i_209_ - i_203_]) {
						short[] is = aShortArrayArray9621[i_210_];
						if (is != null) {
							for (int i_212_ = 0; i_212_ < is.length; i_212_++) {
								int i_213_ = is[i_212_] & 0xffff;
								if (i_213_ > i_208_)
									i_208_ = i_213_;
								if (i_213_ < i_207_)
									i_207_ = i_213_;
								bytebuffer.putShort((short) i_213_);
								i_206_++;
							}
						}
					}
					i_210_++;
				}
			}
			interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9607.aLong9439);
			if (i_206_ > 0) {
				aClass180_Sub2_9607.method14998();
				Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				aClass180_Sub2_9607.method15001(interface44);
				aClass180_Sub2_9607.method3180(Class432.aClass432_4853);
				float f = (float) aClass180_Sub2_9607.method3285(1067006501).method2728();
				float f_214_ = (float) aClass180_Sub2_9607.method3285(1028230854).method2729();
				Class432 class432 = new Class432();
				Class432 class432_215_ = new Class432();
				class432.method6956(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class432_215_.method6892(((float) i_201_ / (256.0F * (float) (anInt1752 * 1048375491))), ((float) -i_201_ / (256.0F * (float) (anInt1752 * 1048375491))), 1.0F / (aFloat9616 - aFloat9615));
				class432_215_.method6896((float) i - (float) (i_202_ * i_201_) / 256.0F, (float) i_200_ + (float) (i_205_ * i_201_) / 256.0F, -aFloat9615 / (aFloat9616 - aFloat9615));
				class432_215_.method6893(2.0F / f, 2.0F / f_214_, 1.0F);
				class432_215_.method6896(-1.0F, -1.0F, 0.0F);
				aClass180_Sub2_9607.aClass432_9512.method6897(class432, class432_215_);
				aClass180_Sub2_9607.aClass427_9435.method6784(aClass180_Sub2_9607.aClass432_9512);
				aClass180_Sub2_9607.method3183(aClass180_Sub2_9607.aClass427_9435);
				class326.method5770(Class427.aClass427_4808);
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
				class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
				class326.aClass427_3583.method6742();
				class326.anInt3598 = i_207_;
				class326.anInt3597 = i_208_ - i_207_ + 1;
				class326.anInt3584 = 0;
				class326.anInt3599 = i_206_ / 3;
				if (aClass180_Sub2_9607.aBool9559) {
					aClass180_Sub2_9607.method3182(false);
					class326.method5757(false);
					aClass180_Sub2_9607.method3182(true);
				} else
					class326.method5757(false);
			}
		}
	}

	public void method2609(int i, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, boolean[][] bools) {
		if (anInt9631 > 0) {
			Interface44 interface44 = aClass180_Sub2_9607.method15136(anInt9630);
			int i_222_ = 0;
			int i_223_ = 32767;
			int i_224_ = -32768;
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_225_ = i_219_; i_225_ < i_221_; i_225_++) {
				int i_226_ = i_225_ * (anInt1750 * 1210322533) + i_218_;
				for (int i_227_ = i_218_; i_227_ < i_220_; i_227_++) {
					if (bools[i_227_ - i_218_][i_225_ - i_219_]) {
						short[] is = aShortArrayArray9621[i_226_];
						if (is != null) {
							for (int i_228_ = 0; i_228_ < is.length; i_228_++) {
								int i_229_ = is[i_228_] & 0xffff;
								if (i_229_ > i_224_)
									i_224_ = i_229_;
								if (i_229_ < i_223_)
									i_223_ = i_229_;
								bytebuffer.putShort((short) i_229_);
								i_222_++;
							}
						}
					}
					i_226_++;
				}
			}
			interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9607.aLong9439);
			if (i_222_ > 0) {
				aClass180_Sub2_9607.method14998();
				Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				aClass180_Sub2_9607.method15001(interface44);
				aClass180_Sub2_9607.method3180(Class432.aClass432_4853);
				float f = (float) aClass180_Sub2_9607.method3285(370153436).method2728();
				float f_230_ = (float) aClass180_Sub2_9607.method3285(773320886).method2729();
				Class432 class432 = new Class432();
				Class432 class432_231_ = new Class432();
				class432.method6956(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class432_231_.method6892(((float) i_217_ / (256.0F * (float) (anInt1752 * 1048375491))), ((float) -i_217_ / (256.0F * (float) (anInt1752 * 1048375491))), 1.0F / (aFloat9616 - aFloat9615));
				class432_231_.method6896((float) i - (float) (i_218_ * i_217_) / 256.0F, (float) i_216_ + (float) (i_221_ * i_217_) / 256.0F, -aFloat9615 / (aFloat9616 - aFloat9615));
				class432_231_.method6893(2.0F / f, 2.0F / f_230_, 1.0F);
				class432_231_.method6896(-1.0F, -1.0F, 0.0F);
				aClass180_Sub2_9607.aClass432_9512.method6897(class432, class432_231_);
				aClass180_Sub2_9607.aClass427_9435.method6784(aClass180_Sub2_9607.aClass432_9512);
				aClass180_Sub2_9607.method3183(aClass180_Sub2_9607.aClass427_9435);
				class326.method5770(Class427.aClass427_4808);
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
				class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
				class326.aClass427_3583.method6742();
				class326.anInt3598 = i_223_;
				class326.anInt3597 = i_224_ - i_223_ + 1;
				class326.anInt3584 = 0;
				class326.anInt3599 = i_222_ / 3;
				if (aClass180_Sub2_9607.aBool9559) {
					aClass180_Sub2_9607.method3182(false);
					class326.method5757(false);
					aClass180_Sub2_9607.method3182(true);
				} else
					class326.method5757(false);
			}
		}
	}

	public Class527_Sub8_Sub8 method2610(int i, int i_232_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9625[i][i_232_] & 0x1) == 0)
			return null;
		int i_233_ = anInt1752 * 1048375491 >> aClass180_Sub2_9607.anInt9522;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_234_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_233_, i_233_)) {
			class527_sub8_sub8_sub2_234_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_234_.method18743();
		} else
			class527_sub8_sub8_sub2_234_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9607, i_233_, i_233_);
		class527_sub8_sub8_sub2_234_.method18741(0, 0, i_233_, i_233_);
		method15309(class527_sub8_sub8_sub2_234_, i, i_232_);
		return class527_sub8_sub8_sub2_234_;
	}

	public Class527_Sub8_Sub8 method2625(int i, int i_235_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9625[i][i_235_] & 0x1) == 0)
			return null;
		int i_236_ = anInt1752 * 1048375491 >> aClass180_Sub2_9607.anInt9522;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_237_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_236_, i_236_)) {
			class527_sub8_sub8_sub2_237_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_237_.method18743();
		} else
			class527_sub8_sub8_sub2_237_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9607, i_236_, i_236_);
		class527_sub8_sub8_sub2_237_.method18741(0, 0, i_236_, i_236_);
		method15309(class527_sub8_sub8_sub2_237_, i, i_235_);
		return class527_sub8_sub8_sub2_237_;
	}

	public Class527_Sub8_Sub8 method2586(int i, int i_238_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		if ((aByteArrayArray9625[i][i_238_] & 0x1) == 0)
			return null;
		int i_239_ = anInt1752 * 1048375491 >> aClass180_Sub2_9607.anInt9522;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_240_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_239_, i_239_)) {
			class527_sub8_sub8_sub2_240_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_240_.method18743();
		} else
			class527_sub8_sub8_sub2_240_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9607, i_239_, i_239_);
		class527_sub8_sub8_sub2_240_.method18741(0, 0, i_239_, i_239_);
		method15309(class527_sub8_sub8_sub2_240_, i, i_238_);
		return class527_sub8_sub8_sub2_240_;
	}

	public void method2621(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_241_, int i_242_, int i_243_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_244_ = (i - (i_241_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_245_ = (i_242_ - (i_241_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6183(class527_sub8_sub8, i_244_, i_245_);
		}
	}

	public void method2613(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_246_, int i_247_, int i_248_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_249_ = (i - (i_246_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_250_ = (i_247_ - (i_246_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6183(class527_sub8_sub8, i_249_, i_250_);
		}
	}

	public void method2616(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9626.method14147(new Class527_Sub23(aClass180_Sub2_9607, this, class527_sub16, is), -1437052471);
	}

	public void method2615(Class527_Sub16 class527_sub16, int[] is) {
		aClass694_9626.method14147(new Class527_Sub23(aClass180_Sub2_9607, this, class527_sub16, is), -63700938);
	}

	void method15308(Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2, int i, int i_251_) {
		int[] is = anIntArrayArrayArray9612[i][i_251_];
		int[] is_252_ = anIntArrayArrayArray9614[i][i_251_];
		int i_253_ = is.length;
		if (anIntArray9643.length < i_253_) {
			anIntArray9643 = new int[i_253_];
			anIntArray9634 = new int[i_253_];
		}
		for (int i_254_ = 0; i_254_ < i_253_; i_254_++) {
			anIntArray9643[i_254_] = is[i_254_] >> aClass180_Sub2_9607.anInt9522;
			anIntArray9634[i_254_] = is_252_[i_254_] >> aClass180_Sub2_9607.anInt9522;
		}
		int i_255_ = 0;
		while (i_255_ < i_253_) {
			int i_256_ = anIntArray9643[i_255_];
			int i_257_ = anIntArray9634[i_255_++];
			int i_258_ = anIntArray9643[i_255_];
			int i_259_ = anIntArray9634[i_255_++];
			int i_260_ = anIntArray9643[i_255_];
			int i_261_ = anIntArray9634[i_255_++];
			if (((i_256_ - i_258_) * (i_259_ - i_261_) - (i_259_ - i_257_) * (i_260_ - i_258_)) > 0)
				class527_sub8_sub8_sub2.method18744(i_257_, i_259_, i_261_, i_256_, i_258_, i_260_);
		}
	}

	public void method2590(int i, int i_262_, int[] is, int[] is_263_, int[] is_264_, int[] is_265_, int[] is_266_, int[] is_267_, int[] is_268_, int[] is_269_, int[] is_270_, int[] is_271_, int[] is_272_, Class178 class178, boolean bool) {
		int i_273_ = is_269_.length;
		int[] is_274_ = new int[i_273_ * 3];
		int[] is_275_ = new int[i_273_ * 3];
		int[] is_276_ = new int[i_273_ * 3];
		int[] is_277_ = new int[i_273_ * 3];
		int[] is_278_ = new int[i_273_ * 3];
		int[] is_279_ = new int[i_273_ * 3];
		int[] is_280_ = is_263_ != null ? new int[i_273_ * 3] : null;
		int[] is_281_ = is_265_ != null ? new int[i_273_ * 3] : null;
		int i_282_ = 0;
		for (int i_283_ = 0; i_283_ < i_273_; i_283_++) {
			int i_284_ = is_266_[i_283_];
			int i_285_ = is_267_[i_283_];
			int i_286_ = is_268_[i_283_];
			is_274_[i_282_] = is[i_284_];
			is_275_[i_282_] = is_264_[i_284_];
			is_276_[i_282_] = is_269_[i_283_];
			is_278_[i_282_] = is_271_[i_283_];
			is_279_[i_282_] = is_272_[i_283_];
			is_277_[i_282_] = is_270_ != null ? is_270_[i_283_] : is_269_[i_283_];
			if (is_263_ != null)
				is_280_[i_282_] = is_263_[i_284_];
			if (is_265_ != null)
				is_281_[i_282_] = is_265_[i_284_];
			i_282_++;
			is_274_[i_282_] = is[i_285_];
			is_275_[i_282_] = is_264_[i_285_];
			is_276_[i_282_] = is_269_[i_283_];
			is_278_[i_282_] = is_271_[i_283_];
			is_279_[i_282_] = is_272_[i_283_];
			is_277_[i_282_] = is_270_ != null ? is_270_[i_283_] : is_269_[i_283_];
			if (is_263_ != null)
				is_280_[i_282_] = is_263_[i_285_];
			if (is_265_ != null)
				is_281_[i_282_] = is_265_[i_285_];
			i_282_++;
			is_274_[i_282_] = is[i_286_];
			is_275_[i_282_] = is_264_[i_286_];
			is_276_[i_282_] = is_269_[i_283_];
			is_278_[i_282_] = is_271_[i_283_];
			is_279_[i_282_] = is_272_[i_283_];
			is_277_[i_282_] = is_270_ != null ? is_270_[i_283_] : is_269_[i_283_];
			if (is_263_ != null)
				is_280_[i_282_] = is_263_[i_286_];
			if (is_265_ != null)
				is_281_[i_282_] = is_265_[i_286_];
			i_282_++;
		}
		method2604(i, i_262_, is_274_, is_280_, is_275_, is_281_, is_276_, is_277_, is_278_, is_279_, class178, bool);
	}

	public void method2618(int i, int i_287_, int[] is, int[] is_288_, int[] is_289_, int[] is_290_, int[] is_291_, int[] is_292_, int[] is_293_, int[] is_294_, int[] is_295_, int[] is_296_, int[] is_297_, Class178 class178, boolean bool) {
		int i_298_ = is_294_.length;
		int[] is_299_ = new int[i_298_ * 3];
		int[] is_300_ = new int[i_298_ * 3];
		int[] is_301_ = new int[i_298_ * 3];
		int[] is_302_ = new int[i_298_ * 3];
		int[] is_303_ = new int[i_298_ * 3];
		int[] is_304_ = new int[i_298_ * 3];
		int[] is_305_ = is_288_ != null ? new int[i_298_ * 3] : null;
		int[] is_306_ = is_290_ != null ? new int[i_298_ * 3] : null;
		int i_307_ = 0;
		for (int i_308_ = 0; i_308_ < i_298_; i_308_++) {
			int i_309_ = is_291_[i_308_];
			int i_310_ = is_292_[i_308_];
			int i_311_ = is_293_[i_308_];
			is_299_[i_307_] = is[i_309_];
			is_300_[i_307_] = is_289_[i_309_];
			is_301_[i_307_] = is_294_[i_308_];
			is_303_[i_307_] = is_296_[i_308_];
			is_304_[i_307_] = is_297_[i_308_];
			is_302_[i_307_] = is_295_ != null ? is_295_[i_308_] : is_294_[i_308_];
			if (is_288_ != null)
				is_305_[i_307_] = is_288_[i_309_];
			if (is_290_ != null)
				is_306_[i_307_] = is_290_[i_309_];
			i_307_++;
			is_299_[i_307_] = is[i_310_];
			is_300_[i_307_] = is_289_[i_310_];
			is_301_[i_307_] = is_294_[i_308_];
			is_303_[i_307_] = is_296_[i_308_];
			is_304_[i_307_] = is_297_[i_308_];
			is_302_[i_307_] = is_295_ != null ? is_295_[i_308_] : is_294_[i_308_];
			if (is_288_ != null)
				is_305_[i_307_] = is_288_[i_310_];
			if (is_290_ != null)
				is_306_[i_307_] = is_290_[i_310_];
			i_307_++;
			is_299_[i_307_] = is[i_311_];
			is_300_[i_307_] = is_289_[i_311_];
			is_301_[i_307_] = is_294_[i_308_];
			is_303_[i_307_] = is_296_[i_308_];
			is_304_[i_307_] = is_297_[i_308_];
			is_302_[i_307_] = is_295_ != null ? is_295_[i_308_] : is_294_[i_308_];
			if (is_288_ != null)
				is_305_[i_307_] = is_288_[i_311_];
			if (is_290_ != null)
				is_306_[i_307_] = is_290_[i_311_];
			i_307_++;
		}
		method2604(i, i_287_, is_299_, is_305_, is_300_, is_306_, is_301_, is_302_, is_303_, is_304_, class178, bool);
	}

	public void method2612() {
		if (anInt9631 <= 0) {
			aClass351_9644 = null;
			method15306();
		} else {
			byte[][] is = (new byte[anInt1750 * 1210322533 + 1][anInt1751 * -533476177 + 1]);
			for (int i = 1; i < anInt1750 * 1210322533; i++) {
				for (int i_312_ = 1; i_312_ < anInt1751 * -533476177; i_312_++)
					is[i][i_312_] = (byte) ((aByteArrayArray9627[i - 1][i_312_] >> 2) + (aByteArrayArray9627[i + 1][i_312_] >> 3) + (aByteArrayArray9627[i][i_312_ - 1] >> 2) + (aByteArrayArray9627[i][i_312_ + 1] >> 3) + (aByteArrayArray9627[i][i_312_] >> 1));
			}
			aClass527Array9638 = new Class527[aClass14_9637.method711(-1652331640)];
			aClass14_9637.method708(aClass527Array9638, 2017249854);
			for (int i = 0; i < aClass527Array9638.length; i++)
				((Class527_Sub11) aClass527Array9638[i]).method16077(anInt9631);
			anInt9642 = 20;
			if (anIntArrayArrayArray9620 != null)
				anInt9642 += 4;
			if ((anInt9611 & 0x7) != 0)
				anInt9642 += 12;
			aByteBuffer9640 = aClass180_Sub2_9607.method14892(anInt9631 * 4);
			aByteBuffer9641 = aClass180_Sub2_9607.method14892(anInt9631 * anInt9642);
			Class527_Sub11[] class527_sub11s = new Class527_Sub11[anInt9631];
			int i = Class203.method3783(anInt9631 / 4, 1269235840);
			if (i < 1)
				i = 1;
			Class14 class14 = new Class14(i);
			Class527_Sub11[] class527_sub11s_313_ = new Class527_Sub11[anInt9639];
			for (int i_314_ = 0; i_314_ < anInt1750 * 1210322533; i_314_++) {
				for (int i_315_ = 0; i_315_ < anInt1751 * -533476177; i_315_++)
					method15314(i_314_, i_315_, is, class527_sub11s_313_, class14, class527_sub11s);
			}
			for (int i_316_ = 0; i_316_ < anInt9606; i_316_++) {
				Class527_Sub11 class527_sub11 = class527_sub11s[i_316_];
				if (class527_sub11 != null)
					class527_sub11.method16092(i_316_);
			}
			for (int i_317_ = 0; i_317_ < anInt1750 * 1210322533; i_317_++) {
				for (int i_318_ = 0; i_318_ < anInt1751 * -533476177; i_318_++) {
					short[] is_319_ = (aShortArrayArray9621[i_318_ * (anInt1750 * 1210322533) + i_317_]);
					if (is_319_ != null) {
						int i_320_ = 0;
						int i_321_ = 0;
						while (i_321_ < is_319_.length) {
							int i_322_ = is_319_[i_321_++] & 0xffff;
							int i_323_ = is_319_[i_321_++] & 0xffff;
							int i_324_ = is_319_[i_321_++] & 0xffff;
							Class527_Sub11 class527_sub11 = class527_sub11s[i_322_];
							Class527_Sub11 class527_sub11_325_ = class527_sub11s[i_323_];
							Class527_Sub11 class527_sub11_326_ = class527_sub11s[i_324_];
							Class527_Sub11 class527_sub11_327_ = null;
							if (class527_sub11 != null) {
								class527_sub11.method16095(i_317_, i_318_, i_320_);
								class527_sub11_327_ = class527_sub11;
							}
							if (class527_sub11_325_ != null) {
								class527_sub11_325_.method16095(i_317_, i_318_, i_320_);
								if (class527_sub11_327_ == null || ((class527_sub11_325_.aLong7106 * -8168620736534281759L) < (class527_sub11_327_.aLong7106 * -8168620736534281759L)))
									class527_sub11_327_ = class527_sub11_325_;
							}
							if (class527_sub11_326_ != null) {
								class527_sub11_326_.method16095(i_317_, i_318_, i_320_);
								if (class527_sub11_327_ == null || ((class527_sub11_326_.aLong7106 * -8168620736534281759L) < (class527_sub11_327_.aLong7106 * -8168620736534281759L)))
									class527_sub11_327_ = class527_sub11_326_;
							}
							if (class527_sub11_327_ != null) {
								if (class527_sub11 != null)
									class527_sub11_327_.method16092(i_322_);
								if (class527_sub11_325_ != null)
									class527_sub11_327_.method16092(i_323_);
								if (class527_sub11_326_ != null)
									class527_sub11_327_.method16092(i_324_);
								class527_sub11_327_.method16095(i_317_, i_318_, i_320_);
							}
							i_320_++;
						}
					}
				}
			}
			anInt9605 = 0;
			for (int i_328_ = 0; i_328_ < aClass527Array9638.length; i_328_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i_328_];
				if (class527_sub11.anInt10437 > 0)
					aClass527Array9638[anInt9605++] = class527_sub11;
			}
			aClass527Array9624 = new Class527[anInt9605];
			long[] ls = new long[anInt9605];
			for (int i_329_ = 0; i_329_ < anInt9605; i_329_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i_329_];
				ls[i_329_] = class527_sub11.aLong7106 * -8168620736534281759L;
				aClass527Array9624[i_329_] = class527_sub11;
			}
			Class509.method8418(ls, aClass527Array9624, (byte) 26);
			method15310();
		}
	}

	public void method2620(int i, int i_330_, int i_331_, boolean[][] bools, boolean bool, int i_332_) {
		if (aClass527Array9624 != null) {
			int i_333_ = i_331_ + i_331_ + 1;
			i_333_ *= i_333_;
			if (anIntArray9646.length < i_333_)
				anIntArray9646 = new int[i_333_];
			int i_334_ = i - i_331_;
			int i_335_ = i_334_;
			if (i_334_ < 0)
				i_334_ = 0;
			int i_336_ = i_330_ - i_331_;
			int i_337_ = i_336_;
			if (i_336_ < 0)
				i_336_ = 0;
			int i_338_ = i + i_331_;
			if (i_338_ > anInt1750 * 1210322533 - 1)
				i_338_ = anInt1750 * 1210322533 - 1;
			int i_339_ = i_330_ + i_331_;
			if (i_339_ > anInt1751 * -533476177 - 1)
				i_339_ = anInt1751 * -533476177 - 1;
			anInt9645 = 0;
			for (int i_340_ = i_334_; i_340_ <= i_338_; i_340_++) {
				boolean[] bools_341_ = bools[i_340_ - i_335_];
				for (int i_342_ = i_336_; i_342_ <= i_339_; i_342_++) {
					if (bools_341_[i_342_ - i_337_])
						anIntArray9646[anInt9645++] = i_342_ * (anInt1750 * 1210322533) + i_340_;
				}
			}
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_343_ = 0; i_343_ < aClass527Array9624.length; i_343_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_343_];
				class527_sub11.method16082(anIntArray9646, anInt9645);
			}
			int i_344_ = bytebuffer.position();
			Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
			aClass180_Sub2_9607.method14998();
			if (aClass180_Sub2_9607.anInt9562 > 0) {
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9607.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 0 & 0xff) / 255.0F));
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9607.aFloat9517));
				class326.aClass441_3589.method7123(aClass180_Sub2_9607.aClass427_9454);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9607.aFloat9565 - aClass180_Sub2_9607.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if (i_344_ != 0) {
				Interface44 interface44 = aClass180_Sub2_9607.method15136(i_344_ / 2);
				interface44.method213(0, i_344_, aClass180_Sub2_9607.aLong9439);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method15001(interface44);
				class326.method5770(Class427.aClass427_4808);
				if ((anInt9611 & 0x7) == 0) {
					int i_345_ = 0;
					for (int i_346_ = 0; i_346_ < aClass527Array9624.length; i_346_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_346_];
						if (class527_sub11.anInt10439 != 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, ((float) aClass180_Sub2_9607.anInt9557 + ((float) ((class527_sub11.aClass178_10436.anInt2051) * -1449092429) / 255.0F * (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777))));
								class326.aClass441_3587.method7128(1.0F / (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							boolean bool_347_ = false;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -59));
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								bool_347_ = !Class306.method5607(class163.aByte1801, -1088851960);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_345_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							class326.method5757(bool_347_);
							i_345_ += class527_sub11.anInt10439;
						}
					}
				} else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9607.aFloatArray9507[0], aClass180_Sub2_9607.aFloatArray9507[1], aClass180_Sub2_9607.aFloatArray9507[2]);
					class326.aClass442_3590.method7138((aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9583), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9513), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9448));
					int i_348_ = 0;
					for (int i_349_ = 0; i_349_ < aClass527Array9624.length; i_349_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_349_];
						if (class527_sub11.anInt10439 > 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								float f = 0.15F;
								class326.aClass441_3587.method7118(0.0F, 1.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f), 0.0F, 256.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							byte i_350_ = 11;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -23));
								i_350_ = class163.aByte1801;
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								class326.method5755(class163.aByte1775);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_348_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							switch (i_350_) {
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass180_Sub2_9607.aBool9597 && (anInt9611 & 0x8) != 0 && aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443.method18052((byte) -104)) {
									Class350_Sub1_Sub2 class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443);
									if (i_350_ == 2)
										class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9545);
									class350_sub1_sub2.aClass427_11533.method6750(aClass180_Sub2_9607.aClass427_9474);
									class350_sub1_sub2.aClass427_11527.method6815(1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F, 1.0F);
									class350_sub1_sub2.aClass442_11547.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
									Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -9));
									class350_sub1_sub2.anInt11543 = class163.aByte1775 * 2007712759;
									class350_sub1_sub2.anInt11545 = (class527_sub11.anInt10440 * -481045151);
									class350_sub1_sub2.anInt11546 = ((class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1) * 527612167);
									class350_sub1_sub2.anInt11531 = i_348_ * -1248930933;
									class350_sub1_sub2.anInt11548 = (class527_sub11.anInt10439 / 3 * -1274173737);
									class350_sub1_sub2.aClass441_11542.method7119(class326.aClass441_3587);
									class350_sub1_sub2.aClass442_11540.method7146(class326.aClass442_3588);
									class350_sub1_sub2.aClass441_11525.method7119(class326.aClass441_3589);
									class350_sub1_sub2.aClass442_11544.method7146(class326.aClass442_3581);
									class350_sub1_sub2.method18055(93222699);
								} else
									class326.method5758(0);
								break;
							case 6:
								class326.method5757(!Class306.method5607(i_350_, -1088851960));
								break;
							case 1:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5762();
								else
									class326.method5754(0);
								break;
							default:
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5772();
								else
									class326.method5758(0);
								break;
							case 7:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								class326.aClass427_3577.method6742();
								class326.anInterface39_3582 = aClass180_Sub2_9607.method14925();
								class326.method5760(0);
							}
							i_348_ += class527_sub11.anInt10439;
						}
					}
				}
			}
			if (!aClass694_9626.method14088(1419157547)) {
				aClass180_Sub2_9607.method15238(128);
				aClass180_Sub2_9607.method14951(false);
				Class442 class442 = new Class442(class326.aClass442_3581);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass694_9626.iterator();
				while (iterator.hasNext()) {
					Class527_Sub23 class527_sub23 = (Class527_Sub23) iterator.next();
					class527_sub23.method16239(class326, i, i_330_, i_331_, bools, bool);
				}
				class326.aClass442_3581.method7146(class442);
			}
			if (aClass351_9644 != null) {
				aClass180_Sub2_9607.method15238(1);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				Class427 class427 = aClass180_Sub2_9607.aClass427_9435;
				class427.method6742();
				class427.aFloatArray4807[13] = -1.0F;
				class326.method5770(class427);
				aClass351_9644.method6182(class326, i, i_330_, i_331_, bools, bool);
			}
		}
	}

	public void method2622(int i, int i_351_, int i_352_, boolean[][] bools, boolean bool, int i_353_) {
		if (aClass527Array9624 != null) {
			int i_354_ = i_352_ + i_352_ + 1;
			i_354_ *= i_354_;
			if (anIntArray9646.length < i_354_)
				anIntArray9646 = new int[i_354_];
			int i_355_ = i - i_352_;
			int i_356_ = i_355_;
			if (i_355_ < 0)
				i_355_ = 0;
			int i_357_ = i_351_ - i_352_;
			int i_358_ = i_357_;
			if (i_357_ < 0)
				i_357_ = 0;
			int i_359_ = i + i_352_;
			if (i_359_ > anInt1750 * 1210322533 - 1)
				i_359_ = anInt1750 * 1210322533 - 1;
			int i_360_ = i_351_ + i_352_;
			if (i_360_ > anInt1751 * -533476177 - 1)
				i_360_ = anInt1751 * -533476177 - 1;
			anInt9645 = 0;
			for (int i_361_ = i_355_; i_361_ <= i_359_; i_361_++) {
				boolean[] bools_362_ = bools[i_361_ - i_356_];
				for (int i_363_ = i_357_; i_363_ <= i_360_; i_363_++) {
					if (bools_362_[i_363_ - i_358_])
						anIntArray9646[anInt9645++] = i_363_ * (anInt1750 * 1210322533) + i_361_;
				}
			}
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_364_ = 0; i_364_ < aClass527Array9624.length; i_364_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_364_];
				class527_sub11.method16082(anIntArray9646, anInt9645);
			}
			int i_365_ = bytebuffer.position();
			Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
			aClass180_Sub2_9607.method14998();
			if (aClass180_Sub2_9607.anInt9562 > 0) {
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9607.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 0 & 0xff) / 255.0F));
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9607.aFloat9517));
				class326.aClass441_3589.method7123(aClass180_Sub2_9607.aClass427_9454);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9607.aFloat9565 - aClass180_Sub2_9607.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if (i_365_ != 0) {
				Interface44 interface44 = aClass180_Sub2_9607.method15136(i_365_ / 2);
				interface44.method213(0, i_365_, aClass180_Sub2_9607.aLong9439);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method15001(interface44);
				class326.method5770(Class427.aClass427_4808);
				if ((anInt9611 & 0x7) == 0) {
					int i_366_ = 0;
					for (int i_367_ = 0; i_367_ < aClass527Array9624.length; i_367_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_367_];
						if (class527_sub11.anInt10439 != 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, ((float) aClass180_Sub2_9607.anInt9557 + ((float) ((class527_sub11.aClass178_10436.anInt2051) * -1449092429) / 255.0F * (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777))));
								class326.aClass441_3587.method7128(1.0F / (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							boolean bool_368_ = false;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -84));
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								bool_368_ = !Class306.method5607(class163.aByte1801, -1088851960);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_366_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							class326.method5757(bool_368_);
							i_366_ += class527_sub11.anInt10439;
						}
					}
				} else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9607.aFloatArray9507[0], aClass180_Sub2_9607.aFloatArray9507[1], aClass180_Sub2_9607.aFloatArray9507[2]);
					class326.aClass442_3590.method7138((aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9583), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9513), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9448));
					int i_369_ = 0;
					for (int i_370_ = 0; i_370_ < aClass527Array9624.length; i_370_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_370_];
						if (class527_sub11.anInt10439 > 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								float f = 0.15F;
								class326.aClass441_3587.method7118(0.0F, 1.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f), 0.0F, 256.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							byte i_371_ = 11;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -34));
								i_371_ = class163.aByte1801;
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								class326.method5755(class163.aByte1775);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_369_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							switch (i_371_) {
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass180_Sub2_9607.aBool9597 && (anInt9611 & 0x8) != 0 && aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443.method18052((byte) -42)) {
									Class350_Sub1_Sub2 class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443);
									if (i_371_ == 2)
										class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9545);
									class350_sub1_sub2.aClass427_11533.method6750(aClass180_Sub2_9607.aClass427_9474);
									class350_sub1_sub2.aClass427_11527.method6815(1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F, 1.0F);
									class350_sub1_sub2.aClass442_11547.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
									Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -108));
									class350_sub1_sub2.anInt11543 = class163.aByte1775 * 2007712759;
									class350_sub1_sub2.anInt11545 = (class527_sub11.anInt10440 * -481045151);
									class350_sub1_sub2.anInt11546 = ((class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1) * 527612167);
									class350_sub1_sub2.anInt11531 = i_369_ * -1248930933;
									class350_sub1_sub2.anInt11548 = (class527_sub11.anInt10439 / 3 * -1274173737);
									class350_sub1_sub2.aClass441_11542.method7119(class326.aClass441_3587);
									class350_sub1_sub2.aClass442_11540.method7146(class326.aClass442_3588);
									class350_sub1_sub2.aClass441_11525.method7119(class326.aClass441_3589);
									class350_sub1_sub2.aClass442_11544.method7146(class326.aClass442_3581);
									class350_sub1_sub2.method18055(541476157);
								} else
									class326.method5758(0);
								break;
							case 6:
								class326.method5757(!Class306.method5607(i_371_, -1088851960));
								break;
							case 1:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5762();
								else
									class326.method5754(0);
								break;
							default:
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5772();
								else
									class326.method5758(0);
								break;
							case 7:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								class326.aClass427_3577.method6742();
								class326.anInterface39_3582 = aClass180_Sub2_9607.method14925();
								class326.method5760(0);
							}
							i_369_ += class527_sub11.anInt10439;
						}
					}
				}
			}
			if (!aClass694_9626.method14088(959893016)) {
				aClass180_Sub2_9607.method15238(128);
				aClass180_Sub2_9607.method14951(false);
				Class442 class442 = new Class442(class326.aClass442_3581);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass694_9626.iterator();
				while (iterator.hasNext()) {
					Class527_Sub23 class527_sub23 = (Class527_Sub23) iterator.next();
					class527_sub23.method16239(class326, i, i_351_, i_352_, bools, bool);
				}
				class326.aClass442_3581.method7146(class442);
			}
			if (aClass351_9644 != null) {
				aClass180_Sub2_9607.method15238(1);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				Class427 class427 = aClass180_Sub2_9607.aClass427_9435;
				class427.method6742();
				class427.aFloatArray4807[13] = -1.0F;
				class326.method5770(class427);
				aClass351_9644.method6182(class326, i, i_351_, i_352_, bools, bool);
			}
		}
	}

	void method15309(Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2, int i, int i_372_) {
		int[] is = anIntArrayArrayArray9612[i][i_372_];
		int[] is_373_ = anIntArrayArrayArray9614[i][i_372_];
		int i_374_ = is.length;
		if (anIntArray9643.length < i_374_) {
			anIntArray9643 = new int[i_374_];
			anIntArray9634 = new int[i_374_];
		}
		for (int i_375_ = 0; i_375_ < i_374_; i_375_++) {
			anIntArray9643[i_375_] = is[i_375_] >> aClass180_Sub2_9607.anInt9522;
			anIntArray9634[i_375_] = is_373_[i_375_] >> aClass180_Sub2_9607.anInt9522;
		}
		int i_376_ = 0;
		while (i_376_ < i_374_) {
			int i_377_ = anIntArray9643[i_376_];
			int i_378_ = anIntArray9634[i_376_++];
			int i_379_ = anIntArray9643[i_376_];
			int i_380_ = anIntArray9634[i_376_++];
			int i_381_ = anIntArray9643[i_376_];
			int i_382_ = anIntArray9634[i_376_++];
			if (((i_377_ - i_379_) * (i_380_ - i_382_) - (i_380_ - i_378_) * (i_381_ - i_379_)) > 0)
				class527_sub8_sub8_sub2.method18744(i_378_, i_380_, i_382_, i_377_, i_379_, i_381_);
		}
	}

	public void method2623(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_383_, int i_384_, int i_385_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_386_ = (i - (i_383_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_387_ = (i_384_ - (i_383_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6184(class527_sub8_sub8, i_386_, i_387_);
		}
	}

	public void method2624(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_388_, int i_389_, int i_390_, boolean bool) {
		if (aClass351_9644 != null && class527_sub8_sub8 != null) {
			int i_391_ = (i - (i_388_ * aClass180_Sub2_9607.anInt9523 >> 8) >> aClass180_Sub2_9607.anInt9522);
			int i_392_ = (i_389_ - (i_388_ * aClass180_Sub2_9607.anInt9584 >> 8) >> aClass180_Sub2_9607.anInt9522);
			aClass351_9644.method6184(class527_sub8_sub8, i_391_, i_392_);
		}
	}

	void method15310() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	void method15311() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	void method15312() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	void method15313() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	void method15314(int i, int i_393_, byte[][] is, Class527_Sub11[] class527_sub11s, Class14 class14, Class527_Sub11[] class527_sub11s_394_) {
		if (anIntArrayArrayArray9618[i][i_393_] != null) {
			Class527_Sub11[] class527_sub11s_395_ = aClass527_Sub11ArrayArrayArray9617[i][i_393_];
			int[] is_396_ = anIntArrayArrayArray9612[i][i_393_];
			int[] is_397_ = anIntArrayArrayArray9614[i][i_393_];
			int[] is_398_ = anIntArrayArrayArray9619[i][i_393_];
			int[] is_399_ = anIntArrayArrayArray9618[i][i_393_];
			int[] is_400_ = (anIntArrayArrayArray9629 != null ? anIntArrayArrayArray9629[i][i_393_] : null);
			int[] is_401_ = (anIntArrayArrayArray9620 != null ? anIntArrayArrayArray9620[i][i_393_] : null);
			if (is_398_ == null)
				is_398_ = is_399_;
			float f = aFloatArrayArray9622[i][i_393_];
			float f_402_ = aFloatArrayArray9635[i][i_393_];
			float f_403_ = aFloatArrayArray9613[i][i_393_];
			float f_404_ = aFloatArrayArray9622[i][i_393_ + 1];
			float f_405_ = aFloatArrayArray9635[i][i_393_ + 1];
			float f_406_ = aFloatArrayArray9613[i][i_393_ + 1];
			float f_407_ = aFloatArrayArray9622[i + 1][i_393_ + 1];
			float f_408_ = aFloatArrayArray9635[i + 1][i_393_ + 1];
			float f_409_ = aFloatArrayArray9613[i + 1][i_393_ + 1];
			float f_410_ = aFloatArrayArray9622[i + 1][i_393_];
			float f_411_ = aFloatArrayArray9635[i + 1][i_393_];
			float f_412_ = aFloatArrayArray9613[i + 1][i_393_];
			int i_413_ = is[i][i_393_] & 0xff;
			int i_414_ = is[i][i_393_ + 1] & 0xff;
			int i_415_ = is[i + 1][i_393_ + 1] & 0xff;
			int i_416_ = is[i + 1][i_393_] & 0xff;
			int i_417_ = 0;
			while_48_: for (int i_418_ = 0; i_418_ < is_399_.length; i_418_++) {
				Class527_Sub11 class527_sub11 = class527_sub11s_395_[i_418_];
				for (int i_419_ = 0; i_419_ < i_417_; i_419_++) {
					if (class527_sub11s[i_419_] == class527_sub11)
						continue while_48_;
				}
				class527_sub11s[i_417_++] = class527_sub11;
			}
			short[] is_420_ = (aShortArrayArray9621[i_393_ * (anInt1750 * 1210322533) + i] = new short[is_399_.length]);
			for (int i_421_ = 0; i_421_ < is_399_.length; i_421_++) {
				int i_422_ = (i << anInt1753 * 1252000143) + is_396_[i_421_];
				int i_423_ = (i_393_ << anInt1753 * 1252000143) + is_397_[i_421_];
				int i_424_ = i_422_ >> anInt9608;
				int i_425_ = i_423_ >> anInt9608;
				int i_426_ = is_399_[i_421_];
				int i_427_ = is_398_[i_421_];
				int i_428_ = is_400_ != null ? is_400_[i_421_] : 0;
				long l = ((long) i_427_ << 48 | (long) i_426_ << 32 | (long) (i_424_ << 16) | (long) i_425_);
				int i_429_ = is_396_[i_421_];
				int i_430_ = is_397_[i_421_];
				int i_431_ = 74;
				int i_432_ = 0;
				float f_433_ = 1.0F;
				float f_434_;
				float f_435_;
				float f_436_;
				if (i_429_ == 0 && i_430_ == 0) {
					f_434_ = f;
					f_435_ = f_402_;
					f_436_ = f_403_;
					i_431_ -= i_413_;
				} else if (i_429_ == 0 && i_430_ == anInt1752 * 1048375491) {
					f_434_ = f_404_;
					f_435_ = f_405_;
					f_436_ = f_406_;
					i_431_ -= i_414_;
				} else if (i_429_ == anInt1752 * 1048375491 && i_430_ == anInt1752 * 1048375491) {
					f_434_ = f_407_;
					f_435_ = f_408_;
					f_436_ = f_409_;
					i_431_ -= i_415_;
				} else if (i_429_ == anInt1752 * 1048375491 && i_430_ == 0) {
					f_434_ = f_410_;
					f_435_ = f_411_;
					f_436_ = f_412_;
					i_431_ -= i_416_;
				} else {
					float f_437_ = (float) i_429_ / (float) (anInt1752 * 1048375491);
					float f_438_ = (float) i_430_ / (float) (anInt1752 * 1048375491);
					float f_439_ = f + (f_410_ - f) * f_437_;
					float f_440_ = f_402_ + (f_411_ - f_402_) * f_437_;
					float f_441_ = f_403_ + (f_412_ - f_403_) * f_437_;
					float f_442_ = f_404_ + (f_407_ - f_404_) * f_437_;
					float f_443_ = f_405_ + (f_408_ - f_405_) * f_437_;
					float f_444_ = f_406_ + (f_409_ - f_406_) * f_437_;
					f_434_ = f_439_ + (f_442_ - f_439_) * f_438_;
					f_435_ = f_440_ + (f_443_ - f_440_) * f_438_;
					f_436_ = f_441_ + (f_444_ - f_441_) * f_438_;
					int i_445_ = i_413_ + ((i_416_ - i_413_) * i_429_ >> anInt1753 * 1252000143);
					int i_446_ = i_414_ + ((i_415_ - i_414_) * i_429_ >> anInt1753 * 1252000143);
					i_431_ -= i_445_ + ((i_446_ - i_445_) * i_430_ >> anInt1753 * 1252000143);
				}
				if (i_426_ != -1) {
					int i_447_ = (i_426_ & 0x7f) * i_431_ >> 7;
					if (i_447_ < 2)
						i_447_ = 2;
					else if (i_447_ > 126)
						i_447_ = 126;
					i_432_ = Class656.anIntArray8392[i_426_ & 0xff80 | i_447_];
					if ((anInt9611 & 0x7) == 0) {
						f_433_ = (aClass180_Sub2_9607.aFloatArray9507[0] * f_434_ + (aClass180_Sub2_9607.aFloatArray9507[1] * f_435_) + (aClass180_Sub2_9607.aFloatArray9507[2] * f_436_));
						f_433_ = (aClass180_Sub2_9607.aFloat9551 + f_433_ * (f_433_ > 0.0F ? aClass180_Sub2_9607.aFloat9516 : aClass180_Sub2_9607.aFloat9548));
					}
				}
				Class527 class527 = null;
				if ((i_422_ & anInt9609 - 1) == 0 && (i_423_ & anInt9609 - 1) == 0)
					class527 = class14.method709(l);
				int i_448_;
				if (class527 == null) {
					int i_449_;
					if (i_427_ != i_426_) {
						int i_450_ = (i_427_ & 0x7f) * i_431_ >> 7;
						if (i_450_ < 2)
							i_450_ = 2;
						else if (i_450_ > 126)
							i_450_ = 126;
						i_449_ = (Class656.anIntArray8392[i_427_ & 0xff80 | i_450_]);
						if ((anInt9611 & 0x7) == 0) {
							float f_451_ = ((aClass180_Sub2_9607.aFloatArray9507[0] * f_434_) + (aClass180_Sub2_9607.aFloatArray9507[1] * f_435_) + (aClass180_Sub2_9607.aFloatArray9507[2] * f_436_));
							f_451_ = (aClass180_Sub2_9607.aFloat9551 + (f_433_ * (f_433_ > 0.0F ? aClass180_Sub2_9607.aFloat9516 : aClass180_Sub2_9607.aFloat9548)));
							int i_452_ = i_449_ >> 16 & 0xff;
							int i_453_ = i_449_ >> 8 & 0xff;
							int i_454_ = i_449_ & 0xff;
							i_452_ *= f_451_;
							if (i_452_ < 0)
								i_452_ = 0;
							else if (i_452_ > 255)
								i_452_ = 255;
							i_453_ *= f_451_;
							if (i_453_ < 0)
								i_453_ = 0;
							else if (i_453_ > 255)
								i_453_ = 255;
							i_454_ *= f_451_;
							if (i_454_ < 0)
								i_454_ = 0;
							else if (i_454_ > 255)
								i_454_ = 255;
							i_449_ = i_452_ << 16 | i_453_ << 8 | i_454_;
						}
					} else
						i_449_ = i_432_;
					aByteBuffer9641.putFloat((float) i_422_);
					aByteBuffer9641.putFloat((float) (method2593(i_422_, i_423_, -1151432033) + i_428_));
					aByteBuffer9641.putFloat((float) i_423_);
					aByteBuffer9641.putFloat((float) i_422_);
					aByteBuffer9641.putFloat((float) i_423_);
					if (anIntArrayArrayArray9620 != null)
						aByteBuffer9641.putFloat(is_401_ != null ? (float) (is_401_[i_421_] - 1) : 0.0F);
					if ((anInt9611 & 0x7) != 0) {
						aByteBuffer9641.putFloat(f_434_);
						aByteBuffer9641.putFloat(f_435_);
						aByteBuffer9641.putFloat(f_436_);
					}
					if (aClass180_Sub2_9607.anInt9578 == 0) {
						int i_455_ = i_449_ & ~0xff00ff;
						i_455_ |= (i_449_ & 0xff0000) >> 16;
						i_455_ |= (i_449_ & 0xff) << 16;
						i_449_ = i_455_;
					}
					aByteBuffer9640.putInt(~0xffffff | i_449_);
					i_448_ = anInt9606++;
					is_420_[i_421_] = (short) i_448_;
					if (i_426_ != -1)
						class527_sub11s_394_[i_448_] = class527_sub11s_395_[i_421_];
					class14.method714(new Class527_Sub13(is_420_[i_421_]), l);
				} else {
					is_420_[i_421_] = ((Class527_Sub13) class527).aShort10445;
					i_448_ = is_420_[i_421_] & 0xffff;
					if (i_426_ != -1 && ((class527_sub11s_395_[i_421_].aLong7106 * -8168620736534281759L) < (class527_sub11s_394_[i_448_].aLong7106 * -8168620736534281759L)))
						class527_sub11s_394_[i_448_] = class527_sub11s_395_[i_421_];
				}
				for (int i_456_ = 0; i_456_ < i_417_; i_456_++)
					class527_sub11s[i_456_].method16080(i_448_, i_432_, i_431_, f_433_);
				anInt9630++;
			}
		}
	}

	void method15315() {
		anInterface37_9632 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9632.method219(anInt9606 * 4, 4);
		anInterface37_9632.method213(0, anInt9606 * 4, aClass180_Sub2_9607.method14893(aByteBuffer9640));
		anInterface37_9628 = aClass180_Sub2_9607.method15035(false);
		anInterface37_9628.method219(anInt9606 * anInt9642, anInt9642);
		anInterface37_9628.method213(0, anInt9606 * anInt9642, aClass180_Sub2_9607.method14893(aByteBuffer9641));
		aByteBuffer9640.clear();
		aByteBuffer9640 = null;
		aByteBuffer9641.clear();
		aByteBuffer9641 = null;
		if ((anInt9611 & 0x7) != 0) {
			if (anIntArrayArrayArray9620 != null)
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
			else
				aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3732 }), new Class372(Class347.aClass347_3734) }));
		} else if (anIntArrayArrayArray9620 != null)
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3735 }), new Class372(Class347.aClass347_3734) }));
		else
			aClass355_9623 = (aClass180_Sub2_9607.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738 }), new Class372(Class347.aClass347_3734) }));
		for (int i = 0; i < anInt9605; i++) {
			Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9638[i];
			class527_sub11.method16081(anInt9606);
		}
		if (aClass351_9644 != null)
			aClass351_9644.method6185();
		method15306();
	}

	void method15316() {
		if ((anInt9610 & 0x2) == 0) {
			anIntArrayArrayArray9614 = null;
			anIntArrayArrayArray9612 = null;
			anIntArrayArrayArray9618 = null;
		}
		anIntArrayArrayArray9620 = null;
		anIntArrayArrayArray9619 = null;
		anIntArrayArrayArray9629 = null;
		aClass527_Sub11ArrayArrayArray9617 = null;
		aByteArrayArray9627 = null;
		aClass14_9637 = null;
		aClass527Array9638 = null;
		aFloatArrayArray9613 = null;
		aFloatArrayArray9635 = null;
		aFloatArrayArray9622 = null;
	}

	void method15317() {
		if ((anInt9610 & 0x2) == 0) {
			anIntArrayArrayArray9614 = null;
			anIntArrayArrayArray9612 = null;
			anIntArrayArrayArray9618 = null;
		}
		anIntArrayArrayArray9620 = null;
		anIntArrayArrayArray9619 = null;
		anIntArrayArrayArray9629 = null;
		aClass527_Sub11ArrayArrayArray9617 = null;
		aByteArrayArray9627 = null;
		aClass14_9637 = null;
		aClass527Array9638 = null;
		aFloatArrayArray9613 = null;
		aFloatArrayArray9635 = null;
		aFloatArrayArray9622 = null;
	}

	void method15318(Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2, int i, int i_457_) {
		int[] is = anIntArrayArrayArray9612[i][i_457_];
		int[] is_458_ = anIntArrayArrayArray9614[i][i_457_];
		int i_459_ = is.length;
		if (anIntArray9643.length < i_459_) {
			anIntArray9643 = new int[i_459_];
			anIntArray9634 = new int[i_459_];
		}
		for (int i_460_ = 0; i_460_ < i_459_; i_460_++) {
			anIntArray9643[i_460_] = is[i_460_] >> aClass180_Sub2_9607.anInt9522;
			anIntArray9634[i_460_] = is_458_[i_460_] >> aClass180_Sub2_9607.anInt9522;
		}
		int i_461_ = 0;
		while (i_461_ < i_459_) {
			int i_462_ = anIntArray9643[i_461_];
			int i_463_ = anIntArray9634[i_461_++];
			int i_464_ = anIntArray9643[i_461_];
			int i_465_ = anIntArray9634[i_461_++];
			int i_466_ = anIntArray9643[i_461_];
			int i_467_ = anIntArray9634[i_461_++];
			if (((i_462_ - i_464_) * (i_465_ - i_467_) - (i_465_ - i_463_) * (i_466_ - i_464_)) > 0)
				class527_sub8_sub8_sub2.method18744(i_463_, i_465_, i_467_, i_462_, i_464_, i_466_);
		}
	}

	public void method2629(int i, int i_468_, int i_469_, boolean[][] bools, boolean bool, int i_470_) {
		if (aClass527Array9624 != null) {
			int i_471_ = i_469_ + i_469_ + 1;
			i_471_ *= i_471_;
			if (anIntArray9646.length < i_471_)
				anIntArray9646 = new int[i_471_];
			int i_472_ = i - i_469_;
			int i_473_ = i_472_;
			if (i_472_ < 0)
				i_472_ = 0;
			int i_474_ = i_468_ - i_469_;
			int i_475_ = i_474_;
			if (i_474_ < 0)
				i_474_ = 0;
			int i_476_ = i + i_469_;
			if (i_476_ > anInt1750 * 1210322533 - 1)
				i_476_ = anInt1750 * 1210322533 - 1;
			int i_477_ = i_468_ + i_469_;
			if (i_477_ > anInt1751 * -533476177 - 1)
				i_477_ = anInt1751 * -533476177 - 1;
			anInt9645 = 0;
			for (int i_478_ = i_472_; i_478_ <= i_476_; i_478_++) {
				boolean[] bools_479_ = bools[i_478_ - i_473_];
				for (int i_480_ = i_474_; i_480_ <= i_477_; i_480_++) {
					if (bools_479_[i_480_ - i_475_])
						anIntArray9646[anInt9645++] = i_480_ * (anInt1750 * 1210322533) + i_478_;
				}
			}
			ByteBuffer bytebuffer = aClass180_Sub2_9607.aByteBuffer9438;
			bytebuffer.clear();
			for (int i_481_ = 0; i_481_ < aClass527Array9624.length; i_481_++) {
				Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_481_];
				class527_sub11.method16082(anIntArray9646, anInt9645);
			}
			int i_482_ = bytebuffer.position();
			Class326 class326 = aClass180_Sub2_9607.aClass326_9541;
			aClass180_Sub2_9607.method14998();
			if (aClass180_Sub2_9607.anInt9562 > 0) {
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9607.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9607.anInt9561 >> 0 & 0xff) / 255.0F));
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9607.aFloat9517));
				class326.aClass441_3589.method7123(aClass180_Sub2_9607.aClass427_9454);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9607.aFloat9565 - aClass180_Sub2_9607.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if (i_482_ != 0) {
				Interface44 interface44 = aClass180_Sub2_9607.method15136(i_482_ / 2);
				interface44.method213(0, i_482_, aClass180_Sub2_9607.aLong9439);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method15001(interface44);
				class326.method5770(Class427.aClass427_4808);
				if ((anInt9611 & 0x7) == 0) {
					int i_483_ = 0;
					for (int i_484_ = 0; i_484_ < aClass527Array9624.length; i_484_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_484_];
						if (class527_sub11.anInt10439 != 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, ((float) aClass180_Sub2_9607.anInt9557 + ((float) ((class527_sub11.aClass178_10436.anInt2051) * -1449092429) / 255.0F * (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777))));
								class326.aClass441_3587.method7128(1.0F / (float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							boolean bool_485_ = false;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -102));
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								bool_485_ = !Class306.method5607(class163.aByte1801, -1088851960);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_483_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							class326.method5757(bool_485_);
							i_483_ += class527_sub11.anInt10439;
						}
					}
				} else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9607.aFloatArray9507[0], aClass180_Sub2_9607.aFloatArray9507[1], aClass180_Sub2_9607.aFloatArray9507[2]);
					class326.aClass442_3590.method7138((aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9516 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9583), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9513), (-aClass180_Sub2_9607.aFloat9548 * aClass180_Sub2_9607.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9583), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9513), (aClass180_Sub2_9607.aFloat9551 * aClass180_Sub2_9607.aFloat9448));
					int i_486_ = 0;
					for (int i_487_ = 0; i_487_ < aClass527Array9624.length; i_487_++) {
						Class527_Sub11 class527_sub11 = (Class527_Sub11) aClass527Array9624[i_487_];
						if (class527_sub11.anInt10439 > 0) {
							if (aClass180_Sub2_9607.aBool9495) {
								aClass180_Sub2_9607.method3144(0, class527_sub11.aClass178_10436);
								float f = 0.15F;
								class326.aClass441_3587.method7118(0.0F, 1.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f), 0.0F, 256.0F / ((float) ((class527_sub11.aClass178_10436.anInt2050) * 112490777) * f));
								class326.aClass442_3588.method7138((float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 16 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 8 & 0xff) / 255.0F, (float) ((class527_sub11.aClass178_10436.anInt2055) * -2080392837 >> 0 & 0xff) / 255.0F);
							} else {
								class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
								class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
							}
							byte i_488_ = 11;
							if (class527_sub11.anInt10435 != -1) {
								Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -67));
								i_488_ = class163.aByte1801;
								class326.anInterface38_3595 = aClass180_Sub2_9607.aClass336_9532.method5895(class163);
								class326.method5755(class163.aByte1775);
							} else
								class326.anInterface38_3595 = aClass180_Sub2_9607.anInterface38_9533;
							aClass180_Sub2_9607.method14988(1, class527_sub11.anInterface37_10434);
							aClass180_Sub2_9607.method15149(aClass355_9623);
							class326.aClass427_3583.method6815(1.0F / class527_sub11.aFloat10441, 1.0F / class527_sub11.aFloat10441, 1.0F, 1.0F);
							class326.anInt3598 = class527_sub11.anInt10440;
							class326.anInt3597 = (class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1);
							class326.anInt3584 = i_486_;
							class326.anInt3599 = class527_sub11.anInt10439 / 3;
							switch (i_488_) {
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass180_Sub2_9607.aBool9597 && (anInt9611 & 0x8) != 0 && aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443.method18052((byte) -43)) {
									Class350_Sub1_Sub2 class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9443);
									if (i_488_ == 2)
										class350_sub1_sub2 = (aClass180_Sub2_9607.aClass350_Sub1_Sub2_9545);
									class350_sub1_sub2.aClass427_11533.method6750(aClass180_Sub2_9607.aClass427_9474);
									class350_sub1_sub2.aClass427_11527.method6815(1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F / (class527_sub11.aFloat10441 * (float) ((class527_sub11.aClass178_10436.anInt2053) * -1687984183)), 1.0F, 1.0F);
									class350_sub1_sub2.aClass442_11547.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
									Class163 class163 = (aClass180_Sub2_9607.aClass181_2059.method3544(class527_sub11.anInt10435, (byte) -103));
									class350_sub1_sub2.anInt11543 = class163.aByte1775 * 2007712759;
									class350_sub1_sub2.anInt11545 = (class527_sub11.anInt10440 * -481045151);
									class350_sub1_sub2.anInt11546 = ((class527_sub11.anInt10433 - class527_sub11.anInt10440 + 1) * 527612167);
									class350_sub1_sub2.anInt11531 = i_486_ * -1248930933;
									class350_sub1_sub2.anInt11548 = (class527_sub11.anInt10439 / 3 * -1274173737);
									class350_sub1_sub2.aClass441_11542.method7119(class326.aClass441_3587);
									class350_sub1_sub2.aClass442_11540.method7146(class326.aClass442_3588);
									class350_sub1_sub2.aClass441_11525.method7119(class326.aClass441_3589);
									class350_sub1_sub2.aClass442_11544.method7146(class326.aClass442_3581);
									class350_sub1_sub2.method18055(1307339315);
								} else
									class326.method5758(0);
								break;
							case 6:
								class326.method5757(!Class306.method5607(i_488_, -1088851960));
								break;
							case 1:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5762();
								else
									class326.method5754(0);
								break;
							default:
								if (aClass180_Sub2_9607.aBool9495)
									class326.method5772();
								else
									class326.method5758(0);
								break;
							case 7:
								class326.aClass442_3592.method7138((aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9607.aClass427_9453.aFloatArray4807[14]));
								class326.aClass427_3577.method6742();
								class326.anInterface39_3582 = aClass180_Sub2_9607.method14925();
								class326.method5760(0);
							}
							i_486_ += class527_sub11.anInt10439;
						}
					}
				}
			}
			if (!aClass694_9626.method14088(-1337453044)) {
				aClass180_Sub2_9607.method15238(128);
				aClass180_Sub2_9607.method14951(false);
				Class442 class442 = new Class442(class326.aClass442_3581);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass694_9626.iterator();
				while (iterator.hasNext()) {
					Class527_Sub23 class527_sub23 = (Class527_Sub23) iterator.next();
					class527_sub23.method16239(class326, i, i_468_, i_469_, bools, bool);
				}
				class326.aClass442_3581.method7146(class442);
			}
			if (aClass351_9644 != null) {
				aClass180_Sub2_9607.method15238(1);
				aClass180_Sub2_9607.method14988(0, anInterface37_9628);
				aClass180_Sub2_9607.method14988(1, anInterface37_9632);
				aClass180_Sub2_9607.method15149(aClass355_9623);
				Class427 class427 = aClass180_Sub2_9607.aClass427_9435;
				class427.method6742();
				class427.aFloatArray4807[13] = -1.0F;
				class326.method5770(class427);
				aClass351_9644.method6182(class326, i, i_468_, i_469_, bools, bool);
			}
		}
	}
}
