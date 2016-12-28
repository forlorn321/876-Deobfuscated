/* Class683 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class683 {
	Class234 aClass234_8649;
	IComponentDefinitions aClass251_8650;
	public static Class301_Sub1 aClass301_Sub1_8651;
	static RSByteBuffer aClass536_Sub33_8652;

	boolean method8093(int i, int i_0_) {
		IComponentDefinitions class251 = Class527.method6429(i, i_0_, (byte) -118);
		if (null != class251) {
			aClass234_8649 = Class463.aClass234Array5227[i >> 16];
			aClass251_8650 = class251;
			return true;
		}
		method8095(1601891535);
		return false;
	}

	IComponentDefinitions method8094(int i) {
		return aClass234_8649.method3337((-1591767037 * aClass251_8650.anInt2559), 552340768);
	}

	void method8095(int i) {
		aClass234_8649 = null;
		aClass251_8650 = null;
	}

	boolean method8096(int i, int i_1_, short i_2_) {
		IComponentDefinitions class251 = Class527.method6429(i, i_1_, (byte) -32);
		if (null != class251) {
			aClass234_8649 = Class463.aClass234Array5227[i >> 16];
			aClass251_8650 = class251;
			return true;
		}
		method8095(1778646186);
		return false;
	}

	void method8097() {
		aClass234_8649 = null;
		aClass251_8650 = null;
	}

	boolean method8098(int i, int i_3_) {
		IComponentDefinitions class251 = Class527.method6429(i, i_3_, (byte) -47);
		if (null != class251) {
			aClass234_8649 = Class463.aClass234Array5227[i >> 16];
			aClass251_8650 = class251;
			return true;
		}
		method8095(945609388);
		return false;
	}

	boolean method8099(int i, int i_4_) {
		IComponentDefinitions class251 = Class527.method6429(i, i_4_, (byte) -121);
		if (null != class251) {
			aClass234_8649 = Class463.aClass234Array5227[i >> 16];
			aClass251_8650 = class251;
			return true;
		}
		method8095(1593068526);
		return false;
	}

	Class683() {
		/* empty */
	}

	void method8100() {
		aClass234_8649 = null;
		aClass251_8650 = null;
	}

	void method8101() {
		aClass234_8649 = null;
		aClass251_8650 = null;
	}

	void method8102() {
		aClass234_8649 = null;
		aClass251_8650 = null;
	}

	static final void method8103(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class434.method5233(class251, class234, class668, -1666759530);
	}
}
