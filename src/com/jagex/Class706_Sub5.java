/* Class706_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub5 extends Class706 {
	Class333_Sub3 aClass333_Sub3_10963;
	Class439 aClass439_10964 = null;

	public boolean method8295(byte i) {
		return (null != aClass439_10964 && aClass333_Sub3_10963 != null && aClass333_Sub3_10963.method4342(-1493764704));
	}

	public void method8286(float f, int i) {
		/* empty */
	}

	public boolean method8285() {
		return (null != aClass439_10964 && aClass333_Sub3_10963 != null && aClass333_Sub3_10963.method4342(-1468052692));
	}

	public Class436 method8279(int i) {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439_10964.method5308(aClass333_Sub3_10963.method9216(-2104685998));
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	double[] method10319(short i) {
		return aClass439_10964.method5308(aClass333_Sub3_10963.method9216(-1365987665));
	}

	public Class706_Sub5(Class301 class301) {
		super(class301);
		aClass333_Sub3_10963 = null;
	}

	public void method8278(Class305 class305, Class433 class433, int i, int i_0_, float f, int i_1_) {
		double[] ds = aClass301_8821.method4085(-1908572800);
		ds[0] -= (double) i;
		ds[2] -= (double) i_0_;
		double[] ds_2_ = method10319((short) 9722);
		ds_2_[0] -= (double) i;
		ds_2_[2] -= (double) i_0_;
		ds[1] *= -1.0;
		ds_2_[1] *= -1.0;
		Class436 class436 = Class436.method5238();
		class436.aFloat4850 = (float) (ds_2_[0] - ds[0]);
		class436.aFloat4852 = (float) (ds_2_[1] - ds[1]);
		class436.aFloat4853 = (float) (ds_2_[2] - ds[2]);
		class436.method5247();
		Class425 class425 = new Class425();
		class425.method5115(class436, f);
		Class436 class436_3_ = Class436.method5257(0.0F, 1.0F, 0.0F);
		Class436 class436_4_ = Class436.method5256(class436, class436_3_);
		class436_3_ = Class436.method5256(class436_4_, class436);
		class436_3_.method5263(class425);
		class433.method5194(ds[0], ds[1], ds[2], ds_2_[0], ds_2_[1], ds_2_[2], class436_3_.aFloat4850, class436_3_.aFloat4852, class436_3_.aFloat4853);
		class436_3_.method5239();
	}

	public void method8277(RSByteBuffer class536_sub33, int i) {
		aClass439_10964 = new Class439(class536_sub33);
	}

	public Class436 method8291() {
		return method8279(459796660);
	}

	public void method8284(float f) {
		/* empty */
	}

	public void method8283(float f) {
		/* empty */
	}

	public Class436 method8289() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439_10964.method5308(aClass333_Sub3_10963.method9216(-2085600742));
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public void method8287(Class305 class305, Class433 class433, int i, int i_5_, float f) {
		double[] ds = aClass301_8821.method4085(536536181);
		ds[0] -= (double) i;
		ds[2] -= (double) i_5_;
		double[] ds_6_ = method10319((short) -12829);
		ds_6_[0] -= (double) i;
		ds_6_[2] -= (double) i_5_;
		ds[1] *= -1.0;
		ds_6_[1] *= -1.0;
		Class436 class436 = Class436.method5238();
		class436.aFloat4850 = (float) (ds_6_[0] - ds[0]);
		class436.aFloat4852 = (float) (ds_6_[1] - ds[1]);
		class436.aFloat4853 = (float) (ds_6_[2] - ds[2]);
		class436.method5247();
		Class425 class425 = new Class425();
		class425.method5115(class436, f);
		Class436 class436_7_ = Class436.method5257(0.0F, 1.0F, 0.0F);
		Class436 class436_8_ = Class436.method5256(class436, class436_7_);
		class436_7_ = Class436.method5256(class436_8_, class436);
		class436_7_.method5263(class425);
		class433.method5194(ds[0], ds[1], ds[2], ds_6_[0], ds_6_[1], ds_6_[2], class436_7_.aFloat4850, class436_7_.aFloat4852, class436_7_.aFloat4853);
		class436_7_.method5239();
	}

	public boolean method8282() {
		return (null != aClass439_10964 && aClass333_Sub3_10963 != null && aClass333_Sub3_10963.method4342(-1897440308));
	}

	public Class436 method8288() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439_10964.method5308(aClass333_Sub3_10963.method9216(-1818897709));
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public Class436 method8290() {
		return method8279(459796660);
	}

	public Class436 method8293(int i) {
		return method8279(459796660);
	}

	public Class436 method8292() {
		return method8279(459796660);
	}

	public Class436 method8281() {
		return method8279(459796660);
	}

	public void method8294(RSByteBuffer class536_sub33) {
		aClass439_10964 = new Class439(class536_sub33);
	}

	public void method8280(RSByteBuffer class536_sub33) {
		aClass439_10964 = new Class439(class536_sub33);
	}

	double[] method10320() {
		return aClass439_10964.method5308(aClass333_Sub3_10963.method9216(-505515487));
	}
}
