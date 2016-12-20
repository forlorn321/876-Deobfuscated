/* Class171_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class171_Sub2 extends Class171 {
	protected static final int anInt9647 = 4;

	public abstract boolean method15319();

	public abstract void method15320(Interface23 interface23);

	public abstract void method15321(int i, Interface21 interface21);

	public abstract boolean method15322();

	Class171_Sub2() {
		/* empty */
	}

	public abstract void method15323(int i, Interface21 interface21);

	public abstract void method15324(Interface23 interface23);

	public abstract void method15325(int i, Interface21 interface21);

	public abstract void method15326(int i, Interface21 interface21);

	public abstract void method15327(Interface23 interface23);

	public abstract void method15328(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_);

	public abstract void method15329(Interface23 interface23);

	public abstract void method15330(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, boolean bool_11_);

	public abstract void method15331(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_);

	public abstract void method15332(int i, Interface21 interface21);

	public abstract void method15333(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool, boolean bool_23_);

	static final void method15334(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		client.anInt11167 = (class665.anIntArray8525[1769813785 * class665.anInt8526] * 695028313);
		client.anInt11186 = (618684525 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
	}

	static int method15335(int i) {
		int i_24_ = Class593.aClass310_7804.anInt3485 * -1481142029;
		if (i_24_ < Class290.aClass310Array3230.length - 1)
			Class593.aClass310_7804 = Class290.aClass310Array3230[i_24_ + 1];
		return 100;
	}

	static final void method15336(Class243 class243, Class665 class665, byte i) {
		if (695093683 * class665.anInt8543 >= 10)
			throw new RuntimeException();
		if (null != class243.anObjectArray2646) {
			Class527_Sub33 class527_sub33 = new Class527_Sub33();
			class527_sub33.aClass243_10648 = class243;
			class527_sub33.anObjectArray10650 = class243.anObjectArray2646;
			class527_sub33.anInt10656 = 49672619 * class665.anInt8543 + -127316951;
			client.aClass694_11246.method14147(class527_sub33, -1460346869);
		}
	}

	static void method15337(RSByteBuffer class527_sub38, int i) {
		int i_25_ = class527_sub38.readUnsignedSmart((byte) -91);
		Class605.aClass598Array7974 = new Class598[i_25_];
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			Class605.aClass598Array7974[i_26_] = new Class598();
			Class605.aClass598Array7974[i_26_].anInt7850 = class527_sub38.readUnsignedSmart((byte) -7) * -1202865957;
			Class605.aClass598Array7974[i_26_].aString7851 = class527_sub38.readVersionedString(90180177);
		}
		Class605.anInt7972 = class527_sub38.readUnsignedSmart((byte) -87) * -1965065081;
		Class638.anInt8321 = class527_sub38.readUnsignedSmart((byte) -25) * 1078339301;
		Class318.anInt3535 = class527_sub38.readUnsignedSmart((byte) -124) * 1621037041;
		Class605.aClass604_Sub1Array7968 = new Class604_Sub1[1 + (Class638.anInt8321 * 1671964397 - 451447095 * Class605.anInt7972)];
		for (int i_27_ = 0; i_27_ < -1134558959 * Class318.anInt3535; i_27_++) {
			int i_28_ = class527_sub38.readUnsignedSmart((byte) -66);
			Class604_Sub1 class604_sub1 = (Class605.aClass604_Sub1Array7968[i_28_] = new Class604_Sub1());
			class604_sub1.anInt7966 = class527_sub38.readUnsignedByte() * -588629823;
			class604_sub1.anInt7962 = class527_sub38.readInt() * -1385232667;
			class604_sub1.anInt10580 = class527_sub38.readUnsignedSmart((byte) -19) * -1898239091;
			if (class604_sub1.anInt10580 * -1126166715 != 0)
				class604_sub1.aString10581 = class527_sub38.readVersionedString(90180177);
			class604_sub1.anInt10579 = -708085763 * (451447095 * Class605.anInt7972 + i_28_);
			class604_sub1.aString10578 = class527_sub38.readVersionedString(90180177);
			class604_sub1.aString10577 = class527_sub38.readVersionedString(90180177);
		}
		Class605.anInt7970 = class527_sub38.readInt() * 2124488377;
		Class605.aBool7971 = true;
	}
}
