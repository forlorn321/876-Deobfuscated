/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class33 {
	static String aString324 = "true";
	public static String aString325 = ",";
	static String aString326;
	static String aString327;
	static String aString328 = " (";
	public static String aString329;
	static String aString330;

	public static String method945(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static {
		aString327 = ")";
		aString326 = "->";
		aString329 = "<br>";
		aString330 = "</col>";
	}

	public static String method946(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	Class33() throws Throwable {
		throw new Error();
	}

	public static String method947(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	public static String method948(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	public static String method949(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public static String method950(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static final void method951(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (0 != client.anInt11075 * 962135673 || ((!client.aBool11180 || client.aBool11169) && !client.aBool11172)) {
			String string_0_ = string.toLowerCase();
			int i_1_ = 0;
			if (string_0_.startsWith(Class53.aClass53_533.method1290(Class671.aClass671_8572, (byte) -90))) {
				i_1_ = 0;
				string = string.substring(Class53.aClass53_533.method1290(Class671.aClass671_8572, (byte) -81).length());
			} else if (string_0_.startsWith(Class53.aClass53_686.method1290(Class671.aClass671_8572, (byte) -26))) {
				i_1_ = 1;
				string = string.substring(Class53.aClass53_686.method1290(Class671.aClass671_8572, (byte) -65).length());
			} else if (string_0_.startsWith(Class53.aClass53_687.method1290(Class671.aClass671_8572, (byte) -87))) {
				i_1_ = 2;
				string = string.substring(Class53.aClass53_687.method1290(Class671.aClass671_8572, (byte) -22).length());
			} else if (string_0_.startsWith(Class53.aClass53_672.method1290(Class671.aClass671_8572, (byte) -37))) {
				i_1_ = 3;
				string = string.substring(Class53.aClass53_672.method1290(Class671.aClass671_8572, (byte) -4).length());
			} else if (string_0_.startsWith(Class53.aClass53_689.method1290(Class671.aClass671_8572, (byte) -47))) {
				i_1_ = 4;
				string = string.substring(Class53.aClass53_689.method1290(Class671.aClass671_8572, (byte) -117).length());
			} else if (string_0_.startsWith(Class53.aClass53_690.method1290(Class671.aClass671_8572, (byte) -54))) {
				i_1_ = 5;
				string = string.substring(Class53.aClass53_690.method1290(Class671.aClass671_8572, (byte) -35).length());
			} else if (string_0_.startsWith(Class53.aClass53_691.method1290(Class671.aClass671_8572, (byte) -22))) {
				i_1_ = 6;
				string = string.substring(Class53.aClass53_691.method1290(Class671.aClass671_8572, (byte) -72).length());
			} else if (string_0_.startsWith(Class53.aClass53_692.method1290(Class671.aClass671_8572, (byte) -5))) {
				i_1_ = 7;
				string = string.substring(Class53.aClass53_692.method1290(Class671.aClass671_8572, (byte) -20).length());
			} else if (string_0_.startsWith(Class53.aClass53_693.method1290(Class671.aClass671_8572, (byte) -29))) {
				i_1_ = 8;
				string = string.substring(Class53.aClass53_693.method1290(Class671.aClass671_8572, (byte) -58).length());
			} else if (string_0_.startsWith(Class53.aClass53_694.method1290(Class671.aClass671_8572, (byte) -125))) {
				i_1_ = 9;
				string = string.substring(Class53.aClass53_694.method1290(Class671.aClass671_8572, (byte) -15).length());
			} else if (string_0_.startsWith(Class53.aClass53_532.method1290(Class671.aClass671_8572, (byte) -57))) {
				i_1_ = 10;
				string = string.substring(Class53.aClass53_532.method1290(Class671.aClass671_8572, (byte) -3).length());
			} else if (string_0_.startsWith(Class53.aClass53_696.method1290(Class671.aClass671_8572, (byte) -95))) {
				i_1_ = 11;
				string = string.substring(Class53.aClass53_696.method1290(Class671.aClass671_8572, (byte) -5).length());
			} else if (Class671.aClass671_8572 != Class144_Sub1.aClass671_8995) {
				if (string_0_.startsWith(Class53.aClass53_533.method1290(Class144_Sub1.aClass671_8995, (byte) -44))) {
					i_1_ = 0;
					string = string.substring(Class53.aClass53_533.method1290(Class144_Sub1.aClass671_8995, (byte) -36).length());
				} else if (string_0_.startsWith(Class53.aClass53_686.method1290(Class144_Sub1.aClass671_8995, (byte) -19))) {
					i_1_ = 1;
					string = string.substring(Class53.aClass53_686.method1290(Class144_Sub1.aClass671_8995, (byte) -121).length());
				} else if (string_0_.startsWith(Class53.aClass53_687.method1290(Class144_Sub1.aClass671_8995, (byte) -71))) {
					i_1_ = 2;
					string = string.substring(Class53.aClass53_687.method1290(Class144_Sub1.aClass671_8995, (byte) -126).length());
				} else if (string_0_.startsWith(Class53.aClass53_672.method1290(Class144_Sub1.aClass671_8995, (byte) -113))) {
					i_1_ = 3;
					string = string.substring(Class53.aClass53_672.method1290(Class144_Sub1.aClass671_8995, (byte) -15).length());
				} else if (string_0_.startsWith(Class53.aClass53_689.method1290(Class144_Sub1.aClass671_8995, (byte) -54))) {
					i_1_ = 4;
					string = string.substring(Class53.aClass53_689.method1290(Class144_Sub1.aClass671_8995, (byte) -68).length());
				} else if (string_0_.startsWith(Class53.aClass53_690.method1290(Class144_Sub1.aClass671_8995, (byte) -6))) {
					i_1_ = 5;
					string = string.substring(Class53.aClass53_690.method1290(Class144_Sub1.aClass671_8995, (byte) -49).length());
				} else if (string_0_.startsWith(Class53.aClass53_691.method1290(Class144_Sub1.aClass671_8995, (byte) -103))) {
					i_1_ = 6;
					string = string.substring(Class53.aClass53_691.method1290(Class144_Sub1.aClass671_8995, (byte) -93).length());
				} else if (string_0_.startsWith(Class53.aClass53_692.method1290(Class144_Sub1.aClass671_8995, (byte) -6))) {
					i_1_ = 7;
					string = string.substring(Class53.aClass53_692.method1290(Class144_Sub1.aClass671_8995, (byte) -82).length());
				} else if (string_0_.startsWith(Class53.aClass53_693.method1290(Class144_Sub1.aClass671_8995, (byte) -18))) {
					i_1_ = 8;
					string = string.substring(Class53.aClass53_693.method1290(Class144_Sub1.aClass671_8995, (byte) -110).length());
				} else if (string_0_.startsWith(Class53.aClass53_694.method1290(Class144_Sub1.aClass671_8995, (byte) -73))) {
					i_1_ = 9;
					string = string.substring(Class53.aClass53_694.method1290(Class144_Sub1.aClass671_8995, (byte) -8).length());
				} else if (string_0_.startsWith(Class53.aClass53_532.method1290(Class144_Sub1.aClass671_8995, (byte) -88))) {
					i_1_ = 10;
					string = string.substring(Class53.aClass53_532.method1290(Class144_Sub1.aClass671_8995, (byte) -30).length());
				} else if (string_0_.startsWith(Class53.aClass53_696.method1290(Class144_Sub1.aClass671_8995, (byte) -76))) {
					i_1_ = 11;
					string = string.substring(Class53.aClass53_696.method1290(Class144_Sub1.aClass671_8995, (byte) -85).length());
				}
			}
			string_0_ = string.toLowerCase();
			int i_2_ = 0;
			if (string_0_.startsWith(Class53.aClass53_697.method1290(Class671.aClass671_8572, (byte) -121))) {
				i_2_ = 1;
				string = string.substring(Class53.aClass53_697.method1290(Class671.aClass671_8572, (byte) -27).length());
			} else if (string_0_.startsWith(Class53.aClass53_656.method1290(Class671.aClass671_8572, (byte) -110))) {
				i_2_ = 2;
				string = string.substring(Class53.aClass53_656.method1290(Class671.aClass671_8572, (byte) -31).length());
			} else if (string_0_.startsWith(Class53.aClass53_699.method1290(Class671.aClass671_8572, (byte) -44))) {
				i_2_ = 3;
				string = string.substring(Class53.aClass53_699.method1290(Class671.aClass671_8572, (byte) -54).length());
			} else if (string_0_.startsWith(Class53.aClass53_700.method1290(Class671.aClass671_8572, (byte) -122))) {
				i_2_ = 4;
				string = string.substring(Class53.aClass53_700.method1290(Class671.aClass671_8572, (byte) -127).length());
			} else if (string_0_.startsWith(Class53.aClass53_701.method1290(Class671.aClass671_8572, (byte) -53))) {
				i_2_ = 5;
				string = string.substring(Class53.aClass53_701.method1290(Class671.aClass671_8572, (byte) -18).length());
			} else if (Class671.aClass671_8572 != Class144_Sub1.aClass671_8995) {
				if (string_0_.startsWith(Class53.aClass53_697.method1290(Class144_Sub1.aClass671_8995, (byte) -53))) {
					i_2_ = 1;
					string = string.substring(Class53.aClass53_697.method1290(Class144_Sub1.aClass671_8995, (byte) -83).length());
				} else if (string_0_.startsWith(Class53.aClass53_656.method1290(Class144_Sub1.aClass671_8995, (byte) -29))) {
					i_2_ = 2;
					string = string.substring(Class53.aClass53_656.method1290(Class144_Sub1.aClass671_8995, (byte) -38).length());
				} else if (string_0_.startsWith(Class53.aClass53_699.method1290(Class144_Sub1.aClass671_8995, (byte) -48))) {
					i_2_ = 3;
					string = string.substring(Class53.aClass53_699.method1290(Class144_Sub1.aClass671_8995, (byte) -101).length());
				} else if (string_0_.startsWith(Class53.aClass53_700.method1290(Class144_Sub1.aClass671_8995, (byte) -111))) {
					i_2_ = 4;
					string = string.substring(Class53.aClass53_700.method1290(Class144_Sub1.aClass671_8995, (byte) -80).length());
				} else if (string_0_.startsWith(Class53.aClass53_701.method1290(Class144_Sub1.aClass671_8995, (byte) -116))) {
					i_2_ = 5;
					string = string.substring(Class53.aClass53_701.method1290(Class144_Sub1.aClass671_8995, (byte) -24).length());
				}
			}
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4444, class109.aClass2_1367, (byte) 18);
			class527_sub15.buffer.writeByte(0, 105239675);
			int i_3_ = (class527_sub15.buffer.anInt10689 * -441238943);
			class527_sub15.buffer.writeByte(i_1_, -995095833);
			class527_sub15.buffer.writeByte(i_2_, 1415533675);
			Class542.method9027(class527_sub15.buffer, string, 9501261);
			class527_sub15.buffer.method16534(-441238943 * (class527_sub15.buffer.anInt10689) - i_3_, 169434384);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}
}
