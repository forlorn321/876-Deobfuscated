/* Class350_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub1_Sub1 extends Class350_Sub1 {
	public int anInt11420;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11421;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11422;
	Class265 aClass265_11423;
	Class265 aClass265_11424;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11425;
	public Class427 aClass427_11426 = new Class427();
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11427;
	public Class427 aClass427_11428 = new Class427();
	float[] aFloatArray11429 = new float[4];
	Class341 aClass341_11430;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11431;
	float[] aFloatArray11432 = new float[4];
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_11433;
	public int anInt11434;
	public int anInt11435;
	public int anInt11436;
	float aFloat11437;

	public void method17986(int i, int i_0_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_1_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			aFloatArray11429[0] = f_2_;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = 0.0F;
			aFloatArray11429[3] = 0.0F;
		} else {
			aFloatArray11429[0] = 0.0F;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = f_2_;
			aFloatArray11429[3] = 0.0F;
		}
		aFloatArray11432[0] = 0.0F;
		aFloatArray11432[1] = f_2_;
		aFloatArray11432[2] = 0.0F;
		aFloatArray11432[3] = f * (float) aClass180_Sub2_3754.anInt9574 % 1.0F;
		if (!aClass341_11430.aBool3679) {
			int i_3_ = (int) (16.0F * (f_1_ * (float) aClass180_Sub2_3754.anInt9574));
			aClass180_Sub2_3754.method14971(aClass341_11430.anInterface38Array3687[i_3_ % 16]);
		} else
			aFloat11437 = (float) ((double) aClass180_Sub2_3754.anInt9574 * (double) f_1_ % 1.0);
	}

	public void method17987() {
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4810(aClass265_11423);
		else
			aClass261_10188.method4810(aClass265_11424);
		aClass261_10188.method4875();
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4807(aClass527_Sub18_Sub1_11433, 0, aClass341_11430.anInterface35_3683, -1770247214);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11427, aClass427_11428, -1974065914);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11425, aClass427_11426, -1974065914);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11422, new Class441(aFloatArray11429[0], aFloatArray11429[1], aFloatArray11429[2], aFloatArray11429[3]), -1414762435);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11431, new Class441(aFloatArray11432[0], aFloatArray11432[1], aFloatArray11432[2], aFloatArray11432[3]), -1952541282);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11421, new Class441(aFloat11437, 0.0F, 0.0F, 0.0F), -1488026705);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, anInt11434 * 1185347053, 1762908549 * anInt11435, -1344093175 * anInt11436, anInt11420 * 223859335);
	}

	boolean method15809() throws Exception_Sub5 {
		aClass527_Sub18_Sub1_11427 = aClass261_10188.method4881("WorldMatrix", -1803846915);
		aClass527_Sub18_Sub1_11425 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11422 = aClass261_10188.method4881("UGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11431 = aClass261_10188.method4881("VGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11421 = aClass261_10188.method4881("Time", -1803846915);
		aClass527_Sub18_Sub1_11433 = aClass261_10188.method4881("billowSampler3D", -1803846915);
		if (aClass341_11430.aBool3679) {
			aClass265_11423 = aClass261_10188.method4805("Waterfall3D", -1733553076);
			aClass261_10188.method4810(aClass265_11423);
		} else {
			aClass265_11424 = aClass261_10188.method4805("Waterfall2D", -1733553076);
			aClass261_10188.method4810(aClass265_11424);
		}
		return true;
	}

	public void method17988(int i) {
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4810(aClass265_11423);
		else
			aClass261_10188.method4810(aClass265_11424);
		aClass261_10188.method4875();
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4807(aClass527_Sub18_Sub1_11433, 0, aClass341_11430.anInterface35_3683, -2039604568);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11427, aClass427_11428, -1974065914);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11425, aClass427_11426, -1974065914);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11422, new Class441(aFloatArray11429[0], aFloatArray11429[1], aFloatArray11429[2], aFloatArray11429[3]), -1219910881);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11431, new Class441(aFloatArray11432[0], aFloatArray11432[1], aFloatArray11432[2], aFloatArray11432[3]), 128392524);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11421, new Class441(aFloat11437, 0.0F, 0.0F, 0.0F), -1455589206);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, anInt11434 * 1185347053, 1762908549 * anInt11435, -1344093175 * anInt11436, anInt11420 * 223859335);
	}

	boolean method15820() throws Exception_Sub5 {
		aClass527_Sub18_Sub1_11427 = aClass261_10188.method4881("WorldMatrix", -1803846915);
		aClass527_Sub18_Sub1_11425 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11422 = aClass261_10188.method4881("UGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11431 = aClass261_10188.method4881("VGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11421 = aClass261_10188.method4881("Time", -1803846915);
		aClass527_Sub18_Sub1_11433 = aClass261_10188.method4881("billowSampler3D", -1803846915);
		if (aClass341_11430.aBool3679) {
			aClass265_11423 = aClass261_10188.method4805("Waterfall3D", -1733553076);
			aClass261_10188.method4810(aClass265_11423);
		} else {
			aClass265_11424 = aClass261_10188.method4805("Waterfall2D", -1733553076);
			aClass261_10188.method4810(aClass265_11424);
		}
		return true;
	}

	boolean method15821() throws Exception_Sub5 {
		aClass527_Sub18_Sub1_11427 = aClass261_10188.method4881("WorldMatrix", -1803846915);
		aClass527_Sub18_Sub1_11425 = aClass261_10188.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_11422 = aClass261_10188.method4881("UGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11431 = aClass261_10188.method4881("VGenerationPlane", -1803846915);
		aClass527_Sub18_Sub1_11421 = aClass261_10188.method4881("Time", -1803846915);
		aClass527_Sub18_Sub1_11433 = aClass261_10188.method4881("billowSampler3D", -1803846915);
		if (aClass341_11430.aBool3679) {
			aClass265_11423 = aClass261_10188.method4805("Waterfall3D", -1733553076);
			aClass261_10188.method4810(aClass265_11423);
		} else {
			aClass265_11424 = aClass261_10188.method4805("Waterfall2D", -1733553076);
			aClass261_10188.method4810(aClass265_11424);
		}
		return true;
	}

	public void method17989(int i, int i_4_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_5_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			aFloatArray11429[0] = f_6_;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = 0.0F;
			aFloatArray11429[3] = 0.0F;
		} else {
			aFloatArray11429[0] = 0.0F;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = f_6_;
			aFloatArray11429[3] = 0.0F;
		}
		aFloatArray11432[0] = 0.0F;
		aFloatArray11432[1] = f_6_;
		aFloatArray11432[2] = 0.0F;
		aFloatArray11432[3] = f * (float) aClass180_Sub2_3754.anInt9574 % 1.0F;
		if (!aClass341_11430.aBool3679) {
			int i_7_ = (int) (16.0F * (f_5_ * (float) aClass180_Sub2_3754.anInt9574));
			aClass180_Sub2_3754.method14971(aClass341_11430.anInterface38Array3687[i_7_ % 16]);
		} else
			aFloat11437 = (float) ((double) aClass180_Sub2_3754.anInt9574 * (double) f_5_ % 1.0);
	}

	public void method17990(int i, int i_8_, byte i_9_) {
		float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
		float f_10_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
		float f_11_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			aFloatArray11429[0] = f_11_;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = 0.0F;
			aFloatArray11429[3] = 0.0F;
		} else {
			aFloatArray11429[0] = 0.0F;
			aFloatArray11429[1] = 0.0F;
			aFloatArray11429[2] = f_11_;
			aFloatArray11429[3] = 0.0F;
		}
		aFloatArray11432[0] = 0.0F;
		aFloatArray11432[1] = f_11_;
		aFloatArray11432[2] = 0.0F;
		aFloatArray11432[3] = f * (float) aClass180_Sub2_3754.anInt9574 % 1.0F;
		if (!aClass341_11430.aBool3679) {
			int i_12_ = (int) (16.0F * (f_10_ * (float) aClass180_Sub2_3754.anInt9574));
			aClass180_Sub2_3754.method14971(aClass341_11430.anInterface38Array3687[i_12_ % 16]);
		} else
			aFloat11437 = (float) ((double) aClass180_Sub2_3754.anInt9574 * (double) f_10_ % 1.0);
	}

	public void method17991() {
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4810(aClass265_11423);
		else
			aClass261_10188.method4810(aClass265_11424);
		aClass261_10188.method4875();
		if (aClass341_11430.aBool3679)
			aClass261_10188.method4807(aClass527_Sub18_Sub1_11433, 0, aClass341_11430.anInterface35_3683, -1504141805);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11427, aClass427_11428, -1974065914);
		aClass261_10188.method4824(aClass527_Sub18_Sub1_11425, aClass427_11426, -1974065914);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11422, new Class441(aFloatArray11429[0], aFloatArray11429[1], aFloatArray11429[2], aFloatArray11429[3]), -1183089258);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11431, new Class441(aFloatArray11432[0], aFloatArray11432[1], aFloatArray11432[2], aFloatArray11432[3]), -1735980669);
		aClass261_10188.method4866(aClass527_Sub18_Sub1_11421, new Class441(aFloat11437, 0.0F, 0.0F, 0.0F), -1018345977);
		aClass180_Sub2_3754.method15010(Class364.aClass364_3861, anInt11434 * 1185347053, 1762908549 * anInt11435, -1344093175 * anInt11436, anInt11420 * 223859335);
	}

	public Class350_Sub1_Sub1(Class180_Sub2 class180_sub2, Class341 class341) throws Exception_Sub5 {
		super(class180_sub2);
		aClass341_11430 = class341;
		if (aClass341_11430.method6080() && class180_sub2.method14888())
			method15828("Waterfall");
	}

	static final void method17992(Class665 class665, byte i) {
		Class604_Sub1 class604_sub1 = Class464.method7631(-1761351631);
		if (class604_sub1 != null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.anInt10579 * -642278059;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -909883667 * class604_sub1.anInt7962;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.aString10578;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.method16316(-187361331);
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.method16320(2112727962);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1898710151 * class604_sub1.anInt7967;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 741395911 * class604_sub1.anInt10576;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.aString10577;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		}
	}

	static final void method17993(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_13_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_14_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class698.method14271(i_13_, i_14_, false, 1850821862);
	}
}
