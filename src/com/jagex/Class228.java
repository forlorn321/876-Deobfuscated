/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class228 implements Interface42 {
	Class211 this$0;
	static Class536_Sub18_Sub9 aClass536_Sub18_Sub9_2359;
	public static Class34 aClass34_2360;

	Class228(Class211 class211) {
		this$0 = class211;
	}

	public float method288() {
		return ((float) ClientSetting.aClass536_Sub40_8843.loginMusicVolumeSetting.method10213(988027290) / 255.0F);
	}

	public float method286() {
		return ((float) ClientSetting.aClass536_Sub40_8843.loginMusicVolumeSetting.method10213(-1314130949) / 255.0F);
	}

	public float method287() {
		return ((float) ClientSetting.aClass536_Sub40_8843.loginMusicVolumeSetting.method10213(803491637) / 255.0F);
	}

	public float method285(int i) {
		return ((float) ClientSetting.aClass536_Sub40_8843.loginMusicVolumeSetting.method10213(601245860) / 255.0F);
	}

	static final void method3286(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class521.method6358((char) i_0_, 861576384) ? 1 : 0;
	}

	static final void method3287(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.aClass710_Sub20_10779.method10102(860620332) ? 1 : 0;
	}

	static void method3288(Class167 class167, IComponentDefinitions class251, int i) {
		boolean bool = ((Class111.aClass34_Sub13_1391.method10342(class167, -1484799213 * class251.anInt2711, -1880327077 * class251.anInt2712, 1960646061 * class251.outline, ~0xffffff | class251.graphicShadow * 1514577167, -1273595415 * class251.anInt2595, (class251.aBool2671 ? Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202 : null), -2142406631)) == null);
		if (bool) {
			Class54.aClass708_602.method8335(new Class536_Sub5(class251.anInt2711 * -1484799213, -1880327077 * class251.anInt2712, class251.outline * 1960646061, ~0xffffff | 1514577167 * class251.graphicShadow, class251.anInt2595 * -1273595415, class251.aBool2671), 152341297);
			Class668.method8011(class251, 263642117);
		}
	}

	static final void method3289(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_1_, (byte) -51));
		if (i_2_ != 1566477951 * class73.anInt803)
			class251.method3487(i_1_, i_2_, 54566702);
		else
			class251.method3497(i_1_, (byte) 34);
	}
}
