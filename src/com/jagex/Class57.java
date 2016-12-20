/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class57 implements Interface14, Interface7 {
	int anInt712;
	HashMap aHashMap713;
	public Class462 aClass462_714;
	int anInt715;
	Map aMap716;
	Object[] anObjectArray717;
	public Class462 aClass462_718;
	String aString719 = "null";
	public static Class24_Sub4 aClass24_Sub4_720;

	public int method1333(int i) {
		Object object = method1352(i, 1358140615);
		if (object == null)
			return anInt715 * 751917657;
		return ((Integer) object).intValue();
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method1334(class527_sub38, i_0_, (short) 128);
		}
	}

	void method1334(RSByteBuffer class527_sub38, int i, short i_1_) {
		if (1 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -105);
			aClass462_714 = Class462.method7607(c, (byte) -73);
		} else if (2 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -53);
			aClass462_718 = Class462.method7607(c, (byte) 55);
		} else if (3 == i)
			aString719 = class527_sub38.readString(1722362497);
		else if (4 == i)
			anInt715 = class527_sub38.readInt() * 1854426601;
		else if (i == 5 || i == 6) {
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			aMap716 = new HashMap(220411113 * anInt712);
			for (int i_2_ = 0; i_2_ < anInt712 * 220411113; i_2_++) {
				int i_3_ = class527_sub38.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class527_sub38.readString(825083873);
				else
					serializable = new Integer(class527_sub38.readInt());
				aMap716.put(new Integer(i_3_), serializable);
			}
		} else if (7 == i || i == 8) {
			int i_4_ = class527_sub38.readUnsignedShort();
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			anObjectArray717 = new Object[i_4_];
			for (int i_5_ = 0; i_5_ < 220411113 * anInt712; i_5_++) {
				int i_6_ = class527_sub38.readUnsignedShort();
				if (7 == i)
					anObjectArray717[i_6_] = class527_sub38.readString(1987084894);
				else
					anObjectArray717[i_6_] = new Integer(class527_sub38.readInt());
			}
		} else if (i == 101)
			aClass462_714 = ((Class462) Class26.method858(Class462.method7610(2116347428), class527_sub38.readUnsignedSmart((byte) -25), 1607473408));
		else if (i == 102)
			aClass462_718 = ((Class462) Class26.method858(Class462.method7610(-1737014035), class527_sub38.readUnsignedSmart((byte) -62), 1816891864));
	}

	public int method1335(int i, byte i_7_) {
		Object object = method1352(i, 312368075);
		if (object == null)
			return anInt715 * 751917657;
		return ((Integer) object).intValue();
	}

	public String method1336(int i, int i_8_) {
		Object object = method1352(i, 117736323);
		if (null == object)
			return aString719;
		return (String) object;
	}

	public boolean method1337(Object object, byte i) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(792320603);
		return aHashMap713.containsKey(object);
	}

	public void method84() {
		/* empty */
	}

	void method1338() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray717) {
			for (int i = 0; i < anObjectArray717.length; i++) {
				if (null != anObjectArray717[i]) {
					Object object = anObjectArray717[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap716) {
			Iterator iterator = aMap716.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap713 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_9_ = list.iterator();
			while (iterator_9_.hasNext()) {
				Integer integer = (Integer) iterator_9_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray717 == null)
				Arrays.sort(is);
			aHashMap713.put(entry.getKey(), is);
		}
	}

	public int method1339(int i) {
		return 220411113 * anInt712;
	}

	void method1340(int i) {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray717) {
			for (int i_10_ = 0; i_10_ < anObjectArray717.length; i_10_++) {
				if (null != anObjectArray717[i_10_]) {
					Object object = anObjectArray717[i_10_];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_10_));
				}
			}
		} else if (null != aMap716) {
			Iterator iterator = aMap716.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap713 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i_11_ = 0;
			Iterator iterator_12_ = list.iterator();
			while (iterator_12_.hasNext()) {
				Integer integer = (Integer) iterator_12_.next();
				is[i_11_++] = integer.intValue();
			}
			if (anObjectArray717 == null)
				Arrays.sort(is);
			aHashMap713.put(entry.getKey(), is);
		}
	}

	public int[] method1341(Object object, byte i) {
		if (220411113 * anInt712 == 0)
			return null;
		if (null == aHashMap713)
			method1340(1811511955);
		return (int[]) aHashMap713.get(object);
	}

	public int[] method1342(Object object) {
		if (220411113 * anInt712 == 0)
			return null;
		if (null == aHashMap713)
			method1340(-786440185);
		return (int[]) aHashMap713.get(object);
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1334(class527_sub38, i, (short) 128);
		}
	}

	public int method1343() {
		return 220411113 * anInt712;
	}

	public void method85() {
		/* empty */
	}

	Class57() {
		anInt712 = 0;
	}

	void method1344(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 38);
			aClass462_714 = Class462.method7607(c, (byte) -49);
		} else if (2 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -84);
			aClass462_718 = Class462.method7607(c, (byte) -25);
		} else if (3 == i)
			aString719 = class527_sub38.readString(1079249861);
		else if (4 == i)
			anInt715 = class527_sub38.readInt() * 1854426601;
		else if (i == 5 || i == 6) {
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			aMap716 = new HashMap(220411113 * anInt712);
			for (int i_13_ = 0; i_13_ < anInt712 * 220411113; i_13_++) {
				int i_14_ = class527_sub38.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class527_sub38.readString(776965378);
				else
					serializable = new Integer(class527_sub38.readInt());
				aMap716.put(new Integer(i_14_), serializable);
			}
		} else if (7 == i || i == 8) {
			int i_15_ = class527_sub38.readUnsignedShort();
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			anObjectArray717 = new Object[i_15_];
			for (int i_16_ = 0; i_16_ < 220411113 * anInt712; i_16_++) {
				int i_17_ = class527_sub38.readUnsignedShort();
				if (7 == i)
					anObjectArray717[i_17_] = class527_sub38.readString(1970122385);
				else
					anObjectArray717[i_17_] = new Integer(class527_sub38.readInt());
			}
		} else if (i == 101)
			aClass462_714 = ((Class462) Class26.method858(Class462.method7610(-1462786137), class527_sub38.readUnsignedSmart((byte) -53), 1631801083));
		else if (i == 102)
			aClass462_718 = ((Class462) Class26.method858(Class462.method7610(1983920981), class527_sub38.readUnsignedSmart((byte) -123), -1671062580));
	}

	void method1345(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -2);
			aClass462_714 = Class462.method7607(c, (byte) -40);
		} else if (2 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 8);
			aClass462_718 = Class462.method7607(c, (byte) 30);
		} else if (3 == i)
			aString719 = class527_sub38.readString(721172192);
		else if (4 == i)
			anInt715 = class527_sub38.readInt() * 1854426601;
		else if (i == 5 || i == 6) {
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			aMap716 = new HashMap(220411113 * anInt712);
			for (int i_18_ = 0; i_18_ < anInt712 * 220411113; i_18_++) {
				int i_19_ = class527_sub38.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class527_sub38.readString(2073762359);
				else
					serializable = new Integer(class527_sub38.readInt());
				aMap716.put(new Integer(i_19_), serializable);
			}
		} else if (7 == i || i == 8) {
			int i_20_ = class527_sub38.readUnsignedShort();
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			anObjectArray717 = new Object[i_20_];
			for (int i_21_ = 0; i_21_ < 220411113 * anInt712; i_21_++) {
				int i_22_ = class527_sub38.readUnsignedShort();
				if (7 == i)
					anObjectArray717[i_22_] = class527_sub38.readString(2027141314);
				else
					anObjectArray717[i_22_] = new Integer(class527_sub38.readInt());
			}
		} else if (i == 101)
			aClass462_714 = ((Class462) Class26.method858(Class462.method7610(-844881612), class527_sub38.readUnsignedSmart((byte) -31), 963160576));
		else if (i == 102)
			aClass462_718 = ((Class462) Class26.method858(Class462.method7610(-1063980469), class527_sub38.readUnsignedSmart((byte) -55), -460649012));
	}

	void method1346(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -1);
			aClass462_714 = Class462.method7607(c, (byte) -1);
		} else if (2 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 0);
			aClass462_718 = Class462.method7607(c, (byte) 35);
		} else if (3 == i)
			aString719 = class527_sub38.readString(1738175432);
		else if (4 == i)
			anInt715 = class527_sub38.readInt() * 1854426601;
		else if (i == 5 || i == 6) {
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			aMap716 = new HashMap(220411113 * anInt712);
			for (int i_23_ = 0; i_23_ < anInt712 * 220411113; i_23_++) {
				int i_24_ = class527_sub38.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class527_sub38.readString(748876436);
				else
					serializable = new Integer(class527_sub38.readInt());
				aMap716.put(new Integer(i_24_), serializable);
			}
		} else if (7 == i || i == 8) {
			int i_25_ = class527_sub38.readUnsignedShort();
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			anObjectArray717 = new Object[i_25_];
			for (int i_26_ = 0; i_26_ < 220411113 * anInt712; i_26_++) {
				int i_27_ = class527_sub38.readUnsignedShort();
				if (7 == i)
					anObjectArray717[i_27_] = class527_sub38.readString(1922113973);
				else
					anObjectArray717[i_27_] = new Integer(class527_sub38.readInt());
			}
		} else if (i == 101)
			aClass462_714 = ((Class462) Class26.method858(Class462.method7610(-567448051), class527_sub38.readUnsignedSmart((byte) -77), 321313743));
		else if (i == 102)
			aClass462_718 = ((Class462) Class26.method858(Class462.method7610(2046073824), class527_sub38.readUnsignedSmart((byte) -20), -218925046));
	}

	void method1347(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) 43);
			aClass462_714 = Class462.method7607(c, (byte) 1);
		} else if (2 == i) {
			char c = Class260.method4796(class527_sub38.readByte(), (byte) -7);
			aClass462_718 = Class462.method7607(c, (byte) 1);
		} else if (3 == i)
			aString719 = class527_sub38.readString(1220989677);
		else if (4 == i)
			anInt715 = class527_sub38.readInt() * 1854426601;
		else if (i == 5 || i == 6) {
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			aMap716 = new HashMap(220411113 * anInt712);
			for (int i_28_ = 0; i_28_ < anInt712 * 220411113; i_28_++) {
				int i_29_ = class527_sub38.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class527_sub38.readString(1918895554);
				else
					serializable = new Integer(class527_sub38.readInt());
				aMap716.put(new Integer(i_29_), serializable);
			}
		} else if (7 == i || i == 8) {
			int i_30_ = class527_sub38.readUnsignedShort();
			anInt712 = class527_sub38.readUnsignedShort() * -1726422183;
			anObjectArray717 = new Object[i_30_];
			for (int i_31_ = 0; i_31_ < 220411113 * anInt712; i_31_++) {
				int i_32_ = class527_sub38.readUnsignedShort();
				if (7 == i)
					anObjectArray717[i_32_] = class527_sub38.readString(1281873542);
				else
					anObjectArray717[i_32_] = new Integer(class527_sub38.readInt());
			}
		} else if (i == 101)
			aClass462_714 = ((Class462) Class26.method858(Class462.method7610(802891764), class527_sub38.readUnsignedSmart((byte) -75), 602847429));
		else if (i == 102)
			aClass462_718 = ((Class462) Class26.method858(Class462.method7610(-217816828), class527_sub38.readUnsignedSmart((byte) -20), 1240621697));
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1334(class527_sub38, i, (short) 128);
		}
	}

	public void method16(int i, int i_33_) {
		/* empty */
	}

	void method1348() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray717) {
			for (int i = 0; i < anObjectArray717.length; i++) {
				if (null != anObjectArray717[i]) {
					Object object = anObjectArray717[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap716) {
			Iterator iterator = aMap716.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap713 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_34_ = list.iterator();
			while (iterator_34_.hasNext()) {
				Integer integer = (Integer) iterator_34_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray717 == null)
				Arrays.sort(is);
			aHashMap713.put(entry.getKey(), is);
		}
	}

	public int method1349(int i) {
		Object object = method1352(i, -1523238907);
		if (object == null)
			return anInt715 * 751917657;
		return ((Integer) object).intValue();
	}

	public String method1350(int i) {
		Object object = method1352(i, 1333470323);
		if (null == object)
			return aString719;
		return (String) object;
	}

	Object method1351(int i) {
		if (anObjectArray717 != null) {
			if (i < 0 || i >= anObjectArray717.length)
				return null;
			return anObjectArray717[i];
		}
		if (aMap716 != null)
			return aMap716.get(new Integer(i));
		return null;
	}

	Object method1352(int i, int i_35_) {
		if (anObjectArray717 != null) {
			if (i < 0 || i >= anObjectArray717.length)
				return null;
			return anObjectArray717[i];
		}
		if (aMap716 != null)
			return aMap716.get(new Integer(i));
		return null;
	}

	public boolean method1353(Object object) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(346923073);
		return aHashMap713.containsKey(object);
	}

	public boolean method1354(Object object) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(1189947755);
		return aHashMap713.containsKey(object);
	}

	public boolean method1355(Object object) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(1873941540);
		return aHashMap713.containsKey(object);
	}

	public boolean method1356(Object object) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(466907374);
		return aHashMap713.containsKey(object);
	}

	public void method60(int i) {
		/* empty */
	}

	public int method1357() {
		return 220411113 * anInt712;
	}

	public int method1358(int i) {
		Object object = method1352(i, 910261728);
		if (object == null)
			return anInt715 * 751917657;
		return ((Integer) object).intValue();
	}

	public int method1359() {
		return 220411113 * anInt712;
	}

	public int method1360() {
		return 220411113 * anInt712;
	}

	public void method86(int i) {
		/* empty */
	}

	public boolean method1361(Object object) {
		if (220411113 * anInt712 == 0)
			return false;
		if (aHashMap713 == null)
			method1340(-1704567981);
		return aHashMap713.containsKey(object);
	}

	void method1362() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray717) {
			for (int i = 0; i < anObjectArray717.length; i++) {
				if (null != anObjectArray717[i]) {
					Object object = anObjectArray717[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap716) {
			Iterator iterator = aMap716.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap713 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_36_ = list.iterator();
			while (iterator_36_.hasNext()) {
				Integer integer = (Integer) iterator_36_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray717 == null)
				Arrays.sort(is);
			aHashMap713.put(entry.getKey(), is);
		}
	}

	public static int method1363(String string, byte i) {
		return string.length() + 2;
	}

	static final void method1364(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub11_10585.method16946((short) 8025) ? 1 : 0;
	}

	public static int method1365(int i, int i_37_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_38_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_39_ = (double) (i & 0xff) / 256.0;
		double d_40_ = d;
		if (d_38_ < d_40_)
			d_40_ = d_38_;
		if (d_39_ < d_40_)
			d_40_ = d_39_;
		double d_41_ = d;
		if (d_38_ > d_41_)
			d_41_ = d_38_;
		if (d_39_ > d_41_)
			d_41_ = d_39_;
		double d_42_ = 0.0;
		double d_43_ = 0.0;
		double d_44_ = (d_40_ + d_41_) / 2.0;
		if (d_41_ != d_40_) {
			if (d_44_ < 0.5)
				d_43_ = (d_41_ - d_40_) / (d_41_ + d_40_);
			if (d_44_ >= 0.5)
				d_43_ = (d_41_ - d_40_) / (2.0 - d_41_ - d_40_);
			if (d_41_ == d)
				d_42_ = (d_38_ - d_39_) / (d_41_ - d_40_);
			else if (d_41_ == d_38_)
				d_42_ = (d_39_ - d) / (d_41_ - d_40_) + 2.0;
			else if (d_41_ == d_39_)
				d_42_ = (d - d_38_) / (d_41_ - d_40_) + 4.0;
		}
		d_42_ /= 6.0;
		int i_45_ = (int) (256.0 * d_42_);
		int i_46_ = (int) (256.0 * d_43_);
		int i_47_ = (int) (d_44_ * 256.0);
		if (i_46_ < 0)
			i_46_ = 0;
		else if (i_46_ > 255)
			i_46_ = 255;
		if (i_47_ < 0)
			i_47_ = 0;
		else if (i_47_ > 255)
			i_47_ = 255;
		if (i_47_ > 243)
			i_46_ >>= 4;
		else if (i_47_ > 217)
			i_46_ >>= 3;
		else if (i_47_ > 192)
			i_46_ >>= 2;
		else if (i_47_ > 179)
			i_46_ >>= 1;
		return ((i_47_ >> 1) + ((i_46_ >> 5 << 7) + ((i_45_ & 0xff) >> 2 << 10)));
	}
}
