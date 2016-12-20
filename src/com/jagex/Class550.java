/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class Class550 implements Runnable {
	byte[] aByteArray7286;
	int anInt7287 = 0;
	int anInt7288;
	OutputStream anOutputStream7289;
	Thread aThread7290;
	int anInt7291 = 0;
	IOException anIOException7292;
	boolean aBool7293;
	protected static Class1[] aClass1Array7294;

	void method9099(byte i) {
		anOutputStream7289 = new OutputStream_Sub1();
	}

	boolean method9100(int i) {
		if (aBool7293) {
			try {
				anOutputStream7289.close();
				if (anIOException7292 == null)
					anIOException7292 = new IOException("");
			} catch (IOException ioexception) {
				if (null == anIOException7292)
					anIOException7292 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	boolean method9101() {
		if (aBool7293) {
			try {
				anOutputStream7289.close();
				if (anIOException7292 == null)
					anIOException7292 = new IOException("");
			} catch (IOException ioexception) {
				if (null == anIOException7292)
					anIOException7292 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	Class550(OutputStream outputstream, int i) {
		anOutputStream7289 = outputstream;
		anInt7288 = 1060704997 * (1 + i);
		aByteArray7286 = new byte[-1742644499 * anInt7288];
		aThread7290 = new Thread(this);
		aThread7290.setDaemon(true);
		aThread7290.start();
	}

	void method9102(int i) {
		synchronized (this) {
			aBool7293 = true;
			this.notifyAll();
		}
		try {
			aThread7290.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	boolean method9103() {
		if (aBool7293) {
			try {
				anOutputStream7289.close();
				if (anIOException7292 == null)
					anIOException7292 = new IOException("");
			} catch (IOException ioexception) {
				if (null == anIOException7292)
					anIOException7292 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	public void method9104() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7292 != null)
						return;
					if (-1696871333 * anInt7287 <= anInt7291 * -1349610715)
						i = anInt7291 * -1349610715 - anInt7287 * -1696871333;
					else
						i = (-1349610715 * anInt7291 + (anInt7288 * -1742644499 - anInt7287 * -1696871333));
					if (i > 0)
						break;
					try {
						anOutputStream7289.flush();
					} catch (IOException ioexception) {
						anIOException7292 = ioexception;
						return;
					}
					if (method9100(1831578622))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (i + anInt7287 * -1696871333 <= -1742644499 * anInt7288)
					anOutputStream7289.write(aByteArray7286, anInt7287 * -1696871333, i);
				else {
					int i_0_ = anInt7288 * -1742644499 - anInt7287 * -1696871333;
					anOutputStream7289.write(aByteArray7286, -1696871333 * anInt7287, i_0_);
					anOutputStream7289.write(aByteArray7286, 0, i - i_0_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7292 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7287 = 487359443 * ((i + -1696871333 * anInt7287) % (-1742644499 * anInt7288));
			}
		} while (!method9100(1056956225));
	}

	public void method9105() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7292 != null)
						return;
					if (-1696871333 * anInt7287 <= anInt7291 * -1349610715)
						i = anInt7291 * -1349610715 - anInt7287 * -1696871333;
					else
						i = (-1349610715 * anInt7291 + (anInt7288 * -1742644499 - anInt7287 * -1696871333));
					if (i > 0)
						break;
					try {
						anOutputStream7289.flush();
					} catch (IOException ioexception) {
						anIOException7292 = ioexception;
						return;
					}
					if (method9100(1699267787))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (i + anInt7287 * -1696871333 <= -1742644499 * anInt7288)
					anOutputStream7289.write(aByteArray7286, anInt7287 * -1696871333, i);
				else {
					int i_1_ = anInt7288 * -1742644499 - anInt7287 * -1696871333;
					anOutputStream7289.write(aByteArray7286, -1696871333 * anInt7287, i_1_);
					anOutputStream7289.write(aByteArray7286, 0, i - i_1_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7292 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7287 = 487359443 * ((i + -1696871333 * anInt7287) % (-1742644499 * anInt7288));
			}
		} while (!method9100(1951061734));
	}

	public void run() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7292 != null)
						return;
					if (-1696871333 * anInt7287 <= anInt7291 * -1349610715)
						i = anInt7291 * -1349610715 - anInt7287 * -1696871333;
					else
						i = (-1349610715 * anInt7291 + (anInt7288 * -1742644499 - anInt7287 * -1696871333));
					if (i > 0)
						break;
					try {
						anOutputStream7289.flush();
					} catch (IOException ioexception) {
						anIOException7292 = ioexception;
						return;
					}
					if (method9100(1424011185))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (i + anInt7287 * -1696871333 <= -1742644499 * anInt7288)
					anOutputStream7289.write(aByteArray7286, anInt7287 * -1696871333, i);
				else {
					int i_2_ = anInt7288 * -1742644499 - anInt7287 * -1696871333;
					anOutputStream7289.write(aByteArray7286, -1696871333 * anInt7287, i_2_);
					anOutputStream7289.write(aByteArray7286, 0, i - i_2_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7292 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7287 = 487359443 * ((i + -1696871333 * anInt7287) % (-1742644499 * anInt7288));
			}
		} while (!method9100(1060499577));
	}

	void method9106(byte[] is, int i, int i_3_, int i_4_) throws IOException {
		if (i_3_ < 0 || i < 0 || i_3_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			if (anIOException7292 != null)
				throw new IOException(anIOException7292.toString());
			int i_5_;
			if (anInt7287 * -1696871333 <= anInt7291 * -1349610715)
				i_5_ = (anInt7288 * -1742644499 - -1349610715 * anInt7291 + -1696871333 * anInt7287 - 1);
			else
				i_5_ = -1696871333 * anInt7287 - -1349610715 * anInt7291 - 1;
			if (i_5_ < i_3_)
				throw new IOException("");
			if (anInt7291 * -1349610715 + i_3_ <= -1742644499 * anInt7288)
				System.arraycopy(is, i, aByteArray7286, -1349610715 * anInt7291, i_3_);
			else {
				int i_6_ = -1742644499 * anInt7288 - -1349610715 * anInt7291;
				System.arraycopy(is, i, aByteArray7286, anInt7291 * -1349610715, i_6_);
				System.arraycopy(is, i_6_ + i, aByteArray7286, 0, i_3_ - i_6_);
			}
			anInt7291 = 428822701 * ((i_3_ + anInt7291 * -1349610715) % (anInt7288 * -1742644499));
			this.notifyAll();
		}
	}

	boolean method9107() {
		if (aBool7293) {
			try {
				anOutputStream7289.close();
				if (anIOException7292 == null)
					anIOException7292 = new IOException("");
			} catch (IOException ioexception) {
				if (null == anIOException7292)
					anIOException7292 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method9108() {
		synchronized (this) {
			aBool7293 = true;
			this.notifyAll();
		}
		try {
			aThread7290.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9109() {
		anOutputStream7289 = new OutputStream_Sub1();
	}

	static final void method9110(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[891367231 * class665.anInt8527]);
	}

	static final void method9111(Class665 class665, int i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class317.method5681(i_7_, string, (short) 5055);
	}

	static final void method9112(Class665 class665, int i) {
		if (0 != -305384391 * class665.anInt8531) {
			Class659 class659 = (class665.aClass659Array8520[(class665.anInt8531 -= -798524919) * -305384391]);
			class665.aClass527_Sub8_Sub10_8548 = class659.aClass527_Sub8_Sub10_8494;
			class665.aClass501Array8521 = class665.aClass527_Sub8_Sub10_8548.aClass501Array11731;
			class665.anIntArray8545 = class665.aClass527_Sub8_Sub10_8548.anIntArray11724;
			class665.anInt8527 = 259649671 * class659.anInt8490;
			class665.anIntArray8546 = class659.anIntArray8492;
			class665.anObjectArray8524 = class659.anObjectArray8493;
			class665.aLongArray8547 = class659.aLongArray8495;
		}
	}

	static final void method9113(Class665 class665, int i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529.method8752(i_8_);
		if (class527_sub8_sub12 == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class527_sub8_sub12.anInt11763 * 18711255;
	}

	static final void method9114(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_9_ >> 28;
	}

	public static void method9115(Class522 class522, Class522 class522_10_, byte i) {
		if (class522.aClass522_7089 != null)
			class522.method8682(-704543175);
		class522.aClass522_7089 = class522_10_;
		class522.aClass522_7088 = class522_10_.aClass522_7088;
		class522.aClass522_7089.aClass522_7088 = class522;
		class522.aClass522_7088.aClass522_7089 = class522;
	}
}
