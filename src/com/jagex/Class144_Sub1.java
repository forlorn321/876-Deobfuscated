/* Class144_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class144_Sub1 extends Class144 {
	boolean aBool8986;
	public boolean aBool8987 = false;
	public long aLong8988 = 4662328196985849519L;
	int anInt8989;
	Set aSet8990;
	long aLong8991;
	Class425[] aClass425Array8992;
	static final int anInt8993 = 1;
	Class467[] aClass467Array8994;
	public static Class671 aClass671_8995;

	public void method14497(Class19 class19, int i) {
		do {
			try {
				try {
					int i_0_ = 3;
					int i_1_ = 0;
					Iterator iterator = anInterface3_1670.iterator();
					while (iterator.hasNext()) {
						Class425 class425 = (Class425) iterator.next();
						if (aClass467Array8994[class425.anInt4803 * 494563151] == Class467.aClass467_5315) {
							i_0_ += Class112.aClass95_Sub1_Sub2_1406.method14485(class425, (byte) -29);
							i_1_++;
						}
					}
					RSByteBuffer class527_sub38 = new RSByteBuffer(i_0_);
					class527_sub38.writeByte(1, -726607875);
					class527_sub38.writeShort(i_1_, 1404835786);
					Iterator iterator_2_ = anInterface3_1670.iterator();
					while (iterator_2_.hasNext()) {
						Class425 class425 = (Class425) iterator_2_.next();
						if (aClass467Array8994[494563151 * class425.anInt4803] == Class467.aClass467_5315)
							Class112.aClass95_Sub1_Sub2_1406.method14482(class527_sub38, class425, -867491001);
					}
					class19.method760(class527_sub38.buffer, 0, -441238943 * class527_sub38.anInt10689, (byte) 79);
				} catch (Exception exception) {
					try {
						class19.method751((byte) -94);
					} catch (Exception exception_3_) {
						exception = exception_3_;
					}
					break;
				}
				try {
					class19.method751((byte) -92);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method751((byte) 1);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8988 = Class234.method4347(-1408626088) * -4662328196985849519L;
		aBool8987 = false;
	}

	public void method14498(Class19 class19) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method752(1963394299)];
					int i;
					for (int i_4_ = 0; i_4_ < is.length; i_4_ += i) {
						i = class19.method753(is, i_4_, is.length - i_4_, (byte) 12);
						if (i == -1)
							throw new EOFException();
					}
					RSByteBuffer class527_sub38 = new RSByteBuffer(is);
					if ((class527_sub38.buffer.length - class527_sub38.anInt10689 * -441238943) < 1) {
						try {
							class19.method751((byte) -13);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_5_ = class527_sub38.readUnsignedByte();
					if (i_5_ < 0 || i_5_ > 1) {
						try {
							class19.method751((byte) -15);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class527_sub38.buffer.length - -441238943 * class527_sub38.anInt10689) < 2) {
						try {
							class19.method751((byte) -25);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_6_ = class527_sub38.readUnsignedShort();
					if ((class527_sub38.buffer.length - class527_sub38.anInt10689 * -441238943) < 6 * i_6_) {
						try {
							class19.method751((byte) -44);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
						Class425 class425 = Class112.aClass95_Sub1_Sub2_1406.method14483(class527_sub38, 641569005);
						if ((aClass467Array8994[494563151 * class425.anInt4803] == Class467.aClass467_5315) && (((Class160) (Class112.aClass95_Sub1_Sub2_1406.method81(class425.anInt4803 * 494563151, 1484674127))).aClass462_1748.method7606(-904534704).aClass5381.isAssignableFrom(class425.anObject4804.getClass())))
							anInterface3_1670.method18((494563151 * class425.anInt4803), class425.anObject4804, -1281480154);
					}
				} catch (Exception exception) {
					try {
						class19.method751((byte) 91);
					} catch (Exception exception_8_) {
						exception = exception_8_;
					}
					break;
				}
				try {
					class19.method751((byte) -33);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method751((byte) 42);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method110(Class160 class160, long l) {
		if (aClass467Array8994[class160.anInt1746 * 727971013] == Class467.aClass467_5315)
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method113(class160, (byte) 35) != l) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(class160.anInt1746 * 727971013));
		}
		super.method110(class160, l);
	}

	public void method111(Class160 class160, Object object, int i) {
		if (Class467.aClass467_5315 == aClass467Array8994[class160.anInt1746 * 727971013])
			aBool8987 = true;
		else if (Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_9_ = method106(class160, 221099667);
			if (object != null && object_9_ != null && !object.equals(object_9_)) {
				aBool8986 = true;
				aSet8990.add(Integer.valueOf(class160.anInt1746 * 727971013));
			} else if ((object_9_ == null) != (object == null)) {
				aBool8986 = true;
				aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
			}
		}
		super.method111(class160, object, 1243534649);
	}

	public Class144_Sub1(Class95_Sub1 class95_sub1) {
		super(class95_sub1);
		aBool8986 = false;
		aLong8991 = -6271537080379376471L;
		anInt8989 = 0;
		aClass467Array8994 = new Class467[class95_sub1.method77(-970017828)];
		for (int i = 0; i < class95_sub1.method77(1917942500); i++)
			aClass467Array8994[i] = (((Class160) class95_sub1.method81(i, 2020020188)).aClass467_1747);
		aSet8990 = new HashSet(class95_sub1.method77(154363803));
	}

	public void method14499() {
		anInt8989 = 0;
	}

	public void method14500(Class19 class19, int i) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method752(1842459199)];
					int i_10_;
					for (int i_11_ = 0; i_11_ < is.length; i_11_ += i_10_) {
						i_10_ = class19.method753(is, i_11_, is.length - i_11_, (byte) 12);
						if (i_10_ == -1)
							throw new EOFException();
					}
					RSByteBuffer class527_sub38 = new RSByteBuffer(is);
					if ((class527_sub38.buffer.length - class527_sub38.anInt10689 * -441238943) < 1) {
						try {
							class19.method751((byte) -40);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_12_ = class527_sub38.readUnsignedByte();
					if (i_12_ < 0 || i_12_ > 1) {
						try {
							class19.method751((byte) 7);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class527_sub38.buffer.length - -441238943 * class527_sub38.anInt10689) < 2) {
						try {
							class19.method751((byte) -100);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_13_ = class527_sub38.readUnsignedShort();
					if ((class527_sub38.buffer.length - class527_sub38.anInt10689 * -441238943) < 6 * i_13_) {
						try {
							class19.method751((byte) 16);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
						Class425 class425 = Class112.aClass95_Sub1_Sub2_1406.method14483(class527_sub38, 444085526);
						if ((aClass467Array8994[494563151 * class425.anInt4803] == Class467.aClass467_5315) && (((Class160) (Class112.aClass95_Sub1_Sub2_1406.method81(class425.anInt4803 * 494563151, -1047073708))).aClass462_1748.method7606(-662169338).aClass5381.isAssignableFrom(class425.anObject4804.getClass())))
							anInterface3_1670.method18((494563151 * class425.anInt4803), class425.anObject4804, 296588434);
					}
				} catch (Exception exception) {
					try {
						class19.method751((byte) 60);
					} catch (Exception exception_15_) {
						exception = exception_15_;
					}
					break;
				}
				try {
					class19.method751((byte) -3);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method751((byte) 54);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method121(Class160 class160, int i) {
		if (Class467.aClass467_5315 == aClass467Array8994[727971013 * class160.anInt1746])
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method101(class160, 1096407173) != i) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
		}
		super.method105(class160, i, (byte) -101);
	}

	public void method14501(int i) {
		if (Class234.method4347(-1408626088) >= 1349884198990747751L * aLong8991) {
			if (null == aClass425Array8992) {
				if (!aBool8986)
					return;
				aClass425Array8992 = new Class425[aSet8990.size()];
				int i_16_ = 0;
				Iterator iterator = aSet8990.iterator();
				while (iterator.hasNext()) {
					int i_17_ = ((Integer) iterator.next()).intValue();
					aClass425Array8992[i_16_++] = new Class425(i_17_, anInterface3_1670.method31(i_17_, 1213482050));
				}
				anInt8989 = 0;
				aBool8986 = false;
				aSet8990.clear();
			}
			if (null != aClass425Array8992 && -1570943787 * anInt8989 < aClass425Array8992.length) {
				Class109 class109 = Class203.method3782((byte) -1);
				if (class109.anInt1363 * 1083275433 <= 1200) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4414, class109.aClass2_1367, (byte) 50);
					class527_sub15.buffer.writeShort(0, 1404835786);
					int i_18_ = (-441238943 * (class527_sub15.buffer.anInt10689));
					class527_sub15.buffer.anInt10689 += 1474750881;
					for (/**/; -1570943787 * anInt8989 < aClass425Array8992.length; anInt8989 += -1153856387) {
						Class425 class425 = aClass425Array8992[anInt8989 * -1570943787];
						if ((-441238943 * (class527_sub15.buffer.anInt10689) + 1083275433 * class109.anInt1363 + Class112.aClass95_Sub1_Sub2_1406.method14485(class425, (byte) 12)) > 1500)
							break;
						Class112.aClass95_Sub1_Sub2_1406.method14482(class527_sub15.buffer, class425, -1918074360);
					}
					class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i_18_, -18705907);
					if (anInt8989 * -1570943787 >= aClass425Array8992.length)
						class527_sub15.buffer.buffer[i_18_] = (byte) 1;
					else
						class527_sub15.buffer.buffer[i_18_] = (byte) 0;
					class109.method1969(class527_sub15, (byte) 1);
					aLong8991 = ((Class234.method4347(-1408626088) + 1000L) * 6271537080379376471L);
				}
			}
		}
	}

	public void method14502(byte i) {
		if (aClass425Array8992 != null && -1570943787 * anInt8989 >= aClass425Array8992.length) {
			aClass425Array8992 = null;
			anInt8989 = 0;
		}
	}

	public void method114(Class160 class160, long l) {
		if (aClass467Array8994[class160.anInt1746 * 727971013] == Class467.aClass467_5315)
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method113(class160, (byte) 103) != l) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(class160.anInt1746 * 727971013));
		}
		super.method110(class160, l);
	}

	public void method118(Class160 class160, Object object) {
		if (Class467.aClass467_5315 == aClass467Array8994[class160.anInt1746 * 727971013])
			aBool8987 = true;
		else if (Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_19_ = method106(class160, 221099667);
			if (object != null && object_19_ != null && !object.equals(object_19_)) {
				aBool8986 = true;
				aSet8990.add(Integer.valueOf(class160.anInt1746 * 727971013));
			} else if ((object_19_ == null) != (object == null)) {
				aBool8986 = true;
				aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
			}
		}
		super.method111(class160, object, 1935331926);
	}

	public void method107(Class160 class160, int i) {
		if (Class467.aClass467_5315 == aClass467Array8994[727971013 * class160.anInt1746])
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method101(class160, 1096407173) != i) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
		}
		super.method105(class160, i, (byte) 35);
	}

	public void method14503(int i) {
		anInt8989 = 0;
	}

	public void method122(Class160 class160, int i) {
		if (Class467.aClass467_5315 == aClass467Array8994[727971013 * class160.anInt1746])
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method101(class160, 1096407173) != i) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
		}
		super.method105(class160, i, (byte) -71);
	}

	public void method14504(int i) {
		for (int i_20_ = 0; i_20_ < aClass467Array8994.length; i_20_++) {
			if (Class467.aClass467_5316 == aClass467Array8994[i_20_] || Class467.aClass467_5317 == aClass467Array8994[i_20_])
				anInterface3_1670.method16(i_20_, -292702795);
		}
		aSet8990.clear();
		aBool8986 = false;
		aClass425Array8992 = null;
		aLong8991 = -6271537080379376471L;
	}

	public void method14505() {
		for (int i = 0; i < aClass467Array8994.length; i++) {
			if (Class467.aClass467_5316 == aClass467Array8994[i] || Class467.aClass467_5317 == aClass467Array8994[i])
				anInterface3_1670.method16(i, -1492182247);
		}
		aSet8990.clear();
		aBool8986 = false;
		aClass425Array8992 = null;
		aLong8991 = -6271537080379376471L;
	}

	public void method14506() {
		for (int i = 0; i < aClass467Array8994.length; i++) {
			if (Class467.aClass467_5316 == aClass467Array8994[i] || Class467.aClass467_5317 == aClass467Array8994[i])
				anInterface3_1670.method16(i, 622116387);
		}
		aSet8990.clear();
		aBool8986 = false;
		aClass425Array8992 = null;
		aLong8991 = -6271537080379376471L;
	}

	public void method14507() {
		anInt8989 = 0;
	}

	public void method14508(Class19 class19) {
		do {
			try {
				try {
					int i = 3;
					int i_21_ = 0;
					Iterator iterator = anInterface3_1670.iterator();
					while (iterator.hasNext()) {
						Class425 class425 = (Class425) iterator.next();
						if (aClass467Array8994[class425.anInt4803 * 494563151] == Class467.aClass467_5315) {
							i += Class112.aClass95_Sub1_Sub2_1406.method14485(class425, (byte) -2);
							i_21_++;
						}
					}
					RSByteBuffer class527_sub38 = new RSByteBuffer(i);
					class527_sub38.writeByte(1, 2065885275);
					class527_sub38.writeShort(i_21_, 1404835786);
					Iterator iterator_22_ = anInterface3_1670.iterator();
					while (iterator_22_.hasNext()) {
						Class425 class425 = (Class425) iterator_22_.next();
						if (aClass467Array8994[494563151 * class425.anInt4803] == Class467.aClass467_5315)
							Class112.aClass95_Sub1_Sub2_1406.method14482(class527_sub38, class425, 69732977);
					}
					class19.method760(class527_sub38.buffer, 0, -441238943 * class527_sub38.anInt10689, (byte) 29);
				} catch (Exception exception) {
					try {
						class19.method751((byte) -53);
					} catch (Exception exception_23_) {
						exception = exception_23_;
					}
					break;
				}
				try {
					class19.method751((byte) -61);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method751((byte) 24);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8988 = Class234.method4347(-1408626088) * -4662328196985849519L;
		aBool8987 = false;
	}

	public void method105(Class160 class160, int i, byte i_24_) {
		if (Class467.aClass467_5315 == aClass467Array8994[727971013 * class160.anInt1746])
			aBool8987 = true;
		else if ((Class467.aClass467_5317 == aClass467Array8994[class160.anInt1746 * 727971013]) && method101(class160, 1096407173) != i) {
			aBool8986 = true;
			aSet8990.add(Integer.valueOf(727971013 * class160.anInt1746));
		}
		super.method105(class160, i, (byte) 86);
	}

	public void method14509() {
		if (Class234.method4347(-1408626088) >= 1349884198990747751L * aLong8991) {
			if (null == aClass425Array8992) {
				if (!aBool8986)
					return;
				aClass425Array8992 = new Class425[aSet8990.size()];
				int i = 0;
				Iterator iterator = aSet8990.iterator();
				while (iterator.hasNext()) {
					int i_25_ = ((Integer) iterator.next()).intValue();
					aClass425Array8992[i++] = new Class425(i_25_, anInterface3_1670.method31(i_25_, 1322750284));
				}
				anInt8989 = 0;
				aBool8986 = false;
				aSet8990.clear();
			}
			if (null != aClass425Array8992 && -1570943787 * anInt8989 < aClass425Array8992.length) {
				Class109 class109 = Class203.method3782((byte) -1);
				if (class109.anInt1363 * 1083275433 <= 1200) {
					Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4414, class109.aClass2_1367, (byte) -8);
					class527_sub15.buffer.writeShort(0, 1404835786);
					int i = (-441238943 * (class527_sub15.buffer.anInt10689));
					class527_sub15.buffer.anInt10689 += 1474750881;
					for (/**/; -1570943787 * anInt8989 < aClass425Array8992.length; anInt8989 += -1153856387) {
						Class425 class425 = aClass425Array8992[anInt8989 * -1570943787];
						if ((-441238943 * (class527_sub15.buffer.anInt10689) + 1083275433 * class109.anInt1363 + Class112.aClass95_Sub1_Sub2_1406.method14485(class425, (byte) 37)) > 1500)
							break;
						Class112.aClass95_Sub1_Sub2_1406.method14482(class527_sub15.buffer, class425, -973850389);
					}
					class527_sub15.buffer.method16437((class527_sub15.buffer.anInt10689 * -441238943) - i, -18705907);
					if (anInt8989 * -1570943787 >= aClass425Array8992.length)
						class527_sub15.buffer.buffer[i] = (byte) 1;
					else
						class527_sub15.buffer.buffer[i] = (byte) 0;
					class109.method1969(class527_sub15, (byte) 1);
					aLong8991 = ((Class234.method4347(-1408626088) + 1000L) * 6271537080379376471L);
				}
			}
		}
	}

	public void method14510() {
		if (aClass425Array8992 != null && -1570943787 * anInt8989 >= aClass425Array8992.length) {
			aClass425Array8992 = null;
			anInt8989 = 0;
		}
	}

	static final void method14511(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class297.method5507(class243, class240, class665, 1078033799);
	}

	static Class593[] method14512(int i) {
		return (new Class593[] { Class593.aClass593_7802, Class593.aClass593_7801, Class593.aClass593_7800 });
	}

	public static void method14513(int i, byte i_26_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(9, (long) i);
		class527_sub8_sub9.method18186(-1673367815);
	}

	public static Class87 method14514(int i, int i_27_) {
		Class87 class87 = (Class87) client.aClass205_11200.method3787((long) i);
		if (class87 == null) {
			class87 = new Class87(Class388.aClass459_3990, Class691.method14019(i, (byte) -49), Class245.method4627(i, 2122907853));
			client.aClass205_11200.method3790(class87, (long) i);
		}
		return class87;
	}
}
