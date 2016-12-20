/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class80 implements Interface14, Interface7 {
	public boolean aBool803 = true;
	public int anInt804;
	Class462 aClass462_805;
	public String aString806;
	static int anInt807;

	public void method60(int i) {
		/* empty */
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method1565(class527_sub38, i_0_, -28988767);
		}
	}

	void method1565(RSByteBuffer class527_sub38, int i, int i_1_) {
		if (i == 1) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -32);
			aClass462_805 = Class462.method7607(c, (byte) 61);
		} else if (2 == i)
			anInt804 = class527_sub38.readInt() * -360950351;
		else if (i == 4)
			aBool803 = false;
		else if (i == 5)
			aString806 = class527_sub38.readString(1673438344);
		else if (101 == i)
			aClass462_805 = ((Class462) Class26.method858(Class462.method7610(-1723695559), class527_sub38.readUnsignedSmart((byte) -79), -527105796));
	}

	Class80() {
		/* empty */
	}

	public void method86(int i) {
		/* empty */
	}

	public void method16(int i, int i_2_) {
		/* empty */
	}

	public boolean method1566(int i) {
		return Class462.aClass462_5131 == aClass462_805;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1565(class527_sub38, i, -1412273081);
		}
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1565(class527_sub38, i, -1964968781);
		}
	}

	public void method85() {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	void method1567(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -37);
			aClass462_805 = Class462.method7607(c, (byte) 67);
		} else if (2 == i)
			anInt804 = class527_sub38.readInt() * -360950351;
		else if (i == 4)
			aBool803 = false;
		else if (i == 5)
			aString806 = class527_sub38.readString(854713059);
		else if (101 == i)
			aClass462_805 = ((Class462) Class26.method858(Class462.method7610(-437567993), class527_sub38.readUnsignedSmart((byte) -42), 1701149772));
	}

	void method1568(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 12);
			aClass462_805 = Class462.method7607(c, (byte) 5);
		} else if (2 == i)
			anInt804 = class527_sub38.readInt() * -360950351;
		else if (i == 4)
			aBool803 = false;
		else if (i == 5)
			aString806 = class527_sub38.readString(846527136);
		else if (101 == i)
			aClass462_805 = ((Class462) Class26.method858(Class462.method7610(-1259041579), class527_sub38.readUnsignedSmart((byte) -7), 1749143336));
	}

	void method1569(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 22);
			aClass462_805 = Class462.method7607(c, (byte) 25);
		} else if (2 == i)
			anInt804 = class527_sub38.readInt() * -360950351;
		else if (i == 4)
			aBool803 = false;
		else if (i == 5)
			aString806 = class527_sub38.readString(1932553853);
		else if (101 == i)
			aClass462_805 = ((Class462) Class26.method858(Class462.method7610(-1013220814), class527_sub38.readUnsignedSmart((byte) -36), 1482603867));
	}

	void method1570(RSByteBuffer class527_sub38, int i) {
		if (i == 1) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -65);
			aClass462_805 = Class462.method7607(c, (byte) -78);
		} else if (2 == i)
			anInt804 = class527_sub38.readInt() * -360950351;
		else if (i == 4)
			aBool803 = false;
		else if (i == 5)
			aString806 = class527_sub38.readString(2142045648);
		else if (101 == i)
			aClass462_805 = ((Class462) Class26.method858(Class462.method7610(-2139371118), class527_sub38.readUnsignedSmart((byte) -90), -1936029070));
	}

	public boolean method1571() {
		return Class462.aClass462_5131 == aClass462_805;
	}

	public boolean method1572() {
		return Class462.aClass462_5131 == aClass462_805;
	}

	static void method1573(int i, int i_3_, int i_4_) {
		Class333 class333 = (Class333) Class51.aClass24_Sub16_522.method81(i, -209154234);
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(1, (long) (727971013 * (class333.aClass160_3626.anInt1746)));
		try {
			if (Class527_Sub8_Sub9.aBool11679)
				class527_sub8_sub9.anInt11676 = (Class598.aClass144_Sub1_7852.method101(class333.aClass160_3626, 1096407173) * -281159195);
			class527_sub8_sub9.anInt11676 = class333.method5841((class527_sub8_sub9.anInt11676 * -1709720595), i_3_, (byte) -120) * -281159195;
			class527_sub8_sub9.method18187(620130307);
		} catch (Exception_Sub7 exception_sub7) {
			Class180.method3542(new StringBuilder().append("").append(i).toString(), exception_sub7, 1604547405);
		}
	}
}
