/* Class285_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class285_Sub1 extends Class285 {
	float[][] aFloatArrayArray9976;
	long aLong9977;
	boolean aBool9978 = false;
	long aLong9979;
	Class286_Sub1 aClass286_Sub1_9980;
	static float[] aFloatArray9981 = new float[16];
	byte[] aByteArray9982;
	byte[] aByteArray9983;
	static final int anInt9984 = 0;
	static final int anInt9985 = 1;
	Class167_Sub3_Sub2 aClass167_Sub3_Sub2_9986;
	boolean[] aBoolArray9987;

	void method3794(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_0_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_1_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 6) != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i_0_ >= 0)
			method9119(i_0_, fs, i);
		if (i_1_ >= 0)
			method9124(i_1_, fs, i);
	}

	Class285_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, Class264 class264) {
		aFloatArrayArray9976 = new float[2][];
		aBoolArray9987 = new boolean[2];
		aString3191 = class264.aString2858;
		if (class264.aString2854 != null) {
			aString3189 = class264.aString2854;
			aByteArray9982 = class167_sub3_sub2.method10606(aString3189);
		}
		if (class264.aString2856 != null) {
			aString3190 = class264.aString2856;
			aByteArray9983 = class167_sub3_sub2.method10606(aString3190);
		}
		class167_sub3_sub2.method8894(this);
	}

	public boolean method3785() {
		if (aBool9978)
			return true;
		aLong9979 = (aByteArray9982 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9982));
		aLong9977 = (aByteArray9983 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9983));
		if (aLong9979 == 0L && aLong9977 == 0L)
			return false;
		int i = -1;
		for (int i_2_ = 0; i_2_ < aClass286_Sub1_9980.method3848(1511902687); i_2_++) {
			if (aClass286_Sub1_9980.method3871(i_2_, -544352414) == this) {
				i = i_2_;
				break;
			}
		}
		int i_3_ = aClass286_Sub1_9980.method3869(-1191082172);
		int i_4_ = aClass286_Sub1_9980.method3876((byte) 2);
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3870(i_5_, 1957590239);
			class536_sub8_sub1.method10640(i);
		}
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3893(i_6_, (byte) 5);
			class536_sub8_sub1.method10640(i);
		}
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = aClass286_Sub1_9980.method3894(this, -1251227599);
		for (int i_10_ = 0; i_10_ < i_3_ + i_4_; i_10_++) {
			Class536_Sub8_Sub1_Sub2 class536_sub8_sub1_sub2 = ((Class536_Sub8_Sub1_Sub2) (i_10_ < i_3_ ? aClass286_Sub1_9980.method3870(i_10_, 1957590239) : aClass286_Sub1_9980.method3893(i_10_ - i_3_, (byte) 5)));
			Class273 class273 = class536_sub8_sub1_sub2.method10642((byte) -99);
			int i_11_ = 1;
			if (class273 == Class273.aClass273_2893) {
				class273 = class536_sub8_sub1_sub2.method10649(1229446341);
				i_11_ = class536_sub8_sub1_sub2.method10644(-671334499);
			}
			switch (class273.anInt2891 * 363070705) {
			case 17:
			case 68:
			case 107:
			case 124:
				i_11_ *= 2;
				break;
			case 27:
			case 36:
			case 67:
			case 105:
			case 112:
				break;
			case 32:
			case 93:
			case 115:
			case 116:
				i_11_ *= 4;
				break;
			case 12:
			case 61:
			case 62:
			case 113:
				i_11_ *= 3;
				break;
			default:
				i_11_ = 0;
			}
			if (class536_sub8_sub1_sub2.anIntArray12104[i_9_] >= 0) {
				int i_12_ = class536_sub8_sub1_sub2.anIntArray12104[i_9_] + i_11_;
				if (i_7_ < i_12_)
					i_7_ = i_12_;
			}
			if (class536_sub8_sub1_sub2.anIntArray12103[i_9_] >= 0) {
				int i_13_ = class536_sub8_sub1_sub2.anIntArray12103[i_9_] + i_11_;
				if (i_8_ < i_13_)
					i_8_ = i_13_;
			}
		}
		aFloatArrayArray9976[0] = new float[i_7_ * 4];
		aFloatArrayArray9976[1] = new float[i_8_ * 4];
		aBool9978 = true;
		return true;
	}

	public void finalize() {
		method9117();
	}

	void method3787(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_14_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_15_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -35) != Class273.aClass273_3008)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_14_;
			aBoolArray9987[0] = true;
		}
		if (i_15_ >= 0) {
			i_15_ *= 4;
			aFloatArrayArray9976[1][i_15_ + 0] = f;
			aFloatArrayArray9976[1][i_15_ + 1] = f_14_;
			aBoolArray9987[1] = true;
		}
	}

	void method3788(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_16_, float f_17_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_18_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 50) != Class273.aClass273_3009)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_16_;
			aFloatArrayArray9976[0][i + 2] = f_17_;
			aBoolArray9987[0] = true;
		}
		if (i_18_ >= 0) {
			i_18_ *= 4;
			aFloatArrayArray9976[1][i_18_ + 0] = f;
			aFloatArrayArray9976[1][i_18_ + 1] = f_16_;
			aFloatArrayArray9976[1][i_18_ + 2] = f_17_;
			aBoolArray9987[1] = true;
		}
	}

	void method3835(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_19_, float f_20_, float f_21_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_22_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -40) != Class273.aClass273_2918)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_19_;
			aFloatArrayArray9976[0][i + 2] = f_20_;
			aFloatArrayArray9976[0][i + 3] = f_21_;
			aBoolArray9987[0] = true;
		}
		if (i_22_ >= 0) {
			i_22_ *= 4;
			aFloatArrayArray9976[1][i_22_ + 0] = f;
			aFloatArrayArray9976[1][i_22_ + 1] = f_19_;
			aFloatArrayArray9976[1][i_22_ + 2] = f_20_;
			aFloatArrayArray9976[1][i_22_ + 3] = f_21_;
			aBoolArray9987[1] = true;
		}
	}

	void method3791(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_23_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 26) != Class273.aClass273_2932)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0)
			method9119(i, class443.method5370(aFloatArray9981), 8);
		if (i_23_ >= 0)
			method9124(i_23_, class443.method5370(aFloatArray9981), 8);
	}

	void method9117() {
		if (aLong9979 != 0L) {
			aClass167_Sub3_Sub2_9986.method10620(aLong9979);
			aLong9979 = 0L;
		}
		if (aLong9977 != 0L) {
			aClass167_Sub3_Sub2_9986.method10620(aLong9977);
			aLong9977 = 0L;
		}
	}

	void method3790(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_24_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_25_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -78) != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i_24_ >= 0)
			method9119(i_24_, fs, i);
		if (i_25_ >= 0)
			method9124(i_25_, fs, i);
	}

	void method3793(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	public void method130() {
		if (aLong9979 != 0L) {
			IUnknown.Release(aLong9979);
			aLong9979 = 0L;
		}
		if (aLong9977 != 0L) {
			IUnknown.Release(aLong9977);
			aLong9977 = 0L;
		}
		aClass167_Sub3_Sub2_9986.method8936(this);
	}

	void method3795(int i, float f, float f_26_, float f_27_, float f_28_) {
		int i_29_ = i >> 16;
		int i_30_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_29_][i_30_] = f;
		aFloatArrayArray9976[i_29_][i_30_ + 1] = f_26_;
		aFloatArrayArray9976[i_29_][i_30_ + 2] = f_27_;
		aFloatArrayArray9976[i_29_][i_30_ + 3] = f_28_;
		aBoolArray9987[i_29_] = true;
	}

	void method3797(int i, Class443 class443) {
		int i_31_ = i >> 16;
		int i_32_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5356(aFloatArray9981), 0, aFloatArrayArray9976[i_31_], i_32_, 12);
		aBoolArray9987[i_31_] = true;
	}

	void method9118() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method3799(int i, Class443 class443) {
		int i_33_ = i >> 16;
		int i_34_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5356(aFloatArray9981), 0, aFloatArrayArray9976[i_33_], i_34_, 16);
		aBoolArray9987[i_33_] = true;
	}

	void method3814(int i, float f, float f_35_, float f_36_) {
		int i_37_ = i >> 16;
		int i_38_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_37_][i_38_] = f;
		aFloatArrayArray9976[i_37_][i_38_ + 1] = f_35_;
		aFloatArrayArray9976[i_37_][i_38_ + 2] = f_36_;
		aBoolArray9987[i_37_] = true;
	}

	final void method9119(int i, float[] fs, int i_39_) {
		Class687.method8117(fs, 0, aFloatArrayArray9976[0], i * 4, i_39_);
		aBoolArray9987[0] = true;
	}

	void method3823(int i, float[] fs, int i_40_) {
		int i_41_ = i >> 16;
		int i_42_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray9976[i_41_], i_42_, i_40_);
		aBoolArray9987[i_41_] = true;
	}

	void method3833(int i, int i_43_, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i_43_);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	void method3784(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_44_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -55) != Class273.aClass273_2934)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0)
			method9119(i, class443.method5356(aFloatArray9981), 16);
		if (i_44_ >= 0)
			method9124(i_44_, class443.method5356(aFloatArray9981), 16);
	}

	public void method131() {
		if (aLong9979 != 0L) {
			IUnknown.Release(aLong9979);
			aLong9979 = 0L;
		}
		if (aLong9977 != 0L) {
			IUnknown.Release(aLong9977);
			aLong9977 = 0L;
		}
		aClass167_Sub3_Sub2_9986.method8936(this);
	}

	public void method129() {
		if (aLong9979 != 0L) {
			IUnknown.Release(aLong9979);
			aLong9979 = 0L;
		}
		if (aLong9977 != 0L) {
			IUnknown.Release(aLong9977);
			aLong9977 = 0L;
		}
		aClass167_Sub3_Sub2_9986.method8936(this);
	}

	void method9120() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method3821(int i, float f, float f_45_, float f_46_, float f_47_) {
		int i_48_ = i >> 16;
		int i_49_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_48_][i_49_] = f;
		aFloatArrayArray9976[i_48_][i_49_ + 1] = f_45_;
		aFloatArrayArray9976[i_48_][i_49_ + 2] = f_46_;
		aFloatArrayArray9976[i_48_][i_49_ + 3] = f_47_;
		aBoolArray9987[i_48_] = true;
	}

	void method3809(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	void method3800(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_50_, float f_51_, float f_52_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_53_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -19) != Class273.aClass273_2918)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_50_;
			aFloatArrayArray9976[0][i + 2] = f_51_;
			aFloatArrayArray9976[0][i + 3] = f_52_;
			aBoolArray9987[0] = true;
		}
		if (i_53_ >= 0) {
			i_53_ *= 4;
			aFloatArrayArray9976[1][i_53_ + 0] = f;
			aFloatArrayArray9976[1][i_53_ + 1] = f_50_;
			aFloatArrayArray9976[1][i_53_ + 2] = f_51_;
			aFloatArrayArray9976[1][i_53_ + 3] = f_52_;
			aBoolArray9987[1] = true;
		}
	}

	void method9121() {
		method9117();
	}

	void method3817(int i, float f, float f_54_, float f_55_, float f_56_) {
		int i_57_ = i >> 16;
		int i_58_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_57_][i_58_] = f;
		aFloatArrayArray9976[i_57_][i_58_ + 1] = f_54_;
		aFloatArrayArray9976[i_57_][i_58_ + 2] = f_55_;
		aFloatArrayArray9976[i_57_][i_58_ + 3] = f_56_;
		aBoolArray9987[i_57_] = true;
	}

	public boolean method3801() {
		if (aBool9978)
			return true;
		aLong9979 = (aByteArray9982 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9982));
		aLong9977 = (aByteArray9983 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9983));
		if (aLong9979 == 0L && aLong9977 == 0L)
			return false;
		int i = -1;
		for (int i_59_ = 0; i_59_ < aClass286_Sub1_9980.method3848(1761567121); i_59_++) {
			if (aClass286_Sub1_9980.method3871(i_59_, -709239698) == this) {
				i = i_59_;
				break;
			}
		}
		int i_60_ = aClass286_Sub1_9980.method3869(-1973925829);
		int i_61_ = aClass286_Sub1_9980.method3876((byte) 101);
		for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3870(i_62_, 1957590239);
			class536_sub8_sub1.method10640(i);
		}
		for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3893(i_63_, (byte) 5);
			class536_sub8_sub1.method10640(i);
		}
		int i_64_ = 0;
		int i_65_ = 0;
		int i_66_ = aClass286_Sub1_9980.method3894(this, 1022751191);
		for (int i_67_ = 0; i_67_ < i_60_ + i_61_; i_67_++) {
			Class536_Sub8_Sub1_Sub2 class536_sub8_sub1_sub2 = ((Class536_Sub8_Sub1_Sub2) (i_67_ < i_60_ ? aClass286_Sub1_9980.method3870(i_67_, 1957590239) : aClass286_Sub1_9980.method3893(i_67_ - i_60_, (byte) 5)));
			Class273 class273 = class536_sub8_sub1_sub2.method10642((byte) 25);
			int i_68_ = 1;
			if (class273 == Class273.aClass273_2893) {
				class273 = class536_sub8_sub1_sub2.method10649(1229446341);
				i_68_ = class536_sub8_sub1_sub2.method10644(-2066394576);
			}
			switch (class273.anInt2891 * 363070705) {
			case 17:
			case 68:
			case 107:
			case 124:
				i_68_ *= 2;
				break;
			case 27:
			case 36:
			case 67:
			case 105:
			case 112:
				break;
			case 32:
			case 93:
			case 115:
			case 116:
				i_68_ *= 4;
				break;
			case 12:
			case 61:
			case 62:
			case 113:
				i_68_ *= 3;
				break;
			default:
				i_68_ = 0;
			}
			if (class536_sub8_sub1_sub2.anIntArray12104[i_66_] >= 0) {
				int i_69_ = class536_sub8_sub1_sub2.anIntArray12104[i_66_] + i_68_;
				if (i_64_ < i_69_)
					i_64_ = i_69_;
			}
			if (class536_sub8_sub1_sub2.anIntArray12103[i_66_] >= 0) {
				int i_70_ = class536_sub8_sub1_sub2.anIntArray12103[i_66_] + i_68_;
				if (i_65_ < i_70_)
					i_65_ = i_70_;
			}
		}
		aFloatArrayArray9976[0] = new float[i_64_ * 4];
		aFloatArrayArray9976[1] = new float[i_65_ * 4];
		aBool9978 = true;
		return true;
	}

	public boolean method3818() {
		if (aBool9978)
			return true;
		aLong9979 = (aByteArray9982 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9982));
		aLong9977 = (aByteArray9983 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass167_Sub3_Sub2_9986.aLong11573), aByteArray9983));
		if (aLong9979 == 0L && aLong9977 == 0L)
			return false;
		int i = -1;
		for (int i_71_ = 0; i_71_ < aClass286_Sub1_9980.method3848(1968601862); i_71_++) {
			if (aClass286_Sub1_9980.method3871(i_71_, 1653457446) == this) {
				i = i_71_;
				break;
			}
		}
		int i_72_ = aClass286_Sub1_9980.method3869(-1193396582);
		int i_73_ = aClass286_Sub1_9980.method3876((byte) 63);
		for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3870(i_74_, 1957590239);
			class536_sub8_sub1.method10640(i);
		}
		for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
			Class536_Sub8_Sub1 class536_sub8_sub1 = aClass286_Sub1_9980.method3893(i_75_, (byte) 5);
			class536_sub8_sub1.method10640(i);
		}
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = aClass286_Sub1_9980.method3894(this, -1303551704);
		for (int i_79_ = 0; i_79_ < i_72_ + i_73_; i_79_++) {
			Class536_Sub8_Sub1_Sub2 class536_sub8_sub1_sub2 = ((Class536_Sub8_Sub1_Sub2) (i_79_ < i_72_ ? aClass286_Sub1_9980.method3870(i_79_, 1957590239) : aClass286_Sub1_9980.method3893(i_79_ - i_72_, (byte) 5)));
			Class273 class273 = class536_sub8_sub1_sub2.method10642((byte) 65);
			int i_80_ = 1;
			if (class273 == Class273.aClass273_2893) {
				class273 = class536_sub8_sub1_sub2.method10649(1229446341);
				i_80_ = class536_sub8_sub1_sub2.method10644(-277211369);
			}
			switch (class273.anInt2891 * 363070705) {
			case 17:
			case 68:
			case 107:
			case 124:
				i_80_ *= 2;
				break;
			case 27:
			case 36:
			case 67:
			case 105:
			case 112:
				break;
			case 32:
			case 93:
			case 115:
			case 116:
				i_80_ *= 4;
				break;
			case 12:
			case 61:
			case 62:
			case 113:
				i_80_ *= 3;
				break;
			default:
				i_80_ = 0;
			}
			if (class536_sub8_sub1_sub2.anIntArray12104[i_78_] >= 0) {
				int i_81_ = class536_sub8_sub1_sub2.anIntArray12104[i_78_] + i_80_;
				if (i_76_ < i_81_)
					i_76_ = i_81_;
			}
			if (class536_sub8_sub1_sub2.anIntArray12103[i_78_] >= 0) {
				int i_82_ = class536_sub8_sub1_sub2.anIntArray12103[i_78_] + i_80_;
				if (i_77_ < i_82_)
					i_77_ = i_82_;
			}
		}
		aFloatArrayArray9976[0] = new float[i_76_ * 4];
		aFloatArrayArray9976[1] = new float[i_77_ * 4];
		aBool9978 = true;
		return true;
	}

	void method3828(Class536_Sub8_Sub1 class536_sub8_sub1, float f) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_83_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if ((class536_sub8_sub1.method10642((byte) -12) != Class273.aClass273_2915) && (class536_sub8_sub1.method10642((byte) -23) != Class273.aClass273_2961))
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i] = f;
			aBoolArray9987[0] = true;
		}
		if (i_83_ >= 0) {
			i_83_ *= 4;
			aFloatArrayArray9976[1][i_83_] = f;
			aBoolArray9987[1] = true;
		}
	}

	void method3804(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_84_, float f_85_, float f_86_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_87_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -54) != Class273.aClass273_2918)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_84_;
			aFloatArrayArray9976[0][i + 2] = f_85_;
			aFloatArrayArray9976[0][i + 3] = f_86_;
			aBoolArray9987[0] = true;
		}
		if (i_87_ >= 0) {
			i_87_ *= 4;
			aFloatArrayArray9976[1][i_87_ + 0] = f;
			aFloatArrayArray9976[1][i_87_ + 1] = f_84_;
			aFloatArrayArray9976[1][i_87_ + 2] = f_85_;
			aFloatArrayArray9976[1][i_87_ + 3] = f_86_;
			aBoolArray9987[1] = true;
		}
	}

	void method3806(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_88_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 0) != Class273.aClass273_2934)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0)
			method9119(i, class443.method5356(aFloatArray9981), 16);
		if (i_88_ >= 0)
			method9124(i_88_, class443.method5356(aFloatArray9981), 16);
	}

	void method3815(int i, float f, float f_89_, float f_90_, float f_91_) {
		int i_92_ = i >> 16;
		int i_93_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_92_][i_93_] = f;
		aFloatArrayArray9976[i_92_][i_93_ + 1] = f_89_;
		aFloatArrayArray9976[i_92_][i_93_ + 2] = f_90_;
		aFloatArrayArray9976[i_92_][i_93_ + 3] = f_91_;
		aBoolArray9987[i_92_] = true;
	}

	void method3792(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_94_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 36) != Class273.aClass273_2934)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0)
			method9119(i, class443.method5356(aFloatArray9981), 16);
		if (i_94_ >= 0)
			method9124(i_94_, class443.method5356(aFloatArray9981), 16);
	}

	void method9122() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method3808(int i, float[] fs, int i_95_) {
		int i_96_ = i >> 16;
		int i_97_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray9976[i_96_], i_97_, i_95_);
		aBoolArray9987[i_96_] = true;
	}

	void method3796(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	void method3812(int i, float f, float f_98_, float f_99_) {
		int i_100_ = i >> 16;
		int i_101_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_100_][i_101_] = f;
		aFloatArrayArray9976[i_100_][i_101_ + 1] = f_98_;
		aFloatArrayArray9976[i_100_][i_101_ + 2] = f_99_;
		aBoolArray9987[i_100_] = true;
	}

	void method3813(int i, float f, float f_102_, float f_103_) {
		int i_104_ = i >> 16;
		int i_105_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_104_][i_105_] = f;
		aFloatArrayArray9976[i_104_][i_105_ + 1] = f_102_;
		aFloatArrayArray9976[i_104_][i_105_ + 2] = f_103_;
		aBoolArray9987[i_104_] = true;
	}

	void method3807(Class536_Sub8_Sub1 class536_sub8_sub1, Class443 class443) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_106_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -92) != Class273.aClass273_2934)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0)
			method9119(i, class443.method5356(aFloatArray9981), 16);
		if (i_106_ >= 0)
			method9124(i_106_, class443.method5356(aFloatArray9981), 16);
	}

	void method3834(int i, float f, float f_107_, float f_108_) {
		int i_109_ = i >> 16;
		int i_110_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_109_][i_110_] = f;
		aFloatArrayArray9976[i_109_][i_110_ + 1] = f_107_;
		aFloatArrayArray9976[i_109_][i_110_ + 2] = f_108_;
		aBoolArray9987[i_109_] = true;
	}

	void method9123() {
		method9117();
	}

	void method3810(Class536_Sub8_Sub1 class536_sub8_sub1, int i, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	void method3798(int i, Class443 class443) {
		int i_111_ = i >> 16;
		int i_112_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5370(aFloatArray9981), 0, aFloatArrayArray9976[i_111_], i_112_, 8);
		aBoolArray9987[i_111_] = true;
	}

	void method3819(int i, float f, float f_113_, float f_114_, float f_115_) {
		int i_116_ = i >> 16;
		int i_117_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_116_][i_117_] = f;
		aFloatArrayArray9976[i_116_][i_117_ + 1] = f_113_;
		aFloatArrayArray9976[i_116_][i_117_ + 2] = f_114_;
		aFloatArrayArray9976[i_116_][i_117_ + 3] = f_115_;
		aBoolArray9987[i_116_] = true;
	}

	void method3820(int i, float f, float f_118_, float f_119_, float f_120_) {
		int i_121_ = i >> 16;
		int i_122_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_121_][i_122_] = f;
		aFloatArrayArray9976[i_121_][i_122_ + 1] = f_118_;
		aFloatArrayArray9976[i_121_][i_122_ + 2] = f_119_;
		aFloatArrayArray9976[i_121_][i_122_ + 3] = f_120_;
		aBoolArray9987[i_121_] = true;
	}

	void method3822(int i, float[] fs, int i_123_) {
		int i_124_ = i >> 16;
		int i_125_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray9976[i_124_], i_125_, i_123_);
		aBoolArray9987[i_124_] = true;
	}

	final void method9124(int i, float[] fs, int i_126_) {
		Class687.method8117(fs, 0, aFloatArrayArray9976[1], i * 4, i_126_);
		aBoolArray9987[1] = true;
	}

	void method3824(int i, float[] fs, int i_127_) {
		int i_128_ = i >> 16;
		int i_129_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray9976[i_128_], i_129_, i_127_);
		aBoolArray9987[i_128_] = true;
	}

	void method3825(int i, Class443 class443) {
		int i_130_ = i >> 16;
		int i_131_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5356(aFloatArray9981), 0, aFloatArrayArray9976[i_130_], i_131_, 12);
		aBoolArray9987[i_130_] = true;
	}

	void method3836(int i, Class443 class443) {
		int i_132_ = i >> 16;
		int i_133_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5370(aFloatArray9981), 0, aFloatArrayArray9976[i_132_], i_133_, 8);
		aBoolArray9987[i_132_] = true;
	}

	void method3827(int i, Class443 class443) {
		int i_134_ = i >> 16;
		int i_135_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5370(aFloatArray9981), 0, aFloatArrayArray9976[i_134_], i_135_, 8);
		aBoolArray9987[i_134_] = true;
	}

	void method3805(int i, Class443 class443) {
		int i_136_ = i >> 16;
		int i_137_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5356(aFloatArray9981), 0, aFloatArrayArray9976[i_136_], i_137_, 16);
		aBoolArray9987[i_136_] = true;
	}

	void method3811(int i, Class443 class443) {
		int i_138_ = i >> 16;
		int i_139_ = (i & 0xffff) * 4;
		System.arraycopy(class443.method5356(aFloatArray9981), 0, aFloatArrayArray9976[i_138_], i_139_, 16);
		aBoolArray9987[i_138_] = true;
	}

	void method3803(int i, int i_140_, Interface40 interface40) {
		aClass167_Sub3_Sub2_9986.method8780(i_140_);
		aClass167_Sub3_Sub2_9986.method8781(interface40);
	}

	void method3831(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_141_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_142_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -1) != Class273.aClass273_3008)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_141_;
			aBoolArray9987[0] = true;
		}
		if (i_142_ >= 0) {
			i_142_ *= 4;
			aFloatArrayArray9976[1][i_142_ + 0] = f;
			aFloatArrayArray9976[1][i_142_ + 1] = f_141_;
			aBoolArray9987[1] = true;
		}
	}

	void method3832(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_143_, float f_144_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_145_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -77) != Class273.aClass273_3009)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_143_;
			aFloatArrayArray9976[0][i + 2] = f_144_;
			aBoolArray9987[0] = true;
		}
		if (i_145_ >= 0) {
			i_145_ *= 4;
			aFloatArrayArray9976[1][i_145_ + 0] = f;
			aFloatArrayArray9976[1][i_145_ + 1] = f_143_;
			aFloatArrayArray9976[1][i_145_ + 2] = f_144_;
			aBoolArray9987[1] = true;
		}
	}

	void method3829(Class536_Sub8_Sub1 class536_sub8_sub1, float f, float f_146_, float f_147_) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_148_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 16) != Class273.aClass273_3009)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i + 0] = f;
			aFloatArrayArray9976[0][i + 1] = f_146_;
			aFloatArrayArray9976[0][i + 2] = f_147_;
			aBoolArray9987[0] = true;
		}
		if (i_148_ >= 0) {
			i_148_ *= 4;
			aFloatArrayArray9976[1][i_148_ + 0] = f;
			aFloatArrayArray9976[1][i_148_ + 1] = f_146_;
			aFloatArrayArray9976[1][i_148_ + 2] = f_147_;
			aBoolArray9987[1] = true;
		}
	}

	void method3789(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_149_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_150_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) 5) != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i_149_ >= 0)
			method9119(i_149_, fs, i);
		if (i_150_ >= 0)
			method9124(i_150_, fs, i);
	}

	void method3826(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_151_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_152_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -10) != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i_151_ >= 0)
			method9119(i_151_, fs, i);
		if (i_152_ >= 0)
			method9124(i_152_, fs, i);
	}

	void method3816(int i, float f, float f_153_, float f_154_) {
		int i_155_ = i >> 16;
		int i_156_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_155_][i_156_] = f;
		aFloatArrayArray9976[i_155_][i_156_ + 1] = f_153_;
		aFloatArrayArray9976[i_155_][i_156_ + 2] = f_154_;
		aBoolArray9987[i_155_] = true;
	}

	void method3837(Class536_Sub8_Sub1 class536_sub8_sub1, float[] fs, int i) {
		int i_157_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_158_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if (class536_sub8_sub1.method10642((byte) -6) != Class273.aClass273_2893)
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i_157_ >= 0)
			method9119(i_157_, fs, i);
		if (i_158_ >= 0)
			method9124(i_158_, fs, i);
	}

	Class285_Sub1(Class167_Sub3_Sub2 class167_sub3_sub2, Class286_Sub1 class286_sub1, Class264 class264) {
		this(class167_sub3_sub2, class264);
		aClass167_Sub3_Sub2_9986 = class167_sub3_sub2;
		aClass286_Sub1_9980 = class286_sub1;
	}

	void method9125() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method9126() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method9127() {
		if (aBoolArray9987[0]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[0].length / 4);
			aBoolArray9987[0] = false;
		}
		if (aBoolArray9987[1]) {
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.clear();
			aClass167_Sub3_Sub2_9986.aByteBuffer9549.asFloatBuffer().put(aFloatArrayArray9976[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass167_Sub3_Sub2_9986.aLong11573, 0, aClass167_Sub3_Sub2_9986.aLong9586, aFloatArrayArray9976[1].length / 4);
			aBoolArray9987[1] = false;
		}
	}

	void method3786(Class536_Sub8_Sub1 class536_sub8_sub1, float f) {
		int i = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11021();
		int i_159_ = ((Class536_Sub8_Sub1_Sub2) class536_sub8_sub1).method11022();
		if ((class536_sub8_sub1.method10642((byte) -38) != Class273.aClass273_2915) && (class536_sub8_sub1.method10642((byte) 78) != Class273.aClass273_2961))
			throw new IllegalArgumentException_Sub1(class536_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9976[0][i] = f;
			aBoolArray9987[0] = true;
		}
		if (i_159_ >= 0) {
			i_159_ *= 4;
			aFloatArrayArray9976[1][i_159_] = f;
			aBoolArray9987[1] = true;
		}
	}

	void method3830(int i, float f, float f_160_, float f_161_) {
		int i_162_ = i >> 16;
		int i_163_ = (i & 0xffff) * 4;
		aFloatArrayArray9976[i_162_][i_163_] = f;
		aFloatArrayArray9976[i_162_][i_163_ + 1] = f_160_;
		aFloatArrayArray9976[i_162_][i_163_ + 2] = f_161_;
		aBoolArray9987[i_162_] = true;
	}

	void method9128() {
		if (aLong9979 != 0L) {
			aClass167_Sub3_Sub2_9986.method10620(aLong9979);
			aLong9979 = 0L;
		}
		if (aLong9977 != 0L) {
			aClass167_Sub3_Sub2_9986.method10620(aLong9977);
			aLong9977 = 0L;
		}
	}
}
