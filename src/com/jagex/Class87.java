/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class87 {
	Map aMap825;
	Class475 aClass475_826;
	public static Class459 aClass459_827;

	void method1618(RSByteBuffer class527_sub38) {
		aClass475_826 = ((Class475) Class26.method858(Class475.method7767((byte) -17), class527_sub38.readUnsignedByte(), 45867496));
		int i = class527_sub38.method16468((byte) 11);
		aMap825 = new HashMap(i);
		while (i-- > 0) {
			Object object = aClass475_826.method7759(class527_sub38, 2092605729);
			int i_0_ = class527_sub38.method16468((byte) 11);
			LinkedList linkedlist = new LinkedList();
			while (i_0_-- > 0) {
				int i_1_ = class527_sub38.method16468((byte) 11);
				linkedlist.add(Integer.valueOf(i_1_));
			}
			aMap825.put(object, linkedlist);
		}
	}

	public List method1619(Object object, int i) {
		return (List) aMap825.get(object);
	}

	void method1620(RSByteBuffer class527_sub38) {
		aClass475_826 = ((Class475) Class26.method858(Class475.method7767((byte) 56), class527_sub38.readUnsignedByte(), 1411554411));
		int i = class527_sub38.method16468((byte) 11);
		aMap825 = new HashMap(i);
		while (i-- > 0) {
			Object object = aClass475_826.method7759(class527_sub38, 1969233519);
			int i_2_ = class527_sub38.method16468((byte) 11);
			LinkedList linkedlist = new LinkedList();
			while (i_2_-- > 0) {
				int i_3_ = class527_sub38.method16468((byte) 11);
				linkedlist.add(Integer.valueOf(i_3_));
			}
			aMap825.put(object, linkedlist);
		}
	}

	void method1621(RSByteBuffer class527_sub38) {
		aClass475_826 = ((Class475) Class26.method858(Class475.method7767((byte) 18), class527_sub38.readUnsignedByte(), 1534253356));
		int i = class527_sub38.method16468((byte) 11);
		aMap825 = new HashMap(i);
		while (i-- > 0) {
			Object object = aClass475_826.method7759(class527_sub38, 1659540587);
			int i_4_ = class527_sub38.method16468((byte) 11);
			LinkedList linkedlist = new LinkedList();
			while (i_4_-- > 0) {
				int i_5_ = class527_sub38.method16468((byte) 11);
				linkedlist.add(Integer.valueOf(i_5_));
			}
			aMap825.put(object, linkedlist);
		}
	}

	public Class87(Class459 class459, int i, int i_6_) {
		byte[] is = class459.method7470(i, i_6_, (byte) -74);
		method1622(new RSByteBuffer(is), 674060158);
	}

	void method1622(RSByteBuffer class527_sub38, int i) {
		aClass475_826 = ((Class475) Class26.method858(Class475.method7767((byte) -54), class527_sub38.readUnsignedByte(), -220831695));
		int i_7_ = class527_sub38.method16468((byte) 11);
		aMap825 = new HashMap(i_7_);
		while (i_7_-- > 0) {
			Object object = aClass475_826.method7759(class527_sub38, 1724327228);
			int i_8_ = class527_sub38.method16468((byte) 11);
			LinkedList linkedlist = new LinkedList();
			while (i_8_-- > 0) {
				int i_9_ = class527_sub38.method16468((byte) 11);
				linkedlist.add(Integer.valueOf(i_9_));
			}
			aMap825.put(object, linkedlist);
		}
	}

	static void method1623(int i, int i_10_, int i_11_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(13, (long) i);
		class527_sub8_sub9.method18187(1279533220);
		class527_sub8_sub9.anInt11676 = -281159195 * i_10_;
	}
}
