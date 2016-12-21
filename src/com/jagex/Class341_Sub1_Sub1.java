/* Class341_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class341_Sub1_Sub1 extends Class341_Sub1 {
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11407;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11408;
	float[] aFloatArray11409;
	Class285 aClass285_11410;
	Class285 aClass285_11411;
	public Class443 aClass443_11412 = new Class443();
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11413;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11414;
	public Class443 aClass443_11415 = new Class443();
	Class357 aClass357_11416;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11417;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_11418;
	float[] aFloatArray11419;
	float aFloat11420;
	public int anInt11421;
	public int anInt11422;
	public int anInt11423;
	public int anInt11424;

	public void method10555(byte i) {
		if (aClass357_11416.aBool3803)
			aClass286_10199.method3850(aClass285_11410);
		else
			aClass286_10199.method3850(aClass285_11411);
		aClass286_10199.method3843();
		if (aClass357_11416.aBool3803)
			aClass286_10199.method3896(aClass536_Sub8_Sub1_11413, 0, aClass357_11416.anInterface34_3799, -948976061);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11414, aClass443_11415, (byte) 71);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11417, aClass443_11412, (byte) 126);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11407, new Class427(aFloatArray11409[0], aFloatArray11409[1], aFloatArray11409[2], aFloatArray11409[3]), (byte) -12);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11418, new Class427(aFloatArray11419[0], aFloatArray11419[1], aFloatArray11419[2], aFloatArray11419[3]), (byte) -50);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11408, new Class427(aFloat11420, 0.0F, 0.0F, 0.0F), (byte) -90);
		aClass167_Sub3_3661.method8817(Class377.aClass377_3917, 1656579903 * anInt11421, -1591500479 * anInt11422, 419843751 * anInt11423, 728109159 * anInt11424);
	}

	boolean method9276() throws Exception_Sub7 {
		aClass536_Sub8_Sub1_11414 = aClass286_10199.method3866("WorldMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11417 = aClass286_10199.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11407 = aClass286_10199.method3866("UGenerationPlane", (byte) 0);
		aClass536_Sub8_Sub1_11418 = aClass286_10199.method3866("VGenerationPlane", (byte) 0);
		aClass536_Sub8_Sub1_11408 = aClass286_10199.method3866("Time", (byte) 0);
		aClass536_Sub8_Sub1_11413 = aClass286_10199.method3866("billowSampler3D", (byte) 0);
		if (aClass357_11416.aBool3803) {
			aClass285_11410 = aClass286_10199.method3855("Waterfall3D", (byte) 61);
			aClass286_10199.method3850(aClass285_11410);
		} else {
			aClass285_11411 = aClass286_10199.method3855("Waterfall2D", (byte) -96);
			aClass286_10199.method3850(aClass285_11411);
		}
		return true;
	}

	public void method10556(int i, int i_0_, int i_1_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = 0 != (i & 0x80);
		if (bool) {
			aFloatArray11409[0] = f_3_;
			aFloatArray11409[1] = 0.0F;
			aFloatArray11409[2] = 0.0F;
			aFloatArray11409[3] = 0.0F;
		} else {
			aFloatArray11409[0] = 0.0F;
			aFloatArray11409[1] = 0.0F;
			aFloatArray11409[2] = f_3_;
			aFloatArray11409[3] = 0.0F;
		}
		aFloatArray11419[0] = 0.0F;
		aFloatArray11419[1] = f_3_;
		aFloatArray11419[2] = 0.0F;
		aFloatArray11419[3] = (float) aClass167_Sub3_3661.anInt9685 * f % 1.0F;
		if (!aClass357_11416.aBool3803) {
			int i_4_ = (int) ((float) aClass167_Sub3_3661.anInt9685 * f_2_ * 16.0F);
			aClass167_Sub3_3661.method8781(aClass357_11416.anInterface36Array3806[i_4_ % 16]);
		} else
			aFloat11420 = (float) ((double) f_2_ * (double) aClass167_Sub3_3661.anInt9685 % 1.0);
	}

	boolean method9283() throws Exception_Sub7 {
		aClass536_Sub8_Sub1_11414 = aClass286_10199.method3866("WorldMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11417 = aClass286_10199.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_11407 = aClass286_10199.method3866("UGenerationPlane", (byte) 0);
		aClass536_Sub8_Sub1_11418 = aClass286_10199.method3866("VGenerationPlane", (byte) 0);
		aClass536_Sub8_Sub1_11408 = aClass286_10199.method3866("Time", (byte) 0);
		aClass536_Sub8_Sub1_11413 = aClass286_10199.method3866("billowSampler3D", (byte) 0);
		if (aClass357_11416.aBool3803) {
			aClass285_11410 = aClass286_10199.method3855("Waterfall3D", (byte) -5);
			aClass286_10199.method3850(aClass285_11410);
		} else {
			aClass285_11411 = aClass286_10199.method3855("Waterfall2D", (byte) -35);
			aClass286_10199.method3850(aClass285_11411);
		}
		return true;
	}

	public Class341_Sub1_Sub1(Class167_Sub3 class167_sub3, Class357 class357) throws Exception_Sub7 {
		super(class167_sub3);
		aFloatArray11409 = new float[4];
		aFloatArray11419 = new float[4];
		aClass357_11416 = class357;
		if (aClass357_11416.method4690() && class167_sub3.method8900())
			method9290("Waterfall");
	}

	public void method10557() {
		if (aClass357_11416.aBool3803)
			aClass286_10199.method3850(aClass285_11410);
		else
			aClass286_10199.method3850(aClass285_11411);
		aClass286_10199.method3843();
		if (aClass357_11416.aBool3803)
			aClass286_10199.method3896(aClass536_Sub8_Sub1_11413, 0, aClass357_11416.anInterface34_3799, -948976061);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11414, aClass443_11415, (byte) 63);
		aClass286_10199.method3860(aClass536_Sub8_Sub1_11417, aClass443_11412, (byte) 101);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11407, new Class427(aFloatArray11409[0], aFloatArray11409[1], aFloatArray11409[2], aFloatArray11409[3]), (byte) -89);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11418, new Class427(aFloatArray11419[0], aFloatArray11419[1], aFloatArray11419[2], aFloatArray11419[3]), (byte) -51);
		aClass286_10199.method3857(aClass536_Sub8_Sub1_11408, new Class427(aFloat11420, 0.0F, 0.0F, 0.0F), (byte) -112);
		aClass167_Sub3_3661.method8817(Class377.aClass377_3917, 1656579903 * anInt11421, -1591500479 * anInt11422, 419843751 * anInt11423, 728109159 * anInt11424);
	}
}
