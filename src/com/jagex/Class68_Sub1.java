/* Class68_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class68_Sub1 extends Class68 implements Interface67 {
	public void method421(int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4385, client.aClass109_11067.aClass2_1367, (byte) 19);
		class527_sub15.buffer.writeInt(anInt764 * 2134615217, 1920203254);
		int i_0_ = (aBool770 ? 2 : 0) | (aBool769 ? 1 : 0);
		class527_sub15.buffer.writeByte(i_0_, -178278757);
		class527_sub15.buffer.writeShortLE2(anInt763 * 369670273, (byte) 4);
		class527_sub15.buffer.method16586(anInt768 * -210817343, 492811885);
		class527_sub15.buffer.writeByte(anInt771 * -730231099, 280482275);
		class527_sub15.buffer.write128Byte(-171393877 * anInt766, (byte) 8);
		class527_sub15.buffer.write128Byte(anInt767 * -1599588461, (byte) 8);
		class527_sub15.buffer.writeIntLE2(anInt765 * 808865655, (byte) -68);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	Class68_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_, int i_7_) {
		super(i, i_1_, i_2_ > 65535 ? 65535 : i_2_, i_3_, i_4_ > 255 ? 255 : i_4_, i_5_, bool, bool_6_, i_7_ > 255 ? 255 : i_7_);
	}

	public void method285() {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4385, client.aClass109_11067.aClass2_1367, (byte) -13);
		class527_sub15.buffer.writeInt(anInt764 * 2134615217, 633062176);
		int i = (aBool770 ? 2 : 0) | (aBool769 ? 1 : 0);
		class527_sub15.buffer.writeByte(i, 1880748871);
		class527_sub15.buffer.writeShortLE2(anInt763 * 369670273, (byte) -58);
		class527_sub15.buffer.method16586(anInt768 * -210817343, 399390543);
		class527_sub15.buffer.writeByte(anInt771 * -730231099, 284776411);
		class527_sub15.buffer.write128Byte(-171393877 * anInt766, (byte) 8);
		class527_sub15.buffer.write128Byte(anInt767 * -1599588461, (byte) 8);
		class527_sub15.buffer.writeIntLE2(anInt765 * 808865655, (byte) -3);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static final void method16794(Class527_Sub41 class527_sub41, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, byte i_16_) {
		if (Class189.method3666(i, null, -374584257)) {
			if (class527_sub41 != null && !class527_sub41.method16677((byte) 1))
				Class231.method4326(class527_sub41, true, false, 1565082509);
			else {
				Class240 class240 = Class183.aClass240Array2100[i];
				client.method17442(class240, class240.method4384(-1030451686), -1, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_);
			}
		}
	}

	static final void method16795(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}
}
