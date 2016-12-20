/* Class527_Sub8_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub12 extends Class527_Sub8 {
	public String aString11754;
	public String aString11755;
	public int anInt11756;
	Class694 aClass694_11757;
	boolean aBool11758;
	int anInt11759 = 579461233;
	public int anInt11760 = -1802792611;
	public int anInt11761 = -1621671936;
	public int anInt11762 = 0;
	public int anInt11763;
	public int anInt11764;
	public int anInt11765;

	public boolean method18300(int i, int i_0_, int i_1_, int[] is) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 10272); class527_sub37 != null; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16407(i, i_0_, i_1_, (byte) 70)) {
				class527_sub37.method16414(i_0_, i_1_, is, 1477949119);
				return true;
			}
		}
		return false;
	}

	boolean method18301(int i, int i_2_, int i_3_) {
		for (Class527_Sub37 class527_sub37 = ((Class527_Sub37) aClass694_11757.method14081((short) -22784)); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16406(i, i_2_, -1252724266))
				return true;
		}
		return false;
	}

	public boolean method18302(int i, int i_4_, int[] is, int i_5_) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 24934); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16408(i, i_4_, 759448488)) {
				class527_sub37.method16412(i, i_4_, is, -185619388);
				return true;
			}
		}
		return false;
	}

	boolean method18303(int i, int i_6_) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 18314); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16406(i, i_6_, -1252724266))
				return true;
		}
		return false;
	}

	static Class527_Sub8_Sub12 method18304(RSByteBuffer class527_sub38, int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = new Class527_Sub8_Sub12(i, class527_sub38.readString(1094613071), class527_sub38.readString(992111440), class527_sub38.readInt(), class527_sub38.readInt(), (class527_sub38.readUnsignedByte() == 1), class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedByte());
		int i_7_ = class527_sub38.readUnsignedByte();
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
			class527_sub8_sub12.aClass694_11757.method14147(new Class527_Sub37(class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort()), -798789453);
		class527_sub8_sub12.method18311((byte) -5);
		return class527_sub8_sub12;
	}

	public boolean method18305(int i, int i_9_, int[] is, byte i_10_) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 5968); class527_sub37 != null; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16406(i, i_9_, -1252724266)) {
				class527_sub37.method16414(i, i_9_, is, -141394493);
				return true;
			}
		}
		return false;
	}

	Class527_Sub8_Sub12(int i, String string, String string_11_, int i_12_, int i_13_, boolean bool, int i_14_, int i_15_) {
		anInt11756 = -856440832;
		anInt11764 = 0;
		aBool11758 = true;
		anInt11765 = i * 1378200735;
		aString11755 = string;
		aString11754 = string_11_;
		anInt11763 = 1319801063 * i_12_;
		anInt11759 = i_13_ * -579461233;
		aBool11758 = bool;
		anInt11760 = i_14_ * 1802792611;
		if (-1417497333 * anInt11760 == 255)
			anInt11760 = 0;
		Class255.method4705(i_15_, 2034260280);
		aClass694_11757 = new Class694();
	}

	static Class527_Sub8_Sub12 method18306(Class459 class459, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(class459.method7470(0, i, (byte) -37));
		return Class39.method1160(class527_sub38, i, (short) 255);
	}

	public boolean method18307(int i, int i_16_, int[] is) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) -1053); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16408(i, i_16_, 2037507310)) {
				class527_sub37.method16412(i, i_16_, is, -185619388);
				return true;
			}
		}
		return false;
	}

	public boolean method18308(int i, int i_17_, int[] is) {
		for (Class527_Sub37 class527_sub37 = ((Class527_Sub37) aClass694_11757.method14081((short) -11388)); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16408(i, i_17_, -1915730892)) {
				class527_sub37.method16412(i, i_17_, is, -185619388);
				return true;
			}
		}
		return false;
	}

	public boolean method18309(int i, int i_18_, int[] is) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 8013); class527_sub37 != null; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16406(i, i_18_, -1252724266)) {
				class527_sub37.method16414(i, i_18_, is, 1086637097);
				return true;
			}
		}
		return false;
	}

	public boolean method18310(int i, int i_19_, int[] is) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 20572); class527_sub37 != null; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16406(i, i_19_, -1252724266)) {
				class527_sub37.method16414(i, i_19_, is, -239697426);
				return true;
			}
		}
		return false;
	}

	void method18311(byte i) {
		anInt11761 = -1621671936;
		anInt11762 = 0;
		anInt11756 = -856440832;
		anInt11764 = 0;
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) -7436); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.anInt10680 * -519250333 < anInt11761 * -696795403)
				anInt11761 = -68083465 * class527_sub37.anInt10680;
			if (-90462377 * class527_sub37.anInt10677 > anInt11762 * -646015201)
				anInt11762 = class527_sub37.anInt10677 * -169279287;
			if (class527_sub37.anInt10683 * -1544396493 < anInt11756 * 124580655)
				anInt11756 = -851787459 * class527_sub37.anInt10683;
			if (-1840600681 * class527_sub37.anInt10685 > 1393632705 * anInt11764)
				anInt11764 = -1294068393 * class527_sub37.anInt10685;
		}
	}

	void method18312() {
		anInt11761 = -1621671936;
		anInt11762 = 0;
		anInt11756 = -856440832;
		anInt11764 = 0;
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) -299); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.anInt10680 * -519250333 < anInt11761 * -696795403)
				anInt11761 = -68083465 * class527_sub37.anInt10680;
			if (-90462377 * class527_sub37.anInt10677 > anInt11762 * -646015201)
				anInt11762 = class527_sub37.anInt10677 * -169279287;
			if (class527_sub37.anInt10683 * -1544396493 < anInt11756 * 124580655)
				anInt11756 = -851787459 * class527_sub37.anInt10683;
			if (-1840600681 * class527_sub37.anInt10685 > 1393632705 * anInt11764)
				anInt11764 = -1294068393 * class527_sub37.anInt10685;
		}
	}

	void method18313() {
		anInt11761 = -1621671936;
		anInt11762 = 0;
		anInt11756 = -856440832;
		anInt11764 = 0;
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 22278); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.anInt10680 * -519250333 < anInt11761 * -696795403)
				anInt11761 = -68083465 * class527_sub37.anInt10680;
			if (-90462377 * class527_sub37.anInt10677 > anInt11762 * -646015201)
				anInt11762 = class527_sub37.anInt10677 * -169279287;
			if (class527_sub37.anInt10683 * -1544396493 < anInt11756 * 124580655)
				anInt11756 = -851787459 * class527_sub37.anInt10683;
			if (-1840600681 * class527_sub37.anInt10685 > 1393632705 * anInt11764)
				anInt11764 = -1294068393 * class527_sub37.anInt10685;
		}
	}

	public boolean method18314(int i, int i_20_, int i_21_, int[] is, short i_22_) {
		for (Class527_Sub37 class527_sub37 = ((Class527_Sub37) aClass694_11757.method14081((short) -13409)); class527_sub37 != null; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16407(i, i_20_, i_21_, (byte) -35)) {
				class527_sub37.method16414(i_20_, i_21_, is, -548541780);
				return true;
			}
		}
		return false;
	}

	static Class527_Sub8_Sub12 method18315(RSByteBuffer class527_sub38, int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = new Class527_Sub8_Sub12(i, class527_sub38.readString(1205556633), class527_sub38.readString(1029115172), class527_sub38.readInt(), class527_sub38.readInt(), (class527_sub38.readUnsignedByte() == 1), class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedByte());
		int i_23_ = class527_sub38.readUnsignedByte();
		for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
			class527_sub8_sub12.aClass694_11757.method14147(new Class527_Sub37(class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort()), -1588036002);
		class527_sub8_sub12.method18311((byte) -68);
		return class527_sub8_sub12;
	}

	public boolean method18316(int i, int i_25_, int[] is) {
		for (Class527_Sub37 class527_sub37 = (Class527_Sub37) aClass694_11757.method14081((short) 14333); null != class527_sub37; class527_sub37 = (Class527_Sub37) aClass694_11757.method14086(-65534)) {
			if (class527_sub37.method16408(i, i_25_, -1426927262)) {
				class527_sub37.method16412(i, i_25_, is, -185619388);
				return true;
			}
		}
		return false;
	}

	static Class527_Sub8_Sub12 method18317(RSByteBuffer class527_sub38, int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = new Class527_Sub8_Sub12(i, class527_sub38.readString(1183031519), class527_sub38.readString(732800436), class527_sub38.readInt(), class527_sub38.readInt(), (class527_sub38.readUnsignedByte() == 1), class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedByte());
		int i_26_ = class527_sub38.readUnsignedByte();
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
			class527_sub8_sub12.aClass694_11757.method14147(new Class527_Sub37(class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort()), -541865525);
		class527_sub8_sub12.method18311((byte) -48);
		return class527_sub8_sub12;
	}

	static Class527_Sub8_Sub12 method18318(RSByteBuffer class527_sub38, int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = new Class527_Sub8_Sub12(i, class527_sub38.readString(1306995377), class527_sub38.readString(864583216), class527_sub38.readInt(), class527_sub38.readInt(), (class527_sub38.readUnsignedByte() == 1), class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedByte());
		int i_28_ = class527_sub38.readUnsignedByte();
		for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
			class527_sub8_sub12.aClass694_11757.method14147(new Class527_Sub37(class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort()), -1750325323);
		class527_sub8_sub12.method18311((byte) -120);
		return class527_sub8_sub12;
	}
}
