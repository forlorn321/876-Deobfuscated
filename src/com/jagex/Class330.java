/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class330 implements Interface33 {
	Class385 aClass385_3607;
	Class335 aClass335_3608;
	protected static Class513 aClass513_3609;

	public boolean method207() {
		return aClass335_3608.method5861((byte) 27);
	}

	public boolean method204(int i) {
		return aClass335_3608.method5861((byte) 10);
	}

	Class330(Class335 class335, Class385 class385) {
		aClass385_3607 = class385;
		aClass335_3608 = class335;
	}

	public void method203(boolean bool, int i) {
		Class320 class320 = aClass335_3608.method5860(aClass385_3607.anInt3953 * -1661728479, (byte) -22);
		if (class320 != null) {
			int i_0_ = ((aClass385_3607.aClass400_3960.method6525(-180463939 * aClass385_3607.anInt3957, client.anInt11158 * -1844600635, -1173855569)) + -1750051411 * aClass385_3607.anInt3952);
			int i_1_ = ((aClass385_3607.aClass384_3951.method6413(aClass385_3607.anInt3950 * 930241459, client.anInt11058 * 1254981347, -1880637581)) + aClass385_3607.anInt3959 * 828533283);
			if (aClass385_3607.aBool3958)
				Class402.aClass180_4150.method3134(i_0_, i_1_, -180463939 * aClass385_3607.anInt3957, 930241459 * aClass385_3607.anInt3950, -1339655015 * aClass385_3607.anInt3956, 0);
			i_1_ += method5816(Class29.aClass174_262, class320.aString3542, i_0_, i_1_, 5, 1905792263) * 12;
			i_1_ += 8;
			if (aClass385_3607.aBool3958)
				Class402.aClass180_4150.method3149(i_0_, i_1_, i_0_ + -180463939 * aClass385_3607.anInt3957 - 1, i_1_, aClass385_3607.anInt3956 * -1339655015, 0);
			i_1_ = ++i_1_ + method5816(Class29.aClass174_262, class320.aString3540, i_0_, i_1_, 5, 1905792263) * 12;
			i_1_ += 5;
			i_1_ += method5816(Class29.aClass174_262, class320.aString3541, i_0_, i_1_, 5, 1905792263) * 12;
		}
	}

	public void method85() {
		/* empty */
	}

	public void method206(boolean bool) {
		Class320 class320 = aClass335_3608.method5860(aClass385_3607.anInt3953 * -1661728479, (byte) 19);
		if (class320 != null) {
			int i = ((aClass385_3607.aClass400_3960.method6525(-180463939 * aClass385_3607.anInt3957, client.anInt11158 * -1844600635, -1173855569)) + -1750051411 * aClass385_3607.anInt3952);
			int i_2_ = ((aClass385_3607.aClass384_3951.method6413(aClass385_3607.anInt3950 * 930241459, client.anInt11058 * 1254981347, 463745542)) + aClass385_3607.anInt3959 * 828533283);
			if (aClass385_3607.aBool3958)
				Class402.aClass180_4150.method3134(i, i_2_, -180463939 * aClass385_3607.anInt3957, 930241459 * aClass385_3607.anInt3950, -1339655015 * aClass385_3607.anInt3956, 0);
			i_2_ += method5816(Class29.aClass174_262, class320.aString3542, i, i_2_, 5, 1905792263) * 12;
			i_2_ += 8;
			if (aClass385_3607.aBool3958)
				Class402.aClass180_4150.method3149(i, i_2_, i + -180463939 * aClass385_3607.anInt3957 - 1, i_2_, aClass385_3607.anInt3956 * -1339655015, 0);
			i_2_ = ++i_2_ + method5816(Class29.aClass174_262, class320.aString3540, i, i_2_, 5, 1905792263) * 12;
			i_2_ += 5;
			i_2_ += method5816(Class29.aClass174_262, class320.aString3541, i, i_2_, 5, 1905792263) * 12;
		}
	}

	public void method205(byte i) {
		/* empty */
	}

	public boolean method208() {
		return aClass335_3608.method5861((byte) 73);
	}

	int method5816(Class174 class174, String string, int i, int i_3_, int i_4_, int i_5_) {
		return class174.method2746(string, i + i_4_, i_3_ + i_4_, (-180463939 * aClass385_3607.anInt3957 - i_4_ * 2), (aClass385_3607.anInt3950 * 930241459 - i_4_ * 2), -61851491 * aClass385_3607.anInt3954, aClass385_3607.anInt3955 * 206434737, 0, 0, 0, null, null, null, 0, 0, -1300246824);
	}

	int method5817(Class174 class174, String string, int i, int i_6_, int i_7_) {
		return class174.method2746(string, i + i_7_, i_6_ + i_7_, (-180463939 * aClass385_3607.anInt3957 - i_7_ * 2), (aClass385_3607.anInt3950 * 930241459 - i_7_ * 2), -61851491 * aClass385_3607.anInt3954, aClass385_3607.anInt3955 * 206434737, 0, 0, 0, null, null, null, 0, 0, -1300246824);
	}

	static final void method5818(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2539 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		Class430.method6876(class243, (byte) 65);
	}
}
