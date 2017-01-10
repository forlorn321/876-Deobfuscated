/* Class649_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class649_Sub1 extends Class649 {
	Class649_Sub1 aClass649_Sub1_10837;
	public Class553 aClass553_10838;
	public byte aByte10839;
	public byte aByte10840;
	int anInt10841;
	public Class178[] aClass178Array10842;

	abstract boolean method9938();

	abstract boolean method9939(GraphicalRenderer class167, int i, int i_0_, byte i_1_);

	abstract boolean method9940(int i);

	public abstract int method9941();

	abstract boolean method9942(int i);

	abstract void method9943(GraphicalRenderer class167, Class649_Sub1 class649_sub1_2_, int i, int i_3_, int i_4_, boolean bool, int i_5_);

	abstract Class563 method9944(GraphicalRenderer class167, byte i);

	abstract void method9945(GraphicalRenderer class167, int i);

	public abstract Class559 method9946(GraphicalRenderer class167, int i);

	abstract void method9947(GraphicalRenderer class167, Class649_Sub1 class649_sub1_6_, int i, int i_7_, int i_8_, boolean bool);

	abstract boolean method9948(GraphicalRenderer class167, int i);

	abstract boolean method9949(int i);

	int method9950(int i, int i_9_, Class536_Sub19[] class536_sub19s, int i_10_) {
		long l = aClass553_10838.aLongArrayArrayArray7472[aByte10839][i][i_9_];
		long l_11_ = 0L;
		int i_12_ = 0;
		for (/**/; l_11_ <= 48L; l_11_ += 16L) {
			int i_13_ = (int) (l >> (int) l_11_ & 0xffffL);
			if (i_13_ <= 0)
				break;
			class536_sub19s[i_12_++] = (aClass553_10838.aClass562Array7473[i_13_ - 1].aClass536_Sub19_7546);
		}
		for (int i_14_ = i_12_; i_14_ < 4; i_14_++)
			class536_sub19s[i_14_] = null;
		return i_12_;
	}

	int method9951() {
		return 0;
	}

	public boolean method9952(byte i) {
		return true;
	}

	public int method9953(int i) {
		return -method9960(-2115769668);
	}

	int method9954(int i) {
		return 0;
	}

	public abstract Class559 method9955(GraphicalRenderer class167);

	abstract boolean method9956();

	abstract boolean method9957(GraphicalRenderer class167, int i, int i_15_);

	public abstract int method9958();

	abstract int method9959(Class536_Sub19[] class536_sub19s, byte i);

	public abstract int method9960(int i);

	public abstract Class559 method9961(GraphicalRenderer class167);

	public abstract Class559 method9962(GraphicalRenderer class167);

	public abstract Class559 method9963(GraphicalRenderer class167);

	public int method9964() {
		return -method9960(-968128909);
	}

	abstract Class563 method9965(GraphicalRenderer class167);

	abstract Class563 method9966(GraphicalRenderer class167);

	abstract void method9967(GraphicalRenderer class167);

	void method9968(int i, int i_16_) {
		aClass178Array10842 = new Class178[i];
		for (int i_17_ = 0; i_17_ < aClass178Array10842.length; i_17_++)
			aClass178Array10842[i_17_] = new Class178();
	}

	abstract boolean method9969(GraphicalRenderer class167, int i, int i_18_);

	public boolean method9970() {
		return true;
	}

	abstract boolean method9971(GraphicalRenderer class167, int i, int i_19_);

	Class649_Sub1(Class553 class553) {
		aClass553_10838 = class553;
	}

	abstract boolean method9972();

	abstract boolean method9973();

	abstract boolean method9974(int i);

	abstract void method9975(GraphicalRenderer class167);

	abstract void method9976();

	int method9977() {
		return 0;
	}

	abstract void method9978(GraphicalRenderer class167, Class649_Sub1 class649_sub1_20_, int i, int i_21_, int i_22_, boolean bool);

	abstract int method9979(Class536_Sub19[] class536_sub19s);

	abstract int method9980(Class536_Sub19[] class536_sub19s);

	abstract int method9981(Class536_Sub19[] class536_sub19s);

	abstract boolean method9982(GraphicalRenderer class167);

	abstract boolean method9983();

	public abstract int method9984();

	abstract Class563 method9985(GraphicalRenderer class167);

	abstract void method9986(int i);

	abstract boolean method9987();

	void method9988(int i) {
		aClass178Array10842 = new Class178[i];
		for (int i_23_ = 0; i_23_ < aClass178Array10842.length; i_23_++)
			aClass178Array10842[i_23_] = new Class178();
	}

	void method9989(int i) {
		aClass178Array10842 = new Class178[i];
		for (int i_24_ = 0; i_24_ < aClass178Array10842.length; i_24_++)
			aClass178Array10842[i_24_] = new Class178();
	}

	void method9990(int i) {
		aClass178Array10842 = new Class178[i];
		for (int i_25_ = 0; i_25_ < aClass178Array10842.length; i_25_++)
			aClass178Array10842[i_25_] = new Class178();
	}

	static final void method9991(Class668 class668, byte i) {
		int i_26_ = ((client.anIntArrayArrayArray11117[(class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829])]).length >> 1);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_26_;
	}

	static final void method9992(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.lightingDetailSetting.method10066((byte) 0) == 1 ? 1 : 0;
	}
}
