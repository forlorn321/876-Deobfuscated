/* Class147_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class147_Sub1 extends Class147 {
	Class430[] aClass430Array8885;
	public boolean aBool8886 = false;
	static final int anInt8887 = 1;
	public long aLong8888 = 2474920690575609125L;
	Set aSet8889;
	long aLong8890;
	int anInt8891;
	boolean aBool8892 = false;
	Class452[] aClass452Array8893;

	public void method8402() {
		for (int i = 0; i < aClass452Array8893.length; i++) {
			if (Class452.aClass452_4952 == aClass452Array8893[i] || Class452.aClass452_4951 == aClass452Array8893[i])
				anInterface3_1696.method20(i, (byte) 33);
		}
		aSet8889.clear();
		aBool8892 = false;
		aClass430Array8885 = null;
		aLong8890 = -994975065257756411L;
	}

	public void method113(Class153 class153, int i) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 1926706264) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, -1674738024);
	}

	public Class147_Sub1(Class98_Sub1 class98_sub1) {
		super(class98_sub1);
		aLong8890 = -994975065257756411L;
		anInt8891 = 0;
		aClass452Array8893 = new Class452[class98_sub1.method71(2059284591)];
		for (int i = 0; i < class98_sub1.method71(1659736808); i++)
			aClass452Array8893[i] = (((Class153) class98_sub1.method70(i, (byte) 26)).aClass452_1714);
		aSet8889 = new HashSet(class98_sub1.method71(1708816657));
	}

	public void method105(Class153 class153, Object object, int i) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_0_ = method104(class153, (byte) -12);
			if (null != object && object_0_ != null && !object.equals(object_0_)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
			} else if ((null == object) != (object_0_ == null)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(class153.anInt1715 * -1786401803));
			}
		}
		super.method105(class153, object, 2058203912);
	}

	public void method8403(int i) {
		for (int i_1_ = 0; i_1_ < aClass452Array8893.length; i_1_++) {
			if (Class452.aClass452_4952 == aClass452Array8893[i_1_] || Class452.aClass452_4951 == aClass452Array8893[i_1_])
				anInterface3_1696.method20(i_1_, (byte) -115);
		}
		aSet8889.clear();
		aBool8892 = false;
		aClass430Array8885 = null;
		aLong8890 = -994975065257756411L;
	}

	public void method8404(int i) {
		anInt8891 = 0;
	}

	public void method8405(byte i) {
		if (Class249.method3450(1541955309) >= 3012850396452869171L * aLong8890) {
			if (aClass430Array8885 == null) {
				if (!aBool8892)
					return;
				aClass430Array8885 = new Class430[aSet8889.size()];
				int i_2_ = 0;
				Iterator iterator = aSet8889.iterator();
				while (iterator.hasNext()) {
					int i_3_ = ((Integer) iterator.next()).intValue();
					aClass430Array8885[i_2_++] = new Class430(i_3_, anInterface3_1696.method17(i_3_, 2143244921));
				}
				anInt8891 = 0;
				aBool8892 = false;
				aSet8889.clear();
			}
			if (aClass430Array8885 != null && 502015031 * anInt8891 < aClass430Array8885.length) {
				Class106 class106 = Class536_Sub41.method9871(2077853800);
				if (class106.anInt1268 * -1444616881 <= 1200) {
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4448, class106.aClass15_1258, 2053123061);
					class536_sub23.stream.writeShort(0, -1778059594);
					int i_4_ = (class536_sub23.stream.off * -810172525);
					class536_sub23.stream.off += 516175515;
					for (/**/; 502015031 * anInt8891 < aClass430Array8885.length; anInt8891 += -463941241) {
						Class430 class430 = aClass430Array8885[anInt8891 * 502015031];
						if ((class106.anInt1268 * -1444616881 + -810172525 * (class536_sub23.stream.off) + Class309.aClass98_Sub1_Sub2_3465.method8387(class430, 1458132238)) > 1500)
							break;
						Class309.aClass98_Sub1_Sub2_3465.method8389(class536_sub23.stream, class430, -1999353601);
					}
					class536_sub23.stream.method9698((-810172525 * (class536_sub23.stream.off) - i_4_), 1839774223);
					if (anInt8891 * 502015031 >= aClass430Array8885.length)
						class536_sub23.stream.buffer[i_4_] = (byte) 1;
					else
						class536_sub23.stream.buffer[i_4_] = (byte) 0;
					class106.writePacket(class536_sub23, 261190615);
					aLong8890 = ((Class249.method3450(2086320951) + 1000L) * 994975065257756411L);
				}
			}
		}
	}

	public void method8406(byte i) {
		if (null != aClass430Array8885 && anInt8891 * 502015031 >= aClass430Array8885.length) {
			aClass430Array8885 = null;
			anInt8891 = 0;
		}
	}

	public void method109(Class153 class153, int i) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 1686582995) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, -1764006404);
	}

	public void method119(Class153 class153, long l) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((Class452.aClass452_4951 == aClass452Array8893[class153.anInt1715 * -1786401803]) && method102(class153, -1376937557) != l) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method119(class153, l);
	}

	public void method101(Class153 class153, int i, int i_5_) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 1935423456) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, -1279566005);
	}

	public void method112(Class153 class153, int i) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 1660616027) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, 1878772770);
	}

	public void method115(Class153 class153, int i) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 2018743055) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, -1701488394);
	}

	public void method110(Class153 class153, long l) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((Class452.aClass452_4951 == aClass452Array8893[class153.anInt1715 * -1786401803]) && method102(class153, -1654863475) != l) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method119(class153, l);
	}

	public void method103(Class153 class153, Object object) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_6_ = method104(class153, (byte) -98);
			if (null != object && object_6_ != null && !object.equals(object_6_)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
			} else if ((null == object) != (object_6_ == null)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(class153.anInt1715 * -1786401803));
			}
		}
		super.method105(class153, object, 2010359628);
	}

	public void method100(Class153 class153, Object object) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_7_ = method104(class153, (byte) 4);
			if (null != object && object_7_ != null && !object.equals(object_7_)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
			} else if ((null == object) != (object_7_ == null)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(class153.anInt1715 * -1786401803));
			}
		}
		super.method105(class153, object, 2102529043);
	}

	public void method120(Class153 class153, Object object) {
		if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4950)
			aBool8886 = true;
		else if (aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_8_ = method104(class153, (byte) -57);
			if (null != object && object_8_ != null && !object.equals(object_8_)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
			} else if ((null == object) != (object_8_ == null)) {
				aBool8892 = true;
				aSet8889.add(Integer.valueOf(class153.anInt1715 * -1786401803));
			}
		}
		super.method105(class153, object, 2126319213);
	}

	public void method8407(Class6 class6, byte i) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class6.method586(917143623)];
					int i_9_;
					for (int i_10_ = 0; i_10_ < is.length; i_10_ += i_9_) {
						i_9_ = class6.method587(is, i_10_, is.length - i_10_, 647906199);
						if (-1 == i_9_)
							throw new EOFException();
					}
					RSByteBuffer class536_sub33 = new RSByteBuffer(is);
					if ((class536_sub33.buffer.length - -810172525 * class536_sub33.off) < 1) {
						try {
							class6.method585(-1411037171);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_11_ = class536_sub33.readUnsignedByte();
					if (i_11_ < 0 || i_11_ > 1) {
						try {
							class6.method585(-1411037171);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class536_sub33.buffer.length - -810172525 * class536_sub33.off) < 2) {
						try {
							class6.method585(-1411037171);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_12_ = class536_sub33.readUnsignedShort();
					if ((class536_sub33.buffer.length - -810172525 * class536_sub33.off) < i_12_ * 6) {
						try {
							class6.method585(-1411037171);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
						Class430 class430 = Class309.aClass98_Sub1_Sub2_3465.method8388(class536_sub33, 1954397572);
						if ((aClass452Array8893[706703961 * class430.anInt4820] == Class452.aClass452_4950) && (((Class153) (Class309.aClass98_Sub1_Sub2_3465.method70(class430.anInt4820 * 706703961, (byte) 40))).aClass453_1716.method5437(65280).aClass5390.isAssignableFrom(class430.anObject4819.getClass())))
							anInterface3_1696.method18((706703961 * class430.anInt4820), class430.anObject4819, (byte) -33);
					}
				} catch (Exception exception) {
					try {
						class6.method585(-1411037171);
					} catch (Exception exception_14_) {
						exception = exception_14_;
					}
					break;
				}
				try {
					class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method8408() {
		anInt8891 = 0;
	}

	public void method8409() {
		if (Class249.method3450(1808394801) >= 3012850396452869171L * aLong8890) {
			if (aClass430Array8885 == null) {
				if (!aBool8892)
					return;
				aClass430Array8885 = new Class430[aSet8889.size()];
				int i = 0;
				Iterator iterator = aSet8889.iterator();
				while (iterator.hasNext()) {
					int i_15_ = ((Integer) iterator.next()).intValue();
					aClass430Array8885[i++] = new Class430(i_15_, anInterface3_1696.method17(i_15_, 2104487411));
				}
				anInt8891 = 0;
				aBool8892 = false;
				aSet8889.clear();
			}
			if (aClass430Array8885 != null && 502015031 * anInt8891 < aClass430Array8885.length) {
				Class106 class106 = Class536_Sub41.method9871(2077853800);
				if (class106.anInt1268 * -1444616881 <= 1200) {
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4448, class106.aClass15_1258, 741472446);
					class536_sub23.stream.writeShort(0, -1778059594);
					int i = (class536_sub23.stream.off * -810172525);
					class536_sub23.stream.off += 516175515;
					for (/**/; 502015031 * anInt8891 < aClass430Array8885.length; anInt8891 += -463941241) {
						Class430 class430 = aClass430Array8885[anInt8891 * 502015031];
						if ((class106.anInt1268 * -1444616881 + -810172525 * (class536_sub23.stream.off) + Class309.aClass98_Sub1_Sub2_3465.method8387(class430, 1882520645)) > 1500)
							break;
						Class309.aClass98_Sub1_Sub2_3465.method8389(class536_sub23.stream, class430, -1756620946);
					}
					class536_sub23.stream.method9698((-810172525 * (class536_sub23.stream.off) - i), 1472643822);
					if (anInt8891 * 502015031 >= aClass430Array8885.length)
						class536_sub23.stream.buffer[i] = (byte) 1;
					else
						class536_sub23.stream.buffer[i] = (byte) 0;
					class106.writePacket(class536_sub23, 1609977395);
					aLong8890 = ((Class249.method3450(1934544773) + 1000L) * 994975065257756411L);
				}
			}
		}
	}

	public void method8410() {
		if (null != aClass430Array8885 && anInt8891 * 502015031 >= aClass430Array8885.length) {
			aClass430Array8885 = null;
			anInt8891 = 0;
		}
	}

	public void method8411() {
		anInt8891 = 0;
	}

	public void method111(Class153 class153, int i) {
		if (aClass452Array8893[-1786401803 * class153.anInt1715] == Class452.aClass452_4950)
			aBool8886 = true;
		else if ((aClass452Array8893[class153.anInt1715 * -1786401803] == Class452.aClass452_4951) && method99(class153, 1617900027) != i) {
			aBool8892 = true;
			aSet8889.add(Integer.valueOf(-1786401803 * class153.anInt1715));
		}
		super.method101(class153, i, 969265272);
	}

	public void method8412() {
		if (Class249.method3450(1793789456) >= 3012850396452869171L * aLong8890) {
			if (aClass430Array8885 == null) {
				if (!aBool8892)
					return;
				aClass430Array8885 = new Class430[aSet8889.size()];
				int i = 0;
				Iterator iterator = aSet8889.iterator();
				while (iterator.hasNext()) {
					int i_16_ = ((Integer) iterator.next()).intValue();
					aClass430Array8885[i++] = new Class430(i_16_, anInterface3_1696.method17(i_16_, 2091300495));
				}
				anInt8891 = 0;
				aBool8892 = false;
				aSet8889.clear();
			}
			if (aClass430Array8885 != null && 502015031 * anInt8891 < aClass430Array8885.length) {
				Class106 class106 = Class536_Sub41.method9871(2077853800);
				if (class106.anInt1268 * -1444616881 <= 1200) {
					OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4448, class106.aClass15_1258, 1398539911);
					class536_sub23.stream.writeShort(0, -1778059594);
					int i = (class536_sub23.stream.off * -810172525);
					class536_sub23.stream.off += 516175515;
					for (/**/; 502015031 * anInt8891 < aClass430Array8885.length; anInt8891 += -463941241) {
						Class430 class430 = aClass430Array8885[anInt8891 * 502015031];
						if ((class106.anInt1268 * -1444616881 + -810172525 * (class536_sub23.stream.off) + Class309.aClass98_Sub1_Sub2_3465.method8387(class430, 1946544876)) > 1500)
							break;
						Class309.aClass98_Sub1_Sub2_3465.method8389(class536_sub23.stream, class430, -2018723110);
					}
					class536_sub23.stream.method9698((-810172525 * (class536_sub23.stream.off) - i), 755469099);
					if (anInt8891 * 502015031 >= aClass430Array8885.length)
						class536_sub23.stream.buffer[i] = (byte) 1;
					else
						class536_sub23.stream.buffer[i] = (byte) 0;
					class106.writePacket(class536_sub23, 1234980420);
					aLong8890 = ((Class249.method3450(2038790981) + 1000L) * 994975065257756411L);
				}
			}
		}
	}

	public void method8413(Class6 class6, int i) {
		do {
			try {
				try {
					int i_17_ = 3;
					int i_18_ = 0;
					Iterator iterator = anInterface3_1696.iterator();
					while (iterator.hasNext()) {
						Class430 class430 = (Class430) iterator.next();
						if (Class452.aClass452_4950 == (aClass452Array8893[class430.anInt4820 * 706703961])) {
							i_17_ += Class309.aClass98_Sub1_Sub2_3465.method8387(class430, 1484908228);
							i_18_++;
						}
					}
					RSByteBuffer class536_sub33 = new RSByteBuffer(i_17_);
					class536_sub33.writeByte(1);
					class536_sub33.writeShort(i_18_, -1778059594);
					Iterator iterator_19_ = anInterface3_1696.iterator();
					while (iterator_19_.hasNext()) {
						Class430 class430 = (Class430) iterator_19_.next();
						if (Class452.aClass452_4950 == (aClass452Array8893[706703961 * class430.anInt4820]))
							Class309.aClass98_Sub1_Sub2_3465.method8389(class536_sub33, class430, -1578814696);
					}
					class6.method584(class536_sub33.buffer, 0, -810172525 * class536_sub33.off, (byte) 1);
				} catch (Exception exception) {
					try {
						class6.method585(-1411037171);
					} catch (Exception exception_20_) {
						exception = exception_20_;
					}
					break;
				}
				try {
					class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class6.method585(-1411037171);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8888 = Class249.method3450(1533430970) * -2474920690575609125L;
		aBool8886 = false;
	}
}
