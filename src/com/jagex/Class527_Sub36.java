/* Class527_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub36 extends Class527 implements Interface8 {
	public int anInt10671;
	static int anInt10672;
	public int anInt10673;
	static Class527_Sub36[] aClass527_Sub36Array10674 = new Class527_Sub36[0];
	public int anInt10675;
	public int anInt10676;

	public Class527_Sub36(RSByteBuffer class527_sub38) {
		method63(class527_sub38, 1404256033);
	}

	public String method16381() {
		return new StringBuilder().append("Level: ").append(anInt10673 * -426691751).append(" Coord: ").append(anInt10676 * 1445023519).append(",").append(anInt10671 * -1748166157).append(",").append(-424734829 * anInt10675).append(" Coord Split: ").append(1445023519 * anInt10676 >> 15).append(",").append(anInt10675 * -424734829 >> 15).append(",").append(1445023519 * anInt10676 >> 9 & 0x3f).append(",").append(-424734829 * anInt10675 >> 9 & 0x3f).append(",")
				.append(anInt10676 * 1445023519 & 0x1ff).append(",").append(-424734829 * anInt10675 & 0x1ff).toString();
	}

	public static Class527_Sub36 method16382(Class527_Sub36 class527_sub36) {
		synchronized (aClass527_Sub36Array10674) {
			if (0 == anInt10672 * -706191715) {
				Class527_Sub36 class527_sub36_0_ = new Class527_Sub36(class527_sub36);
				return class527_sub36_0_;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16387(class527_sub36, -2083955513);
			Class527_Sub36 class527_sub36_1_ = aClass527_Sub36Array10674[-706191715 * anInt10672];
			return class527_sub36_1_;
		}
	}

	public void method69(RSByteBuffer class527_sub38, byte i) {
		method16398(class527_sub38, (byte) -20);
	}

	Class527_Sub36(int i, boolean bool) {
		if (-1 == i)
			anInt10673 = 496638743;
		else {
			anInt10673 = -496638743 * (i >> 28 & 0x3);
			anInt10676 = ((i >> 14 & 0x3fff) << 9) * -1610257185;
			anInt10671 = 0;
			anInt10675 = 723478171 * ((i & 0x3fff) << 9);
			if (bool) {
				anInt10676 += 91021056;
				anInt10675 += 526818048;
			}
		}
	}

	void method16383(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt10673 = i * -496638743;
		anInt10676 = i_2_ * -1610257185;
		anInt10671 = -1428347077 * i_3_;
		anInt10675 = i_4_ * 723478171;
	}

	void method16384(int i, boolean bool, int i_6_) {
		if (-1 == i)
			anInt10673 = 496638743;
		else {
			anInt10673 = (i >> 28 & 0x3) * -496638743;
			anInt10676 = -1610257185 * ((i >> 14 & 0x3fff) << 9);
			anInt10671 = 0;
			anInt10675 = ((i & 0x3fff) << 9) * 723478171;
			if (bool) {
				anInt10676 += 91021056;
				anInt10675 += 526818048;
			}
		}
	}

	public void method66(RSByteBuffer class527_sub38) {
		method16398(class527_sub38, (byte) -16);
	}

	public Class442 method16385(int i) {
		return new Class442((float) (1445023519 * anInt10676), (float) (anInt10671 * -1748166157), (float) (-424734829 * anInt10675));
	}

	public static Class527_Sub36 method16386(int i, int i_7_, int i_8_, int i_9_) {
		synchronized (aClass527_Sub36Array10674) {
			if (anInt10672 * -706191715 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, i_7_, i_8_, i_9_);
				return class527_sub36;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16383(i, i_7_, i_8_, i_9_, -1212142325);
			Class527_Sub36 class527_sub36 = aClass527_Sub36Array10674[-706191715 * anInt10672];
			return class527_sub36;
		}
	}

	public int method64(int i) {
		return Class709.method14394(-274683197);
	}

	void method16387(Class527_Sub36 class527_sub36_10_, int i) {
		anInt10673 = class527_sub36_10_.anInt10673 * 1;
		anInt10676 = class527_sub36_10_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_10_.anInt10671;
		anInt10675 = class527_sub36_10_.anInt10675 * 1;
	}

	public void method63(RSByteBuffer class527_sub38, int i) {
		anInt10673 = class527_sub38.readUnsignedByte() * -496638743;
		anInt10676 = class527_sub38.readInt() * -1610257185;
		anInt10671 = class527_sub38.readInt() * -1428347077;
		anInt10675 = class527_sub38.readInt() * 723478171;
	}

	public Class527_Sub36() {
		anInt10673 = 496638743;
	}

	public int method62() {
		return Class709.method14394(346848511);
	}

	public static Class527_Sub36 method16388(int i, int i_11_, int i_12_, int i_13_) {
		synchronized (aClass527_Sub36Array10674) {
			if (anInt10672 * -706191715 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, i_11_, i_12_, i_13_);
				return class527_sub36;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16383(i, i_11_, i_12_, i_13_, 1714276285);
			Class527_Sub36 class527_sub36 = aClass527_Sub36Array10674[-706191715 * anInt10672];
			return class527_sub36;
		}
	}

	Class527_Sub36(Class527_Sub36 class527_sub36_14_) {
		anInt10673 = class527_sub36_14_.anInt10673 * 1;
		anInt10676 = class527_sub36_14_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_14_.anInt10671;
		anInt10675 = class527_sub36_14_.anInt10675 * 1;
	}

	public static Class527_Sub36 method16389(Class527_Sub36 class527_sub36) {
		synchronized (aClass527_Sub36Array10674) {
			if (0 == anInt10672 * -706191715) {
				Class527_Sub36 class527_sub36_15_ = new Class527_Sub36(class527_sub36);
				return class527_sub36_15_;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16387(class527_sub36, -2083955513);
			Class527_Sub36 class527_sub36_16_ = aClass527_Sub36Array10674[-706191715 * anInt10672];
			return class527_sub36_16_;
		}
	}

	void method16390(RSByteBuffer class527_sub38) {
		class527_sub38.writeByte(-426691751 * anInt10673, 1589784398);
		class527_sub38.writeInt(1445023519 * anInt10676, 1890931569);
		class527_sub38.writeInt(-1748166157 * anInt10671, -1651746265);
		class527_sub38.writeInt(-424734829 * anInt10675, 2111762685);
	}

	public static Class527_Sub36 method16391(int i, boolean bool) {
		synchronized (aClass527_Sub36Array10674) {
			if (-706191715 * anInt10672 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, bool);
				return class527_sub36;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16384(i, bool, -1949729616);
			Class527_Sub36 class527_sub36 = aClass527_Sub36Array10674[anInt10672 * -706191715];
			return class527_sub36;
		}
	}

	public static Class527_Sub36 method16392(int i, boolean bool) {
		synchronized (aClass527_Sub36Array10674) {
			if (-706191715 * anInt10672 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, bool);
				return class527_sub36;
			}
			aClass527_Sub36Array10674[(anInt10672 -= -1300686923) * -706191715].method16384(i, bool, -1974408390);
			Class527_Sub36 class527_sub36 = aClass527_Sub36Array10674[anInt10672 * -706191715];
			return class527_sub36;
		}
	}

	void method16393(int i, int i_17_, int i_18_, int i_19_) {
		anInt10673 = i * -496638743;
		anInt10676 = i_17_ * -1610257185;
		anInt10671 = -1428347077 * i_18_;
		anInt10675 = i_19_ * 723478171;
	}

	void method16394(Class527_Sub36 class527_sub36_20_) {
		anInt10673 = class527_sub36_20_.anInt10673 * 1;
		anInt10676 = class527_sub36_20_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_20_.anInt10671;
		anInt10675 = class527_sub36_20_.anInt10675 * 1;
	}

	void method16395(Class527_Sub36 class527_sub36_21_) {
		anInt10673 = class527_sub36_21_.anInt10673 * 1;
		anInt10676 = class527_sub36_21_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_21_.anInt10671;
		anInt10675 = class527_sub36_21_.anInt10675 * 1;
	}

	void method16396(Class527_Sub36 class527_sub36_22_) {
		anInt10673 = class527_sub36_22_.anInt10673 * 1;
		anInt10676 = class527_sub36_22_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_22_.anInt10671;
		anInt10675 = class527_sub36_22_.anInt10675 * 1;
	}

	void method16397(Class527_Sub36 class527_sub36_23_) {
		anInt10673 = class527_sub36_23_.anInt10673 * 1;
		anInt10676 = class527_sub36_23_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_23_.anInt10671;
		anInt10675 = class527_sub36_23_.anInt10675 * 1;
	}

	void method16398(RSByteBuffer class527_sub38, byte i) {
		class527_sub38.writeByte(-426691751 * anInt10673, 114606165);
		class527_sub38.writeInt(1445023519 * anInt10676, -1659001119);
		class527_sub38.writeInt(-1748166157 * anInt10671, 758917033);
		class527_sub38.writeInt(-424734829 * anInt10675, -1686046453);
	}

	public Class442 method16399() {
		return new Class442((float) (1445023519 * anInt10676), (float) (anInt10671 * -1748166157), (float) (-424734829 * anInt10675));
	}

	public String toString() {
		return new StringBuilder().append("Level: ").append(anInt10673 * -426691751).append(" Coord: ").append(anInt10676 * 1445023519).append(",").append(anInt10671 * -1748166157).append(",").append(-424734829 * anInt10675).append(" Coord Split: ").append(1445023519 * anInt10676 >> 15).append(",").append(anInt10675 * -424734829 >> 15).append(",").append(1445023519 * anInt10676 >> 9 & 0x3f).append(",").append(-424734829 * anInt10675 >> 9 & 0x3f).append(",")
				.append(anInt10676 * 1445023519 & 0x1ff).append(",").append(-424734829 * anInt10675 & 0x1ff).toString();
	}

	public Class442 method16400() {
		return new Class442((float) (1445023519 * anInt10676), (float) (anInt10671 * -1748166157), (float) (-424734829 * anInt10675));
	}

	void method16401(RSByteBuffer class527_sub38) {
		class527_sub38.writeByte(-426691751 * anInt10673, -1518497925);
		class527_sub38.writeInt(1445023519 * anInt10676, -674713478);
		class527_sub38.writeInt(-1748166157 * anInt10671, 1395842162);
		class527_sub38.writeInt(-424734829 * anInt10675, 2063037935);
	}

	void method16402(RSByteBuffer class527_sub38) {
		class527_sub38.writeByte(-426691751 * anInt10673, -1735888931);
		class527_sub38.writeInt(1445023519 * anInt10676, -237937059);
		class527_sub38.writeInt(-1748166157 * anInt10671, -1132012943);
		class527_sub38.writeInt(-424734829 * anInt10675, 52493243);
	}

	static int method16403() {
		return 13;
	}

	public Class527_Sub36(int i, int i_24_, int i_25_, int i_26_) {
		anInt10673 = i * -496638743;
		anInt10676 = i_24_ * -1610257185;
		anInt10671 = i_25_ * -1428347077;
		anInt10675 = i_26_ * 723478171;
	}

	public void method73(RSByteBuffer class527_sub38) {
		method16398(class527_sub38, (byte) -35);
	}

	public void method65(RSByteBuffer class527_sub38) {
		method16398(class527_sub38, (byte) 43);
	}

	void method16404(Class527_Sub36 class527_sub36_27_) {
		anInt10673 = class527_sub36_27_.anInt10673 * 1;
		anInt10676 = class527_sub36_27_.anInt10676 * 1;
		anInt10671 = 1 * class527_sub36_27_.anInt10671;
		anInt10675 = class527_sub36_27_.anInt10675 * 1;
	}

	public void method67(RSByteBuffer class527_sub38) {
		method16398(class527_sub38, (byte) 24);
	}

	public void method61(RSByteBuffer class527_sub38) {
		method16398(class527_sub38, (byte) -55);
	}

	public void method68(RSByteBuffer class527_sub38) {
		anInt10673 = class527_sub38.readUnsignedByte() * -496638743;
		anInt10676 = class527_sub38.readInt() * -1610257185;
		anInt10671 = class527_sub38.readInt() * -1428347077;
		anInt10675 = class527_sub38.readInt() * 723478171;
	}

	public void method70(RSByteBuffer class527_sub38) {
		anInt10673 = class527_sub38.readUnsignedByte() * -496638743;
		anInt10676 = class527_sub38.readInt() * -1610257185;
		anInt10671 = class527_sub38.readInt() * -1428347077;
		anInt10675 = class527_sub38.readInt() * 723478171;
	}

	public void method71(RSByteBuffer class527_sub38) {
		anInt10673 = class527_sub38.readUnsignedByte() * -496638743;
		anInt10676 = class527_sub38.readInt() * -1610257185;
		anInt10671 = class527_sub38.readInt() * -1428347077;
		anInt10675 = class527_sub38.readInt() * 723478171;
	}

	public int method72() {
		return Class709.method14394(-1583637360);
	}

	public Class442 method16405() {
		return new Class442((float) (1445023519 * anInt10676), (float) (anInt10671 * -1748166157), (float) (-424734829 * anInt10675));
	}
}
