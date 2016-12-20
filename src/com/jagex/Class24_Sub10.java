/* Class24_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class24_Sub10 extends Class24 {
	public Class527_Sub8_Sub16 method17388(int i, int i_0_) {
		return ((Class200) anInterface6_233).method3756(i, (byte) 84);
	}

	public void method840() {
		super.method845(-2060950257);
		((Class200) anInterface6_233).method3758(-1074889418);
	}

	public void method836(int i) {
		super.method836(-1628470470);
		((Class200) anInterface6_233).method3764(1178063475);
	}

	public void method832(int i, byte i_1_) {
		super.method832(i, (byte) 16);
		((Class200) anInterface6_233).method3757(i, 995886614);
	}

	public void method845(int i) {
		super.method845(-1364397509);
		((Class200) anInterface6_233).method3758(-1523663811);
	}

	public Class527_Sub8_Sub16 method17389(int i) {
		return ((Class200) anInterface6_233).method3756(i, (byte) 86);
	}

	public Class527_Sub8_Sub16 method17390(int i) {
		return ((Class200) anInterface6_233).method3756(i, (byte) 98);
	}

	public void method846() {
		super.method836(-2088544155);
		((Class200) anInterface6_233).method3764(-1289148191);
	}

	public void method835() {
		super.method836(-2003673732);
		((Class200) anInterface6_233).method3764(-1455273324);
	}

	public Class24_Sub10(Class678 class678, Class671 class671, Class459 class459, Class459 class459_2_, Class459 class459_3_, Class24_Sub3 class24_sub3) {
		super(class678, class671, class459, Class657.aClass657_8445, 64, new Class200_Sub1(class24_sub3, class459_2_, class459_3_));
	}

	public void method830(int i) {
		super.method832(i, (byte) 30);
		((Class200) anInterface6_233).method3757(i, 1754864589);
	}

	public void method834() {
		super.method845(-1990030051);
		((Class200) anInterface6_233).method3758(-610115092);
	}

	public void method837() {
		super.method836(-445735590);
		((Class200) anInterface6_233).method3764(-550609042);
	}

	public static int method17391(Random random, int i, int i_4_) {
		if (null == random) {
			random = Class93.aRandom882;
			if (null == random) {
				synchronized (Class93.anObject883) {
					if (null == Class93.aRandom882)
						Class93.aRandom882 = new Random();
					random = Class93.aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class143.method2383(i, 2093151570))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_5_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_6_;
		do
			i_6_ = random.nextInt();
		while (i_6_ >= i_5_);
		return Class24.method848(i_6_, i, -1494078768);
	}

	public static int method17392(int i) {
		return Class585.aTwitchTV7698.GetViewerCount();
	}

	static final void method17393(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_7_, -157489355);
		Class15.method736(class243, class665, 1741832508);
	}
}
