/* Class205_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub4_Sub1 extends Class205_Sub4 {
	int anInt11491;
	int anInt11492;
	int anInt11493;

	public void method2940(int i) {
		int i_0_ = -1263259136 * anInt11493 + 256;
		int i_1_ = 256 + 268707328 * anInt11492;
		int i_2_ = anInt11491 * -1898532567;
		if (i_2_ < 3 && (client.aClass515_11066.method6251(1765616060).method5466(-1696966119 * anInt11493, anInt11492 * 2030567955, (byte) -118)))
			i_2_++;
		Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = (new Class649_Sub1_Sub5_Sub4(client.aClass515_11066.method6249(-748737433), anInt9865 * 556893693, 0, anInt11491 * -1898532567, i_2_, i_0_, Class54.method944(i_0_, i_1_, anInt11491 * -1898532567, 2093612897) - 962970085 * anInt9867, i_1_, -1696966119 * anInt11493, anInt11493 * -1696966119, anInt11492 * 2030567955, anInt11492 * 2030567955, -1876561783 * anInt9866, false, 0));
		client.aClass4_11175.method560(new Class536_Sub18_Sub4(class649_sub1_sub5_sub4), (long) (anInt11493 * -1696966119 << 16 | anInt11492 * 2030567955));
	}

	public void method2942() {
		int i = -1263259136 * anInt11493 + 256;
		int i_3_ = 256 + 268707328 * anInt11492;
		int i_4_ = anInt11491 * -1898532567;
		if (i_4_ < 3 && (client.aClass515_11066.method6251(1109211087).method5466(-1696966119 * anInt11493, anInt11492 * 2030567955, (byte) -74)))
			i_4_++;
		Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = (new Class649_Sub1_Sub5_Sub4(client.aClass515_11066.method6249(1118610564), anInt9865 * 556893693, 0, anInt11491 * -1898532567, i_4_, i, Class54.method944(i, i_3_, anInt11491 * -1898532567, 1438962527) - 962970085 * anInt9867, i_3_, -1696966119 * anInt11493, anInt11493 * -1696966119, anInt11492 * 2030567955, anInt11492 * 2030567955, -1876561783 * anInt9866, false, 0));
		client.aClass4_11175.method560(new Class536_Sub18_Sub4(class649_sub1_sub5_sub4), (long) (anInt11493 * -1696966119 << 16 | anInt11492 * 2030567955));
	}

	public void method2943() {
		int i = -1263259136 * anInt11493 + 256;
		int i_5_ = 256 + 268707328 * anInt11492;
		int i_6_ = anInt11491 * -1898532567;
		if (i_6_ < 3 && (client.aClass515_11066.method6251(1011730914).method5466(-1696966119 * anInt11493, anInt11492 * 2030567955, (byte) -57)))
			i_6_++;
		Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = (new Class649_Sub1_Sub5_Sub4(client.aClass515_11066.method6249(1541179041), anInt9865 * 556893693, 0, anInt11491 * -1898532567, i_6_, i, Class54.method944(i, i_5_, anInt11491 * -1898532567, 1730907081) - 962970085 * anInt9867, i_5_, -1696966119 * anInt11493, anInt11493 * -1696966119, anInt11492 * 2030567955, anInt11492 * 2030567955, -1876561783 * anInt9866, false, 0));
		client.aClass4_11175.method560(new Class536_Sub18_Sub4(class649_sub1_sub5_sub4), (long) (anInt11493 * -1696966119 << 16 | anInt11492 * 2030567955));
	}

	Class205_Sub4_Sub1(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		int i = class536_sub33.readInt();
		anInt11493 = -434478551 * (i >>> 16);
		anInt11492 = (i & 0xffff) * 586291227;
		anInt11491 = class536_sub33.readUnsignedByte() * -505775335;
	}

	public static void method10582(int i, int i_7_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(13, (long) i);
		class536_sub18_sub5.method10669(346095785);
	}

	static final void method10583(Class668 class668, byte i) {
		int i_8_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (Class542_Sub1.aClass4_10699 != null) {
			Class536 class536 = Class542_Sub1.aClass4_10699.method556((long) i_8_);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = null != class536 ? 1 : 0;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final int method10584(int i, int i_9_, int i_10_, int i_11_) {
		int i_12_ = i / i_10_;
		int i_13_ = i & i_10_ - 1;
		int i_14_ = i_9_ / i_10_;
		int i_15_ = i_9_ & i_10_ - 1;
		int i_16_ = Class315.method4215(i_12_, i_14_, 1996594423);
		int i_17_ = Class315.method4215(i_12_ + 1, i_14_, 1618288178);
		int i_18_ = Class315.method4215(i_12_, i_14_ + 1, 545411182);
		int i_19_ = Class315.method4215(i_12_ + 1, 1 + i_14_, 1638763413);
		int i_20_ = Class265.method3690(i_16_, i_17_, i_13_, i_10_, 234966756);
		int i_21_ = Class265.method3690(i_18_, i_19_, i_13_, i_10_, -1150729213);
		return Class265.method3690(i_20_, i_21_, i_15_, i_10_, 125550629);
	}
}
