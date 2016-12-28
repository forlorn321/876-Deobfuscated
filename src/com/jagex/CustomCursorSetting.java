/* Class710_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class CustomCursorSetting extends ClientSetting {
	public static final int anInt10895 = 0;
	public static final int anInt10896 = 1;

	void method8350(int i, int i_0_) {
		anInt8842 = -1100148889 * i;
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	public void method10164(int i) {
		if (-789865385 * anInt8842 != 1 && 0 != anInt8842 * -789865385)
			anInt8842 = method8347((byte) -10) * -1100148889;
	}

	int method8347(byte i) {
		return 1;
	}

	int method8351() {
		return 1;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	public int method10165(short i) {
		return anInt8842 * -789865385;
	}

	int method8353() {
		return 1;
	}

	int method8355(int i) {
		return 1;
	}

	int method8352() {
		return 1;
	}

	int method8357(int i) {
		return 1;
	}

	public CustomCursorSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	public int method10166() {
		return anInt8842 * -789865385;
	}

	int method8356(int i) {
		return 1;
	}

	int method8348(int i, int i_1_) {
		return 1;
	}

	int method8358(int i) {
		return 1;
	}

	public void method10167() {
		if (-789865385 * anInt8842 != 1 && 0 != anInt8842 * -789865385)
			anInt8842 = method8347((byte) -42) * -1100148889;
	}

	public void method10168() {
		if (-789865385 * anInt8842 != 1 && 0 != anInt8842 * -789865385)
			anInt8842 = method8347((byte) -19) * -1100148889;
	}

	public int method10169() {
		return anInt8842 * -789865385;
	}

	public CustomCursorSetting(int i, ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	public static int[][] method10170(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, float f, boolean bool, byte i_7_) {
		int[][] is = new int[i_2_][i];
		Class536_Sub39_Sub1 class536_sub39_sub1 = new Class536_Sub39_Sub1();
		class536_sub39_sub1.aBool11751 = bool;
		class536_sub39_sub1.anInt11747 = -2021742323 * i_4_;
		class536_sub39_sub1.anInt11748 = i_5_ * -1292247997;
		class536_sub39_sub1.anInt11738 = i_6_ * -1791185511;
		class536_sub39_sub1.anInt11750 = (int) (f * 4096.0F) * -92961567;
		class536_sub39_sub1.method10745((byte) -8);
		Class28.method765(i, i_2_, 1946079257);
		for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
			class536_sub39_sub1.method10743(i_8_, is[i_8_], -1757922617);
		return is;
	}
}
