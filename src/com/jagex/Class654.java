/* Class654 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class654 implements Runnable {
	Object anObject8387 = new Object();
	Thread aThread8388;
	Queue aQueue8389 = new LinkedList();

	public Class638 method10904(String string, int i) {
		if (null == aThread8388)
			throw new IllegalStateException("");
		if (string == null)
			throw new IllegalArgumentException("");
		Class638 class638 = new Class638(string);
		method10907(class638, 246075588);
		return class638;
	}

	public Class638 method10905(String string) {
		if (null == aThread8388)
			throw new IllegalStateException("");
		if (string == null)
			throw new IllegalArgumentException("");
		Class638 class638 = new Class638(string);
		method10907(class638, 879036312);
		return class638;
	}

	public void method10906(int i) {
		if (aThread8388 != null) {
			method10907(anObject8387, 1978035286);
			try {
				aThread8388.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8388 = null;
		}
	}

	void method10907(Object object, int i) {
		synchronized (aQueue8389) {
			aQueue8389.add(object);
			aQueue8389.notify();
		}
	}

	public Class654() {
		aThread8388 = new Thread(this);
		aThread8388.setDaemon(true);
		aThread8388.start();
	}

	public void method10908() {
		for (;;) {
			Class638 class638;
			synchronized (aQueue8389) {
				Object object;
				for (object = aQueue8389.poll(); null == object; object = aQueue8389.poll()) {
					try {
						aQueue8389.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8387)
					break;
				class638 = (Class638) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class638.aString8319).getAddress();
				i = Ping.method670(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class638.anInt8320 = 1460071847 * i;
		}
	}

	public void run() {
		for (;;) {
			Class638 class638;
			synchronized (aQueue8389) {
				Object object;
				for (object = aQueue8389.poll(); null == object; object = aQueue8389.poll()) {
					try {
						aQueue8389.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8387)
					break;
				class638 = (Class638) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class638.aString8319).getAddress();
				i = Ping.method670(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class638.anInt8320 = 1460071847 * i;
		}
	}

	public void method10909() {
		for (;;) {
			Class638 class638;
			synchronized (aQueue8389) {
				Object object;
				for (object = aQueue8389.poll(); null == object; object = aQueue8389.poll()) {
					try {
						aQueue8389.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8387)
					break;
				class638 = (Class638) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class638.aString8319).getAddress();
				i = Ping.method670(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class638.anInt8320 = 1460071847 * i;
		}
	}

	public void method10910() {
		if (aThread8388 != null) {
			method10907(anObject8387, 581137725);
			try {
				aThread8388.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8388 = null;
		}
	}

	void method10911(Object object) {
		synchronized (aQueue8389) {
			aQueue8389.add(object);
			aQueue8389.notify();
		}
	}

	void method10912(Object object) {
		synchronized (aQueue8389) {
			aQueue8389.add(object);
			aQueue8389.notify();
		}
	}

	static final void method10913(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_1_ = Class46.method1235(Class73.aClass677_790, Class682.aClass682_8648, i_0_, -611270071);
		int i_2_ = Class556.method9421(Class73.aClass677_790, Class682.aClass682_8648, i_0_, (byte) 4);
		if (-1927019389 * client.anInt11048 != 0 || Class266.method5045((byte) 1))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (Class645.method10747(i_0_, string, i_1_, i_2_, -175509422) ? 1 : 0);
	}

	static final void method10914(Class665 class665, boolean bool, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class87 class87 = Class144_Sub1.method14514(i_3_, -78845949);
		if (null == class87)
			throw new RuntimeException();
		Class697.aList8761 = class87.method1619(Integer.valueOf(i_4_), -275037951);
		if (null != Class697.aList8761) {
			Class187.anIterator2119 = Class697.aList8761.iterator();
			if (bool)
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class697.aList8761.size();
		} else if (bool)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method10915(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (i_6_ >= 1 && i_7_ >= 1 && i_6_ <= client.aClass509_11072.method8284((byte) 101) - 2 && i_7_ <= client.aClass509_11072.method8285(-38444733) - 2) {
			int i_14_ = i;
			if (i_14_ < 3 && client.aClass509_11072.method8359(-52752957).method7706(i_6_, i_7_, (short) 4430))
				i_14_++;
			if (client.aClass509_11072.method8314(-1295246387) != null) {
				client.aClass509_11072.method8300((byte) 49).method15965(Class402.aClass180_4150, i, i_5_, i_6_, i_7_, (byte) 47);
				if (i_8_ >= 0) {
					int i_15_ = Class204.aClass527_Sub31_2213.aClass700_Sub4_10600.method16875(586224795);
					Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub4_10600, 1, 1948054437);
					client.aClass509_11072.method8300((byte) 122).method15963(Class402.aClass180_4150, i_14_, i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, 1289110051);
					Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub4_10600, i_15_, 741241579);
				}
				Class455.method7346((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), -260851414);
			}
		}
	}
}
