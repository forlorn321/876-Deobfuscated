/* Class458_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class458_Sub3 extends Class458 {
	Object method5496(Class153 class153) {
		if (Class453.aClass453_5008 == class153.aClass453_1716 || Class453.aClass453_4955 == class153.aClass453_1716)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(924237168);
	}

	Object method5494(Class153 class153, int i) {
		if (Class453.aClass453_5008 == class153.aClass453_1716 || Class453.aClass453_4955 == class153.aClass453_1716)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(-1238387812);
	}

	Object method5495(Class153 class153) {
		if (Class453.aClass453_5008 == class153.aClass453_1716 || Class453.aClass453_4955 == class153.aClass453_1716)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(1892211810);
	}

	Class458_Sub3(Class648 class648, int i, boolean bool, boolean bool_0_) {
		super(class648, i, bool, bool_0_);
	}

	static void method9357(byte i) {
		if (Class47.aClass678_578 != Class678.aClass678_8616)
			Class412.aClass412_4385.method5009((byte) 106);
	}

	static RSByteBuffer method9358(byte i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(518);
		Class234.anIntArray2380 = new int[4];
		Class234.anIntArray2380[0] = (int) (Math.random() * 9.9999999E7);
		Class234.anIntArray2380[1] = (int) (Math.random() * 9.9999999E7);
		Class234.anIntArray2380[2] = (int) (Math.random() * 9.9999999E7);
		Class234.anIntArray2380[3] = (int) (Math.random() * 9.9999999E7);
		class536_sub33.writeByte(10);
		class536_sub33.writeInt(Class234.anIntArray2380[0]);
		class536_sub33.writeInt(Class234.anIntArray2380[1]);
		class536_sub33.writeInt(Class234.anIntArray2380[2]);
		class536_sub33.writeInt(Class234.anIntArray2380[3]);
		return class536_sub33;
	}

	public static Class536_Sub23 method9359(int i) {
		Class536_Sub23 class536_sub23 = Class144.method1795(-2071625918);
		class536_sub23.aClass414_10529 = null;
		class536_sub23.anInt10527 = 0;
		class536_sub23.aClass536_Sub33_Sub2_10528 = new Class536_Sub33_Sub2(5000);
		return class536_sub23;
	}
}
