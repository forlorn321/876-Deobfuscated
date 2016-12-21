/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.Clipboard;

public class Class400 {
	static final int anInt4129 = 0;
	public int anInt4130 = 671333353;
	public int anInt4131 = -363633216;
	public int anInt4132 = 644892608;
	public int anInt4133 = 1754614334;
	public boolean aBool4134;
	public int anInt4135 = 1821475021;
	public boolean aBool4136;
	public static Clipboard aClipboard4137;

	void method4914(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(1527797084);
			if (i_0_ == 0)
				break;
			method4915(class536_sub33, i_0_, i, (byte) 101);
		}
	}

	void method4915(RSByteBuffer class536_sub33, int i, int i_1_, byte i_2_) {
		if (i == 1) {
			anInt4130 = class536_sub33.readUnsignedShort((short) 1864) * -671333353;
			if (65535 == -428264537 * anInt4130)
				anInt4130 = 671333353;
		} else if (i == 2) {
			anInt4131 = (class536_sub33.readUnsignedShort((short) -2264) + 1) * 598298007;
			anInt4132 = (class536_sub33.readUnsignedShort((short) -1599) + 1) * -862338785;
		} else if (3 == i)
			class536_sub33.readByte(730249709);
		else if (i == 4)
			anInt4133 = class536_sub33.readUnsignedByte(2147477091) * 877307167;
		else if (5 == i)
			anInt4135 = class536_sub33.readUnsignedByte(-1329453493) * 1821475021;
		else if (i == 6)
			aBool4134 = true;
		else if (i == 7)
			aBool4136 = true;
	}

	void method4916(RSByteBuffer class536_sub33, int i, byte i_3_) {
		for (;;) {
			int i_4_ = class536_sub33.readUnsignedByte(-1725254578);
			if (i_4_ == 0)
				break;
			method4915(class536_sub33, i_4_, i, (byte) 25);
		}
	}

	void method4917(RSByteBuffer class536_sub33, int i, int i_5_) {
		if (i == 1) {
			anInt4130 = class536_sub33.readUnsignedShort((short) 10767) * -671333353;
			if (65535 == -428264537 * anInt4130)
				anInt4130 = 671333353;
		} else if (i == 2) {
			anInt4131 = (class536_sub33.readUnsignedShort((short) 10225) + 1) * 598298007;
			anInt4132 = (class536_sub33.readUnsignedShort((short) 3450) + 1) * -862338785;
		} else if (3 == i)
			class536_sub33.readByte(1680945969);
		else if (i == 4)
			anInt4133 = class536_sub33.readUnsignedByte(-1619202314) * 877307167;
		else if (5 == i)
			anInt4135 = class536_sub33.readUnsignedByte(-853040802) * 1821475021;
		else if (i == 6)
			aBool4134 = true;
		else if (i == 7)
			aBool4136 = true;
	}

	Class400() {
		aBool4134 = false;
		aBool4136 = false;
	}

	static final void method4918(Class251 class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1415456470) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2670 = Class33.method796(string, class668, (short) 856);
		class251.aBool2666 = true;
	}

	public static void method4919(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (i_6_ >= 0 && i_7_ >= 0 && i_6_ < client.aClass515_11066.method6321((byte) 28) - 1 && i_7_ < client.aClass515_11066.method6243(177401017) - 1) {
			if (client.aClass515_11066.method6249(343650700) != null) {
				if (0 == i_8_) {
					Interface59 interface59 = ((Interface59) client.aClass515_11066.method6249(-775573693).method6716(i, i_6_, i_7_, -342954341));
					Interface59 interface59_14_ = ((Interface59) client.aClass515_11066.method6249(530715077).method6746(i, i_6_, i_7_, 738119109));
					if (null != interface59 && 2 != i_9_) {
						if (interface59 instanceof Class649_Sub1_Sub3_Sub1)
							((Class649_Sub1_Sub3_Sub1) interface59).aClass522_11992.method6375(i_11_, i_12_, 1035443893);
						else
							Class510.method6187(i, i_8_, i_6_, i_7_, interface59.method373((byte) -23), i_10_, i_9_, i_11_, i_12_, -279793543);
					}
					if (interface59_14_ != null) {
						if (interface59_14_ instanceof Class649_Sub1_Sub3_Sub1)
							((Class649_Sub1_Sub3_Sub1) interface59_14_).aClass522_11992.method6375(i_11_, i_12_, -1954318747);
						else
							Class510.method6187(i, i_8_, i_6_, i_7_, interface59_14_.method373((byte) -15), i_10_, i_9_, i_11_, i_12_, -279793543);
					}
				} else if (1 == i_8_) {
					Interface59 interface59 = ((Interface59) client.aClass515_11066.method6249(-984859754).method6714(i, i_6_, i_7_, (byte) 14));
					if (interface59 != null) {
						if (interface59 instanceof Class649_Sub1_Sub4_Sub1)
							((Class649_Sub1_Sub4_Sub1) interface59).aClass522_11974.method6375(i_11_, i_12_, 957327954);
						else {
							int i_15_ = interface59.method373((byte) -66);
							if (i_9_ == 4 || 5 == i_9_)
								Class510.method6187(i, i_8_, i_6_, i_7_, i_15_, i_10_, 4, i_11_, i_12_, -279793543);
							else if (i_9_ == 6)
								Class510.method6187(i, i_8_, i_6_, i_7_, i_15_, i_10_ + 4, 4, i_11_, i_12_, -279793543);
							else if (i_9_ == 7)
								Class510.method6187(i, i_8_, i_6_, i_7_, i_15_, 4 + (2 + i_10_ & 0x3), 4, i_11_, i_12_, -279793543);
							else if (i_9_ == 8) {
								Class510.method6187(i, i_8_, i_6_, i_7_, i_15_, 4 + i_10_, 4, i_11_, i_12_, -279793543);
								Class510.method6187(i, i_8_, i_6_, i_7_, i_15_, (i_10_ + 2 & 0x3) + 4, 4, i_11_, i_12_, -279793543);
							}
						}
					}
				} else if (2 == i_8_) {
					Interface59 interface59 = ((Interface59) (client.aClass515_11066.method6249(326540914).method6736(i, i_6_, i_7_, client.anInterface64_11113, (byte) -42)));
					if (null != interface59) {
						if (i_9_ == 11)
							i_9_ = 10;
						if (interface59 instanceof Class649_Sub1_Sub5_Sub3)
							((Class649_Sub1_Sub5_Sub3) interface59).aClass522_12007.method6375(i_11_, i_12_, -594651851);
						else
							Class510.method6187(i, i_8_, i_6_, i_7_, interface59.method373((byte) 29), i_10_, i_9_, i_11_, i_12_, -279793543);
					}
				} else if (3 == i_8_) {
					Interface59 interface59 = ((Interface59) client.aClass515_11066.method6249(1473702874).method6726(i, i_6_, i_7_, 1672121015));
					if (null != interface59) {
						if (interface59 instanceof Class649_Sub1_Sub2_Sub1)
							((Class649_Sub1_Sub2_Sub1) interface59).aClass522_11971.method6375(i_11_, i_12_, -1976673626);
						else
							Class510.method6187(i, i_8_, i_6_, i_7_, interface59.method373((byte) 56), i_10_, i_9_, i_11_, i_12_, -279793543);
					}
				}
			}
		}
	}
}
