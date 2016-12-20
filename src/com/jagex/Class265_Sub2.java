/* Class265_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class265_Sub2 extends Class265 {
	long aLong10015;
	boolean aBool10016 = false;
	Class180_Sub2_Sub2 aClass180_Sub2_Sub2_10017;
	boolean[] aBoolArray10018;
	long aLong10019;
	static float[] aFloatArray10020 = new float[16];
	byte[] aByteArray10021;
	byte[] aByteArray10022;
	static final int anInt10023 = 0;
	static final int anInt10024 = 1;
	float[][] aFloatArrayArray10025 = new float[2][];
	Class261_Sub2 aClass261_Sub2_10026;

	void method5025(int i, Class427 class427) {
		int i_0_ = i >> 16;
		int i_1_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6772(aFloatArray10020), 0, aFloatArrayArray10025[i_0_], i_1_, 8);
		aBoolArray10018[i_0_] = true;
	}

	Class265_Sub2(Class180_Sub2_Sub2 class180_sub2_sub2, Class287 class287) {
		aBoolArray10018 = new boolean[2];
		aString2874 = class287.aString3214;
		if (class287.aString3213 != null) {
			aString2873 = class287.aString3213;
			aByteArray10021 = class180_sub2_sub2.method18103(aString2873);
		}
		if (class287.aString3215 != null) {
			aString2875 = class287.aString3215;
			aByteArray10022 = class180_sub2_sub2.method18103(aString2875);
		}
		class180_sub2_sub2.method15055(this);
	}

	void method4995(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		aClass180_Sub2_Sub2_10017.method14970(i);
		aClass180_Sub2_Sub2_10017.method14971(interface41);
	}

	final void method15664(int i, float[] fs, int i_2_) {
		Class692.method14025(fs, 0, aFloatArrayArray10025[1], i * 4, i_2_);
		aBoolArray10018[1] = true;
	}

	void method4990(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_3_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_4_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(2068941848) != Class266.aClass266_2902)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_3_;
			aBoolArray10018[0] = true;
		}
		if (i_4_ >= 0) {
			i_4_ *= 4;
			aFloatArrayArray10025[1][i_4_ + 0] = f;
			aFloatArrayArray10025[1][i_4_ + 1] = f_3_;
			aBoolArray10018[1] = true;
		}
	}

	void method5022(int i, float[] fs, int i_5_) {
		int i_6_ = i >> 16;
		int i_7_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10025[i_6_], i_7_, i_5_);
		aBoolArray10018[i_6_] = true;
	}

	void method4997(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_8_, float f_9_, float f_10_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_11_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1282796686) != Class266.aClass266_2904)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_8_;
			aFloatArrayArray10025[0][i + 2] = f_9_;
			aFloatArrayArray10025[0][i + 3] = f_10_;
			aBoolArray10018[0] = true;
		}
		if (i_11_ >= 0) {
			i_11_ *= 4;
			aFloatArrayArray10025[1][i_11_ + 0] = f;
			aFloatArrayArray10025[1][i_11_ + 1] = f_8_;
			aFloatArrayArray10025[1][i_11_ + 2] = f_9_;
			aFloatArrayArray10025[1][i_11_ + 3] = f_10_;
			aBoolArray10018[1] = true;
		}
	}

	void method4994(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_12_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(116697843) != Class266.aClass266_2918)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6772(aFloatArray10020), 8);
		if (i_12_ >= 0)
			method15664(i_12_, class427.method6772(aFloatArray10020), 8);
	}

	void method5028(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_13_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1665318714) != Class266.aClass266_2882)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6766(aFloatArray10020), 16);
		if (i_13_ >= 0)
			method15664(i_13_, class427.method6766(aFloatArray10020), 16);
	}

	void method4993(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_14_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_15_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(-1763374082) != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i_14_ >= 0)
			method15675(i_14_, fs, i);
		if (i_15_ >= 0)
			method15664(i_15_, fs, i);
	}

	void method5032(int i, Class427 class427) {
		int i_16_ = i >> 16;
		int i_17_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6766(aFloatArray10020), 0, aFloatArrayArray10025[i_16_], i_17_, 16);
		aBoolArray10018[i_16_] = true;
	}

	void method4996(int i, float f, float f_18_, float f_19_) {
		int i_20_ = i >> 16;
		int i_21_ = (i & 0xffff) * 4;
		aFloatArrayArray10025[i_20_][i_21_] = f;
		aFloatArrayArray10025[i_20_][i_21_ + 1] = f_18_;
		aFloatArrayArray10025[i_20_][i_21_ + 2] = f_19_;
		aBoolArray10018[i_20_] = true;
	}

	void method4992(int i, float f, float f_22_, float f_23_, float f_24_) {
		int i_25_ = i >> 16;
		int i_26_ = (i & 0xffff) * 4;
		aFloatArrayArray10025[i_25_][i_26_] = f;
		aFloatArrayArray10025[i_25_][i_26_ + 1] = f_22_;
		aFloatArrayArray10025[i_25_][i_26_ + 2] = f_23_;
		aFloatArrayArray10025[i_25_][i_26_ + 3] = f_24_;
		aBoolArray10018[i_25_] = true;
	}

	void method4999(int i, Class427 class427) {
		int i_27_ = i >> 16;
		int i_28_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6766(aFloatArray10020), 0, aFloatArrayArray10025[i_27_], i_28_, 12);
		aBoolArray10018[i_27_] = true;
	}

	void method5029(Class527_Sub18_Sub1 class527_sub18_sub1, float f) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_29_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if ((class527_sub18_sub1.method18147(436675451) != Class266.aClass266_2995) && (class527_sub18_sub1.method18147(-1779285246) != Class266.aClass266_2947))
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i] = f;
			aBoolArray10018[0] = true;
		}
		if (i_29_ >= 0) {
			i_29_ *= 4;
			aFloatArrayArray10025[1][i_29_] = f;
			aBoolArray10018[1] = true;
		}
	}

	void method5000(int i, Class427 class427) {
		int i_30_ = i >> 16;
		int i_31_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6766(aFloatArray10020), 0, aFloatArrayArray10025[i_30_], i_31_, 16);
		aBoolArray10018[i_30_] = true;
	}

	void method5019(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_32_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1759810362) != Class266.aClass266_2882)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6766(aFloatArray10020), 16);
		if (i_32_ >= 0)
			method15664(i_32_, class427.method6766(aFloatArray10020), 16);
	}

	public void finalize() {
		method15667();
	}

	void method15665() {
		if (aLong10015 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10015);
			aLong10015 = 0L;
		}
		if (aLong10019 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10019);
			aLong10019 = 0L;
		}
	}

	void method5002(int i, int i_33_, Interface41 interface41) {
		aClass180_Sub2_Sub2_10017.method14970(i_33_);
		aClass180_Sub2_Sub2_10017.method14971(interface41);
	}

	void method15666() {
		if (aBoolArray10018[0]) {
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.asFloatBuffer().put(aFloatArrayArray10025[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass180_Sub2_Sub2_10017.aLong11572, 0, aClass180_Sub2_Sub2_10017.aLong9439, aFloatArrayArray10025[0].length / 4);
			aBoolArray10018[0] = false;
		}
		if (aBoolArray10018[1]) {
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.asFloatBuffer().put(aFloatArrayArray10025[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass180_Sub2_Sub2_10017.aLong11572, 0, aClass180_Sub2_Sub2_10017.aLong9439, aFloatArrayArray10025[1].length / 4);
			aBoolArray10018[1] = false;
		}
	}

	void method4998(int i, int i_34_, Interface41 interface41) {
		aClass180_Sub2_Sub2_10017.method14970(i_34_);
		aClass180_Sub2_Sub2_10017.method14971(interface41);
	}

	void method15667() {
		if (aLong10015 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10015);
			aLong10015 = 0L;
		}
		if (aLong10019 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10019);
			aLong10019 = 0L;
		}
	}

	Class265_Sub2(Class180_Sub2_Sub2 class180_sub2_sub2, Class261_Sub2 class261_sub2, Class287 class287) {
		this(class180_sub2_sub2, class287);
		aClass180_Sub2_Sub2_10017 = class180_sub2_sub2;
		aClass261_Sub2_10026 = class261_sub2;
	}

	void method4991(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_35_, float f_36_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_37_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(791224375) != Class266.aClass266_2903)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_35_;
			aFloatArrayArray10025[0][i + 2] = f_36_;
			aBoolArray10018[0] = true;
		}
		if (i_37_ >= 0) {
			i_37_ *= 4;
			aFloatArrayArray10025[1][i_37_ + 0] = f;
			aFloatArrayArray10025[1][i_37_ + 1] = f_35_;
			aFloatArrayArray10025[1][i_37_ + 2] = f_36_;
			aBoolArray10018[1] = true;
		}
	}

	public void method130() {
		if (aLong10015 != 0L) {
			IUnknown.Release(aLong10015);
			aLong10015 = 0L;
		}
		if (aLong10019 != 0L) {
			IUnknown.Release(aLong10019);
			aLong10019 = 0L;
		}
		aClass180_Sub2_Sub2_10017.method14886(this);
	}

	void method15668() {
		method15667();
	}

	void method15669() {
		method15667();
	}

	void method15670() {
		method15667();
	}

	void method15671() {
		method15667();
	}

	void method15672() {
		method15667();
	}

	public boolean method4988() {
		if (aBool10016)
			return true;
		aLong10015 = (aByteArray10021 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass180_Sub2_Sub2_10017.aLong11572), aByteArray10021));
		aLong10019 = (aByteArray10022 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass180_Sub2_Sub2_10017.aLong11572), aByteArray10022));
		if (aLong10015 == 0L && aLong10019 == 0L)
			return false;
		int i = -1;
		for (int i_38_ = 0; i_38_ < aClass261_Sub2_10026.method4806(-980827483); i_38_++) {
			if (aClass261_Sub2_10026.method4841(i_38_, (byte) 75) == this) {
				i = i_38_;
				break;
			}
		}
		int i_39_ = aClass261_Sub2_10026.method4836(-1529552419);
		int i_40_ = aClass261_Sub2_10026.method4832(1522697466);
		for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub2_10026.method4837(i_41_, 346959933);
			class527_sub18_sub1.method18144(i);
		}
		for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub2_10026.method4856(i_42_, (byte) -57);
			class527_sub18_sub1.method18144(i);
		}
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = aClass261_Sub2_10026.method4808(this, (byte) 122);
		for (int i_46_ = 0; i_46_ < i_39_ + i_40_; i_46_++) {
			Class527_Sub18_Sub1_Sub2 class527_sub18_sub1_sub2 = ((Class527_Sub18_Sub1_Sub2) (i_46_ < i_39_ ? aClass261_Sub2_10026.method4837(i_46_, 714206128) : aClass261_Sub2_10026.method4856(i_46_ - i_39_, (byte) -101)));
			Class266 class266 = class527_sub18_sub1_sub2.method18147(-771227811);
			int i_47_ = 1;
			if (class266 == Class266.aClass266_2927) {
				class266 = class527_sub18_sub1_sub2.method18156(-383877050);
				i_47_ = class527_sub18_sub1_sub2.method18149(-2146097395);
			}
			switch (class266.anInt3002 * 1236682307) {
			case 19:
			case 41:
			case 74:
			case 95:
				i_47_ *= 3;
				break;
			case 16:
			case 39:
			case 50:
			case 71:
			case 113:
				break;
			default:
				i_47_ = 0;
				break;
			case 18:
			case 58:
			case 69:
			case 106:
				i_47_ *= 2;
				break;
			case 31:
			case 43:
			case 45:
			case 77:
				i_47_ *= 4;
			}
			if (class527_sub18_sub1_sub2.anIntArray12085[i_45_] >= 0) {
				int i_48_ = class527_sub18_sub1_sub2.anIntArray12085[i_45_] + i_47_;
				if (i_43_ < i_48_)
					i_43_ = i_48_;
			}
			if (class527_sub18_sub1_sub2.anIntArray12086[i_45_] >= 0) {
				int i_49_ = class527_sub18_sub1_sub2.anIntArray12086[i_45_] + i_47_;
				if (i_44_ < i_49_)
					i_44_ = i_49_;
			}
		}
		aFloatArrayArray10025[0] = new float[i_43_ * 4];
		aFloatArrayArray10025[1] = new float[i_44_ * 4];
		aBool10016 = true;
		return true;
	}

	void method5010(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_50_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_51_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(-2079982252) != Class266.aClass266_2902)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_50_;
			aBoolArray10018[0] = true;
		}
		if (i_51_ >= 0) {
			i_51_ *= 4;
			aFloatArrayArray10025[1][i_51_ + 0] = f;
			aFloatArrayArray10025[1][i_51_ + 1] = f_50_;
			aBoolArray10018[1] = true;
		}
	}

	void method4987(int i, Class427 class427) {
		int i_52_ = i >> 16;
		int i_53_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6772(aFloatArray10020), 0, aFloatArrayArray10025[i_52_], i_53_, 8);
		aBoolArray10018[i_52_] = true;
	}

	void method5007(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_54_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_55_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(2023761939) != Class266.aClass266_2902)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_54_;
			aBoolArray10018[0] = true;
		}
		if (i_55_ >= 0) {
			i_55_ *= 4;
			aFloatArrayArray10025[1][i_55_ + 0] = f;
			aFloatArrayArray10025[1][i_55_ + 1] = f_54_;
			aBoolArray10018[1] = true;
		}
	}

	void method5016(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_56_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(2101622086) != Class266.aClass266_2918)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6772(aFloatArray10020), 8);
		if (i_56_ >= 0)
			method15664(i_56_, class427.method6772(aFloatArray10020), 8);
	}

	void method5009(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_57_, float f_58_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_59_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(-1463822012) != Class266.aClass266_2903)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_57_;
			aFloatArrayArray10025[0][i + 2] = f_58_;
			aBoolArray10018[0] = true;
		}
		if (i_59_ >= 0) {
			i_59_ *= 4;
			aFloatArrayArray10025[1][i_59_ + 0] = f;
			aFloatArrayArray10025[1][i_59_ + 1] = f_57_;
			aFloatArrayArray10025[1][i_59_ + 2] = f_58_;
			aBoolArray10018[1] = true;
		}
	}

	void method5027(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_60_, float f_61_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_62_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(701947074) != Class266.aClass266_2903)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_60_;
			aFloatArrayArray10025[0][i + 2] = f_61_;
			aBoolArray10018[0] = true;
		}
		if (i_62_ >= 0) {
			i_62_ *= 4;
			aFloatArrayArray10025[1][i_62_ + 0] = f;
			aFloatArrayArray10025[1][i_62_ + 1] = f_60_;
			aFloatArrayArray10025[1][i_62_ + 2] = f_61_;
			aBoolArray10018[1] = true;
		}
	}

	void method5011(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_63_, float f_64_, float f_65_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_66_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1610625963) != Class266.aClass266_2904)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_63_;
			aFloatArrayArray10025[0][i + 2] = f_64_;
			aFloatArrayArray10025[0][i + 3] = f_65_;
			aBoolArray10018[0] = true;
		}
		if (i_66_ >= 0) {
			i_66_ *= 4;
			aFloatArrayArray10025[1][i_66_ + 0] = f;
			aFloatArrayArray10025[1][i_66_ + 1] = f_63_;
			aFloatArrayArray10025[1][i_66_ + 2] = f_64_;
			aFloatArrayArray10025[1][i_66_ + 3] = f_65_;
			aBoolArray10018[1] = true;
		}
	}

	void method5012(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_67_, float f_68_, float f_69_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_70_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(-1834227544) != Class266.aClass266_2904)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_67_;
			aFloatArrayArray10025[0][i + 2] = f_68_;
			aFloatArrayArray10025[0][i + 3] = f_69_;
			aBoolArray10018[0] = true;
		}
		if (i_70_ >= 0) {
			i_70_ *= 4;
			aFloatArrayArray10025[1][i_70_ + 0] = f;
			aFloatArrayArray10025[1][i_70_ + 1] = f_67_;
			aFloatArrayArray10025[1][i_70_ + 2] = f_68_;
			aFloatArrayArray10025[1][i_70_ + 3] = f_69_;
			aBoolArray10018[1] = true;
		}
	}

	void method5013(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_71_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_72_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(323333788) != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i_71_ >= 0)
			method15675(i_71_, fs, i);
		if (i_72_ >= 0)
			method15664(i_72_, fs, i);
	}

	void method5014(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_73_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_74_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1152487189) != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i_73_ >= 0)
			method15675(i_73_, fs, i);
		if (i_74_ >= 0)
			method15664(i_74_, fs, i);
	}

	void method4986(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i) {
		int i_75_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_76_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(1055896008) != Class266.aClass266_2927)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i_75_ >= 0)
			method15675(i_75_, fs, i);
		if (i_76_ >= 0)
			method15664(i_76_, fs, i);
	}

	void method15673() {
		if (aBoolArray10018[0]) {
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.asFloatBuffer().put(aFloatArrayArray10025[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass180_Sub2_Sub2_10017.aLong11572, 0, aClass180_Sub2_Sub2_10017.aLong9439, aFloatArrayArray10025[0].length / 4);
			aBoolArray10018[0] = false;
		}
		if (aBoolArray10018[1]) {
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.clear();
			aClass180_Sub2_Sub2_10017.aByteBuffer9438.asFloatBuffer().put(aFloatArrayArray10025[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass180_Sub2_Sub2_10017.aLong11572, 0, aClass180_Sub2_Sub2_10017.aLong9439, aFloatArrayArray10025[1].length / 4);
			aBoolArray10018[1] = false;
		}
	}

	void method5017(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_77_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(146152968) != Class266.aClass266_2918)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6772(aFloatArray10020), 8);
		if (i_77_ >= 0)
			method15664(i_77_, class427.method6772(aFloatArray10020), 8);
	}

	void method5018(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_78_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(2024125931) != Class266.aClass266_2882)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0)
			method15675(i, class427.method6766(aFloatArray10020), 16);
		if (i_78_ >= 0)
			method15664(i_78_, class427.method6766(aFloatArray10020), 16);
	}

	public boolean method5006() {
		if (aBool10016)
			return true;
		aLong10015 = (aByteArray10021 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass180_Sub2_Sub2_10017.aLong11572), aByteArray10021));
		aLong10019 = (aByteArray10022 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass180_Sub2_Sub2_10017.aLong11572), aByteArray10022));
		if (aLong10015 == 0L && aLong10019 == 0L)
			return false;
		int i = -1;
		for (int i_79_ = 0; i_79_ < aClass261_Sub2_10026.method4806(1493343339); i_79_++) {
			if (aClass261_Sub2_10026.method4841(i_79_, (byte) 0) == this) {
				i = i_79_;
				break;
			}
		}
		int i_80_ = aClass261_Sub2_10026.method4836(-571388944);
		int i_81_ = aClass261_Sub2_10026.method4832(656068206);
		for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub2_10026.method4837(i_82_, 1972814759);
			class527_sub18_sub1.method18144(i);
		}
		for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
			Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_Sub2_10026.method4856(i_83_, (byte) -34);
			class527_sub18_sub1.method18144(i);
		}
		int i_84_ = 0;
		int i_85_ = 0;
		int i_86_ = aClass261_Sub2_10026.method4808(this, (byte) 17);
		for (int i_87_ = 0; i_87_ < i_80_ + i_81_; i_87_++) {
			Class527_Sub18_Sub1_Sub2 class527_sub18_sub1_sub2 = ((Class527_Sub18_Sub1_Sub2) (i_87_ < i_80_ ? aClass261_Sub2_10026.method4837(i_87_, 459630191) : aClass261_Sub2_10026.method4856(i_87_ - i_80_, (byte) 23)));
			Class266 class266 = class527_sub18_sub1_sub2.method18147(395665706);
			int i_88_ = 1;
			if (class266 == Class266.aClass266_2927) {
				class266 = class527_sub18_sub1_sub2.method18156(-908494548);
				i_88_ = class527_sub18_sub1_sub2.method18149(-1284989744);
			}
			switch (class266.anInt3002 * 1236682307) {
			case 19:
			case 41:
			case 74:
			case 95:
				i_88_ *= 3;
				break;
			case 16:
			case 39:
			case 50:
			case 71:
			case 113:
				break;
			default:
				i_88_ = 0;
				break;
			case 18:
			case 58:
			case 69:
			case 106:
				i_88_ *= 2;
				break;
			case 31:
			case 43:
			case 45:
			case 77:
				i_88_ *= 4;
			}
			if (class527_sub18_sub1_sub2.anIntArray12085[i_86_] >= 0) {
				int i_89_ = class527_sub18_sub1_sub2.anIntArray12085[i_86_] + i_88_;
				if (i_84_ < i_89_)
					i_84_ = i_89_;
			}
			if (class527_sub18_sub1_sub2.anIntArray12086[i_86_] >= 0) {
				int i_90_ = class527_sub18_sub1_sub2.anIntArray12086[i_86_] + i_88_;
				if (i_85_ < i_90_)
					i_85_ = i_90_;
			}
		}
		aFloatArrayArray10025[0] = new float[i_84_ * 4];
		aFloatArrayArray10025[1] = new float[i_85_ * 4];
		aBool10016 = true;
		return true;
	}

	void method5008(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_91_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_92_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(847658572) != Class266.aClass266_2902)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_91_;
			aBoolArray10018[0] = true;
		}
		if (i_92_ >= 0) {
			i_92_ *= 4;
			aFloatArrayArray10025[1][i_92_ + 0] = f;
			aFloatArrayArray10025[1][i_92_ + 1] = f_91_;
			aBoolArray10018[1] = true;
		}
	}

	void method5021(int i, float f, float f_93_, float f_94_) {
		int i_95_ = i >> 16;
		int i_96_ = (i & 0xffff) * 4;
		aFloatArrayArray10025[i_95_][i_96_] = f;
		aFloatArrayArray10025[i_95_][i_96_ + 1] = f_93_;
		aFloatArrayArray10025[i_95_][i_96_ + 2] = f_94_;
		aBoolArray10018[i_95_] = true;
	}

	void method5015(int i, float f, float f_97_, float f_98_, float f_99_) {
		int i_100_ = i >> 16;
		int i_101_ = (i & 0xffff) * 4;
		aFloatArrayArray10025[i_100_][i_101_] = f;
		aFloatArrayArray10025[i_100_][i_101_ + 1] = f_97_;
		aFloatArrayArray10025[i_100_][i_101_ + 2] = f_98_;
		aFloatArrayArray10025[i_100_][i_101_ + 3] = f_99_;
		aBoolArray10018[i_100_] = true;
	}

	void method5023(int i, Class427 class427) {
		int i_102_ = i >> 16;
		int i_103_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6766(aFloatArray10020), 0, aFloatArrayArray10025[i_102_], i_103_, 12);
		aBoolArray10018[i_102_] = true;
	}

	void method5024(int i, Class427 class427) {
		int i_104_ = i >> 16;
		int i_105_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6772(aFloatArray10020), 0, aFloatArrayArray10025[i_104_], i_105_, 8);
		aBoolArray10018[i_104_] = true;
	}

	void method4989(Class527_Sub18_Sub1 class527_sub18_sub1, float f) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_106_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if ((class527_sub18_sub1.method18147(-300649969) != Class266.aClass266_2995) && (class527_sub18_sub1.method18147(-741107434) != Class266.aClass266_2947))
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i] = f;
			aBoolArray10018[0] = true;
		}
		if (i_106_ >= 0) {
			i_106_ *= 4;
			aFloatArrayArray10025[1][i_106_] = f;
			aBoolArray10018[1] = true;
		}
	}

	void method5026(int i, Class427 class427) {
		int i_107_ = i >> 16;
		int i_108_ = (i & 0xffff) * 4;
		System.arraycopy(class427.method6766(aFloatArray10020), 0, aFloatArrayArray10025[i_107_], i_108_, 16);
		aBoolArray10018[i_107_] = true;
	}

	public void method129() {
		if (aLong10015 != 0L) {
			IUnknown.Release(aLong10015);
			aLong10015 = 0L;
		}
		if (aLong10019 != 0L) {
			IUnknown.Release(aLong10019);
			aLong10019 = 0L;
		}
		aClass180_Sub2_Sub2_10017.method14886(this);
	}

	void method5005(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41) {
		aClass180_Sub2_Sub2_10017.method14970(i);
		aClass180_Sub2_Sub2_10017.method14971(interface41);
	}

	void method5030(int i, float[] fs, int i_109_) {
		int i_110_ = i >> 16;
		int i_111_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10025[i_110_], i_111_, i_109_);
		aBoolArray10018[i_110_] = true;
	}

	void method5031(int i, float[] fs, int i_112_) {
		int i_113_ = i >> 16;
		int i_114_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10025[i_113_], i_114_, i_112_);
		aBoolArray10018[i_113_] = true;
	}

	void method5001(int i, float[] fs, int i_115_) {
		int i_116_ = i >> 16;
		int i_117_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10025[i_116_], i_117_, i_115_);
		aBoolArray10018[i_116_] = true;
	}

	final void method15674(int i, float[] fs, int i_118_) {
		Class692.method14025(fs, 0, aFloatArrayArray10025[0], i * 4, i_118_);
		aBoolArray10018[0] = true;
	}

	final void method15675(int i, float[] fs, int i_119_) {
		Class692.method14025(fs, 0, aFloatArrayArray10025[0], i * 4, i_119_);
		aBoolArray10018[0] = true;
	}

	void method15676() {
		if (aLong10015 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10015);
			aLong10015 = 0L;
		}
		if (aLong10019 != 0L) {
			aClass180_Sub2_Sub2_10017.method18107(aLong10019);
			aLong10019 = 0L;
		}
	}

	void method5020(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_120_) {
		int i = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18756();
		int i_121_ = ((Class527_Sub18_Sub1_Sub2) class527_sub18_sub1).method18753();
		if (class527_sub18_sub1.method18147(2052001795) != Class266.aClass266_2902)
			throw new IllegalArgumentException_Sub1(class527_sub18_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10025[0][i + 0] = f;
			aFloatArrayArray10025[0][i + 1] = f_120_;
			aBoolArray10018[0] = true;
		}
		if (i_121_ >= 0) {
			i_121_ *= 4;
			aFloatArrayArray10025[1][i_121_ + 0] = f;
			aFloatArrayArray10025[1][i_121_ + 1] = f_120_;
			aBoolArray10018[1] = true;
		}
	}
}
