/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class591 implements Interface71 {
	boolean aBool7792;
	Class605 aClass605_7793 = Class605.aClass605_7870;
	int anInt7794;
	Class461 aClass461_7795;
	Interface69 anInterface69_7796;
	Class360 aClass360_7797;
	Class199 aClass199_7798;
	int anInt7799;
	boolean aBool7800;
	byte[] aByteArray7801;

	public void method183() {
		if (aClass605_7793 == Class605.aClass605_7869) {
			byte[] is = aClass461_7795.method5595(955105393 * anInt7794, -1261413169);
			if (null != is) {
				aByteArray7801 = is;
				method7102(646452665);
				aClass605_7793 = Class605.aClass605_7871;
				if (null != anInterface69_7796)
					anInterface69_7796.method428(this, is.length, 955105393 * anInt7794, false, -1821658823);
			}
		}
	}

	public Class479 method456(int i) {
		Class479 class479 = new Class479(aClass360_7797);
		class479.method5765(this, -2057065349);
		return class479;
	}

	public int method472() {
		if (aByteArray7801 != null)
			return aByteArray7801.length;
		return 0;
	}

	public Class605 method438(byte i) {
		return aClass605_7793;
	}

	public boolean method439(int i) {
		return false;
	}

	void method7102(int i) {
		/* empty */
	}

	public byte[] method440(int i, int i_0_) {
		if (null != anInterface69_7796)
			anInterface69_7796.method426(this, 1585746451);
		return aByteArray7801;
	}

	public int method441(int i) {
		if (aByteArray7801 != null)
			return aByteArray7801.length;
		return 0;
	}

	public Class489 method442(byte i) {
		return Class489.aClass489_5455;
	}

	public int method443(int i) {
		return 955105393 * anInt7794;
	}

	public void method445(RSByteBuffer class536_sub33, byte i) {
		if (null != aClass199_7798) {
			if (anInterface69_7796 != null)
				anInterface69_7796.method426(this, 710885701);
			if (aBool7792)
				throw new RuntimeException("");
			synchronized (aClass199_7798) {
				List list = method7107(520449203);
				if (list != null) {
					list.add(class536_sub33);
					anInt7799 += -1653929749 * class536_sub33.buffer.length;
					method7103(list, -1287954493 * anInt7799, 1067746540);
				}
			}
		}
	}

	public int method468() {
		if (aClass199_7798 == null)
			return 0;
		int i = 0;
		synchronized (aClass199_7798) {
			List list = method7107(1327451041);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public boolean method447(int i, byte i_1_) {
		if (aClass199_7798 == null)
			return false;
		boolean bool = false;
		synchronized (aClass199_7798) {
			List list = method7107(1510884528);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method446(int i) {
		return null != aClass199_7798 && aBool7800;
	}

	public int method455(byte i) {
		if (aClass199_7798 == null)
			return 0;
		int i_2_ = 0;
		synchronized (aClass199_7798) {
			List list = method7107(1057214844);
			if (list != null)
				i_2_ = list.size();
		}
		return i_2_;
	}

	public Class605 method451() {
		return aClass605_7793;
	}

	public void method475(RSByteBuffer class536_sub33) {
		if (null != aClass199_7798) {
			if (anInterface69_7796 != null)
				anInterface69_7796.method426(this, 491624114);
			if (aBool7792)
				throw new RuntimeException("");
			synchronized (aClass199_7798) {
				List list = method7107(1433658095);
				if (list != null) {
					list.add(class536_sub33);
					anInt7799 += -1653929749 * class536_sub33.buffer.length;
					method7103(list, -1287954493 * anInt7799, 1564927934);
				}
			}
		}
	}

	public boolean method450(byte i) {
		if (aClass199_7798 == null)
			return false;
		List list = method7107(1821605769);
		if (null == list || list.size() <= 0)
			aBool7792 = false;
		return aBool7792;
	}

	public void method353() {
		if (aClass605_7793 == Class605.aClass605_7869) {
			byte[] is = aClass461_7795.method5595(955105393 * anInt7794, -1220146622);
			if (null != is) {
				aByteArray7801 = is;
				method7102(616570388);
				aClass605_7793 = Class605.aClass605_7871;
				if (null != anInterface69_7796)
					anInterface69_7796.method428(this, is.length, 955105393 * anInt7794, false, -706411174);
			}
		}
	}

	public void method332(byte i) {
		if (aClass605_7793 == Class605.aClass605_7869) {
			byte[] is = aClass461_7795.method5595(955105393 * anInt7794, -1688679259);
			if (null != is) {
				aByteArray7801 = is;
				method7102(126795462);
				aClass605_7793 = Class605.aClass605_7871;
				if (null != anInterface69_7796)
					anInterface69_7796.method428(this, is.length, 955105393 * anInt7794, false, -1161139089);
			}
		}
	}

	public void method178() {
		if (aClass605_7793 == Class605.aClass605_7869) {
			byte[] is = aClass461_7795.method5595(955105393 * anInt7794, -1853781364);
			if (null != is) {
				aByteArray7801 = is;
				method7102(-464807340);
				aClass605_7793 = Class605.aClass605_7871;
				if (null != anInterface69_7796)
					anInterface69_7796.method428(this, is.length, 955105393 * anInt7794, false, -1895419199);
			}
		}
	}

	public Class479 method452() {
		Class479 class479 = new Class479(aClass360_7797);
		class479.method5765(this, -2057065349);
		return class479;
	}

	void method7103(List list, int i, int i_3_) {
		if (null != aClass199_7798 && list != null && i >= 0) {
			synchronized (aClass199_7798) {
				aClass199_7798.method2879((long) (955105393 * anInt7794));
				if (i <= aClass199_7798.method2891(453221733))
					aClass199_7798.method2882(list, (long) (955105393 * anInt7794), i, (byte) 29);
				else {
					aBool7800 = false;
					aBool7792 = false;
					anInt7799 = 0;
				}
			}
		}
	}

	public boolean method466(int i) {
		if (aClass199_7798 == null)
			return false;
		boolean bool = false;
		synchronized (aClass199_7798) {
			List list = method7107(1026615819);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public Class479 method453() {
		Class479 class479 = new Class479(aClass360_7797);
		class479.method5765(this, -2057065349);
		return class479;
	}

	public boolean method464(int i) {
		if (aClass199_7798 == null)
			return false;
		boolean bool = false;
		synchronized (aClass199_7798) {
			List list = method7107(819741763);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public void method449(boolean bool, int i) {
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1981225341);
		aBool7792 = bool;
	}

	public boolean method458() {
		return false;
	}

	void method7104() {
		/* empty */
	}

	void method7105() {
		/* empty */
	}

	void method7106() {
		/* empty */
	}

	public byte[] method459(int i) {
		if (null != anInterface69_7796)
			anInterface69_7796.method426(this, 1856604202);
		return aByteArray7801;
	}

	public byte[] method460(int i) {
		if (null != anInterface69_7796)
			anInterface69_7796.method426(this, 1364383908);
		return aByteArray7801;
	}

	public Class489 method461() {
		return Class489.aClass489_5455;
	}

	public int method469() {
		return 955105393 * anInt7794;
	}

	public RSByteBuffer method437(int i) {
		if (null == aClass199_7798)
			return null;
		RSByteBuffer class536_sub33 = null;
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1639079765);
		synchronized (aClass199_7798) {
			List list = method7107(688678371);
			if (list.size() > i)
				class536_sub33 = (RSByteBuffer) list.get(i);
		}
		return class536_sub33;
	}

	public RSByteBuffer method454(int i) {
		if (null == aClass199_7798)
			return null;
		RSByteBuffer class536_sub33 = null;
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1901387187);
		synchronized (aClass199_7798) {
			List list = method7107(494028655);
			if (list.size() > i)
				class536_sub33 = (RSByteBuffer) list.get(i);
		}
		return class536_sub33;
	}

	public RSByteBuffer method465(int i) {
		if (null == aClass199_7798)
			return null;
		RSByteBuffer class536_sub33 = null;
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1434512775);
		synchronized (aClass199_7798) {
			List list = method7107(813139043);
			if (list.size() > i)
				class536_sub33 = (RSByteBuffer) list.get(i);
		}
		return class536_sub33;
	}

	public RSByteBuffer method457(int i, int i_4_) {
		if (null == aClass199_7798)
			return null;
		RSByteBuffer class536_sub33 = null;
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1628741296);
		synchronized (aClass199_7798) {
			List list = method7107(531385763);
			if (list.size() > i)
				class536_sub33 = (RSByteBuffer) list.get(i);
		}
		return class536_sub33;
	}

	public void method477(RSByteBuffer class536_sub33) {
		if (null != aClass199_7798) {
			if (anInterface69_7796 != null)
				anInterface69_7796.method426(this, 658008714);
			if (aBool7792)
				throw new RuntimeException("");
			synchronized (aClass199_7798) {
				List list = method7107(1137312528);
				if (list != null) {
					list.add(class536_sub33);
					anInt7799 += -1653929749 * class536_sub33.buffer.length;
					method7103(list, -1287954493 * anInt7799, -1952575419);
				}
			}
		}
	}

	public boolean method479() {
		return false;
	}

	public boolean method467(int i) {
		if (aClass199_7798 == null)
			return false;
		boolean bool = false;
		synchronized (aClass199_7798) {
			List list = method7107(952923782);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method474() {
		return null != aClass199_7798 && aBool7800;
	}

	public boolean method462() {
		return null != aClass199_7798 && aBool7800;
	}

	public boolean method448() {
		if (aClass199_7798 == null)
			return false;
		List list = method7107(973088620);
		if (null == list || list.size() <= 0)
			aBool7792 = false;
		return aBool7792;
	}

	public int method471() {
		if (aClass199_7798 == null)
			return 0;
		int i = 0;
		synchronized (aClass199_7798) {
			List list = method7107(422041631);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public void method444(boolean bool) {
		if (anInterface69_7796 != null)
			anInterface69_7796.method426(this, 1692222891);
		aBool7792 = bool;
	}

	public boolean method473() {
		if (aClass199_7798 == null)
			return false;
		List list = method7107(609105396);
		if (null == list || list.size() <= 0)
			aBool7792 = false;
		return aBool7792;
	}

	List method7107(int i) {
		if (aClass199_7798 == null || !aBool7800)
			return null;
		Object object = null;
		List list;
		synchronized (aClass199_7798) {
			list = (List) aClass199_7798.method2886((long) (anInt7794 * 955105393));
			if (null == list && aBool7800) {
				list = new ArrayList();
				aClass199_7798.method2882(list, (long) (955105393 * anInt7794), 0, (byte) 4);
			}
		}
		return list;
	}

	void method7108() {
		/* empty */
	}

	public boolean method478(int i) {
		if (aClass199_7798 == null)
			return false;
		boolean bool = false;
		synchronized (aClass199_7798) {
			List list = method7107(1376163708);
			if (list != null && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method463() {
		return false;
	}

	public Class591(Class461 class461, int i, Class360 class360, Interface69 interface69, Class199 class199) {
		aClass461_7795 = class461;
		anInt7794 = i * -2118778735;
		aClass360_7797 = class360;
		anInterface69_7796 = interface69;
		aClass199_7798 = class199;
		aBool7800 = aClass199_7798 != null;
		aClass605_7793 = Class605.aClass605_7869;
	}

	public boolean method238() {
		return false;
	}

	public int method470() {
		if (aByteArray7801 != null)
			return aByteArray7801.length;
		return 0;
	}

	public void method476(RSByteBuffer class536_sub33) {
		if (null != aClass199_7798) {
			if (anInterface69_7796 != null)
				anInterface69_7796.method426(this, 1266971435);
			if (aBool7792)
				throw new RuntimeException("");
			synchronized (aClass199_7798) {
				List list = method7107(1327173008);
				if (list != null) {
					list.add(class536_sub33);
					anInt7799 += -1653929749 * class536_sub33.buffer.length;
					method7103(list, -1287954493 * anInt7799, 1187857389);
				}
			}
		}
	}

	public int method480() {
		if (aByteArray7801 != null)
			return aByteArray7801.length;
		return 0;
	}

	static final void method7109(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class520.method6348(class251, class234, class668, -538587312);
	}

	static final void method7110(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aShort11277;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aShort11278;
	}

	static final void method7111(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		int i_9_ = client.anInt11134 * -1402295105;
		int i_10_ = 746262305 * client.anInt11135;
		if (client.anInt11007 * 496146437 == 1) {
			Class143 class143 = (Class28.aClass143Array259[-377873525 * client.anInt11130 / 100]);
			class143.method1728(i_9_ - 8, i_10_ - 8);
		}
		if (2 == 496146437 * client.anInt11007) {
			Class143 class143 = (Class28.aClass143Array259[client.anInt11130 * -377873525 / 100 + 4]);
			class143.method1728(i_9_ - 8, i_10_ - 8);
		}
	}

	public static void method7112(int[] is, int[] is_11_, int i, int i_12_, byte i_13_) {
		if (i < i_12_) {
			int i_14_ = (i + i_12_) / 2;
			int i_15_ = i;
			int i_16_ = is[i_14_];
			is[i_14_] = is[i_12_];
			is[i_12_] = i_16_;
			int i_17_ = is_11_[i_14_];
			is_11_[i_14_] = is_11_[i_12_];
			is_11_[i_12_] = i_17_;
			int i_18_ = i_16_ == 2147483647 ? 0 : 1;
			for (int i_19_ = i; i_19_ < i_12_; i_19_++) {
				if (is[i_19_] < (i_19_ & i_18_) + i_16_) {
					int i_20_ = is[i_19_];
					is[i_19_] = is[i_15_];
					is[i_15_] = i_20_;
					int i_21_ = is_11_[i_19_];
					is_11_[i_19_] = is_11_[i_15_];
					is_11_[i_15_++] = i_21_;
				}
			}
			is[i_12_] = is[i_15_];
			is[i_15_] = i_16_;
			is_11_[i_12_] = is_11_[i_15_];
			is_11_[i_15_] = i_17_;
			method7112(is, is_11_, i, i_15_ - 1, (byte) 84);
			method7112(is, is_11_, i_15_ + 1, i_12_, (byte) 88);
		}
	}

	static final void method7113(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub8_10770.method9995(551063575) ? 1 : 0;
	}

	public static int method7114(int i, int i_22_, int i_23_, byte i_24_) {
		if (962386111 * Class542_Sub1.anInt10700 < 100)
			return -2;
		int i_25_ = -2;
		int i_26_ = 2147483647;
		int i_27_ = i_22_ - Class542_Sub1.anInt7185;
		int i_28_ = i_23_ - Class542_Sub1.anInt7186;
		for (Class536_Sub41 class536_sub41 = ((Class536_Sub41) Class542_Sub1.aClass708_7218.method8308(1867269829)); class536_sub41 != null; class536_sub41 = (Class536_Sub41) Class542_Sub1.aClass708_7218.method8311(1309723464)) {
			if (class536_sub41.anInt10793 * 2000440429 == i) {
				int i_29_ = 753546687 * class536_sub41.anInt10794;
				int i_30_ = 1902597877 * class536_sub41.anInt10796;
				int i_31_ = (i_29_ + Class542_Sub1.anInt7185 << 14 | i_30_ + Class542_Sub1.anInt7186);
				int i_32_ = ((i_27_ - i_29_) * (i_27_ - i_29_) + (i_28_ - i_30_) * (i_28_ - i_30_));
				if (i_25_ < 0 || i_32_ < i_26_) {
					i_25_ = i_31_;
					i_26_ = i_32_;
				}
			}
		}
		return i_25_;
	}
}
