/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;

public abstract class Class553 {
	public abstract void method9152();

	public static Class553 method9153(Component component, boolean bool) {
		return new Class553_Sub1(component, bool);
	}

	public abstract void method9154();

	public abstract boolean method9155(int i);

	public static void method9156(int i) {
		Class527_Sub24_Sub11.method18288(i, -69264223);
	}

	public abstract boolean method9157();

	public abstract int method9158(int i);

	public abstract int method9159(int i);

	public abstract void method9160();

	public abstract void method9161(int i);

	public abstract void method9162(int i);

	public static void method9163(int i) {
		Class527_Sub24_Sub11.method18288(i, -1450451058);
	}

	public static void method9164(int i) {
		Class527_Sub24_Sub11.method18288(i, 1327283477);
	}

	public abstract boolean method9165(byte i);

	Class553() {
		/* empty */
	}

	public static void method9166(int i) {
		Class527_Sub24_Sub11.method18288(i, -1470681942);
	}

	public static void method9167(int i) {
		Class527_Sub24_Sub11.method18288(i, -334072257);
	}

	public abstract Class527_Sub34 method9168(int i);

	public abstract int method9169();

	public abstract void method9170();

	public abstract boolean method9171();

	public abstract boolean method9172(byte i);

	public abstract boolean method9173();

	public abstract boolean method9174();

	public abstract boolean method9175();

	public boolean method9176() {
		return (method9165((byte) 0) || method9155(-2139834430) || method9172((byte) -115));
	}

	public boolean method9177() {
		return (method9165((byte) 0) || method9155(-2100794402) || method9172((byte) 13));
	}

	public abstract int method9178();

	public abstract int method9179();

	public abstract int method9180();

	public static Class553 method9181(Component component, boolean bool) {
		return new Class553_Sub1(component, bool);
	}

	public abstract Class527_Sub34 method9182();

	public abstract Class527_Sub34 method9183();

	public abstract void method9184();

	public abstract void method9185();

	public abstract void method9186();

	public boolean method9187(int i) {
		return (method9165((byte) 0) || method9155(-2095846621) || method9172((byte) 50));
	}

	public abstract void method9188();

	public abstract boolean method9189();

	static final void method9190(Class665 class665, int i) {
		Class635.method10556(1700003266);
	}

	static final void method9191(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-803809678) == 2 ? 1 : 0;
	}

	static final void method9192(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (-820304157 * client.anInt11232 == class665.aClass640_Sub1_Sub2_Sub1_8522.method18553(713105781)) ? 1 : 0;
	}

	static void method9193(Class527_Sub38_Sub2 class527_sub38_sub2, byte i) {
		boolean bool = class527_sub38_sub2.readUnsignedByte() == 1;
		if (bool) {
			boolean bool_0_ = false;
			int i_1_ = class527_sub38_sub2.method18446((byte) 3) << 24;
			i_1_ |= class527_sub38_sub2.method18446((byte) 3) << 16;
			i_1_ |= class527_sub38_sub2.method18446((byte) 3) << 8;
			i_1_ |= class527_sub38_sub2.method18446((byte) 3);
			Class105.aClass45_1309.method1197((6371774841921582087L * Class684.aLong8653), i_1_, 428747023);
		}
	}

	public static int method9194(int i, int i_2_) {
		Class527_Sub8_Sub11 class527_sub8_sub11 = (Class527_Sub8_Sub11) Class264.aClass14_2870.method709((long) i);
		if (class527_sub8_sub11 == null)
			return -1;
		if (class527_sub8_sub11.aClass527_Sub8_10400 == Class264.aClass693_2871.aClass527_Sub8_8734)
			return -1;
		return (867529685 * ((Class527_Sub8_Sub11) class527_sub8_sub11.aClass527_Sub8_10400).anInt11752);
	}

	static void method9195(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i - 5;
		int i_8_ = 2 + i_3_;
		if (2110063129 * class249.anInt2779 != 0)
			class180.method3174(i_7_, i_8_, 10 + i_5_, i_4_ + i_3_ - i_8_ + 1, 2110063129 * class249.anInt2779, -1445013362);
		if (class249.anInt2732 * 1688213881 != 0)
			class180.method3269(i_7_, i_8_, 10 + i_5_, i_3_ + i_4_ - i_8_ + 1, class249.anInt2732 * 1688213881, 1249059278);
		int i_9_ = class249.anInt2738 * 1166915573;
		if (class527_sub30.aBool10571 && -1 != 210107331 * class249.anInt2739)
			i_9_ = 210107331 * class249.anInt2739;
		Class358_Sub2.aClass174_10289.method2746(class249.aString2737, i, i_3_, i_5_, i_4_, ~0xffffff | i_9_, 786689371 * (Class529_Sub1.aClass630_7122.anInt8236), 1, 0, 0, null, null, null, 0, 0, -1300246824);
	}

	static final void method9196(Class665 class665, byte i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_10_, 476731161);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2511 * -1054537975;
	}
}
