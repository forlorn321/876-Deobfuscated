/* Class333_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class333_Sub2 extends Class333 {
	boolean aBool10026;
	Class436 aClass436_10027 = new Class436();
	Class436 aClass436_10028;
	int anInt10029;
	public Class425 aClass425_10030 = new Class425();
	int anInt10031;
	Class436 aClass436_10032;
	Class425 aClass425_10033;
	Class436 aClass436_10034;
	Interface31 anInterface31_10035;

	public Class436 method9167() {
		return aClass436_10032;
	}

	public void method9168(byte i) {
		if (null != anInterface31_10035)
			anInterface31_10035 = (aClass301_3620.method4080(1070196547).method205(anInterface31_10035.method192(456370206), anInterface31_10035.method199((short) 28184), 1027227965));
	}

	public void method4345(float f, int[][][] is, Class455 class455, int i, int i_0_, int i_1_) {
		if (anInterface31_10035 != null) {
			method9169(is, class455, i, i_0_, 2088183359);
			Class425 class425 = method9172((byte) 0);
			aClass425_10033.method5117(class425, aClass301_3620.method4081((byte) -125));
			if (Float.isNaN(aClass425_10033.aFloat4796))
				aClass425_10033.method5087(class425);
			class425.method5080();
			aClass436_10028.method5272(anInterface31_10035.method190(-1409356691).method9629(2064038903));
			aClass301_3620.method4053(true, f, aClass436_10032, aClass301_3620.method4061(-77115883), aClass436_10028, aClass436_10034, -476162823);
		}
	}

	public void method4340(Class305 class305, int i, int i_2_, int i_3_) {
		Class436 class436 = method4343((byte) 69);
		class305.anInt3441 = ((int) class436.aFloat4850 - i) * 164961599;
		class305.anInt3442 = (int) -class436.aFloat4852 * 1436659191;
		class305.anInt3443 = ((int) class436.aFloat4853 - i_2_) * -1246574647;
		class436.method5239();
	}

	void method9169(int[][][] is, Class455 class455, int i, int i_4_, int i_5_) {
		if (method4342(-1829702167) && (aClass301_3620.method4090(-418492204) || aClass301_3620.method4067(-1037728527))) {
			Class536_Sub30 class536_sub30 = anInterface31_10035.method190(2060889693);
			anInt10031 = class536_sub30.anInt10565 * 702667597;
			int i_6_ = 121196713 * anInt10031;
			boolean bool = true;
			if (121196713 * anInt10031 == 3)
				bool = false;
			else if (null != class455 && (class455.method5466(class536_sub30.anInt10568 * 2135129199 - i >> 9, class536_sub30.anInt10567 * -1369836225 - i_4_ >> 9, (byte) -9))) {
				i_6_ = 1 + anInt10031 * 121196713;
				bool = false;
			}
			if (aClass301_3620.method4067(-1037728527) && is != null) {
				float f = method9170(is, class455, i, i_4_, i_6_, bool, (byte) 14);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_7_ = 3.1415927F;
						Class436 class436 = Class436.method5257(0.0F, 0.0F, 1.0F);
						class436.method5263(aClass425_10030);
						Class436 class436_8_ = Class436.method5257(class436.aFloat4850, 0.0F, class436.aFloat4853);
						class436_8_.method5247();
						float f_9_ = Class436.method5254(class436, class436_8_);
						for (int i_10_ = 0; i_10_ < 10; i_10_++) {
							float f_11_ = (f_9_ + f_7_) / 2.0F - f_9_;
							float f_12_ = f_11_;
							if (f > 0.0F)
								f_12_ *= -1.0F;
							Class436 class436_13_ = Class436.method5257(1.0F, 0.0F, 0.0F);
							class436_13_.method5263(aClass425_10030);
							Class425 class425 = Class425.method5081();
							class425.method5115(class436_13_, f_12_);
							aClass425_10030.method5096(class425);
							aClass425_10030.method5092();
							class436_13_.method5239();
							class425.method5080();
							f = method9170(is, class455, i, i_4_, i_6_, bool, (byte) 14);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_9_ += f_11_;
							else
								f_7_ -= f_11_;
						}
					}
				}
			}
		}
	}

	float method9170(int[][][] is, Class455 class455, int i, int i_14_, int i_15_, boolean bool, byte i_16_) {
		Class425 class425 = method9172((byte) 0);
		Class436 class436 = method9171(class425, -1803724474);
		class425.method5080();
		int i_17_ = (int) class436.aFloat4850 - i >> 9;
		int i_18_ = (int) class436.aFloat4853 - i_14_ >> 9;
		if (i_17_ >= 0 && i_18_ >= 0 && 1 + i_17_ < is[0].length && i_18_ + 1 < is[0][0].length) {
			int i_19_ = i_15_;
			if (bool && class455.method5466(i_17_, i_18_, (byte) -30))
				i_19_ = 1 + i_15_;
			long l = (long) class436.aFloat4850 % 512L;
			long l_20_ = (long) class436.aFloat4853 % 512L;
			long l_21_ = (512L - l) * (long) is[i_19_][i_17_][i_18_] * (512L - l_20_);
			l_21_ += (512L - l_20_) * ((long) is[i_19_][1 + i_17_][i_18_] * l);
			l_21_ += (long) is[i_19_][i_17_][i_18_ + 1] * (512L - l) * l_20_;
			l_21_ += (long) is[i_19_][i_17_ + 1][1 + i_18_] * l * l_20_;
			l_21_ /= 262144L;
			l_21_ -= 1024L;
			float f = (float) -l_21_ - class436.aFloat4852;
			class436.method5239();
			return f;
		}
		class436.method5239();
		return Float.NaN;
	}

	Class436 method9171(Class425 class425, int i) {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(class425);
		Class436 class436_22_ = Class436.method5250(aClass436_10028, class436);
		class436.method5239();
		return class436_22_;
	}

	Class425 method9172(byte i) {
		Class425 class425 = Class425.method5121(aClass425_10030);
		if (aBool10026) {
			Class436 class436 = anInterface31_10035.method194(-1918011341);
			if (class436.method5291() < (float) (-1186200387 * anInt10029)) {
				class436 = Class436.method5257(0.0F, 0.0F, 1.0F);
				Class425 class425_23_ = anInterface31_10035.method193((byte) 1);
				class436.method5263(class425_23_);
			}
			class436.aFloat4852 = 0.0F;
			float f = (float) Math.atan2((double) class436.aFloat4850, (double) class436.aFloat4853);
			class436.method5239();
			Class425 class425_24_ = new Class425();
			class425_24_.method5090(0.0F, 1.0F, 0.0F, f);
			class425.method5096(class425_24_);
		}
		return class425;
	}

	public double[] method4344(int i) {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) -77);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public void method9173(Interface31 interface31, Class436 class436, Class425 class425, boolean bool, int i, int[][][] is, Class455 class455, int i_25_, int i_26_, byte i_27_) {
		anInterface31_10035 = interface31;
		aClass436_10027.method5272(class436);
		aClass425_10030.method5087(class425);
		aBool10026 = bool;
		anInt10029 = -808642923 * i;
		anInt10031 = anInterface31_10035.method190(-402855305).anInt10565 * 702667597;
		method9169(is, class455, i_25_, i_26_, 2088183359);
	}

	public Class436 method4343(byte i) {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(aClass425_10033);
		Class436 class436_28_ = Class436.method5250(aClass436_10032, class436);
		class436.method5239();
		return class436_28_;
	}

	public Class436 method9174(int i) {
		return aClass436_10027;
	}

	public float method9175(int i) {
		return Class475.method5744(aClass425_10030, (byte) 12);
	}

	public float method9176(int i) {
		return Class465.method5667(aClass425_10030, -1454795368);
	}

	public Class333_Sub2(Class301 class301) {
		super(class301);
		anInt10029 = 1480172648;
		aClass436_10032 = new Class436(Float.NaN, Float.NaN, Float.NaN);
		aClass436_10028 = new Class436(Float.NaN, Float.NaN, Float.NaN);
		aClass436_10034 = new Class436();
		aClass425_10033 = new Class425();
	}

	public float method4364() {
		return 0.0F;
	}

	public void method4348(RSByteBuffer class536_sub33, byte i) {
		Class308 class308 = Class441.method5332(class536_sub33.readUnsignedByte(), (byte) 99);
		int i_29_ = class536_sub33.readUnsignedShort();
		aClass436_10027.method5242(class536_sub33);
		aClass425_10030.method5085(class536_sub33);
		if (class536_sub33.readUnsignedByte() == 1)
			aBool10026 = true;
		else
			aBool10026 = false;
		anInt10029 = class536_sub33.readUnsignedShort() * -808642923;
		anInterface31_10035 = aClass301_3620.method4080(1988309755).method205(class308, i_29_, 1905417575);
	}

	public void method4349(float f, int[][][] is, Class455 class455, int i, int i_30_) {
		if (anInterface31_10035 != null) {
			method9169(is, class455, i, i_30_, 2088183359);
			Class425 class425 = method9172((byte) 0);
			aClass425_10033.method5117(class425, aClass301_3620.method4081((byte) 11));
			if (Float.isNaN(aClass425_10033.aFloat4796))
				aClass425_10033.method5087(class425);
			class425.method5080();
			aClass436_10028.method5272(anInterface31_10035.method190(329531461).method9629(980803287));
			aClass301_3620.method4053(true, f, aClass436_10032, aClass301_3620.method4061(-77115883), aClass436_10028, aClass436_10034, -1158317636);
		}
	}

	public boolean method4350() {
		return !Float.isNaN(aClass436_10032.aFloat4850);
	}

	public boolean method4351() {
		return !Float.isNaN(aClass436_10032.aFloat4850);
	}

	public Class436 method4355() {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(aClass425_10033);
		Class436 class436_31_ = Class436.method5250(aClass436_10032, class436);
		class436.method5239();
		return class436_31_;
	}

	public Class536_Sub30 method4347() {
		Class436 class436 = method4343((byte) 55);
		Class536_Sub30 class536_sub30 = new Class536_Sub30(121196713 * anInt10031, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
		class436.method5239();
		return class536_sub30;
	}

	public Class436 method4362() {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(aClass425_10033);
		Class436 class436_32_ = Class436.method5250(aClass436_10032, class436);
		class436.method5239();
		return class436_32_;
	}

	public Class436 method4356() {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(aClass425_10033);
		Class436 class436_33_ = Class436.method5250(aClass436_10032, class436);
		class436.method5239();
		return class436_33_;
	}

	public Class436 method4354() {
		Class436 class436 = Class436.method5240(aClass436_10027);
		class436.method5263(aClass425_10033);
		Class436 class436_34_ = Class436.method5250(aClass436_10032, class436);
		class436.method5239();
		return class436_34_;
	}

	public double[] method4341() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) -41);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public float method4346(int i) {
		return 0.0F;
	}

	public void method4359(Class305 class305, int i, int i_35_) {
		Class436 class436 = method4343((byte) -58);
		class305.anInt3441 = ((int) class436.aFloat4850 - i) * 164961599;
		class305.anInt3442 = (int) -class436.aFloat4852 * 1436659191;
		class305.anInt3443 = ((int) class436.aFloat4853 - i_35_) * -1246574647;
		class436.method5239();
	}

	public Class536_Sub30 method4357() {
		Class436 class436 = method4343((byte) 14);
		Class536_Sub30 class536_sub30 = new Class536_Sub30(121196713 * anInt10031, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
		class436.method5239();
		return class536_sub30;
	}

	public void method4358(RSByteBuffer class536_sub33) {
		Class308 class308 = Class441.method5332(class536_sub33.readUnsignedByte(), (byte) 37);
		int i = class536_sub33.readUnsignedShort();
		aClass436_10027.method5242(class536_sub33);
		aClass425_10030.method5085(class536_sub33);
		if (class536_sub33.readUnsignedByte() == 1)
			aBool10026 = true;
		else
			aBool10026 = false;
		anInt10029 = class536_sub33.readUnsignedShort() * -808642923;
		anInterface31_10035 = aClass301_3620.method4080(561339298).method205(class308, i, 1483905918);
	}

	public boolean method4342(int i) {
		return !Float.isNaN(aClass436_10032.aFloat4850);
	}

	public double[] method4363() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) 49);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public double[] method4361() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) 72);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public float method4365() {
		return 0.0F;
	}

	public Class436 method9177(byte i) {
		return aClass436_10032;
	}

	public Class436 method9178() {
		return aClass436_10032;
	}

	public Class536_Sub30 method4353(int i) {
		Class436 class436 = method4343((byte) -2);
		Class536_Sub30 class536_sub30 = new Class536_Sub30(121196713 * anInt10031, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
		class436.method5239();
		return class536_sub30;
	}

	public Class536_Sub30 method4360() {
		Class436 class436 = method4343((byte) -32);
		Class536_Sub30 class536_sub30 = new Class536_Sub30(121196713 * anInt10031, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
		class436.method5239();
		return class536_sub30;
	}

	public boolean method4352() {
		return !Float.isNaN(aClass436_10032.aFloat4850);
	}

	public float method9179() {
		return Class465.method5667(aClass425_10030, -1633681931);
	}

	static final void method9180(Class668 class668, byte i) {
		int i_36_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (client.aString11137 != null && i_36_ < Class269.anInt2880 * -918987073)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class360_Sub1.aClass94Array10168[i_36_].aString1142;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}
}
