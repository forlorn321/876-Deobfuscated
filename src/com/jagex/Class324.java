/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class324 implements Interface14 {
	int anInt3551;
	Class325 aClass325_3552;
	public int anInt3553;
	int anInt3554;
	public Class153 aClass153_3555;
	String aString3556;
	Class458 aClass458_3557;
	int anInt3558 = 590500391;
	static int[] anIntArray3559 = new int[32];

	Class324(int i, Class325 class325) {
		anInt3553 = i * 1190647185;
		aClass325_3552 = class325;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		method4261(class536_sub33, false, (byte) 65);
	}

	void method4261(RSByteBuffer class536_sub33, boolean bool, byte i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method4262(class536_sub33, i_0_, bool, (byte) 96);
		}
	}

	public void method77() {
		/* empty */
	}

	void method4262(RSByteBuffer class536_sub33, int i, boolean bool, byte i_1_) {
		Class318 class318 = ((Class318) Class682.method8091(Class266.method3691((short) 14061), i, 1858049507));
		switch (class318.anInt3524 * 385356977) {
		case 7:
			break;
		case 14:
			anInt3554 = class536_sub33.readUnsignedByte() * 1672464191;
			anInt3551 = class536_sub33.readUnsignedByte() * 47506311;
			break;
		default:
			break;
		case 13: {
			int i_2_ = class536_sub33.readUnsignedByte();
			aClass458_3557 = ((Class458) Class682.method8091(Class458.method5497((byte) 14), i_2_, 1858049507));
			if (aClass458_3557 == null)
				throw new IllegalStateException("");
			anInt3558 = class536_sub33.method9720((byte) 1) * -590500391;
			if (null != aClass325_3552) {
				Interface12 interface12 = ((Interface12) aClass325_3552.aMap3560.get(aClass458_3557));
				if (null != interface12)
					aClass153_3555 = ((Class153) interface12.method70(-1584922007 * anInt3558, (byte) -1));
				else if (!bool)
					throw new IllegalStateException("");
			}
		}
		}
	}

	public int method4263(int i, byte i_3_) {
		int i_4_ = anIntArray3559[anInt3551 * -1077448137 - -173561665 * anInt3554];
		return i >> anInt3554 * -173561665 & i_4_;
	}

	public void method75(byte i) {
		/* empty */
	}

	public int method4264(int i) {
		int i_5_ = anIntArray3559[anInt3551 * -1077448137 - -173561665 * anInt3554];
		return i >> anInt3554 * -173561665 & i_5_;
	}

	public void method76(RSByteBuffer class536_sub33) {
		method4261(class536_sub33, false, (byte) 73);
	}

	public int method4265(int i, int i_6_, byte i_7_) throws Exception_Sub4 {
		int i_8_ = anIntArray3559[anInt3551 * -1077448137 - anInt3554 * -173561665];
		if (i_6_ < 0 || i_6_ > i_8_)
			throw new Exception_Sub4((null != aString3556 ? aString3556 : Integer.toString(-891974799 * anInt3553)), i_6_, i_8_);
		i_8_ <<= -173561665 * anInt3554;
		return i & (i_8_ ^ 0xffffffff) | i_6_ << anInt3554 * -173561665 & i_8_;
	}

	public int method4266(int i) {
		int i_9_ = anIntArray3559[anInt3551 * -1077448137 - -173561665 * anInt3554];
		return i >> anInt3554 * -173561665 & i_9_;
	}

	public int method4267(int i) {
		int i_10_ = anIntArray3559[anInt3551 * -1077448137 - -173561665 * anInt3554];
		return i >> anInt3554 * -173561665 & i_10_;
	}

	static {
		int i = 2;
		for (int i_11_ = 0; i_11_ < 32; i_11_++) {
			anIntArray3559[i_11_] = i - 1;
			i += i;
		}
	}

	public int method4268(int i, int i_12_) throws Exception_Sub4 {
		int i_13_ = anIntArray3559[anInt3551 * -1077448137 - anInt3554 * -173561665];
		if (i_12_ < 0 || i_12_ > i_13_)
			throw new Exception_Sub4((null != aString3556 ? aString3556 : Integer.toString(-891974799 * anInt3553)), i_12_, i_13_);
		i_13_ <<= -173561665 * anInt3554;
		return (i & (i_13_ ^ 0xffffffff) | i_12_ << anInt3554 * -173561665 & i_13_);
	}

	public static Class603_Sub1 method4269(int i, int i_14_) {
		if (!Class593.aBool7806 || i < Class220.lowestWorldId * -805119937 || i > Class593.highestWorldId * 870600939)
			return null;
		return (Class506.aClass603_Sub1Array6890[i - Class220.lowestWorldId * -805119937]);
	}

	static final void method4270(Class668 class668, int i) {
		int i_15_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_15_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_15_ >> 16];
		Class207.method2966(class251, class234, class668, 1989787980);
	}

	static final void method4271(Class668 class668, byte i) {
		int i_16_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_16_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_16_ >> 16];
		Class534.method6469(class251, class234, class668, -142337968);
	}

	static final void method4272(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (null != Class542.aClass536_Sub18_Sub14_7202 ? -673647059 * Class542.aClass536_Sub18_Sub14_7202.anInt11765 : -1);
	}

	static final void method4273(Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		int i_17_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		boolean bool = 1 == (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		int i_18_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		boolean bool_19_ = 1 == (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 3]);
		Class711.method8377(i_17_, bool, i_18_, bool_19_, (byte) -1);
	}

	static final void method4274(Class668 class668, int i) {
		int i_20_ = client.aClass4_11008.method569(1127198693);
		if (client.anInt11187 * -1959825479 != -1)
			i_20_++;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_20_;
	}

	static long method4275(CharSequence charsequence, int i) {
		long l = 0L;
		int i_21_ = charsequence.length();
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			l *= 37L;
			char c = charsequence.charAt(i_22_);
			if (c >= 'A' && c <= 'Z')
				l += (long) ('\001' + c - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) ('\001' + c - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) (c + '\033' - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static void method4276(int i) {
		Class95.anInt1156 = 0;
		for (int i_23_ = 0; i_23_ < 2048; i_23_++) {
			Class95.aClass536_Sub33Array1154[i_23_] = null;
			Class95.aClass536_Sub33Array1155[i_23_] = null;
			Class95.aByteArray1153[i_23_] = Class680.aClass680_8639.aByte8644;
			Class95.aClass43Array1162[i_23_] = null;
		}
	}
}
