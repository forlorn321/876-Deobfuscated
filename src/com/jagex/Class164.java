/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public class Class164 {
	public static final int anInt1779 = 16;
	static final int anInt1780 = 1;
	static final int anInt1781 = 2;
	static final int anInt1782 = 3;
	static final int anInt1783 = 4;
	static final int anInt1784 = 1;
	static final int anInt1785 = 2;
	static final int anInt1786 = 16;
	public byte aByte1787;
	public static final int anInt1788 = 5;
	static final int anInt1789 = 64;
	static final int anInt1790 = 128;
	static final int anInt1791 = 256;
	static final int anInt1792 = 512;
	public static final byte aByte1793 = 0;
	public static final byte aByte1794 = 1;
	public static final int anInt1795 = 8;
	static final int anInt1796 = 2;
	public byte aByte1797;
	public static final int anInt1798 = 6;
	static final int anInt1799 = 32;
	public boolean aBool1800;
	public int anInt1801;
	public byte aByte1802;
	public byte aByte1803;
	public boolean aBool1804;
	public Class595 aClass595_1805;
	public byte aByte1806;
	public byte aByte1807;
	static final int anInt1808 = 1;
	public static final int anInt1809 = 0;
	public static final int anInt1810 = 1;
	public static final int anInt1811 = 2;
	public static final int anInt1812 = 3;
	boolean aBool1813;
	public boolean aBool1814 = false;
	public int anInt1815;
	public static final int anInt1816 = 4;
	static final int anInt1817 = 16;
	public static final int anInt1818 = 9;
	public static final int anInt1819 = 11;
	public boolean aBool1820;
	public static final int anInt1821 = 13;
	public boolean aBool1822;
	public byte aByte1823;
	public int anInt1824;
	public byte aByte1825;
	static final int anInt1826 = 0;
	public static final int anInt1827 = 7;
	public byte aByte1828;
	public byte aByte1829;
	public byte aByte1830;
	public short aShort1831;

	public static boolean method1969(int i) {
		return 1 != i && i != 7;
	}

	void method1970(int i, RSByteBuffer class536_sub33, short i_0_) {
		anInt1801 = 1290835805 * i;
		class536_sub33.readUnsignedByte();
		int i_1_ = class536_sub33.readUnsignedByte();
		if (i_1_ == 0)
			anInt1815 = -1433755328;
		else if (1 == i_1_)
			anInt1815 = 1427456640;
		else if (i_1_ == 2)
			anInt1815 = -1440054016;
		else if (i_1_ == 3)
			anInt1815 = 1414859264;
		else if (i_1_ == 4)
			anInt1815 = -1465248768;
		int i_2_ = class536_sub33.readInt();
		aBool1814 = 0 != (i_2_ & 0x1);
		aBool1813 = (i_2_ & 0x2) != 0;
		aBool1800 = (i_2_ & 0x10) != 0;
		int i_3_ = (byte) class536_sub33.readUnsignedByte();
		aByte1807 = (byte) (i_3_ & 0x7);
		aByte1787 = (byte) (i_3_ >> 3 & 0x7);
		int i_4_ = class536_sub33.readInt();
		if (0 != (i_4_ & 0x10)) {
			class536_sub33.method9712(71349394);
			class536_sub33.method9712(-2002775574);
		}
		if (aBool1813)
			class536_sub33.method9712(252827172);
		if ((i_4_ & 0x20) != 0)
			class536_sub33.readInt();
		if ((i_4_ & 0x40) != 0)
			class536_sub33.readInt();
		if (0 != (i_4_ & 0x80))
			class536_sub33.readInt();
		if ((i_4_ & 0x100) != 0)
			class536_sub33.readInt();
		if ((i_4_ & 0x200) != 0)
			class536_sub33.readInt();
		aBool1804 = class536_sub33.readUnsignedByte() == 1;
		Class682.method8091(Class109.method1448((byte) 3), class536_sub33.readUnsignedByte(), 1858049507);
		Class682.method8091(Class93.method1237(1364919226), class536_sub33.readUnsignedByte(), 1858049507);
		aClass595_1805 = ((Class595) Class682.method8091(Class467.method5690(-1350402581), class536_sub33.readUnsignedByte(), 1858049507));
		if (Class595.aClass595_7818 == aClass595_1805)
			aByte1806 = (byte) class536_sub33.readUnsignedByte();
		int i_5_ = class536_sub33.readUnsignedByte();
		if (0 != (i_5_ & 0x1))
			aByte1802 = (byte) class536_sub33.readUnsignedByte();
		if (0 != (i_5_ & 0x2))
			aByte1803 = (byte) class536_sub33.readUnsignedByte();
		if (class536_sub33.readUnsignedByte() == 1) {
			aByte1797 = (byte) class536_sub33.readUnsignedByte();
			aByte1823 = (byte) class536_sub33.readUnsignedByte();
			anInt1824 = class536_sub33.readInt() * -735583649;
			aByte1830 = (byte) class536_sub33.readUnsignedByte();
			class536_sub33.readUnsignedByte();
			aByte1825 = (byte) class536_sub33.readUnsignedByte();
			aBool1822 = class536_sub33.readUnsignedByte() == 1;
			aBool1820 = class536_sub33.readUnsignedByte() == 1;
			aByte1828 = (byte) class536_sub33.readUnsignedByte();
			aByte1829 = (byte) class536_sub33.readUnsignedByte();
			aShort1831 = (short) class536_sub33.readUnsignedShort();
		}
	}

	Class164() {
		aBool1813 = false;
		aBool1800 = false;
		aByte1802 = (byte) 0;
		aByte1803 = (byte) 0;
		aBool1804 = false;
		aClass595_1805 = Class595.aClass595_7820;
		aByte1806 = (byte) -1;
		aByte1807 = (byte) 0;
		aByte1787 = (byte) 0;
		aByte1797 = (byte) 0;
		aByte1823 = (byte) 0;
		anInt1824 = 0;
		aByte1825 = (byte) 0;
		aBool1822 = false;
		aBool1820 = false;
		aByte1828 = (byte) 0;
		aByte1829 = (byte) -1;
		aByte1830 = (byte) 0;
		aShort1831 = (short) 0;
	}

	static void method1971(int i) {
		Class333_Sub1 class333_sub1 = (Class333_Sub1) Class37.aClass301_Sub1_302.method4051(826143221);
		Class706_Sub3 class706_sub3 = ((Class706_Sub3) Class37.aClass301_Sub1_302.method4052(-810172525));
		Class436 class436 = class333_sub1.method4343((byte) 64);
		Class425 class425 = class706_sub3.method10288(-1640335717);
		if (null != client.aClass251_11195) {
			int i_6_ = client.aClass251_11195.anInt2573 * -1606950689;
			int i_7_ = client.aClass251_11195.anInt2574 * 223822141;
			float f = 1000.0F;
			float f_8_ = (float) (2.0 * Math.atan((double) ((float) i_6_ / 2.0F / f)));
			float f_9_ = (float) (2.0 * Math.atan((double) ((float) i_7_ / 2.0F / f)));
			try {
				Class37.aClass301_Sub1_302.method4045(f_8_, f_9_, -1606307463);
			} catch (Exception_Sub3 exception_sub3) {
				/* empty */
			}
		}
		if (Class329.aClass550_3601.method6653((byte) 0)) {
			Class425 class425_10_ = Class425.method5081();
			class425_10_.method5090(1.0F, 0.0F, 0.0F, ((float) (Class329.aClass550_3601.method6657(-1348094670) - (1084689517 * Class229.anInt2363)) / 200.0F));
			class425.method5096(class425_10_);
			Class436 class436_11_ = Class436.method5257(0.0F, 1.0F, 0.0F);
			class436_11_.method5263(class425);
			Class425 class425_12_ = Class425.method5081();
			class425_12_.method5115(class436_11_, ((float) (Class37.anInt301 * -1123406637 - Class329.aClass550_3601.method6656(-942467821)) / 200.0F));
			class425.method5096(class425_12_);
			class706_sub3.method10279(class425, 1361075874);
		}
		Class37.anInt301 = Class329.aClass550_3601.method6656(-1940674127) * 1066863451;
		Class229.anInt2363 = Class329.aClass550_3601.method6657(-1765976314) * -1290347163;
		class425.method5091();
		if (Class331_Sub2.aClass549_10049.method6638(98, (byte) 0)) {
			Class436 class436_13_ = Class436.method5257(0.0F, 0.0F, 25.0F);
			class436_13_.method5263(class425);
			class436_13_.aFloat4852 *= -1.0F;
			class436.method5248(class436_13_);
		}
		if (Class331_Sub2.aClass549_10049.method6638(99, (byte) 0)) {
			Class436 class436_14_ = Class436.method5257(0.0F, 0.0F, -25.0F);
			class436_14_.method5263(class425);
			class436_14_.aFloat4852 *= -1.0F;
			class436.method5248(class436_14_);
		}
		if (Class331_Sub2.aClass549_10049.method6638(96, (byte) 0)) {
			Class436 class436_15_ = Class436.method5257(-25.0F, 0.0F, 0.0F);
			class436_15_.method5263(class425);
			class436_15_.aFloat4852 *= -1.0F;
			class436.method5248(class436_15_);
		}
		if (Class331_Sub2.aClass549_10049.method6638(97, (byte) 0)) {
			Class436 class436_16_ = Class436.method5257(25.0F, 0.0F, 0.0F);
			class436_16_.method5263(class425);
			class436_16_.aFloat4852 *= -1.0F;
			class436.method5248(class436_16_);
		}
		Class536_Sub30 class536_sub30 = new Class536_Sub30(0, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
		class333_sub1.method9160(class536_sub30, 86315973);
		Class598 class598 = client.aClass515_11066.method6255(-1907079402);
		int i_17_ = class598.anInt7839 * 1858049507 << 9;
		int i_18_ = class598.anInt7840 * 1479112045 << 9;
		Class37.aClass301_Sub1_302.method4070(0.02F, (client.aClass515_11066.method6292(-660310391).anIntArrayArrayArray5245), client.aClass515_11066.method6251(-1272231309), i_17_, i_18_, 671098297);
	}

	static void method1972(long l) {
		Class81.aCalendar859.setTime(new Date(l));
	}

	static final void method1973(Class668 class668, int i) {
		int i_19_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_19_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_19_ >> 16];
		Class228.method3289(class251, class234, class668, 2095746180);
	}

	public static Class398 method1974(RSByteBuffer class536_sub33, int i) {
		Class398 class398 = Class390.method4854(class536_sub33, (byte) -59);
		int i_20_ = class536_sub33.read24BitInteger((byte) 116);
		return new Class398_Sub1(-269721035 * class398.anInt4120, class398.aClass395_4117, class398.aClass399_4119, class398.anInt4121 * 21495479, class398.anInt4118 * -527690215, i_20_);
	}
}
