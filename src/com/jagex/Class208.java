/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class208 implements Interface55 {
	Class211 this$0;
	static Class60 aClass60_2245;

	public void method361(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -14);
		float f = class479.method5808(-1667837981);
		float f_0_ = class479.method5782(-1026052262);
		Class436 class436_1_ = this$0.method2985(-2105885988);
		Class436 class436_2_ = Class436.method5252(class436, class436_1_);
		float f_3_ = 0.0F;
		float f_4_ = class436_2_.method5291();
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_5_ = ((Float) objects[0]).floatValue();
			float f_6_ = ((Float) objects[1]).floatValue();
			if (class436_1_.aFloat4850 > class436.aFloat4850 - f_5_ / 2.0F && class436_1_.aFloat4850 < class436.aFloat4850 + f_5_ / 2.0F && class436_1_.aFloat4853 > class436.aFloat4853 - f_6_ / 2.0F && (class436_1_.aFloat4853 < f_6_ / 2.0F + class436.aFloat4853)) {
				float f_7_ = Math.abs(class436_1_.aFloat4850 - (f_5_ / 2.0F + class436.aFloat4850));
				float f_8_ = Math.abs(class436_1_.aFloat4850 - (class436.aFloat4850 - f_5_ / 2.0F));
				float f_9_ = Math.abs(class436_1_.aFloat4853 - (class436.aFloat4850 + f_6_ / 2.0F));
				float f_10_ = Math.abs(class436_1_.aFloat4853 - (class436.aFloat4850 - f_6_ / 2.0F));
				float f_11_ = f_0_ - f;
				float f_12_ = Math.min(f_7_, f_8_);
				float f_13_ = Math.min(f_9_, f_10_);
				float f_14_ = 1.0F / f_11_ * f_12_;
				float f_15_ = f_13_ * (1.0F / f_11_);
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_3_ = Math.min(f_14_, f_15_);
			}
		}
		fs[0] = f_3_;
		fs[1] = f_3_;
	}

	public void method360(Object object, float[] fs, Object[] objects, byte i) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -71);
		float f = class479.method5808(-1217605812);
		float f_16_ = class479.method5782(-802238673);
		Class436 class436_17_ = this$0.method2985(-1329348677);
		Class436 class436_18_ = Class436.method5252(class436, class436_17_);
		float f_19_ = 0.0F;
		float f_20_ = class436_18_.method5291();
		if (f_20_ >= f_16_)
			f_19_ = 0.0F;
		else {
			float f_21_ = ((Float) objects[0]).floatValue();
			float f_22_ = ((Float) objects[1]).floatValue();
			if (class436_17_.aFloat4850 > class436.aFloat4850 - f_21_ / 2.0F && class436_17_.aFloat4850 < class436.aFloat4850 + f_21_ / 2.0F && class436_17_.aFloat4853 > class436.aFloat4853 - f_22_ / 2.0F && (class436_17_.aFloat4853 < f_22_ / 2.0F + class436.aFloat4853)) {
				float f_23_ = Math.abs(class436_17_.aFloat4850 - (f_21_ / 2.0F + class436.aFloat4850));
				float f_24_ = Math.abs(class436_17_.aFloat4850 - (class436.aFloat4850 - f_21_ / 2.0F));
				float f_25_ = Math.abs(class436_17_.aFloat4853 - (class436.aFloat4850 + f_22_ / 2.0F));
				float f_26_ = Math.abs(class436_17_.aFloat4853 - (class436.aFloat4850 - f_22_ / 2.0F));
				float f_27_ = f_16_ - f;
				float f_28_ = Math.min(f_23_, f_24_);
				float f_29_ = Math.min(f_25_, f_26_);
				float f_30_ = 1.0F / f_27_ * f_28_;
				float f_31_ = f_29_ * (1.0F / f_27_);
				f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
				f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
				f_19_ = Math.min(f_30_, f_31_);
			}
		}
		fs[0] = f_19_;
		fs[1] = f_19_;
	}

	Class208(Class211 class211) {
		this$0 = class211;
	}

	public void method362(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -113);
		float f = class479.method5808(-1973653533);
		float f_32_ = class479.method5782(-1204439019);
		Class436 class436_33_ = this$0.method2985(-1227192766);
		Class436 class436_34_ = Class436.method5252(class436, class436_33_);
		float f_35_ = 0.0F;
		float f_36_ = class436_34_.method5291();
		if (f_36_ >= f_32_)
			f_35_ = 0.0F;
		else {
			float f_37_ = ((Float) objects[0]).floatValue();
			float f_38_ = ((Float) objects[1]).floatValue();
			if (class436_33_.aFloat4850 > class436.aFloat4850 - f_37_ / 2.0F && class436_33_.aFloat4850 < class436.aFloat4850 + f_37_ / 2.0F && class436_33_.aFloat4853 > class436.aFloat4853 - f_38_ / 2.0F && (class436_33_.aFloat4853 < f_38_ / 2.0F + class436.aFloat4853)) {
				float f_39_ = Math.abs(class436_33_.aFloat4850 - (f_37_ / 2.0F + class436.aFloat4850));
				float f_40_ = Math.abs(class436_33_.aFloat4850 - (class436.aFloat4850 - f_37_ / 2.0F));
				float f_41_ = Math.abs(class436_33_.aFloat4853 - (class436.aFloat4850 + f_38_ / 2.0F));
				float f_42_ = Math.abs(class436_33_.aFloat4853 - (class436.aFloat4850 - f_38_ / 2.0F));
				float f_43_ = f_32_ - f;
				float f_44_ = Math.min(f_39_, f_40_);
				float f_45_ = Math.min(f_41_, f_42_);
				float f_46_ = 1.0F / f_43_ * f_44_;
				float f_47_ = f_45_ * (1.0F / f_43_);
				f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
				f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
				f_35_ = Math.min(f_46_, f_47_);
			}
		}
		fs[0] = f_35_;
		fs[1] = f_35_;
	}

	static final void method2967(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		if (-809980533 * class683.aClass251_8650.anInt2546 == -1) {
			if (class668.aBool8548)
				throw new RuntimeException("");
			throw new RuntimeException("");
		}
		InterfaceDefinitions class251 = class683.method8094(-1374574797);
		class251.aClass251Array2725[(class683.aClass251_8650.anInt2546 * -809980533)] = null;
		Class668.method8011(class251, 263642117);
	}

	static final void method2968(InterfaceDefinitions class251, Class234 class234, Class668 class668, short i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (!string.equals(class251.text)) {
			class251.text = string;
			Class668.method8011(class251, 263642117);
		}
		if (-1 == -809980533 * class251.anInt2546 && !class234.aBool2379)
			Class79.method1161(-1591767037 * class251.anInt2559, 1574038584);
	}

	static final void method2969(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1769800149) != null)
			string = string.substring(0, string.length() - 1);
		class251.onOpHook = Class33.method796(string, class668, (short) 10589);
		class251.hasComponentHook = true;
	}

	static final void method2970(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub5_10760.method9916(1824836319);
	}

	static final void method2971(InterfaceDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -524483587) != null)
			string = string.substring(0, string.length() - 1);
		class251.onFriendTransmitHook = Class33.method796(string, class668, (short) 4172);
		class251.hasComponentHook = true;
	}

	public static final void method2972(int i) {
		if (!client.aBool10999) {
			client.aFloat11107 += (24.0F - client.aFloat11107) / 2.0F;
			client.aBool11242 = true;
			client.aBool10999 = true;
		}
	}
}
