/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class60 implements Runnable {
	volatile boolean aBool641;
	Queue aQueue642 = new LinkedList();
	Thread aThread643 = new Thread(this);

	void method989() {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void run() {
		while (!aBool641) {
			try {
				Class114 class114;
				synchronized (this) {
					class114 = (Class114) aQueue642.poll();
					if (class114 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class114.anURL1410.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class114.aByteArray1411 = is;
					}
					class114.aBool1409 = true;
				} catch (IOException ioexception) {
					class114.aBool1409 = true;
				}
			} catch (Exception exception) {
				Class81.method1165(null, exception, (byte) -13);
			}
		}
	}

	Class114 method990(URL url, int i) {
		Class114 class114 = new Class114(url);
		synchronized (this) {
			aQueue642.add(class114);
			this.notify();
		}
		return class114;
	}

	void method991(int i) {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method992() {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method993() {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class60() {
		aThread643.setPriority(1);
		aThread643.start();
	}

	public void method994() {
		while (!aBool641) {
			try {
				Class114 class114;
				synchronized (this) {
					class114 = (Class114) aQueue642.poll();
					if (class114 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = class114.anURL1410.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						class114.aByteArray1411 = is;
					}
					class114.aBool1409 = true;
				} catch (IOException ioexception) {
					class114.aBool1409 = true;
				}
			} catch (Exception exception) {
				Class81.method1165(null, exception, (byte) 81);
			}
		}
	}

	void method995() {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method996() {
		aBool641 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			aThread643.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static final void method997(Class668 class668, short i) {
		class668.anInt8544 -= 1543270475;
		String string = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544]);
		String string_0_ = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801 + 1]);
		String string_1_ = ((String) class668.anObjectArray8543[2 + class668.anInt8544 * 366709801]);
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		Class156.method1886(string, string_0_, string_1_, bool, 607895612);
	}

	static String colorifyItemAmount(int amount, Class664 class664, Class628 class628, int i_2_) {
		if (amount < 100000)
			return new StringBuilder().append(Class225.getColorFormatString(2025138957 * class628.defaultColor)).append(amount).append(ItemTypeDecoder.colorPostfix).toString();
		if (amount < 10000000)
			return new StringBuilder().append(Class225.getColorFormatString(35026845 * class628.above100kColor)).append(amount / 1000).append(Class38.aClass38_448.method840(class664, 1539562207)).append(ItemTypeDecoder.colorPostfix).toString();
		return new StringBuilder().append(Class225.getColorFormatString(2095590335 * class628.above10mColor)).append(amount / 1000000).append(Class38.aClass38_446.method840(class664, 1561493254)).append(ItemTypeDecoder.colorPostfix).toString();
	}

	static void method999(File file, byte[] is, int i, int i_3_) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	static final void method1000(Class668 class668, short i) {
		int i_4_ = Class516.anInt7040 * 698322721;
		int i_5_ = -201071885 * Class114.anInt1412;
		int i_6_ = -1;
		if (Class707.aBool8822) {
			Class697[] class697s = Class385.method4841((byte) -26);
			for (int i_7_ = 0; i_7_ < class697s.length; i_7_++) {
				Class697 class697 = class697s[i_7_];
				if (-1090373425 * class697.anInt8744 == i_4_ && i_5_ == class697.anInt8743 * 832859273) {
					i_6_ = i_7_;
					break;
				}
			}
		}
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_6_;
	}
}
