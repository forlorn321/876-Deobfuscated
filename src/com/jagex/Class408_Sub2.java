/* Class408_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class408_Sub2 extends Class408 implements Interface36 {
	int anInt10121;
	int anInt10122;
	float aFloat10123;
	float aFloat10124;
	boolean aBool10125;
	boolean aBool10126;

	public int method232() {
		return anInt10121;
	}

	public void method218(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int[] is = aClass167_Sub3_Sub2_4302.getPixelArea(i_3_, i_4_, i_1_, i_2_);
		if (is != null) {
			for (int i_5_ = 0; i_5_ < is.length; i_5_++)
				is[i_5_] |= ~0xffffff;
			method223(i, i_0_, i_1_, i_2_, is, 0, i_1_);
		}
	}

	Class408_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2, int i, int i_6_, boolean bool, int[] is, int i_7_, int i_8_) {
		super(class167_sub3_sub2, Class155.aClass155_1722, Class171.aClass171_1905, bool && class167_sub3_sub2.aBool11561, i * i_6_);
		if (!aClass167_Sub3_Sub2_4302.aBool11560) {
			anInt10122 = Class528.method6434(i, -233159904);
			anInt10121 = Class528.method6434(i_6_, -758646622);
			aFloat10123 = (float) i / (float) anInt10122;
			aFloat10124 = (float) i_6_ / (float) anInt10121;
			if (i != anInt10122 || i_6_ != anInt10121) {
				is = aClass167_Sub3_Sub2_4302.method2182(i, i_6_, anInt10122, anInt10121, is, i_7_, i_8_, (byte) 100);
				i_7_ = 0;
				i_8_ = anInt10122;
			}
		} else {
			anInt10122 = i;
			anInt10121 = i_6_;
			aFloat10123 = 1.0F;
			aFloat10124 = 1.0F;
		}
		if (bool)
			aLong4306 = IDirect3DDevice.CreateTexture((aClass167_Sub3_Sub2_4302.aLong11573), anInt10122, anInt10121, 0, 1024, 21, 1);
		else
			aLong4306 = IDirect3DDevice.CreateTexture((aClass167_Sub3_Sub2_4302.aLong11573), anInt10122, anInt10121, 1, 0, 21, 1);
		if (i_8_ == 0)
			i_8_ = anInt10122;
		aClass167_Sub3_Sub2_4302.method8713(i_8_ * anInt10121 * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_7_, i_8_ * anInt10121);
		IDirect3DTexture.Upload(aLong4306, 0, 0, 0, anInt10122, anInt10121, i_8_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public void method257(int i, int i_9_, int i_10_, int i_11_, int[] is, int i_12_, int i_13_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_13_ == 0)
			i_13_ = i_10_;
		aClass167_Sub3_Sub2_4302.method8713(i_13_ * i_11_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_12_, i_13_ * i_11_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_9_, i_10_, i_11_, i_13_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	Class408_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, int i, int i_14_, boolean bool, float[] fs, int i_15_, int i_16_) {
		super(class167_sub3_sub2, class155, Class171.aClass171_1905, bool && class167_sub3_sub2.aBool11561, i * i_14_);
		if (!aClass167_Sub3_Sub2_4302.aBool11560) {
			anInt10122 = Class528.method6434(i, -772050243);
			anInt10121 = Class528.method6434(i_14_, -1363441454);
			aFloat10123 = (float) i / (float) anInt10122;
			aFloat10124 = (float) i_14_ / (float) anInt10121;
			if (i != anInt10122 || i_14_ != anInt10121) {
				fs = aClass167_Sub3_Sub2_4302.method2177(i, i_14_, anInt10122, anInt10121, fs, i_15_, i_16_, (class155.anInt1732 * -2037186451), -1633966849);
				i_15_ = 0;
				i_16_ = anInt10122;
			}
		} else {
			anInt10122 = i;
			anInt10121 = i_14_;
			aFloat10123 = 1.0F;
			aFloat10124 = 1.0F;
		}
		if (bool)
			aLong4306 = (IDirect3DDevice.CreateTexture(aClass167_Sub3_Sub2_4302.aLong11573, anInt10122, anInt10121, 0, 1024, Class167_Sub3_Sub2.method10618(aClass155_4303, Class171.aClass171_1903), 1));
		else
			aLong4306 = (IDirect3DDevice.CreateTexture(aClass167_Sub3_Sub2_4302.aLong11573, anInt10122, anInt10121, 1, 0, Class167_Sub3_Sub2.method10618(aClass155_4303, Class171.aClass171_1903), 1));
		if (i_16_ == 0)
			i_16_ = anInt10122;
		aClass167_Sub3_Sub2_4302.method8713(i_16_ * anInt10121 * (aClass155_4303.anInt1732 * -2037186451) * 4);
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_15_, (i_16_ * anInt10121 * (aClass155_4303.anInt1732 * -2037186451)));
		IDirect3DTexture.Upload(aLong4306, 0, 0, 0, anInt10122, anInt10121, i_16_ * (aClass155_4303.anInt1732 * -2037186451) * 4, 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public int method1() {
		return anInt10122;
	}

	public int method78() {
		return anInt10121;
	}

	public void method224(int i, int i_17_, int i_18_, int i_19_, byte[] is, Class155 class155, int i_20_, int i_21_) {
		if (aClass155_4303 != class155 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_21_ == 0)
			i_21_ = i_18_;
		aClass167_Sub3_Sub2_4302.method8713(i_21_ * i_19_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.put(is, i_20_, i_21_ * i_19_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_17_, i_18_, i_19_, i_21_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public float method220(float f) {
		return f / (float) anInt10121;
	}

	public void method223(int i, int i_22_, int i_23_, int i_24_, int[] is, int i_25_, int i_26_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_26_ == 0)
			i_26_ = i_23_;
		aClass167_Sub3_Sub2_4302.method8713(i_26_ * i_24_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_25_, i_26_ * i_24_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_22_, i_23_, i_24_, i_26_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	long method4960() {
		return aLong4306;
	}

	public boolean method221() {
		return true;
	}

	long method4958() {
		return aLong4306;
	}

	public void method130() {
		super.method131();
	}

	public void method222(boolean bool, boolean bool_27_) {
		aBool10125 = bool;
		aBool10126 = bool_27_;
	}

	public float method219(float f) {
		return f / (float) anInt10122;
	}

	public float method244() {
		return aFloat10124;
	}

	public void method243(int i, int i_28_, int i_29_, int i_30_, int[] is, int i_31_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		aClass167_Sub3_Sub2_4302.method8713(i_29_ * i_30_ * 4);
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4306, 0, i, i_28_, i_29_, i_30_, i_29_ * 4, 0, aClass167_Sub3_Sub2_4302.aLong9586);
		bytebuffer.asIntBuffer().get(is, i_31_, i_29_ * i_30_);
	}

	public void method226(int i, int i_32_, int i_33_, int i_34_, int[] is, int[] is_35_, int i_36_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_32_, i_33_, i_34_, is, null, i_36_);
	}

	public void method253(int i, int i_37_, int i_38_, int i_39_, int[] is, int[] is_40_, int i_41_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_37_, i_38_, i_39_, is, null, i_41_);
	}

	long method4959() {
		return aLong4306;
	}

	public boolean method230() {
		return false;
	}

	public void method131() {
		super.method131();
	}

	Class408_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, int i, int i_42_, boolean bool, byte[] is, int i_43_, int i_44_) {
		super(class167_sub3_sub2, class155, Class171.aClass171_1905, bool && class167_sub3_sub2.aBool11561, i * i_42_);
		if (!aClass167_Sub3_Sub2_4302.aBool11560) {
			anInt10122 = Class528.method6434(i, -2064534094);
			anInt10121 = Class528.method6434(i_42_, -1106792126);
			aFloat10123 = (float) i / (float) anInt10122;
			aFloat10124 = (float) i_42_ / (float) anInt10121;
			if (i != anInt10122 || i_42_ != anInt10121) {
				is = aClass167_Sub3_Sub2_4302.method2216(i, i_42_, anInt10122, anInt10121, is, i_43_, i_44_, (class155.anInt1732 * -2037186451), -2126921751);
				i_43_ = 0;
				i_44_ = anInt10122;
			}
		} else {
			anInt10122 = i;
			anInt10121 = i_42_;
			aFloat10123 = 1.0F;
			aFloat10124 = 1.0F;
		}
		if (bool)
			aLong4306 = (IDirect3DDevice.CreateTexture(aClass167_Sub3_Sub2_4302.aLong11573, anInt10122, anInt10121, 0, 1024, Class167_Sub3_Sub2.method10618(aClass155_4303, Class171.aClass171_1905), 1));
		else
			aLong4306 = (IDirect3DDevice.CreateTexture(aClass167_Sub3_Sub2_4302.aLong11573, anInt10122, anInt10121, 1, 0, Class167_Sub3_Sub2.method10618(aClass155_4303, Class171.aClass171_1905), 1));
		if (i_44_ == 0)
			i_44_ = anInt10122;
		aClass167_Sub3_Sub2_4302.method8713(i_44_ * anInt10121 * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		if (aClass155_4303 == Class155.aClass155_1731) {
			bytebuffer.put(is, i_43_, anInt10121 * anInt10122 / 2);
			IDirect3DTexture.Upload(aLong4306, 0, 0, 0, anInt10122, anInt10121 / 4, anInt10122 / 4 * 8, 0, aClass167_Sub3_Sub2_4302.aLong9586);
		} else if (aClass155_4303 == Class155.aClass155_1730) {
			bytebuffer.put(is, i_43_, anInt10121 * anInt10122);
			IDirect3DTexture.Upload(aLong4306, 0, 0, 0, anInt10122, anInt10121 / 4, anInt10122 / 4 * 16, 0, aClass167_Sub3_Sub2_4302.aLong9586);
		} else {
			bytebuffer.put(is, i_43_, i_44_ * anInt10121);
			IDirect3DTexture.Upload(aLong4306, 0, 0, 0, anInt10122, anInt10121, i_44_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
		}
	}

	Class408_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, Class171 class171, int i, int i_45_, int i_46_, int i_47_) {
		super(class167_sub3_sub2, class155, class171, false, i * i_45_);
		if (!aClass167_Sub3_Sub2_4302.aBool11560) {
			anInt10122 = Class528.method6434(i, -1693231459);
			anInt10121 = Class528.method6434(i_45_, -1951501399);
			aFloat10123 = (float) i / (float) anInt10122;
			aFloat10124 = (float) i_45_ / (float) anInt10121;
		} else {
			anInt10122 = i;
			anInt10121 = i_45_;
			aFloat10123 = 1.0F;
			aFloat10124 = 1.0F;
		}
		aLong4306 = (IDirect3DDevice.CreateTexture(aClass167_Sub3_Sub2_4302.aLong11573, anInt10122, anInt10121, 0, i_46_, Class167_Sub3_Sub2.method10618(aClass155_4303, aClass171_4304), i_47_));
	}

	public int method262() {
		return anInt10122;
	}

	public void method279(Class342 class342) {
		super.method274(class342);
	}

	public int method228() {
		return anInt10121;
	}

	public int method234() {
		return anInt10121;
	}

	public float method235(float f) {
		return f / (float) anInt10122;
	}

	public float method227(float f) {
		return f / (float) anInt10122;
	}

	public boolean method237() {
		return true;
	}

	public boolean method238() {
		return true;
	}

	public void method239(boolean bool, boolean bool_48_) {
		aBool10125 = bool;
		aBool10126 = bool_48_;
	}

	public void method241(int i, int i_49_, int i_50_, int i_51_, byte[] is, Class155 class155, int i_52_, int i_53_) {
		if (aClass155_4303 != class155 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_53_ == 0)
			i_53_ = i_50_;
		aClass167_Sub3_Sub2_4302.method8713(i_53_ * i_51_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.put(is, i_52_, i_53_ * i_51_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_49_, i_50_, i_51_, i_53_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public void method248(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		aClass167_Sub3_Sub2_4302.method8713(i_55_ * i_56_ * 4);
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4306, 0, i, i_54_, i_55_, i_56_, i_55_ * 4, 0, aClass167_Sub3_Sub2_4302.aLong9586);
		bytebuffer.asIntBuffer().get(is, i_57_, i_55_ * i_56_);
	}

	public void method242(int i, int i_58_, int i_59_, int i_60_, int[] is, int[] is_61_, int i_62_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_58_, i_59_, i_60_, is, null, i_62_);
	}

	public void method129() {
		super.method131();
	}

	public void method251(int i, int i_63_, int i_64_, int i_65_, int[] is, int[] is_66_, int i_67_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_63_, i_64_, i_65_, is, null, i_67_);
	}

	public void method245(int i, int i_68_, int i_69_, int i_70_, int[] is, int[] is_71_, int i_72_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_68_, i_69_, i_70_, is, null, i_72_);
	}

	public void method229(int i, int i_73_, int i_74_, int i_75_, int[] is, int[] is_76_, int i_77_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		method226(i, i_73_, i_74_, i_75_, is, null, i_77_);
	}

	public void method247(int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
		int[] is = aClass167_Sub3_Sub2_4302.getPixelArea(i_81_, i_82_, i_79_, i_80_);
		if (is != null) {
			for (int i_83_ = 0; i_83_ < is.length; i_83_++)
				is[i_83_] |= ~0xffffff;
			method223(i, i_78_, i_79_, i_80_, is, 0, i_79_);
		}
	}

	public boolean method254() {
		return false;
	}

	public float method249() {
		return aFloat10124;
	}

	public float method250() {
		return aFloat10124;
	}

	public float method225() {
		return aFloat10124;
	}

	public boolean method252() {
		return false;
	}

	public boolean method236() {
		return false;
	}

	public float method255(float f) {
		return f / (float) anInt10121;
	}

	public void method276() {
		aClass167_Sub3_Sub2_4302.method10617(this);
	}

	public void method277() {
		aClass167_Sub3_Sub2_4302.method10617(this);
	}

	public void method278(Class342 class342) {
		super.method274(class342);
	}

	public float method261() {
		return aFloat10123;
	}

	public void method275() {
		aClass167_Sub3_Sub2_4302.method10617(this);
	}

	public void method231(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		int[] is = aClass167_Sub3_Sub2_4302.getPixelArea(i_87_, i_88_, i_85_, i_86_);
		if (is != null) {
			for (int i_89_ = 0; i_89_ < is.length; i_89_++)
				is[i_89_] |= ~0xffffff;
			method223(i, i_84_, i_85_, i_86_, is, 0, i_85_);
		}
	}

	long method4964() {
		return aLong4306;
	}

	long method4965() {
		return aLong4306;
	}

	public float method260() {
		return aFloat10123;
	}

	public float method256(float f) {
		return f / (float) anInt10121;
	}

	public void method258(int i, int i_90_, int i_91_, int i_92_, int[] is, int i_93_, int i_94_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_94_ == 0)
			i_94_ = i_91_;
		aClass167_Sub3_Sub2_4302.method8713(i_94_ * i_92_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_93_, i_94_ * i_92_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_90_, i_91_, i_92_, i_94_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public void method274(Class342 class342) {
		super.method274(class342);
	}

	public void method240(int i, int i_95_, int i_96_, int i_97_, int[] is, int i_98_, int i_99_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_99_ == 0)
			i_99_ = i_96_;
		aClass167_Sub3_Sub2_4302.method8713(i_99_ * i_97_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_98_, i_99_ * i_97_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_95_, i_96_, i_97_, i_99_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	public void method259(int i, int i_100_, int i_101_, int i_102_, int[] is, int i_103_, int i_104_) {
		if (aClass155_4303 != Class155.aClass155_1722 || aClass171_4304 != Class171.aClass171_1905)
			throw new RuntimeException();
		if (i_104_ == 0)
			i_104_ = i_101_;
		aClass167_Sub3_Sub2_4302.method8713(i_104_ * i_102_ * (aClass155_4303.anInt1732 * -2037186451));
		ByteBuffer bytebuffer = aClass167_Sub3_Sub2_4302.aByteBuffer9549;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_103_, i_104_ * i_102_);
		IDirect3DTexture.Upload(aLong4306, 0, i, i_100_, i_101_, i_102_, i_104_ * (aClass155_4303.anInt1732 * -2037186451), 0, aClass167_Sub3_Sub2_4302.aLong9586);
	}

	Class408_Sub2(Class167_Sub3_Sub2 class167_sub3_sub2, Class155 class155, Class171 class171, int i, int i_105_) {
		this(class167_sub3_sub2, class155, class171, i, i_105_, 0, 1);
	}

	public float method246() {
		return aFloat10123;
	}

	public float method233() {
		return aFloat10123;
	}
}
