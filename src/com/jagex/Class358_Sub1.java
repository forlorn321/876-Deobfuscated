/* Class358_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class358_Sub1 extends Class358 {
	Class375 aClass375_10122;
	HashMap aHashMap10123;
	volatile boolean aBool10124 = false;
	static final float aFloat10125 = 2.0F;
	Thread aThread10126;
	Thread aThread10127;
	List aList10128 = new ArrayList();
	Runnable aRunnable10129 = new Class559(this);
	Runnable aRunnable10130 = new Class565(this);

	public int method6276(Object object, int i) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				int i_0_ = class557.method9423(-1979462987);
				return i_0_;
			}
		}
		return 0;
	}

	public void method6279() {
		if (null != aClass375_10122)
			aClass375_10122.method6380((byte) 19);
		Iterator iterator = aHashMap10123.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) 44);
				}
				if (bool)
					Arrays.sort(class494s, new Class567(this));
			}
			int i = 6;
			boolean bool = false;
			int i_1_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_1_].method8018((byte) 36);
				Class491 class491 = class494s[i_1_].method8041(-1806032824);
				if (f < 0.0F) {
					if (Class491.aClass491_5483 == class491 || class491 == Class491.aClass491_5477 || Class491.aClass491_5478 == class491)
						class494s[i_1_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_1_ < 0)
					bool = true;
			}
			if (i_1_ >= class494s.length - i) {
				for (/**/; i_1_ >= class494s.length - i; i_1_--) {
					Class491 class491 = class494s[i_1_].method8041(-2126897356);
					if (Class491.aClass491_5483 == class491)
						class494s[i_1_].method8078(-1630878985);
				}
			}
		}
	}

	public void method6282() {
		if (null != aClass375_10122)
			aClass375_10122.method6380((byte) 102);
		Iterator iterator = aHashMap10123.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) -57);
				}
				if (bool)
					Arrays.sort(class494s, new Class567(this));
			}
			int i = 6;
			boolean bool = false;
			int i_2_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_2_].method8018((byte) 118);
				Class491 class491 = class494s[i_2_].method8041(-1707661381);
				if (f < 0.0F) {
					if (Class491.aClass491_5483 == class491 || class491 == Class491.aClass491_5477 || Class491.aClass491_5478 == class491)
						class494s[i_2_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_2_ < 0)
					bool = true;
			}
			if (i_2_ >= class494s.length - i) {
				for (/**/; i_2_ >= class494s.length - i; i_2_--) {
					Class491 class491 = class494s[i_2_].method8041(-1820777197);
					if (Class491.aClass491_5483 == class491)
						class494s[i_2_].method8078(-1630878985);
				}
			}
		}
	}

	Object method6278(Class360 class360, int i) {
		return null;
	}

	Class551 method15791(float f, int i) {
		float f_3_ = -1.0F;
		float f_4_ = 3.4028235E38F;
		Class551 class551 = null;
		Iterator iterator = aList10128.iterator();
		while (iterator.hasNext()) {
			Class551 class551_5_ = (Class551) iterator.next();
			float f_6_ = class551_5_.aFloat7301;
			float f_7_ = Math.abs(f_6_ - f);
			if (f_3_ < 0.0F || f_7_ < f_4_) {
				f_3_ = f_6_;
				f_4_ = f_7_;
				class551 = class551_5_;
			}
		}
		return class551;
	}

	public Object method6273(int i, int i_8_, Class390 class390, Class373 class373, int i_9_, float f, byte i_10_) {
		Class551 class551 = method15791(f * (float) i_8_, 1251875258);
		Class557 class557 = new Class557(this, class551, i_9_, f * (float) i_8_, 370905523 * class390.anInt4005, i < 2 ? 2 : i, (class390 == Class390.aClass390_4003 || class390 == Class390.aClass390_4002), class373 == Class373.aClass373_3908);
		synchronized (class557.aClass551_7520) {
			class557.aClass551_7520.method9127(class557, -579090184);
		}
		return class557;
	}

	public void method6293(Object object, int i) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.aClass551_7520.method9120(class557, (byte) 0);
			}
		}
	}

	Object method6289(Class360 class360) {
		return null;
	}

	public Class494 method6277(Class485 class485, short i) {
		synchronized (aHashMap10123) {
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (class494s == null) {
				Class494 class494 = null;
				return class494;
			}
			for (int i_11_ = 0; i_11_ < class494s.length; i_11_++) {
				Class494 class494 = class494s[i_11_];
				Class491 class491 = class494.method8041(-1727181121);
				if (Class491.aClass491_5475 == class491) {
					class494.method8005(1606084066);
					Class494 class494_12_ = class494;
					return class494_12_;
				}
			}
		}
		return null;
	}

	HashMap method15792(byte i) {
		return aHashMap10123;
	}

	public Class375 method6287(int i) {
		return aClass375_10122;
	}

	public void method6272(byte i) {
		if (null != aClass375_10122)
			aClass375_10122.method6380((byte) 120);
		Iterator iterator = aHashMap10123.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i_13_ = 0; i_13_ < class494s.length; i_13_++) {
					class494s[i_13_].method8021(-903040352);
					bool |= class494s[i_13_].method8012((byte) -28);
				}
				if (bool)
					Arrays.sort(class494s, new Class567(this));
			}
			int i_14_ = 6;
			boolean bool = false;
			int i_15_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_15_].method8018((byte) 35);
				Class491 class491 = class494s[i_15_].method8041(-1666943625);
				if (f < 0.0F) {
					if (Class491.aClass491_5483 == class491 || class491 == Class491.aClass491_5477 || Class491.aClass491_5478 == class491)
						class494s[i_15_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_15_ < 0)
					bool = true;
			}
			if (i_15_ >= class494s.length - i_14_) {
				for (/**/; i_15_ >= class494s.length - i_14_; i_15_--) {
					Class491 class491 = class494s[i_15_].method8041(-2001186546);
					if (Class491.aClass491_5483 == class491)
						class494s[i_15_].method8078(-1630878985);
				}
			}
		}
	}

	public void method6300(Object object) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.aClass551_7520.method9120(class557, (byte) 0);
			}
		}
	}

	Object method6294(Class360 class360) {
		return null;
	}

	public void method6281() {
		if (null != aClass375_10122)
			aClass375_10122.method6380((byte) 13);
		Iterator iterator = aHashMap10123.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) -3);
				}
				if (bool)
					Arrays.sort(class494s, new Class567(this));
			}
			int i = 6;
			boolean bool = false;
			int i_16_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_16_].method8018((byte) 13);
				Class491 class491 = class494s[i_16_].method8041(-2115222801);
				if (f < 0.0F) {
					if (Class491.aClass491_5483 == class491 || class491 == Class491.aClass491_5477 || Class491.aClass491_5478 == class491)
						class494s[i_16_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_16_ < 0)
					bool = true;
			}
			if (i_16_ >= class494s.length - i) {
				for (/**/; i_16_ >= class494s.length - i; i_16_--) {
					Class491 class491 = class494s[i_16_].method8041(-1793247200);
					if (Class491.aClass491_5483 == class491)
						class494s[i_16_].method8078(-1630878985);
				}
			}
		}
	}

	public int method6284(Object object) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				int i = class557.method9423(-1319564006);
				return i;
			}
		}
		return 0;
	}

	public Object method6285(int i, int i_17_, Class390 class390, Class373 class373, int i_18_, float f) {
		Class551 class551 = method15791(f * (float) i_17_, -825727143);
		Class557 class557 = new Class557(this, class551, i_18_, f * (float) i_17_, 370905523 * class390.anInt4005, i < 2 ? 2 : i, (class390 == Class390.aClass390_4003 || class390 == Class390.aClass390_4002), class373 == Class373.aClass373_3908);
		synchronized (class557.aClass551_7520) {
			class557.aClass551_7520.method9127(class557, -1541614690);
		}
		return class557;
	}

	public Class358_Sub1(Class653 class653) {
		aClass375_10122 = new Class375(this);
		aHashMap10123 = new HashMap();
		Iterator iterator = class653.aHashMap8386.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			aHashMap10123.put(class485, (new Class494[((Integer) class653.aHashMap8386.get(class485)).intValue()]));
		}
		iterator = aHashMap10123.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			for (int i = 0; i < class494s.length; i++) {
				Class241 class241 = new Class241(2.0F);
				class241.method314(0, Class390.aClass390_4003, Class373.aClass373_3907, 2);
				class494s[i] = new Class494(class485, 8192, 3, class241, this);
			}
		}
		Class551 class551 = new Class551(this, 44100.0F, 32768);
		Class551 class551_19_ = new Class551(this, 22050.0F, 16384);
		aList10128.add(class551);
		aList10128.add(class551_19_);
		aThread10126 = new Thread(aRunnable10130);
		aThread10127 = new Thread(aRunnable10129);
		aThread10126.setPriority(10);
		aThread10127.setPriority(10);
		aThread10126.start();
		aThread10127.start();
	}

	public void method6290(Object object, byte[] is, int i, int i_20_) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.method9424(is, i, i_20_, (byte) -46);
			}
		}
	}

	public void method6288(Object object, byte[] is, int i, int i_21_) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.method9424(is, i, i_21_, (byte) -82);
			}
		}
	}

	public void method6286() {
		HashMap hashmap = method15792((byte) 60);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-2064742318) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -10254);
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
					Class485 class485 = (Class485) iterator.next();
					Class494[] class494s = (Class494[]) hashmap.get(class485);
					for (int i = 0; i < class494s.length; i++) {
						if (class494s[i].method8041(-1780308586) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10124 = true;
		try {
			aThread10126.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10127.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class494 method6271(Class485 class485) {
		synchronized (aHashMap10123) {
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (class494s == null) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-1988611738);
				if (Class491.aClass491_5475 == class491) {
					class494.method8005(-424482147);
					Class494 class494_22_ = class494;
					return class494_22_;
				}
			}
		}
		return null;
	}

	public Class494 method6291(Class485 class485) {
		synchronized (aHashMap10123) {
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (class494s == null) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-2120732220);
				if (Class491.aClass491_5475 == class491) {
					class494.method8005(-630116460);
					Class494 class494_23_ = class494;
					return class494_23_;
				}
			}
		}
		return null;
	}

	public Class494 method6297(Class485 class485) {
		synchronized (aHashMap10123) {
			Class494[] class494s = (Class494[]) aHashMap10123.get(class485);
			if (class494s == null) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-1791892521);
				if (Class491.aClass491_5475 == class491) {
					class494.method8005(1951183613);
					Class494 class494_24_ = class494;
					return class494_24_;
				}
			}
		}
		return null;
	}

	public void method6301(Object object) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.aClass551_7520.method9120(class557, (byte) 0);
			}
		}
	}

	Object method6292(Class360 class360) {
		return null;
	}

	public Class375 method6295() {
		return aClass375_10122;
	}

	public Class375 method6296() {
		return aClass375_10122;
	}

	public void method6275(Object object, byte[] is, int i, int i_25_, int i_26_) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.method9424(is, i, i_25_, (byte) -47);
			}
		}
	}

	public void method6298() {
		HashMap hashmap = method15792((byte) 31);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-1607822687) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -15089);
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
					Class485 class485 = (Class485) iterator.next();
					Class494[] class494s = (Class494[]) hashmap.get(class485);
					for (int i = 0; i < class494s.length; i++) {
						if (class494s[i].method8041(-1720266047) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10124 = true;
		try {
			aThread10126.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10127.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6283() {
		HashMap hashmap = method15792((byte) 13);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-1633044811) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -21879);
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
					Class485 class485 = (Class485) iterator.next();
					Class494[] class494s = (Class494[]) hashmap.get(class485);
					for (int i = 0; i < class494s.length; i++) {
						if (class494s[i].method8041(-1661525609) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10124 = true;
		try {
			aThread10126.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10127.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6299(Object object) {
		if (object != null && object instanceof Class557) {
			Class557 class557 = (Class557) object;
			synchronized (class557.aClass551_7520) {
				class557.aClass551_7520.method9120(class557, (byte) 0);
			}
		}
	}

	public void method6280(int i) {
		HashMap hashmap = method15792((byte) -78);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i_27_ = 0; i_27_ < class494s.length; i_27_++) {
					if (class494s[i_27_].method8041(-2020455557) != Class491.aClass491_5475) {
						class494s[i_27_].method8078(-1630878985);
						class494s[i_27_].method8009((short) -4135);
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
					Class485 class485 = (Class485) iterator.next();
					Class494[] class494s = (Class494[]) hashmap.get(class485);
					for (int i_28_ = 0; i_28_ < class494s.length; i_28_++) {
						if (class494s[i_28_].method8041(-2024232940) != Class491.aClass491_5475) {
							class494s[i_28_].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10124 = true;
		try {
			aThread10126.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10127.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Object method6274(int i, int i_29_, Class390 class390, Class373 class373, int i_30_, float f) {
		Class551 class551 = method15791(f * (float) i_29_, 568833259);
		Class557 class557 = new Class557(this, class551, i_30_, f * (float) i_29_, 370905523 * class390.anInt4005, i < 2 ? 2 : i, (class390 == Class390.aClass390_4003 || class390 == Class390.aClass390_4002), class373 == Class373.aClass373_3908);
		synchronized (class557.aClass551_7520) {
			class557.aClass551_7520.method9127(class557, -1609517115);
		}
		return class557;
	}

	Class551 method15793(float f) {
		float f_31_ = -1.0F;
		float f_32_ = 3.4028235E38F;
		Class551 class551 = null;
		Iterator iterator = aList10128.iterator();
		while (iterator.hasNext()) {
			Class551 class551_33_ = (Class551) iterator.next();
			float f_34_ = class551_33_.aFloat7301;
			float f_35_ = Math.abs(f_34_ - f);
			if (f_31_ < 0.0F || f_35_ < f_32_) {
				f_31_ = f_34_;
				f_32_ = f_35_;
				class551 = class551_33_;
			}
		}
		return class551;
	}

	Class551 method15794(float f) {
		float f_36_ = -1.0F;
		float f_37_ = 3.4028235E38F;
		Class551 class551 = null;
		Iterator iterator = aList10128.iterator();
		while (iterator.hasNext()) {
			Class551 class551_38_ = (Class551) iterator.next();
			float f_39_ = class551_38_.aFloat7301;
			float f_40_ = Math.abs(f_39_ - f);
			if (f_36_ < 0.0F || f_40_ < f_37_) {
				f_36_ = f_39_;
				f_37_ = f_40_;
				class551 = class551_38_;
			}
		}
		return class551;
	}

	public static void method15795(int i, int i_41_) {
		int i_42_ = client.aList11328.indexOf(Integer.valueOf(i));
		if (-1 == i_42_)
			client.aList11328.add(Integer.valueOf(i));
	}

	static final void method15796(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_43_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_44_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class331_Sub3.method15766(7, i_43_, i_44_, "", 472161400);
	}

	static final void method15797(Class665 class665, int i) {
		Class687 class687 = Class227.method4306((byte) 1);
		String string = Class672.method13828(1667774553);
		if (null == string)
			string = "";
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class687.method87();
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}
}
