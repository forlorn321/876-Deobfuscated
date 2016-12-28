/* Class710 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class ClientSetting {
	protected static final int anInt8838 = 2;
	protected static final int anInt8839 = 1;
	public static final int anInt8840 = 3;
	protected ClientSettings aClass536_Sub40_8841;
	protected int anInt8842;
	public static ClientSettings aClass536_Sub40_8843;

	abstract void method8346(int i);

	ClientSetting(int i, ClientSettings class536_sub40) {
		anInt8842 = i * -1100148889;
		aClass536_Sub40_8841 = class536_sub40;
	}

	abstract int method8347(byte i);

	abstract int method8348(int i, int i_0_);

	void method8349(int i, int i_1_) {
		if (method8348(i, -1102005131) != 3)
			method8350(i, -16777216);
	}

	abstract void method8350(int i, int i_2_);

	ClientSetting(ClientSettings class536_sub40) {
		aClass536_Sub40_8841 = class536_sub40;
		anInt8842 = method8347((byte) 3) * -1100148889;
	}

	abstract int method8351();

	abstract int method8352();

	abstract int method8353();

	abstract void method8354(int i);

	abstract int method8355(int i);

	abstract int method8356(int i);

	abstract int method8357(int i);

	abstract int method8358(int i);

	void method8359(int i) {
		if (method8348(i, -1102005131) != 3)
			method8350(i, -16777216);
	}

	void method8360(int i) {
		if (method8348(i, -1102005131) != 3)
			method8350(i, -16777216);
	}

	public static int method8361(String string, int i) {
		return Class536_Sub42.aTwitchTV10811.ChatSendMessage(string);
	}
}
