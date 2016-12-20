/* Class416_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class416_Sub1 extends Class416 implements Interface38 {
	float aFloat10171;
	int anInt10172;
	float aFloat10173;
	int anInt10174;
	boolean aBool10175;
	boolean aBool10176;

	public void method223(int i, int i_0_, int i_1_, int i_2_, byte[] is, Class157 class157, int i_3_, int i_4_) {
		if (aClass157_4514 != class157 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_4_ == 0)
			i_4_ = i_1_;
		aClass180_Sub2_Sub2_4516.method15097(i_4_ * i_2_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is, i_3_, i_4_ * i_2_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_0_, i_1_, i_2_, i_4_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	Class416_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, Class184 class184, int i, int i_5_, int i_6_, int i_7_) {
		super(class180_sub2_sub2, class157, class184, false, i * i_5_);
		if (!aClass180_Sub2_Sub2_4516.aBool11599) {
			anInt10174 = Class186.method3652(i, -1292596260);
			anInt10172 = Class186.method3652(i_5_, 1793320613);
			aFloat10171 = (float) i / (float) anInt10174;
			aFloat10173 = (float) i_5_ / (float) anInt10172;
		} else {
			anInt10174 = i;
			anInt10172 = i_5_;
			aFloat10171 = 1.0F;
			aFloat10173 = 1.0F;
		}
		aLong4518 = (IDirect3DDevice.CreateTexture(aClass180_Sub2_Sub2_4516.aLong11572, anInt10174, anInt10172, 0, i_6_, Class180_Sub2_Sub2.method18096(aClass157_4514, aClass184_4515), i_7_));
	}

	public void method249(int i, int i_8_, int i_9_, int i_10_, byte[] is, Class157 class157, int i_11_, int i_12_) {
		if (aClass157_4514 != class157 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_12_ == 0)
			i_12_ = i_9_;
		aClass180_Sub2_Sub2_4516.method15097(i_12_ * i_10_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is, i_11_, i_12_ * i_10_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_8_, i_9_, i_10_, i_12_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	Class416_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, int i, int i_13_, boolean bool, byte[] is, int i_14_, int i_15_) {
		super(class180_sub2_sub2, class157, Class184.aClass184_2104, bool && class180_sub2_sub2.aBool11606, i * i_13_);
		if (!aClass180_Sub2_Sub2_4516.aBool11599) {
			anInt10174 = Class186.method3652(i, 1449958605);
			anInt10172 = Class186.method3652(i_13_, -1513323792);
			aFloat10171 = (float) i / (float) anInt10174;
			aFloat10173 = (float) i_13_ / (float) anInt10172;
			if (i != anInt10174 || i_13_ != anInt10172) {
				is = aClass180_Sub2_Sub2_4516.method3288(i, i_13_, anInt10174, anInt10172, is, i_14_, i_15_, (class157.anInt1722 * -1216378097), -1311081757);
				i_14_ = 0;
				i_15_ = anInt10174;
			}
		} else {
			anInt10174 = i;
			anInt10172 = i_13_;
			aFloat10171 = 1.0F;
			aFloat10173 = 1.0F;
		}
		if (bool)
			aLong4518 = (IDirect3DDevice.CreateTexture(aClass180_Sub2_Sub2_4516.aLong11572, anInt10174, anInt10172, 0, 1024, Class180_Sub2_Sub2.method18096(aClass157_4514, Class184.aClass184_2104), 1));
		else
			aLong4518 = (IDirect3DDevice.CreateTexture(aClass180_Sub2_Sub2_4516.aLong11572, anInt10174, anInt10172, 1, 0, Class180_Sub2_Sub2.method18096(aClass157_4514, Class184.aClass184_2104), 1));
		if (i_15_ == 0)
			i_15_ = anInt10174;
		aClass180_Sub2_Sub2_4516.method15097(i_15_ * anInt10172 * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		if (aClass157_4514 == Class157.aClass157_1733) {
			bytebuffer.put(is, i_14_, anInt10172 * anInt10174 / 2);
			IDirect3DTexture.Upload(aLong4518, 0, 0, 0, anInt10174, anInt10172 / 4, anInt10174 / 4 * 8, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		} else if (aClass157_4514 == Class157.aClass157_1731) {
			bytebuffer.put(is, i_14_, anInt10172 * anInt10174);
			IDirect3DTexture.Upload(aLong4518, 0, 0, 0, anInt10174, anInt10172 / 4, anInt10174 / 4 * 16, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		} else {
			bytebuffer.put(is, i_14_, i_15_ * anInt10172);
			IDirect3DTexture.Upload(aLong4518, 0, 0, 0, anInt10174, anInt10172, i_15_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
		}
	}

	public void method227(int i, int i_16_, int i_17_, int i_18_, int[] is, int i_19_, int i_20_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_20_ == 0)
			i_20_ = i_17_;
		aClass180_Sub2_Sub2_4516.method15097(i_20_ * i_18_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_19_, i_20_ * i_18_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_16_, i_17_, i_18_, i_20_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public int method1() {
		return anInt10174;
	}

	public int method87() {
		return anInt10172;
	}

	public float method224(float f) {
		return f / (float) anInt10174;
	}

	public float method264(float f) {
		return f / (float) anInt10172;
	}

	public void method267(boolean bool, boolean bool_21_) {
		aBool10175 = bool;
		aBool10176 = bool_21_;
	}

	public boolean method236() {
		return false;
	}

	public boolean method207() {
		return true;
	}

	long method6642() {
		return aLong4518;
	}

	public void method273(Class343 class343) {
		super.method273(class343);
	}

	public void method226(boolean bool, boolean bool_22_) {
		aBool10175 = bool;
		aBool10176 = bool_22_;
	}

	public float method261() {
		return aFloat10173;
	}

	public void method228(int i, int i_23_, int i_24_, int i_25_, byte[] is, Class157 class157, int i_26_, int i_27_) {
		if (aClass157_4514 != class157 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_27_ == 0)
			i_27_ = i_24_;
		aClass180_Sub2_Sub2_4516.method15097(i_27_ * i_25_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is, i_26_, i_27_ * i_25_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_23_, i_24_, i_25_, i_27_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method229(int i, int i_28_, int i_29_, int i_30_, int[] is, int i_31_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_29_ * i_30_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_28_, i_29_, i_30_, i_29_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_31_, i_29_ * i_30_);
	}

	public void method230(int i, int i_32_, int i_33_, int i_34_, int[] is, int[] is_35_, int i_36_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		method230(i, i_32_, i_33_, i_34_, is, null, i_36_);
	}

	public void method256(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		int[] is = aClass180_Sub2_Sub2_4516.method3113(i_40_, i_41_, i_38_, i_39_);
		if (is != null) {
			for (int i_42_ = 0; i_42_ < is.length; i_42_++)
				is[i_42_] |= ~0xffffff;
			method227(i, i_37_, i_38_, i_39_, is, 0, i_38_);
		}
	}

	public void method277() {
		aClass180_Sub2_Sub2_4516.method18087(this);
	}

	public boolean method260() {
		return false;
	}

	Class416_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, int i, int i_43_, boolean bool, int[] is, int i_44_, int i_45_) {
		super(class180_sub2_sub2, Class157.aClass157_1723, Class184.aClass184_2104, bool && class180_sub2_sub2.aBool11606, i * i_43_);
		if (!aClass180_Sub2_Sub2_4516.aBool11599) {
			anInt10174 = Class186.method3652(i, -1381277480);
			anInt10172 = Class186.method3652(i_43_, -736311421);
			aFloat10171 = (float) i / (float) anInt10174;
			aFloat10173 = (float) i_43_ / (float) anInt10172;
			if (i != anInt10174 || i_43_ != anInt10172) {
				is = aClass180_Sub2_Sub2_4516.method3212(i, i_43_, anInt10174, anInt10172, is, i_44_, i_45_, (byte) 84);
				i_44_ = 0;
				i_45_ = anInt10174;
			}
		} else {
			anInt10174 = i;
			anInt10172 = i_43_;
			aFloat10171 = 1.0F;
			aFloat10173 = 1.0F;
		}
		if (bool)
			aLong4518 = IDirect3DDevice.CreateTexture((aClass180_Sub2_Sub2_4516.aLong11572), anInt10174, anInt10172, 0, 1024, 21, 1);
		else
			aLong4518 = IDirect3DDevice.CreateTexture((aClass180_Sub2_Sub2_4516.aLong11572), anInt10174, anInt10172, 1, 0, 21, 1);
		if (i_45_ == 0)
			i_45_ = anInt10174;
		aClass180_Sub2_Sub2_4516.method15097(i_45_ * anInt10172 * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_44_, i_45_ * anInt10172);
		IDirect3DTexture.Upload(aLong4518, 0, 0, 0, anInt10174, anInt10172, i_45_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method231(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		int[] is = aClass180_Sub2_Sub2_4516.method3113(i_49_, i_50_, i_47_, i_48_);
		if (is != null) {
			for (int i_51_ = 0; i_51_ < is.length; i_51_++)
				is[i_51_] |= ~0xffffff;
			method227(i, i_46_, i_47_, i_48_, is, 0, i_47_);
		}
	}

	Class416_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, int i, int i_52_, boolean bool, float[] fs, int i_53_, int i_54_) {
		super(class180_sub2_sub2, class157, Class184.aClass184_2104, bool && class180_sub2_sub2.aBool11606, i * i_52_);
		if (!aClass180_Sub2_Sub2_4516.aBool11599) {
			anInt10174 = Class186.method3652(i, 496958150);
			anInt10172 = Class186.method3652(i_52_, 122827283);
			aFloat10171 = (float) i / (float) anInt10174;
			aFloat10173 = (float) i_52_ / (float) anInt10172;
			if (i != anInt10174 || i_52_ != anInt10172) {
				fs = aClass180_Sub2_Sub2_4516.method3213(i, i_52_, anInt10174, anInt10172, fs, i_53_, i_54_, (class157.anInt1722 * -1216378097), 219988697);
				i_53_ = 0;
				i_54_ = anInt10174;
			}
		} else {
			anInt10174 = i;
			anInt10172 = i_52_;
			aFloat10171 = 1.0F;
			aFloat10173 = 1.0F;
		}
		if (bool)
			aLong4518 = (IDirect3DDevice.CreateTexture(aClass180_Sub2_Sub2_4516.aLong11572, anInt10174, anInt10172, 0, 1024, Class180_Sub2_Sub2.method18096(aClass157_4514, Class184.aClass184_2109), 1));
		else
			aLong4518 = (IDirect3DDevice.CreateTexture(aClass180_Sub2_Sub2_4516.aLong11572, anInt10174, anInt10172, 1, 0, Class180_Sub2_Sub2.method18096(aClass157_4514, Class184.aClass184_2109), 1));
		if (i_54_ == 0)
			i_54_ = anInt10174;
		aClass180_Sub2_Sub2_4516.method15097(i_54_ * anInt10172 * (aClass157_4514.anInt1722 * -1216378097) * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_53_, (i_54_ * anInt10172 * (aClass157_4514.anInt1722 * -1216378097)));
		IDirect3DTexture.Upload(aLong4518, 0, 0, 0, anInt10174, anInt10172, i_54_ * (aClass157_4514.anInt1722 * -1216378097) * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public int method72() {
		return anInt10174;
	}

	public int method62() {
		return anInt10172;
	}

	public int method237() {
		return anInt10172;
	}

	public int method238() {
		return anInt10172;
	}

	public int method239() {
		return anInt10172;
	}

	public float method233() {
		return aFloat10171;
	}

	public int method187() {
		return anInt10172;
	}

	public float method262() {
		return aFloat10171;
	}

	public float method242(float f) {
		return f / (float) anInt10172;
	}

	Class416_Sub1(Class180_Sub2_Sub2 class180_sub2_sub2, Class157 class157, Class184 class184, int i, int i_55_) {
		this(class180_sub2_sub2, class157, class184, i, i_55_, 0, 1);
	}

	public void method275() {
		aClass180_Sub2_Sub2_4516.method18087(this);
	}

	public boolean method245() {
		return true;
	}

	public boolean method246() {
		return true;
	}

	public void method247(int i, int i_56_, int i_57_, int i_58_, int[] is, int i_59_, int i_60_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_60_ == 0)
			i_60_ = i_57_;
		aClass180_Sub2_Sub2_4516.method15097(i_60_ * i_58_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_59_, i_60_ * i_58_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_56_, i_57_, i_58_, i_60_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method253(int i, int i_61_, int i_62_, int i_63_, int[] is, int i_64_, int i_65_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_65_ == 0)
			i_65_ = i_62_;
		aClass180_Sub2_Sub2_4516.method15097(i_65_ * i_63_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_64_, i_65_ * i_63_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_61_, i_62_, i_63_, i_65_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method248(int i, int i_66_, int i_67_, int i_68_, int[] is, int i_69_, int i_70_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_70_ == 0)
			i_70_ = i_67_;
		aClass180_Sub2_Sub2_4516.method15097(i_70_ * i_68_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_69_, i_70_ * i_68_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_66_, i_67_, i_68_, i_70_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public float method241(float f) {
		return f / (float) anInt10174;
	}

	public void method129() {
		super.method129();
	}

	public void method252(int i, int i_71_, int i_72_, int i_73_, byte[] is, Class157 class157, int i_74_, int i_75_) {
		if (aClass157_4514 != class157 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_75_ == 0)
			i_75_ = i_72_;
		aClass180_Sub2_Sub2_4516.method15097(i_75_ * i_73_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is, i_74_, i_75_ * i_73_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_71_, i_72_, i_73_, i_75_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method225(int i, int i_76_, int i_77_, int i_78_, byte[] is, Class157 class157, int i_79_, int i_80_) {
		if (aClass157_4514 != class157 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		if (i_80_ == 0)
			i_80_ = i_77_;
		aClass180_Sub2_Sub2_4516.method15097(i_80_ * i_78_ * (aClass157_4514.anInt1722 * -1216378097));
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		bytebuffer.put(is, i_79_, i_80_ * i_78_);
		IDirect3DTexture.Upload(aLong4518, 0, i, i_76_, i_77_, i_78_, i_80_ * (aClass157_4514.anInt1722 * -1216378097), 0, aClass180_Sub2_Sub2_4516.aLong9439);
	}

	public void method254(int i, int i_81_, int i_82_, int i_83_, int[] is, int[] is_84_, int i_85_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		method230(i, i_81_, i_82_, i_83_, is, null, i_85_);
	}

	public void method232(int i, int i_86_, int i_87_, int i_88_, int[] is, int[] is_89_, int i_90_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		method230(i, i_86_, i_87_, i_88_, is, null, i_90_);
	}

	public void method266(int i, int i_91_, int i_92_, int i_93_, int[] is, int i_94_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_92_ * i_93_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_91_, i_92_, i_93_, i_92_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_94_, i_92_ * i_93_);
	}

	public float method257() {
		return aFloat10171;
	}

	public boolean method240() {
		return false;
	}

	public float method259() {
		return aFloat10173;
	}

	public void method258(int i, int i_95_, int i_96_, int i_97_, int[] is, int i_98_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_96_ * i_97_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_95_, i_96_, i_97_, i_96_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_98_, i_96_ * i_97_);
	}

	public void method130() {
		super.method129();
	}

	public boolean method244() {
		return true;
	}

	public void method250(int i, int i_99_, int i_100_, int i_101_, int[] is, int i_102_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_100_ * i_101_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_99_, i_100_, i_101_, i_100_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_102_, i_100_ * i_101_);
	}

	public float method255() {
		return aFloat10173;
	}

	public void method276() {
		aClass180_Sub2_Sub2_4516.method18087(this);
	}

	public void method274(Class343 class343) {
		super.method273(class343);
	}

	long method6650() {
		return aLong4518;
	}

	long method6651() {
		return aLong4518;
	}

	public void method251(int i, int i_103_, int i_104_, int i_105_, int[] is, int i_106_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_104_ * i_105_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_103_, i_104_, i_105_, i_104_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_106_, i_104_ * i_105_);
	}

	public int method263() {
		return anInt10172;
	}

	public float method243(float f) {
		return f / (float) anInt10172;
	}

	public int method235() {
		return anInt10174;
	}

	public void method234(int i, int i_107_, int i_108_, int i_109_, int[] is, int i_110_) {
		if (aClass157_4514 != Class157.aClass157_1723 || aClass184_4515 != Class184.aClass184_2104)
			throw new RuntimeException();
		aClass180_Sub2_Sub2_4516.method15097(i_108_ * i_109_ * 4);
		ByteBuffer bytebuffer = aClass180_Sub2_Sub2_4516.aByteBuffer9438;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4518, 0, i, i_107_, i_108_, i_109_, i_108_ * 4, 0, aClass180_Sub2_Sub2_4516.aLong9439);
		bytebuffer.asIntBuffer().get(is, i_110_, i_108_ * i_109_);
	}

	public float method222() {
		return aFloat10173;
	}

	public void method268(boolean bool, boolean bool_111_) {
		aBool10175 = bool;
		aBool10176 = bool_111_;
	}

	public void method265(boolean bool, boolean bool_112_) {
		aBool10175 = bool;
		aBool10176 = bool_112_;
	}
}
