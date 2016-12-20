/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class610 implements Iterable {
	Class619[] aClass619Array7999;
	Class626[] aClass626Array8000;
	public static int anInt8001;

	public int method10091() {
		return aClass626Array8000.length;
	}

	void method10092(byte i) {
		aClass626Array8000 = null;
	}

	void method10093(byte[] is, int i) {
		method10092((byte) 34);
		if (null == is)
			aClass626Array8000 = new Class626[0];
		else
			method10109(new RSByteBuffer(is), (byte) 7);
	}

	public Class626 method10094(int i) {
		return aClass626Array8000[i];
	}

	public int method10095(int i) {
		return aClass626Array8000.length;
	}

	public Class626 method10096(int i, byte i_0_) {
		return aClass626Array8000[i];
	}

	public Iterator iterator() {
		return new Class620(aClass626Array8000);
	}

	void method10097(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (1 == i) {
				int i_1_ = class527_sub38.readUnsignedByte();
				int i_2_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
					int i_4_ = class527_sub38.readUnsignedByte();
					int i_5_ = class527_sub38.readUnsignedShort();
					int i_6_ = class527_sub38.readUnsignedByte();
					int i_7_ = 0;
					Class619 class619 = Class619.aClass619_8113;
					byte i_8_ = 1;
					boolean bool = 0 != (i_6_ & 0x1);
					if (0 != (i_6_ & 0x2))
						i_7_ = class527_sub38.readUnsignedByte();
					if ((i_6_ & 0x4) != 0)
						class619 = (aClass619Array7999[class527_sub38.readUnsignedByte()]);
					if ((i_6_ & 0x8) != 0)
						i_8_ = class527_sub38.readByte();
					boolean bool_9_ = class527_sub38.readUnsignedByte() == 1;
					linkedlist.add(new Class626(i_4_, i_5_, bool, bool_9_, i_7_, class619, i_8_));
					if (i_4_ > i_2_)
						i_2_ = i_4_;
				}
				aClass626Array8000 = new Class626[i_2_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class626 class626 = (Class626) iterator.next();
					aClass626Array8000[class626.method10354((byte) -80)] = class626;
				}
			} else if (i == 2) {
				aClass619Array7999 = new Class619[class527_sub38.readUnsignedByte()];
				for (int i_10_ = class527_sub38.readUnsignedByte(); 255 != i_10_; i_10_ = class527_sub38.readUnsignedByte()) {
					int[] is = new int[class527_sub38.readUnsignedShort()];
					for (int i_11_ = 0; i_11_ < is.length; i_11_++)
						is[i_11_] = class527_sub38.readInt();
					aClass619Array7999[i_10_] = new Class619(is);
				}
			}
		}
	}

	void method10098(byte[] is) {
		method10092((byte) 119);
		if (null == is)
			aClass626Array8000 = new Class626[0];
		else
			method10109(new RSByteBuffer(is), (byte) -44);
	}

	void method10099(byte[] is) {
		method10092((byte) 2);
		if (null == is)
			aClass626Array8000 = new Class626[0];
		else
			method10109(new RSByteBuffer(is), (byte) -23);
	}

	void method10100(byte[] is) {
		method10092((byte) 59);
		if (null == is)
			aClass626Array8000 = new Class626[0];
		else
			method10109(new RSByteBuffer(is), (byte) 74);
	}

	public Iterator method10101() {
		return new Class620(aClass626Array8000);
	}

	public int method10102() {
		return aClass626Array8000.length;
	}

	public Class610(Class459 class459) {
		method10093(class459.method7512((Class632.aClass632_8260.anInt8258 * 1088756673), 1447980132), -1115013190);
	}

	public int method10103() {
		return aClass626Array8000.length;
	}

	public int method10104() {
		return aClass626Array8000.length;
	}

	public Class626 method10105(int i) {
		return aClass626Array8000[i];
	}

	void method10106(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (1 == i) {
				int i_12_ = class527_sub38.readUnsignedByte();
				int i_13_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
					int i_15_ = class527_sub38.readUnsignedByte();
					int i_16_ = class527_sub38.readUnsignedShort();
					int i_17_ = class527_sub38.readUnsignedByte();
					int i_18_ = 0;
					Class619 class619 = Class619.aClass619_8113;
					byte i_19_ = 1;
					boolean bool = 0 != (i_17_ & 0x1);
					if (0 != (i_17_ & 0x2))
						i_18_ = class527_sub38.readUnsignedByte();
					if ((i_17_ & 0x4) != 0)
						class619 = (aClass619Array7999[class527_sub38.readUnsignedByte()]);
					if ((i_17_ & 0x8) != 0)
						i_19_ = class527_sub38.readByte();
					boolean bool_20_ = class527_sub38.readUnsignedByte() == 1;
					linkedlist.add(new Class626(i_15_, i_16_, bool, bool_20_, i_18_, class619, i_19_));
					if (i_15_ > i_13_)
						i_13_ = i_15_;
				}
				aClass626Array8000 = new Class626[i_13_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class626 class626 = (Class626) iterator.next();
					aClass626Array8000[class626.method10354((byte) -11)] = class626;
				}
			} else if (i == 2) {
				aClass619Array7999 = new Class619[class527_sub38.readUnsignedByte()];
				for (int i_21_ = class527_sub38.readUnsignedByte(); 255 != i_21_; i_21_ = class527_sub38.readUnsignedByte()) {
					int[] is = new int[class527_sub38.readUnsignedShort()];
					for (int i_22_ = 0; i_22_ < is.length; i_22_++)
						is[i_22_] = class527_sub38.readInt();
					aClass619Array7999[i_21_] = new Class619(is);
				}
			}
		}
	}

	public Class626 method10107(int i) {
		return aClass626Array8000[i];
	}

	void method10108(byte[] is) {
		method10092((byte) 44);
		if (null == is)
			aClass626Array8000 = new Class626[0];
		else
			method10109(new RSByteBuffer(is), (byte) -9);
	}

	void method10109(RSByteBuffer class527_sub38, byte i) {
		for (;;) {
			int i_23_ = class527_sub38.readUnsignedByte();
			if (i_23_ == 0)
				break;
			if (1 == i_23_) {
				int i_24_ = class527_sub38.readUnsignedByte();
				int i_25_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
					int i_27_ = class527_sub38.readUnsignedByte();
					int i_28_ = class527_sub38.readUnsignedShort();
					int i_29_ = class527_sub38.readUnsignedByte();
					int i_30_ = 0;
					Class619 class619 = Class619.aClass619_8113;
					byte i_31_ = 1;
					boolean bool = 0 != (i_29_ & 0x1);
					if (0 != (i_29_ & 0x2))
						i_30_ = class527_sub38.readUnsignedByte();
					if ((i_29_ & 0x4) != 0)
						class619 = (aClass619Array7999[class527_sub38.readUnsignedByte()]);
					if ((i_29_ & 0x8) != 0)
						i_31_ = class527_sub38.readByte();
					boolean bool_32_ = class527_sub38.readUnsignedByte() == 1;
					linkedlist.add(new Class626(i_27_, i_28_, bool, bool_32_, i_30_, class619, i_31_));
					if (i_27_ > i_25_)
						i_25_ = i_27_;
				}
				aClass626Array8000 = new Class626[i_25_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class626 class626 = (Class626) iterator.next();
					aClass626Array8000[class626.method10354((byte) -67)] = class626;
				}
			} else if (i_23_ == 2) {
				aClass619Array7999 = new Class619[class527_sub38.readUnsignedByte()];
				for (int i_33_ = class527_sub38.readUnsignedByte(); 255 != i_33_; i_33_ = class527_sub38.readUnsignedByte()) {
					int[] is = new int[class527_sub38.readUnsignedShort()];
					for (int i_34_ = 0; i_34_ < is.length; i_34_++)
						is[i_34_] = class527_sub38.readInt();
					aClass619Array7999[i_33_] = new Class619(is);
				}
			}
		}
	}

	public Class626 method10110(int i) {
		return aClass626Array8000[i];
	}

	static final void method10111(Class665 class665, int i) {
		Class296.method5505(-1762393114);
	}

	static final void method10112(Class665 class665, int i) {
		int i_35_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (-405609043 * client.anInt11083 == 2 && i_35_ >= 0 && i_35_ < -67152419 * client.anInt11261)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1936909903 * client.aClass69Array11297[i_35_].anInt777;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	public static void method10113(int i, int i_36_, int i_37_, Class602 class602, int i_38_) {
		for (Class527_Sub28 class527_sub28 = (Class527_Sub28) Class527_Sub28.aClass694_10526.method14081((short) -25134); null != class527_sub28; class527_sub28 = (Class527_Sub28) Class527_Sub28.aClass694_10526.method14086(-65534)) {
			if (i == -33423191 * class527_sub28.anInt10529 && class527_sub28.anInt10530 * 104834359 == i_36_ << 9 && class527_sub28.anInt10540 * -287718667 == i_37_ << 9 && (class602.anInt7873 * -320331677 == (class527_sub28.aClass602_10539.anInt7873 * -320331677))) {
				if (null != class527_sub28.aClass483_10551) {
					class527_sub28.aClass483_10551.method7864(100, (byte) 6);
					Class245.aClass226_2698.method4215(class527_sub28.aClass483_10551, (byte) -1);
					class527_sub28.aClass483_10551 = null;
				}
				class527_sub28.method8735(-1889161967);
				break;
			}
		}
	}

	public static final void method10114(String string, boolean bool, short i) {
		int i_39_ = client.aBool11127 ? 400 : 100;
		if (null != string) {
			if (182205737 * client.anInt11299 >= i_39_)
				Class236.method4363(4, (client.aBool11127 ? Class53.aClass53_538.method1290((Class144_Sub1.aClass671_8995), (byte) -28) : Class53.aClass53_635.method1290((Class144_Sub1.aClass671_8995), (byte) -42)), -1101497630);
			else {
				String string_40_ = Class641.method10704(string, Class242.aClass91_2471, -2095739793);
				if (null != string_40_) {
					for (int i_41_ = 0; i_41_ < client.anInt11299 * 182205737; i_41_++) {
						Class72 class72 = client.aClass72Array11301[i_41_];
						String string_42_ = Class641.method10704(class72.aString785, Class242.aClass91_2471, -2110904168);
						if (null != string_42_ && string_42_.equals(string_40_)) {
							Class236.method4363(4, new StringBuilder().append(string).append(Class53.aClass53_677.method1290((Class144_Sub1.aClass671_8995), (byte) -126)).toString(), -666126515);
							return;
						}
						if (class72.aString786 != null) {
							String string_43_ = Class641.method10704(class72.aString786, Class242.aClass91_2471, -2112869785);
							if (null != string_43_ && string_43_.equals(string_40_)) {
								Class236.method4363(4, new StringBuilder().append(string).append(Class53.aClass53_677.method1290((Class144_Sub1.aClass671_8995), (byte) -59)).toString(), -1371829576);
								return;
							}
						}
					}
					for (int i_44_ = 0; i_44_ < client.anInt11261 * -67152419; i_44_++) {
						Class69 class69 = client.aClass69Array11297[i_44_];
						String string_45_ = Class641.method10704(class69.aString776, Class242.aClass91_2471, -2112724543);
						if (string_45_ != null && string_45_.equals(string_40_)) {
							Class236.method4363(4, new StringBuilder().append(Class53.aClass53_676.method1290(Class144_Sub1.aClass671_8995, (byte) -11)).append(string).append(Class53.aClass53_589.method1290(Class144_Sub1.aClass671_8995, (byte) -33)).toString(), -897984816);
							return;
						}
						if (null != class69.aString779) {
							String string_46_ = Class641.method10704(class69.aString779, Class242.aClass91_2471, -2124362100);
							if (string_46_ != null && string_46_.equals(string_40_)) {
								Class236.method4363(4, new StringBuilder().append(Class53.aClass53_676.method1290(Class144_Sub1.aClass671_8995, (byte) -117)).append(string).append(Class53.aClass53_589.method1290(Class144_Sub1.aClass671_8995, (byte) -71)).toString(), -859295954);
								return;
							}
						}
					}
					if (Class641.method10704((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179), Class242.aClass91_2471, -2098344422).equals(string_40_))
						Class236.method4363(4, (Class53.aClass53_679.method1290(Class144_Sub1.aClass671_8995, (byte) -51)), -1147122788);
					else {
						Class109 class109 = Class203.method3782((byte) -1);
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4464, class109.aClass2_1367, (byte) -81);
						class527_sub15.buffer.writeByte((Class208_Sub18.method15632(string, (byte) -67) + 1), 1239787318);
						class527_sub15.buffer.writeString(string, 2092938244);
						class527_sub15.buffer.writeByte(bool ? 1 : 0, -1583154367);
						class109.method1969(class527_sub15, (byte) 1);
					}
				}
			}
		}
	}
}
