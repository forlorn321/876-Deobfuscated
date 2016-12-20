/* Class527_Sub8_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub10 extends Class527_Sub8 {
	public int anInt11721;
	public String aString11722;
	public int anInt11723;
	public int[] anIntArray11724;
	public Object[] anObjectArray11725;
	public int anInt11726;
	public int anInt11727;
	public int anInt11728;
	public int anInt11729;
	public Class579 aClass579_11730;
	public Class501[] aClass501Array11731;
	public Class14[] aClass14Array11732;
	Interface20 anInterface20_11733;

	int method18289(RSByteBuffer class527_sub38, byte i) {
		class527_sub38.anInt10689 = (class527_sub38.buffer.length - 2) * 1474750881;
		int i_0_ = class527_sub38.readUnsignedShort();
		int i_1_ = class527_sub38.buffer.length - 2 - i_0_ - 16;
		class527_sub38.anInt10689 = 1474750881 * i_1_;
		int i_2_ = class527_sub38.readInt();
		anInt11726 = class527_sub38.readUnsignedShort() * -1709418121;
		anInt11727 = class527_sub38.readUnsignedShort() * 147942473;
		anInt11721 = class527_sub38.readUnsignedShort() * 769362143;
		anInt11728 = class527_sub38.readUnsignedShort() * 1162100097;
		anInt11723 = class527_sub38.readUnsignedShort() * 170150341;
		anInt11729 = class527_sub38.readUnsignedShort() * 1434058663;
		int i_3_ = class527_sub38.readUnsignedByte();
		if (i_3_ > 0) {
			aClass14Array11732 = new Class14[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				int i_5_ = class527_sub38.readUnsignedShort();
				Class14 class14 = new Class14(Class186.method3652(i_5_, 806932432));
				aClass14Array11732[i_4_] = class14;
				while (i_5_-- > 0) {
					int i_6_ = class527_sub38.readInt();
					int i_7_ = class527_sub38.readInt();
					class14.method714(new Node_Sub6(i_7_), (long) i_6_);
				}
			}
		}
		class527_sub38.anInt10689 = 0;
		aString11722 = class527_sub38.method16456((byte) 35);
		aClass501Array11731 = new Class501[i_2_];
		return i_1_;
	}

	Class501 method18290(RSByteBuffer class527_sub38, Class501[] class501s, byte i) {
		int i_8_ = class527_sub38.readUnsignedShort();
		if (i_8_ < 0 || i_8_ >= class501s.length)
			throw new RuntimeException("");
		Class501 class501 = class501s[i_8_];
		return class501;
	}

	public Class527_Sub8_Sub10(RSByteBuffer class527_sub38, Interface20 interface20) {
		anInterface20_11733 = interface20;
		int i = method18289(class527_sub38, (byte) 1);
		int i_9_ = 0;
		Class501[] class501s = Class259.method4780((byte) -45);
		while (class527_sub38.anInt10689 * -441238943 < i) {
			Class501 class501 = method18290(class527_sub38, class501s, (byte) -24);
			method18291(class527_sub38, i_9_, class501, -2033418848);
			i_9_++;
		}
	}

	void method18291(RSByteBuffer class527_sub38, int i, Class501 class501, int i_10_) {
		int i_11_ = aClass501Array11731.length;
		if (Class501.aClass501_5599 == class501 || class501 == Class501.aClass501_5600) {
			Class465 class465 = ((Class465) Class26.method858(Class465.method7644(1763090766), class527_sub38.readUnsignedByte(), -31641147));
			int i_12_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_11_];
			anObjectArray11725[i] = anInterface20_11733.method125(class465, i_12_, -1654146308);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_11_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else if (class501 == Class501.aClass501_5603) {
			Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) -26), class527_sub38.readUnsignedByte(), 1367573783));
			switch (533573711 * class475.anInt5377) {
			case 3:
				if (anIntArray11724 == null)
					anIntArray11724 = new int[i_11_];
				class501 = Class501.aClass501_6029;
				anIntArray11724[i] = class527_sub38.readInt();
				break;
			default:
				throw new RuntimeException();
			case 2:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_11_];
				anObjectArray11725[i] = class527_sub38.readString(1983420999).intern();
				break;
			case 1:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_11_];
				class501 = Class501.aClass501_6448;
				anObjectArray11725[i] = Long.valueOf(class527_sub38.method16612((byte) 1));
			}
		} else if (Class501.aClass501_6317 == class501 || Class501.aClass501_5924 == class501) {
			int i_13_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_11_];
			anObjectArray11725[i] = anInterface20_11733.method123(i_13_, 1770435048);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_11_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else {
			if (null == anIntArray11724)
				anIntArray11724 = new int[i_11_];
			if (class501 != null && class501.aBool6519)
				anIntArray11724[i] = class527_sub38.readInt();
			else
				anIntArray11724[i] = class527_sub38.readUnsignedByte();
		}
		aClass501Array11731[i] = class501;
	}

	int method18292(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = (class527_sub38.buffer.length - 2) * 1474750881;
		int i = class527_sub38.readUnsignedShort();
		int i_14_ = class527_sub38.buffer.length - 2 - i - 16;
		class527_sub38.anInt10689 = 1474750881 * i_14_;
		int i_15_ = class527_sub38.readInt();
		anInt11726 = class527_sub38.readUnsignedShort() * -1709418121;
		anInt11727 = class527_sub38.readUnsignedShort() * 147942473;
		anInt11721 = class527_sub38.readUnsignedShort() * 769362143;
		anInt11728 = class527_sub38.readUnsignedShort() * 1162100097;
		anInt11723 = class527_sub38.readUnsignedShort() * 170150341;
		anInt11729 = class527_sub38.readUnsignedShort() * 1434058663;
		int i_16_ = class527_sub38.readUnsignedByte();
		if (i_16_ > 0) {
			aClass14Array11732 = new Class14[i_16_];
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
				int i_18_ = class527_sub38.readUnsignedShort();
				Class14 class14 = new Class14(Class186.method3652(i_18_, 2093706424));
				aClass14Array11732[i_17_] = class14;
				while (i_18_-- > 0) {
					int i_19_ = class527_sub38.readInt();
					int i_20_ = class527_sub38.readInt();
					class14.method714(new Node_Sub6(i_20_), (long) i_19_);
				}
			}
		}
		class527_sub38.anInt10689 = 0;
		aString11722 = class527_sub38.method16456((byte) 58);
		aClass501Array11731 = new Class501[i_15_];
		return i_14_;
	}

	void method18293(RSByteBuffer class527_sub38, int i, Class501 class501) {
		int i_21_ = aClass501Array11731.length;
		if (Class501.aClass501_5599 == class501 || class501 == Class501.aClass501_5600) {
			Class465 class465 = ((Class465) Class26.method858(Class465.method7644(1923547858), class527_sub38.readUnsignedByte(), 717675265));
			int i_22_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_21_];
			anObjectArray11725[i] = anInterface20_11733.method125(class465, i_22_, -707300658);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_21_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else if (class501 == Class501.aClass501_5603) {
			Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) 1), class527_sub38.readUnsignedByte(), 70399551));
			switch (533573711 * class475.anInt5377) {
			case 3:
				if (anIntArray11724 == null)
					anIntArray11724 = new int[i_21_];
				class501 = Class501.aClass501_6029;
				anIntArray11724[i] = class527_sub38.readInt();
				break;
			default:
				throw new RuntimeException();
			case 2:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_21_];
				anObjectArray11725[i] = class527_sub38.readString(864963823).intern();
				break;
			case 1:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_21_];
				class501 = Class501.aClass501_6448;
				anObjectArray11725[i] = Long.valueOf(class527_sub38.method16612((byte) 1));
			}
		} else if (Class501.aClass501_6317 == class501 || Class501.aClass501_5924 == class501) {
			int i_23_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_21_];
			anObjectArray11725[i] = anInterface20_11733.method123(i_23_, -1422104813);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_21_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else {
			if (null == anIntArray11724)
				anIntArray11724 = new int[i_21_];
			if (class501 != null && class501.aBool6519)
				anIntArray11724[i] = class527_sub38.readInt();
			else
				anIntArray11724[i] = class527_sub38.readUnsignedByte();
		}
		aClass501Array11731[i] = class501;
	}

	void method18294(RSByteBuffer class527_sub38, int i, Class501 class501) {
		int i_24_ = aClass501Array11731.length;
		if (Class501.aClass501_5599 == class501 || class501 == Class501.aClass501_5600) {
			Class465 class465 = ((Class465) Class26.method858(Class465.method7644(2016633648), class527_sub38.readUnsignedByte(), -2115205029));
			int i_25_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_24_];
			anObjectArray11725[i] = anInterface20_11733.method125(class465, i_25_, -1792140041);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_24_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else if (class501 == Class501.aClass501_5603) {
			Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) -96), class527_sub38.readUnsignedByte(), -804785264));
			switch (533573711 * class475.anInt5377) {
			case 3:
				if (anIntArray11724 == null)
					anIntArray11724 = new int[i_24_];
				class501 = Class501.aClass501_6029;
				anIntArray11724[i] = class527_sub38.readInt();
				break;
			default:
				throw new RuntimeException();
			case 2:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_24_];
				anObjectArray11725[i] = class527_sub38.readString(1900370300).intern();
				break;
			case 1:
				if (anObjectArray11725 == null)
					anObjectArray11725 = new Object[i_24_];
				class501 = Class501.aClass501_6448;
				anObjectArray11725[i] = Long.valueOf(class527_sub38.method16612((byte) 1));
			}
		} else if (Class501.aClass501_6317 == class501 || Class501.aClass501_5924 == class501) {
			int i_26_ = class527_sub38.readUnsignedShort();
			if (null == anObjectArray11725)
				anObjectArray11725 = new Object[i_24_];
			anObjectArray11725[i] = anInterface20_11733.method123(i_26_, 53428745);
			if (anIntArray11724 == null)
				anIntArray11724 = new int[i_24_];
			anIntArray11724[i] = class527_sub38.readUnsignedByte();
		} else {
			if (null == anIntArray11724)
				anIntArray11724 = new int[i_24_];
			if (class501 != null && class501.aBool6519)
				anIntArray11724[i] = class527_sub38.readInt();
			else
				anIntArray11724[i] = class527_sub38.readUnsignedByte();
		}
		aClass501Array11731[i] = class501;
	}
}
