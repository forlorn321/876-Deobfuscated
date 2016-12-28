/* Class661 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class661 implements Runnable {
	Thread aThread8506;
	Object anObject8507 = new Object();
	Queue aQueue8508 = new LinkedList();

	public Class654 method7973(String string, int i) {
		if (null == aThread8506)
			throw new IllegalStateException("");
		if (string == null)
			throw new IllegalArgumentException("");
		Class654 class654 = new Class654(string);
		method7977(class654, -634959834);
		return class654;
	}

	public Class661() {
		aThread8506 = new Thread(this);
		aThread8506.setDaemon(true);
		aThread8506.start();
	}

	public void run() {
		for (;;) {
			Class654 class654;
			synchronized (aQueue8508) {
				Object object;
				for (object = aQueue8508.poll(); object == null; object = aQueue8508.poll()) {
					try {
						aQueue8508.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8507)
					break;
				class654 = (Class654) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class654.aString8492).getAddress();
				i = Ping.method608(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class654.anInt8493 = 102448879 * i;
		}
	}

	public void method7974() {
		if (null != aThread8506) {
			method7977(anObject8507, 1832064731);
			try {
				aThread8506.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8506 = null;
		}
	}

	public void method7975() {
		for (;;) {
			Class654 class654;
			synchronized (aQueue8508) {
				Object object;
				for (object = aQueue8508.poll(); object == null; object = aQueue8508.poll()) {
					try {
						aQueue8508.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8507)
					break;
				class654 = (Class654) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class654.aString8492).getAddress();
				i = Ping.method608(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class654.anInt8493 = 102448879 * i;
		}
	}

	public void method7976(byte i) {
		if (null != aThread8506) {
			method7977(anObject8507, -655619403);
			try {
				aThread8506.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8506 = null;
		}
	}

	void method7977(Object object, int i) {
		synchronized (aQueue8508) {
			aQueue8508.add(object);
			aQueue8508.notify();
		}
	}

	public void method7978() {
		if (null != aThread8506) {
			method7977(anObject8507, 267930913);
			try {
				aThread8506.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8506 = null;
		}
	}

	void method7979(Object object) {
		synchronized (aQueue8508) {
			aQueue8508.add(object);
			aQueue8508.notify();
		}
	}

	void method7980(Object object) {
		synchronized (aQueue8508) {
			aQueue8508.add(object);
			aQueue8508.notify();
		}
	}

	static final void method7981(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class400.method4918(class251, class234, class668, 779591250);
	}

	static final void method7982(Class668 class668, byte i) {
		class668.anInt8542 -= 123711566;
		Class536_Sub30 class536_sub30 = ((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		if (Class683.aClass301_Sub1_8651.method4062(-976862787) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10284(class536_sub30.method9629(106204810), class668.anIntArray8541[1867269829 * class668.anInt8542], class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1], class668.anIntArray8541[1867269829 * class668.anInt8542 + 2], class668.anIntArray8541[1867269829 * class668.anInt8542 + 3], class668.anIntArray8541[4 + class668.anInt8542 * 1867269829], class668.anIntArray8541[5 + class668.anInt8542 * 1867269829],
				(short) 9217);
	}

	static final void method7983(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 100;
	}
}
