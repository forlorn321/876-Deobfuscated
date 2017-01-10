/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class438 {
	public static final int anInt4863 = 4;
	public static final int anInt4864 = 0;
	public static final int anInt4865 = 1;
	public static final int anInt4866 = 2;
	public static final int anInt4867 = 3;
	public static int anInt4868;

	Class438() throws Throwable {
		throw new Error();
	}

	static final void method5297(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2571 * 1151043453;
	}

	static final void method5298(Class668 class668, int i) {
		Class459_Sub1.method9264(-2119124480);
	}

	static final void method5299(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_ % i_2_;
	}

	public static void method5300(Class536_Sub18 class536_sub18, Class536_Sub18 class536_sub18_3_, int i) {
		if (null != class536_sub18.aClass536_Sub18_10508)
			class536_sub18.method9521(-2100117877);
		class536_sub18.aClass536_Sub18_10508 = class536_sub18_3_.aClass536_Sub18_10508;
		class536_sub18.aClass536_Sub18_10506 = class536_sub18_3_;
		class536_sub18.aClass536_Sub18_10508.aClass536_Sub18_10506 = class536_sub18;
		class536_sub18.aClass536_Sub18_10506.aClass536_Sub18_10508 = class536_sub18;
	}

	static void method5301(GraphicalRenderer class167, short i) {
		if ((Class101.anInt1201 * 1140813693 != Class565.MY_PLAYER.aByte10839) && client.aClass515_11066.method6249(1872377919) != null) {
			Class249.method3450(2022691806);
			if (Class536_Sub18_Sub9.method10707(class167, Class565.MY_PLAYER.aByte10839, 1251483017))
				Class101.anInt1201 = (Class565.MY_PLAYER.aByte10839 * -1861762603);
		}
	}

	static final void method5302(Class668 class668, short i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.groundDecorationSetting.method8348(i_4_, -1102005131);
	}

	static final void method5303(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.textureSetting.method8348(i_5_, -1102005131);
	}
}
