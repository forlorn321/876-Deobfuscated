/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class461 implements Runnable {
	Thread aThread5090;
	Class693 aClass693_5091 = new Class693();
	boolean aBool5092;
	int anInt5093 = 0;
	public static Class459 aClass459_5094;

	Class527_Sub8_Sub13_Sub1 method7578(int i, Class552 class552) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = -1889263691;
		synchronized (aClass693_5091) {
			for (Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_0_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14072(981552732)); null != class527_sub8_sub13_sub1_0_; class527_sub8_sub13_sub1_0_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14059(560201208))) {
				if ((-8775265850242314087L * class527_sub8_sub13_sub1_0_.aLong10401) == (long) i && class552 == class527_sub8_sub13_sub1_0_.aClass552_12039 && 2 == (class527_sub8_sub13_sub1_0_.anInt12035 * -691857763)) {
					class527_sub8_sub13_sub1.aByteArray12038 = class527_sub8_sub13_sub1_0_.aByteArray12038;
					class527_sub8_sub13_sub1.aBool11768 = false;
					Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_1_ = class527_sub8_sub13_sub1;
					return class527_sub8_sub13_sub1_1_;
				}
			}
		}
		class527_sub8_sub13_sub1.aByteArray12038 = class552.method9141(i, (byte) 6);
		class527_sub8_sub13_sub1.aBool11768 = false;
		class527_sub8_sub13_sub1.aBool11767 = true;
		return class527_sub8_sub13_sub1;
	}

	Class527_Sub8_Sub13_Sub1 method7579(int i, Class552 class552, byte i_2_) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = -1889263691;
		synchronized (aClass693_5091) {
			for (Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_3_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14072(-1563059465)); null != class527_sub8_sub13_sub1_3_; class527_sub8_sub13_sub1_3_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14059(1398689649))) {
				if ((-8775265850242314087L * class527_sub8_sub13_sub1_3_.aLong10401) == (long) i && class552 == class527_sub8_sub13_sub1_3_.aClass552_12039 && 2 == (class527_sub8_sub13_sub1_3_.anInt12035 * -691857763)) {
					class527_sub8_sub13_sub1.aByteArray12038 = class527_sub8_sub13_sub1_3_.aByteArray12038;
					class527_sub8_sub13_sub1.aBool11768 = false;
					Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_4_ = class527_sub8_sub13_sub1;
					return class527_sub8_sub13_sub1_4_;
				}
			}
		}
		class527_sub8_sub13_sub1.aByteArray12038 = class552.method9141(i, (byte) 79);
		class527_sub8_sub13_sub1.aBool11768 = false;
		class527_sub8_sub13_sub1.aBool11767 = true;
		return class527_sub8_sub13_sub1;
	}

	public void method7580() {
		while (!aBool5092) {
			Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1;
			synchronized (aClass693_5091) {
				class527_sub8_sub13_sub1 = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14056(518720638));
				if (null != class527_sub8_sub13_sub1)
					anInt5093 -= 1862755701;
				else {
					try {
						aClass693_5091.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aClass552_12039.method9138((int) (class527_sub8_sub13_sub1.aLong10401 * -8775265850242314087L), class527_sub8_sub13_sub1.aByteArray12038, class527_sub8_sub13_sub1.aByteArray12038.length, 1370852431);
				else if (3 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aByteArray12038 = (class527_sub8_sub13_sub1.aClass552_12039.method9141((int) (-8775265850242314087L * class527_sub8_sub13_sub1.aLong10401), (byte) 9));
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
			class527_sub8_sub13_sub1.aBool11768 = false;
		}
	}

	Class527_Sub8_Sub13_Sub1 method7581(int i, Class552 class552, int i_5_) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = -1372823777;
		class527_sub8_sub13_sub1.aLong10401 = (long) i * 1718300610056979369L;
		class527_sub8_sub13_sub1.aClass552_12039 = class552;
		class527_sub8_sub13_sub1.aBool11767 = false;
		method7582(class527_sub8_sub13_sub1, 78742772);
		return class527_sub8_sub13_sub1;
	}

	void method7582(Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1, int i) {
		synchronized (aClass693_5091) {
			aClass693_5091.method14055(class527_sub8_sub13_sub1, 589081624);
			anInt5093 += 1862755701;
			aClass693_5091.notifyAll();
		}
	}

	public Class461() {
		aBool5092 = false;
		aThread5090 = new Thread(this);
		aThread5090.setDaemon(true);
		aThread5090.start();
		aThread5090.setPriority(1);
	}

	public int method7583(short i) {
		synchronized (aClass693_5091) {
			int i_6_ = anInt5093 * 1975026397;
			return i_6_;
		}
	}

	public void method7584() {
		aBool5092 = true;
		synchronized (aClass693_5091) {
			aClass693_5091.notifyAll();
		}
		try {
			aThread5090.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5090 = null;
	}

	public void method7585() {
		while (!aBool5092) {
			Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1;
			synchronized (aClass693_5091) {
				class527_sub8_sub13_sub1 = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14056(518720638));
				if (null != class527_sub8_sub13_sub1)
					anInt5093 -= 1862755701;
				else {
					try {
						aClass693_5091.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aClass552_12039.method9138((int) (class527_sub8_sub13_sub1.aLong10401 * -8775265850242314087L), class527_sub8_sub13_sub1.aByteArray12038, class527_sub8_sub13_sub1.aByteArray12038.length, 2013418243);
				else if (3 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aByteArray12038 = (class527_sub8_sub13_sub1.aClass552_12039.method9141((int) (-8775265850242314087L * class527_sub8_sub13_sub1.aLong10401), (byte) 3));
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
			class527_sub8_sub13_sub1.aBool11768 = false;
		}
	}

	Class527_Sub8_Sub13_Sub1 method7586(int i, byte[] is, Class552 class552, byte i_7_) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = 516439914;
		class527_sub8_sub13_sub1.aLong10401 = 1718300610056979369L * (long) i;
		class527_sub8_sub13_sub1.aByteArray12038 = is;
		class527_sub8_sub13_sub1.aClass552_12039 = class552;
		class527_sub8_sub13_sub1.aBool11767 = false;
		method7582(class527_sub8_sub13_sub1, 78742772);
		return class527_sub8_sub13_sub1;
	}

	Class527_Sub8_Sub13_Sub1 method7587(int i, Class552 class552) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = -1889263691;
		synchronized (aClass693_5091) {
			for (Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_8_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14072(-1512115409)); null != class527_sub8_sub13_sub1_8_; class527_sub8_sub13_sub1_8_ = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14059(2046286837))) {
				if ((-8775265850242314087L * class527_sub8_sub13_sub1_8_.aLong10401) == (long) i && class552 == class527_sub8_sub13_sub1_8_.aClass552_12039 && 2 == (class527_sub8_sub13_sub1_8_.anInt12035 * -691857763)) {
					class527_sub8_sub13_sub1.aByteArray12038 = class527_sub8_sub13_sub1_8_.aByteArray12038;
					class527_sub8_sub13_sub1.aBool11768 = false;
					Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1_9_ = class527_sub8_sub13_sub1;
					return class527_sub8_sub13_sub1_9_;
				}
			}
		}
		class527_sub8_sub13_sub1.aByteArray12038 = class552.method9141(i, (byte) 16);
		class527_sub8_sub13_sub1.aBool11768 = false;
		class527_sub8_sub13_sub1.aBool11767 = true;
		return class527_sub8_sub13_sub1;
	}

	public void method7588(int i) {
		aBool5092 = true;
		synchronized (aClass693_5091) {
			aClass693_5091.notifyAll();
		}
		try {
			aThread5090.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5090 = null;
	}

	Class527_Sub8_Sub13_Sub1 method7589(int i, byte[] is, Class552 class552) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = 516439914;
		class527_sub8_sub13_sub1.aLong10401 = 1718300610056979369L * (long) i;
		class527_sub8_sub13_sub1.aByteArray12038 = is;
		class527_sub8_sub13_sub1.aClass552_12039 = class552;
		class527_sub8_sub13_sub1.aBool11767 = false;
		method7582(class527_sub8_sub13_sub1, 78742772);
		return class527_sub8_sub13_sub1;
	}

	Class527_Sub8_Sub13_Sub1 method7590(int i, byte[] is, Class552 class552) {
		Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1 = new Class527_Sub8_Sub13_Sub1();
		class527_sub8_sub13_sub1.anInt12035 = 516439914;
		class527_sub8_sub13_sub1.aLong10401 = 1718300610056979369L * (long) i;
		class527_sub8_sub13_sub1.aByteArray12038 = is;
		class527_sub8_sub13_sub1.aClass552_12039 = class552;
		class527_sub8_sub13_sub1.aBool11767 = false;
		method7582(class527_sub8_sub13_sub1, 78742772);
		return class527_sub8_sub13_sub1;
	}

	public int method7591() {
		synchronized (aClass693_5091) {
			int i = anInt5093 * 1975026397;
			return i;
		}
	}

	public void method7592() {
		aBool5092 = true;
		synchronized (aClass693_5091) {
			aClass693_5091.notifyAll();
		}
		try {
			aThread5090.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread5090 = null;
	}

	public void run() {
		while (!aBool5092) {
			Class527_Sub8_Sub13_Sub1 class527_sub8_sub13_sub1;
			synchronized (aClass693_5091) {
				class527_sub8_sub13_sub1 = ((Class527_Sub8_Sub13_Sub1) aClass693_5091.method14056(518720638));
				if (null != class527_sub8_sub13_sub1)
					anInt5093 -= 1862755701;
				else {
					try {
						aClass693_5091.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aClass552_12039.method9138((int) (class527_sub8_sub13_sub1.aLong10401 * -8775265850242314087L), class527_sub8_sub13_sub1.aByteArray12038, class527_sub8_sub13_sub1.aByteArray12038.length, 1100287310);
				else if (3 == class527_sub8_sub13_sub1.anInt12035 * -691857763)
					class527_sub8_sub13_sub1.aByteArray12038 = (class527_sub8_sub13_sub1.aClass552_12039.method9141((int) (-8775265850242314087L * class527_sub8_sub13_sub1.aLong10401), (byte) 69));
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
			class527_sub8_sub13_sub1.aBool11768 = false;
		}
	}

	static final void method7593(Class665 class665, int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529.method8752(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]);
		if (class527_sub8_sub12 == null || class527_sub8_sub12.aString11754 == null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class527_sub8_sub12.aString11754;
	}

	static final void method7594(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool10999 ? 1 : 0;
	}

	static final void method7595(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method16986(-2093938772) ? 1 : 0;
	}

	static final void method7596(Class665 class665, int i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_10_, 189359738);
		Class240 class240 = Class183.aClass240Array2100[i_10_ >> 16];
		Class709.method14396(class243, class240, class665, (byte) 6);
	}

	static final void method7597(Class665 class665, int i) {
		int i_11_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_11_, -1689541919));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class9.aBool148 ? 1 : 0;
	}

	static final int method7598(int i, int i_12_) {
		return i >> 11 & 0x7f;
	}

	static final void method7599(Class243 class243, Class240 class240, Class665 class665, int i) {
		int i_13_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class243.aBool2499 = 1 == i_13_;
		Class430.method6876(class243, (byte) 38);
	}

	static final void method7600(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class601_Sub1.method16681(class243, class240, class665, (short) 16598);
	}

	static String method7601(String string, int i) {
		if (Class498.aString5584.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class498.aString5584.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class498.aString5584.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}
}
