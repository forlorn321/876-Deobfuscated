/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class284 implements Interface76 {
	int anInt3203;
	static Class284 aClass284_3204;
	static Class284 aClass284_3205;
	static Class284 aClass284_3206;
	static Class284 aClass284_3207 = new Class284(0);

	Class284(int i) {
		anInt3203 = i * 1380100663;
	}

	public int method87() {
		return 21441415 * anInt3203;
	}

	static {
		aClass284_3204 = new Class284(1);
		aClass284_3205 = new Class284(2);
		aClass284_3206 = new Class284(3);
	}

	public int method42() {
		return 21441415 * anInt3203;
	}

	public int method91() {
		return 21441415 * anInt3203;
	}

	static Class277[] method5200(int i) {
		return (new Class277[] { Class277.aClass277_3166, Class277.aClass277_3163, Class277.aClass277_3164 });
	}

	static final void method5201(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		int i_3_ = Class691.method14019(i_1_, (byte) 15);
		int i_4_ = Class245.method4627(i_1_, 2122907853);
		Class4 class4 = (Class4) Class431.aClass24_4851.method81(i_0_, -179335867);
		Class84 class84 = (Class84) Class208_Sub2.aClass24_9868.method81(i_3_, 1072372762);
		Class462[] class462s = class84.aClass462ArrayArray814[i_4_];
		Object[] objects = class4.method564(i_4_, -1961672675);
		if (objects == null && null != class84.anObjectArrayArray813)
			objects = class84.anObjectArrayArray813[i_4_];
		if (null == objects) {
			for (int i_5_ = 0; i_5_ < class462s.length; i_5_++) {
				Class462 class462 = class462s[i_5_];
				if (Class462.aClass462_5131 == class462)
					class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
				else if (Class462.aClass462_5255 == class462 || Class462.aClass462_5096 == class462)
					class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
				else
					class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			}
		} else {
			int i_6_ = objects.length / class462s.length;
			if (i_2_ < 0 || i_2_ >= i_6_)
				throw new RuntimeException();
			for (int i_7_ = 0; i_7_ < class462s.length; i_7_++) {
				int i_8_ = class462s.length * i_2_ + i_7_;
				if (Class462.aClass462_5131 == class462s[i_7_])
					class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = objects[i_8_];
				else
					class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = ((Integer) objects[i_8_]).intValue();
			}
		}
	}

	public static int method5202(Class677 class677, Class682 class682, int i, byte i_9_) {
		if (Class677.aClass677_8596 == class677)
			return 80;
		if (Class682.aClass682_8646 == class682)
			return 12000 + i;
		return i + 7000;
	}

	static final void method5203(Class665 class665, int i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_10_, 1501220968);
		Class240 class240 = Class183.aClass240Array2100[i_10_ >> 16];
		Class461.method7599(class243, class240, class665, -1104999764);
	}
}
