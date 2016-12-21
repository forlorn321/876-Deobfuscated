/* Class205_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub11 extends Class205 {
	int anInt9890;
	int anInt9891;
	int anInt9892;
	int anInt9893;
	Class479 aClass479_9894;

	void method2945() {
		if (null != aClass479_9894) {
			aClass479_9894.method5774(50, (byte) 32);
			Class184_Sub2.aClass211_9442.method3002(aClass479_9894, -1092963117);
			aClass479_9894 = null;
		}
	}

	public void method2940(int i) {
		if (null != aClass479_9894)
			aClass479_9894.method5790((byte) -54);
	}

	Class205_Sub11(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9891 = class536_sub33.readUnsignedShort() * 2128453667;
		anInt9890 = class536_sub33.readUnsignedByte() * -870556865;
		anInt9892 = class536_sub33.readUnsignedByte() * 92146309;
		anInt9893 = class536_sub33.readUnsignedByte() * 1755878425;
		aClass479_9894 = (Class184_Sub2.aClass211_9442.method3003(Class198.aClass198_2211, this, 1243090827 * anInt9891, 55281705 * anInt9893, anInt9890 * -1786178369, Class188.aClass188_2133.method2788(-1949635362), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, anInt9892 * 2054315597, false, (byte) 14));
		if (aClass479_9894 != null)
			aClass479_9894.method5767(1260606561);
	}

	void method2941(byte i) {
		if (null != aClass479_9894) {
			aClass479_9894.method5774(50, (byte) 32);
			Class184_Sub2.aClass211_9442.method3002(aClass479_9894, -1092963117);
			aClass479_9894 = null;
		}
	}

	public void method2943() {
		if (null != aClass479_9894)
			aClass479_9894.method5790((byte) -68);
	}

	public void method2942() {
		if (null != aClass479_9894)
			aClass479_9894.method5790((byte) -37);
	}

	void method2946() {
		if (null != aClass479_9894) {
			aClass479_9894.method5774(50, (byte) 32);
			Class184_Sub2.aClass211_9442.method3002(aClass479_9894, -1092963117);
			aClass479_9894 = null;
		}
	}

	void method2947() {
		if (null != aClass479_9894) {
			aClass479_9894.method5774(50, (byte) 32);
			Class184_Sub2.aClass211_9442.method3002(aClass479_9894, -1092963117);
			aClass479_9894 = null;
		}
	}

	static final void method9069(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (1696506681 * client.anInt11002 == class668.aClass649_Sub1_Sub5_Sub1_8554.method10886(2006871293)) ? 1 : 0;
	}

	public static Class384 method9070(RSByteBuffer class536_sub33, int i) {
		int i_0_ = class536_sub33.readInt();
		return new Class384(i_0_);
	}
}
