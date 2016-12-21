/* Class536_Sub33_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;

public class Class536_Sub33_Sub1 extends RSByteBuffer {
	void method10740(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
	}

	Class536_Sub33_Sub1(int i) {
		super(i);
	}

	void method10741(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) i;
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 8);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 16);
		buffer[(off += 516175515) * -810172525 - 1] = (byte) (i >> 24);
	}
}
