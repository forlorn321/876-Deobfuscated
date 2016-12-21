/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class186 implements Interface13, Interface7 {
	public boolean[] aBoolArray2126;

	public void method58(int i) {
		/* empty */
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(214707954);
			if (0 == i_0_)
				break;
			method2772(class536_sub33, i_0_, -2087493067);
		}
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1777940843);
			if (0 == i)
				break;
			method2772(class536_sub33, i, -1412699451);
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	void method2770(RSByteBuffer class536_sub33, int i) {
		if (2 == i) {
			aBoolArray2126 = new boolean[400];
			int i_1_ = class536_sub33.readUnsignedSmart(1941205572);
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
				aBoolArray2126[class536_sub33.readUnsignedSmart(-1273046870)] = true;
		} else if (i == 3) {
			class536_sub33.readUnsignedByte(442282637);
			int i_3_ = class536_sub33.readUnsignedSmart(-638171424);
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				class536_sub33.readUnsignedSmart(-1380878739);
				class536_sub33.readUnsignedByte(-1202269587);
			}
		}
	}

	public void method59(int i, int i_5_) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	void method2771(RSByteBuffer class536_sub33, int i) {
		if (2 == i) {
			aBoolArray2126 = new boolean[400];
			int i_6_ = class536_sub33.readUnsignedSmart(152287371);
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				aBoolArray2126[class536_sub33.readUnsignedSmart(151464011)] = true;
		} else if (i == 3) {
			class536_sub33.readUnsignedByte(1728314678);
			int i_8_ = class536_sub33.readUnsignedSmart(-604333065);
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				class536_sub33.readUnsignedSmart(1772916952);
				class536_sub33.readUnsignedByte(1048317976);
			}
		}
	}

	public void method57(int i) {
		/* empty */
	}

	Class186() {
		/* empty */
	}

	void method2772(RSByteBuffer class536_sub33, int i, int i_10_) {
		if (2 == i) {
			aBoolArray2126 = new boolean[400];
			int i_11_ = class536_sub33.readUnsignedSmart(-1704255993);
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				aBoolArray2126[class536_sub33.readUnsignedSmart(520800640)] = true;
		} else if (i == 3) {
			class536_sub33.readUnsignedByte(-815126785);
			int i_13_ = class536_sub33.readUnsignedSmart(1630040071);
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				class536_sub33.readUnsignedSmart(-1300569648);
				class536_sub33.readUnsignedByte(1929722784);
			}
		}
	}

	void method2773(RSByteBuffer class536_sub33, int i) {
		if (2 == i) {
			aBoolArray2126 = new boolean[400];
			int i_15_ = class536_sub33.readUnsignedSmart(1105482392);
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				aBoolArray2126[class536_sub33.readUnsignedSmart(545594290)] = true;
		} else if (i == 3) {
			class536_sub33.readUnsignedByte(1923239522);
			int i_17_ = class536_sub33.readUnsignedSmart(-588048016);
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				class536_sub33.readUnsignedSmart(2120385843);
				class536_sub33.readUnsignedByte(-324985688);
			}
		}
	}

	public void method56(int i) {
		/* empty */
	}

	static final void method2774(Class251 class251, Class234 class234, Class668 class668, int i) {
		class251.aStringArray2657 = null;
	}

	static final void method2775(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class227.method3284(class251, class668, 2049791046);
	}

	static final void method2776(Class668 class668, short i) {
		int i_19_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (client.aString11137 != null && i_19_ < -918987073 * Class269.anInt2880)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class360_Sub1.aClass94Array10168[i_19_].aString1143;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static final void method2777(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass649_Sub1_Sub5_Sub1_8554.method9953(-1383433758);
	}

	static final void method2778(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_20_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_21_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		if (!Class585.method7050(string.charAt(0), (byte) 1))
			throw new RuntimeException();
		if (string.isEmpty() || string.length() > 10)
			throw new RuntimeException();
		if (!Class613.aClass263_8014.method3647(string, i_20_, i_21_, -1588318079))
			throw new RuntimeException();
	}
}
