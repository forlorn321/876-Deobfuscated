/* Class686 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class686 {
	public static Object method13951(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static Object method13952(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static Object method13953(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static byte[] method13954(Object object, boolean bool) {
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method13955(Object object, int i, int i_0_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_0_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_0_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_0_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	Class686() throws Throwable {
		throw new Error();
	}

	public static Object method13956(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static Object method13957(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static byte[] method13958(Object object, int i, int i_1_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_1_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_1_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_1_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static Object method13959(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}
}
