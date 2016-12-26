/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class204 {
	static final int anInt2230 = 2;
	int[] anIntArray2231;
	static final int anInt2232 = 0;
	int[] anIntArray2233;
	public static Class143 aClass143_2234;

	Class204(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart();
		anIntArray2233 = new int[i];
		anIntArray2231 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = class536_sub33.readUnsignedByte();
			anIntArray2233[i_0_] = i_1_;
			int i_2_ = class536_sub33.readUnsignedShort();
			int i_3_ = class536_sub33.readUnsignedShort();
			anIntArray2231[i_0_] = (i_2_ << 16) + i_3_;
		}
	}

	void method2931(Class189 class189, int i, int i_4_) {
		int i_5_ = anIntArray2231[0];
		class189.method2803(i, i_5_ >>> 16, i_5_ & 0xffff, (byte) 26);
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = class189.method2804(2113852661);
		class649_sub1_sub5_sub1.stepsCount = 0;
		for (int i_6_ = anIntArray2233.length - 1; i_6_ >= 0; i_6_--) {
			int i_7_ = anIntArray2233[i_6_];
			int i_8_ = anIntArray2231[i_6_];
			class649_sub1_sub5_sub1.screenX[-711375609 * class649_sub1_sub5_sub1.stepsCount] = i_8_ >> 16;
			class649_sub1_sub5_sub1.screenY[-711375609 * class649_sub1_sub5_sub1.stepsCount] = i_8_ & 0xffff;
			byte i_9_ = Class680.aClass680_8639.aByte8644;
			if (i_7_ == 0)
				i_9_ = Class680.aClass680_8638.aByte8644;
			else if (i_7_ == 2)
				i_9_ = Class680.aClass680_8640.aByte8644;
			class649_sub1_sub5_sub1.aByteArray11946[-711375609 * class649_sub1_sub5_sub1.stepsCount] = i_9_;
			class649_sub1_sub5_sub1.stepsCount += 1754339511;
		}
	}

	public static void method2932(Class167 class167, long l, int i, int i_10_, int i_11_) {
		do {
			if (class167.method2284() && class167.method2149() > -1) {
				int i_12_ = class167.method2149();
				Class576 class576 = null;
				if (!Class575.aLinkedList7670.isEmpty())
					class576 = (Class576) Class575.aLinkedList7670.getFirst();
				if (null == class576 || i_12_ != -424501287 * class576.anInt7681) {
					class167.method2040();
					Class575.aLinkedList7670.clear();
				} else {
					Class575.aLinkedList7670.removeFirst();
					class167.method2085();
					boolean bool = false;
					int i_13_;
					if (class576.aLinkedList7686.isEmpty() && class167.method2037()) {
						long l_14_ = class167.method2042((Class420.anInt4585 * 672935275), (Class575.anInt7669 * -264469499));
						i_13_ = (Class536_Sub42.aTwitchTV10811.SubmitFrame(l_14_, class167.method2038(), Class575.aBool7659, i, i_10_));
						class167.method2043(l_14_);
					} else {
						class167.method2044(672935275 * Class420.anInt4585, Class575.anInt7669 * -264469499, (Class536_Sub22_Sub5.anIntArray11645), Class508.anIntArray6917);
						Class674.method8029((Class536_Sub22_Sub5.anIntArray11645), class576.aLinkedList7686, class576.anInt7682 * 1739858555, -2078670521 * class576.anInt7685, class576.aFloat7684, 16711935);
						i_13_ = (Class536_Sub42.aTwitchTV10811.SubmitFrameRaw(Class536_Sub22_Sub5.anIntArray11645, Class575.aBool7659, i, i_10_));
					}
					class167.method2086();
					if (i_13_ == 2072)
						Class575.aLong7664 = 1694330692096630633L * l;
					else if (i_13_ == 23)
						Class575.aLong7665 = 3603005028716452335L * l;
					else if (i_13_ == -995 || i_13_ != 0)
						break;
				}
			}
		} while (false);
		if (Class575.aBool7667) {
			if (Class536_Sub22_Sub5.anIntArray11645 == null) {
				Class536_Sub22_Sub5.anIntArray11645 = new int[(Class575.aBool7659 ? i_10_ * i : (-264469499 * Class575.anInt7669 * (672935275 * Class420.anInt4585)))];
				Class508.anIntArray6917 = new int[(Class575.aBool7659 ? i_10_ * i : (672935275 * Class420.anInt4585 * (-264469499 * Class575.anInt7669)))];
			}
			if (!class167.method2284()) {
				class167.method2085();
				class167.method2044(Class420.anInt4585 * 672935275, -264469499 * Class575.anInt7669, Class536_Sub22_Sub5.anIntArray11645, Class508.anIntArray6917);
				Class674.method8029(Class536_Sub22_Sub5.anIntArray11645, Class575.aLinkedList7661, class167.anInt1872 * 1475697639, class167.anInt1873 * 398729877, class167.aFloat1876, 16711935);
				int i_15_ = (Class536_Sub42.aTwitchTV10811.SubmitFrameRaw(Class536_Sub22_Sub5.anIntArray11645, Class575.aBool7659, i, i_10_));
				class167.method2086();
				Class575.aLinkedList7661.clear();
				do {
					if (2072 == i_15_)
						Class575.aLong7664 = 1694330692096630633L * l;
					else if (i_15_ == 23)
						Class575.aLong7665 = 3603005028716452335L * l;
					else if (i_15_ == -995 || 0 != i_15_)
						break;
				} while (false);
			} else {
				class167.method2041(client.cycles, Class420.anInt4585 * 672935275, Class575.anInt7669 * -264469499);
				Class575.aLinkedList7670.add(new Class576(client.cycles, Class575.aLinkedList7661, 1475697639 * class167.anInt1872, 398729877 * class167.anInt1873, class167.aFloat1876));
				Class575.aLinkedList7661 = new LinkedList();
			}
			Class575.aBool7667 = false;
		}
	}

	static final void method2933(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.aString2556 = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
	}

	static int method2934(Iterable iterable, int i) {
		int i_16_ = -1;
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Interface75 interface75 = (Interface75) iterator.next();
			if (interface75.method78() > i_16_)
				i_16_ = interface75.method78();
		}
		return (i_16_ + 8) / 8;
	}

	static void method2935(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		if (Class644.aBool8351) {
			Class141.method1707(0 != (class668.anIntArray8541[class668.anInt8542 * 1867269829]), -1195088606);
			Class59.method987(0 != (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]), (byte) 70);
			Class261.method3621(0 != (class668.anIntArray8541[2 + class668.anInt8542 * 1867269829]), -1510855325);
		}
	}

	static final void method2936(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub21_10741.method10109((byte) 1);
	}

	static final void method2937(Class668 class668, int i) {
		class668.anInt8542 -= 123711566;
		int i_17_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		if (i_17_ >= 2)
			throw new RuntimeException();
		client.anInt11192 = i_17_ * 1863105115;
		int i_18_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (i_18_ + 1 >= (client.anIntArrayArrayArray11117[614327763 * client.anInt11192]).length >> 1)
			throw new RuntimeException();
		client.anInt11182 = -1285140431 * i_18_;
		client.anInt11122 = 0;
		client.anInt11054 = (796620387 * class668.anIntArray8541[2 + 1867269829 * class668.anInt8542]);
		client.anInt11318 = (621247145 * class668.anIntArray8541[3 + class668.anInt8542 * 1867269829]);
		int i_19_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 4];
		if (i_19_ >= 2)
			throw new RuntimeException();
		client.anInt11119 = i_19_ * 408425903;
		int i_20_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 5];
		if (i_20_ + 1 >= (client.anIntArrayArrayArray11117[client.anInt11119 * 763781455]).length >> 1)
			throw new RuntimeException();
		client.anInt11248 = 217627755 * i_20_;
		Class246.anInt2474 = 1773175324;
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
	}

	static final void method2938(Class668 class668, int i) {
		int i_21_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_21_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_21_ >> 16];
		Class247_Sub1.method9105(class251, class234, class668, 935760968);
	}
}
