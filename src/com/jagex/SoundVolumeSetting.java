/* Class710_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class SoundVolumeSetting extends ClientSetting {
	static final int anInt10910 = 0;
	static final int anInt10911 = 255;

	int method8353() {
		return 127;
	}

	public SoundVolumeSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	public void method10212(int i) {
		if (anInt8842 * -789865385 < 0 && anInt8842 * -789865385 > 255)
			anInt8842 = method8347((byte) 29) * -1100148889;
	}

	int method8347(byte i) {
		return 127;
	}

	public SoundVolumeSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	void method8350(int i, int i_0_) {
		anInt8842 = -1100148889 * i;
	}

	public int method10213(int i) {
		return anInt8842 * -789865385;
	}

	int method8356(int i) {
		return 1;
	}

	int method8351() {
		return 127;
	}

	int method8352() {
		return 127;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	int method8355(int i) {
		return 1;
	}

	int method8348(int i, int i_1_) {
		return 1;
	}

	int method8357(int i) {
		return 1;
	}

	int method8358(int i) {
		return 1;
	}

	public void method10214() {
		if (anInt8842 * -789865385 < 0 && anInt8842 * -789865385 > 255)
			anInt8842 = method8347((byte) -37) * -1100148889;
	}

	public int method10215() {
		return anInt8842 * -789865385;
	}

	static final void method10216(Class668 class668, byte i) {
		class668.anInt8542 -= -1411037171;
	}
}
