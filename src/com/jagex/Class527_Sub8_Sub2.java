/* Class527_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub2 extends Class527_Sub8 implements Interface14, Interface7 {
	Class14 aClass14_11338;

	public int method17891(int i, int i_0_) {
		if (aClass14_11338 == null)
			return i_0_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_11338.method709((long) i);
		if (null == class527_sub7)
			return i_0_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (0 == i_1_)
				break;
			method17894(class527_sub38, i_1_, -2059444706);
		}
	}

	public String method17892(int i, String string) {
		if (null == aClass14_11338)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_11338.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method17893(int i, int i_2_, byte i_3_) {
		if (aClass14_11338 == null)
			return i_2_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_11338.method709((long) i);
		if (null == class527_sub7)
			return i_2_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public void method60(int i) {
		/* empty */
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method17894(class527_sub38, i, 352835229);
		}
	}

	Class527_Sub8_Sub2() {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method17894(class527_sub38, i, -371139548);
		}
	}

	public void method86(int i) {
		/* empty */
	}

	public void method85() {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	void method17894(RSByteBuffer class527_sub38, int i, int i_4_) {
		if (249 == i) {
			int i_5_ = class527_sub38.readUnsignedByte();
			if (null == aClass14_11338) {
				int i_6_ = Class186.method3652(i_5_, 1531671757);
				aClass14_11338 = new Class14(i_6_);
			}
			for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_8_ = class527_sub38.read24BitUnsignedInteger(1446153724);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(1686390559));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_11338.method714(class527, (long) i_8_);
			}
		}
	}

	void method17895(RSByteBuffer class527_sub38, int i) {
		if (249 == i) {
			int i_9_ = class527_sub38.readUnsignedByte();
			if (null == aClass14_11338) {
				int i_10_ = Class186.method3652(i_9_, -1562899977);
				aClass14_11338 = new Class14(i_10_);
			}
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_12_ = class527_sub38.read24BitUnsignedInteger(1310787938);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(1243343239));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_11338.method714(class527, (long) i_12_);
			}
		}
	}

	public int method17896(int i, int i_13_) {
		if (aClass14_11338 == null)
			return i_13_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_11338.method709((long) i);
		if (null == class527_sub7)
			return i_13_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public String method17897(int i, String string, int i_14_) {
		if (null == aClass14_11338)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_11338.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method17898(int i, int i_15_) {
		if (aClass14_11338 == null)
			return i_15_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_11338.method709((long) i);
		if (null == class527_sub7)
			return i_15_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public String method17899(int i, String string) {
		if (null == aClass14_11338)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_11338.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method16(int i, int i_16_) {
		/* empty */
	}

	static final void method17900(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int[] is = Class606.method10056(string, class665, 423711131);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2594 = Class103.method1800(string, class665, (byte) -26);
		class243.anIntArray2672 = is;
		class243.aBool2606 = true;
	}
}
