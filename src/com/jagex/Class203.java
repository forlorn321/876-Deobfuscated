/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class203 implements Interface56 {
	Class226 this$0;

	Class203(Class226 class226) {
		this$0 = class226;
	}

	public void method361(Object object, float[] fs, Object[] objects, int i) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(858600050);
		float f = class483.method7869((short) 20230);
		float f_0_ = class483.method7915((byte) -7);
		Class442 class442_1_ = this$0.method4197((byte) -92);
		Class442 class442_2_ = Class442.method7155(class442, class442_1_);
		float f_3_ = 0.0F;
		float f_4_ = class442_2_.method7160();
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_5_ = ((Float) objects[0]).floatValue();
			float f_6_ = ((Float) objects[1]).floatValue();
			if (class442_1_.aFloat4918 > class442.aFloat4918 - f_5_ / 2.0F && class442_1_.aFloat4918 < class442.aFloat4918 + f_5_ / 2.0F && class442_1_.aFloat4919 > class442.aFloat4919 - f_6_ / 2.0F && (class442_1_.aFloat4919 < class442.aFloat4919 + f_6_ / 2.0F)) {
				float f_7_ = Math.abs(class442_1_.aFloat4918 - (class442.aFloat4918 + f_5_ / 2.0F));
				float f_8_ = Math.abs(class442_1_.aFloat4918 - (class442.aFloat4918 - f_5_ / 2.0F));
				float f_9_ = Math.abs(class442_1_.aFloat4919 - (class442.aFloat4918 + f_6_ / 2.0F));
				float f_10_ = Math.abs(class442_1_.aFloat4919 - (class442.aFloat4918 - f_6_ / 2.0F));
				float f_11_ = f_0_ - f;
				float f_12_ = Math.min(f_7_, f_8_);
				float f_13_ = Math.min(f_9_, f_10_);
				float f_14_ = 1.0F / f_11_ * f_12_;
				float f_15_ = 1.0F / f_11_ * f_13_;
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_3_ = Math.min(f_14_, f_15_);
			}
		}
		fs[0] = f_3_;
		fs[1] = f_3_;
	}

	public void method362(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1343100753);
		float f = class483.method7869((short) 3564);
		float f_16_ = class483.method7915((byte) 87);
		Class442 class442_17_ = this$0.method4197((byte) -95);
		Class442 class442_18_ = Class442.method7155(class442, class442_17_);
		float f_19_ = 0.0F;
		float f_20_ = class442_18_.method7160();
		if (f_20_ >= f_16_)
			f_19_ = 0.0F;
		else {
			float f_21_ = ((Float) objects[0]).floatValue();
			float f_22_ = ((Float) objects[1]).floatValue();
			if (class442_17_.aFloat4918 > class442.aFloat4918 - f_21_ / 2.0F && class442_17_.aFloat4918 < class442.aFloat4918 + f_21_ / 2.0F && class442_17_.aFloat4919 > class442.aFloat4919 - f_22_ / 2.0F && (class442_17_.aFloat4919 < class442.aFloat4919 + f_22_ / 2.0F)) {
				float f_23_ = Math.abs(class442_17_.aFloat4918 - (class442.aFloat4918 + f_21_ / 2.0F));
				float f_24_ = Math.abs(class442_17_.aFloat4918 - (class442.aFloat4918 - f_21_ / 2.0F));
				float f_25_ = Math.abs(class442_17_.aFloat4919 - (class442.aFloat4918 + f_22_ / 2.0F));
				float f_26_ = Math.abs(class442_17_.aFloat4919 - (class442.aFloat4918 - f_22_ / 2.0F));
				float f_27_ = f_16_ - f;
				float f_28_ = Math.min(f_23_, f_24_);
				float f_29_ = Math.min(f_25_, f_26_);
				float f_30_ = 1.0F / f_27_ * f_28_;
				float f_31_ = 1.0F / f_27_ * f_29_;
				f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
				f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
				f_19_ = Math.min(f_30_, f_31_);
			}
		}
		fs[0] = f_19_;
		fs[1] = f_19_;
	}

	public void method363(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1676963955);
		float f = class483.method7869((short) -29);
		float f_32_ = class483.method7915((byte) 49);
		Class442 class442_33_ = this$0.method4197((byte) -98);
		Class442 class442_34_ = Class442.method7155(class442, class442_33_);
		float f_35_ = 0.0F;
		float f_36_ = class442_34_.method7160();
		if (f_36_ >= f_32_)
			f_35_ = 0.0F;
		else {
			float f_37_ = ((Float) objects[0]).floatValue();
			float f_38_ = ((Float) objects[1]).floatValue();
			if (class442_33_.aFloat4918 > class442.aFloat4918 - f_37_ / 2.0F && class442_33_.aFloat4918 < class442.aFloat4918 + f_37_ / 2.0F && class442_33_.aFloat4919 > class442.aFloat4919 - f_38_ / 2.0F && (class442_33_.aFloat4919 < class442.aFloat4919 + f_38_ / 2.0F)) {
				float f_39_ = Math.abs(class442_33_.aFloat4918 - (class442.aFloat4918 + f_37_ / 2.0F));
				float f_40_ = Math.abs(class442_33_.aFloat4918 - (class442.aFloat4918 - f_37_ / 2.0F));
				float f_41_ = Math.abs(class442_33_.aFloat4919 - (class442.aFloat4918 + f_38_ / 2.0F));
				float f_42_ = Math.abs(class442_33_.aFloat4919 - (class442.aFloat4918 - f_38_ / 2.0F));
				float f_43_ = f_32_ - f;
				float f_44_ = Math.min(f_39_, f_40_);
				float f_45_ = Math.min(f_41_, f_42_);
				float f_46_ = 1.0F / f_43_ * f_44_;
				float f_47_ = 1.0F / f_43_ * f_45_;
				f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
				f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
				f_35_ = Math.min(f_46_, f_47_);
			}
		}
		fs[0] = f_35_;
		fs[1] = f_35_;
	}

	public static void method3777(Class243[] class243s, byte i) {
		for (int i_48_ = 0; i_48_ < class243s.length; i_48_++) {
			Class243 class243 = class243s[i_48_];
			if (class243.anObjectArray2607 != null) {
				Class527_Sub33 class527_sub33 = new Class527_Sub33();
				class527_sub33.aClass243_10648 = class243;
				class527_sub33.anObjectArray10650 = class243.anObjectArray2607;
				Class447.method7261(class527_sub33, 5000000, -1135167100);
			}
		}
	}

	static final void method3778(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = null != Class383_Sub1.aClass144_10279 ? 1 : 0;
	}

	static final void method3779(Class665 class665, int i) {
		int i_49_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529.method8752(i_49_);
		if (class527_sub8_sub12 == null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (class527_sub8_sub12.anInt11762 * -646015201 - -696795403 * class527_sub8_sub12.anInt11761);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (class527_sub8_sub12.anInt11764 * 1393632705 - class527_sub8_sub12.anInt11756 * 124580655);
		}
	}

	static final void method3780(Class665 class665, byte i) {
		Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class665.aClass640_Sub1_Sub2_Sub1_8522);
		boolean bool = false;
		Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
		if (class295.anIntArray3312 != null)
			class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1337495713);
		if (class295 != null)
			bool = class295.aBool3299;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = bool ? 1 : 0;
	}

	static final void method3781(Class665 class665, int i) {
		int i_50_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (-1 == i_50_)
			throw new RuntimeException();
		Class57 class57 = ((Class57) Class664.aClass24_Sub15_8519.method81(i_50_, -1619547890));
		if (Class462.aClass462_5131 != class57.aClass462_718)
			throw new RuntimeException();
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class57.method1337(string, (byte) 79) ? 1 : 0;
	}

	public static Class109 method3782(byte i) {
		if (Class208_Sub23.method15642(client.anInt11048 * -1927019389, 449962680) || client.anInt11048 * -1927019389 == 11)
			return client.aClass109_11066;
		return client.aClass109_11067;
	}

	public static int method3783(int i, int i_51_) {
		int i_52_ = i >>> 1;
		i_52_ |= i_52_ >>> 1;
		i_52_ |= i_52_ >>> 2;
		i_52_ |= i_52_ >>> 4;
		i_52_ |= i_52_ >>> 8;
		i_52_ |= i_52_ >>> 16;
		return i & (i_52_ ^ 0xffffffff);
	}
}
