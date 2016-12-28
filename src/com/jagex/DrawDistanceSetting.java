/* Class710_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class DrawDistanceSetting extends ClientSetting {
	int method8358(int i) {
		return 1;
	}

	void method8346(int i) {
		anInt8842 = i * -1100148889;
	}

	public DrawDistanceSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	int method8347(byte i) {
		if (aClass536_Sub40_8841.method9856(2073687090).method8367((byte) -20))
			return Class271.aClass271_2882.anInt2883 * -850812871;
		return -406080485 * Class299.aClass299_3350.anInt3352;
	}

	int method8348(int i, int i_0_) {
		return 1;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = i * -1100148889;
	}

	public int method10246(int i) {
		return -789865385 * anInt8842;
	}

	int method8352() {
		if (aClass536_Sub40_8841.method9856(2073264878).method8367((byte) 100))
			return Class271.aClass271_2882.anInt2883 * -850812871;
		return -406080485 * Class299.aClass299_3350.anInt3352;
	}

	int method8351() {
		if (aClass536_Sub40_8841.method9856(2082955353).method8367((byte) -29))
			return Class271.aClass271_2882.anInt2883 * -850812871;
		return -406080485 * Class299.aClass299_3350.anInt3352;
	}

	int method8355(int i) {
		return 1;
	}

	int method8353() {
		if (aClass536_Sub40_8841.method9856(2087774883).method8367((byte) 105))
			return Class271.aClass271_2882.anInt2883 * -850812871;
		return -406080485 * Class299.aClass299_3350.anInt3352;
	}

	void method8354(int i) {
		anInt8842 = i * -1100148889;
	}

	public DrawDistanceSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	int method8356(int i) {
		return 1;
	}

	int method8357(int i) {
		return 1;
	}

	public void method10247(int i) {
		if (aClass536_Sub40_8841.method9856(2052750617).method8367((byte) -20)) {
			if ((anInt8842 * -789865385 < Class271.aClass271_2884.anInt2883 * -850812871) || (anInt8842 * -789865385 > -850812871 * Class271.aClass271_2885.anInt2883))
				anInt8842 = method8347((byte) 26) * -1100148889;
		} else if ((anInt8842 * -789865385 < Class299.aClass299_3350.anInt3352 * -406080485) || (-789865385 * anInt8842 > -406080485 * Class299.aClass299_3353.anInt3352))
			anInt8842 = method8347((byte) 51) * -1100148889;
	}
}
