/* Class360_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class360_Sub2 extends Class360 {
	Class359 aClass359_10262;
	static final float aFloat10263 = 2.0F;
	Runnable aRunnable10264;
	Thread aThread10265;
	HashMap aHashMap10266;
	Thread aThread10267;
	long aLong10268;
	Runnable aRunnable10269;
	volatile boolean aBool10270 = false;

	public void method4753() {
		HashMap hashmap = method9317((byte) 64);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i = 0; i < class492s.length; i++) {
					if (class492s[i].method5888((byte) 26) != Class475.aClass475_5373) {
						class492s[i].method5968((short) 16383);
						class492s[i].method5892(-1720933579);
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
						if (class492s[i].method5888((byte) 65) != Class475.aClass475_5373) {
							class492s[i].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10270 = true;
		try {
			aThread10265.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10267.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class360_Sub2(Class641 class641) {
		aLong10268 = Class249.method3450(1268416792) * 5920048957335459077L;
		aRunnable10269 = new Class154(this);
		aRunnable10264 = new Class141(this);
		aClass359_10262 = new Class359(this);
		aHashMap10266 = new HashMap();
		Iterator iterator = class641.aHashMap8312.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			aHashMap10266.put(class489, (new Class492[((Integer) class641.aHashMap8312.get(class489)).intValue()]));
		}
		iterator = aHashMap10266.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			for (int i = 0; i < class492s.length; i++) {
				Class258 class258 = new Class258(2.0F);
				class258.method293(0, Class380.aClass380_3930, Class364.aClass364_3837, 2);
				class492s[i] = new Class492(class489, 32768, 3, class258, this);
			}
		}
		aThread10265 = new Thread(aRunnable10264);
		aThread10267 = new Thread(aRunnable10269);
		aThread10265.setPriority(1);
		aThread10267.setPriority(1);
		aThread10265.start();
		aThread10267.start();
	}

	public void method4742(int i) {
		if (null != aClass359_10262)
			aClass359_10262.method4719((byte) 119);
		Iterator iterator = aHashMap10266.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i_0_ = 0; i_0_ < class492s.length; i_0_++) {
					class492s[i_0_].method5940(1783834574);
					bool |= class492s[i_0_].method5901(-473471295);
				}
				if (bool)
					Arrays.sort(class492s, new Class151(this));
			}
			int i_1_ = 3;
			boolean bool = false;
			int i_2_ = class492s.length - 1;
			while (false == bool) {
				float f = class492s[i_2_].method5899((byte) -40);
				Class475 class475 = class492s[i_2_].method5888((byte) 102);
				if (f < 0.0F) {
					if (class475 == Class475.aClass475_5379 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_2_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_2_ < 0)
					bool = true;
			}
			if (i_2_ >= class492s.length - i_1_) {
				for (/**/; i_2_ >= class492s.length - i_1_; i_2_--) {
					Class475 class475 = class492s[i_2_].method5888((byte) 67);
					if (class475 == Class475.aClass475_5379)
						class492s[i_2_].method5968((short) 16383);
				}
			}
		}
	}

	public void method4743() {
		HashMap hashmap = method9317((byte) -21);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i = 0; i < class492s.length; i++) {
					if (class492s[i].method5888((byte) 96) != Class475.aClass475_5373) {
						class492s[i].method5968((short) 16383);
						class492s[i].method5892(-1890645395);
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
						if (class492s[i].method5888((byte) 114) != Class475.aClass475_5373) {
							class492s[i].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10270 = true;
		try {
			aThread10265.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10267.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Object method4728(int i, int i_3_, Class380 class380, Class364 class364, int i_4_, float f, byte i_5_) {
		return new Object();
	}

	public void method4729(Object object, int i) {
		/* empty */
	}

	public void method4745(Object object, byte[] is, int i, int i_6_, byte i_7_) {
		/* empty */
	}

	public Class492 method4748(Class489 class489, int i) {
		synchronized (aHashMap10266) {
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i_8_ = 0; i_8_ < class492s.length; i_8_++) {
				Class492 class492 = class492s[i_8_];
				Class475 class475 = class492.method5888((byte) 39);
				if (Class475.aClass475_5373 == class475) {
					class492.method5891((byte) 1);
					Class492 class492_9_ = class492;
					return class492_9_;
				}
			}
		}
		return null;
	}

	public void method4739(Object object) {
		/* empty */
	}

	public Class359 method4756(int i) {
		return aClass359_10262;
	}

	public void method4735(int i) {
		HashMap hashmap = method9317((byte) -21);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class489 class489 = (Class489) iterator.next();
				Class492[] class492s = (Class492[]) hashmap.get(class489);
				for (int i_10_ = 0; i_10_ < class492s.length; i_10_++) {
					if (class492s[i_10_].method5888((byte) 56) != Class475.aClass475_5373) {
						class492s[i_10_].method5968((short) 16383);
						class492s[i_10_].method5892(-776320253);
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
					for (int i_11_ = 0; i_11_ < class492s.length; i_11_++) {
						if (class492s[i_11_].method5888((byte) 31) != Class475.aClass475_5373) {
							class492s[i_11_].method5940(1783834574);
							bool = false;
						}
					}
				}
			}
			Class212.method3067(10L);
		}
		aBool10270 = true;
		try {
			aThread10265.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10267.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	HashMap method9315() {
		return aHashMap10266;
	}

	Object method4749(Class374 class374) {
		return null;
	}

	public int method4736(Object object) {
		long l = Class249.method3450(1497450713);
		int i = (int) (180000.0F / ((float) (l - -1192488450289979443L * aLong10268) / 1000.0F));
		aLong10268 = 5920048957335459077L * l;
		return i;
	}

	public int method4732(Object object) {
		long l = Class249.method3450(1363658600);
		int i = (int) (180000.0F / ((float) (l - -1192488450289979443L * aLong10268) / 1000.0F));
		aLong10268 = 5920048957335459077L * l;
		return i;
	}

	public int method4738(Object object) {
		long l = Class249.method3450(1361135978);
		int i = (int) (180000.0F / ((float) (l - -1192488450289979443L * aLong10268) / 1000.0F));
		aLong10268 = 5920048957335459077L * l;
		return i;
	}

	public int method4737(Object object) {
		long l = Class249.method3450(1593877290);
		int i = (int) (180000.0F / ((float) (l - -1192488450289979443L * aLong10268) / 1000.0F));
		aLong10268 = 5920048957335459077L * l;
		return i;
	}

	public Object method4740(int i, int i_12_, Class380 class380, Class364 class364, int i_13_, float f) {
		return new Object();
	}

	public Object method4741(int i, int i_14_, Class380 class380, Class364 class364, int i_15_, float f) {
		return new Object();
	}

	public Object method4754(int i, int i_16_, Class380 class380, Class364 class364, int i_17_, float f) {
		return new Object();
	}

	public void method4734(Object object) {
		/* empty */
	}

	public Class492 method4747(Class489 class489) {
		synchronized (aHashMap10266) {
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i = 0; i < class492s.length; i++) {
				Class492 class492 = class492s[i];
				Class475 class475 = class492.method5888((byte) 54);
				if (Class475.aClass475_5373 == class475) {
					class492.method5891((byte) 1);
					Class492 class492_18_ = class492;
					return class492_18_;
				}
			}
		}
		return null;
	}

	public void method4744(Object object) {
		/* empty */
	}

	public void method4755() {
		if (null != aClass359_10262)
			aClass359_10262.method4719((byte) 105);
		Iterator iterator = aHashMap10266.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i = 0; i < class492s.length; i++) {
					class492s[i].method5940(1783834574);
					bool |= class492s[i].method5901(-114357257);
				}
				if (bool)
					Arrays.sort(class492s, new Class151(this));
			}
			int i = 3;
			boolean bool = false;
			int i_19_ = class492s.length - 1;
			while (false == bool) {
				float f = class492s[i_19_].method5899((byte) 5);
				Class475 class475 = class492s[i_19_].method5888((byte) 61);
				if (f < 0.0F) {
					if (class475 == Class475.aClass475_5379 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_19_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_19_ < 0)
					bool = true;
			}
			if (i_19_ >= class492s.length - i) {
				for (/**/; i_19_ >= class492s.length - i; i_19_--) {
					Class475 class475 = class492s[i_19_].method5888((byte) 45);
					if (class475 == Class475.aClass475_5379)
						class492s[i_19_].method5968((short) 16383);
				}
			}
		}
	}

	public void method4746(Object object, byte[] is, int i, int i_20_) {
		/* empty */
	}

	HashMap method9316() {
		return aHashMap10266;
	}

	public Class492 method4731(Class489 class489) {
		synchronized (aHashMap10266) {
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (null == class492s) {
				Class492 class492 = null;
				return class492;
			}
			for (int i = 0; i < class492s.length; i++) {
				Class492 class492 = class492s[i];
				Class475 class475 = class492.method5888((byte) 9);
				if (Class475.aClass475_5373 == class475) {
					class492.method5891((byte) 1);
					Class492 class492_21_ = class492;
					return class492_21_;
				}
			}
		}
		return null;
	}

	Object method4733(Class374 class374, byte i) {
		return null;
	}

	Object method4750(Class374 class374) {
		return null;
	}

	public Class359 method4751() {
		return aClass359_10262;
	}

	public Class359 method4752() {
		return aClass359_10262;
	}

	public void method4726() {
		if (null != aClass359_10262)
			aClass359_10262.method4719((byte) 54);
		Iterator iterator = aHashMap10266.keySet().iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			Class492[] class492s = (Class492[]) aHashMap10266.get(class489);
			if (!class489.aBool5464) {
				boolean bool = false;
				for (int i = 0; i < class492s.length; i++) {
					class492s[i].method5940(1783834574);
					bool |= class492s[i].method5901(1469881404);
				}
				if (bool)
					Arrays.sort(class492s, new Class151(this));
			}
			int i = 3;
			boolean bool = false;
			int i_22_ = class492s.length - 1;
			while (false == bool) {
				float f = class492s[i_22_].method5899((byte) -35);
				Class475 class475 = class492s[i_22_].method5888((byte) 64);
				if (f < 0.0F) {
					if (class475 == Class475.aClass475_5379 || Class475.aClass475_5372 == class475 || class475 == Class475.aClass475_5376)
						class492s[i_22_].method5968((short) 16383);
				} else
					bool = true;
				if (--i_22_ < 0)
					bool = true;
			}
			if (i_22_ >= class492s.length - i) {
				for (/**/; i_22_ >= class492s.length - i; i_22_--) {
					Class475 class475 = class492s[i_22_].method5888((byte) 5);
					if (class475 == Class475.aClass475_5379)
						class492s[i_22_].method5968((short) 16383);
				}
			}
		}
	}

	public int method4727(Object object, int i) {
		long l = Class249.method3450(1474587595);
		int i_23_ = (int) (180000.0F / ((float) (l - -1192488450289979443L * aLong10268) / 1000.0F));
		aLong10268 = 5920048957335459077L * l;
		return i_23_;
	}

	HashMap method9317(byte i) {
		return aHashMap10266;
	}

	public void method4730(Object object, byte[] is, int i, int i_24_) {
		/* empty */
	}

	static void method9318(int i, int i_25_) {
		Class536_Sub1.anInt10302 = 2045946831 * i;
		Class536_Sub1.aClass199_10301.method2884((byte) -73);
	}
}
