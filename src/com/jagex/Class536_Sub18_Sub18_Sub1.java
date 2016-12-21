/* Class536_Sub18_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub18_Sub1 extends Class536_Sub18_Sub18 {
	float aFloat12090;
	Class281 aClass281_12091;
	float aFloat12092;
	float aFloat12093;

	public void method10810(float f) {
		aFloat12093 += aFloat12090 * f;
	}

	Class536_Sub18_Sub18_Sub1(int i, RSByteBuffer class536_sub33) {
		super(i);
		aClass281_12091 = Class520.method6350(class536_sub33.readUnsignedByte(917288526), (byte) -35);
		aFloat12092 = class536_sub33.method9712(-559901009);
		aFloat12090 = class536_sub33.method9712(-1597241673);
	}

	public void method10804(float f, int i) {
		aFloat12093 += aFloat12090 * f;
	}

	public void method10811(RSByteBuffer class536_sub33) {
		aClass281_12091 = Class520.method6350(class536_sub33.readUnsignedByte(1319230549), (byte) 69);
		aFloat12092 = class536_sub33.method9712(1505102187);
		aFloat12090 = class536_sub33.method9712(863144254);
	}

	public void method10809(RSByteBuffer class536_sub33, int i) {
		aClass281_12091 = Class520.method6350(class536_sub33.readUnsignedByte(-68324406), (byte) 25);
		aFloat12092 = class536_sub33.method9712(1493681104);
		aFloat12090 = class536_sub33.method9712(-38638098);
	}

	public void method10813(Class305 class305, Class433 class433, Class443 class443) {
		float f = (float) Math.sin((double) aFloat12093);
		float f_0_ = aFloat12092 * f;
		if (aClass281_12091 == Class281.aClass281_3171) {
			Class305 class305_1_;
			(class305_1_ = class305).anInt3441 = ((int) (f_0_ + (float) (class305_1_.anInt3441 * 606032575)) * 164961599);
			class433.method5200(f_0_, 0.0F, 0.0F);
		} else if (Class281.aClass281_3168 == aClass281_12091) {
			Class305 class305_2_;
			(class305_2_ = class305).anInt3442 = 1436659191 * (int) ((float) (1904157639 * class305_2_.anInt3442) + f_0_);
			class433.method5200(0.0F, f_0_, 0.0F);
		} else if (Class281.aClass281_3169 == aClass281_12091) {
			Class305 class305_3_;
			(class305_3_ = class305).anInt3443 = -1246574647 * (int) (f_0_ + (float) (class305_3_.anInt3443 * 1232077433));
			class433.method5200(0.0F, 0.0F, f_0_);
		} else if (Class281.aClass281_3170 == aClass281_12091)
			class433.method5214(1.0F, 0.0F, 0.0F, f_0_);
		else if (Class281.aClass281_3172 == aClass281_12091)
			class433.method5214(0.0F, 1.0F, 0.0F, f_0_);
		else if (Class281.aClass281_3173 == aClass281_12091)
			class433.method5214(0.0F, 0.0F, 1.0F, f_0_);
	}

	public Class536_Sub18_Sub18_Sub1(int i, Class281 class281, float f, float f_4_) {
		super(i);
		aClass281_12091 = class281;
		aFloat12092 = f;
		aFloat12090 = f_4_;
	}

	public void method10808(Class305 class305, Class433 class433, Class443 class443) {
		float f = (float) Math.sin((double) aFloat12093);
		float f_5_ = aFloat12092 * f;
		if (aClass281_12091 == Class281.aClass281_3171) {
			Class305 class305_6_;
			(class305_6_ = class305).anInt3441 = ((int) (f_5_ + (float) (class305_6_.anInt3441 * 606032575)) * 164961599);
			class433.method5200(f_5_, 0.0F, 0.0F);
		} else if (Class281.aClass281_3168 == aClass281_12091) {
			Class305 class305_7_;
			(class305_7_ = class305).anInt3442 = 1436659191 * (int) ((float) (1904157639 * class305_7_.anInt3442) + f_5_);
			class433.method5200(0.0F, f_5_, 0.0F);
		} else if (Class281.aClass281_3169 == aClass281_12091) {
			Class305 class305_8_;
			(class305_8_ = class305).anInt3443 = -1246574647 * (int) (f_5_ + (float) (class305_8_.anInt3443 * 1232077433));
			class433.method5200(0.0F, 0.0F, f_5_);
		} else if (Class281.aClass281_3170 == aClass281_12091)
			class433.method5214(1.0F, 0.0F, 0.0F, f_5_);
		else if (Class281.aClass281_3172 == aClass281_12091)
			class433.method5214(0.0F, 1.0F, 0.0F, f_5_);
		else if (Class281.aClass281_3173 == aClass281_12091)
			class433.method5214(0.0F, 0.0F, 1.0F, f_5_);
	}

	public void method10805(float f) {
		aFloat12093 += aFloat12090 * f;
	}

	public void method10807(Class305 class305, Class433 class433, Class443 class443) {
		float f = (float) Math.sin((double) aFloat12093);
		float f_9_ = aFloat12092 * f;
		if (aClass281_12091 == Class281.aClass281_3171) {
			Class305 class305_10_;
			(class305_10_ = class305).anInt3441 = ((int) (f_9_ + (float) (class305_10_.anInt3441 * 606032575)) * 164961599);
			class433.method5200(f_9_, 0.0F, 0.0F);
		} else if (Class281.aClass281_3168 == aClass281_12091) {
			Class305 class305_11_;
			(class305_11_ = class305).anInt3442 = 1436659191 * (int) ((float) (1904157639 * class305_11_.anInt3442) + f_9_);
			class433.method5200(0.0F, f_9_, 0.0F);
		} else if (Class281.aClass281_3169 == aClass281_12091) {
			Class305 class305_12_;
			(class305_12_ = class305).anInt3443 = -1246574647 * (int) (f_9_ + (float) (class305_12_.anInt3443 * 1232077433));
			class433.method5200(0.0F, 0.0F, f_9_);
		} else if (Class281.aClass281_3170 == aClass281_12091)
			class433.method5214(1.0F, 0.0F, 0.0F, f_9_);
		else if (Class281.aClass281_3172 == aClass281_12091)
			class433.method5214(0.0F, 1.0F, 0.0F, f_9_);
		else if (Class281.aClass281_3173 == aClass281_12091)
			class433.method5214(0.0F, 0.0F, 1.0F, f_9_);
	}

	public void method10803(Class305 class305, Class433 class433, Class443 class443, short i) {
		float f = (float) Math.sin((double) aFloat12093);
		float f_13_ = aFloat12092 * f;
		if (aClass281_12091 == Class281.aClass281_3171) {
			Class305 class305_14_;
			(class305_14_ = class305).anInt3441 = ((int) (f_13_ + (float) (class305_14_.anInt3441 * 606032575)) * 164961599);
			class433.method5200(f_13_, 0.0F, 0.0F);
		} else if (Class281.aClass281_3168 == aClass281_12091) {
			Class305 class305_15_;
			(class305_15_ = class305).anInt3442 = 1436659191 * (int) ((float) (1904157639 * class305_15_.anInt3442) + f_13_);
			class433.method5200(0.0F, f_13_, 0.0F);
		} else if (Class281.aClass281_3169 == aClass281_12091) {
			Class305 class305_16_;
			(class305_16_ = class305).anInt3443 = -1246574647 * (int) (f_13_ + (float) (class305_16_.anInt3443 * 1232077433));
			class433.method5200(0.0F, 0.0F, f_13_);
		} else if (Class281.aClass281_3170 == aClass281_12091)
			class433.method5214(1.0F, 0.0F, 0.0F, f_13_);
		else if (Class281.aClass281_3172 == aClass281_12091)
			class433.method5214(0.0F, 1.0F, 0.0F, f_13_);
		else if (Class281.aClass281_3173 == aClass281_12091)
			class433.method5214(0.0F, 0.0F, 1.0F, f_13_);
	}

	public void method10812(RSByteBuffer class536_sub33) {
		aClass281_12091 = Class520.method6350(class536_sub33.readUnsignedByte(3038879), (byte) -102);
		aFloat12092 = class536_sub33.method9712(-1635317643);
		aFloat12090 = class536_sub33.method9712(-649533445);
	}

	public void method10806(RSByteBuffer class536_sub33) {
		aClass281_12091 = Class520.method6350(class536_sub33.readUnsignedByte(148058667), (byte) -26);
		aFloat12092 = class536_sub33.method9712(-285680936);
		aFloat12090 = class536_sub33.method9712(1924089849);
	}
}
