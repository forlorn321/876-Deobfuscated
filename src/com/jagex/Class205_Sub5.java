/* Class205_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub5 extends Class205 {
	String aString9868;
	int anInt9869;
	static int anInt9870;

	public void method2943() {
		if (-1 != client.anInt11052 * -749191405)
			Class236.method3344(client.anInt11052 * -749191405, aString9868, -470975681 * anInt9869, 1787407108);
	}

	public void method2940(int i) {
		if (-1 != client.anInt11052 * -749191405)
			Class236.method3344(client.anInt11052 * -749191405, aString9868, -470975681 * anInt9869, 1787407108);
	}

	Class205_Sub5(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		aString9868 = class536_sub33.readString();
		anInt9869 = class536_sub33.readUnsignedShort() * 2120742079;
	}

	public void method2942() {
		if (-1 != client.anInt11052 * -749191405)
			Class236.method3344(client.anInt11052 * -749191405, aString9868, -470975681 * anInt9869, 1787407108);
	}

	static final void method9058(int i) {
		byte[][][] is = client.aClass515_11066.method6314((byte) 26);
		byte i_0_ = (byte) (client.anInt11127 * 648319383 - 4 & 0xff);
		int i_1_ = (client.anInt11127 * 648319383 % client.aClass515_11066.method6321((byte) 16));
		for (int i_2_ = 0; i_2_ < 4; i_2_++) {
			for (int i_3_ = 0; i_3_ < client.aClass515_11066.method6243(177401017); i_3_++)
				is[i_2_][i_1_][i_3_] = i_0_;
		}
		if (-989431627 * Class320.anInt3539 != 3) {
			for (int i_4_ = 0; i_4_ < 2; i_4_++) {
				client.anIntArray11051[i_4_] = -1000000;
				client.anIntArray11089[i_4_] = 1000000;
				client.anIntArray11145[i_4_] = 0;
				client.anIntArray11097[i_4_] = 1000000;
				client.anIntArray11146[i_4_] = 0;
			}
			Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
			Class455 class455 = client.aClass515_11066.method6251(768294815);
			Class553 class553 = client.aClass515_11066.method6249(1364970554);
			if (155362615 * Class246.anInt2474 == 1 || 2 == 155362615 * Class246.anInt2474 || 403120773 * Class658.anInt8498 != -1) {
				Class598 class598 = client.aClass515_11066.method6255(-2137833719);
				int i_5_;
				int i_6_;
				if (2 == 155362615 * Class246.anInt2474) {
					Class436 class436_7_ = Class683.aClass301_Sub1_8651.method4052(-810172525).method8293(-722843130);
					if (Float.isNaN(class436_7_.aFloat4850))
						return;
					i_5_ = ((int) class436_7_.aFloat4850 - (class598.anInt7839 * 1858049507 << 9));
					i_6_ = ((int) class436_7_.aFloat4853 - (1479112045 * class598.anInt7840 << 9));
					if (i_5_ < 0 || i_6_ < 0 || (i_5_ >> 9 >= (class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627]).length) || i_6_ >> 9 >= (class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_5_ >> 9]).length)
						return;
				} else if (1 == 155362615 * Class246.anInt2474) {
					i_5_ = (int) class436.aFloat4850;
					i_6_ = (int) class436.aFloat4853;
				} else {
					i_5_ = Class658.anInt8498 * 403120773;
					i_6_ = -153477497 * Class667.anInt8535;
				}
				if (((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][i_5_ >> 9][i_6_ >> 9]) & 0x4) != 0)
					RSOutputStream.method6896(class553.aClass556ArrayArrayArray7430, 0, i_5_ >> 9, i_6_ >> 9, false, 1038006048);
				else {
					int i_8_;
					int i_9_;
					if (Class246.anInt2474 * 155362615 == 2) {
						Class436 class436_10_ = Class683.aClass301_Sub1_8651.method4051(826143221).method4343((byte) -23);
						i_8_ = (((int) class436_10_.aFloat4850 >> 9) - 1858049507 * class598.anInt7839);
						i_9_ = (((int) class436_10_.aFloat4853 >> 9) - 1479112045 * class598.anInt7840);
						if (i_8_ < 0 || i_9_ < 0 || (i_8_ >= (class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627]).length) || i_9_ >= (class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_8_]).length)
							return;
					} else {
						i_8_ = Class637.anInt8301 * -1607026219 >> 9;
						i_9_ = Class685.anInt8665 * -1646092097 >> 9;
					}
					int i_11_ = i_5_ >> 9;
					int i_12_ = i_6_ >> 9;
					if (class455.method5465(i_8_, i_9_, -116034839)) {
						int i_13_ = Class54.method944((Class637.anInt8301 * -1607026219), (-1646092097 * Class685.anInt8665), 3, 2021418090);
						if (Class205_Sub21.anInt9958 * -1598853731 >= i_13_)
							RSOutputStream.method6896(class553.aClass556ArrayArrayArray7430, 1, i_8_, i_9_, false, 1595271514);
					} else {
						while_47_: do {
							if (62800801 * Class141.anInt1658 < 2560) {
								int i_14_;
								if (i_11_ > i_8_)
									i_14_ = i_11_ - i_8_;
								else
									i_14_ = i_8_ - i_11_;
								int i_15_;
								if (i_12_ > i_9_)
									i_15_ = i_12_ - i_9_;
								else
									i_15_ = i_9_ - i_12_;
								if (0 == i_14_ && 0 == i_15_ || i_14_ <= -client.aClass515_11066.method6321((byte) -55) || i_14_ >= client.aClass515_11066.method6321((byte) -2) || i_15_ <= -client.aClass515_11066.method6243(177401017) || i_15_ >= client.aClass515_11066.method6243(177401017)) {
									if (155362615 * Class246.anInt2474 != 2)
										Class81.method1165(new StringBuilder().append(i_8_).append(Class40.aString491).append(i_9_).append(" ").append(i_11_).append(Class40.aString491).append(i_12_).append(" ").append(1858049507 * class598.anInt7839).append(Class40.aString491).append(class598.anInt7840 * 1479112045).toString(), new RuntimeException(), (byte) -59);
									break;
								}
								if (i_14_ > i_15_) {
									int i_16_ = 65536 * i_15_ / i_14_;
									int i_17_ = 32768;
									while_46_: do {
										for (;;) {
											if (i_8_ == i_11_)
												break while_46_;
											if (i_8_ < i_11_)
												i_8_++;
											else if (i_8_ > i_11_)
												i_8_--;
											if (0 != ((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_8_][i_9_]) & 0x4)) {
												RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, i_9_, false, 1938560943);
												break while_46_;
											}
											if ((i_9_ + 1 < (class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_8_]).length) && (0 != ((class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)][i_8_][1 + i_9_]) & 0x4))) {
												RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, 1 + i_9_, false, 1896751389);
												break while_46_;
											}
											if (i_9_ > 0 && (0 != ((class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)][i_8_][i_9_ - 1]) & 0x4))) {
												RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, i_9_ - 1, false, 1062143126);
												break while_46_;
											}
											i_17_ += i_16_;
											if (i_17_ >= 65536) {
												i_17_ -= 65536;
												if (i_9_ < i_12_) {
													if ((++i_9_ + 1 < (class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][i_8_]).length) && ((class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][i_8_][1 + i_9_]) & 0x4) != 0) {
														RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, i_9_ + 1, false, 1127027934);
														break while_46_;
													}
												} else if (i_9_ > i_12_ && --i_9_ > 0 && ((class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][i_8_][i_9_ - 1]) & 0x4) != 0)
													break;
											}
										}
										RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, i_9_ - 1, false, 1491720489);
									} while (false);
								} else {
									int i_18_ = 65536 * i_14_ / i_15_;
									int i_19_ = 32768;
									for (;;) {
										if (i_12_ == i_9_)
											break while_47_;
										if (i_9_ < i_12_)
											i_9_++;
										else if (i_9_ > i_12_)
											i_9_--;
										if (((class455.aByteArrayArrayArray5154[-989431627 * Class320.anInt3539][i_8_][i_9_]) & 0x4) != 0) {
											RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_, i_9_, false, 1037263840);
											break while_47_;
										}
										if ((i_8_ + 1 < (class455.aByteArrayArrayArray5154[(Class320.anInt3539 * -989431627)]).length) && ((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][1 + i_8_][i_9_]) & 0x4) != 0) {
											RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_ + 1, i_9_, false, 1354599548);
											break while_47_;
										}
										if (i_8_ > 0 && ((class455.aByteArrayArrayArray5154[(-989431627 * Class320.anInt3539)][i_8_ - 1][i_9_]) & 0x4) != 0) {
											RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_ - 1, i_9_, false, 1697127525);
											break while_47_;
										}
										i_19_ += i_18_;
										if (i_19_ >= 65536) {
											i_19_ -= 65536;
											if (i_8_ < i_11_) {
												i_8_++;
												if ((1 + i_8_ < (class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))]).length) && ((class455.aByteArrayArrayArray5154[(-989431627 * (Class320.anInt3539))][1 + i_8_][i_9_]) & 0x4) != 0) {
													RSOutputStream.method6896((class553.aClass556ArrayArrayArray7430), 1, i_8_ + 1, i_9_, false, 1429323891);
													break while_47_;
												}
											} else if (i_8_ > i_11_ && --i_8_ > 0 && ((class455.aByteArrayArrayArray5154[((Class320.anInt3539) * -989431627)][i_8_ - 1][i_9_]) & 0x4) != 0)
												break;
										}
									}
									RSOutputStream.method6896(class553.aClass556ArrayArrayArray7430, 1, i_8_ - 1, i_9_, false, 1469096456);
								}
							}
						} while (false);
					}
				}
			} else {
				int i_20_ = Class54.method944(-1607026219 * Class637.anInt8301, -1646092097 * Class685.anInt8665, Class320.anInt3539 * -989431627, 1463159927);
				if (i_20_ - Class205_Sub21.anInt9958 * -1598853731 < 3200 && ((class455.aByteArrayArrayArray5154[Class320.anInt3539 * -989431627][-1607026219 * Class637.anInt8301 >> 9][-1646092097 * Class685.anInt8665 >> 9]) & 0x4) != 0)
					RSOutputStream.method6896(class553.aClass556ArrayArrayArray7430, 1, -1607026219 * Class637.anInt8301 >> 9, Class685.anInt8665 * -1646092097 >> 9, false, 2099940685);
			}
		}
	}

	static int method9059(byte[] is, int i, int i_21_, byte i_22_) {
		int i_23_ = -1;
		for (int i_24_ = i; i_24_ < i_21_; i_24_++)
			i_23_ = i_23_ >>> 8 ^ (RSByteBuffer.anIntArray10597[(i_23_ ^ is[i_24_]) & 0xff]);
		i_23_ ^= 0xffffffff;
		return i_23_;
	}
}
