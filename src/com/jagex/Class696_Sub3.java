/* Class696_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub3 extends Class696 {
	Class442 aClass442_10917;
	Class442 aClass442_10918 = new Class442();
	boolean aBool10919;
	Class442 aClass442_10920 = new Class442(Float.NaN, Float.NaN, Float.NaN);
	Interface32 anInterface32_10921;
	Class442 aClass442_10922;

	public Class442 method14254() {
		Class442 class442 = Class442.method7139(aClass442_10920);
		Class442 class442_0_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_0_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_0_);
		class442_0_.method7141();
		return class442;
	}

	public Class442 method14258() {
		Class442 class442 = Class442.method7139(aClass442_10917);
		Class442 class442_1_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_1_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_1_);
		class442_1_.method7141();
		return class442;
	}

	public void method17226() {
		if (anInterface32_10921 != null)
			anInterface32_10921 = (aClass296_8753.method5374(-1957514241).method173(anInterface32_10921.method202((short) 18344), anInterface32_10921.method200((byte) -91), -72448902));
	}

	public void method14250(float f, int i) {
		if (null != anInterface32_10921) {
			aClass442_10917.method7146(anInterface32_10921.method189((byte) 0).method16385(1515391809));
			aClass296_8753.method5344(false, f, aClass442_10920, aClass296_8753.method5384(1204629488), aClass442_10917, aClass442_10922, 1967520754);
		}
	}

	public boolean method14244(int i) {
		return !Float.isNaN(aClass442_10920.aFloat4918);
	}

	public void method14243(Class302 class302, Class432 class432, int i, int i_2_, float f, int i_3_) {
		Class442 class442 = Class442.method7139(aClass296_8753.method5377(-357113980));
		class442.aFloat4918 -= (float) i;
		class442.aFloat4919 -= (float) i_2_;
		class442.aFloat4915 *= -1.0F;
		Class442 class442_4_ = method14245((byte) 43);
		class442_4_.aFloat4918 -= (float) i;
		class442_4_.aFloat4919 -= (float) i_2_;
		class442_4_.aFloat4915 *= -1.0F;
		class432.method6945((double) class442.aFloat4918, (double) class442.aFloat4915, (double) class442.aFloat4919, (double) class442_4_.aFloat4918, (double) class442_4_.aFloat4915, (double) class442_4_.aFloat4919, 0.0F, 1.0F, 0.0F);
		class442.method7141();
		class442_4_.method7141();
	}

	public Class442 method17227() {
		return aClass442_10920;
	}

	public Class442 method14246(byte i) {
		Class442 class442 = Class442.method7139(aClass442_10917);
		Class442 class442_5_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_5_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_5_);
		class442_5_.method7141();
		return class442;
	}

	public Class696_Sub3(Class296 class296) {
		super(class296);
		aClass442_10917 = new Class442(Float.NaN, Float.NaN, Float.NaN);
		aClass442_10922 = new Class442();
	}

	public void method14248(RSByteBuffer class527_sub38, int i) {
		Class289 class289 = Class37.method1143(class527_sub38.readUnsignedByte(), -1324001523);
		int i_6_ = class527_sub38.readUnsignedShort();
		anInterface32_10921 = aClass296_8753.method5374(-1797205337).method173(class289, i_6_, 1050524061);
		aClass442_10918.method7144(class527_sub38);
		if (class527_sub38.readUnsignedByte() == 1)
			aBool10919 = true;
		else
			aBool10919 = false;
	}

	public void method14249(float f) {
		if (null != anInterface32_10921) {
			aClass442_10917.method7146(anInterface32_10921.method189((byte) 0).method16385(-1640893546));
			aClass296_8753.method5344(false, f, aClass442_10920, aClass296_8753.method5384(1204629488), aClass442_10917, aClass442_10922, 1801399501);
		}
	}

	public boolean method14247() {
		return !Float.isNaN(aClass442_10920.aFloat4918);
	}

	public boolean method14252() {
		return !Float.isNaN(aClass442_10920.aFloat4918);
	}

	public Class442 method14255() {
		Class442 class442 = Class442.method7139(aClass442_10920);
		Class442 class442_7_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_7_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_7_);
		class442_7_.method7141();
		return class442;
	}

	public Class442 method14253() {
		Class442 class442 = Class442.method7139(aClass442_10920);
		Class442 class442_8_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_8_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_8_);
		class442_8_.method7141();
		return class442;
	}

	public void method17228(Interface32 interface32, Class442 class442, boolean bool, int i) {
		anInterface32_10921 = interface32;
		aClass442_10918.method7146(class442);
		aBool10919 = bool;
		interface32.method189((byte) 0);
	}

	public void method14257(Class302 class302, Class432 class432, int i, int i_9_, float f) {
		Class442 class442 = Class442.method7139(aClass296_8753.method5377(-1890682651));
		class442.aFloat4918 -= (float) i;
		class442.aFloat4919 -= (float) i_9_;
		class442.aFloat4915 *= -1.0F;
		Class442 class442_10_ = method14245((byte) 77);
		class442_10_.aFloat4918 -= (float) i;
		class442_10_.aFloat4919 -= (float) i_9_;
		class442_10_.aFloat4915 *= -1.0F;
		class432.method6945((double) class442.aFloat4918, (double) class442.aFloat4915, (double) class442.aFloat4919, (double) class442_10_.aFloat4918, (double) class442_10_.aFloat4915, (double) class442_10_.aFloat4919, 0.0F, 1.0F, 0.0F);
		class442.method7141();
		class442_10_.method7141();
	}

	public Class442 method14256() {
		Class442 class442 = Class442.method7139(aClass442_10920);
		Class442 class442_11_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_11_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_11_);
		class442_11_.method7141();
		return class442;
	}

	public Class442 method14251() {
		Class442 class442 = Class442.method7139(aClass442_10917);
		Class442 class442_12_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_12_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_12_);
		class442_12_.method7141();
		return class442;
	}

	public Class442 method17229(byte i) {
		return aClass442_10920;
	}

	public void method14259(RSByteBuffer class527_sub38) {
		Class289 class289 = Class37.method1143(class527_sub38.readUnsignedByte(), -1324001523);
		int i = class527_sub38.readUnsignedShort();
		anInterface32_10921 = aClass296_8753.method5374(1082824256).method173(class289, i, -1031603081);
		aClass442_10918.method7144(class527_sub38);
		if (class527_sub38.readUnsignedByte() == 1)
			aBool10919 = true;
		else
			aBool10919 = false;
	}

	public void method14260(RSByteBuffer class527_sub38) {
		Class289 class289 = Class37.method1143(class527_sub38.readUnsignedByte(), -1324001523);
		int i = class527_sub38.readUnsignedShort();
		anInterface32_10921 = aClass296_8753.method5374(668291085).method173(class289, i, -1067466367);
		aClass442_10918.method7144(class527_sub38);
		if (class527_sub38.readUnsignedByte() == 1)
			aBool10919 = true;
		else
			aBool10919 = false;
	}

	public void method17230(Interface32 interface32, Class442 class442, boolean bool) {
		anInterface32_10921 = interface32;
		aClass442_10918.method7146(class442);
		aBool10919 = bool;
		interface32.method189((byte) 0);
	}

	public void method17231(Interface32 interface32, Class442 class442, boolean bool) {
		anInterface32_10921 = interface32;
		aClass442_10918.method7146(class442);
		aBool10919 = bool;
		interface32.method189((byte) 0);
	}

	public void method17232() {
		if (anInterface32_10921 != null)
			anInterface32_10921 = (aClass296_8753.method5374(-600239971).method173(anInterface32_10921.method202((short) 19037), anInterface32_10921.method200((byte) -45), 1422032721));
	}

	public Class442 method14245(byte i) {
		Class442 class442 = Class442.method7139(aClass442_10920);
		Class442 class442_13_ = Class442.method7139(aClass442_10918);
		if (aBool10919)
			class442_13_.method7157(anInterface32_10921.method195(1652676897));
		class442.method7219(class442_13_);
		class442_13_.method7141();
		return class442;
	}

	public void method17233(int i) {
		if (anInterface32_10921 != null)
			anInterface32_10921 = (aClass296_8753.method5374(-1558206979).method173(anInterface32_10921.method202((short) 18301), anInterface32_10921.method200((byte) -38), 151233304));
	}

	public Class442 method17234() {
		return aClass442_10920;
	}

	public Class442 method17235() {
		return aClass442_10920;
	}

	public Class442 method17236() {
		return aClass442_10920;
	}
}
