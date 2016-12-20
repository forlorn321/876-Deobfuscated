/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class45 {
	LinkedHashMap aLinkedHashMap463 = new LinkedHashMap();
	static final int anInt464 = 10;
	static final int anInt465 = 1;

	int method1195(long l) {
		return ((Integer) aLinkedHashMap463.get(Long.valueOf(l))).intValue();
	}

	Class45(RSByteBuffer class527_sub38) {
		if (class527_sub38 != null && class527_sub38.buffer != null) {
			int i = class527_sub38.readUnsignedByte();
			if (i > 0 && i <= 1) {
				int i_0_ = class527_sub38.readUnsignedByte();
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					long l = class527_sub38.method16612((byte) 1);
					int i_2_ = class527_sub38.readInt();
					aLinkedHashMap463.put(Long.valueOf(l), Integer.valueOf(i_2_));
				}
			}
		}
	}

	void method1196(RSByteBuffer class527_sub38, byte i) {
		class527_sub38.writeByte(1, -2022661486);
		class527_sub38.writeByte(aLinkedHashMap463.size(), -1211363829);
		Iterator iterator = aLinkedHashMap463.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class527_sub38.writeLong(((Long) entry.getKey()).longValue());
			class527_sub38.writeInt(((Integer) entry.getValue()).intValue(), 1990334683);
		}
	}

	void method1197(long l, int i, int i_3_) {
		if (aLinkedHashMap463.size() >= 10 && !aLinkedHashMap463.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap463.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap463.put(Long.valueOf(l), Integer.valueOf(i));
		method1204(2089306688);
	}

	boolean method1198(long l) {
		return aLinkedHashMap463.containsKey(Long.valueOf(l));
	}

	public static Class45 method1199() {
		Class19 class19 = null;
		try {
			Class45 class45;
			try {
				class19 = Class32.method944("3", client.aClass678_11259.aString8616, false, (byte) 97);
				byte[] is = new byte[(int) class19.method752(1991815575)];
				int i;
				for (int i_4_ = 0; i_4_ < is.length; i_4_ += i) {
					i = class19.method753(is, i_4_, is.length - i_4_, (byte) 12);
					if (i == -1)
						throw new EOFException();
				}
				class45 = new Class45(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class45 class45_5_ = new Class45();
				try {
					if (class19 != null)
						class19.method751((byte) 47);
				} catch (Exception exception_6_) {
					/* empty */
				}
				return class45_5_;
			}
			try {
				if (class19 != null)
					class19.method751((byte) 74);
			} catch (Exception exception) {
				/* empty */
			}
			return class45;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method751((byte) 47);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	Class45() {
		this(null);
	}

	void method1200(long l, int i) {
		if (aLinkedHashMap463.size() >= 10 && !aLinkedHashMap463.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap463.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap463.put(Long.valueOf(l), Integer.valueOf(i));
		method1204(-1007954647);
	}

	void method1201(long l, int i) {
		if (aLinkedHashMap463.size() >= 10 && !aLinkedHashMap463.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap463.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap463.put(Long.valueOf(l), Integer.valueOf(i));
		method1204(-597227556);
	}

	void method1202() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class32.method944("3", client.aClass678_11259.aString8616, true, (byte) 97);
					RSByteBuffer class527_sub38 = new RSByteBuffer(5000);
					method1196(class527_sub38, (byte) -66);
					class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 104);
				} catch (Exception exception) {
					try {
						if (null != class19)
							class19.method751((byte) 97);
					} catch (Exception exception_7_) {
						exception = exception_7_;
					}
					break;
				}
				try {
					if (null != class19)
						class19.method751((byte) 49);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class19)
						class19.method751((byte) -7);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	int method1203(long l) {
		return ((Integer) aLinkedHashMap463.get(Long.valueOf(l))).intValue();
	}

	void method1204(int i) {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class32.method944("3", client.aClass678_11259.aString8616, true, (byte) 97);
					RSByteBuffer class527_sub38 = new RSByteBuffer(5000);
					method1196(class527_sub38, (byte) -95);
					class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 69);
				} catch (Exception exception) {
					try {
						if (null != class19)
							class19.method751((byte) -38);
					} catch (Exception exception_8_) {
						exception = exception_8_;
					}
					break;
				}
				try {
					if (null != class19)
						class19.method751((byte) 41);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class19)
						class19.method751((byte) 9);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public static Class45 method1205() {
		Class19 class19 = null;
		try {
			Class45 class45;
			try {
				class19 = Class32.method944("3", client.aClass678_11259.aString8616, false, (byte) 97);
				byte[] is = new byte[(int) class19.method752(1900165120)];
				int i;
				for (int i_9_ = 0; i_9_ < is.length; i_9_ += i) {
					i = class19.method753(is, i_9_, is.length - i_9_, (byte) 12);
					if (i == -1)
						throw new EOFException();
				}
				class45 = new Class45(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class45 class45_10_ = new Class45();
				try {
					if (class19 != null)
						class19.method751((byte) 41);
				} catch (Exception exception_11_) {
					/* empty */
				}
				return class45_10_;
			}
			try {
				if (class19 != null)
					class19.method751((byte) -34);
			} catch (Exception exception) {
				/* empty */
			}
			return class45;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method751((byte) -59);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	public static Class45 method1206() {
		Class19 class19 = null;
		try {
			Class45 class45;
			try {
				class19 = Class32.method944("3", client.aClass678_11259.aString8616, false, (byte) 97);
				byte[] is = new byte[(int) class19.method752(1836228876)];
				int i;
				for (int i_12_ = 0; i_12_ < is.length; i_12_ += i) {
					i = class19.method753(is, i_12_, is.length - i_12_, (byte) 12);
					if (i == -1)
						throw new EOFException();
				}
				class45 = new Class45(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class45 class45_13_ = new Class45();
				try {
					if (class19 != null)
						class19.method751((byte) 59);
				} catch (Exception exception_14_) {
					/* empty */
				}
				return class45_13_;
			}
			try {
				if (class19 != null)
					class19.method751((byte) 13);
			} catch (Exception exception) {
				/* empty */
			}
			return class45;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method751((byte) -31);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	void method1207(long l, int i) {
		if (aLinkedHashMap463.size() >= 10 && !aLinkedHashMap463.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap463.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap463.put(Long.valueOf(l), Integer.valueOf(i));
		method1204(-391956879);
	}

	public static Class45 method1208() {
		Class19 class19 = null;
		try {
			Class45 class45;
			try {
				class19 = Class32.method944("3", client.aClass678_11259.aString8616, false, (byte) 97);
				byte[] is = new byte[(int) class19.method752(1778428301)];
				int i;
				for (int i_15_ = 0; i_15_ < is.length; i_15_ += i) {
					i = class19.method753(is, i_15_, is.length - i_15_, (byte) 12);
					if (i == -1)
						throw new EOFException();
				}
				class45 = new Class45(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class45 class45_16_ = new Class45();
				try {
					if (class19 != null)
						class19.method751((byte) -67);
				} catch (Exception exception_17_) {
					/* empty */
				}
				return class45_16_;
			}
			try {
				if (class19 != null)
					class19.method751((byte) 72);
			} catch (Exception exception) {
				/* empty */
			}
			return class45;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method751((byte) 33);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	boolean method1209(long l) {
		return aLinkedHashMap463.containsKey(Long.valueOf(l));
	}

	void method1210() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class32.method944("3", client.aClass678_11259.aString8616, true, (byte) 97);
					RSByteBuffer class527_sub38 = new RSByteBuffer(5000);
					method1196(class527_sub38, (byte) -7);
					class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 24);
				} catch (Exception exception) {
					try {
						if (null != class19)
							class19.method751((byte) -41);
					} catch (Exception exception_18_) {
						exception = exception_18_;
					}
					break;
				}
				try {
					if (null != class19)
						class19.method751((byte) -26);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (null != class19)
						class19.method751((byte) 25);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	static Class315[] method1211(int i) {
		return (new Class315[] { Class315.aClass315_3516, Class315.aClass315_3518, Class315.aClass315_3510, Class315.aClass315_3508, Class315.aClass315_3522, Class315.aClass315_3509, Class315.aClass315_3520, Class315.aClass315_3521, Class315.aClass315_3519, Class315.aClass315_3511, Class315.aClass315_3517, Class315.aClass315_3513, Class315.aClass315_3514, Class315.aClass315_3512, Class315.aClass315_3524 });
	}

	public static float method1212(Class438 class438, byte i) {
		Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
		class442.method7157(class438);
		double d = Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
		class442.method7141();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (float) d;
	}

	static final void method1213(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static final void method1214(int i, boolean bool, int i_19_) {
		if (Class627.aClass527_Sub21_8187 != null && (i >= 0 && i < (-1988380647 * Class627.aClass527_Sub21_8187.anInt10486))) {
			Class345 class345 = Class627.aClass527_Sub21_8187.aClass345Array10485[i];
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4504, class109.aClass2_1367, (byte) -26);
			class527_sub15.buffer.writeByte(3 + Class208_Sub18.method15632(class345.aString3697, (byte) -68), -1499539657);
			class527_sub15.buffer.writeShort(i, 1404835786);
			class527_sub15.buffer.writeByte(bool ? 1 : 0, 1022204520);
			class527_sub15.buffer.writeString(class345.aString3697, 1841930148);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}

	static boolean method1215(int i) {
		return Class510.method8443(Class271.aClass624_3128.aClass586_8150, -288803015);
	}

	static final void method1216(Class243 class243, Class665 class665, int i) {
		int i_20_ = 10;
		Class460.method7574(class243, i_20_, class665, 1340880522);
	}

	public static void method1217(Class180 class180, long l) {
		Class628.anInt8196 = 73691117 * Class628.anInt8195;
		Class628.anInt8195 = 0;
		Class234.method4347(-1408626088);
		Iterator iterator = Class628.aList8199.iterator();
		while (iterator.hasNext()) {
			Class613 class613 = (Class613) iterator.next();
			boolean bool = class613.method10131(class180, l);
			if (!bool) {
				iterator.remove();
				Class628.aClass613Array8192[Class628.anInt8202 * 976297105] = class613;
				Class628.anInt8202 = (976297105 * Class628.anInt8202 + 1 & (Class166.anIntArray1835[Class628.anInt8201 * 367556557])) * 40772721;
			}
		}
	}

	static void method1218(Class527_Sub8_Sub4 class527_sub8_sub4, int i) {
		boolean bool = false;
		class527_sub8_sub4.method16057((byte) -29);
		for (Class527_Sub8_Sub4 class527_sub8_sub4_21_ = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14072(-688321635)); null != class527_sub8_sub4_21_; class527_sub8_sub4_21_ = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14059(704486500))) {
			if (Class66.method1468(class527_sub8_sub4.method18165(1641160236), class527_sub8_sub4_21_.method18165(-1724581408), 2138252879)) {
				Class370.method6361(class527_sub8_sub4, class527_sub8_sub4_21_, 307145981);
				bool = true;
				break;
			}
		}
		if (!bool)
			Class35.aClass693_350.method14055(class527_sub8_sub4, 1088402470);
	}
}
