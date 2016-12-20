/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class548 implements Runnable {
	int anInt7269;
	InputStream anInputStream7270;
	int anInt7271;
	byte[] aByteArray7272;
	Thread aThread7273;
	IOException anIOException7274;
	int anInt7275 = 0;

	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7274 != null)
						return;
					if (0 == anInt7275 * -531262251)
						i = (654826827 * anInt7269 - -1167728419 * anInt7271 - 1);
					else if (anInt7275 * -531262251 <= anInt7271 * -1167728419)
						i = 654826827 * anInt7269 - anInt7271 * -1167728419;
					else
						i = (anInt7275 * -531262251 - -1167728419 * anInt7271 - 1);
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
				i_0_ = anInputStream7270.read(aByteArray7272, anInt7271 * -1167728419, i);
				if (-1 == i_0_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7274 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7271 = ((anInt7271 * -1167728419 + i_0_) % (anInt7269 * 654826827) * -1002965131);
			}
		}
	}

	Class548(InputStream inputstream, int i) {
		anInt7271 = 0;
		anInputStream7270 = inputstream;
		anInt7269 = -1164393373 * (1 + i);
		aByteArray7272 = new byte[654826827 * anInt7269];
		aThread7273 = new Thread(this);
		aThread7273.setDaemon(true);
		aThread7273.start();
	}

	boolean method9076(int i, int i_1_) throws IOException {
		if (i <= 0 || i >= 654826827 * anInt7269)
			throw new IOException();
		synchronized (this) {
			int i_2_;
			if (anInt7275 * -531262251 <= -1167728419 * anInt7271)
				i_2_ = -1167728419 * anInt7271 - -531262251 * anInt7275;
			else
				i_2_ = -1167728419 * anInt7271 + (anInt7269 * 654826827 - anInt7275 * -531262251);
			if (i_2_ < i) {
				if (anIOException7274 != null)
					throw new IOException(anIOException7274.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method9077(int i) throws IOException {
		synchronized (this) {
			int i_3_;
			if (-531262251 * anInt7275 <= -1167728419 * anInt7271)
				i_3_ = -1167728419 * anInt7271 - -531262251 * anInt7275;
			else
				i_3_ = (anInt7269 * 654826827 - anInt7275 * -531262251 + -1167728419 * anInt7271);
			if (null != anIOException7274)
				throw new IOException(anIOException7274.toString());
			this.notifyAll();
			int i_4_ = i_3_;
			return i_4_;
		}
	}

	int method9078(byte[] is, int i, int i_5_, byte i_6_) throws IOException {
		if (i_5_ < 0 || i < 0 || i_5_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_7_;
			if (-531262251 * anInt7275 <= anInt7271 * -1167728419)
				i_7_ = anInt7271 * -1167728419 - anInt7275 * -531262251;
			else
				i_7_ = (654826827 * anInt7269 - anInt7275 * -531262251 + anInt7271 * -1167728419);
			if (i_5_ > i_7_)
				i_5_ = i_7_;
			if (i_5_ == 0 && null != anIOException7274)
				throw new IOException(anIOException7274.toString());
			if (-531262251 * anInt7275 + i_5_ <= 654826827 * anInt7269)
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_5_);
			else {
				int i_8_ = anInt7269 * 654826827 - anInt7275 * -531262251;
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_8_);
				System.arraycopy(aByteArray7272, 0, is, i + i_8_, i_5_ - i_8_);
			}
			anInt7275 = ((anInt7275 * -531262251 + i_5_) % (anInt7269 * 654826827) * 500630653);
			this.notifyAll();
			int i_9_ = i_5_;
			return i_9_;
		}
	}

	int method9079() throws IOException {
		synchronized (this) {
			int i;
			if (-531262251 * anInt7275 <= -1167728419 * anInt7271)
				i = -1167728419 * anInt7271 - -531262251 * anInt7275;
			else
				i = (anInt7269 * 654826827 - anInt7275 * -531262251 + -1167728419 * anInt7271);
			if (null != anIOException7274)
				throw new IOException(anIOException7274.toString());
			this.notifyAll();
			int i_10_ = i;
			return i_10_;
		}
	}

	boolean method9080(int i) throws IOException {
		if (i <= 0 || i >= 654826827 * anInt7269)
			throw new IOException();
		synchronized (this) {
			int i_11_;
			if (anInt7275 * -531262251 <= -1167728419 * anInt7271)
				i_11_ = -1167728419 * anInt7271 - -531262251 * anInt7275;
			else
				i_11_ = -1167728419 * anInt7271 + (anInt7269 * 654826827 - anInt7275 * -531262251);
			if (i_11_ < i) {
				if (anIOException7274 != null)
					throw new IOException(anIOException7274.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	void method9081(byte i) {
		anInputStream7270 = new InputStream_Sub1();
	}

	public void method9082() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7274 != null)
						return;
					if (0 == anInt7275 * -531262251)
						i = (654826827 * anInt7269 - -1167728419 * anInt7271 - 1);
					else if (anInt7275 * -531262251 <= anInt7271 * -1167728419)
						i = 654826827 * anInt7269 - anInt7271 * -1167728419;
					else
						i = (anInt7275 * -531262251 - -1167728419 * anInt7271 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_12_;
			try {
				i_12_ = anInputStream7270.read(aByteArray7272, anInt7271 * -1167728419, i);
				if (-1 == i_12_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7274 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7271 = ((anInt7271 * -1167728419 + i_12_) % (anInt7269 * 654826827) * -1002965131);
			}
		}
	}

	public void method9083() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7274 != null)
						return;
					if (0 == anInt7275 * -531262251)
						i = (654826827 * anInt7269 - -1167728419 * anInt7271 - 1);
					else if (anInt7275 * -531262251 <= anInt7271 * -1167728419)
						i = 654826827 * anInt7269 - anInt7271 * -1167728419;
					else
						i = (anInt7275 * -531262251 - -1167728419 * anInt7271 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_13_;
			try {
				i_13_ = anInputStream7270.read(aByteArray7272, anInt7271 * -1167728419, i);
				if (-1 == i_13_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7274 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7271 = ((anInt7271 * -1167728419 + i_13_) % (anInt7269 * 654826827) * -1002965131);
			}
		}
	}

	int method9084(byte[] is, int i, int i_14_) throws IOException {
		if (i_14_ < 0 || i < 0 || i_14_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_15_;
			if (-531262251 * anInt7275 <= anInt7271 * -1167728419)
				i_15_ = anInt7271 * -1167728419 - anInt7275 * -531262251;
			else
				i_15_ = (654826827 * anInt7269 - anInt7275 * -531262251 + anInt7271 * -1167728419);
			if (i_14_ > i_15_)
				i_14_ = i_15_;
			if (i_14_ == 0 && null != anIOException7274)
				throw new IOException(anIOException7274.toString());
			if (-531262251 * anInt7275 + i_14_ <= 654826827 * anInt7269)
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_14_);
			else {
				int i_16_ = anInt7269 * 654826827 - anInt7275 * -531262251;
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_16_);
				System.arraycopy(aByteArray7272, 0, is, i + i_16_, i_14_ - i_16_);
			}
			anInt7275 = ((anInt7275 * -531262251 + i_14_) % (anInt7269 * 654826827) * 500630653);
			this.notifyAll();
			int i_17_ = i_14_;
			return i_17_;
		}
	}

	void method9085() {
		anInputStream7270 = new InputStream_Sub1();
	}

	int method9086(byte[] is, int i, int i_18_) throws IOException {
		if (i_18_ < 0 || i < 0 || i_18_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_19_;
			if (-531262251 * anInt7275 <= anInt7271 * -1167728419)
				i_19_ = anInt7271 * -1167728419 - anInt7275 * -531262251;
			else
				i_19_ = (654826827 * anInt7269 - anInt7275 * -531262251 + anInt7271 * -1167728419);
			if (i_18_ > i_19_)
				i_18_ = i_19_;
			if (i_18_ == 0 && null != anIOException7274)
				throw new IOException(anIOException7274.toString());
			if (-531262251 * anInt7275 + i_18_ <= 654826827 * anInt7269)
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_18_);
			else {
				int i_20_ = anInt7269 * 654826827 - anInt7275 * -531262251;
				System.arraycopy(aByteArray7272, anInt7275 * -531262251, is, i, i_20_);
				System.arraycopy(aByteArray7272, 0, is, i + i_20_, i_18_ - i_20_);
			}
			anInt7275 = ((anInt7275 * -531262251 + i_18_) % (anInt7269 * 654826827) * 500630653);
			this.notifyAll();
			int i_21_ = i_18_;
			return i_21_;
		}
	}

	void method9087() {
		synchronized (this) {
			if (null == anIOException7274)
				anIOException7274 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7273.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9088() {
		synchronized (this) {
			if (null == anIOException7274)
				anIOException7274 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7273.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9089() {
		synchronized (this) {
			if (null == anIOException7274)
				anIOException7274 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7273.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method9090() {
		anInputStream7270 = new InputStream_Sub1();
	}

	void method9091(byte i) {
		synchronized (this) {
			if (null == anIOException7274)
				anIOException7274 = new IOException("");
			this.notifyAll();
		}
		try {
			aThread7273.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static final void method9092(Class665 class665, int i) {
		int i_22_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_22_, 573185812));
		if (class9.anInt132 * -73038935 >= 0 && class9.anInt103 * 1450438899 >= 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1450438899 * class9.anInt103;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_22_;
	}

	static final void method9093(Class665 class665, int i) {
		if (null != client.aString11270)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class240.method4393(client.aString11270, -808148028);
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
	}

	public static final void method9094(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		Class405.anInt4196 = 1987416811 * i;
		Class170.anInt1881 = -765061525 * i_23_;
		Class447.anInt4930 = 60738885 * i_24_;
		Class209.anInt2246 = i_25_ * 619396181;
		Class78.anInt801 = 1633835439 * i_26_;
		if (-349191067 * Class30.anInt265 == 2)
			Class588.method9814((byte) 29);
		if (Class78.anInt801 * -1338335921 >= 100) {
			int i_28_ = 789284352 * Class405.anInt4196 + 256;
			int i_29_ = Class170.anInt1881 * -640907776 + 256;
			int i_30_ = (Class590.method9853(i_28_, i_29_, Class673.anInt8585 * 162317215, (byte) 5) - -1151746675 * Class447.anInt4930);
			int i_31_ = i_28_ - Class320.anInt3543 * -1998563323;
			int i_32_ = i_30_ - 298893113 * Class142.anInt1657;
			int i_33_ = i_29_ - -1261737255 * Class201.anInt2211;
			int i_34_ = (int) Math.sqrt((double) (i_31_ * i_31_ + i_33_ * i_33_));
			Class700_Sub34.anInt10928 = ((int) (Math.atan2((double) i_32_, (double) i_34_) * 2607.5945876176133) & 0x3fff) * -290107601;
			Class12.anInt176 = ((int) (Math.atan2((double) i_31_, (double) i_33_) * -2607.5945876176133) & 0x3fff) * 355973435;
			Class689.anInt8692 = 0;
			if (-1153148977 * Class700_Sub34.anInt10928 < 1024)
				Class700_Sub34.anInt10928 = -717440000;
			if (-1153148977 * Class700_Sub34.anInt10928 > 3072)
				Class700_Sub34.anInt10928 = 2142647296;
		}
		Class30.anInt265 = -203298745;
		Class452.anInt4964 = 1432081761;
		Class400.anInt4141 = -228665961;
	}
}
