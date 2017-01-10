/* Class710_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class FlickeringSetting extends ClientSetting {
	public static final int anInt10863 = 1;
	public static final int anInt10864 = 0;

	public void method10086(short i) {
		if (1 != -789865385 * anInt8842 && 0 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) -33) * -1100148889;
	}

	public FlickeringSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	int method8353() {
		return 1;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	int method8348(int i, int i_0_) {
		return 1;
	}

	int method8351() {
		return 1;
	}

	public int method10087(int i) {
		return -789865385 * anInt8842;
	}

	public FlickeringSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	int method8352() {
		return 1;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = -1100148889 * i;
	}

	int method8347(byte i) {
		return 1;
	}

	int method8355(int i) {
		return 1;
	}

	int method8356(int i) {
		return 1;
	}

	int method8357(int i) {
		return 1;
	}

	int method8358(int i) {
		return 1;
	}

	public void method10088() {
		if (1 != -789865385 * anInt8842 && 0 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) -8) * -1100148889;
	}

	public void method10089() {
		if (1 != -789865385 * anInt8842 && 0 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) -35) * -1100148889;
	}

	public int method10090() {
		return -789865385 * anInt8842;
	}

	static Class283[] method10091(int i) {
		return (new Class283[] { Class283.aClass283_3179, Class283.aClass283_3181, Class283.aClass283_3182 });
	}

	static void method10092(int i, int i_2_) {
		Class101.anInt1199 = 0;
		int i_3_ = client.aClass515_11066.method6321((byte) -35);
		int i_4_ = client.aClass515_11066.method6243(177401017);
		Class455 class455 = client.aClass515_11066.method6251(241845288);
		Class553 class553 = client.aClass515_11066.method6249(680704183);
		Class34_Sub17 class34_sub17 = client.aClass515_11066.method6280(-1073841494);
		int i_5_ = i;
		if (Class565.MY_PLAYER != null) {
			int i_6_ = ((Class565.MY_PLAYER.screenX[0]) >> 3);
			int i_7_ = ((Class565.MY_PLAYER.screenY[0]) >> 3);
			if (i_6_ >= 0 && i_6_ < Class315_Sub1_Sub1.aBoolArrayArray11398.length && i_7_ >= 0 && i_7_ < Class315_Sub1_Sub1.aBoolArrayArray11398[i_6_].length && Class315_Sub1_Sub1.aBoolArrayArray11398[i_6_][i_7_])
				i_5_ = 0;
		}
		for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
				for (int i_10_ = i_5_; i_10_ <= 1 + i && i_10_ <= 3; i_10_++) {
					if ((i_10_ < i || class455.method5467(i, i_10_, i_8_, i_9_, 747920844)) && !(Class536_Sub22_Sub10.method10696((Interface59) class553.method6726(i_10_, i_8_, i_9_, 1672121015), class34_sub17, i_8_, i_9_, (byte) 1)) && !(Class536_Sub22_Sub10.method10696(((Interface59) class553.method6736(i_10_, i_8_, i_9_, client.anInterface64_11113, (byte) -57)), class34_sub17, i_8_, i_9_, (byte) -96))
							&& !(Class536_Sub22_Sub10.method10696((Interface59) class553.method6716(i_10_, i_8_, i_9_, -342954341), class34_sub17, i_8_, i_9_, (byte) 26)) && !(Class536_Sub22_Sub10.method10696((Interface59) class553.method6714(i_10_, i_8_, i_9_, (byte) 72), class34_sub17, i_8_, i_9_, (byte) -14))) {
						/* empty */
					}
				}
			}
		}
	}
}
