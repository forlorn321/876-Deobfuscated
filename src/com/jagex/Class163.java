/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163 {
	static final int anInt1758 = 0;
	static final int anInt1759 = 1;
	static final int anInt1760 = 2;
	public boolean aBool1761 = false;
	public static final int anInt1762 = 9;
	static final int anInt1763 = 512;
	public byte aByte1764;
	static final int anInt1765 = 16;
	static final int anInt1766 = 16;
	static final int anInt1767 = 32;
	static final int anInt1768 = 2;
	static final int anInt1769 = 128;
	static final int anInt1770 = 256;
	public static final int anInt1771 = 6;
	public static final byte aByte1772 = 0;
	public byte aByte1773;
	static final int anInt1774 = 1;
	public byte aByte1775;
	public int anInt1776;
	static final int anInt1777 = 4;
	boolean aBool1778 = false;
	public boolean aBool1779 = false;
	public int anInt1780;
	public byte aByte1781 = 0;
	public boolean aBool1782;
	public static final byte aByte1783 = 1;
	public Class595 aClass595_1784;
	static final int anInt1785 = 1;
	public byte aByte1786;
	public byte aByte1787;
	public static final int anInt1788 = 0;
	public static final int anInt1789 = 1;
	public static final int anInt1790 = 2;
	static final int anInt1791 = 2;
	public static final int anInt1792 = 4;
	public static final int anInt1793 = 5;
	public static final int anInt1794 = 3;
	public static final int anInt1795 = 7;
	public static final int anInt1796 = 8;
	public byte aByte1797 = 0;
	public static final int anInt1798 = 11;
	public static final int anInt1799 = 13;
	public static final int anInt1800 = 16;
	public byte aByte1801;
	public byte aByte1802;
	public boolean aBool1803 = false;
	public byte aByte1804;
	public int anInt1805;
	public boolean aBool1806;
	static final int anInt1807 = 3;
	public byte aByte1808;
	static final int anInt1809 = 64;
	public short aShort1810;

	void method2648(int i, RSByteBuffer class527_sub38, int i_0_) {
		anInt1776 = -1672830531 * i;
		class527_sub38.readUnsignedByte();
		int i_1_ = class527_sub38.readUnsignedByte();
		if (0 == i_1_)
			anInt1780 = -1924743232;
		else if (i_1_ == 1)
			anInt1780 = 445480832;
		else if (i_1_ == 2)
			anInt1780 = 890961664;
		else if (3 == i_1_)
			anInt1780 = 1781923328;
		else if (i_1_ == 4)
			anInt1780 = -731120640;
		int i_2_ = class527_sub38.readInt();
		aBool1761 = (i_2_ & 0x1) != 0;
		aBool1778 = (i_2_ & 0x2) != 0;
		aBool1779 = (i_2_ & 0x10) != 0;
		int i_3_ = (byte) class527_sub38.readUnsignedByte();
		aByte1786 = (byte) (i_3_ & 0x7);
		aByte1787 = (byte) (i_3_ >> 3 & 0x7);
		int i_4_ = class527_sub38.readInt();
		if (0 != (i_4_ & 0x10)) {
			class527_sub38.readFloat(-211849339);
			class527_sub38.readFloat(-1651593582);
		}
		if (aBool1778)
			class527_sub38.readFloat(-629702484);
		if ((i_4_ & 0x20) != 0)
			class527_sub38.readInt();
		if ((i_4_ & 0x40) != 0)
			class527_sub38.readInt();
		if ((i_4_ & 0x80) != 0)
			class527_sub38.readInt();
		if (0 != (i_4_ & 0x100))
			class527_sub38.readInt();
		if (0 != (i_4_ & 0x200))
			class527_sub38.readInt();
		aBool1803 = class527_sub38.readUnsignedByte() == 1;
		Class26.method858(Class209.method3868(-108760338), class527_sub38.readUnsignedByte(), -2138842044);
		Class26.method858(Class59.method1372(-2143197734), class527_sub38.readUnsignedByte(), -461073237);
		aClass595_1784 = ((Class595) Class26.method858(Class278.method5164((byte) -24), class527_sub38.readUnsignedByte(), 1832899217));
		if (Class595.aClass595_7815 == aClass595_1784)
			aByte1764 = (byte) class527_sub38.readUnsignedByte();
		int i_5_ = class527_sub38.readUnsignedByte();
		if (0 != (i_5_ & 0x1))
			aByte1781 = (byte) class527_sub38.readUnsignedByte();
		if (0 != (i_5_ & 0x2))
			aByte1797 = (byte) class527_sub38.readUnsignedByte();
		if (class527_sub38.readUnsignedByte() == 1) {
			aByte1801 = (byte) class527_sub38.readUnsignedByte();
			aByte1775 = (byte) class527_sub38.readUnsignedByte();
			anInt1805 = class527_sub38.readInt() * 1274810545;
			aByte1773 = (byte) class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedByte();
			aByte1804 = (byte) class527_sub38.readUnsignedByte();
			aBool1782 = class527_sub38.readUnsignedByte() == 1;
			aBool1806 = class527_sub38.readUnsignedByte() == 1;
			aByte1802 = (byte) class527_sub38.readUnsignedByte();
			aByte1808 = (byte) class527_sub38.readUnsignedByte();
			aShort1810 = (short) class527_sub38.readUnsignedShort();
		}
	}

	Class163() {
		aClass595_1784 = Class595.aClass595_7816;
		aByte1764 = (byte) -1;
		aByte1786 = (byte) 0;
		aByte1787 = (byte) 0;
		aByte1801 = (byte) 0;
		aByte1775 = (byte) 0;
		anInt1805 = 0;
		aByte1804 = (byte) 0;
		aBool1782 = false;
		aBool1806 = false;
		aByte1802 = (byte) 0;
		aByte1808 = (byte) -1;
		aByte1773 = (byte) 0;
		aShort1810 = (short) 0;
	}

	public static boolean method2649(int i) {
		return i != 1 && i != 7;
	}

	static final void method2650(Class665 class665, byte i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_6_, 926304154);
		Class240 class240 = Class183.aClass240Array2100[i_6_ >> 16];
		Class279.method5176(class243, class240, class665, (byte) 45);
	}

	static final void method2651(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method709((long) i_7_);
		if (class527_sub41 != null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
