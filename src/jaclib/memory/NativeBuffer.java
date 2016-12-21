/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int anInt2253 = 504943405;
	private long aLong2254;

	protected NativeBuffer() {
		/* empty */
	}

	public final int method1() {
		return anInt2253 * -2067657893;
	}

	public final long method2() {
		return -4620932645255333459L * aLong2254;
	}

	public void method3(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == aLong2254 * -4620932645255333459L | null == is | i < 0 | i_1_ + i > is.length | i_0_ < 0 | i_0_ + i_1_ > anInt2253 * -2067657893)
			throw new RuntimeException();
		put(aLong2254 * -4620932645255333459L, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public void method4(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == aLong2254 * -4620932645255333459L | null == is | i < 0 | i_7_ + i > is.length | i_6_ < 0 | i_6_ + i_7_ > anInt2253 * -2067657893)
			throw new RuntimeException();
		put(aLong2254 * -4620932645255333459L, is, i, i_6_, i_7_);
	}

	public final long method5() {
		return -4620932645255333459L * aLong2254;
	}

	public final long method6() {
		return -4620932645255333459L * aLong2254;
	}

	public final long method7() {
		return -4620932645255333459L * aLong2254;
	}

	public final int method8() {
		return anInt2253 * -2067657893;
	}

	public final int method9() {
		return anInt2253 * -2067657893;
	}

	public final int method10() {
		return anInt2253 * -2067657893;
	}
}
