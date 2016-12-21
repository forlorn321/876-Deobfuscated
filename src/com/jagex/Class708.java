/* Class708 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Collection;
import java.util.Iterator;

public class Class708 implements Iterable, Collection {
	static Class87 aClass87_8824;
	Class536 aClass536_8825;
	public Class536 aClass536_8826 = new Class536();

	public boolean method8303() {
		return aClass536_8826.aClass536_7132 == aClass536_8826;
	}

	public void method8304(int i) {
		while (aClass536_8826 != aClass536_8826.aClass536_7132)
			aClass536_8826.aClass536_7132.method6484(-310388310);
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	public Class536 method8305(int i) {
		Class536 class536 = aClass536_8826.aClass536_7132;
		if (aClass536_8826 == class536)
			return null;
		class536.method6484(1974861999);
		return class536;
	}

	void method8306(Class708 class708_0_, Class536 class536, byte i) {
		Class536 class536_1_ = aClass536_8826.aClass536_7134;
		aClass536_8826.aClass536_7134 = class536.aClass536_7134;
		class536.aClass536_7134.aClass536_7132 = aClass536_8826;
		if (aClass536_8826 != class536) {
			class536.aClass536_7134 = class708_0_.aClass536_8826.aClass536_7134;
			class536.aClass536_7134.aClass536_7132 = class536;
			class536_1_.aClass536_7132 = class708_0_.aClass536_8826;
			class708_0_.aClass536_8826.aClass536_7134 = class536_1_;
		}
	}

	public void method8307() {
		while (aClass536_8826 != aClass536_8826.aClass536_7132)
			aClass536_8826.aClass536_7132.method6484(-1365232204);
	}

	public Class536 method8308(int i) {
		return method8325(null, (byte) 72);
	}

	public Class536 method8309(int i) {
		return method8310(null, (byte) 8);
	}

	Class536 method8310(Class536 class536, byte i) {
		Class536 class536_2_;
		if (null == class536)
			class536_2_ = aClass536_8826.aClass536_7134;
		else
			class536_2_ = class536;
		if (aClass536_8826 == class536_2_) {
			aClass536_8825 = null;
			return null;
		}
		aClass536_8825 = class536_2_.aClass536_7134;
		return class536_2_;
	}

	public Class536 method8311(int i) {
		Class536 class536 = aClass536_8825;
		if (class536 == aClass536_8826) {
			aClass536_8825 = null;
			return null;
		}
		aClass536_8825 = class536.aClass536_7132;
		return class536;
	}

	public Class536 method8312(int i) {
		Class536 class536 = aClass536_8825;
		if (class536 == aClass536_8826) {
			aClass536_8825 = null;
			return null;
		}
		aClass536_8825 = class536.aClass536_7134;
		return class536;
	}

	public boolean method8313(int i) {
		return aClass536_8826.aClass536_7132 == aClass536_8826;
	}

	Class536[] method8314(int i) {
		Class536[] class536s = new Class536[method8339((byte) 28)];
		int i_3_ = 0;
		for (Class536 class536 = aClass536_8826.aClass536_7132; class536 != aClass536_8826; class536 = class536.aClass536_7132)
			class536s[i_3_++] = class536;
		return class536s;
	}

	public Iterator method8315() {
		return new Class693(this);
	}

	public int size() {
		return method8339((byte) 41);
	}

	public boolean isEmpty() {
		return method8313(-1923692076);
	}

	public boolean method8316(Object object) {
		return super.equals(object);
	}

	public Object[] toArray() {
		return method8314(40549330);
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Class536 class536 = aClass536_8826.aClass536_7132; class536 != aClass536_8826; class536 = class536.aClass536_7132)
			objects[i++] = class536;
		return objects;
	}

	boolean method8317(Class536 class536, byte i) {
		method8335(class536, -720115579);
		return true;
	}

	public int method8318() {
		int i = 0;
		for (Class536 class536 = aClass536_8826.aClass536_7132; aClass536_8826 != class536; class536 = class536.aClass536_7132)
			i++;
		return i;
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public void clear() {
		method8304(454036827);
	}

	public boolean add(Object object) {
		return method8317((Class536) object, (byte) 1);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean method8319(Object object) {
		return super.equals(object);
	}

	public int method8320() {
		return method8339((byte) 13);
	}

	public int method8321() {
		return method8339((byte) 114);
	}

	public boolean method8322(Object object) {
		throw new RuntimeException();
	}

	public boolean method8323(Object object) {
		throw new RuntimeException();
	}

	public boolean method8324(Object object) {
		throw new RuntimeException();
	}

	Class536 method8325(Class536 class536, byte i) {
		Class536 class536_4_;
		if (class536 == null)
			class536_4_ = aClass536_8826.aClass536_7132;
		else
			class536_4_ = class536;
		if (aClass536_8826 == class536_4_) {
			aClass536_8825 = null;
			return null;
		}
		aClass536_8825 = class536_4_.aClass536_7132;
		return class536_4_;
	}

	public Object[] method8326() {
		return method8314(1877576102);
	}

	public Object[] method8327() {
		return method8314(494786934);
	}

	public boolean method8328(Object object) {
		throw new RuntimeException();
	}

	public Iterator method8329() {
		return new Class693(this);
	}

	public Iterator method8330() {
		return new Class693(this);
	}

	public int method8331() {
		return super.hashCode();
	}

	public int method8332() {
		return super.hashCode();
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	public Object[] method8333() {
		return method8314(1717543536);
	}

	public Iterator iterator() {
		return new Class693(this);
	}

	public int method8334() {
		int i = 0;
		for (Class536 class536 = aClass536_8826.aClass536_7132; aClass536_8826 != class536; class536 = class536.aClass536_7132)
			i++;
		return i;
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public Class708() {
		aClass536_8826.aClass536_7132 = aClass536_8826;
		aClass536_8826.aClass536_7134 = aClass536_8826;
	}

	public void method8335(Class536 class536, int i) {
		if (class536.aClass536_7134 != null)
			class536.method6484(1856977283);
		class536.aClass536_7134 = aClass536_8826.aClass536_7134;
		class536.aClass536_7132 = aClass536_8826;
		class536.aClass536_7134.aClass536_7132 = class536;
		class536.aClass536_7132.aClass536_7134 = class536;
	}

	public boolean method8336() {
		return aClass536_8826.aClass536_7132 == aClass536_8826;
	}

	public void method8337(Class708 class708_5_, int i) {
		if (aClass536_8826 != aClass536_8826.aClass536_7132)
			method8306(class708_5_, aClass536_8826.aClass536_7132, (byte) 0);
	}

	public boolean method8338() {
		return method8313(74718945);
	}

	public int method8339(byte i) {
		int i_6_ = 0;
		for (Class536 class536 = aClass536_8826.aClass536_7132; aClass536_8826 != class536; class536 = class536.aClass536_7132)
			i_6_++;
		return i_6_;
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public void method8340() {
		method8304(454036827);
	}

	static final void method8341(Class668 class668, int i) {
		Class251 class251 = Class264.method3678(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2711 * -1484799213;
	}
}
