/* Class536_Sub18_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub10 extends Class536_Sub18 {
	int[][] anIntArrayArray11720;
	public boolean aBool11721 = true;
	int[] anIntArray11722;
	Class32 aClass32_11723;
	public int[] anIntArray11724;
	String[] aStringArray11725;

	void method10708() {
		if (null != anIntArray11724) {
			for (int i = 0; i < anIntArray11724.length; i++)
				anIntArray11724[i] |= 0x8000;
		}
	}

	void method10709(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(1624720683);
			if (i_0_ == 0)
				break;
			method10710(class536_sub33, i_0_, -713406020);
		}
	}

	void method10710(RSByteBuffer class536_sub33, int i, int i_1_) {
		if (1 == i)
			aStringArray11725 = Class344.method4483(class536_sub33.readString(), '<', (byte) -38);
		else if (i == 2) {
			int i_2_ = class536_sub33.readUnsignedByte(859398782);
			anIntArray11724 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				anIntArray11724[i_3_] = class536_sub33.readUnsignedShort();
		} else if (3 == i) {
			int i_4_ = class536_sub33.readUnsignedByte(-1497156000);
			anIntArray11722 = new int[i_4_];
			anIntArrayArray11720 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				int i_6_ = class536_sub33.readUnsignedShort();
				Class614 class614 = Class55.method950(i_6_, (byte) -50);
				if (class614 != null) {
					anIntArray11722[i_5_] = i_6_;
					anIntArrayArray11720[i_5_] = new int[class614.anInt8031 * -1771725915];
					for (int i_7_ = 0; i_7_ < class614.anInt8031 * -1771725915; i_7_++)
						anIntArrayArray11720[i_5_][i_7_] = class536_sub33.readUnsignedShort();
				}
			}
		} else if (i == 4)
			aBool11721 = false;
	}

	public void method10711(RSByteBuffer class536_sub33, int[] is, byte i) {
		if (null != anIntArray11722) {
			for (int i_8_ = 0; i_8_ < anIntArray11722.length && i_8_ < is.length; i_8_++) {
				int i_9_ = method10721(i_8_, -459447240).anInt8030 * 1118296533;
				if (i_9_ > 0)
					class536_sub33.method9694((long) is[i_8_], i_9_, 65280);
			}
		}
	}

	public String method10712(RSByteBuffer class536_sub33, byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null != anIntArray11722) {
			for (int i_10_ = 0; i_10_ < anIntArray11722.length; i_10_++) {
				stringbuilder.append(aStringArray11725[i_10_]);
				stringbuilder.append(aClass32_11723.method789(method10721(i_10_, 978820496), anIntArrayArray11720[i_10_], class536_sub33.method9751((Class55.method950(anIntArray11722[i_10_], (byte) -95).anInt8017) * -1430825305, 604354379)));
			}
		}
		stringbuilder.append(aStringArray11725[aStringArray11725.length - 1]);
		return stringbuilder.toString();
	}

	public String method10713(byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null == aStringArray11725)
			return "";
		stringbuilder.append(aStringArray11725[0]);
		for (int i_11_ = 1; i_11_ < aStringArray11725.length; i_11_++) {
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11725[i_11_]);
		}
		return stringbuilder.toString();
	}

	public int method10714(int i) {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	void method10715(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			aStringArray11725 = Class344.method4483(class536_sub33.readString(), '<', (byte) -72);
		else if (i == 2) {
			int i_13_ = class536_sub33.readUnsignedByte(2101532257);
			anIntArray11724 = new int[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				anIntArray11724[i_14_] = class536_sub33.readUnsignedShort();
		} else if (3 == i) {
			int i_15_ = class536_sub33.readUnsignedByte(-395302504);
			anIntArray11722 = new int[i_15_];
			anIntArrayArray11720 = new int[i_15_][];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				int i_17_ = class536_sub33.readUnsignedShort();
				Class614 class614 = Class55.method950(i_17_, (byte) -35);
				if (class614 != null) {
					anIntArray11722[i_16_] = i_17_;
					anIntArrayArray11720[i_16_] = new int[class614.anInt8031 * -1771725915];
					for (int i_18_ = 0; i_18_ < class614.anInt8031 * -1771725915; i_18_++)
						anIntArrayArray11720[i_16_][i_18_] = class536_sub33.readUnsignedShort();
				}
			}
		} else if (i == 4)
			aBool11721 = false;
	}

	public int method10716(int i, int i_19_, int i_20_) {
		if (anIntArray11722 == null || i < 0 || i > anIntArray11722.length)
			return -1;
		if (null == anIntArrayArray11720[i] || i_19_ < 0 || i_19_ > anIntArrayArray11720[i].length)
			return -1;
		return anIntArrayArray11720[i][i_19_];
	}

	void method10717(int i) {
		if (null != anIntArray11724) {
			for (int i_21_ = 0; i_21_ < anIntArray11724.length; i_21_++)
				anIntArray11724[i_21_] |= 0x8000;
		}
	}

	void method10718(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1283712964);
			if (i == 0)
				break;
			method10710(class536_sub33, i, -173888311);
		}
	}

	void method10719(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(-850345198);
			if (i == 0)
				break;
			method10710(class536_sub33, i, 640708437);
		}
	}

	void method10720() {
		if (null != anIntArray11724) {
			for (int i = 0; i < anIntArray11724.length; i++)
				anIntArray11724[i] |= 0x8000;
		}
	}

	Class536_Sub18_Sub10() {
		/* empty */
	}

	public Class614 method10721(int i, int i_22_) {
		if (null == anIntArray11722 || i < 0 || i > anIntArray11722.length)
			return null;
		return Class55.method950(anIntArray11722[i], (byte) -65);
	}

	public String method10722() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null == aStringArray11725)
			return "";
		stringbuilder.append(aStringArray11725[0]);
		for (int i = 1; i < aStringArray11725.length; i++) {
			for (int i_23_ = 0; i_23_ < 3; i_23_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11725[i]);
		}
		return stringbuilder.toString();
	}

	public String method10723() {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null == aStringArray11725)
			return "";
		stringbuilder.append(aStringArray11725[0]);
		for (int i = 1; i < aStringArray11725.length; i++) {
			for (int i_24_ = 0; i_24_ < 3; i_24_++)
				stringbuilder.append('.');
			stringbuilder.append(aStringArray11725[i]);
		}
		return stringbuilder.toString();
	}

	void method10724(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1632844114);
			if (i == 0)
				break;
			method10710(class536_sub33, i, 182480715);
		}
	}

	public int method10725() {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	public int method10726() {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	void method10727(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			aStringArray11725 = Class344.method4483(class536_sub33.readString(), '<', (byte) -86);
		else if (i == 2) {
			int i_25_ = class536_sub33.readUnsignedByte(-887982710);
			anIntArray11724 = new int[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				anIntArray11724[i_26_] = class536_sub33.readUnsignedShort();
		} else if (3 == i) {
			int i_27_ = class536_sub33.readUnsignedByte(1450323154);
			anIntArray11722 = new int[i_27_];
			anIntArrayArray11720 = new int[i_27_][];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				int i_29_ = class536_sub33.readUnsignedShort();
				Class614 class614 = Class55.method950(i_29_, (byte) 60);
				if (class614 != null) {
					anIntArray11722[i_28_] = i_29_;
					anIntArrayArray11720[i_28_] = new int[class614.anInt8031 * -1771725915];
					for (int i_30_ = 0; i_30_ < class614.anInt8031 * -1771725915; i_30_++)
						anIntArrayArray11720[i_28_][i_30_] = class536_sub33.readUnsignedShort();
				}
			}
		} else if (i == 4)
			aBool11721 = false;
	}

	public int method10728() {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	public int method10729() {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	public int method10730() {
		if (null == anIntArray11722)
			return 0;
		return anIntArray11722.length;
	}

	void method10731() {
		if (null != anIntArray11724) {
			for (int i = 0; i < anIntArray11724.length; i++)
				anIntArray11724[i] |= 0x8000;
		}
	}
}
