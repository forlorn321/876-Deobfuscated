/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;

class Class567 implements Comparator {
	Class358_Sub1 this$0;

	public boolean method9557(Object object) {
		return super.equals(object);
	}

	int method9558(Class494 class494, Class494 class494_0_, byte i) {
		float f = class494.method8018((byte) 104);
		float f_1_ = class494_0_.method8018((byte) 98);
		if (f_1_ > f)
			return 1;
		if (f_1_ < f)
			return -1;
		return 0;
	}

	public int compare(Object object, Object object_2_) {
		return method9558((Class494) object, (Class494) object_2_, (byte) 0);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method9559(Object object, Object object_3_) {
		return method9558((Class494) object, (Class494) object_3_, (byte) 0);
	}

	public int method9560(Object object, Object object_4_) {
		return method9558((Class494) object, (Class494) object_4_, (byte) 0);
	}

	int method9561(Class494 class494, Class494 class494_5_) {
		float f = class494.method8018((byte) 56);
		float f_6_ = class494_5_.method8018((byte) 70);
		if (f_6_ > f)
			return 1;
		if (f_6_ < f)
			return -1;
		return 0;
	}

	public boolean method9562(Object object) {
		return super.equals(object);
	}

	Class567(Class358_Sub1 class358_sub1) {
		this$0 = class358_sub1;
	}

	int method9563(Class494 class494, Class494 class494_7_) {
		float f = class494.method8018((byte) 65);
		float f_8_ = class494_7_.method8018((byte) 95);
		if (f_8_ > f)
			return 1;
		if (f_8_ < f)
			return -1;
		return 0;
	}

	static final void method9564(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class180.method3537(class243, class240, class665, (short) 28794);
	}
}
