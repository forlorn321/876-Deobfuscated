/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Class53 implements Interface12 {
	protected int anInt592;
	Class648 aClass648_593;
	Class461 aClass461_594;
	Interface13[] anInterface13Array595;
	Interface13 anInterface13_596;
	Interface6 anInterface6_597;
	public static Class385 aClass385_598;
	static int anInt599;

	public Iterator method936() {
		return new Class68(this);
	}

	public int method12() {
		return anInterface13Array595.length;
	}

	void method937(int i, byte i_0_) {
		if (anInterface13Array595[i] == null) {
			try {
				anInterface13Array595[i] = anInterface6_597.method55(i, this, 561455303);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class634.method7549(aClass461_594, aClass648_593, i, (byte) 0);
			if (is != null)
				anInterface13Array595[i].method74(new RSByteBuffer(is), 1939855694);
			anInterface13Array595[i].method75((byte) -2);
		}
	}

	public int method71(int i) {
		return anInterface13Array595.length;
	}

	public Iterator iterator() {
		return new Class68(this);
	}

	Class53(Class670 class670, Class664 class664, Class648 class648, Class461 class461, Interface6 interface6, boolean bool) {
		anInterface6_597 = interface6;
		aClass648_593 = class648;
		aClass461_594 = class461;
		anInt592 = Class191.method2840(aClass461_594, aClass648_593, 582895995) * -1639237859;
		anInterface13Array595 = ((Interface13[]) Array.newInstance(anInterface6_597.method51(-1256188449), anInt592 * 171262773));
		if (bool) {
			for (int i = 0; i < 171262773 * anInt592; i++)
				method937(i, (byte) -46);
		}
	}

	public int method73() {
		return anInterface13Array595.length;
	}

	void method938(int i) {
		if (anInterface13Array595[i] == null) {
			try {
				anInterface13Array595[i] = anInterface6_597.method55(i, this, 1189545199);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class634.method7549(aClass461_594, aClass648_593, i, (byte) 0);
			if (is != null)
				anInterface13Array595[i].method74(new RSByteBuffer(is), 187801778);
			anInterface13Array595[i].method75((byte) -79);
		}
	}

	public Iterator method939() {
		return new Class68(this);
	}

	public Interface13 method70(int i, byte i_1_) {
		if (i < 0) {
			if (anInterface13_596 == null)
				anInterface13_596 = anInterface6_597.method55(-1, this, 1096864548);
			return anInterface13_596;
		}
		if (null == anInterface13Array595[i])
			method937(i, (byte) -66);
		return anInterface13Array595[i];
	}

	public Iterator method940() {
		return new Class68(this);
	}

	void method941(int i) {
		if (anInterface13Array595[i] == null) {
			try {
				anInterface13Array595[i] = anInterface6_597.method55(i, this, 693427663);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class634.method7549(aClass461_594, aClass648_593, i, (byte) 0);
			if (is != null)
				anInterface13Array595[i].method74(new RSByteBuffer(is), -1424962750);
			anInterface13Array595[i].method75((byte) 41);
		}
	}

	public Interface13 method72(int i) {
		if (i < 0) {
			if (anInterface13_596 == null)
				anInterface13_596 = anInterface6_597.method55(-1, this, 1513290346);
			return anInterface13_596;
		}
		if (null == anInterface13Array595[i])
			method937(i, (byte) 25);
		return anInterface13Array595[i];
	}
}
