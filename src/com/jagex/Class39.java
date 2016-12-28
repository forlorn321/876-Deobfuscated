/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class39 implements DefinitionI, Interface7 {
	public Class453 aClass453_482;
	public Class453 aClass453_483;
	String aString484 = "null";
	int anInt485;
	HashMap aHashMap486;
	int anInt487 = 0;
	Map aMap488;
	Object[] anObjectArray489;
	public static Class450 aClass450_490;

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method849(class536_sub33, i_0_, (byte) -88);
		}
	}

	public void method57(int i) {
		/* empty */
	}

	void method849(RSByteBuffer class536_sub33, int i, byte i_1_) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 936955752);
			aClass453_482 = Class453.method5440(c, 1182469847);
		} else if (2 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), -695216348);
			aClass453_483 = Class453.method5440(c, 1098691315);
		} else if (3 == i)
			aString484 = class536_sub33.readString();
		else if (4 == i)
			anInt485 = class536_sub33.readInt() * 10943101;
		else if (i == 5 || i == 6) {
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			aMap488 = new HashMap(anInt487 * -50029819);
			for (int i_2_ = 0; i_2_ < anInt487 * -50029819; i_2_++) {
				int i_3_ = class536_sub33.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class536_sub33.readString();
				else
					serializable = new Integer(class536_sub33.readInt());
				aMap488.put(new Integer(i_3_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_4_ = class536_sub33.readUnsignedShort();
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			anObjectArray489 = new Object[i_4_];
			for (int i_5_ = 0; i_5_ < anInt487 * -50029819; i_5_++) {
				int i_6_ = class536_sub33.readUnsignedShort();
				if (i == 7)
					anObjectArray489[i_6_] = class536_sub33.readString();
				else
					anObjectArray489[i_6_] = new Integer(class536_sub33.readInt());
			}
		} else if (i == 101)
			aClass453_482 = ((Class453) Class682.method8091(Class453.method5438((byte) 58), class536_sub33.readUnsignedSmart(), 1858049507));
		else if (102 == i)
			aClass453_483 = ((Class453) Class682.method8091(Class453.method5438((byte) 31), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	void method850(int i) {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray489) {
			for (int i_7_ = 0; i_7_ < anObjectArray489.length; i_7_++) {
				if (anObjectArray489[i_7_] != null) {
					Object object = anObjectArray489[i_7_];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_7_));
				}
			}
		} else if (null != aMap488) {
			Iterator iterator = aMap488.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap486 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i_8_ = 0;
			Iterator iterator_9_ = list.iterator();
			while (iterator_9_.hasNext()) {
				Integer integer = (Integer) iterator_9_.next();
				is[i_8_++] = integer.intValue();
			}
			if (anObjectArray489 == null)
				Arrays.sort(is);
			aHashMap486.put(entry.getKey(), is);
		}
	}

	public String method851(int i, int i_10_) {
		Object object = method852(i, (byte) 23);
		if (null == object)
			return aString484;
		return (String) object;
	}

	Object method852(int i, byte i_11_) {
		if (anObjectArray489 != null) {
			if (i < 0 || i >= anObjectArray489.length)
				return null;
			return anObjectArray489[i];
		}
		if (aMap488 != null)
			return aMap488.get(new Integer(i));
		return null;
	}

	public boolean method853(Object object, int i) {
		if (anInt487 * -50029819 == 0)
			return false;
		if (aHashMap486 == null)
			method850(-2067494214);
		return aHashMap486.containsKey(object);
	}

	public int[] method854(Object object, int i) {
		if (0 == -50029819 * anInt487)
			return null;
		if (null == aHashMap486)
			method850(-2067494214);
		return (int[]) aHashMap486.get(object);
	}

	Class39() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method59(int i, int i_12_) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method849(class536_sub33, i, (byte) -83);
		}
	}

	public int method855(int i, int i_13_) {
		Object object = method852(i, (byte) -40);
		if (object == null)
			return 1549127381 * anInt485;
		return ((Integer) object).intValue();
	}

	public void method58(int i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method856(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 301843713);
			aClass453_482 = Class453.method5440(c, -1756943438);
		} else if (2 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), -706383699);
			aClass453_483 = Class453.method5440(c, -1618723157);
		} else if (3 == i)
			aString484 = class536_sub33.readString();
		else if (4 == i)
			anInt485 = class536_sub33.readInt() * 10943101;
		else if (i == 5 || i == 6) {
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			aMap488 = new HashMap(anInt487 * -50029819);
			for (int i_14_ = 0; i_14_ < anInt487 * -50029819; i_14_++) {
				int i_15_ = class536_sub33.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class536_sub33.readString();
				else
					serializable = new Integer(class536_sub33.readInt());
				aMap488.put(new Integer(i_15_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_16_ = class536_sub33.readUnsignedShort();
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			anObjectArray489 = new Object[i_16_];
			for (int i_17_ = 0; i_17_ < anInt487 * -50029819; i_17_++) {
				int i_18_ = class536_sub33.readUnsignedShort();
				if (i == 7)
					anObjectArray489[i_18_] = class536_sub33.readString();
				else
					anObjectArray489[i_18_] = new Integer(class536_sub33.readInt());
			}
		} else if (i == 101)
			aClass453_482 = ((Class453) Class682.method8091(Class453.method5438((byte) 63), class536_sub33.readUnsignedSmart(), 1858049507));
		else if (102 == i)
			aClass453_483 = ((Class453) Class682.method8091(Class453.method5438((byte) 65), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	void method857(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 815400974);
			aClass453_482 = Class453.method5440(c, 385173946);
		} else if (2 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), -1872947005);
			aClass453_483 = Class453.method5440(c, 1072674618);
		} else if (3 == i)
			aString484 = class536_sub33.readString();
		else if (4 == i)
			anInt485 = class536_sub33.readInt() * 10943101;
		else if (i == 5 || i == 6) {
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			aMap488 = new HashMap(anInt487 * -50029819);
			for (int i_19_ = 0; i_19_ < anInt487 * -50029819; i_19_++) {
				int i_20_ = class536_sub33.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class536_sub33.readString();
				else
					serializable = new Integer(class536_sub33.readInt());
				aMap488.put(new Integer(i_20_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_21_ = class536_sub33.readUnsignedShort();
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			anObjectArray489 = new Object[i_21_];
			for (int i_22_ = 0; i_22_ < anInt487 * -50029819; i_22_++) {
				int i_23_ = class536_sub33.readUnsignedShort();
				if (i == 7)
					anObjectArray489[i_23_] = class536_sub33.readString();
				else
					anObjectArray489[i_23_] = new Integer(class536_sub33.readInt());
			}
		} else if (i == 101)
			aClass453_482 = ((Class453) Class682.method8091(Class453.method5438((byte) 101), class536_sub33.readUnsignedSmart(), 1858049507));
		else if (102 == i)
			aClass453_483 = ((Class453) Class682.method8091(Class453.method5438((byte) 84), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	public int method858(int i) {
		Object object = method852(i, (byte) 82);
		if (object == null)
			return 1549127381 * anInt485;
		return ((Integer) object).intValue();
	}

	public String method859(int i) {
		Object object = method852(i, (byte) 11);
		if (null == object)
			return aString484;
		return (String) object;
	}

	public int method860(int i) {
		return anInt487 * -50029819;
	}

	public void method75(byte i) {
		/* empty */
	}

	void method861(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), -948029168);
			aClass453_482 = Class453.method5440(c, 968055063);
		} else if (2 == i) {
			char c = Class281.method3764(class536_sub33.readByte(), 51829259);
			aClass453_483 = Class453.method5440(c, -2098169536);
		} else if (3 == i)
			aString484 = class536_sub33.readString();
		else if (4 == i)
			anInt485 = class536_sub33.readInt() * 10943101;
		else if (i == 5 || i == 6) {
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			aMap488 = new HashMap(anInt487 * -50029819);
			for (int i_24_ = 0; i_24_ < anInt487 * -50029819; i_24_++) {
				int i_25_ = class536_sub33.readInt();
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class536_sub33.readString();
				else
					serializable = new Integer(class536_sub33.readInt());
				aMap488.put(new Integer(i_25_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_26_ = class536_sub33.readUnsignedShort();
			anInt487 = class536_sub33.readUnsignedShort() * 2095643085;
			anObjectArray489 = new Object[i_26_];
			for (int i_27_ = 0; i_27_ < anInt487 * -50029819; i_27_++) {
				int i_28_ = class536_sub33.readUnsignedShort();
				if (i == 7)
					anObjectArray489[i_28_] = class536_sub33.readString();
				else
					anObjectArray489[i_28_] = new Integer(class536_sub33.readInt());
			}
		} else if (i == 101)
			aClass453_482 = ((Class453) Class682.method8091(Class453.method5438((byte) 2), class536_sub33.readUnsignedSmart(), 1858049507));
		else if (102 == i)
			aClass453_483 = ((Class453) Class682.method8091(Class453.method5438((byte) 42), class536_sub33.readUnsignedSmart(), 1858049507));
	}

	public int method862() {
		return anInt487 * -50029819;
	}

	void method863() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray489) {
			for (int i = 0; i < anObjectArray489.length; i++) {
				if (anObjectArray489[i] != null) {
					Object object = anObjectArray489[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap488) {
			Iterator iterator = aMap488.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap486 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_29_ = list.iterator();
			while (iterator_29_.hasNext()) {
				Integer integer = (Integer) iterator_29_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray489 == null)
				Arrays.sort(is);
			aHashMap486.put(entry.getKey(), is);
		}
	}

	void method864() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray489) {
			for (int i = 0; i < anObjectArray489.length; i++) {
				if (anObjectArray489[i] != null) {
					Object object = anObjectArray489[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap488) {
			Iterator iterator = aMap488.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap486 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_30_ = list.iterator();
			while (iterator_30_.hasNext()) {
				Integer integer = (Integer) iterator_30_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray489 == null)
				Arrays.sort(is);
			aHashMap486.put(entry.getKey(), is);
		}
	}

	void method865() {
		HashMap hashmap = new HashMap();
		if (null != anObjectArray489) {
			for (int i = 0; i < anObjectArray489.length; i++) {
				if (anObjectArray489[i] != null) {
					Object object = anObjectArray489[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap488) {
			Iterator iterator = aMap488.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap486 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_31_ = list.iterator();
			while (iterator_31_.hasNext()) {
				Integer integer = (Integer) iterator_31_.next();
				is[i++] = integer.intValue();
			}
			if (anObjectArray489 == null)
				Arrays.sort(is);
			aHashMap486.put(entry.getKey(), is);
		}
	}

	static final void method866(InterfaceDefinitions class251, Class234 class234, Class668 class668, byte i) {
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		if (bool != class251.hidden) {
			class251.hidden = bool;
			Class668.method8011(class251, 263642117);
		}
		if (class251.anInt2546 * -809980533 == -1 && !class234.aBool2379)
			Class671.method8021(-1591767037 * class251.anInt2559, -54264131);
	}

	static final void method867(Class668 class668, int i) {
		int i_32_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_32_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_32_ >> 16];
		Class349.method4593(class251, class234, class668, 906910120);
	}
}
