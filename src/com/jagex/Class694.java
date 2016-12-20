/* Class694 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Collection;
import java.util.Iterator;

public class Class694 implements Iterable, Collection {
	public Class527 aClass527_8736 = new Class527();
	Class527 aClass527_8737;

	public int method14076() {
		return super.hashCode();
	}

	public int size() {
		return method14087((byte) -49);
	}

	public Class527 method14077(int i) {
		Class527 class527 = aClass527_8736.aClass527_7105;
		if (aClass527_8736 == class527)
			return null;
		class527.method8735(-1889161967);
		return class527;
	}

	Class527 method14078(Class527 class527) {
		Class527 class527_0_;
		if (null == class527)
			class527_0_ = aClass527_8736.aClass527_7105;
		else
			class527_0_ = class527;
		if (aClass527_8736 == class527_0_) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527_0_.aClass527_7105;
		return class527_0_;
	}

	void method14079(Class694 class694_1_, Class527 class527, byte i) {
		Class527 class527_2_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_1_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_2_.aClass527_7105 = class694_1_.aClass527_8736;
			class694_1_.aClass527_8736.aClass527_7107 = class527_2_;
		}
	}

	public void method14080(Class694 class694_3_, int i) {
		if (aClass527_8736.aClass527_7105 != aClass527_8736)
			method14079(class694_3_, aClass527_8736.aClass527_7105, (byte) 111);
	}

	public Class527 method14081(short i) {
		return method14132(null, -96209845);
	}

	public void method14082() {
		while (aClass527_8736 != aClass527_8736.aClass527_7105)
			aClass527_8736.aClass527_7105.method8735(-1889161967);
	}

	public int method14083() {
		return method14087((byte) -40);
	}

	Class527 method14084(Class527 class527, int i) {
		Class527 class527_4_;
		if (null == class527)
			class527_4_ = aClass527_8736.aClass527_7107;
		else
			class527_4_ = class527;
		if (class527_4_ == aClass527_8736) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527_4_.aClass527_7107;
		return class527_4_;
	}

	public int method14085() {
		int i = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; class527 != aClass527_8736; class527 = class527.aClass527_7105)
			i++;
		return i;
	}

	public Class527 method14086(int i) {
		Class527 class527 = aClass527_8737;
		if (aClass527_8736 == class527) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527.aClass527_7105;
		return class527;
	}

	public int method14087(byte i) {
		int i_5_ = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; class527 != aClass527_8736; class527 = class527.aClass527_7105)
			i_5_++;
		return i_5_;
	}

	public boolean method14088(int i) {
		return aClass527_8736.aClass527_7105 == aClass527_8736;
	}

	Class527[] method14089(int i) {
		Class527[] class527s = new Class527[method14087((byte) 8)];
		int i_6_ = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; aClass527_8736 != class527; class527 = class527.aClass527_7105)
			class527s[i_6_++] = class527;
		return class527s;
	}

	public Iterator iterator() {
		return new Class691(this);
	}

	public boolean method14090(Object object) {
		throw new RuntimeException();
	}

	public Class527 method14091(int i) {
		Class527 class527 = aClass527_8737;
		if (aClass527_8736 == class527) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527.aClass527_7107;
		return class527;
	}

	public boolean contains(Object object) {
		throw new RuntimeException();
	}

	Class527 method14092(Class527 class527) {
		Class527 class527_7_;
		if (null == class527)
			class527_7_ = aClass527_8736.aClass527_7107;
		else
			class527_7_ = class527;
		if (class527_7_ == aClass527_8736) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527_7_.aClass527_7107;
		return class527_7_;
	}

	public Object[] toArray(Object[] objects) {
		int i = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; aClass527_8736 != class527; class527 = class527.aClass527_7105)
			objects[i++] = class527;
		return objects;
	}

	public boolean method14093(Collection collection) {
		throw new RuntimeException();
	}

	public boolean remove(Object object) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14094(Object object) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
		throw new RuntimeException();
	}

	public static void method14095(Class527 class527, Class527 class527_8_) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		class527.aClass527_7107 = class527_8_.aClass527_7107;
		class527.aClass527_7105 = class527_8_;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
	}

	public boolean add(Object object) {
		return method14125((Class527) object, 1803957666);
	}

	public Object[] method14096() {
		return method14089(-733187254);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean method14097(Object object) {
		return super.equals(object);
	}

	public boolean method14098(Object object) {
		return super.equals(object);
	}

	public int method14099() {
		return super.hashCode();
	}

	public int method14100() {
		int i = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; class527 != aClass527_8736; class527 = class527.aClass527_7105)
			i++;
		return i;
	}

	public int method14101() {
		return super.hashCode();
	}

	public Iterator method14102() {
		return new Class691(this);
	}

	public int method14103() {
		return method14087((byte) 7);
	}

	public Class527 method14104() {
		Class527 class527 = aClass527_8736.aClass527_7105;
		if (aClass527_8736 == class527)
			return null;
		class527.method8735(-1889161967);
		return class527;
	}

	public void method14105(byte i) {
		while (aClass527_8736 != aClass527_8736.aClass527_7105)
			aClass527_8736.aClass527_7105.method8735(-1889161967);
	}

	public boolean method14106(Object object) {
		throw new RuntimeException();
	}

	void method14107(Class694 class694_9_, Class527 class527) {
		Class527 class527_10_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_9_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_10_.aClass527_7105 = class694_9_.aClass527_8736;
			class694_9_.aClass527_8736.aClass527_7107 = class527_10_;
		}
	}

	public void clear() {
		method14105((byte) 61);
	}

	public boolean method14108() {
		return method14088(-1919325945);
	}

	public Class694() {
		aClass527_8736.aClass527_7105 = aClass527_8736;
		aClass527_8736.aClass527_7107 = aClass527_8736;
	}

	public void method14109() {
		while (aClass527_8736 != aClass527_8736.aClass527_7105)
			aClass527_8736.aClass527_7105.method8735(-1889161967);
	}

	public void method14110(Class527 class527) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		class527.aClass527_7107 = aClass527_8736.aClass527_7107;
		class527.aClass527_7105 = aClass527_8736;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
	}

	public void method14111(Class527 class527) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		class527.aClass527_7107 = aClass527_8736.aClass527_7107;
		class527.aClass527_7105 = aClass527_8736;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
	}

	public boolean method14112(Collection collection) {
		throw new RuntimeException();
	}

	public static void method14113(Class527 class527, Class527 class527_11_) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		class527.aClass527_7107 = class527_11_.aClass527_7107;
		class527.aClass527_7105 = class527_11_;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
	}

	public boolean removeAll(Collection collection) {
		throw new RuntimeException();
	}

	public Class527 method14114() {
		Class527 class527 = aClass527_8736.aClass527_7105;
		if (aClass527_8736 == class527)
			return null;
		class527.method8735(-1889161967);
		return class527;
	}

	public boolean method14115(Collection collection) {
		throw new RuntimeException();
	}

	public Class527 method14116() {
		Class527 class527 = aClass527_8736.aClass527_7105;
		if (aClass527_8736 == class527)
			return null;
		class527.method8735(-1889161967);
		return class527;
	}

	void method14117(Class694 class694_12_, Class527 class527) {
		Class527 class527_13_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_12_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_13_.aClass527_7105 = class694_12_.aClass527_8736;
			class694_12_.aClass527_8736.aClass527_7107 = class527_13_;
		}
	}

	void method14118(Class694 class694_14_, Class527 class527) {
		Class527 class527_15_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_14_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_15_.aClass527_7105 = class694_14_.aClass527_8736;
			class694_14_.aClass527_8736.aClass527_7107 = class527_15_;
		}
	}

	void method14119(Class694 class694_16_, Class527 class527) {
		Class527 class527_17_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_16_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_17_.aClass527_7105 = class694_16_.aClass527_8736;
			class694_16_.aClass527_8736.aClass527_7107 = class527_17_;
		}
	}

	boolean method14120(Class527 class527) {
		method14147(class527, -838430109);
		return true;
	}

	void method14121(Class694 class694_18_, Class527 class527) {
		Class527 class527_19_ = aClass527_8736.aClass527_7107;
		aClass527_8736.aClass527_7107 = class527.aClass527_7107;
		class527.aClass527_7107.aClass527_7105 = aClass527_8736;
		if (class527 != aClass527_8736) {
			class527.aClass527_7107 = class694_18_.aClass527_8736.aClass527_7107;
			class527.aClass527_7107.aClass527_7105 = class527;
			class527_19_.aClass527_7105 = class694_18_.aClass527_8736;
			class694_18_.aClass527_8736.aClass527_7107 = class527_19_;
		}
	}

	public Class527 method14122() {
		return method14132(null, -998601565);
	}

	public Class527 method14123() {
		return method14132(null, -854685505);
	}

	public Class527 method14124() {
		return method14132(null, -1862546770);
	}

	boolean method14125(Class527 class527, int i) {
		method14147(class527, -1466428703);
		return true;
	}

	public Class527 method14126() {
		return method14084(null, -50953219);
	}

	public void method14127() {
		method14105((byte) 99);
	}

	public Class527 method14128() {
		return method14084(null, 860312558);
	}

	public Class527 method14129() {
		return method14084(null, -371091100);
	}

	public Class527 method14130() {
		return method14084(null, -436402623);
	}

	public Class527 method14131() {
		Class527 class527 = aClass527_8737;
		if (aClass527_8736 == class527) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527.aClass527_7105;
		return class527;
	}

	Class527 method14132(Class527 class527, int i) {
		Class527 class527_20_;
		if (null == class527)
			class527_20_ = aClass527_8736.aClass527_7105;
		else
			class527_20_ = class527;
		if (aClass527_8736 == class527_20_) {
			aClass527_8737 = null;
			return null;
		}
		aClass527_8737 = class527_20_.aClass527_7105;
		return class527_20_;
	}

	public int method14133() {
		int i = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; class527 != aClass527_8736; class527 = class527.aClass527_7105)
			i++;
		return i;
	}

	public Class527 method14134() {
		Class527 class527 = aClass527_8736.aClass527_7105;
		if (aClass527_8736 == class527)
			return null;
		class527.method8735(-1889161967);
		return class527;
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public boolean method14135() {
		return aClass527_8736.aClass527_7105 == aClass527_8736;
	}

	Class527[] method14136() {
		Class527[] class527s = new Class527[method14087((byte) -64)];
		int i = 0;
		for (Class527 class527 = aClass527_8736.aClass527_7105; aClass527_8736 != class527; class527 = class527.aClass527_7105)
			class527s[i++] = class527;
		return class527s;
	}

	public boolean method14137() {
		return method14088(-1128845946);
	}

	public boolean method14138() {
		return method14088(-403530688);
	}

	public boolean method14139() {
		return method14088(912239448);
	}

	public Object[] toArray() {
		return method14089(1408031785);
	}

	public boolean method14140() {
		return method14088(-1312972080);
	}

	public Object[] method14141() {
		return method14089(718264206);
	}

	boolean method14142(Class527 class527) {
		method14147(class527, -447649883);
		return true;
	}

	public boolean method14143(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14144(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14145(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14146(Collection collection) {
		throw new RuntimeException();
	}

	public void method14147(Class527 class527, int i) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		class527.aClass527_7107 = aClass527_8736.aClass527_7107;
		class527.aClass527_7105 = aClass527_8736;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
	}

	public boolean method14148(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14149(Collection collection) {
		throw new RuntimeException();
	}

	public boolean method14150(Collection collection) {
		throw new RuntimeException();
	}

	public boolean isEmpty() {
		return method14088(828763815);
	}

	public boolean method14151(Collection collection) {
		throw new RuntimeException();
	}

	public Class527 method14152(byte i) {
		return method14084(null, -448466979);
	}

	public boolean method14153(Collection collection) {
		throw new RuntimeException();
	}

	public void method14154() {
		method14105((byte) 114);
	}

	public void method14155() {
		method14105((byte) 81);
	}

	public void method14156() {
		method14105((byte) 117);
	}

	public Class527 method14157() {
		return method14084(null, 406701106);
	}

	public boolean method14158(Object object) {
		return method14125((Class527) object, -1210889109);
	}

	public boolean method14159(Object object) {
		return method14125((Class527) object, 1318167040);
	}
}
