/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class466 implements Runnable {
	boolean aBool5319;
	int anInt5320;
	Class700 aClass700_5321 = new Class700();
	Thread aThread5322;
	public static Class439 aClass439_5323;
	static short aShort5324;

	Class536_Sub18_Sub15_Sub1 method5669(int i, Class547 class547, int i_0_) {
		Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1 = new Class536_Sub18_Sub15_Sub1();
		class536_sub18_sub15_sub1.anInt12099 = 146310815;
		synchronized (aClass700_5321) {
			for (Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1_1_ = ((Class536_Sub18_Sub15_Sub1) aClass700_5321.method8248(-1786466546)); class536_sub18_sub15_sub1_1_ != null; class536_sub18_sub15_sub1_1_ = ((Class536_Sub18_Sub15_Sub1) aClass700_5321.method8241(-1777921390))) {
				if ((long) i == (class536_sub18_sub15_sub1_1_.aLong10507 * 4749301371101216403L) && class547 == class536_sub18_sub15_sub1_1_.aClass547_12096 && (-1532684961 * class536_sub18_sub15_sub1_1_.anInt12099 == 2)) {
					class536_sub18_sub15_sub1.aByteArray12101 = class536_sub18_sub15_sub1_1_.aByteArray12101;
					class536_sub18_sub15_sub1.aBool11777 = false;
					Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1_2_ = class536_sub18_sub15_sub1;
					return class536_sub18_sub15_sub1_2_;
				}
			}
		}
		class536_sub18_sub15_sub1.aByteArray12101 = class547.method6626(i, 643577275);
		class536_sub18_sub15_sub1.aBool11777 = false;
		class536_sub18_sub15_sub1.aBool11778 = true;
		return class536_sub18_sub15_sub1;
	}

	Class536_Sub18_Sub15_Sub1 method5670(int i, byte[] is, Class547 class547, byte i_3_) {
		Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1 = new Class536_Sub18_Sub15_Sub1();
		class536_sub18_sub15_sub1.anInt12099 = 292621630;
		class536_sub18_sub15_sub1.aLong10507 = (long) i * 2122374251850846107L;
		class536_sub18_sub15_sub1.aByteArray12101 = is;
		class536_sub18_sub15_sub1.aClass547_12096 = class547;
		class536_sub18_sub15_sub1.aBool11778 = false;
		method5671(class536_sub18_sub15_sub1, 840449952);
		return class536_sub18_sub15_sub1;
	}

	public void run() {
		while (!aBool5319) {
			Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1;
			synchronized (aClass700_5321) {
				class536_sub18_sub15_sub1 = ((Class536_Sub18_Sub15_Sub1) aClass700_5321.method8237(731057891));
				if (null != class536_sub18_sub15_sub1)
					anInt5320 -= 542544815;
				else {
					try {
						aClass700_5321.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == class536_sub18_sub15_sub1.anInt12099 * -1532684961)
					class536_sub18_sub15_sub1.aClass547_12096.method6628((int) (4749301371101216403L * class536_sub18_sub15_sub1.aLong10507), class536_sub18_sub15_sub1.aByteArray12101, class536_sub18_sub15_sub1.aByteArray12101.length, -1254656080);
				else if (class536_sub18_sub15_sub1.anInt12099 * -1532684961 == 3)
					class536_sub18_sub15_sub1.aByteArray12101 = (class536_sub18_sub15_sub1.aClass547_12096.method6626((int) (4749301371101216403L * class536_sub18_sub15_sub1.aLong10507), 643577275));
			} catch (Exception exception) {
				Class81.method1165(null, exception, (byte) 30);
			}
			class536_sub18_sub15_sub1.aBool11777 = false;
		}
	}

	void method5671(Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1, int i) {
		synchronized (aClass700_5321) {
			aClass700_5321.method8239(class536_sub18_sub15_sub1, (byte) -31);
			anInt5320 += 542544815;
			aClass700_5321.notifyAll();
		}
	}

	public void method5672() {
		aBool5319 = true;
		synchronized (aClass700_5321) {
			aClass700_5321.notifyAll();
		}
		try {
			aThread5322.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5322 = null;
	}

	public void method5673(int i) {
		aBool5319 = true;
		synchronized (aClass700_5321) {
			aClass700_5321.notifyAll();
		}
		try {
			aThread5322.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5322 = null;
	}

	public Class466() {
		anInt5320 = 0;
		aBool5319 = false;
		aThread5322 = new Thread(this);
		aThread5322.setDaemon(true);
		aThread5322.start();
		aThread5322.setPriority(1);
	}

	public void method5674() {
		while (!aBool5319) {
			Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1;
			synchronized (aClass700_5321) {
				class536_sub18_sub15_sub1 = ((Class536_Sub18_Sub15_Sub1) aClass700_5321.method8237(2128629764));
				if (null != class536_sub18_sub15_sub1)
					anInt5320 -= 542544815;
				else {
					try {
						aClass700_5321.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == class536_sub18_sub15_sub1.anInt12099 * -1532684961)
					class536_sub18_sub15_sub1.aClass547_12096.method6628((int) (4749301371101216403L * class536_sub18_sub15_sub1.aLong10507), class536_sub18_sub15_sub1.aByteArray12101, class536_sub18_sub15_sub1.aByteArray12101.length, 1820711846);
				else if (class536_sub18_sub15_sub1.anInt12099 * -1532684961 == 3)
					class536_sub18_sub15_sub1.aByteArray12101 = (class536_sub18_sub15_sub1.aClass547_12096.method6626((int) (4749301371101216403L * class536_sub18_sub15_sub1.aLong10507), 643577275));
			} catch (Exception exception) {
				Class81.method1165(null, exception, (byte) -1);
			}
			class536_sub18_sub15_sub1.aBool11777 = false;
		}
	}

	public int method5675(int i) {
		synchronized (aClass700_5321) {
			int i_4_ = 2126553935 * anInt5320;
			return i_4_;
		}
	}

	public int method5676() {
		synchronized (aClass700_5321) {
			int i = 2126553935 * anInt5320;
			return i;
		}
	}

	public int method5677() {
		synchronized (aClass700_5321) {
			int i = 2126553935 * anInt5320;
			return i;
		}
	}

	public void method5678() {
		aBool5319 = true;
		synchronized (aClass700_5321) {
			aClass700_5321.notifyAll();
		}
		try {
			aThread5322.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5322 = null;
	}

	Class536_Sub18_Sub15_Sub1 method5679(int i, Class547 class547, byte i_5_) {
		Class536_Sub18_Sub15_Sub1 class536_sub18_sub15_sub1 = new Class536_Sub18_Sub15_Sub1();
		class536_sub18_sub15_sub1.anInt12099 = 438932445;
		class536_sub18_sub15_sub1.aLong10507 = (long) i * 2122374251850846107L;
		class536_sub18_sub15_sub1.aClass547_12096 = class547;
		class536_sub18_sub15_sub1.aBool11778 = false;
		method5671(class536_sub18_sub15_sub1, 1564233666);
		return class536_sub18_sub15_sub1;
	}

	public void method5680() {
		aBool5319 = true;
		synchronized (aClass700_5321) {
			aClass700_5321.notifyAll();
		}
		try {
			aThread5322.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5322 = null;
	}

	public void method5681() {
		aBool5319 = true;
		synchronized (aClass700_5321) {
			aClass700_5321.notifyAll();
		}
		try {
			aThread5322.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5322 = null;
	}

	static final void method5682(InterfaceDefinitions class251, Class668 class668, int i) {
		if (client.method10389(class251).method9476() && null == client.aClass251_11057) {
			Class465_Sub1.method9386(-1591767037 * class251.anInt2559, class251.anInt2546 * -809980533, (byte) -106);
			client.aClass251_11057 = Class527.method6429(-1591767037 * class251.anInt2559, class251.anInt2546 * -809980533, (byte) -56);
			Class668.method8011(client.aClass251_11057, 263642117);
		}
	}

	static final void method5683(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.aBool2597 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
	}

	static final void method5684(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_6_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_6_ >> 16];
		Class536_Sub30.method9639(class251, class234, class668, -1878483750);
	}

	static final void method5685(Class668 class668, byte i) throws Exception_Sub3 {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class683.aClass301_Sub1_8651.method4031(Class243.method3399(i_7_, 1855636510), true, -1799662486);
		client.aBool11242 = true;
	}
}
