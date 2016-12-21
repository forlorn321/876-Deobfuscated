/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class410 implements Interface4 {
	Class461 aClass461_4322;
	Class199 aClass199_4323;
	Class199 aClass199_4324 = new Class199(20);
	Class461 aClass461_4325;
	int[] anIntArray4326;
	Class199 aClass199_4327;
	Class167 aClass167_4328;
	Map aMap4329;

	public void method4975() {
		aMap4329 = null;
	}

	public void method4976(Interface51 interface51, int i) {
		aMap4329 = new HashMap(anIntArray4326.length);
		for (int i_0_ = 0; i_0_ < anIntArray4326.length; i_0_++) {
			int i_1_ = anIntArray4326[i_0_];
			Class2 class2 = Class515.method6324(aClass461_4322, i_1_, this, 1366992120);
			byte[] is = aClass461_4325.method5595(i_1_, -1754278010);
			Object object = interface51.method350(is, class2, true, 1959556860);
			aMap4329.put(Integer.valueOf(i_0_), new Class7(object, class2));
		}
	}

	public void method4977(int i) {
		aMap4329 = null;
	}

	public int method4978(int i) {
		if (anIntArray4326 == null)
			return 0;
		return 2 * anIntArray4326.length;
	}

	public int method4979(boolean bool, byte i) {
		if (null == anIntArray4326)
			return 0;
		if (!bool && aMap4329 != null)
			return 2 * anIntArray4326.length;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < anIntArray4326.length; i_3_++) {
			int i_4_ = anIntArray4326[i_3_];
			if (aClass461_4325.method5580(i_4_, -964514165))
				i_2_++;
			if (aClass461_4322.method5580(i_4_, -964514165))
				i_2_++;
		}
		return i_2_;
	}

	public int method44(int i) {
		Class143[] class143s = method38(aClass167_4328, i, -69529390);
		if (null != class143s)
			return class143s[0].method12();
		return 0;
	}

	public Object method4980(Interface51 interface51, int i, boolean bool, boolean bool_5_, byte i_6_) {
		if (-1 == i)
			return null;
		if (null != anIntArray4326) {
			for (int i_7_ = 0; i_7_ < anIntArray4326.length; i_7_++) {
				if (i == anIntArray4326[i_7_])
					return (((Class7) aMap4329.get(Integer.valueOf(i_7_))).anObject117);
			}
		}
		Object object = aClass199_4324.method2886((long) (i << 1 | (bool_5_ ? 1 : 0)));
		if (null != object)
			return object;
		byte[] is = aClass461_4325.method5595(i, -1550455088);
		if (is == null)
			return null;
		Class2 class2 = method4995(interface51, i, bool, false, (byte) 1);
		if (null == class2)
			return null;
		object = interface51.method350(is, class2, bool_5_, 2140687052);
		aClass199_4324.method2881(object, (long) (i << 1 | (bool_5_ ? 1 : 0)));
		return object;
	}

	public Class2 method4981(Interface51 interface51, int i, int i_8_) {
		return method4995(interface51, i, true, true, (byte) 1);
	}

	public Class143[] method41(Class167 class167, int i) {
		if (null == aClass199_4327)
			return null;
		if (null != class167) {
			if (aClass167_4328 != class167)
				aClass199_4327.method2884((byte) -108);
			aClass167_4328 = class167;
		} else
			class167 = aClass167_4328;
		if (class167 != null) {
			Class143[] class143s = (Class143[]) aClass199_4327.method2886((long) i);
			if (class143s == null) {
				Class179[] class179s = Class181.method2720(aClass461_4325, i, 0);
				if (null != class179s && class179s.length > 0) {
					class143s = new Class143[class179s.length];
					for (int i_9_ = 0; i_9_ < class179s.length; i_9_++)
						class143s[i_9_] = class167.method2082(class179s[i_9_], true);
					aClass199_4327.method2881(class143s, (long) i);
				}
			}
			return class143s;
		}
		return null;
	}

	public void method4982(int i) {
		aClass199_4323.method2884((byte) -36);
		aClass199_4324.method2884((byte) -90);
		if (aClass199_4327 != null)
			aClass199_4327.method2884((byte) -76);
	}

	public void method4983(int i, int i_10_) {
		aClass199_4323.method2883(i, -1195339899);
		aClass199_4324.method2883(i, -1762986175);
		if (null != aClass199_4327)
			aClass199_4327.method2883(i, -1358286007);
	}

	public void method4984(int i) {
		aClass199_4323.method2892(-908527365);
		aClass199_4324.method2892(-1052220843);
		if (null != aClass199_4327)
			aClass199_4327.method2892(1394207003);
	}

	public Class143[] method38(Class167 class167, int i, int i_11_) {
		if (null == aClass199_4327)
			return null;
		if (null != class167) {
			if (aClass167_4328 != class167)
				aClass199_4327.method2884((byte) -116);
			aClass167_4328 = class167;
		} else
			class167 = aClass167_4328;
		if (class167 != null) {
			Class143[] class143s = (Class143[]) aClass199_4327.method2886((long) i);
			if (class143s == null) {
				Class179[] class179s = Class181.method2720(aClass461_4325, i, 0);
				if (null != class179s && class179s.length > 0) {
					class143s = new Class143[class179s.length];
					for (int i_12_ = 0; i_12_ < class179s.length; i_12_++)
						class143s[i_12_] = class167.method2082(class179s[i_12_], true);
					aClass199_4327.method2881(class143s, (long) i);
				}
			}
			return class143s;
		}
		return null;
	}

	public int method39(int i, int i_13_) {
		Class143[] class143s = method38(aClass167_4328, i, 1495027046);
		if (null != class143s)
			return class143s[0].method12();
		return 0;
	}

	public int method4985(int i) {
		return method4979(false, (byte) 0);
	}

	public void method4986() {
		aMap4329 = null;
	}

	public void method4987() {
		aMap4329 = null;
	}

	public int method4988() {
		return method4979(false, (byte) 62);
	}

	public void method4989() {
		aClass199_4323.method2892(-711886696);
		aClass199_4324.method2892(-350508082);
		if (null != aClass199_4327)
			aClass199_4327.method2892(-820863930);
	}

	public void method4990() {
		aClass199_4323.method2884((byte) -108);
		aClass199_4324.method2884((byte) -30);
		if (aClass199_4327 != null)
			aClass199_4327.method2884((byte) -50);
	}

	public void method4991() {
		aClass199_4323.method2884((byte) -115);
		aClass199_4324.method2884((byte) -111);
		if (aClass199_4327 != null)
			aClass199_4327.method2884((byte) -12);
	}

	public void method4992(int i) {
		aClass199_4323.method2883(i, -1389371451);
		aClass199_4324.method2883(i, -1936516585);
		if (null != aClass199_4327)
			aClass199_4327.method2883(i, -1855863670);
	}

	public void method4993(int i) {
		aClass199_4323.method2883(i, -1163772619);
		aClass199_4324.method2883(i, -2009096119);
		if (null != aClass199_4327)
			aClass199_4327.method2883(i, -1594716159);
	}

	public void method4994() {
		aClass199_4323.method2892(922236278);
		aClass199_4324.method2892(1435797521);
		if (null != aClass199_4327)
			aClass199_4327.method2892(-233310967);
	}

	Class2 method4995(Interface51 interface51, int i, boolean bool, boolean bool_14_, byte i_15_) {
		if (-1 == i)
			return null;
		if (null != anIntArray4326) {
			for (int i_16_ = 0; i_16_ < anIntArray4326.length; i_16_++) {
				if (i == anIntArray4326[i_16_])
					return ((Class2) (((Class7) aMap4329.get(Integer.valueOf(i_16_))).anObject118));
			}
		}
		if (bool_14_)
			aClass461_4325.method5580(i, -964514165);
		Class2 class2 = (Class2) aClass199_4323.method2886((long) i);
		if (class2 != null)
			return class2;
		class2 = Class515.method6324(aClass461_4322, i, this, 1981454044);
		if (class2 == null)
			return null;
		if (bool)
			aClass199_4323.method2881(class2, (long) i);
		return class2;
	}

	public void method4996() {
		aClass199_4323.method2892(-389624024);
		aClass199_4324.method2892(-122223518);
		if (null != aClass199_4327)
			aClass199_4327.method2892(-451795854);
	}

	public Class143[] method40(Class167 class167, int i) {
		if (null == aClass199_4327)
			return null;
		if (null != class167) {
			if (aClass167_4328 != class167)
				aClass199_4327.method2884((byte) -52);
			aClass167_4328 = class167;
		} else
			class167 = aClass167_4328;
		if (class167 != null) {
			Class143[] class143s = (Class143[]) aClass199_4327.method2886((long) i);
			if (class143s == null) {
				Class179[] class179s = Class181.method2720(aClass461_4325, i, 0);
				if (null != class179s && class179s.length > 0) {
					class143s = new Class143[class179s.length];
					for (int i_17_ = 0; i_17_ < class179s.length; i_17_++)
						class143s[i_17_] = class167.method2082(class179s[i_17_], true);
					aClass199_4327.method2881(class143s, (long) i);
				}
			}
			return class143s;
		}
		return null;
	}

	public Class410(Class167 class167, Class461 class461, Class461 class461_18_, int[] is) {
		aClass199_4323 = new Class199(20);
		aClass167_4328 = null;
		aMap4329 = null;
		aClass167_4328 = class167;
		aClass461_4325 = class461;
		aClass461_4322 = class461_18_;
		anIntArray4326 = is;
		aClass199_4327 = new Class199(20);
	}

	public Class143[] method42(Class167 class167, int i) {
		if (null == aClass199_4327)
			return null;
		if (null != class167) {
			if (aClass167_4328 != class167)
				aClass199_4327.method2884((byte) -66);
			aClass167_4328 = class167;
		} else
			class167 = aClass167_4328;
		if (class167 != null) {
			Class143[] class143s = (Class143[]) aClass199_4327.method2886((long) i);
			if (class143s == null) {
				Class179[] class179s = Class181.method2720(aClass461_4325, i, 0);
				if (null != class179s && class179s.length > 0) {
					class143s = new Class143[class179s.length];
					for (int i_19_ = 0; i_19_ < class179s.length; i_19_++)
						class143s[i_19_] = class167.method2082(class179s[i_19_], true);
					aClass199_4327.method2881(class143s, (long) i);
				}
			}
			return class143s;
		}
		return null;
	}

	public int method43(int i) {
		Class143[] class143s = method38(aClass167_4328, i, 1667859570);
		if (null != class143s)
			return class143s[0].method12();
		return 0;
	}

	public int method4997() {
		return method4979(false, (byte) 51);
	}

	static Class581 method4998(RSByteBuffer class536_sub33, int i) {
		int i_20_ = class536_sub33.readUnsignedByte();
		int i_21_ = class536_sub33.readUnsignedByte();
		return new Class581(i_20_, i_21_);
	}

	public static boolean method4999(int i, boolean bool, int i_22_) {
		if (i == Class542_Sub1.anInt10713 * -401760391)
			Class542_Sub1.aBool10728 = bool;
		else if (i == 987302673 * Class542_Sub1.anInt10721)
			Class542_Sub1.aBool10726 = bool;
		else if (1876841869 * Class542_Sub1.anInt10701 == i)
			Class542_Sub1.aBool10727 = bool;
		else
			return false;
		return true;
	}

	static final void method5000(Class668 class668, byte i) {
		boolean bool = false;
		if (client.aBool10984) {
			try {
				Object object = (Class412.aClass412_4387.method5006((new Object[] { Integer.valueOf(Class75.anInt819 * -1158267747), Boolean.valueOf((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte12197) == 1), Integer.valueOf(class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) }), (byte) 16));
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = bool ? 1 : 0;
	}
}
