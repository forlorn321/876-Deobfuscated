/* Class350_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class350_Sub1 extends Class350 {
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10177;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10178;
	static final int anInt10179 = 64;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10180;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10181;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10182;
	static final int anInt10183 = 4;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10184;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10185;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10186;
	static final int anInt10187 = 16;
	protected Class261 aClass261_10188;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10189;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10190;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10191;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10192;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10193;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10194;
	static final int anInt10195 = 2;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10196;
	static final int anInt10197 = 8;
	static final int anInt10198 = 1;
	static final int anInt10199 = 32;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10200;
	static final int anInt10201 = 128;
	int anInt10202;
	int[] anIntArray10203;
	static Class427 aClass427_10204 = new Class427();
	Class427[] aClass427Array10205;
	float[] aFloatArray10206 = new float[3];

	void method15807(Class427 class427) {
		if (aClass261_10188 != null && aClass261_10188.method4802() && aClass180_Sub2_3754.method15171() == 0) {
			int i = aClass261_10188.method4925((byte) -59);
			if ((anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, class427, 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
		}
	}

	void method15808(int i, Class432 class432) {
		if (aClass527_Sub18_Sub1_10194 != null) {
			Class427 class427 = aClass180_Sub2_3754.method14932();
			float[] fs = { class427.aFloatArray4807[12], class427.aFloatArray4807[13], class427.aFloatArray4807[14] };
			float[] fs_0_ = { 0.0F, 0.0F, 0.0F };
			class427.method6746(fs_0_);
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			aClass180_Sub2_3754.method3181().method6883(0.0F, 0.0F, 0.0F, fs_1_);
			class432.method6888(fs);
			aClass261_10188.method4869(aClass527_Sub18_Sub1_10194, fs[0], fs[1], fs[2], -904713561);
		}
	}

	abstract boolean method15809() throws Exception_Sub5;

	void method6166() {
		aClass261_10188.method4875();
		anIntArray10203[aClass261_10188.method4925((byte) -120)] = -1;
		method15815(0);
		method15830();
	}

	Class350_Sub1(Class180_Sub2 class180_sub2) {
		super(class180_sub2);
		new Class432();
		aClass427Array10205 = new Class427[aClass180_Sub2_3754.anInt9521];
		for (int i = 0; i < aClass180_Sub2_3754.anInt9521; i++)
			aClass427Array10205[i] = new Class427();
	}

	void method6165() {
		/* empty */
	}

	void method6171() {
		aClass261_10188.method4875();
		anIntArray10203[aClass261_10188.method4925((byte) -32)] = -1;
		method15815(0);
		method15830();
	}

	void method6172() {
		aClass261_10188.method4875();
		anIntArray10203[aClass261_10188.method4925((byte) -101)] = -1;
		method15815(0);
		method15830();
	}

	void method15810(int i, Class432 class432) {
		if (aClass527_Sub18_Sub1_10194 != null) {
			Class427 class427 = aClass180_Sub2_3754.method14932();
			float[] fs = { class427.aFloatArray4807[12], class427.aFloatArray4807[13], class427.aFloatArray4807[14] };
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			class427.method6746(fs_2_);
			float[] fs_3_ = { 0.0F, 0.0F, 0.0F };
			aClass180_Sub2_3754.method3181().method6883(0.0F, 0.0F, 0.0F, fs_3_);
			class432.method6888(fs);
			aClass261_10188.method4869(aClass527_Sub18_Sub1_10194, fs[0], fs[1], fs[2], -1432604883);
		}
	}

	void method15811(int i) {
		for (int i_4_ = 0; i_4_ < anInt10202; i_4_++)
			anIntArray10203[i_4_] |= 128 << i;
	}

	void method15812(boolean bool) {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			if (aClass527_Sub18_Sub1_10189 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10189, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9551), -948843890);
			if (aClass527_Sub18_Sub1_10192 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10192, aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2], -735921065);
			if (aClass527_Sub18_Sub1_10196 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10196, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9516), -1443823545);
			if (aClass527_Sub18_Sub1_10191 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10191, (-aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9548), -1297587034);
			if (aClass527_Sub18_Sub1_10193 != null)
				aClass261_10188.method4814(aClass527_Sub18_Sub1_10193, 64.0F + Math.abs(aClass180_Sub2_3754.aFloatArray9507[1]) * 928.0F, -1643018242);
		}
	}

	void method15813(int i) {
		for (int i_5_ = 0; i_5_ < anInt10202; i_5_++)
			anIntArray10203[i_5_] |= 128 << i;
	}

	void method6170() {
		/* empty */
	}

	void method15814(Class432 class432) {
		Class427 class427 = aClass180_Sub2_3754.aClass427_9435;
		class427.method6784(class432);
		int i = aClass261_10188.method4925((byte) -44);
		if (aClass527_Sub18_Sub1_10190 != null) {
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10190, class427, -1974065914);
			anIntArray10203[i] &= ~0x1;
		}
		if (aClass527_Sub18_Sub1_10186 != null) {
			aClass427_10204.method6739(class427, aClass180_Sub2_3754.method14931());
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10186, aClass427_10204, -1974065914);
			anIntArray10203[i] &= ~0x10;
		}
		if (aClass527_Sub18_Sub1_10184 != null) {
			aClass427_10204.method6739(class427, aClass180_Sub2_3754.method15003());
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10184, aClass427_10204, -1974065914);
			anIntArray10203[i] &= ~0x20;
		}
		method15810(i, class432);
		method15834(i, class432);
	}

	void method6176() {
		method15814(Class432.aClass432_4853);
	}

	void method15815(int i) {
		aClass427Array10205[0].method6742();
		method15813(i);
	}

	void method15816(boolean bool) {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			if (aClass527_Sub18_Sub1_10189 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10189, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9551), -1487657336);
			if (aClass527_Sub18_Sub1_10192 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10192, aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2], -1309912244);
			if (aClass527_Sub18_Sub1_10196 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10196, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9516), -2056550590);
			if (aClass527_Sub18_Sub1_10191 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10191, (-aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9548), -1754126886);
			if (aClass527_Sub18_Sub1_10193 != null)
				aClass261_10188.method4814(aClass527_Sub18_Sub1_10193, 64.0F + Math.abs(aClass180_Sub2_3754.aFloatArray9507[1]) * 928.0F, -1428360140);
		}
	}

	void method15817(boolean bool) {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			if (aClass527_Sub18_Sub1_10189 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10189, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9551), -2003201750);
			if (aClass527_Sub18_Sub1_10192 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10192, aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2], -1877664577);
			if (aClass527_Sub18_Sub1_10196 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10196, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9516), -1821538444);
			if (aClass527_Sub18_Sub1_10191 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10191, (-aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9548), -1615345071);
			if (aClass527_Sub18_Sub1_10193 != null)
				aClass261_10188.method4814(aClass527_Sub18_Sub1_10193, 64.0F + Math.abs(aClass180_Sub2_3754.aFloatArray9507[1]) * 928.0F, -1209129795);
		}
	}

	void method6168() {
		/* empty */
	}

	void method15818(Class432 class432) {
		Class427 class427 = aClass180_Sub2_3754.aClass427_9435;
		class427.method6784(class432);
		int i = aClass261_10188.method4925((byte) -34);
		if (aClass527_Sub18_Sub1_10190 != null) {
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10190, class427, -1974065914);
			anIntArray10203[i] &= ~0x1;
		}
		if (aClass527_Sub18_Sub1_10186 != null) {
			aClass427_10204.method6739(class427, aClass180_Sub2_3754.method14931());
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10186, aClass427_10204, -1974065914);
			anIntArray10203[i] &= ~0x10;
		}
		if (aClass527_Sub18_Sub1_10184 != null) {
			aClass427_10204.method6739(class427, aClass180_Sub2_3754.method15003());
			aClass261_10188.method4824(aClass527_Sub18_Sub1_10184, aClass427_10204, -1974065914);
			anIntArray10203[i] &= ~0x20;
		}
		method15810(i, class432);
		method15834(i, class432);
	}

	void method6173() {
		method15814(Class432.aClass432_4853);
	}

	void method6178() {
		method15814(Class432.aClass432_4853);
	}

	boolean method15819(String string) throws Exception_Sub5 {
		aClass261_10188 = aClass180_Sub2_3754.method14894(string);
		if (aClass261_10188 == null)
			throw new Exception_Sub5("");
		aClass527_Sub18_Sub1_10178 = aClass261_10188.method4835("textureMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10190 = aClass261_10188.method4835("modelMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10180 = aClass261_10188.method4835("viewMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10181 = aClass261_10188.method4835("projectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10186 = aClass261_10188.method4835("modelViewMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10184 = aClass261_10188.method4835("modelViewProjectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10185 = aClass261_10188.method4835("viewProjectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10189 = aClass261_10188.method4835("ambientColour", (byte) 0);
		aClass527_Sub18_Sub1_10192 = aClass261_10188.method4835("sunDirection", (byte) 0);
		aClass527_Sub18_Sub1_10196 = aClass261_10188.method4835("sunColour", (byte) 0);
		aClass527_Sub18_Sub1_10191 = aClass261_10188.method4835("antiSunColour", (byte) 0);
		aClass527_Sub18_Sub1_10193 = aClass261_10188.method4835("sunExponent", (byte) 0);
		aClass527_Sub18_Sub1_10177 = aClass261_10188.method4835("eyePosition", (byte) 0);
		aClass527_Sub18_Sub1_10194 = aClass261_10188.method4835("eyePositionOS", (byte) 0);
		aClass527_Sub18_Sub1_10200 = aClass261_10188.method4835("sunDirectionOS", (byte) 0);
		if (!method15809()) {
			aClass261_10188 = null;
			aClass527_Sub18_Sub1_10178 = null;
			aClass527_Sub18_Sub1_10190 = null;
			aClass527_Sub18_Sub1_10180 = null;
			aClass527_Sub18_Sub1_10181 = null;
			aClass527_Sub18_Sub1_10186 = null;
			aClass527_Sub18_Sub1_10184 = null;
			aClass527_Sub18_Sub1_10185 = null;
			aClass527_Sub18_Sub1_10189 = null;
			aClass527_Sub18_Sub1_10192 = null;
			aClass527_Sub18_Sub1_10196 = null;
			aClass527_Sub18_Sub1_10191 = null;
			aClass527_Sub18_Sub1_10193 = null;
			aClass527_Sub18_Sub1_10177 = null;
			aClass527_Sub18_Sub1_10194 = null;
			aClass527_Sub18_Sub1_10200 = null;
			return false;
		}
		if (aClass261_10188.method4843(-1715539255) == null) {
			Class265 class265 = aClass261_10188.method4809(1672292735);
			if (class265 == null)
				throw new Exception_Sub5(new StringBuilder().append(aClass261_10188.method4803(-2089289816)).append("").toString());
			aClass261_10188.method4810(class265);
		}
		anInt10202 = aClass261_10188.method4806(1382986074);
		anIntArray10203 = new int[anInt10202];
		return true;
	}

	abstract boolean method15820() throws Exception_Sub5;

	abstract boolean method15821() throws Exception_Sub5;

	void method15822() {
		method15812(aClass180_Sub2_3754.aBool9515);
		method15807(aClass180_Sub2_3754.method14980());
		method15836();
		method6170();
	}

	void method15823() {
		method15812(aClass180_Sub2_3754.aBool9515);
		method15807(aClass180_Sub2_3754.method14980());
		method15836();
		method6170();
	}

	void method15824() {
		method15812(aClass180_Sub2_3754.aBool9515);
		method15807(aClass180_Sub2_3754.method14980());
		method15836();
		method6170();
	}

	void method6179() {
		if (aClass261_10188 != null)
			aClass261_10188.method4854();
	}

	void method6180() {
		if (aClass261_10188 != null)
			aClass261_10188.method4854();
	}

	void method15825(Class427 class427) {
		if (aClass261_10188 != null && aClass261_10188.method4802() && aClass180_Sub2_3754.method15171() == 0) {
			int i = aClass261_10188.method4925((byte) -59);
			if ((anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, class427, 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
		}
	}

	void method15826(Class427 class427) {
		if (aClass261_10188 != null && aClass261_10188.method4802() && aClass180_Sub2_3754.method15171() == 0) {
			int i = aClass261_10188.method4925((byte) -33);
			if ((anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, class427, 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
		}
	}

	void method15827(Class427 class427) {
		if (aClass261_10188 != null && aClass261_10188.method4802() && aClass180_Sub2_3754.method15171() == 0) {
			int i = aClass261_10188.method4925((byte) -33);
			if ((anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, class427, 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
		}
	}

	boolean method15828(String string) throws Exception_Sub5 {
		aClass261_10188 = aClass180_Sub2_3754.method14894(string);
		if (aClass261_10188 == null)
			throw new Exception_Sub5("");
		aClass527_Sub18_Sub1_10178 = aClass261_10188.method4835("textureMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10190 = aClass261_10188.method4835("modelMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10180 = aClass261_10188.method4835("viewMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10181 = aClass261_10188.method4835("projectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10186 = aClass261_10188.method4835("modelViewMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10184 = aClass261_10188.method4835("modelViewProjectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10185 = aClass261_10188.method4835("viewProjectionMatrix", (byte) 0);
		aClass527_Sub18_Sub1_10189 = aClass261_10188.method4835("ambientColour", (byte) 0);
		aClass527_Sub18_Sub1_10192 = aClass261_10188.method4835("sunDirection", (byte) 0);
		aClass527_Sub18_Sub1_10196 = aClass261_10188.method4835("sunColour", (byte) 0);
		aClass527_Sub18_Sub1_10191 = aClass261_10188.method4835("antiSunColour", (byte) 0);
		aClass527_Sub18_Sub1_10193 = aClass261_10188.method4835("sunExponent", (byte) 0);
		aClass527_Sub18_Sub1_10177 = aClass261_10188.method4835("eyePosition", (byte) 0);
		aClass527_Sub18_Sub1_10194 = aClass261_10188.method4835("eyePositionOS", (byte) 0);
		aClass527_Sub18_Sub1_10200 = aClass261_10188.method4835("sunDirectionOS", (byte) 0);
		if (!method15809()) {
			aClass261_10188 = null;
			aClass527_Sub18_Sub1_10178 = null;
			aClass527_Sub18_Sub1_10190 = null;
			aClass527_Sub18_Sub1_10180 = null;
			aClass527_Sub18_Sub1_10181 = null;
			aClass527_Sub18_Sub1_10186 = null;
			aClass527_Sub18_Sub1_10184 = null;
			aClass527_Sub18_Sub1_10185 = null;
			aClass527_Sub18_Sub1_10189 = null;
			aClass527_Sub18_Sub1_10192 = null;
			aClass527_Sub18_Sub1_10196 = null;
			aClass527_Sub18_Sub1_10191 = null;
			aClass527_Sub18_Sub1_10193 = null;
			aClass527_Sub18_Sub1_10177 = null;
			aClass527_Sub18_Sub1_10194 = null;
			aClass527_Sub18_Sub1_10200 = null;
			return false;
		}
		if (aClass261_10188.method4843(-1715539255) == null) {
			Class265 class265 = aClass261_10188.method4809(1672292735);
			if (class265 == null)
				throw new Exception_Sub5(new StringBuilder().append(aClass261_10188.method4803(-2033428434)).append("").toString());
			aClass261_10188.method4810(class265);
		}
		anInt10202 = aClass261_10188.method4806(1927397666);
		anIntArray10203 = new int[anInt10202];
		return true;
	}

	void method15829() {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			int i = aClass261_10188.method4925((byte) -112);
			int i_6_ = anIntArray10203[i];
			if ((i_6_ & 0x1) != 0 && aClass527_Sub18_Sub1_10190 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10190, aClass180_Sub2_3754.method14935(), -1974065914);
			if ((i_6_ & 0x2) != 0) {
				if (aClass527_Sub18_Sub1_10180 != null)
					aClass261_10188.method4824(aClass527_Sub18_Sub1_10180, aClass180_Sub2_3754.method14931(), -1974065914);
				if (aClass527_Sub18_Sub1_10177 != null) {
					aFloatArray10206[0] = 0.0F;
					aFloatArray10206[1] = 0.0F;
					aFloatArray10206[2] = 0.0F;
					aClass180_Sub2_3754.method3181().method6900(aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], aFloatArray10206);
					aClass261_10188.method4869(aClass527_Sub18_Sub1_10177, aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], -871132078);
				}
			}
			if ((i_6_ & 0x10) != 0 && aClass527_Sub18_Sub1_10186 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10186, aClass180_Sub2_3754.method14937(), -1974065914);
			if ((i_6_ & 0x8) != 0 && aClass527_Sub18_Sub1_10182 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10182, aClass180_Sub2_3754.method14932(), -1974065914);
			if ((i_6_ & 0x4) != 0 && aClass527_Sub18_Sub1_10181 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10181, aClass180_Sub2_3754.method14939(), -1974065914);
			if ((i_6_ & 0x20) != 0 && aClass527_Sub18_Sub1_10184 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14937(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10184, aClass427_10204, -1974065914);
			}
			if ((i_6_ & 0x40) != 0 && aClass527_Sub18_Sub1_10185 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14931(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10185, aClass427_10204, -1974065914);
			}
			if (aClass180_Sub2_3754.method15171() == 0 && (anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, aClass180_Sub2_3754.method14980(), 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
			anIntArray10203[i] = 0;
		}
	}

	void method15830() {
		method15812(aClass180_Sub2_3754.aBool9515);
		method15807(aClass180_Sub2_3754.method14980());
		method15836();
		method6170();
	}

	void method15831(boolean bool) {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			if (aClass527_Sub18_Sub1_10189 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10189, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9551), -755884729);
			if (aClass527_Sub18_Sub1_10192 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10192, aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2], -1638300958);
			if (aClass527_Sub18_Sub1_10196 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10196, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9516), -1955131240);
			if (aClass527_Sub18_Sub1_10191 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10191, (-aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9548), -939470790);
			if (aClass527_Sub18_Sub1_10193 != null)
				aClass261_10188.method4814(aClass527_Sub18_Sub1_10193, 64.0F + Math.abs(aClass180_Sub2_3754.aFloatArray9507[1]) * 928.0F, -1306915720);
		}
	}

	void method15832(boolean bool) {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			if (aClass527_Sub18_Sub1_10189 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10189, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9551), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9551), -1395129943);
			if (aClass527_Sub18_Sub1_10192 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10192, aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2], -1678467927);
			if (aClass527_Sub18_Sub1_10196 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10196, (aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9516), (aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9516), -816217242);
			if (aClass527_Sub18_Sub1_10191 != null)
				aClass261_10188.method4869(aClass527_Sub18_Sub1_10191, (-aClass180_Sub2_3754.aFloat9583 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9513 * aClass180_Sub2_3754.aFloat9548), (-aClass180_Sub2_3754.aFloat9448 * aClass180_Sub2_3754.aFloat9548), -782069569);
			if (aClass527_Sub18_Sub1_10193 != null)
				aClass261_10188.method4814(aClass527_Sub18_Sub1_10193, 64.0F + Math.abs(aClass180_Sub2_3754.aFloatArray9507[1]) * 928.0F, -1660363225);
		}
	}

	void method15833(int i) {
		aClass427Array10205[0].method6742();
		method15813(i);
	}

	void method15834(int i, Class432 class432) {
		if (aClass527_Sub18_Sub1_10200 != null) {
			float[] fs = { aClass180_Sub2_3754.aFloatArray9507[0], aClass180_Sub2_3754.aFloatArray9507[1], aClass180_Sub2_3754.aFloatArray9507[2] };
			class432.method6949(fs);
			aClass261_10188.method4869(aClass527_Sub18_Sub1_10200, fs[0], fs[1], fs[2], -2009394625);
		}
	}

	void method15835() {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			int i = aClass261_10188.method4925((byte) -68);
			int i_7_ = anIntArray10203[i];
			if ((i_7_ & 0x1) != 0 && aClass527_Sub18_Sub1_10190 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10190, aClass180_Sub2_3754.method14935(), -1974065914);
			if ((i_7_ & 0x2) != 0) {
				if (aClass527_Sub18_Sub1_10180 != null)
					aClass261_10188.method4824(aClass527_Sub18_Sub1_10180, aClass180_Sub2_3754.method14931(), -1974065914);
				if (aClass527_Sub18_Sub1_10177 != null) {
					aFloatArray10206[0] = 0.0F;
					aFloatArray10206[1] = 0.0F;
					aFloatArray10206[2] = 0.0F;
					aClass180_Sub2_3754.method3181().method6900(aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], aFloatArray10206);
					aClass261_10188.method4869(aClass527_Sub18_Sub1_10177, aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], -1050884520);
				}
			}
			if ((i_7_ & 0x10) != 0 && aClass527_Sub18_Sub1_10186 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10186, aClass180_Sub2_3754.method14937(), -1974065914);
			if ((i_7_ & 0x8) != 0 && aClass527_Sub18_Sub1_10182 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10182, aClass180_Sub2_3754.method14932(), -1974065914);
			if ((i_7_ & 0x4) != 0 && aClass527_Sub18_Sub1_10181 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10181, aClass180_Sub2_3754.method14939(), -1974065914);
			if ((i_7_ & 0x20) != 0 && aClass527_Sub18_Sub1_10184 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14937(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10184, aClass427_10204, -1974065914);
			}
			if ((i_7_ & 0x40) != 0 && aClass527_Sub18_Sub1_10185 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14931(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10185, aClass427_10204, -1974065914);
			}
			if (aClass180_Sub2_3754.method15171() == 0 && (anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, aClass180_Sub2_3754.method14980(), 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
			anIntArray10203[i] = 0;
		}
	}

	void method15836() {
		if (aClass261_10188 != null && aClass261_10188.method4802()) {
			int i = aClass261_10188.method4925((byte) -35);
			int i_8_ = anIntArray10203[i];
			if ((i_8_ & 0x1) != 0 && aClass527_Sub18_Sub1_10190 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10190, aClass180_Sub2_3754.method14935(), -1974065914);
			if ((i_8_ & 0x2) != 0) {
				if (aClass527_Sub18_Sub1_10180 != null)
					aClass261_10188.method4824(aClass527_Sub18_Sub1_10180, aClass180_Sub2_3754.method14931(), -1974065914);
				if (aClass527_Sub18_Sub1_10177 != null) {
					aFloatArray10206[0] = 0.0F;
					aFloatArray10206[1] = 0.0F;
					aFloatArray10206[2] = 0.0F;
					aClass180_Sub2_3754.method3181().method6900(aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], aFloatArray10206);
					aClass261_10188.method4869(aClass527_Sub18_Sub1_10177, aFloatArray10206[0], aFloatArray10206[1], aFloatArray10206[2], -1752794578);
				}
			}
			if ((i_8_ & 0x10) != 0 && aClass527_Sub18_Sub1_10186 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10186, aClass180_Sub2_3754.method14937(), -1974065914);
			if ((i_8_ & 0x8) != 0 && aClass527_Sub18_Sub1_10182 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10182, aClass180_Sub2_3754.method14932(), -1974065914);
			if ((i_8_ & 0x4) != 0 && aClass527_Sub18_Sub1_10181 != null)
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10181, aClass180_Sub2_3754.method14939(), -1974065914);
			if ((i_8_ & 0x20) != 0 && aClass527_Sub18_Sub1_10184 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14937(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10184, aClass427_10204, -1974065914);
			}
			if ((i_8_ & 0x40) != 0 && aClass527_Sub18_Sub1_10185 != null) {
				aClass427_10204.method6739(aClass180_Sub2_3754.method14931(), aClass180_Sub2_3754.method14939());
				aClass261_10188.method4824(aClass527_Sub18_Sub1_10185, aClass427_10204, -1974065914);
			}
			if (aClass180_Sub2_3754.method15171() == 0 && (anIntArray10203[i] & 0x80) != 0 && aClass527_Sub18_Sub1_10178 != null) {
				aClass261_10188.method4821(aClass527_Sub18_Sub1_10178, aClass180_Sub2_3754.method14980(), 1908711447);
				anIntArray10203[i] &= ~0x80;
			}
			anIntArray10203[i] = 0;
		}
	}

	void method6167() {
		if (aClass261_10188 != null)
			aClass261_10188.method4854();
	}

	void method15837(int i) {
		aClass427Array10205[0].method6742();
		method15813(i);
	}
}
