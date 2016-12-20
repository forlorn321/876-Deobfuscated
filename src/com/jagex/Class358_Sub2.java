/* Class358_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class358_Sub2 extends Class358 {
	HashMap aHashMap10280;
	Class375 aClass375_10281;
	Runnable aRunnable10282;
	long aLong10283;
	Thread aThread10284;
	Thread aThread10285;
	static final float aFloat10286 = 2.0F;
	volatile boolean aBool10287 = false;
	Runnable aRunnable10288;
	static Class174 aClass174_10289;

	public void method6272(byte i) {
		if (aClass375_10281 != null)
			aClass375_10281.method6380((byte) 109);
		Iterator iterator = aHashMap10280.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i_0_ = 0; i_0_ < class494s.length; i_0_++) {
					class494s[i_0_].method8021(-903040352);
					bool |= class494s[i_0_].method8012((byte) -25);
				}
				if (bool)
					Arrays.sort(class494s, new Class146(this));
			}
			int i_1_ = 3;
			boolean bool = false;
			int i_2_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_2_].method8018((byte) 17);
				Class491 class491 = class494s[i_2_].method8041(-1932205974);
				if (f < 0.0F) {
					if (class491 == Class491.aClass491_5483 || Class491.aClass491_5477 == class491 || Class491.aClass491_5478 == class491)
						class494s[i_2_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_2_ < 0)
					bool = true;
			}
			if (i_2_ >= class494s.length - i_1_) {
				for (/**/; i_2_ >= class494s.length - i_1_; i_2_--) {
					Class491 class491 = class494s[i_2_].method8041(-1692394355);
					if (class491 == Class491.aClass491_5483)
						class494s[i_2_].method8078(-1630878985);
				}
			}
		}
	}

	public void method6300(Object object) {
		/* empty */
	}

	public void method6293(Object object, int i) {
		/* empty */
	}

	public int method6276(Object object, int i) {
		long l = Class234.method4347(-1408626088);
		int i_3_ = (int) (180000.0F / ((float) (l - 8020637959409610333L * aLong10283) / 1000.0F));
		aLong10283 = -3554916692249635339L * l;
		return i_3_;
	}

	public void method6283() {
		HashMap hashmap = method15932(137144063);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-2046376517) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -30475);
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
						if (class494s[i].method8041(-2039095874) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10287 = true;
		try {
			aThread10284.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10285.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	HashMap method15928() {
		return aHashMap10280;
	}

	public void method6275(Object object, byte[] is, int i, int i_4_, int i_5_) {
		/* empty */
	}

	public Class494 method6277(Class485 class485, short i) {
		synchronized (aHashMap10280) {
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (null == class494s) {
				Class494 class494 = null;
				return class494;
			}
			for (int i_6_ = 0; i_6_ < class494s.length; i_6_++) {
				Class494 class494 = class494s[i_6_];
				Class491 class491 = class494.method8041(-1831381986);
				if (class491 == Class491.aClass491_5475) {
					class494.method8005(1090574025);
					Class494 class494_7_ = class494;
					return class494_7_;
				}
			}
		}
		return null;
	}

	HashMap method15929() {
		return aHashMap10280;
	}

	public Class358_Sub2(Class653 class653) {
		aLong10283 = Class234.method4347(-1408626088) * -3554916692249635339L;
		aRunnable10282 = new Class153(this);
		aRunnable10288 = new Class154(this);
		aClass375_10281 = new Class375(this);
		aHashMap10280 = new HashMap();
		Iterator iterator = class653.aHashMap8386.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			aHashMap10280.put(class485, (new Class494[((Integer) class653.aHashMap8386.get(class485)).intValue()]));
		}
		iterator = aHashMap10280.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			for (int i = 0; i < class494s.length; i++) {
				Class241 class241 = new Class241(2.0F);
				class241.method314(0, Class390.aClass390_4003, Class373.aClass373_3907, 2);
				class494s[i] = new Class494(class485, 32768, 3, class241, this);
			}
		}
		aThread10284 = new Thread(aRunnable10288);
		aThread10285 = new Thread(aRunnable10282);
		aThread10284.setPriority(1);
		aThread10285.setPriority(1);
		aThread10284.start();
		aThread10285.start();
	}

	public void method6280(int i) {
		HashMap hashmap = method15932(1324662037);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i_8_ = 0; i_8_ < class494s.length; i_8_++) {
					if (class494s[i_8_].method8041(-1946774610) != Class491.aClass491_5475) {
						class494s[i_8_].method8078(-1630878985);
						class494s[i_8_].method8009((short) -13424);
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
					for (int i_9_ = 0; i_9_ < class494s.length; i_9_++) {
						if (class494s[i_9_].method8041(-1775458835) != Class491.aClass491_5475) {
							class494s[i_9_].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10287 = true;
		try {
			aThread10284.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10285.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	HashMap method15930() {
		return aHashMap10280;
	}

	public Object method6274(int i, int i_10_, Class390 class390, Class373 class373, int i_11_, float f) {
		return new Object();
	}

	Object method6289(Class360 class360) {
		return null;
	}

	HashMap method15931() {
		return aHashMap10280;
	}

	public void method6281() {
		if (aClass375_10281 != null)
			aClass375_10281.method6380((byte) 8);
		Iterator iterator = aHashMap10280.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) 4);
				}
				if (bool)
					Arrays.sort(class494s, new Class146(this));
			}
			int i = 3;
			boolean bool = false;
			int i_12_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_12_].method8018((byte) 112);
				Class491 class491 = class494s[i_12_].method8041(-2108780559);
				if (f < 0.0F) {
					if (class491 == Class491.aClass491_5483 || Class491.aClass491_5477 == class491 || Class491.aClass491_5478 == class491)
						class494s[i_12_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_12_ < 0)
					bool = true;
			}
			if (i_12_ >= class494s.length - i) {
				for (/**/; i_12_ >= class494s.length - i; i_12_--) {
					Class491 class491 = class494s[i_12_].method8041(-2027945034);
					if (class491 == Class491.aClass491_5483)
						class494s[i_12_].method8078(-1630878985);
				}
			}
		}
	}

	Object method6278(Class360 class360, int i) {
		return null;
	}

	public void method6279() {
		if (aClass375_10281 != null)
			aClass375_10281.method6380((byte) 94);
		Iterator iterator = aHashMap10280.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) 55);
				}
				if (bool)
					Arrays.sort(class494s, new Class146(this));
			}
			int i = 3;
			boolean bool = false;
			int i_13_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_13_].method8018((byte) 32);
				Class491 class491 = class494s[i_13_].method8041(-1633168446);
				if (f < 0.0F) {
					if (class491 == Class491.aClass491_5483 || Class491.aClass491_5477 == class491 || Class491.aClass491_5478 == class491)
						class494s[i_13_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_13_ < 0)
					bool = true;
			}
			if (i_13_ >= class494s.length - i) {
				for (/**/; i_13_ >= class494s.length - i; i_13_--) {
					Class491 class491 = class494s[i_13_].method8041(-1792977250);
					if (class491 == Class491.aClass491_5483)
						class494s[i_13_].method8078(-1630878985);
				}
			}
		}
	}

	public int method6284(Object object) {
		long l = Class234.method4347(-1408626088);
		int i = (int) (180000.0F / ((float) (l - 8020637959409610333L * aLong10283) / 1000.0F));
		aLong10283 = -3554916692249635339L * l;
		return i;
	}

	public Object method6285(int i, int i_14_, Class390 class390, Class373 class373, int i_15_, float f) {
		return new Object();
	}

	public Class375 method6296() {
		return aClass375_10281;
	}

	public void method6290(Object object, byte[] is, int i, int i_16_) {
		/* empty */
	}

	public void method6288(Object object, byte[] is, int i, int i_17_) {
		/* empty */
	}

	public Class494 method6297(Class485 class485) {
		synchronized (aHashMap10280) {
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (null == class494s) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-1829804075);
				if (class491 == Class491.aClass491_5475) {
					class494.method8005(1064873770);
					Class494 class494_18_ = class494;
					return class494_18_;
				}
			}
		}
		return null;
	}

	public Class494 method6271(Class485 class485) {
		synchronized (aHashMap10280) {
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (null == class494s) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-1987364326);
				if (class491 == Class491.aClass491_5475) {
					class494.method8005(-187112759);
					Class494 class494_19_ = class494;
					return class494_19_;
				}
			}
		}
		return null;
	}

	public Class494 method6291(Class485 class485) {
		synchronized (aHashMap10280) {
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (null == class494s) {
				Class494 class494 = null;
				return class494;
			}
			for (int i = 0; i < class494s.length; i++) {
				Class494 class494 = class494s[i];
				Class491 class491 = class494.method8041(-2130640903);
				if (class491 == Class491.aClass491_5475) {
					class494.method8005(-1185474561);
					Class494 class494_20_ = class494;
					return class494_20_;
				}
			}
		}
		return null;
	}

	Object method6292(Class360 class360) {
		return null;
	}

	HashMap method15932(int i) {
		return aHashMap10280;
	}

	Object method6294(Class360 class360) {
		return null;
	}

	public Class375 method6295() {
		return aClass375_10281;
	}

	public Object method6273(int i, int i_21_, Class390 class390, Class373 class373, int i_22_, float f, byte i_23_) {
		return new Object();
	}

	public void method6286() {
		HashMap hashmap = method15932(-1287166179);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-1877844898) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -1852);
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
						if (class494s[i].method8041(-1635810666) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10287 = true;
		try {
			aThread10284.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10285.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6298() {
		HashMap hashmap = method15932(1391469872);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class485 class485 = (Class485) iterator.next();
				Class494[] class494s = (Class494[]) hashmap.get(class485);
				for (int i = 0; i < class494s.length; i++) {
					if (class494s[i].method8041(-1602460373) != Class491.aClass491_5475) {
						class494s[i].method8078(-1630878985);
						class494s[i].method8009((short) -3703);
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
						if (class494s[i].method8041(-1795279851) != Class491.aClass491_5475) {
							class494s[i].method8021(-903040352);
							bool = false;
						}
					}
				}
			}
			Class518.method8635(10L);
		}
		aBool10287 = true;
		try {
			aThread10284.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10285.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class375 method6287(int i) {
		return aClass375_10281;
	}

	public void method6299(Object object) {
		/* empty */
	}

	public void method6282() {
		if (aClass375_10281 != null)
			aClass375_10281.method6380((byte) 24);
		Iterator iterator = aHashMap10280.keySet().iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			Class494[] class494s = (Class494[]) aHashMap10280.get(class485);
			if (!class485.aBool5457) {
				boolean bool = false;
				for (int i = 0; i < class494s.length; i++) {
					class494s[i].method8021(-903040352);
					bool |= class494s[i].method8012((byte) -83);
				}
				if (bool)
					Arrays.sort(class494s, new Class146(this));
			}
			int i = 3;
			boolean bool = false;
			int i_24_ = class494s.length - 1;
			while (!bool) {
				float f = class494s[i_24_].method8018((byte) 24);
				Class491 class491 = class494s[i_24_].method8041(-1757885020);
				if (f < 0.0F) {
					if (class491 == Class491.aClass491_5483 || Class491.aClass491_5477 == class491 || Class491.aClass491_5478 == class491)
						class494s[i_24_].method8078(-1630878985);
				} else
					bool = true;
				if (--i_24_ < 0)
					bool = true;
			}
			if (i_24_ >= class494s.length - i) {
				for (/**/; i_24_ >= class494s.length - i; i_24_--) {
					Class491 class491 = class494s[i_24_].method8041(-2018639517);
					if (class491 == Class491.aClass491_5483)
						class494s[i_24_].method8078(-1630878985);
				}
			}
		}
	}

	public void method6301(Object object) {
		/* empty */
	}

	static final void method15933(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) client.aFloat11111 >> 3;
	}
}
