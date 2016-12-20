/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class214 {
	int anInt2262 = 52864923;
	Interface28 anInterface28_2263;
	long aLong2264;
	LinkedList aLinkedList2265 = new LinkedList();
	static Class243 aClass243_2266;

	public void method3896(Class219 class219) {
		if ((class219.aLong2291 * -6984276438804814041L != aLong2264 * -5915555096306038707L) || class219.method3984(1557067221) != anInt2262 * -1701996179)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2265.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method150(class219, -270922435);
		}
		class219.method3985(343937218);
	}

	public void method3897(Class219 class219, int i) {
		if ((class219.aLong2291 * -6984276438804814041L != aLong2264 * -5915555096306038707L) || class219.method3984(762996948) != anInt2262 * -1701996179)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2265.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method150(class219, -436996065);
		}
		class219.method3985(-413972619);
	}

	public void method3898(Class219 class219) {
		if ((class219.aLong2291 * -6984276438804814041L != aLong2264 * -5915555096306038707L) || class219.method3984(529785135) != anInt2262 * -1701996179)
			throw new IllegalStateException("");
		Iterator iterator = aLinkedList2265.iterator();
		while (iterator.hasNext()) {
			Interface27 interface27 = (Interface27) iterator.next();
			interface27.method150(class219, -852070522);
		}
		class219.method3985(1864072477);
	}

	public Class214(RSByteBuffer class527_sub38, Interface28 interface28) {
		anInterface28_2263 = interface28;
		aLong2264 = class527_sub38.method16612((byte) 1) * 3769850401450832005L;
		anInt2262 = class527_sub38.readInt() * -52864923;
		for (int i = class527_sub38.readUnsignedByte(); 0 != i; i = class527_sub38.readUnsignedByte()) {
			Class244 class244 = (Class244) Class26.method858(Class244.method4610(-878738353), i, 752126745);
			Interface27 interface27;
			switch (class244.anInt2682 * 551362715) {
			case 10:
				interface27 = new Class222(this, class527_sub38);
				break;
			case 11:
				interface27 = new Class213(this, class527_sub38);
				break;
			case 4:
				interface27 = new Class218(this, class527_sub38);
				break;
			case 13:
				interface27 = new Class238(this);
				break;
			case 7:
				interface27 = new Class224(this, class527_sub38);
				break;
			case 8:
				interface27 = new Class211(this, class527_sub38);
				break;
			default:
				throw new IllegalStateException("");
			case 12:
				interface27 = new Class217(this, class527_sub38);
				break;
			case 6:
				interface27 = new Class254(this, class527_sub38);
				break;
			case 0:
				interface27 = new Class232(this, class527_sub38);
				break;
			case 2:
				interface27 = new Class239(this, class527_sub38);
				break;
			case 1:
				interface27 = new Class227(this);
				break;
			case 5:
				interface27 = new Class235(this, class527_sub38);
				break;
			case 9:
				interface27 = new Class225(this, class527_sub38);
				break;
			case 3:
				interface27 = new Class231(this, class527_sub38);
			}
			aLinkedList2265.add(interface27);
		}
	}

	static final void method3899(Class665 class665, boolean bool, int i) {
		int i_0_ = class665.anIntArray8545[891367231 * class665.anInt8527];
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_1_ < 0 || i_1_ >= class665.anIntArray8538[i_0_])
			throw new RuntimeException();
		class665.anIntArrayArray8542[i_0_][i_1_] = i_2_;
		if (bool)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_2_;
	}

	public static short[] method3900(short[] is, int i) {
		if (null == is)
			return null;
		short[] is_3_ = new short[is.length];
		System.arraycopy(is, 0, is_3_, 0, is.length);
		return is_3_;
	}

	static final void method3901(Class665 class665, int i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_4_, 1649896929);
		Class409.method6570(class243, class665, 1993069615);
	}

	static void method3902(int i, int i_5_) {
		Class527_Sub1.anInt10334 = 1494731909 * i;
		Class527_Sub1.aClass205_10331.method3793((byte) 8);
	}

	public static void method3903(int i, int i_6_) {
		Class535.anInt7221 = -1245643413 * i;
	}

	public static Class399 method3904(RSByteBuffer class527_sub38, int i) {
		String string = class527_sub38.readString(1774075036);
		Class400 class400 = (Class183.method3556(1665171564)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_7_ = class527_sub38.readShort();
		int i_8_ = class527_sub38.readShort();
		int i_9_ = class527_sub38.readUnsignedByte();
		int i_10_ = class527_sub38.readUnsignedByte();
		int i_11_ = class527_sub38.readUnsignedByte();
		int i_12_ = class527_sub38.readUnsignedShort();
		int i_13_ = class527_sub38.readUnsignedShort();
		int i_14_ = class527_sub38.method16466(-1903028540);
		int i_15_ = class527_sub38.readInt();
		int i_16_ = class527_sub38.readInt();
		return new Class399(string, class400, class384, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_);
	}
}
