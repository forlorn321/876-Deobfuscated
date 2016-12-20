/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class64 implements Runnable {
	volatile boolean aBool740;
	Queue aQueue741 = new LinkedList();
	Thread aThread742 = new Thread(this);
	public static Class459 aClass459_743;
	static int anInt744;

	public void run() {
		while (!aBool740) {
			try {
				Class102 class102;
				synchronized (this) {
					class102 = (Class102) aQueue741.poll();
					if (class102 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class102.anURL1234.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class102.aByteArray1236 = is;
					}
					class102.aBool1235 = true;
				} catch (IOException ioexception) {
					class102.aBool1235 = true;
				}
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
		}
	}

	public void method1444() {
		while (!aBool740) {
			try {
				Class102 class102;
				synchronized (this) {
					class102 = (Class102) aQueue741.poll();
					if (class102 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class102.anURL1234.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class102.aByteArray1236 = is;
					}
					class102.aBool1235 = true;
				} catch (IOException ioexception) {
					class102.aBool1235 = true;
				}
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
		}
	}

	Class64() {
		aThread742.setPriority(1);
		aThread742.start();
	}

	void method1445(int i) {
		aBool740 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread742.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class102 method1446(URL url, int i) {
		Class102 class102 = new Class102(url);
		synchronized (this) {
			aQueue741.add(class102);
			this.notify();
		}
		return class102;
	}

	void method1447() {
		aBool740 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread742.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class102 method1448(URL url) {
		Class102 class102 = new Class102(url);
		synchronized (this) {
			aQueue741.add(class102);
			this.notify();
		}
		return class102;
	}

	public void method1449() {
		while (!aBool740) {
			try {
				Class102 class102;
				synchronized (this) {
					class102 = (Class102) aQueue741.poll();
					if (class102 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class102.anURL1234.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class102.aByteArray1236 = is;
					}
					class102.aBool1235 = true;
				} catch (IOException ioexception) {
					class102.aBool1235 = true;
				}
			} catch (Exception exception) {
				Class180.method3542(null, exception, 1604547405);
			}
		}
	}

	public static void method1450(int i) {
		Class646_Sub1.aShort10841 = client.aShort11287;
		Class316_Sub1.aShort10037 = client.aShort11211;
		Class682.aShort8649 = client.aShort11285;
		Class236.aShort2379 = client.aShort11043;
		Class209.aBool2238 = true;
		Class209.anInt2237 = Class245.aClass226_2698.method4220(-900747417) * -1091310815;
		if (0 != Class209.anInt2241 * -1541232839 && Class209.anInt2240 * -429332687 != 0) {
			client.aShort11285 = (short) 334;
			client.aShort11043 = (short) 334;
			client.aShort11211 = client.aShort11287 = (short) (Class209.anInt2241 * 1162768896 / (Class209.anInt2240 * -429332687));
		}
	}

	static final void method1451(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 26840383);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class508.method8276(class243, class240, class665, (byte) 2);
	}

	static final void method1452(Class665 class665, byte i) {
		Class462.method7616(896117660);
	}

	public static Class704[] method1453(int i) {
		if (Class578.aClass704Array7649 == null) {
			Class704[] class704s = Class144.method2388(Class504.aClass709_6907, (byte) 36);
			Class704[] class704s_1_ = new Class704[class704s.length];
			int i_2_ = 0;
			int i_3_ = Class204.aClass527_Sub31_2213.aClass700_Sub32_10620.method17239(1614558263);
			while_134_: for (int i_4_ = 0; i_4_ < class704s.length; i_4_++) {
				Class704 class704 = class704s[i_4_];
				if ((class704.anInt8828 * -1133436379 <= 0 || -1133436379 * class704.anInt8828 >= 24) && -798340951 * class704.anInt8829 >= 800 && class704.anInt8827 * -1159802239 >= 600 && (2 != i_3_ || (class704.anInt8829 * -798340951 <= 800 && class704.anInt8827 * -1159802239 <= 600)) && (i_3_ != 1 || (-798340951 * class704.anInt8829 <= 1024 && class704.anInt8827 * -1159802239 <= 768))) {
					for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
						Class704 class704_6_ = class704s_1_[i_5_];
						if ((-798340951 * class704_6_.anInt8829 == -798340951 * class704.anInt8829) && (class704_6_.anInt8827 * -1159802239 == class704.anInt8827 * -1159802239)) {
							if (class704.anInt8828 * -1133436379 > -1133436379 * class704_6_.anInt8828)
								class704s_1_[i_5_] = class704;
							continue while_134_;
						}
					}
					class704s_1_[i_2_] = class704;
					i_2_++;
				}
			}
			Class578.aClass704Array7649 = new Class704[i_2_];
			System.arraycopy(class704s_1_, 0, Class578.aClass704Array7649, 0, i_2_);
			int[] is = new int[Class578.aClass704Array7649.length];
			for (int i_7_ = 0; i_7_ < Class578.aClass704Array7649.length; i_7_++) {
				Class704 class704 = Class578.aClass704Array7649[i_7_];
				is[i_7_] = class704.anInt8827 * -1159802239 * (class704.anInt8829 * -798340951);
			}
			Class47.method1241(is, Class578.aClass704Array7649, 505004151);
		}
		return Class578.aClass704Array7649;
	}
}
