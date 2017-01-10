/* Class710_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class RemoveRoofSetting extends ClientSetting {
	public static final int anInt10827 = 1;
	public static final int anInt10828 = 3;
	public static final int anInt10829 = 2;
	public static final int anInt10830 = 0;

	int method8351() {
		return 2;
	}

	public RemoveRoofSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	public void method9915(int i) {
		if ((aClass536_Sub40_8841.aClass710_Sub20_10779.method10103((byte) -48) == 2) && -789865385 * anInt8842 == 2)
			anInt8842 = -1100148889;
		if (anInt8842 * -789865385 < 0 || -789865385 * anInt8842 > 3)
			anInt8842 = method8347((byte) -1) * -1100148889;
	}

	int method8348(int i, int i_0_) {
		return 1;
	}

	int method8357(int i) {
		return 1;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = -1100148889 * i;
	}

	public int method9916() {
		return anInt8842 * -789865385;
	}

	int method8353() {
		return 2;
	}

	public RemoveRoofSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	int method8347(byte i) {
		return 2;
	}

	int method8352() {
		return 2;
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	int method8355(int i) {
		return 1;
	}

	int method8356(int i) {
		return 1;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	int method8358(int i) {
		return 1;
	}

	public int method9917() {
		return anInt8842 * -789865385;
	}

	public int method9918() {
		return anInt8842 * -789865385;
	}

	public int method9919() {
		return anInt8842 * -789865385;
	}

	static void method9920(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class536_Sub18_Sub9 class536_sub18_sub9, FontRenderer class184, Class2 class2, int i_8_, int i_9_, int i_10_) {
		if (i > i_3_ && i < i_5_ + i_3_ && i_2_ > i_7_ - class2.anInt91 * -1214764847 - 1 && i_2_ < 1780869003 * class2.anInt92 + i_7_ && class536_sub18_sub9.aBool11714)
			i_8_ = i_9_;
		int[] is = Class402.method4923(class536_sub18_sub9, 963140472);
		String string = Class87.method1212(class536_sub18_sub9, -1884633141);
		if (null != is)
			string = new StringBuilder().append(string).append(Class158.method1892(is, -1192355961)).toString();
		class184.method2748(string, i_3_ + 3, i_7_, i_8_, 0, client.aRandom11161, Class458_Sub4.anInt10337, Class195.aClass143Array2201, null, -853896346);
		if (class536_sub18_sub9.aBool11715)
			Class289.aClass143_3215.method1728(5 + i_3_ + class2.method531(string, Class195.aClass143Array2201, 581946732), i_7_ - class2.anInt91 * -1214764847);
	}
}
