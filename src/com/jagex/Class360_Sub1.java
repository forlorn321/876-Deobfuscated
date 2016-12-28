/* Class360_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class360_Sub1 extends Class360 {
	Runnable aRunnable10159;
	Thread aThread10160;
	Class359 aClass359_10161;
	HashMap aHashMap10162;
	volatile boolean aBool10163 = false;
	Thread aThread10164;
	List aList10165 = new ArrayList();
	Runnable aRunnable10166 = new Class560(this);
	static final float aFloat10167 = 2.0F;
	public static Class94[] aClass94Array10168;

	public void method4734(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.aClass555_7277.method6792(class545, (byte) 54);
			}
		}
	}

	public Class360_Sub1(Class641 class641) {
		aRunnable10159 = new Class551(this);
		aClass359_10161 = new Class359(this);
		aHashMap10162 = new HashMap();
		Iterator iterator = class641.aHashMap8312.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			aHashMap10162.put(class489, (new Class492[((Integer) class641.aHashMap8312.get(class489)).intValue()]));
		}
		iterator = aHashMap10162.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			for (int i = 0; i < class492s.length; i++) {
				Class258 class258 = new Class258(2.0F);
				class258.method293(0, Class380.aClass380_3930, Class364.aClass364_3837, 2);
				class492s[i] = new Class492(class489, 8192, 3, class258, this);
			}
		}
		Class555 class555 = new Class555(this, 44100.0F, 32768);
		Class555 class555_0_ = new Class555(this, 22050.0F, 16384);
		aList10165.add(class555);
		aList10165.add(class555_0_);
		aThread10160 = new Thread(aRunnable10159);
		aThread10164 = new Thread(aRunnable10166);
		aThread10160.setPriority(10);
		aThread10164.setPriority(10);
		aThread10160.start();
		aThread10164.start();
	}

	Object method4733(Class374 class374, byte i) {
		return null;
	}

	HashMap method9265(int i) {
		return aHashMap10162;
	}

	Object method4750(Class374 class374) {
		return null;
	}

	public Class492 method4748(Class489 class489, int i) {
		synchronized (aHashMap10162) {
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i_1_ = 0; i_1_ < class492s.length; i_1_++) {
				Class492 class492 = class492s[i_1_];
				Class475 class475 = class492.method5888((byte) 79);
				if (class475 == Class475.aClass475_5373) {
					class492.method5891((byte) 1);
					Class492 class492_2_ = class492;
					return class492_2_;
				}
			}
		}
		return null;
	}

	public void method4729(Object object, int i) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.aClass555_7277.method6792(class545, (byte) 5);
			}
		}
	}

	public Object method4740(int i, int i_3_, Class380 class380, Class364 class364, int i_4_, float f) {
		Class555 class555 = method9266(f * (float) i_3_, -40531222);
		Class545 class545 = new Class545(this, class555, i_4_, (float) i_3_ * f, class380.anInt3933 * 2067142005, i < 2 ? 2 : i, (class380 == Class380.aClass380_3930 || Class380.aClass380_3928 == class380), Class364.aClass364_3838 == class364);
		synchronized (class545.aClass555_7277) {
			class545.aClass555_7277.method6797(class545, -454353995);
		}
		return class545;
	}

	Class555 method9266(float f, int i) {
		float f_5_ = -1.0F;
		float f_6_ = 3.4028235E38F;
		Class555 class555 = null;
		Iterator iterator = aList10165.iterator();
		while (iterator.hasNext()) {
			Class555 class555_7_ = (Class555) iterator.next();
			float f_8_ = class555_7_.aFloat7488;
			float f_9_ = Math.abs(f_8_ - f);
			if (f_5_ < 0.0F || f_9_ < f_6_) {
				f_5_ = f_8_;
				f_6_ = f_9_;
				class555 = class555_7_;
			}
		}
		return class555;
	}

	public Object method4741(int i, int i_10_, Class380 class380, Class364 class364, int i_11_, float f) {
		Class555 class555 = method9266(f * (float) i_10_, -33688177);
		Class545 class545 = new Class545(this, class555, i_11_, (float) i_10_ * f, class380.anInt3933 * 2067142005, i < 2 ? 2 : i, (class380 == Class380.aClass380_3930 || Class380.aClass380_3928 == class380), Class364.aClass364_3838 == class364);
		synchronized (class545.aClass555_7277) {
			class545.aClass555_7277.method6797(class545, -454353995);
		}
		return class545;
	}

	public Class359 method4756(int i) {
		return aClass359_10161;
	}

	public void method4735(int i) {
		HashMap hashmap = method9265(-343423583);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i_12_ = 0; i_12_ < class492s.length; i_12_++) {
					if (class492s[i_12_].method5888((byte) 69) != Class475.aClass475_5373) {
						class492s[i_12_].method5968((short) 16383);
						class492s[i_12_].method5892(609749507);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					Class492[] class492s = (Class492[]) hashmap.get(class489);
					for (int i_13_ = 0; i_13_ < class492s.length; i_13_++) {
						if (class492s[i_13_].method5888((byte) 49) != Class475.aClass475_5373) {
							class492s[i_13_].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10163 = true;
		try {
			aThread10160.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10164.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public int method4736(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				int i = class545.method6605(1318434383);
				return i;
			}
		}
		return 0;
	}

	public int method4732(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				int i = class545.method6605(-1642180687);
				return i;
			}
		}
		return 0;
	}

	public int method4738(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				int i = class545.method6605(-1493038197);
				return i;
			}
		}
		return 0;
	}

	public int method4737(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				int i = class545.method6605(-1372766508);
				return i;
			}
		}
		return 0;
	}

	public Class492 method4731(Class489 class489) {
		synchronized (aHashMap10162) {
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i = 0; i < class492s.length; i++) {
				Class492 class492 = class492s[i];
				Class475 class475 = class492.method5888((byte) 42);
				if (class475 == Class475.aClass475_5373) {
					class492.method5891((byte) 1);
					Class492 class492_14_ = class492;
					return class492_14_;
				}
			}
		}
		return null;
	}

	public void method4739(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.aClass555_7277.method6792(class545, (byte) 37);
			}
		}
	}

	public Object method4754(int i, int i_15_, Class380 class380, Class364 class364, int i_16_, float f) {
		Class555 class555 = method9266(f * (float) i_15_, -2144095193);
		Class545 class545 = new Class545(this, class555, i_16_, (float) i_15_ * f, class380.anInt3933 * 2067142005, i < 2 ? 2 : i, (class380 == Class380.aClass380_3930 || Class380.aClass380_3928 == class380), Class364.aClass364_3838 == class364);
		synchronized (class545.aClass555_7277) {
			class545.aClass555_7277.method6797(class545, -454353995);
		}
		return class545;
	}

	HashMap method9267() {
		return aHashMap10162;
	}

	public Object method4728(int i, int i_17_, Class380 class380, Class364 class364, int i_18_, float f, byte i_19_) {
		Class555 class555 = method9266(f * (float) i_17_, 481827298);
		Class545 class545 = new Class545(this, class555, i_18_, (float) i_17_ * f, class380.anInt3933 * 2067142005, i < 2 ? 2 : i, (class380 == Class380.aClass380_3930 || Class380.aClass380_3928 == class380), Class364.aClass364_3838 == class364);
		synchronized (class545.aClass555_7277) {
			class545.aClass555_7277.method6797(class545, -454353995);
		}
		return class545;
	}

	public void method4744(Object object) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.aClass555_7277.method6792(class545, (byte) 87);
			}
		}
	}

	public int method4727(Object object, int i) {
		if (object != null && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				int i_20_ = class545.method6605(-634664312);
				return i_20_;
			}
		}
		return 0;
	}

	public void method4746(Object object, byte[] is, int i, int i_21_) {
		if (null != object && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.method6606(is, i, i_21_, -1366619149);
			}
		}
	}

	public Class492 method4747(Class489 class489) {
		synchronized (aHashMap10162) {
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i = 0; i < class492s.length; i++) {
				Class492 class492 = class492s[i];
				Class475 class475 = class492.method5888((byte) 43);
				if (class475 == Class475.aClass475_5373) {
					class492.method5891((byte) 1);
					Class492 class492_22_ = class492;
					return class492_22_;
				}
			}
		}
		return null;
	}

	public void method4743() {
		HashMap hashmap = method9265(-343423583);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i = 0; i < class492s.length; i++) {
					if (class492s[i].method5888((byte) 76) != Class475.aClass475_5373) {
						class492s[i].method5968((short) 16383);
						class492s[i].method5892(-2115363158);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					Class492[] class492s = (Class492[]) hashmap.get(class489);
					for (int i = 0; i < class492s.length; i++) {
						if (class492s[i].method5888((byte) 69) != Class475.aClass475_5373) {
							class492s[i].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10163 = true;
		try {
			aThread10160.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10164.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	Object method4749(Class374 class374) {
		return null;
	}

	public void method4745(Object object, byte[] is, int i, int i_23_, byte i_24_) {
		if (null != object && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.method6606(is, i, i_23_, -1366619149);
			}
		}
	}

	public Class359 method4751() {
		return aClass359_10161;
	}

	public Class359 method4752() {
		return aClass359_10161;
	}

	public void method4753() {
		HashMap hashmap = method9265(-343423583);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i = 0; i < class492s.length; i++) {
					if (class492s[i].method5888((byte) 125) != Class475.aClass475_5373) {
						class492s[i].method5968((short) 16383);
						class492s[i].method5892(411360855);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					Class492[] class492s = (Class492[]) hashmap.get(class489);
					for (int i = 0; i < class492s.length; i++) {
						if (class492s[i].method5888((byte) 18) != Class475.aClass475_5373) {
							class492s[i].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10163 = true;
		try {
			aThread10160.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10164.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method4730(Object object, byte[] is, int i, int i_25_) {
		if (null != object && object instanceof Class545) {
			Class545 class545 = (Class545) object;
			synchronized (class545.aClass555_7277) {
				class545.method6606(is, i, i_25_, -1366619149);
			}
		}
	}

	public void method4755() {
		if (null != aClass359_10161)
			aClass359_10161.method4719((byte) 21);
		Iterator iterator = aHashMap10162.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i = 0; i < class492s.length; i++) {
					class492s[i].method5940(1783834574);
					bool |= class492s[i].method5901(-243324157);
				}
				if (bool)
					Arrays.sort(class492s, new Class558(this));
			}
			int i = 6;
			boolean bool = false;
			int i_26_ = class492s.length - 1;
			while (!bool) {
				float f = class492s[i_26_].method5899((byte) -71);
				Class475 class475 = class492s[i_26_].method5888((byte) 26);
				if (f < 0.0F) {
					if (Class475.aClass475_5379 == class475 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_26_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_26_ < 0)
					bool = true;
			}
			if (i_26_ >= class492s.length - i) {
				for (/**/; i_26_ >= class492s.length - i; i_26_--) {
					Class475 class475 = class492s[i_26_].method5888((byte) 42);
					if (Class475.aClass475_5379 == class475)
						class492s[i_26_].method5968((short) 16383);
				}
			}
		}
	}

	public void method4726() {
		if (null != aClass359_10161)
			aClass359_10161.method4719((byte) 12);
		Iterator iterator = aHashMap10162.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i = 0; i < class492s.length; i++) {
					class492s[i].method5940(1783834574);
					bool |= class492s[i].method5901(1748281986);
				}
				if (bool)
					Arrays.sort(class492s, new Class558(this));
			}
			int i = 6;
			boolean bool = false;
			int i_27_ = class492s.length - 1;
			while (!bool) {
				float f = class492s[i_27_].method5899((byte) -28);
				Class475 class475 = class492s[i_27_].method5888((byte) 83);
				if (f < 0.0F) {
					if (Class475.aClass475_5379 == class475 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_27_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_27_ < 0)
					bool = true;
			}
			if (i_27_ >= class492s.length - i) {
				for (/**/; i_27_ >= class492s.length - i; i_27_--) {
					Class475 class475 = class492s[i_27_].method5888((byte) 20);
					if (Class475.aClass475_5379 == class475)
						class492s[i_27_].method5968((short) 16383);
				}
			}
		}
	}

	public void method4742(int i) {
		if (null != aClass359_10161)
			aClass359_10161.method4719((byte) 30);
		Iterator iterator = aHashMap10162.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10162.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i_28_ = 0; i_28_ < class492s.length; i_28_++) {
					class492s[i_28_].method5940(1783834574);
					bool |= class492s[i_28_].method5901(-54784590);
				}
				if (bool)
					Arrays.sort(class492s, new Class558(this));
			}
			int i_29_ = 6;
			boolean bool = false;
			int i_30_ = class492s.length - 1;
			while (!bool) {
				float f = class492s[i_30_].method5899((byte) -25);
				Class475 class475 = class492s[i_30_].method5888((byte) 69);
				if (f < 0.0F) {
					if (Class475.aClass475_5379 == class475 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_30_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_30_ < 0)
					bool = true;
			}
			if (i_30_ >= class492s.length - i_29_) {
				for (/**/; i_30_ >= class492s.length - i_29_; i_30_--) {
					Class475 class475 = class492s[i_30_].method5888((byte) 84);
					if (Class475.aClass475_5379 == class475)
						class492s[i_30_].method5968((short) 16383);
				}
			}
		}
	}

	HashMap method9268() {
		return aHashMap10162;
	}

	public static void method9269(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int[] is, int i, boolean bool) {
		if (class649_sub1_sub5_sub1.anIntArray11913 != null) {
			boolean bool_32_ = true;
			for (int i_33_ = 0; i_33_ < class649_sub1_sub5_sub1.anIntArray11913.length; i_33_++) {
				if (class649_sub1_sub5_sub1.anIntArray11913[i_33_] != is[i_33_]) {
					bool_32_ = false;
					break;
				}
			}
			Class688 class688 = class649_sub1_sub5_sub1.aClass688_11925;
			if (bool_32_ && class688.method8121(-1118626690)) {
				Class191 class191 = class649_sub1_sub5_sub1.aClass688_11925.method8159(1808791066);
				int i_34_ = class191.anInt2169 * -15611351;
				if (i_34_ == 1)
					class688.method8168(i, 1943656730);
				if (2 == i_34_)
					class688.method8136(-1676529151);
			}
		}
		boolean bool_35_ = true;
		for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
			if (is[i_36_] != -1)
				bool_35_ = false;
			if (class649_sub1_sub5_sub1.anIntArray11913 == null || -1 == class649_sub1_sub5_sub1.anIntArray11913[i_36_] || ((((Class191) Class45.aClass34_Sub11_529.method70(is[i_36_], (byte) 59)).anInt2163 * -430743627) >= ((Class191) (Class45.aClass34_Sub11_529.method70(class649_sub1_sub5_sub1.anIntArray11913[i_36_], (byte) -1))).anInt2163 * -430743627)) {
				class649_sub1_sub5_sub1.anIntArray11913 = is;
				class649_sub1_sub5_sub1.aClass688_11925.method8130(i, 1832993615);
				if (bool)
					class649_sub1_sub5_sub1.anInt11948 = class649_sub1_sub5_sub1.stepsCount * 1389534931;
			}
		}
		if (bool_35_) {
			class649_sub1_sub5_sub1.anIntArray11913 = is;
			class649_sub1_sub5_sub1.aClass688_11925.method8130(i, -636585715);
			if (bool)
				class649_sub1_sub5_sub1.anInt11948 = 1389534931 * class649_sub1_sub5_sub1.stepsCount;
		}
	}

	static final void method9270(Class668 class668, int i) {
		int i_37_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_37_);
		Class234 class234 = Class463.aClass234Array5227[i_37_ >> 16];
		Class434.method5233(class251, class234, class668, 435246204);
	}

	static final void method9271(Class668 class668, int i) {
		Class4 class4 = (class668.aClass536_Sub18_Sub16_8547.aClass4Array11806[class668.anIntArray8537[-1640738851 * class668.anInt8564]]);
		IntParam class536_sub26 = ((IntParam) class4.method556((long) class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]));
		if (class536_sub26 != null)
			class668.anInt8564 += class536_sub26.value * -1268425751;
	}

	static void method9272(short i) {
		Class61.aString681 = "";
		Class61.aString696 = "";
		Class61.aString679 = "";
		Class61.aBool682 = true;
	}

	public static Class692[] method9273(int i) {
		return (new Class692[] { Class692.aClass692_8720, Class692.aClass692_8707, Class692.aClass692_8717, Class692.aClass692_8706, Class692.aClass692_8716, Class692.aClass692_8715, Class692.aClass692_8708, Class692.aClass692_8713, Class692.aClass692_8719, Class692.aClass692_8702, Class692.aClass692_8711, Class692.aClass692_8712, Class692.aClass692_8704, Class692.aClass692_8714, Class692.aClass692_8703, Class692.aClass692_8718, Class692.aClass692_8709, Class692.aClass692_8705,
				Class692.aClass692_8710 });
	}
}
