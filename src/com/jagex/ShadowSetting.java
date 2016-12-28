/* Class710_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ShadowSetting extends ClientSetting {
	public static final int anInt10843 = 2;
	public static final int anInt10844 = 0;
	public static final int anInt10845 = 1;

	int method8352() {
		return 2;
	}

	public ShadowSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	public void method10001(int i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(1026166679) == 0)
			anInt8842 = 0;
		if (anInt8842 * -789865385 < 0 || anInt8842 * -789865385 > 2)
			anInt8842 = method8347((byte) -31) * -1100148889;
	}

	int method8347(byte i) {
		return 2;
	}

	public int method8348(int i, int i_0_) {
		if (aClass536_Sub40_8841.textureSetting.method9885(-2047127272) == 0)
			return 3;
		return 1;
	}

	public boolean method10002(short i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(1745188092) == 0)
			return false;
		return true;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = -1100148889 * i;
	}

	public int method8358(int i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(1750959097) == 0)
			return 3;
		return 1;
	}

	int method8353() {
		return 2;
	}

	int method8351() {
		return 2;
	}

	public void method10003() {
		if (aClass536_Sub40_8841.textureSetting.method9885(1384139445) == 0)
			anInt8842 = 0;
		if (anInt8842 * -789865385 < 0 || anInt8842 * -789865385 > 2)
			anInt8842 = method8347((byte) 35) * -1100148889;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	public int method8355(int i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(-455273103) == 0)
			return 3;
		return 1;
	}

	public int method8356(int i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(-408202843) == 0)
			return 3;
		return 1;
	}

	public int method8357(int i) {
		if (aClass536_Sub40_8841.textureSetting.method9885(123527943) == 0)
			return 3;
		return 1;
	}

	public ShadowSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	public int method10004(int i) {
		return anInt8842 * -789865385;
	}

	public boolean method10005() {
		if (aClass536_Sub40_8841.textureSetting.method9885(660160523) == 0)
			return false;
		return true;
	}

	public boolean method10006() {
		if (aClass536_Sub40_8841.textureSetting.method9885(156235731) == 0)
			return false;
		return true;
	}

	public int method10007() {
		return anInt8842 * -789865385;
	}

	public int method10008() {
		return anInt8842 * -789865385;
	}

	public int method10009() {
		return anInt8842 * -789865385;
	}

	static final void method10010(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class34_Sub20.method10364(class251, class234, class668, 109874315);
	}

	static final void method10011(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class94.method1289(class251, class234, class668, (byte) -6);
	}
}
