/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class561 implements Runnable {
	IOException anIOException7538;
	InputStream anInputStream7539;
	int anInt7540;
	Thread aThread7541;
	int anInt7542 = 0;
	byte[] aByteArray7543;
	int anInt7544 = 0;

	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != anIOException7538)
						return;
					if (anInt7542 * -361646465 == 0)
						i = (740172877 * anInt7540 - anInt7544 * -1669643557 - 1);
					else if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
						i = 740172877 * anInt7540 - anInt7544 * -1669643557;
					else
						i = (anInt7542 * -361646465 - -1669643557 * anInt7544 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_0_;
			try {
				i_0_ = anInputStream7539.read(aByteArray7543, anInt7544 * -1669643557, i);
				if (-1 == i_0_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7538 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7544 = 999352659 * ((anInt7544 * -1669643557 + i_0_) % (anInt7540 * 740172877));
			}
		}
	}

	void method6830() {
		synchronized (this) {
			if (null == anIOException7538)
				anIOException7538 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7541.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	int method6831(int i) throws IOException {
		synchronized (this) {
			int i_1_;
			if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
				i_1_ = anInt7544 * -1669643557 - -361646465 * anInt7542;
			else
				i_1_ = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (anIOException7538 != null)
				throw new IOException(anIOException7538.toString());
			this.notifyAll();
			int i_2_ = i_1_;
			return i_2_;
		}
	}

	int method6832(byte[] is, int i, int i_3_, int i_4_) throws IOException {
		if (i_3_ < 0 || i < 0 || i + i_3_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_5_;
			if (anInt7542 * -361646465 <= -1669643557 * anInt7544)
				i_5_ = -1669643557 * anInt7544 - anInt7542 * -361646465;
			else
				i_5_ = (anInt7540 * 740172877 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (i_3_ > i_5_)
				i_3_ = i_5_;
			if (0 == i_3_ && null != anIOException7538)
				throw new IOException(anIOException7538.toString());
			if (anInt7542 * -361646465 + i_3_ <= anInt7540 * 740172877)
				System.arraycopy(aByteArray7543, -361646465 * anInt7542, is, i, i_3_);
			else {
				int i_6_ = 740172877 * anInt7540 - -361646465 * anInt7542;
				System.arraycopy(aByteArray7543, anInt7542 * -361646465, is, i, i_6_);
				System.arraycopy(aByteArray7543, 0, is, i_6_ + i, i_3_ - i_6_);
			}
			anInt7542 = -271316609 * ((i_3_ + -361646465 * anInt7542) % (anInt7540 * 740172877));
			this.notifyAll();
			int i_7_ = i_3_;
			return i_7_;
		}
	}

	boolean method6833(int i, int i_8_) throws IOException {
		if (i <= 0 || i >= 740172877 * anInt7540)
			throw new IOException();
		synchronized (this) {
			int i_9_;
			if (anInt7542 * -361646465 <= -1669643557 * anInt7544)
				i_9_ = anInt7544 * -1669643557 - anInt7542 * -361646465;
			else
				i_9_ = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (i_9_ < i) {
				if (anIOException7538 != null)
					throw new IOException(anIOException7538.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	void method6834(int i) {
		anInputStream7539 = new InputStream_Sub1();
	}

	Class561(InputStream inputstream, int i) {
		anInputStream7539 = inputstream;
		anInt7540 = (1 + i) * -896158587;
		aByteArray7543 = new byte[anInt7540 * 740172877];
		aThread7541 = new Thread(this);
		aThread7541.setDaemon(true);
		aThread7541.start();
	}

	boolean method6835(int i) throws IOException {
		if (i <= 0 || i >= 740172877 * anInt7540)
			throw new IOException();
		synchronized (this) {
			int i_10_;
			if (anInt7542 * -361646465 <= -1669643557 * anInt7544)
				i_10_ = anInt7544 * -1669643557 - anInt7542 * -361646465;
			else
				i_10_ = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (i_10_ < i) {
				if (anIOException7538 != null)
					throw new IOException(anIOException7538.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	boolean method6836(int i) throws IOException {
		if (i <= 0 || i >= 740172877 * anInt7540)
			throw new IOException();
		synchronized (this) {
			int i_11_;
			if (anInt7542 * -361646465 <= -1669643557 * anInt7544)
				i_11_ = anInt7544 * -1669643557 - anInt7542 * -361646465;
			else
				i_11_ = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (i_11_ < i) {
				if (anIOException7538 != null)
					throw new IOException(anIOException7538.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	boolean method6837(int i) throws IOException {
		if (i <= 0 || i >= 740172877 * anInt7540)
			throw new IOException();
		synchronized (this) {
			int i_12_;
			if (anInt7542 * -361646465 <= -1669643557 * anInt7544)
				i_12_ = anInt7544 * -1669643557 - anInt7542 * -361646465;
			else
				i_12_ = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (i_12_ < i) {
				if (anIOException7538 != null)
					throw new IOException(anIOException7538.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method6838() throws IOException {
		synchronized (this) {
			int i;
			if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
				i = anInt7544 * -1669643557 - -361646465 * anInt7542;
			else
				i = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (anIOException7538 != null)
				throw new IOException(anIOException7538.toString());
			this.notifyAll();
			int i_13_ = i;
			return i_13_;
		}
	}

	int method6839() throws IOException {
		synchronized (this) {
			int i;
			if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
				i = anInt7544 * -1669643557 - -361646465 * anInt7542;
			else
				i = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (anIOException7538 != null)
				throw new IOException(anIOException7538.toString());
			this.notifyAll();
			int i_14_ = i;
			return i_14_;
		}
	}

	int method6840() throws IOException {
		synchronized (this) {
			int i;
			if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
				i = anInt7544 * -1669643557 - -361646465 * anInt7542;
			else
				i = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (anIOException7538 != null)
				throw new IOException(anIOException7538.toString());
			this.notifyAll();
			int i_15_ = i;
			return i_15_;
		}
	}

	int method6841() throws IOException {
		synchronized (this) {
			int i;
			if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
				i = anInt7544 * -1669643557 - -361646465 * anInt7542;
			else
				i = (740172877 * anInt7540 - anInt7542 * -361646465 + -1669643557 * anInt7544);
			if (anIOException7538 != null)
				throw new IOException(anIOException7538.toString());
			this.notifyAll();
			int i_16_ = i;
			return i_16_;
		}
	}

	void method6842(short i) {
		synchronized (this) {
			if (null == anIOException7538)
				anIOException7538 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7541.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method6843() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != anIOException7538)
						return;
					if (anInt7542 * -361646465 == 0)
						i = (740172877 * anInt7540 - anInt7544 * -1669643557 - 1);
					else if (anInt7542 * -361646465 <= anInt7544 * -1669643557)
						i = 740172877 * anInt7540 - anInt7544 * -1669643557;
					else
						i = (anInt7542 * -361646465 - -1669643557 * anInt7544 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_17_;
			try {
				i_17_ = anInputStream7539.read(aByteArray7543, anInt7544 * -1669643557, i);
				if (-1 == i_17_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7538 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7544 = 999352659 * ((anInt7544 * -1669643557 + i_17_) % (anInt7540 * 740172877));
			}
		}
	}

	void method6844() {
		synchronized (this) {
			if (null == anIOException7538)
				anIOException7538 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7541.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6845() {
		synchronized (this) {
			if (null == anIOException7538)
				anIOException7538 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7541.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6846() {
		anInputStream7539 = new InputStream_Sub1();
	}

	static final void method6847(Class668 class668, int i) {
		Class705.method8276((String) (class668.anObjectArray8543[((class668.anInt8544 -= 1946079257) * 366709801)]), -1553727198);
	}

	static final void method6848(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aBool10995 ? 1 : 0;
	}

	static final void method6849(Class668 class668, int i) {
		Class536_Sub18_Sub9 class536_sub18_sub9 = Class19.method690((byte) 59);
		if (Class555.method6805(class536_sub18_sub9, -631595865) == 4) {
			Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556(class536_sub18_sub9.method10700(34163334)));
			if (null != class536_sub13) {
				class668.aClass649_Sub1_Sub5_Sub1_8554 = (Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468;
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
				return;
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method6850(Class668 class668, int i) {
		int i_18_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub5_10760), i_18_, (byte) 1);
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub5_10761), i_18_, (byte) 1);
		Class710.aClass536_Sub40_8843.aClass710_Sub5_10760.method9915(-245343484);
		Class710.aClass536_Sub40_8843.aClass710_Sub5_10761.method9915(-1304948507);
		Class85.method1188(-291631285);
		Class27.method763(2129799137);
		client.aBool11015 = false;
	}

	static final void method6851(Class668 class668, int i) {
		long l = Class249.method3450(1702917602);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = IncomingPacket.method5069(l);
	}

	public static boolean method6852(int i, int i_19_, byte i_20_) {
		if (!Class70.aBool752)
			return false;
		int i_21_ = i >> 16;
		int i_22_ = i & 0xffff;
		if (Class463.aClass234Array5227[i_21_] == null || null == (Class463.aClass234Array5227[i_21_].aClass251Array2378[i_22_]))
			return false;
		InterfaceDefinitions class251 = Class463.aClass234Array5227[i_21_].aClass251Array2378[i_22_];
		if (-1 != i_19_ || 1049444347 * class251.anInt2728 != 0) {
			for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(2066620276))) {
				if (i_19_ == 1841718011 * class536_sub18_sub9.anInt11713 && (class251.anInt2559 * -1591767037 == -712698209 * class536_sub18_sub9.anInt11708) && (class536_sub18_sub9.anInt11718 * -517484763 == 58 || class536_sub18_sub9.anInt11718 * -517484763 == 1007 || 25 == -517484763 * class536_sub18_sub9.anInt11718 || class536_sub18_sub9.anInt11718 * -517484763 == 57 || 30 == -517484763 * class536_sub18_sub9.anInt11718))
					return true;
			}
		} else {
			for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); class536_sub18_sub9 != null; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(947232452))) {
				if (58 == -517484763 * class536_sub18_sub9.anInt11718 || 1007 == class536_sub18_sub9.anInt11718 * -517484763 || 25 == -517484763 * class536_sub18_sub9.anInt11718 || -517484763 * class536_sub18_sub9.anInt11718 == 57 || -517484763 * class536_sub18_sub9.anInt11718 == 30) {
					for (InterfaceDefinitions class251_23_ = Class264.method3678((class536_sub18_sub9.anInt11708) * -712698209, -689214737); null != class251_23_; class251_23_ = Class648.method7834((Class463.aClass234Array5227[(class251_23_.anInt2559 * -1591767037) >> 16]), class251_23_, -16777216)) {
						if (class251_23_.anInt2559 * -1591767037 == class251.anInt2559 * -1591767037)
							return true;
					}
				}
			}
		}
		return false;
	}
}
