/* Class536_Sub18_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5ArchiveRequest extends Class536_Sub18_Sub15 {
	RSByteBuffer aClass536_Sub33_12114;
	byte aByte12115;

	int method10775() {
		if (aClass536_Sub33_12114 == null)
			return 0;
		return (aClass536_Sub33_12114.off * 587126124 / (aClass536_Sub33_12114.buffer.length - aByte12115));
	}

	byte[] method10771(int i) {
		if (aBool11777 || (-810172525 * aClass536_Sub33_12114.off < aClass536_Sub33_12114.buffer.length - aByte12115))
			throw new RuntimeException();
		return aClass536_Sub33_12114.buffer;
	}

	int method10770(int i) {
		if (aClass536_Sub33_12114 == null)
			return 0;
		return (aClass536_Sub33_12114.off * 587126124 / (aClass536_Sub33_12114.buffer.length - aByte12115));
	}

	byte[] method10773() {
		if (aBool11777 || (-810172525 * aClass536_Sub33_12114.off < aClass536_Sub33_12114.buffer.length - aByte12115))
			throw new RuntimeException();
		return aClass536_Sub33_12114.buffer;
	}

	int method10774() {
		if (aClass536_Sub33_12114 == null)
			return 0;
		return (aClass536_Sub33_12114.off * 587126124 / (aClass536_Sub33_12114.buffer.length - aByte12115));
	}

	int method10772() {
		if (aClass536_Sub33_12114 == null)
			return 0;
		return (aClass536_Sub33_12114.off * 587126124 / (aClass536_Sub33_12114.buffer.length - aByte12115));
	}

	JS5ArchiveRequest() {
		/* empty */
	}
}
