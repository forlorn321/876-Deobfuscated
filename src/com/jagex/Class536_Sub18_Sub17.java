/* Class536_Sub18_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub17 extends Class536_Sub18 {
	Class185[] aClass185Array11815;
	static JS5ResourceProvider aClass461_11816;
	int anInt11817;
	static JS5ResourceProvider aClass461_11818;
	byte[][] aByteArrayArray11819;

	public boolean method10791(int i) {
		return aClass185Array11815[i].aBool2120;
	}

	public boolean method10792(int i) {
		if (aClass185Array11815 != null)
			return true;
		if (aByteArrayArray11819 == null) {
			synchronized (aClass461_11818) {
				if (!aClass461_11818.method5560(anInt11817 * -523869477, 1881966459)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass461_11818.method5603(anInt11817 * -523869477, (byte) 17);
				aByteArrayArray11819 = new byte[is.length][];
				for (int i_0_ = 0; i_0_ < is.length; i_0_++)
					aByteArrayArray11819[i_0_] = aClass461_11818.method5556(-523869477 * anInt11817, is[i_0_], (byte) 1);
			}
		}
		boolean bool = true;
		for (int i_1_ = 0; i_1_ < aByteArrayArray11819.length; i_1_++) {
			byte[] is = aByteArrayArray11819[i_1_];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			class536_sub33.off = 516175515;
			int i_2_ = class536_sub33.readUnsignedShort();
			synchronized (aClass461_11816) {
				bool &= aClass461_11816.method5580(i_2_, -964514165);
			}
		}
		if (!bool)
			return false;
		Class708 class708 = new Class708();
		int[] is;
		synchronized (aClass461_11818) {
			int i_3_ = aClass461_11818.method5566(anInt11817 * -523869477, 1283727784);
			aClass185Array11815 = new Class185[i_3_];
			is = aClass461_11818.method5603(anInt11817 * -523869477, (byte) 9);
		}
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
			byte[] is_5_ = aByteArrayArray11819[i_4_];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is_5_);
			class536_sub33.off = 516175515;
			int i_6_ = class536_sub33.readUnsignedShort();
			Class536_Sub17 class536_sub17 = null;
			for (Class536_Sub17 class536_sub17_7_ = (Class536_Sub17) class708.method8308(1867269829); class536_sub17_7_ != null; class536_sub17_7_ = (Class536_Sub17) class708.method8311(1096264029)) {
				if (i_6_ == -510633581 * class536_sub17_7_.anInt10493) {
					class536_sub17 = class536_sub17_7_;
					break;
				}
			}
			if (class536_sub17 == null) {
				synchronized (aClass461_11816) {
					class536_sub17 = new Class536_Sub17(i_6_, (aClass461_11816.method5595(i_6_, -1349042006)));
				}
				class708.method8335(class536_sub17, -539366939);
			}
			aClass185Array11815[is[i_4_]] = new Class185(is_5_, class536_sub17);
		}
		aByteArrayArray11819 = null;
		return true;
	}

	public boolean method10793(int i, int i_8_) {
		return aClass185Array11815[i].aBool2120;
	}

	public boolean method10794(int i, int i_9_) {
		return aClass185Array11815[i].aBool2121;
	}

	public boolean method10795(int i, int i_10_) {
		return aClass185Array11815[i].aBool2122;
	}

	public boolean method10796(int i) {
		return aClass185Array11815[i].aBool2122;
	}

	public boolean method10797() {
		if (aClass185Array11815 != null)
			return true;
		if (aByteArrayArray11819 == null) {
			synchronized (aClass461_11818) {
				if (!aClass461_11818.method5560(anInt11817 * -523869477, 289272521)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass461_11818.method5603(anInt11817 * -523869477, (byte) 40);
				aByteArrayArray11819 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					aByteArrayArray11819[i] = aClass461_11818.method5556(-523869477 * anInt11817, is[i], (byte) 1);
			}
		}
		boolean bool = true;
		for (int i = 0; i < aByteArrayArray11819.length; i++) {
			byte[] is = aByteArrayArray11819[i];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			class536_sub33.off = 516175515;
			int i_11_ = class536_sub33.readUnsignedShort();
			synchronized (aClass461_11816) {
				bool &= aClass461_11816.method5580(i_11_, -964514165);
			}
		}
		if (!bool)
			return false;
		Class708 class708 = new Class708();
		int[] is;
		synchronized (aClass461_11818) {
			int i = aClass461_11818.method5566(anInt11817 * -523869477, 1872169769);
			aClass185Array11815 = new Class185[i];
			is = aClass461_11818.method5603(anInt11817 * -523869477, (byte) 119);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_12_ = aByteArrayArray11819[i];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is_12_);
			class536_sub33.off = 516175515;
			int i_13_ = class536_sub33.readUnsignedShort();
			Class536_Sub17 class536_sub17 = null;
			for (Class536_Sub17 class536_sub17_14_ = (Class536_Sub17) class708.method8308(1867269829); class536_sub17_14_ != null; class536_sub17_14_ = (Class536_Sub17) class708.method8311(947704946)) {
				if (i_13_ == -510633581 * class536_sub17_14_.anInt10493) {
					class536_sub17 = class536_sub17_14_;
					break;
				}
			}
			if (class536_sub17 == null) {
				synchronized (aClass461_11816) {
					class536_sub17 = new Class536_Sub17(i_13_, (aClass461_11816.method5595(i_13_, -885998955)));
				}
				class708.method8335(class536_sub17, -418988926);
			}
			aClass185Array11815[is[i]] = new Class185(is_12_, class536_sub17);
		}
		aByteArrayArray11819 = null;
		return true;
	}

	public Class536_Sub18_Sub17(int i) {
		anInt11817 = 1764804947 * i;
	}

	public boolean method10798(int i) {
		return aClass185Array11815[i].aBool2121;
	}

	public boolean method10799(int i) {
		return aClass185Array11815[i].aBool2120;
	}

	public boolean method10800(int i) {
		return aClass185Array11815[i].aBool2120;
	}

	public boolean method10801(int i) {
		return aClass185Array11815[i].aBool2122;
	}

	public boolean method10802(int i) {
		return aClass185Array11815[i].aBool2121;
	}
}
