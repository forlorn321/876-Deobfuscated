/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class338 {
	static final int anInt3646 = 3;
	long aLong3647 = 7474804210649232953L;
	static final int anInt3648 = 1;
	long aLong3649;
	static final int anInt3650 = 2;
	Class694 aClass694_3651 = new Class694();
	static final int anInt3652 = 4;
	static final int anInt3653 = 5;
	static String[] aStringArray3654;
	public static int anInt3655;
	public static Class459 aClass459_3656;

	public void method6012(Class527_Sub21 class527_sub21) {
		if ((aLong3649 * 291682620618178897L != -8168620736534281759L * class527_sub21.aLong7106) || (class527_sub21.aLong10488 * 3745362570088719233L != aLong3647 * 5608012410107226103L))
			throw new RuntimeException("");
		for (Class527_Sub4 class527_sub4 = (Class527_Sub4) aClass694_3651.method14081((short) 25328); null != class527_sub4; class527_sub4 = (Class527_Sub4) aClass694_3651.method14086(-65534))
			class527_sub4.method16048(class527_sub21, (byte) -12);
		class527_sub21.aLong10488 += -8734652902227993471L;
	}

	void method6013(RSByteBuffer class527_sub38, byte i) {
		aLong3649 = class527_sub38.method16612((byte) 1) * -2186605181456226383L;
		aLong3647 = class527_sub38.method16612((byte) 1) * -7474804210649232953L;
		for (int i_0_ = class527_sub38.readUnsignedByte(); 0 != i_0_; i_0_ = class527_sub38.readUnsignedByte()) {
			Class527_Sub4 class527_sub4;
			if (1 == i_0_)
				class527_sub4 = new Class527_Sub4_Sub2(this);
			else if (i_0_ == 4)
				class527_sub4 = new Class527_Sub4_Sub4(this);
			else if (3 == i_0_)
				class527_sub4 = new Class527_Sub4_Sub1(this);
			else if (2 == i_0_)
				class527_sub4 = new Class527_Sub4_Sub5(this);
			else if (i_0_ == 5)
				class527_sub4 = new Class527_Sub4_Sub3(this);
			else
				throw new RuntimeException("");
			class527_sub4.method16049(class527_sub38, (byte) 98);
			aClass694_3651.method14147(class527_sub4, -1282892231);
		}
	}

	public Class338(RSByteBuffer class527_sub38) {
		method6013(class527_sub38, (byte) -39);
	}

	public void method6014(Class527_Sub21 class527_sub21) {
		if ((aLong3649 * 291682620618178897L != -8168620736534281759L * class527_sub21.aLong7106) || (class527_sub21.aLong10488 * 3745362570088719233L != aLong3647 * 5608012410107226103L))
			throw new RuntimeException("");
		for (Class527_Sub4 class527_sub4 = (Class527_Sub4) aClass694_3651.method14081((short) -1337); null != class527_sub4; class527_sub4 = (Class527_Sub4) aClass694_3651.method14086(-65534))
			class527_sub4.method16048(class527_sub21, (byte) -45);
		class527_sub21.aLong10488 += -8734652902227993471L;
	}

	public void method6015(Class527_Sub21 class527_sub21, int i) {
		if ((aLong3649 * 291682620618178897L != -8168620736534281759L * class527_sub21.aLong7106) || (class527_sub21.aLong10488 * 3745362570088719233L != aLong3647 * 5608012410107226103L))
			throw new RuntimeException("");
		for (Class527_Sub4 class527_sub4 = (Class527_Sub4) aClass694_3651.method14081((short) 20034); null != class527_sub4; class527_sub4 = (Class527_Sub4) aClass694_3651.method14086(-65534))
			class527_sub4.method16048(class527_sub21, (byte) -17);
		class527_sub21.aLong10488 += -8734652902227993471L;
	}

	public void method6016(Class527_Sub21 class527_sub21) {
		if ((aLong3649 * 291682620618178897L != -8168620736534281759L * class527_sub21.aLong7106) || (class527_sub21.aLong10488 * 3745362570088719233L != aLong3647 * 5608012410107226103L))
			throw new RuntimeException("");
		for (Class527_Sub4 class527_sub4 = (Class527_Sub4) aClass694_3651.method14081((short) 18155); null != class527_sub4; class527_sub4 = (Class527_Sub4) aClass694_3651.method14086(-65534))
			class527_sub4.method16048(class527_sub21, (byte) -38);
		class527_sub21.aLong10488 += -8734652902227993471L;
	}
}
