/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class20 {
	public Object anObject204;
	public Object anObject205;

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Class20))
			return false;
		Class20 class20_0_ = (Class20) object;
		if (anObject205 == null) {
			if (class20_0_.anObject205 != null)
				return false;
		} else if (!anObject205.equals(class20_0_.anObject205))
			return false;
		if (anObject204 == null) {
			if (class20_0_.anObject204 != null)
				return false;
		} else if (!anObject204.equals(class20_0_.anObject204))
			return false;
		return true;
	}

	public String toString() {
		return new StringBuilder().append(anObject205).append(", ").append(anObject204).toString();
	}

	public Class20(Object object, Object object_1_) {
		anObject205 = object;
		anObject204 = object_1_;
	}

	public int method771() {
		int i = 0;
		if (anObject205 != null)
			i += anObject205.hashCode();
		if (anObject204 != null)
			i += 31 * anObject204.hashCode();
		return i;
	}

	public boolean method772(Object object) {
		if (object == null || !(object instanceof Class20))
			return false;
		Class20 class20_2_ = (Class20) object;
		if (anObject205 == null) {
			if (class20_2_.anObject205 != null)
				return false;
		} else if (!anObject205.equals(class20_2_.anObject205))
			return false;
		if (anObject204 == null) {
			if (class20_2_.anObject204 != null)
				return false;
		} else if (!anObject204.equals(class20_2_.anObject204))
			return false;
		return true;
	}

	public int hashCode() {
		int i = 0;
		if (anObject205 != null)
			i += anObject205.hashCode();
		if (anObject204 != null)
			i += 31 * anObject204.hashCode();
		return i;
	}

	public int method773() {
		int i = 0;
		if (anObject205 != null)
			i += anObject205.hashCode();
		if (anObject204 != null)
			i += 31 * anObject204.hashCode();
		return i;
	}

	public boolean method774(Object object) {
		if (object == null || !(object instanceof Class20))
			return false;
		Class20 class20_3_ = (Class20) object;
		if (anObject205 == null) {
			if (class20_3_.anObject205 != null)
				return false;
		} else if (!anObject205.equals(class20_3_.anObject205))
			return false;
		if (anObject204 == null) {
			if (class20_3_.anObject204 != null)
				return false;
		} else if (!anObject204.equals(class20_3_.anObject204))
			return false;
		return true;
	}

	public int method775() {
		int i = 0;
		if (anObject205 != null)
			i += anObject205.hashCode();
		if (anObject204 != null)
			i += 31 * anObject204.hashCode();
		return i;
	}

	public String method776() {
		return new StringBuilder().append(anObject205).append(", ").append(anObject204).toString();
	}
}
