/* Class696_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub5 extends Class696 {
	Class437 aClass437_10980 = null;
	Class327_Sub3 aClass327_Sub3_10981 = null;

	double[] method17399() {
		return aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
	}

	public void method14250(float f, int i) {
		/* empty */
	}

	double[] method17400(int i) {
		return aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
	}

	public Class442 method14245(byte i) {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public void method14259(RSByteBuffer class527_sub38) {
		aClass437_10980 = new Class437(class527_sub38);
	}

	public Class442 method14246(byte i) {
		return method14245((byte) 69);
	}

	public void method14243(Class302 class302, Class432 class432, int i, int i_0_, float f, int i_1_) {
		double[] ds = aClass296_8753.method5341(1560819391);
		ds[0] -= (double) i;
		ds[2] -= (double) i_0_;
		double[] ds_2_ = method17400(1388696775);
		ds_2_[0] -= (double) i;
		ds_2_[2] -= (double) i_0_;
		ds[1] *= -1.0;
		ds_2_[1] *= -1.0;
		Class442 class442 = Class442.method7137();
		class442.aFloat4918 = (float) (ds_2_[0] - ds[0]);
		class442.aFloat4915 = (float) (ds_2_[1] - ds[1]);
		class442.aFloat4919 = (float) (ds_2_[2] - ds[2]);
		class442.method7173();
		Class438 class438 = new Class438();
		class438.method7091(class442, f);
		Class442 class442_3_ = Class442.method7166(0.0F, 1.0F, 0.0F);
		Class442 class442_4_ = Class442.method7159(class442, class442_3_);
		class442_3_ = Class442.method7159(class442_4_, class442);
		class442_3_.method7157(class438);
		class432.method6945(ds[0], ds[1], ds[2], ds_2_[0], ds_2_[1], ds_2_[2], class442_3_.aFloat4918, class442_3_.aFloat4915, class442_3_.aFloat4919);
		class442_3_.method7141();
	}

	public void method14248(RSByteBuffer class527_sub38, int i) {
		aClass437_10980 = new Class437(class527_sub38);
	}

	public boolean method14244(int i) {
		return (null != aClass437_10980 && aClass327_Sub3_10981 != null && aClass327_Sub3_10981.method5780((short) 15026));
	}

	public boolean method14247() {
		return (null != aClass437_10980 && aClass327_Sub3_10981 != null && aClass327_Sub3_10981.method5780((short) 15334));
	}

	public boolean method14252() {
		return (null != aClass437_10980 && aClass327_Sub3_10981 != null && aClass327_Sub3_10981.method5780((short) 4772));
	}

	public void method14257(Class302 class302, Class432 class432, int i, int i_5_, float f) {
		double[] ds = aClass296_8753.method5341(1184688823);
		ds[0] -= (double) i;
		ds[2] -= (double) i_5_;
		double[] ds_6_ = method17400(587692902);
		ds_6_[0] -= (double) i;
		ds_6_[2] -= (double) i_5_;
		ds[1] *= -1.0;
		ds_6_[1] *= -1.0;
		Class442 class442 = Class442.method7137();
		class442.aFloat4918 = (float) (ds_6_[0] - ds[0]);
		class442.aFloat4915 = (float) (ds_6_[1] - ds[1]);
		class442.aFloat4919 = (float) (ds_6_[2] - ds[2]);
		class442.method7173();
		Class438 class438 = new Class438();
		class438.method7091(class442, f);
		Class442 class442_7_ = Class442.method7166(0.0F, 1.0F, 0.0F);
		Class442 class442_8_ = Class442.method7159(class442, class442_7_);
		class442_7_ = Class442.method7159(class442_8_, class442);
		class442_7_.method7157(class438);
		class432.method6945(ds[0], ds[1], ds[2], ds_6_[0], ds_6_[1], ds_6_[2], class442_7_.aFloat4918, class442_7_.aFloat4915, class442_7_.aFloat4919);
		class442_7_.method7141();
	}

	public Class442 method14253() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public Class696_Sub5(Class296 class296) {
		super(class296);
	}

	public Class442 method14255() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public void method14249(float f) {
		/* empty */
	}

	public Class442 method14251() {
		return method14245((byte) 87);
	}

	public Class442 method14258() {
		return method14245((byte) 61);
	}

	public Class442 method14254() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public void method14260(RSByteBuffer class527_sub38) {
		aClass437_10980 = new Class437(class527_sub38);
	}

	double[] method17401() {
		return aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
	}

	public Class442 method14256() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437_10980.method6991(aClass327_Sub3_10981.method15858(-1955084582));
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	static final void method17402(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_9_, 1591493091);
		Class240 class240 = Class183.aClass240Array2100[i_9_ >> 16];
		Class9.method669(class243, class240, class665, -1144314682);
	}

	static final void method17403(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class574.method9628(class243, class240, class665, 269220229);
	}

	static final void method17404(Class665 class665, int i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_10_, 514976214);
		Class240 class240 = Class183.aClass240Array2100[i_10_ >> 16];
		Class274.method5132(class243, class240, class665, 591842255);
	}
}
