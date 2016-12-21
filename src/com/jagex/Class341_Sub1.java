/* Class341_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class341_Sub1 extends Class341 {
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10190;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10191;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10192;
	Class443[] aClass443Array10193;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10194;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10195;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10196;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10197;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10198;
	protected Class286 aClass286_10199;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10200;
	static final int anInt10201 = 4;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10202;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10203;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10204;
	static final int anInt10205 = 16;
	static final int anInt10206 = 1;
	float[] aFloatArray10207 = new float[3];
	static final int anInt10208 = 2;
	int[] anIntArray10209;
	static final int anInt10210 = 8;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10211;
	static final int anInt10212 = 32;
	static final int anInt10213 = 64;
	static final int anInt10214 = 128;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10215;
	int anInt10216;
	static Class443 aClass443_10217 = new Class443();
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10218;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10219;

	void method9274(int i) {
		for (int i_0_ = 0; i_0_ < anInt10216; i_0_++)
			anIntArray10209[i_0_] |= 128 << i;
	}

	void method9275(int i) {
		aClass443Array10193[0].method5338();
		method9279(i);
	}

	void method4474() {
		/* empty */
	}

	Class341_Sub1(Class167_Sub3 class167_sub3) {
		super(class167_sub3);
		new Class433();
		aClass443Array10193 = new Class443[aClass167_Sub3_3661.anInt9690];
		for (int i = 0; i < aClass167_Sub3_3661.anInt9690; i++)
			aClass443Array10193[i] = new Class443();
	}

	void method4462() {
		if (aClass286_10199 != null)
			aClass286_10199.method3844();
	}

	abstract boolean method9276() throws Exception_Sub7;

	void method9277(int i, Class433 class433) {
		if (aClass536_Sub8_Sub1_10200 != null) {
			Class443 class443 = aClass167_Sub3_3661.method8744();
			float[] fs = { class443.aFloatArray4878[12], class443.aFloatArray4878[13], class443.aFloatArray4878[14] };
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			class443.method5347(fs_1_);
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			aClass167_Sub3_3661.method2100().method5215(0.0F, 0.0F, 0.0F, fs_2_);
			class433.method5208(fs);
			aClass286_10199.method3882(aClass536_Sub8_Sub1_10200, fs[0], fs[1], fs[2], -1652796185);
		}
	}

	void method9278(int i, Class433 class433) {
		if (aClass536_Sub8_Sub1_10218 != null) {
			float[] fs = { aClass167_Sub3_3661.aFloatArray9542[0], aClass167_Sub3_3661.aFloatArray9542[1], aClass167_Sub3_3661.aFloatArray9542[2] };
			class433.method5229(fs);
			aClass286_10199.method3882(aClass536_Sub8_Sub1_10218, fs[0], fs[1], fs[2], -2088935753);
		}
	}

	void method4464() {
		/* empty */
	}

	void method9279(int i) {
		for (int i_3_ = 0; i_3_ < anInt10216; i_3_++)
			anIntArray10209[i_3_] |= 128 << i;
	}

	void method9280(Class433 class433) {
		Class443 class443 = aClass167_Sub3_3661.aClass443_9570;
		class443.method5359(class433);
		int i = aClass286_10199.method3852(2080703799);
		if (aClass536_Sub8_Sub1_10215 != null) {
			aClass286_10199.method3860(aClass536_Sub8_Sub1_10215, class443, (byte) 23);
			anIntArray10209[i] &= ~0x1;
		}
		if (aClass536_Sub8_Sub1_10196 != null) {
			aClass443_10217.method5383(class443, aClass167_Sub3_3661.method8743());
			aClass286_10199.method3860(aClass536_Sub8_Sub1_10196, aClass443_10217, (byte) 126);
			anIntArray10209[i] &= ~0x10;
		}
		if (aClass536_Sub8_Sub1_10195 != null) {
			aClass443_10217.method5383(class443, aClass167_Sub3_3661.method8750());
			aClass286_10199.method3860(aClass536_Sub8_Sub1_10195, aClass443_10217, (byte) 120);
			anIntArray10209[i] &= ~0x20;
		}
		method9277(i, class433);
		method9278(i, class433);
	}

	void method4466() {
		method9280(Class433.aClass433_4836);
	}

	void method9281(int i) {
		aClass443Array10193[0].method5338();
		method9279(i);
	}

	void method4467() {
		aClass286_10199.method3843();
		anIntArray10209[aClass286_10199.method3852(721731692)] = -1;
		method9281(0);
		method9289();
	}

	void method4468() {
		aClass286_10199.method3843();
		anIntArray10209[aClass286_10199.method3852(1789887877)] = -1;
		method9281(0);
		method9289();
	}

	void method4470() {
		if (aClass286_10199 != null)
			aClass286_10199.method3844();
	}

	void method4460() {
		if (aClass286_10199 != null)
			aClass286_10199.method3844();
	}

	void method4473() {
		/* empty */
	}

	void method9282() {
		method9296(aClass167_Sub3_3661.aBool9700);
		method9295(aClass167_Sub3_3661.method8724());
		method9294();
		method4464();
	}

	void method4463() {
		method9280(Class433.aClass433_4836);
	}

	void method4461() {
		method9280(Class433.aClass433_4836);
	}

	abstract boolean method9283() throws Exception_Sub7;

	void method4471() {
		method9280(Class433.aClass433_4836);
	}

	void method9284() {
		method9296(aClass167_Sub3_3661.aBool9700);
		method9295(aClass167_Sub3_3661.method8724());
		method9294();
		method4464();
	}

	void method9285(Class443 class443) {
		if (aClass286_10199 != null && aClass286_10199.method3845() && aClass167_Sub3_3661.method8811() == 0) {
			int i = aClass286_10199.method3852(1830077506);
			if ((anIntArray10209[i] & 0x80) != 0 && aClass536_Sub8_Sub1_10191 != null) {
				aClass286_10199.method3874(aClass536_Sub8_Sub1_10191, class443, -1204622397);
				anIntArray10209[i] &= ~0x80;
			}
		}
	}

	void method9286(Class443 class443) {
		if (aClass286_10199 != null && aClass286_10199.method3845() && aClass167_Sub3_3661.method8811() == 0) {
			int i = aClass286_10199.method3852(1692523106);
			if ((anIntArray10209[i] & 0x80) != 0 && aClass536_Sub8_Sub1_10191 != null) {
				aClass286_10199.method3874(aClass536_Sub8_Sub1_10191, class443, -2084080162);
				anIntArray10209[i] &= ~0x80;
			}
		}
	}

	void method9287() {
		if (aClass286_10199 != null && aClass286_10199.method3845()) {
			int i = aClass286_10199.method3852(1516194650);
			int i_4_ = anIntArray10209[i];
			if ((i_4_ & 0x1) != 0 && aClass536_Sub8_Sub1_10215 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10215, aClass167_Sub3_3661.method8976(), (byte) 117);
			if ((i_4_ & 0x2) != 0) {
				if (aClass536_Sub8_Sub1_10190 != null)
					aClass286_10199.method3860(aClass536_Sub8_Sub1_10190, aClass167_Sub3_3661.method8743(), (byte) 59);
				if (aClass536_Sub8_Sub1_10192 != null) {
					aFloatArray10207[0] = 0.0F;
					aFloatArray10207[1] = 0.0F;
					aFloatArray10207[2] = 0.0F;
					aClass167_Sub3_3661.method2100().method5207(aFloatArray10207[0], aFloatArray10207[1], aFloatArray10207[2], aFloatArray10207);
					aClass286_10199.method3882(aClass536_Sub8_Sub1_10192, aFloatArray10207[0], aFloatArray10207[1], aFloatArray10207[2], -1632889100);
				}
			}
			if ((i_4_ & 0x10) != 0 && aClass536_Sub8_Sub1_10196 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10196, aClass167_Sub3_3661.method8749(), (byte) 108);
			if ((i_4_ & 0x8) != 0 && aClass536_Sub8_Sub1_10219 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10219, aClass167_Sub3_3661.method8744(), (byte) 97);
			if ((i_4_ & 0x4) != 0 && aClass536_Sub8_Sub1_10194 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10194, aClass167_Sub3_3661.method8751(), (byte) 114);
			if ((i_4_ & 0x20) != 0 && aClass536_Sub8_Sub1_10195 != null) {
				aClass443_10217.method5383(aClass167_Sub3_3661.method8749(), aClass167_Sub3_3661.method8751());
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10195, aClass443_10217, (byte) 73);
			}
			if ((i_4_ & 0x40) != 0 && aClass536_Sub8_Sub1_10198 != null) {
				aClass443_10217.method5383(aClass167_Sub3_3661.method8743(), aClass167_Sub3_3661.method8751());
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10198, aClass443_10217, (byte) 33);
			}
			if (aClass167_Sub3_3661.method8811() == 0 && (anIntArray10209[i] & 0x80) != 0 && aClass536_Sub8_Sub1_10191 != null) {
				aClass286_10199.method3874(aClass536_Sub8_Sub1_10191, aClass167_Sub3_3661.method8724(), -1878081887);
				anIntArray10209[i] &= ~0x80;
			}
			anIntArray10209[i] = 0;
		}
	}

	void method9288(int i) {
		aClass443Array10193[0].method5338();
		method9279(i);
	}

	void method9289() {
		method9296(aClass167_Sub3_3661.aBool9700);
		method9295(aClass167_Sub3_3661.method8724());
		method9294();
		method4464();
	}

	void method4475() {
		aClass286_10199.method3843();
		anIntArray10209[aClass286_10199.method3852(1585369513)] = -1;
		method9281(0);
		method9289();
	}

	boolean method9290(String string) throws Exception_Sub7 {
		aClass286_10199 = aClass167_Sub3_3661.method8714(string);
		if (aClass286_10199 == null)
			throw new Exception_Sub7("");
		aClass536_Sub8_Sub1_10191 = aClass286_10199.method3868("textureMatrix", (byte) -19);
		aClass536_Sub8_Sub1_10215 = aClass286_10199.method3868("modelMatrix", (byte) -14);
		aClass536_Sub8_Sub1_10190 = aClass286_10199.method3868("viewMatrix", (byte) 78);
		aClass536_Sub8_Sub1_10194 = aClass286_10199.method3868("projectionMatrix", (byte) 107);
		aClass536_Sub8_Sub1_10196 = aClass286_10199.method3868("modelViewMatrix", (byte) 72);
		aClass536_Sub8_Sub1_10195 = aClass286_10199.method3868("modelViewProjectionMatrix", (byte) 34);
		aClass536_Sub8_Sub1_10198 = aClass286_10199.method3868("viewProjectionMatrix", (byte) -95);
		aClass536_Sub8_Sub1_10202 = aClass286_10199.method3868("ambientColour", (byte) 42);
		aClass536_Sub8_Sub1_10197 = aClass286_10199.method3868("sunDirection", (byte) -35);
		aClass536_Sub8_Sub1_10203 = aClass286_10199.method3868("sunColour", (byte) 0);
		aClass536_Sub8_Sub1_10204 = aClass286_10199.method3868("antiSunColour", (byte) -53);
		aClass536_Sub8_Sub1_10211 = aClass286_10199.method3868("sunExponent", (byte) 16);
		aClass536_Sub8_Sub1_10192 = aClass286_10199.method3868("eyePosition", (byte) -76);
		aClass536_Sub8_Sub1_10200 = aClass286_10199.method3868("eyePositionOS", (byte) 12);
		aClass536_Sub8_Sub1_10218 = aClass286_10199.method3868("sunDirectionOS", (byte) -49);
		if (!method9276()) {
			aClass286_10199 = null;
			aClass536_Sub8_Sub1_10191 = null;
			aClass536_Sub8_Sub1_10215 = null;
			aClass536_Sub8_Sub1_10190 = null;
			aClass536_Sub8_Sub1_10194 = null;
			aClass536_Sub8_Sub1_10196 = null;
			aClass536_Sub8_Sub1_10195 = null;
			aClass536_Sub8_Sub1_10198 = null;
			aClass536_Sub8_Sub1_10202 = null;
			aClass536_Sub8_Sub1_10197 = null;
			aClass536_Sub8_Sub1_10203 = null;
			aClass536_Sub8_Sub1_10204 = null;
			aClass536_Sub8_Sub1_10211 = null;
			aClass536_Sub8_Sub1_10192 = null;
			aClass536_Sub8_Sub1_10200 = null;
			aClass536_Sub8_Sub1_10218 = null;
			return false;
		}
		if (aClass286_10199.method3851((short) -15910) == null) {
			Class285 class285 = aClass286_10199.method3849((short) -2239);
			if (class285 == null)
				throw new Exception_Sub7(new StringBuilder().append(aClass286_10199.method3846((byte) -46)).append("").toString());
			aClass286_10199.method3850(class285);
		}
		anInt10216 = aClass286_10199.method3848(1556118046);
		anIntArray10209 = new int[anInt10216];
		return true;
	}

	void method9291(boolean bool) {
		if (aClass286_10199 != null && aClass286_10199.method3845()) {
			if (aClass536_Sub8_Sub1_10202 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10202, (aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9626), (aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9626), (aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9626), -1513604546);
			if (aClass536_Sub8_Sub1_10197 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10197, aClass167_Sub3_3661.aFloatArray9542[0], aClass167_Sub3_3661.aFloatArray9542[1], aClass167_Sub3_3661.aFloatArray9542[2], -1361238565);
			if (aClass536_Sub8_Sub1_10203 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10203, (aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9573), (aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9573), (aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9573), -1463074280);
			if (aClass536_Sub8_Sub1_10204 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10204, (-aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9579), (-aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9579), (-aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9579), -1901910686);
			if (aClass536_Sub8_Sub1_10211 != null)
				aClass286_10199.method3902(aClass536_Sub8_Sub1_10211, 64.0F + Math.abs(aClass167_Sub3_3661.aFloatArray9542[1]) * 928.0F, 137273292);
		}
	}

	void method9292(int i) {
		for (int i_5_ = 0; i_5_ < anInt10216; i_5_++)
			anIntArray10209[i_5_] |= 128 << i;
	}

	void method9293(int i) {
		for (int i_6_ = 0; i_6_ < anInt10216; i_6_++)
			anIntArray10209[i_6_] |= 128 << i;
	}

	void method9294() {
		if (aClass286_10199 != null && aClass286_10199.method3845()) {
			int i = aClass286_10199.method3852(1810709127);
			int i_7_ = anIntArray10209[i];
			if ((i_7_ & 0x1) != 0 && aClass536_Sub8_Sub1_10215 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10215, aClass167_Sub3_3661.method8976(), (byte) 66);
			if ((i_7_ & 0x2) != 0) {
				if (aClass536_Sub8_Sub1_10190 != null)
					aClass286_10199.method3860(aClass536_Sub8_Sub1_10190, aClass167_Sub3_3661.method8743(), (byte) 103);
				if (aClass536_Sub8_Sub1_10192 != null) {
					aFloatArray10207[0] = 0.0F;
					aFloatArray10207[1] = 0.0F;
					aFloatArray10207[2] = 0.0F;
					aClass167_Sub3_3661.method2100().method5207(aFloatArray10207[0], aFloatArray10207[1], aFloatArray10207[2], aFloatArray10207);
					aClass286_10199.method3882(aClass536_Sub8_Sub1_10192, aFloatArray10207[0], aFloatArray10207[1], aFloatArray10207[2], -1677211791);
				}
			}
			if ((i_7_ & 0x10) != 0 && aClass536_Sub8_Sub1_10196 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10196, aClass167_Sub3_3661.method8749(), (byte) 49);
			if ((i_7_ & 0x8) != 0 && aClass536_Sub8_Sub1_10219 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10219, aClass167_Sub3_3661.method8744(), (byte) 115);
			if ((i_7_ & 0x4) != 0 && aClass536_Sub8_Sub1_10194 != null)
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10194, aClass167_Sub3_3661.method8751(), (byte) 67);
			if ((i_7_ & 0x20) != 0 && aClass536_Sub8_Sub1_10195 != null) {
				aClass443_10217.method5383(aClass167_Sub3_3661.method8749(), aClass167_Sub3_3661.method8751());
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10195, aClass443_10217, (byte) 82);
			}
			if ((i_7_ & 0x40) != 0 && aClass536_Sub8_Sub1_10198 != null) {
				aClass443_10217.method5383(aClass167_Sub3_3661.method8743(), aClass167_Sub3_3661.method8751());
				aClass286_10199.method3860(aClass536_Sub8_Sub1_10198, aClass443_10217, (byte) 40);
			}
			if (aClass167_Sub3_3661.method8811() == 0 && (anIntArray10209[i] & 0x80) != 0 && aClass536_Sub8_Sub1_10191 != null) {
				aClass286_10199.method3874(aClass536_Sub8_Sub1_10191, aClass167_Sub3_3661.method8724(), -2043720305);
				anIntArray10209[i] &= ~0x80;
			}
			anIntArray10209[i] = 0;
		}
	}

	void method9295(Class443 class443) {
		if (aClass286_10199 != null && aClass286_10199.method3845() && aClass167_Sub3_3661.method8811() == 0) {
			int i = aClass286_10199.method3852(1445851764);
			if ((anIntArray10209[i] & 0x80) != 0 && aClass536_Sub8_Sub1_10191 != null) {
				aClass286_10199.method3874(aClass536_Sub8_Sub1_10191, class443, -300124778);
				anIntArray10209[i] &= ~0x80;
			}
		}
	}

	void method9296(boolean bool) {
		if (aClass286_10199 != null && aClass286_10199.method3845()) {
			if (aClass536_Sub8_Sub1_10202 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10202, (aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9626), (aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9626), (aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9626), -2080543166);
			if (aClass536_Sub8_Sub1_10197 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10197, aClass167_Sub3_3661.aFloatArray9542[0], aClass167_Sub3_3661.aFloatArray9542[1], aClass167_Sub3_3661.aFloatArray9542[2], -1793212713);
			if (aClass536_Sub8_Sub1_10203 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10203, (aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9573), (aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9573), (aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9573), -1966827094);
			if (aClass536_Sub8_Sub1_10204 != null)
				aClass286_10199.method3882(aClass536_Sub8_Sub1_10204, (-aClass167_Sub3_3661.aFloat9678 * aClass167_Sub3_3661.aFloat9579), (-aClass167_Sub3_3661.aFloat9649 * aClass167_Sub3_3661.aFloat9579), (-aClass167_Sub3_3661.aFloat9701 * aClass167_Sub3_3661.aFloat9579), -1782317439);
			if (aClass536_Sub8_Sub1_10211 != null)
				aClass286_10199.method3902(aClass536_Sub8_Sub1_10211, 64.0F + Math.abs(aClass167_Sub3_3661.aFloatArray9542[1]) * 928.0F, -1545598622);
		}
	}
}
