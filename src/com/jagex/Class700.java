/* Class700 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class700 {
	protected static final int anInt8781 = 2;
	protected static final int anInt8782 = 1;
	public static final int anInt8783 = 3;
	protected Class527_Sub31 aClass527_Sub31_8784;
	protected int anInt8785;

	abstract int method14279(byte i);

	void method14280(int i) {
		if (method14289(i, 1526438896) != 3)
			method14284(i, -1613750355);
	}

	abstract void method14281(int i);

	void method14282(int i, int i_0_) {
		if (method14289(i, -181316000) != 3)
			method14284(i, 800858924);
	}

	void method14283(int i) {
		if (method14289(i, -1505658207) != 3)
			method14284(i, -883987375);
	}

	abstract void method14284(int i, int i_1_);

	abstract int method14285(int i);

	abstract int method14286(int i);

	abstract void method14287(int i);

	Class700(int i, Class527_Sub31 class527_sub31) {
		anInt8785 = i * -380424163;
		aClass527_Sub31_8784 = class527_sub31;
	}

	abstract int method14288();

	Class700(Class527_Sub31 class527_sub31) {
		aClass527_Sub31_8784 = class527_sub31;
		anInt8785 = method14279((byte) -58) * -380424163;
	}

	abstract int method14289(int i, int i_2_);

	void method14290(int i) {
		if (method14289(i, 1341967793) != 3)
			method14284(i, -1446013039);
	}

	public static void method14291(int i) {
		if (client.aBool11188) {
			Class243 class243 = Class447.method7260(847840847 * Class275.anInt3157, 968228363 * client.anInt11078, 92768371);
			if (class243 != null && null != class243.anObjectArray2618) {
				Class527_Sub33 class527_sub33 = new Class527_Sub33();
				class527_sub33.aClass243_10648 = class243;
				class527_sub33.anObjectArray10650 = class243.anObjectArray2618;
				Class491.method7980(class527_sub33, -1412066083);
			}
			client.anInt11185 = 1544143943;
			client.anInt11190 = 789917847;
			client.aBool11188 = false;
			if (null != class243)
				Class430.method6876(class243, (byte) 86);
		}
	}

	static final void method14292(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class235.method4356(class243, class665, 1738675576);
	}
}
