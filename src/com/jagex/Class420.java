/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class420 implements Interface2 {
	Class205 aClass205_4583;
	Class205 aClass205_4584;
	Class205 aClass205_4585 = new Class205(20);
	Class180 aClass180_4586;
	int[] anIntArray4587;
	Class459 aClass459_4588;
	Class459 aClass459_4589;
	Map aMap4590;
	public static Class273 aClass273_4591;

	public int method6677(byte i) {
		return method6698(false, 1753775384);
	}

	public Class420(Class180 class180, Class459 class459, Class459 class459_0_, int[] is) {
		aClass205_4583 = new Class205(20);
		aClass180_4586 = null;
		aMap4590 = null;
		aClass180_4586 = class180;
		aClass459_4588 = class459;
		aClass459_4589 = class459_0_;
		anIntArray4587 = is;
		aClass205_4584 = new Class205(20);
	}

	public void method6678(int i) {
		aMap4590 = null;
	}

	public int method6679(boolean bool) {
		if (anIntArray4587 == null)
			return 0;
		if (!bool && null != aMap4590)
			return anIntArray4587.length * 2;
		int i = 0;
		for (int i_1_ = 0; i_1_ < anIntArray4587.length; i_1_++) {
			int i_2_ = anIntArray4587[i_1_];
			if (aClass459_4588.method7480(i_2_, -577079820))
				i++;
			if (aClass459_4589.method7480(i_2_, 1507477770))
				i++;
		}
		return i;
	}

	public void method6680() {
		aClass205_4583.method3820(2089581560);
		aClass205_4585.method3820(109378241);
		if (aClass205_4584 != null)
			aClass205_4584.method3820(-64739730);
	}

	public int method6681(byte i) {
		if (null == anIntArray4587)
			return 0;
		return 2 * anIntArray4587.length;
	}

	public void method6682(Interface50 interface50) {
		aMap4590 = new HashMap(anIntArray4587.length);
		for (int i = 0; i < anIntArray4587.length; i++) {
			int i_3_ = anIntArray4587[i];
			Class22 class22 = Class581.method9666(aClass459_4589, i_3_, this, (byte) -11);
			byte[] is = aClass459_4588.method7512(i_3_, 1447980132);
			Object object = interface50.method341(is, class22, true, (short) -20289);
			aMap4590.put(Integer.valueOf(i), new Class20(object, class22));
		}
	}

	public void method6683() {
		aClass205_4583.method3820(-1911124939);
		aClass205_4585.method3820(1426596658);
		if (aClass205_4584 != null)
			aClass205_4584.method3820(-1555055130);
	}

	public Object method6684(Interface50 interface50, int i, boolean bool, boolean bool_4_, byte i_5_) {
		if (-1 == i)
			return null;
		if (anIntArray4587 != null) {
			for (int i_6_ = 0; i_6_ < anIntArray4587.length; i_6_++) {
				if (anIntArray4587[i_6_] == i)
					return (((Class20) aMap4590.get(Integer.valueOf(i_6_))).anObject205);
			}
		}
		Object object = aClass205_4585.method3787((long) (i << 1 | (bool_4_ ? 1 : 0)));
		if (null != object)
			return object;
		byte[] is = aClass459_4588.method7512(i, 1447980132);
		if (is == null)
			return null;
		Class22 class22 = method6688(interface50, i, bool, false, -1806147219);
		if (null == class22)
			return null;
		object = interface50.method341(is, class22, bool_4_, (short) -6072);
		aClass205_4585.method3790(object, (long) (i << 1 | (bool_4_ ? 1 : 0)));
		return object;
	}

	public void method6685(int i) {
		aClass205_4583.method3793((byte) 82);
		aClass205_4585.method3793((byte) 123);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 53);
	}

	public void method6686(int i, byte i_7_) {
		aClass205_4583.method3792(i, (byte) 12);
		aClass205_4585.method3792(i, (byte) -14);
		if (null != aClass205_4584)
			aClass205_4584.method3792(i, (byte) 8);
	}

	public void method6687(int i) {
		aClass205_4583.method3820(1545575814);
		aClass205_4585.method3820(-906203026);
		if (aClass205_4584 != null)
			aClass205_4584.method3820(-1888667256);
	}

	public Class147[] method10(Class180 class180, int i, int i_8_) {
		if (null == aClass205_4584)
			return null;
		if (class180 != null) {
			if (aClass180_4586 != class180)
				aClass205_4584.method3793((byte) 76);
			aClass180_4586 = class180;
		} else
			class180 = aClass180_4586;
		if (class180 != null) {
			Class147[] class147s = (Class147[]) aClass205_4584.method3787((long) i);
			if (class147s == null) {
				Class185[] class185s = Class165.method2655(aClass459_4588, i, 0);
				if (null != class185s && class185s.length > 0) {
					class147s = new Class147[class185s.length];
					for (int i_9_ = 0; i_9_ < class185s.length; i_9_++)
						class147s[i_9_] = class180.method3271(class185s[i_9_], true);
					aClass205_4584.method3790(class147s, (long) i);
				}
			}
			return class147s;
		}
		return null;
	}

	Class22 method6688(Interface50 interface50, int i, boolean bool, boolean bool_10_, int i_11_) {
		if (-1 == i)
			return null;
		if (null != anIntArray4587) {
			for (int i_12_ = 0; i_12_ < anIntArray4587.length; i_12_++) {
				if (anIntArray4587[i_12_] == i)
					return ((Class22) (((Class20) aMap4590.get(Integer.valueOf(i_12_))).anObject204));
			}
		}
		if (bool_10_)
			aClass459_4588.method7480(i, -26859794);
		Class22 class22 = (Class22) aClass205_4583.method3787((long) i);
		if (null != class22)
			return class22;
		class22 = Class581.method9666(aClass459_4589, i, this, (byte) 29);
		if (class22 == null)
			return null;
		if (bool)
			aClass205_4583.method3790(class22, (long) i);
		return class22;
	}

	public void method6689(Interface50 interface50) {
		aMap4590 = new HashMap(anIntArray4587.length);
		for (int i = 0; i < anIntArray4587.length; i++) {
			int i_13_ = anIntArray4587[i];
			Class22 class22 = Class581.method9666(aClass459_4589, i_13_, this, (byte) 67);
			byte[] is = aClass459_4588.method7512(i_13_, 1447980132);
			Object object = interface50.method341(is, class22, true, (short) -28792);
			aMap4590.put(Integer.valueOf(i), new Class20(object, class22));
		}
	}

	public Class22 method6690(Interface50 interface50, int i, int i_14_) {
		return method6688(interface50, i, true, true, 1501330256);
	}

	public void method6691(Interface50 interface50) {
		aMap4590 = new HashMap(anIntArray4587.length);
		for (int i = 0; i < anIntArray4587.length; i++) {
			int i_15_ = anIntArray4587[i];
			Class22 class22 = Class581.method9666(aClass459_4589, i_15_, this, (byte) -69);
			byte[] is = aClass459_4588.method7512(i_15_, 1447980132);
			Object object = interface50.method341(is, class22, true, (short) -26439);
			aMap4590.put(Integer.valueOf(i), new Class20(object, class22));
		}
	}

	public void method6692() {
		aMap4590 = null;
	}

	public void method6693() {
		aMap4590 = null;
	}

	public int method6694() {
		return method6698(false, 1753775384);
	}

	public void method6695() {
		aClass205_4583.method3793((byte) 127);
		aClass205_4585.method3793((byte) 35);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 49);
	}

	public int method6696() {
		if (null == anIntArray4587)
			return 0;
		return 2 * anIntArray4587.length;
	}

	public Object method6697(Interface50 interface50, int i, boolean bool, boolean bool_16_) {
		if (-1 == i)
			return null;
		if (anIntArray4587 != null) {
			for (int i_17_ = 0; i_17_ < anIntArray4587.length; i_17_++) {
				if (anIntArray4587[i_17_] == i)
					return (((Class20) aMap4590.get(Integer.valueOf(i_17_))).anObject205);
			}
		}
		Object object = aClass205_4585.method3787((long) (i << 1 | (bool_16_ ? 1 : 0)));
		if (null != object)
			return object;
		byte[] is = aClass459_4588.method7512(i, 1447980132);
		if (is == null)
			return null;
		Class22 class22 = method6688(interface50, i, bool, false, -183543673);
		if (null == class22)
			return null;
		object = interface50.method341(is, class22, bool_16_, (short) -29564);
		aClass205_4585.method3790(object, (long) (i << 1 | (bool_16_ ? 1 : 0)));
		return object;
	}

	public int method6698(boolean bool, int i) {
		if (anIntArray4587 == null)
			return 0;
		if (!bool && null != aMap4590)
			return anIntArray4587.length * 2;
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < anIntArray4587.length; i_19_++) {
			int i_20_ = anIntArray4587[i_19_];
			if (aClass459_4588.method7480(i_20_, 2090757287))
				i_18_++;
			if (aClass459_4589.method7480(i_20_, 1601512635))
				i_18_++;
		}
		return i_18_;
	}

	public Class22 method6699(Interface50 interface50, int i) {
		return method6688(interface50, i, true, true, -1482727963);
	}

	public Object method6700(Interface50 interface50, int i, boolean bool, boolean bool_21_) {
		if (-1 == i)
			return null;
		if (anIntArray4587 != null) {
			for (int i_22_ = 0; i_22_ < anIntArray4587.length; i_22_++) {
				if (anIntArray4587[i_22_] == i)
					return (((Class20) aMap4590.get(Integer.valueOf(i_22_))).anObject205);
			}
		}
		Object object = aClass205_4585.method3787((long) (i << 1 | (bool_21_ ? 1 : 0)));
		if (null != object)
			return object;
		byte[] is = aClass459_4588.method7512(i, 1447980132);
		if (is == null)
			return null;
		Class22 class22 = method6688(interface50, i, bool, false, -999088728);
		if (null == class22)
			return null;
		object = interface50.method341(is, class22, bool_21_, (short) -29953);
		aClass205_4585.method3790(object, (long) (i << 1 | (bool_21_ ? 1 : 0)));
		return object;
	}

	Class22 method6701(Interface50 interface50, int i, boolean bool, boolean bool_23_) {
		if (-1 == i)
			return null;
		if (null != anIntArray4587) {
			for (int i_24_ = 0; i_24_ < anIntArray4587.length; i_24_++) {
				if (anIntArray4587[i_24_] == i)
					return ((Class22) (((Class20) aMap4590.get(Integer.valueOf(i_24_))).anObject204));
			}
		}
		if (bool_23_)
			aClass459_4588.method7480(i, 1888734667);
		Class22 class22 = (Class22) aClass205_4583.method3787((long) i);
		if (null != class22)
			return class22;
		class22 = Class581.method9666(aClass459_4589, i, this, (byte) -19);
		if (class22 == null)
			return null;
		if (bool)
			aClass205_4583.method3790(class22, (long) i);
		return class22;
	}

	public void method6702() {
		aClass205_4583.method3793((byte) 16);
		aClass205_4585.method3793((byte) 16);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 77);
	}

	public void method6703() {
		aClass205_4583.method3793((byte) 13);
		aClass205_4585.method3793((byte) 94);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 35);
	}

	public void method6704() {
		aClass205_4583.method3793((byte) 28);
		aClass205_4585.method3793((byte) 31);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 124);
	}

	public void method6705() {
		aClass205_4583.method3793((byte) 63);
		aClass205_4585.method3793((byte) 121);
		if (aClass205_4584 != null)
			aClass205_4584.method3793((byte) 69);
	}

	public void method6706(int i) {
		aClass205_4583.method3792(i, (byte) -72);
		aClass205_4585.method3792(i, (byte) 53);
		if (null != aClass205_4584)
			aClass205_4584.method3792(i, (byte) 2);
	}

	public int method9(int i, byte i_25_) {
		Class147[] class147s = method10(aClass180_4586, i, -1401894144);
		if (null != class147s)
			return class147s[0].method42();
		return 0;
	}

	public void method6707(Interface50 interface50, int i) {
		aMap4590 = new HashMap(anIntArray4587.length);
		for (int i_26_ = 0; i_26_ < anIntArray4587.length; i_26_++) {
			int i_27_ = anIntArray4587[i_26_];
			Class22 class22 = Class581.method9666(aClass459_4589, i_27_, this, (byte) -12);
			byte[] is = aClass459_4588.method7512(i_27_, 1447980132);
			Object object = interface50.method341(is, class22, true, (short) -2521);
			aMap4590.put(Integer.valueOf(i_26_), new Class20(object, class22));
		}
	}

	public void method6708() {
		aClass205_4583.method3820(33631616);
		aClass205_4585.method3820(-1552422444);
		if (aClass205_4584 != null)
			aClass205_4584.method3820(1181951188);
	}

	public void method6709() {
		aClass205_4583.method3820(1034328945);
		aClass205_4585.method3820(-157006177);
		if (aClass205_4584 != null)
			aClass205_4584.method3820(2087641786);
	}

	public Class147[] method8(Class180 class180, int i) {
		if (null == aClass205_4584)
			return null;
		if (class180 != null) {
			if (aClass180_4586 != class180)
				aClass205_4584.method3793((byte) 57);
			aClass180_4586 = class180;
		} else
			class180 = aClass180_4586;
		if (class180 != null) {
			Class147[] class147s = (Class147[]) aClass205_4584.method3787((long) i);
			if (class147s == null) {
				Class185[] class185s = Class165.method2655(aClass459_4588, i, 0);
				if (null != class185s && class185s.length > 0) {
					class147s = new Class147[class185s.length];
					for (int i_28_ = 0; i_28_ < class185s.length; i_28_++)
						class147s[i_28_] = class180.method3271(class185s[i_28_], true);
					aClass205_4584.method3790(class147s, (long) i);
				}
			}
			return class147s;
		}
		return null;
	}

	public int method11(int i) {
		Class147[] class147s = method10(aClass180_4586, i, -105909968);
		if (null != class147s)
			return class147s[0].method42();
		return 0;
	}

	public int method12(int i) {
		Class147[] class147s = method10(aClass180_4586, i, -492189825);
		if (null != class147s)
			return class147s[0].method42();
		return 0;
	}

	static final void method6710(Class665 class665, int i) {
		if (client.anInt11048 * -1927019389 == 1) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4390, client.aClass109_11066.aClass2_1367, (byte) -41);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
		}
	}

	public static float method6711(Class438 class438, int i) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = 1.5707963267948966 - Math.acos((double) class442.aFloat4915);
		class442.method7141();
		return (float) d;
	}

	static final void method6712(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class596.method9905(class243, class240, class665, 318492261);
	}

	static void method6713(byte i) {
		Class554_Sub1.anIntArray10810[44] = 71;
		Class554_Sub1.anIntArray10810[45] = 26;
		Class554_Sub1.anIntArray10810[46] = 72;
		Class554_Sub1.anIntArray10810[47] = 73;
		Class554_Sub1.anIntArray10810[59] = 57;
		Class554_Sub1.anIntArray10810[61] = 27;
		Class554_Sub1.anIntArray10810[91] = 42;
		Class554_Sub1.anIntArray10810[92] = 74;
		Class554_Sub1.anIntArray10810[93] = 43;
		Class554_Sub1.anIntArray10810[192] = 28;
		Class554_Sub1.anIntArray10810[222] = 58;
		Class554_Sub1.anIntArray10810[520] = 59;
	}
}
