/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class RSOutputStream implements Runnable {
	byte[] aByteArray7592;
	OutputStream anOutputStream7593;
	int anInt7594;
	boolean aBool7595;
	int anInt7596 = 0;
	Thread aThread7597;
	int anInt7598 = 0;
	IOException anIOException7599;

	void method6879() {
		synchronized (this) {
			aBool7595 = true;
			this.notifyAll();
		}
		try {
			aThread7597.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6880(int i) {
		synchronized (this) {
			aBool7595 = true;
			this.notifyAll();
		}
		try {
			aThread7597.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	boolean method6881() {
		if (aBool7595) {
			try {
				anOutputStream7593.close();
				if (null == anIOException7599)
					anIOException7599 = new IOException("");
			} catch (IOException ioexception) {
				if (anIOException7599 == null)
					anIOException7599 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	public void run() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7599 != null)
						return;
					if (-134000569 * anInt7596 <= 1542069971 * anInt7598)
						i = anInt7598 * 1542069971 - anInt7596 * -134000569;
					else
						i = (1542069971 * anInt7598 + (anInt7594 * -1084110399 - anInt7596 * -134000569));
					if (i > 0)
						break;
					try {
						anOutputStream7593.flush();
					} catch (IOException ioexception) {
						anIOException7599 = ioexception;
						return;
					}
					if (method6882((byte) -72))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (i + -134000569 * anInt7596 <= anInt7594 * -1084110399)
					anOutputStream7593.write(aByteArray7592, anInt7596 * -134000569, i);
				else {
					int i_0_ = -1084110399 * anInt7594 - anInt7596 * -134000569;
					anOutputStream7593.write(aByteArray7592, anInt7596 * -134000569, i_0_);
					anOutputStream7593.write(aByteArray7592, 0, i - i_0_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7599 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7596 = -1081386633 * ((anInt7596 * -134000569 + i) % (-1084110399 * anInt7594));
			}
		} while (!method6882((byte) -18));
	}

	boolean method6882(byte i) {
		if (aBool7595) {
			try {
				anOutputStream7593.close();
				if (null == anIOException7599)
					anIOException7599 = new IOException("");
			} catch (IOException ioexception) {
				if (anIOException7599 == null)
					anIOException7599 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method6883(int i) {
		anOutputStream7593 = new OutputStream_Sub1();
	}

	public void method6884() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException7599 != null)
						return;
					if (-134000569 * anInt7596 <= 1542069971 * anInt7598)
						i = anInt7598 * 1542069971 - anInt7596 * -134000569;
					else
						i = (1542069971 * anInt7598 + (anInt7594 * -1084110399 - anInt7596 * -134000569));
					if (i > 0)
						break;
					try {
						anOutputStream7593.flush();
					} catch (IOException ioexception) {
						anIOException7599 = ioexception;
						return;
					}
					if (method6882((byte) 18))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (i + -134000569 * anInt7596 <= anInt7594 * -1084110399)
					anOutputStream7593.write(aByteArray7592, anInt7596 * -134000569, i);
				else {
					int i_1_ = -1084110399 * anInt7594 - anInt7596 * -134000569;
					anOutputStream7593.write(aByteArray7592, anInt7596 * -134000569, i_1_);
					anOutputStream7593.write(aByteArray7592, 0, i - i_1_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException7599 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt7596 = -1081386633 * ((anInt7596 * -134000569 + i) % (-1084110399 * anInt7594));
			}
		} while (!method6882((byte) 33));
	}

	RSOutputStream(OutputStream outputstream, int i) {
		anOutputStream7593 = outputstream;
		anInt7594 = -1321122239 * (1 + i);
		aByteArray7592 = new byte[anInt7594 * -1084110399];
		aThread7597 = new Thread(this);
		aThread7597.setDaemon(true);
		aThread7597.start();
	}

	boolean method6885() {
		if (aBool7595) {
			try {
				anOutputStream7593.close();
				if (null == anIOException7599)
					anIOException7599 = new IOException("");
			} catch (IOException ioexception) {
				if (anIOException7599 == null)
					anIOException7599 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method6886(byte[] is, int i, int i_2_) throws IOException {
		if (i_2_ < 0 || i < 0 || i + i_2_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (anIOException7599 != null)
				throw new IOException(anIOException7599.toString());
			int i_3_;
			if (anInt7596 * -134000569 <= 1542069971 * anInt7598)
				i_3_ = (-1084110399 * anInt7594 - 1542069971 * anInt7598 + anInt7596 * -134000569 - 1);
			else
				i_3_ = -134000569 * anInt7596 - 1542069971 * anInt7598 - 1;
			if (i_3_ < i_2_)
				throw new IOException("");
			if (i_2_ + 1542069971 * anInt7598 <= anInt7594 * -1084110399)
				System.arraycopy(is, i, aByteArray7592, anInt7598 * 1542069971, i_2_);
			else {
				int i_4_ = anInt7594 * -1084110399 - 1542069971 * anInt7598;
				System.arraycopy(is, i, aByteArray7592, 1542069971 * anInt7598, i_4_);
				System.arraycopy(is, i + i_4_, aByteArray7592, 0, i_2_ - i_4_);
			}
			anInt7598 = 1371793755 * ((i_2_ + anInt7598 * 1542069971) % (anInt7594 * -1084110399));
			this.notifyAll();
		}
	}

	void method6887() {
		synchronized (this) {
			aBool7595 = true;
			this.notifyAll();
		}
		try {
			aThread7597.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6888() {
		synchronized (this) {
			aBool7595 = true;
			this.notifyAll();
		}
		try {
			aThread7597.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6889(byte[] is, int i, int i_5_, int i_6_) throws IOException {
		if (i_5_ < 0 || i < 0 || i + i_5_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (anIOException7599 != null)
				throw new IOException(anIOException7599.toString());
			int i_7_;
			if (anInt7596 * -134000569 <= 1542069971 * anInt7598)
				i_7_ = (-1084110399 * anInt7594 - 1542069971 * anInt7598 + anInt7596 * -134000569 - 1);
			else
				i_7_ = -134000569 * anInt7596 - 1542069971 * anInt7598 - 1;
			if (i_7_ < i_5_)
				throw new IOException("");
			if (i_5_ + 1542069971 * anInt7598 <= anInt7594 * -1084110399)
				System.arraycopy(is, i, aByteArray7592, anInt7598 * 1542069971, i_5_);
			else {
				int i_8_ = anInt7594 * -1084110399 - 1542069971 * anInt7598;
				System.arraycopy(is, i, aByteArray7592, 1542069971 * anInt7598, i_8_);
				System.arraycopy(is, i + i_8_, aByteArray7592, 0, i_5_ - i_8_);
			}
			anInt7598 = 1371793755 * ((i_5_ + anInt7598 * 1542069971) % (anInt7594 * -1084110399));
			this.notifyAll();
		}
	}

	void method6890() {
		anOutputStream7593 = new OutputStream_Sub1();
	}

	void method6891() {
		anOutputStream7593 = new OutputStream_Sub1();
	}

	static final void method6892(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anInt8542 -= 61855783;
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_10_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_11_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		Class2 class2 = Class196.aClass410_2202.method4981(client.anInterface51_11196, i_10_, 1944808116);
		String string_12_ = class2.method537(string, i_9_, Class195.aClass143Array2201, i_11_, -1239373888);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = null != string_12_ ? string_12_ : "";
	}

	static final void method6893(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		client.anInt11259 = -1673168787 * (class668.anIntArray8541[1867269829 * class668.anInt8542]);
		Class464.aClass694_5229 = Class187.method2785((class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]), (byte) -94);
		if (Class464.aClass694_5229 == null)
			Class464.aClass694_5229 = Class694.aClass694_8727;
		client.anInt11073 = (378731663 * class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2]);
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4441, class106.aClass15_1258, 1211091056);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(client.anInt11259 * 1867600229);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class464.aClass694_5229.anInt8730 * -1418548035);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(57582191 * client.anInt11073);
		class106.method1409(class536_sub23, 178383689);
	}

	static boolean method6894(String string, String string_13_, byte i) {
		Class76_Sub1.anInt10981 = -1447115612;
		Class586.aClass106_7710 = client.aClass106_11322;
		return Class188.method2796(false, false, string, string_13_, -1L);
	}

	public static boolean method6895(int i, int i_14_) {
		return (16 == i || i == 7 || 1 == i || 3 == i || i == 11 || i == 13 || i == 5);
	}

	static final boolean method6896(Class556[][][] class556s, int i, int i_15_, int i_16_, boolean bool, int i_17_) {
		byte[][][] is = client.aClass515_11066.method6314((byte) -67);
		byte i_18_ = bool ? (byte) 1 : (byte) (648319383 * client.anInt11127 & 0xff);
		if (is[Class320.anInt3539 * -989431627][i_15_][i_16_] == i_18_)
			return false;
		Class455 class455 = client.aClass515_11066.method6251(-335763533);
		if (0 == ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_15_][i_16_]) & 0x4))
			return false;
		int i_19_ = 0;
		int i_20_ = 0;
		client.anIntArray11086[i_19_] = i_15_;
		client.anIntArray11087[i_19_++] = i_16_;
		is[Class320.anInt3539 * -989431627][i_15_][i_16_] = i_18_;
		while (i_20_ != i_19_) {
			int i_21_ = client.anIntArray11086[i_20_] & 0xffff;
			int i_22_ = client.anIntArray11086[i_20_] >> 16 & 0xff;
			int i_23_ = client.anIntArray11086[i_20_] >> 24 & 0xff;
			int i_24_ = client.anIntArray11087[i_20_] & 0xffff;
			int i_25_ = client.anIntArray11087[i_20_] >> 16 & 0xff;
			i_20_ = i_20_ + 1 & 0xfff;
			boolean bool_26_ = false;
			if (((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_21_][i_24_]) & 0x4) == 0)
				bool_26_ = true;
			boolean bool_27_ = false;
			if (class556s != null) {
				int i_28_ = Class320.anInt3539 * -989431627 + 1;
				while_42_: for (/**/; i_28_ <= 3; i_28_++) {
					if (null != class556s[i_28_] && 0 == ((class455.aByteArrayArrayArray5154[i_28_][i_21_][i_24_]) & 0x8)) {
						if (bool_26_ && null != class556s[i_28_][i_21_][i_24_]) {
							if (null != (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7499)) {
								int i_29_ = Class621.method7413(i_22_, -1553166077);
								if (i_29_ == (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7499.aShort11789) || ((class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500) != null && i_29_ == (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500.aShort11789)))
									continue;
								if (i_23_ != 0) {
									int i_30_ = Class621.method7413(i_23_, -1553166077);
									if (i_30_ == (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7499.aShort11789) || ((class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500) != null && (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500.aShort11789) == i_30_))
										continue;
								}
								if (0 != i_25_) {
									int i_31_ = Class621.method7413(i_25_, -1553166077);
									if ((class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7499.aShort11789) == i_31_ || (null != (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500) && (class556s[i_28_][i_21_][i_24_].aClass649_Sub1_Sub3_7500.aShort11789) == i_31_))
										continue;
								}
							}
							Class556 class556 = class556s[i_28_][i_21_][i_24_];
							if (class556.aClass552_7497 != null) {
								for (Class552 class552 = class556.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
									Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
									if (class649_sub1_sub5 instanceof Interface59) {
										Interface59 interface59 = (Interface59) class649_sub1_sub5;
										int i_32_ = interface59.method71(1459295271);
										int i_33_ = interface59.method367((byte) -83);
										if (21 == i_32_)
											i_32_ = 19;
										int i_34_ = i_32_ | i_33_ << 6;
										if (i_22_ == i_34_ || 0 != i_23_ && i_34_ == i_23_ || i_25_ != 0 && i_34_ == i_25_)
											continue while_42_;
									}
								}
							}
						}
						Class556 class556 = class556s[i_28_][i_21_][i_24_];
						if (class556 != null && class556.aClass552_7497 != null) {
							for (Class552 class552 = class556.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
								Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
								if ((class649_sub1_sub5.aShort11867 != class649_sub1_sub5.aShort11864) || (class649_sub1_sub5.aShort11870 != class649_sub1_sub5.aShort11865)) {
									short i_35_ = class649_sub1_sub5.aShort11867;
									short i_36_ = class649_sub1_sub5.aShort11864;
									short i_37_ = class649_sub1_sub5.aShort11865;
									short i_38_ = class649_sub1_sub5.aShort11870;
									int i_39_ = Math.max(0, Math.min(i_35_, (is[i_28_].length - 1)));
									int i_40_ = Math.max(0, Math.min(i_37_, (is[i_28_][0]).length - 1));
									int i_41_ = Math.max(0, Math.min(i_36_, (is[i_28_].length - 1)));
									int i_42_ = Math.max(0, Math.min(i_38_, (is[i_28_][0]).length - 1));
									for (/**/; i_39_ <= i_41_; i_39_++) {
										for (/**/; i_40_ <= i_42_; i_40_++)
											is[i_28_][i_39_][i_40_] = i_18_;
									}
								}
							}
						}
						is[i_28_][i_21_][i_24_] = i_18_;
						bool_27_ = true;
					}
				}
			}
			if (bool_27_) {
				int i_43_ = client.aClass515_11066.method6249(240630262).aClass160Array7431[1 + -989431627 * Class320.anInt3539].method1927(i_21_, i_24_, -322334384);
				if (client.anIntArray11051[i] < i_43_)
					client.anIntArray11051[i] = i_43_;
				int i_44_ = i_21_ << 9;
				int i_45_ = i_24_ << 9;
				if (client.anIntArray11089[i] > i_44_)
					client.anIntArray11089[i] = i_44_;
				else if (client.anIntArray11145[i] < i_44_)
					client.anIntArray11145[i] = i_44_;
				if (client.anIntArray11097[i] > i_45_)
					client.anIntArray11097[i] = i_45_;
				else if (client.anIntArray11146[i] < i_45_)
					client.anIntArray11146[i] = i_45_;
			}
			if (!bool_26_) {
				if (i_21_ >= 1 && (is[Class320.anInt3539 * -989431627][i_21_ - 1][i_24_] != i_18_)) {
					client.anIntArray11086[i_19_] = i_21_ - 1 | 0x120000 | ~0x2cffffff;
					client.anIntArray11087[i_19_] = i_24_ | 0x130000;
					i_19_ = i_19_ + 1 & 0xfff;
					is[-989431627 * Class320.anInt3539][i_21_ - 1][i_24_] = i_18_;
				}
				if (++i_24_ < client.aClass515_11066.method6243(177401017)) {
					if (i_21_ - 1 >= 0 && (is[-989431627 * Class320.anInt3539][i_21_ - 1][i_24_]) != i_18_ && ((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_21_][i_24_]) & 0x4) == 0 && 0 == ((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_21_ - 1][i_24_ - 1]) & 0x4)) {
						client.anIntArray11086[i_19_] = i_21_ - 1 | 0x120000 | 0x52000000;
						client.anIntArray11087[i_19_] = i_24_ | 0x130000;
						i_19_ = 1 + i_19_ & 0xfff;
						is[Class320.anInt3539 * -989431627][i_21_ - 1][i_24_] = i_18_;
					}
					if (is[Class320.anInt3539 * -989431627][i_21_][i_24_] != i_18_) {
						client.anIntArray11086[i_19_] = i_21_ | 0x520000 | 0x13000000;
						client.anIntArray11087[i_19_] = i_24_ | 0x530000;
						i_19_ = i_19_ + 1 & 0xfff;
						is[-989431627 * Class320.anInt3539][i_21_][i_24_] = i_18_;
					}
					if (i_21_ + 1 < client.aClass515_11066.method6321((byte) 7) && i_18_ != (is[Class320.anInt3539 * -989431627][i_21_ + 1][i_24_]) && 0 == ((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_21_][i_24_]) & 0x4) && ((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][1 + i_21_][i_24_ - 1]) & 0x4) == 0) {
						client.anIntArray11086[i_19_] = 1 + i_21_ | 0x520000 | ~0x6dffffff;
						client.anIntArray11087[i_19_] = i_24_ | 0x530000;
						i_19_ = i_19_ + 1 & 0xfff;
						is[-989431627 * Class320.anInt3539][i_21_ + 1][i_24_] = i_18_;
					}
				}
				i_24_--;
				if (i_21_ + 1 < client.aClass515_11066.method6321((byte) 105) && i_18_ != (is[Class320.anInt3539 * -989431627][i_21_ + 1][i_24_])) {
					client.anIntArray11086[i_19_] = i_21_ + 1 | 0x920000 | 0x53000000;
					client.anIntArray11087[i_19_] = i_24_ | 0x930000;
					i_19_ = 1 + i_19_ & 0xfff;
					is[Class320.anInt3539 * -989431627][i_21_ + 1][i_24_] = i_18_;
				}
				if (--i_24_ >= 0) {
					if (i_21_ - 1 >= 0 && (is[Class320.anInt3539 * -989431627][i_21_ - 1][i_24_]) != i_18_ && ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_21_][i_24_]) & 0x4) == 0 && ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_21_ - 1][1 + i_24_]) & 0x4) == 0) {
						client.anIntArray11086[i_19_] = i_21_ - 1 | 0xd20000 | 0x12000000;
						client.anIntArray11087[i_19_] = i_24_ | 0xd30000;
						i_19_ = i_19_ + 1 & 0xfff;
						is[-989431627 * Class320.anInt3539][i_21_ - 1][i_24_] = i_18_;
					}
					if (i_18_ != is[Class320.anInt3539 * -989431627][i_21_][i_24_]) {
						client.anIntArray11086[i_19_] = i_21_ | 0xd20000 | ~0x6cffffff;
						client.anIntArray11087[i_19_] = i_24_ | 0xd30000;
						i_19_ = i_19_ + 1 & 0xfff;
						is[Class320.anInt3539 * -989431627][i_21_][i_24_] = i_18_;
					}
					if ((1 + i_21_ < client.aClass515_11066.method6321((byte) -75)) && (is[Class320.anInt3539 * -989431627][1 + i_21_][i_24_]) != i_18_ && ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_21_][i_24_]) & 0x4) == 0 && 0 == ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_21_ + 1][1 + i_24_]) & 0x4)) {
						client.anIntArray11086[i_19_] = i_21_ + 1 | 0x920000 | ~0x2dffffff;
						client.anIntArray11087[i_19_] = i_24_ | 0x930000;
						i_19_ = 1 + i_19_ & 0xfff;
						is[-989431627 * Class320.anInt3539][i_21_ + 1][i_24_] = i_18_;
					}
				}
			}
		}
		if (-1000000 != client.anIntArray11051[i]) {
			client.anIntArray11051[i] += 40;
			client.anIntArray11089[i] -= 512;
			client.anIntArray11145[i] += 512;
			client.anIntArray11146[i] += 512;
			client.anIntArray11097[i] -= 512;
		}
		return true;
	}
}
