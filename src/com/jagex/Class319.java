/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class319 implements Interface33 {
	Class392 aClass392_3527;
	long aLong3528;
	JS5ResourceProvider aClass461_3529;
	Class184 aClass184_3530;
	int anInt3531;
	JS5ResourceProvider aClass461_3532;

	abstract void method4230(boolean bool, int i, int i_0_, int i_1_);

	public void method216(boolean bool, int i) {
		int i_2_ = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 1591159450)) + aClass392_3527.anInt4066 * 316945261);
		int i_3_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -505549781)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i_2_, i_3_, 1393818874);
		method4230(bool, i_2_, i_3_, 1719617822);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1329189269) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class192.aClass292_2177.method3940(-1215749338).anInt3425) * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i_2_, (4 + (i_3_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) 46);
	}

	int method4231() {
		int i = Class192.aClass292_2177.method3944(1591902939);
		int i_4_ = 100 * i;
		if (i == anInt3531 * -235980715 && 0 != i) {
			int i_5_ = Class192.aClass292_2177.method3937(-426588548);
			if (i_5_ > i) {
				long l = (5800580581361644497L * aLong3528 - Class192.aClass292_2177.method3939(-2127557373));
				if (l > 0L) {
					long l_6_ = (long) (i_5_ - i) * (10000L * l / (long) i);
					long l_7_ = ((Class249.method3450(1889763560) - 5800580581361644497L * aLong3528) * 10000L);
					if (l_7_ < l_6_)
						i_4_ = (int) ((long) (i_5_ - i) * l_7_ * 100L / l_6_ + (long) (100 * i));
					else
						i_4_ = i_5_ * 100;
				}
			}
		} else {
			anInt3531 = i * 115606781;
			aLong3528 = Class249.method3450(1500854531) * -4946995429357894351L;
		}
		return i_4_;
	}

	public boolean method209(int i) {
		boolean bool = true;
		if (!aClass461_3529.method5580(aClass392_3527.anInt4071 * 1694830205, -964514165))
			bool = false;
		if (!aClass461_3532.method5580(1694830205 * aClass392_3527.anInt4071, -964514165))
			bool = false;
		return bool;
	}

	abstract void method4232(boolean bool, int i, int i_8_, int i_9_);

	int method4233() {
		int i = Class192.aClass292_2177.method3944(-424498685);
		int i_10_ = 100 * i;
		if (i == anInt3531 * -235980715 && 0 != i) {
			int i_11_ = Class192.aClass292_2177.method3937(-346430182);
			if (i_11_ > i) {
				long l = (5800580581361644497L * aLong3528 - Class192.aClass292_2177.method3939(-2093514694));
				if (l > 0L) {
					long l_12_ = (long) (i_11_ - i) * (10000L * l / (long) i);
					long l_13_ = ((Class249.method3450(2077704357) - 5800580581361644497L * aLong3528) * 10000L);
					if (l_13_ < l_12_)
						i_10_ = (int) ((long) (i_11_ - i) * l_13_ * 100L / l_12_ + (long) (100 * i));
					else
						i_10_ = i_11_ * 100;
				}
			}
		} else {
			anInt3531 = i * 115606781;
			aLong3528 = Class249.method3450(1608976336) * -4946995429357894351L;
		}
		return i_10_;
	}

	int method4234(int i) {
		int i_14_ = Class192.aClass292_2177.method3944(515080037);
		int i_15_ = 100 * i_14_;
		if (i_14_ == anInt3531 * -235980715 && 0 != i_14_) {
			int i_16_ = Class192.aClass292_2177.method3937(-1178539332);
			if (i_16_ > i_14_) {
				long l = (5800580581361644497L * aLong3528 - Class192.aClass292_2177.method3939(-2122078050));
				if (l > 0L) {
					long l_17_ = (long) (i_16_ - i_14_) * (10000L * l / (long) i_14_);
					long l_18_ = ((Class249.method3450(2118297509) - 5800580581361644497L * aLong3528) * 10000L);
					if (l_18_ < l_17_)
						i_15_ = (int) (((long) (i_16_ - i_14_) * l_18_ * 100L / l_17_) + (long) (100 * i_14_));
					else
						i_15_ = i_16_ * 100;
				}
			}
		} else {
			anInt3531 = i_14_ * 115606781;
			aLong3528 = Class249.method3450(1952314798) * -4946995429357894351L;
		}
		return i_15_;
	}

	abstract void method4235(boolean bool, int i, int i_19_);

	public void method210(boolean bool) {
		int i = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 2061925370)) + aClass392_3527.anInt4066 * 316945261);
		int i_20_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -1577504441)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i, i_20_, -502321139);
		method4230(bool, i, i_20_, -1856297842);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1333076069) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class192.aClass292_2177.method3940(847678056).anInt3425 * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i, (4 + (i_20_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) 13);
	}

	public void method212(boolean bool) {
		int i = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 1474318244)) + aClass392_3527.anInt4066 * 316945261);
		int i_21_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -1530274769)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i, i_21_, 2104496177);
		method4230(bool, i, i_21_, 919080317);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1945625692) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class192.aClass292_2177.method3940(1290976776).anInt3425 * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i, (4 + (i_21_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) -2);
	}

	public void method208(boolean bool) {
		int i = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 1500873149)) + aClass392_3527.anInt4066 * 316945261);
		int i_22_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -1219492464)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i, i_22_, 1326896899);
		method4230(bool, i, i_22_, -1172510311);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1823197198) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class192.aClass292_2177.method3940(253886845).anInt3425 * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i, (4 + (i_22_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) 61);
	}

	public void method213(boolean bool) {
		int i = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 1756021429)) + aClass392_3527.anInt4066 * 316945261);
		int i_23_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -1044843644)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i, i_23_, -101891465);
		method4230(bool, i, i_23_, -340520028);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1604911347) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class192.aClass292_2177.method3940(-1641098257).anInt3425) * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i, (4 + (i_23_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) 3);
	}

	abstract void method4236(boolean bool, int i, int i_24_);

	public boolean method215() {
		boolean bool = true;
		if (!aClass461_3529.method5580(aClass392_3527.anInt4071 * 1694830205, -964514165))
			bool = false;
		if (!aClass461_3532.method5580(1694830205 * aClass392_3527.anInt4071, -964514165))
			bool = false;
		return bool;
	}

	public boolean method207() {
		boolean bool = true;
		if (!aClass461_3529.method5580(aClass392_3527.anInt4071 * 1694830205, -964514165))
			bool = false;
		if (!aClass461_3532.method5580(1694830205 * aClass392_3527.anInt4071, -964514165))
			bool = false;
		return bool;
	}

	public void method217() {
		Class2 class2 = Class515.method6324(aClass461_3532, aClass392_3527.anInt4071 * 1694830205, Class196.aClass410_2202, 1661269947);
		aClass184_3530 = (Class677.aClass167_8609.method2089(class2, Class181.method2719(aClass461_3529, 1694830205 * aClass392_3527.anInt4071), true));
	}

	Class319(JS5ResourceProvider class461, JS5ResourceProvider class461_25_, Class392 class392) {
		aClass461_3529 = class461;
		aClass461_3532 = class461_25_;
		aClass392_3527 = class392;
	}

	abstract void method4237(boolean bool, int i, int i_26_);

	public void method211(boolean bool) {
		int i = ((aClass392_3527.aClass395_4064.method4878(aClass392_3527.anInt4068 * -1755858667, -125739413 * client.anInt11152, 1658964028)) + aClass392_3527.anInt4066 * 316945261);
		int i_27_ = ((aClass392_3527.aClass399_4065.method4906(-840030237 * aClass392_3527.anInt4067, -358673315 * client.anInt11153, -180174444)) + aClass392_3527.anInt4069 * 1917287119);
		method4232(bool, i, i_27_, 1687437164);
		method4230(bool, i, i_27_, 1309832073);
		String string = Class192.aClass292_2177.method3936((byte) 11);
		if (Class249.method3450(1393992538) - 5800580581361644497L * aLong3528 > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class192.aClass292_2177.method3940(-199399274).anInt3425 * -783382047).append(")").toString();
		aClass184_3530.method2742(string, -1755858667 * aClass392_3527.anInt4068 / 2 + i, (4 + (i_27_ + -840030237 * aClass392_3527.anInt4067 / 2) + aClass392_3527.anInt4070 * -2068781397), aClass392_3527.anInt4072 * -369678755, -1, (byte) 20);
	}

	public boolean method214() {
		boolean bool = true;
		if (!aClass461_3529.method5580(aClass392_3527.anInt4071 * 1694830205, -964514165))
			bool = false;
		if (!aClass461_3532.method5580(1694830205 * aClass392_3527.anInt4071, -964514165))
			bool = false;
		return bool;
	}

	public void method206(int i) {
		Class2 class2 = Class515.method6324(aClass461_3532, aClass392_3527.anInt4071 * 1694830205, Class196.aClass410_2202, 1601673090);
		aClass184_3530 = (Class677.aClass167_8609.method2089(class2, Class181.method2719(aClass461_3529, 1694830205 * aClass392_3527.anInt4071), true));
	}

	static final void method4238(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		class251.zoom2d = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -1926815261;
		Class668.method8011(class251, 263642117);
		if (-1 == class251.anInt2546 * -809980533 && !class234.aBool2379)
			Class294.method3975(class251.anInt2559 * -1591767037, (byte) -45);
	}

	static final void method4239(Class668 class668, byte i) {
		int i_28_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (Class542_Sub1.aClass4_10720 != null) {
			Class536 class536 = Class542_Sub1.aClass4_10720.method556((long) i_28_);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class536 != null ? 1 : 0;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static int method4240(int i) {
		if (-1 == JS5Archive.anInt554 * 819264887) {
			JS5Archive[] class46s = ShadowQualitySetting.method10035(1712884762);
			for (int i_29_ = 0; i_29_ < class46s.length; i_29_++) {
				JS5Archive class46 = class46s[i_29_];
				if (-960064969 * class46.anInt560 > 819264887 * JS5Archive.anInt554)
					JS5Archive.anInt554 = 1612792129 * class46.anInt560;
			}
			JS5Archive.anInt554 += 1071443015;
		}
		return JS5Archive.anInt554 * 819264887;
	}
}
