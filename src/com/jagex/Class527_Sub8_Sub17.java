/* Class527_Sub8_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub17 extends Class527_Sub8 {
	public boolean aBool11819 = true;
	int[][] anIntArrayArray11820;
	int[] anIntArray11821;
	String[] aStringArray11822;
	public int[] anIntArray11823;
	Class51 aClass51_11824;

	void method18400() {
		if (null != anIntArray11823) {
			for (int i = 0; i < anIntArray11823.length; i++)
				anIntArray11823[i] |= 0x8000;
		}
	}

	void method18401(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method18404(class527_sub38, i_0_, (byte) 1);
		}
	}

	void method18402(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method18404(class527_sub38, i, (byte) 1);
		}
	}

	public void method18403(RSByteBuffer class527_sub38, int[] is, int i) {
		if (anIntArray11821 != null) {
			for (int i_1_ = 0; i_1_ < anIntArray11821.length && i_1_ < is.length; i_1_++) {
				int i_2_ = method18407(i_1_, 1644327392).anInt8098 * -1839233031;
				if (i_2_ > 0)
					class527_sub38.method16431((long) is[i_1_], i_2_, -1188951653);
			}
		}
	}

	void method18404(RSByteBuffer class527_sub38, int i, byte i_3_) {
		if (i == 1)
			aStringArray11822 = Class592.method9875(class527_sub38.readString(1923658654), '<', (short) -4178);
		else if (2 == i) {
			int i_4_ = class527_sub38.readUnsignedByte();
			anIntArray11823 = new int[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				anIntArray11823[i_5_] = class527_sub38.readUnsignedShort();
		} else if (i == 3) {
			int i_6_ = class527_sub38.readUnsignedByte();
			anIntArray11821 = new int[i_6_];
			anIntArrayArray11820 = new int[i_6_][];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				int i_8_ = class527_sub38.readUnsignedShort();
				Class618 class618 = Class205.method3834(i_8_, (short) 11201);
				if (null != class618) {
					anIntArray11821[i_7_] = i_8_;
					anIntArrayArray11820[i_7_] = new int[class618.anInt8110 * -55555535];
					for (int i_9_ = 0; i_9_ < class618.anInt8110 * -55555535; i_9_++)
						anIntArrayArray11820[i_7_][i_9_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool11819 = false;
	}

	public String method18405(byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11822 == null)
			return "";
		stringbuilder.append(aStringArray11822[0]);
		for (int i_10_ = 1; i_10_ < aStringArray11822.length; i_10_++) {
			for (int i_11_ = 0; i_11_ < 3; i_11_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11822[i_10_]);
		}
		return stringbuilder.toString();
	}

	public int method18406(int i) {
		if (anIntArray11821 == null)
			return 0;
		return anIntArray11821.length;
	}

	public Class618 method18407(int i, int i_12_) {
		if (null == anIntArray11821 || i < 0 || i > anIntArray11821.length)
			return null;
		return Class205.method3834(anIntArray11821[i], (short) 14624);
	}

	Class527_Sub8_Sub17() {
		/* empty */
	}

	void method18408(int i) {
		if (null != anIntArray11823) {
			for (int i_13_ = 0; i_13_ < anIntArray11823.length; i_13_++)
				anIntArray11823[i_13_] |= 0x8000;
		}
	}

	public String method18409(RSByteBuffer class527_sub38, int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (anIntArray11821 != null) {
			for (int i_14_ = 0; i_14_ < anIntArray11821.length; i_14_++) {
				stringbuilder.append(aStringArray11822[i_14_]);
				stringbuilder.append(aClass51_11824.method1279(method18407(i_14_, -603354162), anIntArrayArray11820[i_14_], class527_sub38.method16454((Class205.method3834(anIntArray11821[i_14_], (short) 14176).anInt8099) * -1605897851, 388137440)));
			}
		}
		stringbuilder.append(aStringArray11822[aStringArray11822.length - 1]);
		return stringbuilder.toString();
	}

	void method18410(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method18404(class527_sub38, i, (byte) 1);
		}
	}

	void method18411(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method18404(class527_sub38, i, (byte) 1);
		}
	}

	void method18412(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			aStringArray11822 = Class592.method9875(class527_sub38.readString(1726919779), '<', (short) -24275);
		else if (2 == i) {
			int i_15_ = class527_sub38.readUnsignedByte();
			anIntArray11823 = new int[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				anIntArray11823[i_16_] = class527_sub38.readUnsignedShort();
		} else if (i == 3) {
			int i_17_ = class527_sub38.readUnsignedByte();
			anIntArray11821 = new int[i_17_];
			anIntArrayArray11820 = new int[i_17_][];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				int i_19_ = class527_sub38.readUnsignedShort();
				Class618 class618 = Class205.method3834(i_19_, (short) 18088);
				if (null != class618) {
					anIntArray11821[i_18_] = i_19_;
					anIntArrayArray11820[i_18_] = new int[class618.anInt8110 * -55555535];
					for (int i_20_ = 0; i_20_ < class618.anInt8110 * -55555535; i_20_++)
						anIntArrayArray11820[i_18_][i_20_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool11819 = false;
	}

	public Class618 method18413(int i) {
		if (null == anIntArray11821 || i < 0 || i > anIntArray11821.length)
			return null;
		return Class205.method3834(anIntArray11821[i], (short) 21407);
	}

	public void method18414(RSByteBuffer class527_sub38, int[] is) {
		if (anIntArray11821 != null) {
			for (int i = 0; i < anIntArray11821.length && i < is.length; i++) {
				int i_21_ = method18407(i, 2104942453).anInt8098 * -1839233031;
				if (i_21_ > 0)
					class527_sub38.method16431((long) is[i], i_21_, -1204118820);
			}
		}
	}

	void method18415(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			aStringArray11822 = Class592.method9875(class527_sub38.readString(1549228702), '<', (short) -9774);
		else if (2 == i) {
			int i_22_ = class527_sub38.readUnsignedByte();
			anIntArray11823 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
				anIntArray11823[i_23_] = class527_sub38.readUnsignedShort();
		} else if (i == 3) {
			int i_24_ = class527_sub38.readUnsignedByte();
			anIntArray11821 = new int[i_24_];
			anIntArrayArray11820 = new int[i_24_][];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
				int i_26_ = class527_sub38.readUnsignedShort();
				Class618 class618 = Class205.method3834(i_26_, (short) 28260);
				if (null != class618) {
					anIntArray11821[i_25_] = i_26_;
					anIntArrayArray11820[i_25_] = new int[class618.anInt8110 * -55555535];
					for (int i_27_ = 0; i_27_ < class618.anInt8110 * -55555535; i_27_++)
						anIntArrayArray11820[i_25_][i_27_] = class527_sub38.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool11819 = false;
	}

	public String method18416() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (aStringArray11822 == null)
			return "";
		stringbuilder.append(aStringArray11822[0]);
		for (int i = 1; i < aStringArray11822.length; i++) {
			for (int i_28_ = 0; i_28_ < 3; i_28_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11822[i]);
		}
		return stringbuilder.toString();
	}

	public int method18417() {
		if (anIntArray11821 == null)
			return 0;
		return anIntArray11821.length;
	}

	public int method18418() {
		if (anIntArray11821 == null)
			return 0;
		return anIntArray11821.length;
	}

	public int method18419() {
		if (anIntArray11821 == null)
			return 0;
		return anIntArray11821.length;
	}

	public Class618 method18420(int i) {
		if (null == anIntArray11821 || i < 0 || i > anIntArray11821.length)
			return null;
		return Class205.method3834(anIntArray11821[i], (short) 28313);
	}

	public Class618 method18421(int i) {
		if (null == anIntArray11821 || i < 0 || i > anIntArray11821.length)
			return null;
		return Class205.method3834(anIntArray11821[i], (short) 6239);
	}

	public void method18422(RSByteBuffer class527_sub38, int[] is) {
		if (anIntArray11821 != null) {
			for (int i = 0; i < anIntArray11821.length && i < is.length; i++) {
				int i_29_ = method18407(i, -434549193).anInt8098 * -1839233031;
				if (i_29_ > 0)
					class527_sub38.method16431((long) is[i], i_29_, -1835293025);
			}
		}
	}

	public int method18423(int i, int i_30_, int i_31_) {
		if (null == anIntArray11821 || i < 0 || i > anIntArray11821.length)
			return -1;
		if (null == anIntArrayArray11820[i] || i_30_ < 0 || i_30_ > anIntArrayArray11820[i].length)
			return -1;
		return anIntArrayArray11820[i][i_30_];
	}

	void method18424() {
		if (null != anIntArray11823) {
			for (int i = 0; i < anIntArray11823.length; i++)
				anIntArray11823[i] |= 0x8000;
		}
	}
}
