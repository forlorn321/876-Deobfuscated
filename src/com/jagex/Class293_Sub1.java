/* Class293_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class293_Sub1 extends Class293 {
	public static Class459 aClass459_10041;

	public Class method57() {
		return com.jagex.Class295.class;
	}

	public Interface14 method58(int i, Interface13 interface13, int i_0_) {
		return new Class295(i, this, interface13);
	}

	public Class method53(byte i) {
		return com.jagex.Class295.class;
	}

	public Interface14 method52(int i, Interface13 interface13) {
		return new Class295(i, this, interface13);
	}

	public Interface14 method54(int i, Interface13 interface13) {
		return new Class295(i, this, interface13);
	}

	public Interface14 method56(int i, Interface13 interface13) {
		return new Class295(i, this, interface13);
	}

	Class293_Sub1(boolean bool, Class459 class459, Class671 class671, Class678 class678) {
		super(bool, class459, class671, class678);
	}

	public Class method55() {
		return com.jagex.Class295.class;
	}

	public Class method59() {
		return com.jagex.Class295.class;
	}

	public static void method15724(Class400 class400, Class384 class384, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		Class99.aClass400_1174 = class400;
		Class99.aClass384_1168 = class384;
		Exception_Sub3.anInt11361 = 1175971553 * i;
		Class99.anInt1169 = i_1_ * -1327342301;
		Class99.anInt1171 = i_2_ * -532373783;
		Class99.anInt1172 = 916591537 * i_3_;
		Class99.anInt1173 = i_4_ * 697478961;
		Class99.anInt1167 = i_5_ * -132422939;
		Class510.anInt6974 = i_6_ * -1266646457;
		Class99.aClass185_1170 = null;
		Class307.aClass185_3447 = null;
		Class195.aClass185_2161 = null;
		Class488.anInt5471 = i_7_ * -939244273;
		Class527_Sub4_Sub3.anInt11697 = -870910711 * i_8_;
		Class588.method9816(-1834879213);
		Class542.aBool7236 = true;
	}

	public static int method15725(Class438 class438, int i) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
		class442.method7141();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}
}
