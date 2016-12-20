/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class160 implements Interface12 {
	public Class465 aClass465_1745;
	public int anInt1746;
	public Class467 aClass467_1747 = Class467.aClass467_5316;
	public Class462 aClass462_1748;
	public boolean aBool1749 = true;

	public Object method2571() {
		return aClass465_1745.method7634(this, 15489101);
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			Class149 class149 = (Class149) Class26.method858(Class240.method4394(78282038), i_0_, 1393794672);
			if (null != class149) {
				switch (733313059 * class149.anInt1680) {
				case 2:
					Class26.method858(Class181.method3548(-499354321), class527_sub38.readUnsignedByte(), -85054405);
					break;
				case 1:
					class527_sub38.readVersionedString(90180177);
					break;
				case 3:
					aBool1749 = false;
					break;
				default:
					throw new IllegalStateException("");
				case 0: {
					int i_1_ = class527_sub38.readUnsignedByte();
					aClass462_1748 = ((Class462) Class26.method858(Class462.method7610(-1951792586), i_1_, -1214874667));
					if (null == aClass462_1748)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					aClass467_1747 = ((Class467) Class26.method858(Class541.method9018((byte) -46), class527_sub38.readUnsignedByte(), -1007082763));
					break;
				case 5:
					/* empty */
				}
			} else
				method2572(class527_sub38, i_0_, (short) 8192);
		}
	}

	abstract void method2572(RSByteBuffer class527_sub38, int i, short i_2_);

	boolean method2573(int i) {
		if (null == aClass465_1745 || null == aClass462_1748)
			return false;
		return true;
	}

	Class160(Class465 class465, int i) {
		aClass465_1745 = class465;
		anInt1746 = 762800653 * i;
	}

	public Object method2574() {
		return aClass465_1745.method7634(this, -1126419807);
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			Class149 class149 = ((Class149) Class26.method858(Class240.method4394(-1730010968), i, 1083886065));
			if (null != class149) {
				switch (733313059 * class149.anInt1680) {
				case 2:
					Class26.method858(Class181.method3548(1074890229), class527_sub38.readUnsignedByte(), 802021933);
					break;
				case 1:
					class527_sub38.readVersionedString(90180177);
					break;
				case 3:
					aBool1749 = false;
					break;
				default:
					throw new IllegalStateException("");
				case 0: {
					int i_3_ = class527_sub38.readUnsignedByte();
					aClass462_1748 = ((Class462) Class26.method858(Class462.method7610(1795315162), i_3_, 191512639));
					if (null == aClass462_1748)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					aClass467_1747 = ((Class467) Class26.method858(Class541.method9018((byte) -21), class527_sub38.readUnsignedByte(), 1588662721));
					break;
				case 5:
					/* empty */
				}
			} else
				method2572(class527_sub38, i, (short) 8192);
		}
	}

	abstract void method2575(RSByteBuffer class527_sub38, int i);

	abstract void method2576(RSByteBuffer class527_sub38, int i);

	public Object method2577(byte i) {
		return aClass465_1745.method7634(this, 1701431710);
	}

	public Object method2578() {
		return aClass465_1745.method7634(this, 1486109045);
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			Class149 class149 = ((Class149) Class26.method858(Class240.method4394(-1051940959), i, -750769861));
			if (null != class149) {
				switch (733313059 * class149.anInt1680) {
				case 2:
					Class26.method858(Class181.method3548(-36592574), class527_sub38.readUnsignedByte(), -2060409544);
					break;
				case 1:
					class527_sub38.readVersionedString(90180177);
					break;
				case 3:
					aBool1749 = false;
					break;
				default:
					throw new IllegalStateException("");
				case 0: {
					int i_4_ = class527_sub38.readUnsignedByte();
					aClass462_1748 = ((Class462) Class26.method858(Class462.method7610(-763997934), i_4_, 1742858289));
					if (null == aClass462_1748)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					aClass467_1747 = ((Class467) Class26.method858(Class541.method9018((byte) -77), class527_sub38.readUnsignedByte(), -1656585173));
					break;
				case 5:
					/* empty */
				}
			} else
				method2572(class527_sub38, i, (short) 8192);
		}
	}

	public Object method2579() {
		return aClass465_1745.method7634(this, 619711542);
	}

	boolean method2580() {
		if (null == aClass465_1745 || null == aClass462_1748)
			return false;
		return true;
	}

	static final void method2581(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 1504923185) != null)
			string = string.substring(0, string.length() - 1);
		Class103.method1800(string, class665, (byte) -16);
	}

	static final void method2582(Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_5_, 1526584745);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 114452147 * class243.anInt2524;
	}

	static final void method2583(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11165 ? 1 : 0;
	}

	static final void method2584(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (null != string)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = string.length();
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method2585(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub37_10589.method17279((byte) 99);
	}
}
