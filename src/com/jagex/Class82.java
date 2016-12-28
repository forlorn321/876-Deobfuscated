/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class82 {
	Class478 aClass478_861;
	Map aMap862;

	public List method1166(Object object, int i) {
		return (List) aMap862.get(object);
	}

	void method1167(RSByteBuffer class536_sub33, int i) {
		aClass478_861 = ((Class478) Class682.method8091(Class478.method5757((byte) 49), class536_sub33.readUnsignedByte(), 1858049507));
		int i_0_ = class536_sub33.method9760(1002504547);
		aMap862 = new HashMap(i_0_);
		while (i_0_-- > 0) {
			Object object = aClass478_861.method5756(class536_sub33, (byte) -33);
			int i_1_ = class536_sub33.method9760(1457101288);
			LinkedList linkedlist = new LinkedList();
			while (i_1_-- > 0) {
				int i_2_ = class536_sub33.method9760(1425791470);
				linkedlist.add(Integer.valueOf(i_2_));
			}
			aMap862.put(object, linkedlist);
		}
	}

	void method1168(RSByteBuffer class536_sub33) {
		aClass478_861 = ((Class478) Class682.method8091(Class478.method5757((byte) 4), class536_sub33.readUnsignedByte(), 1858049507));
		int i = class536_sub33.method9760(-583183743);
		aMap862 = new HashMap(i);
		while (i-- > 0) {
			Object object = aClass478_861.method5756(class536_sub33, (byte) 43);
			int i_3_ = class536_sub33.method9760(48622129);
			LinkedList linkedlist = new LinkedList();
			while (i_3_-- > 0) {
				int i_4_ = class536_sub33.method9760(427249044);
				linkedlist.add(Integer.valueOf(i_4_));
			}
			aMap862.put(object, linkedlist);
		}
	}

	void method1169(RSByteBuffer class536_sub33) {
		aClass478_861 = ((Class478) Class682.method8091(Class478.method5757((byte) -26), class536_sub33.readUnsignedByte(), 1858049507));
		int i = class536_sub33.method9760(-726109448);
		aMap862 = new HashMap(i);
		while (i-- > 0) {
			Object object = aClass478_861.method5756(class536_sub33, (byte) -78);
			int i_5_ = class536_sub33.method9760(1621950947);
			LinkedList linkedlist = new LinkedList();
			while (i_5_-- > 0) {
				int i_6_ = class536_sub33.method9760(-498379634);
				linkedlist.add(Integer.valueOf(i_6_));
			}
			aMap862.put(object, linkedlist);
		}
	}

	public Class82(Class461 class461, int i, int i_7_) {
		byte[] is = class461.method5556(i, i_7_, (byte) 1);
		method1167(new RSByteBuffer(is), -53320811);
	}

	static ClientSettings method1170(int i) {
		Class6 class6 = null;
		ClientSettings class536_sub40 = new ClientSettings(client.aClass670_11043, 0);
		try {
			class6 = Class153_Sub1.method8383("", client.aClass670_11043.aString8573, false, 2116348009);
			byte[] is = new byte[(int) class6.method586(917143623)];
			int i_8_;
			for (int i_9_ = 0; i_9_ < is.length; i_9_ += i_8_) {
				i_8_ = class6.method587(is, i_9_, is.length - i_9_, -1832375503);
				if (-1 == i_8_)
					throw new IOException();
			}
			class536_sub40 = new ClientSettings(new RSByteBuffer(is), client.aClass670_11043, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class6 != null)
				class6.method585(-1411037171);
		} catch (Exception exception) {
			/* empty */
		}
		return class536_sub40;
	}
}
