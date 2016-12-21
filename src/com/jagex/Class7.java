/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class7 {
	public Object anObject117;
	public Object anObject118;

	public String method595() {
		return new StringBuilder().append(anObject117).append(", ").append(anObject118).toString();
	}

	public String toString() {
		return new StringBuilder().append(anObject117).append(", ").append(anObject118).toString();
	}

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Class7))
			return false;
		Class7 class7_0_ = (Class7) object;
		if (anObject117 == null) {
			if (class7_0_.anObject117 != null)
				return false;
		} else if (!anObject117.equals(class7_0_.anObject117))
			return false;
		if (anObject118 == null) {
			if (class7_0_.anObject118 != null)
				return false;
		} else if (!anObject118.equals(class7_0_.anObject118))
			return false;
		return true;
	}

	public int hashCode() {
		int i = 0;
		if (anObject117 != null)
			i += anObject117.hashCode();
		if (anObject118 != null)
			i += 31 * anObject118.hashCode();
		return i;
	}

	public String method596() {
		return new StringBuilder().append(anObject117).append(", ").append(anObject118).toString();
	}

	public Class7(Object object, Object object_1_) {
		anObject117 = object;
		anObject118 = object_1_;
	}

	public boolean method597(Object object) {
		if (object == null || !(object instanceof Class7))
			return false;
		Class7 class7_2_ = (Class7) object;
		if (anObject117 == null) {
			if (class7_2_.anObject117 != null)
				return false;
		} else if (!anObject117.equals(class7_2_.anObject117))
			return false;
		if (anObject118 == null) {
			if (class7_2_.anObject118 != null)
				return false;
		} else if (!anObject118.equals(class7_2_.anObject118))
			return false;
		return true;
	}

	public String method598() {
		return new StringBuilder().append(anObject117).append(", ").append(anObject118).toString();
	}

	public boolean method599(Object object) {
		if (object == null || !(object instanceof Class7))
			return false;
		Class7 class7_3_ = (Class7) object;
		if (anObject117 == null) {
			if (class7_3_.anObject117 != null)
				return false;
		} else if (!anObject117.equals(class7_3_.anObject117))
			return false;
		if (anObject118 == null) {
			if (class7_3_.anObject118 != null)
				return false;
		} else if (!anObject118.equals(class7_3_.anObject118))
			return false;
		return true;
	}

	public int method600() {
		int i = 0;
		if (anObject117 != null)
			i += anObject117.hashCode();
		if (anObject118 != null)
			i += 31 * anObject118.hashCode();
		return i;
	}

	public int method601() {
		int i = 0;
		if (anObject117 != null)
			i += anObject117.hashCode();
		if (anObject118 != null)
			i += 31 * anObject118.hashCode();
		return i;
	}
}
