/* Class333_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class333_Sub1 extends Class333 {
	int anInt10019;
	Class436 aClass436_10020 = new Class436(Float.NaN, Float.NaN, Float.NaN);
	Class436 aClass436_10021 = new Class436(Float.NaN, Float.NaN, Float.NaN);
	boolean aBool10022;
	Class436 aClass436_10023 = new Class436();

	public void method9159(boolean bool) {
		aBool10022 = bool;
	}

	public void method9160(Class536_Sub30 class536_sub30, int i) {
		aClass436_10021.aFloat4850 = (float) (2135129199 * class536_sub30.anInt10568);
		aClass436_10021.aFloat4852 = (float) (737759727 * class536_sub30.anInt10564);
		aClass436_10021.aFloat4853 = (float) (class536_sub30.anInt10567 * -1369836225);
		if (Float.isNaN(aClass436_10020.aFloat4850)) {
			aClass436_10020.method5272(aClass436_10021);
			aClass436_10023.method5244();
		}
		anInt10019 = 425217631 * class536_sub30.anInt10565;
	}

	public void method4345(float f, int[][][] is, Class455 class455, int i, int i_0_, int i_1_) {
		if (aBool10022)
			method9161(is, class455, i, i_0_, -2068781397);
		aClass301_3620.method4053(true, f, aClass436_10020, aClass301_3620.method4061(-77115883), aClass436_10021, aClass436_10023, -996471932);
	}

	public Class436 method4362() {
		return Class436.method5240(aClass436_10020);
	}

	public Class436 method4343(byte i) {
		return Class436.method5240(aClass436_10020);
	}

	public double[] method4344(int i) {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) 79);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public Class536_Sub30 method4353(int i) {
		return new Class536_Sub30(anInt10019 * -1436278709, (int) aClass436_10020.aFloat4850, (int) aClass436_10020.aFloat4852, (int) aClass436_10020.aFloat4853);
	}

	public float method4346(int i) {
		return 0.0F;
	}

	public Class536_Sub30 method4347() {
		return new Class536_Sub30(anInt10019 * -1436278709, (int) aClass436_10020.aFloat4850, (int) aClass436_10020.aFloat4852, (int) aClass436_10020.aFloat4853);
	}

	void method9161(int[][][] is, Class455 class455, int i, int i_2_, int i_3_) {
		if (method4342(-1862924847) && (aClass301_3620.method4090(-418492204) || aClass301_3620.method4067(-1037728527)) && aClass301_3620.method4067(-1037728527) && is != null) {
			int i_4_ = (int) aClass436_10021.aFloat4850 - i >> 9;
			int i_5_ = (int) aClass436_10021.aFloat4853 - i_2_ >> 9;
			if (i_4_ >= 0 && i_5_ >= 0 && i_4_ + 1 < is[0].length && 1 + i_5_ < is[0][0].length) {
				int i_6_ = -1436278709 * anInt10019;
				if (class455.method5466(i_4_, i_5_, (byte) -84))
					i_6_ = 1 + -1436278709 * anInt10019;
				long l = (long) aClass436_10021.aFloat4850 % 512L;
				long l_7_ = (long) aClass436_10021.aFloat4853 % 512L;
				long l_8_ = (512L - l) * (long) is[i_6_][i_4_][i_5_] * (512L - l_7_);
				l_8_ += (512L - l_7_) * (l * (long) is[i_6_][1 + i_4_][i_5_]);
				l_8_ += l_7_ * ((512L - l) * (long) is[i_6_][i_4_][1 + i_5_]);
				l_8_ += (long) is[i_6_][i_4_ + 1][1 + i_5_] * l * l_7_;
				l_8_ /= 262144L;
				l_8_ -= 512L;
				float f = (float) -l_8_ - aClass436_10021.aFloat4852;
				if (f > 0.0F)
					aClass436_10021.aFloat4852 = (float) -l_8_;
			}
		}
	}

	public void method4340(Class305 class305, int i, int i_9_, int i_10_) {
		class305.anInt3441 = ((int) aClass436_10020.aFloat4850 - i) * 164961599;
		class305.anInt3442 = (int) -aClass436_10020.aFloat4852 * 1436659191;
		class305.anInt3443 = ((int) aClass436_10020.aFloat4853 - i_9_) * -1246574647;
	}

	public void method4349(float f, int[][][] is, Class455 class455, int i, int i_11_) {
		if (aBool10022)
			method9161(is, class455, i, i_11_, -2068781397);
		aClass301_3620.method4053(true, f, aClass436_10020, aClass301_3620.method4061(-77115883), aClass436_10021, aClass436_10023, -1519146873);
	}

	public boolean method4350() {
		return !Float.isNaN(aClass436_10020.aFloat4850);
	}

	public boolean method4351() {
		return !Float.isNaN(aClass436_10020.aFloat4850);
	}

	public double[] method4361() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) -16);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public void method9162(boolean bool) {
		aBool10022 = bool;
	}

	public Class436 method4356() {
		return Class436.method5240(aClass436_10020);
	}

	public Class436 method4354() {
		return Class436.method5240(aClass436_10020);
	}

	public Class436 method4355() {
		return Class436.method5240(aClass436_10020);
	}

	public void method4359(Class305 class305, int i, int i_12_) {
		class305.anInt3441 = ((int) aClass436_10020.aFloat4850 - i) * 164961599;
		class305.anInt3442 = (int) -aClass436_10020.aFloat4852 * 1436659191;
		class305.anInt3443 = ((int) aClass436_10020.aFloat4853 - i_12_) * -1246574647;
	}

	public Class536_Sub30 method4357() {
		return new Class536_Sub30(anInt10019 * -1436278709, (int) aClass436_10020.aFloat4850, (int) aClass436_10020.aFloat4852, (int) aClass436_10020.aFloat4853);
	}

	public boolean method4352() {
		return !Float.isNaN(aClass436_10020.aFloat4850);
	}

	public Class536_Sub30 method4360() {
		return new Class536_Sub30(anInt10019 * -1436278709, (int) aClass436_10020.aFloat4850, (int) aClass436_10020.aFloat4852, (int) aClass436_10020.aFloat4853);
	}

	public void method4358(RSByteBuffer class536_sub33) {
		aClass436_10021.method5242(class536_sub33);
	}

	public Class333_Sub1(Class301 class301) {
		super(class301);
		aBool10022 = false;
	}

	public boolean method4342(int i) {
		return !Float.isNaN(aClass436_10020.aFloat4850);
	}

	public void method9163(boolean bool, int i) {
		aBool10022 = bool;
	}

	public void method4348(RSByteBuffer class536_sub33, byte i) {
		aClass436_10021.method5242(class536_sub33);
	}

	public double[] method4341() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) 63);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public double[] method4363() {
		double[] ds = new double[3];
		Class436 class436 = method4343((byte) 12);
		ds[0] = (double) class436.aFloat4850;
		ds[1] = (double) class436.aFloat4852;
		ds[2] = (double) class436.aFloat4853;
		return ds;
	}

	public float method4364() {
		return 0.0F;
	}

	public float method4365() {
		return 0.0F;
	}

	static final void method9164(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_13_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2658 * -1064708005;
	}

	static int method9165(Interface18 interface18, Interface12 interface12, byte i) {
		int i_14_ = 0;
		for (int i_15_ = 0; i_15_ < interface12.method71(1923011516); i_15_++) {
			Class277 class277 = (Class277) interface12.method70(i_15_, (byte) 66);
			if (class277.method3750(interface18, (byte) 79))
				i_14_ += -805412769 * class277.anInt3038;
		}
		return i_14_;
	}
}
