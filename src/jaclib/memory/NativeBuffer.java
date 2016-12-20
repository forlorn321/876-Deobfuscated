/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int anInt2253 = -1513720125;
	private long aLong2254;

	protected NativeBuffer() {
		/* empty */
	}

	public final int method1() {
		return -1338599915 * anInt2253;
	}

	public final long method2() {
		return -1159526282210003889L * aLong2254;
	}

	public void method3(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == -1159526282210003889L * aLong2254 | null == is | i < 0 | i + i_1_ > is.length | i_0_ < 0 | i_0_ + i_1_ > -1338599915 * anInt2253)
			throw new RuntimeException();
		put(aLong2254 * -1159526282210003889L, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public final long method4() {
		return -1159526282210003889L * aLong2254;
	}

	public void method5(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == -1159526282210003889L * aLong2254 | null == is | i < 0 | i + i_7_ > is.length | i_6_ < 0 | i_6_ + i_7_ > -1338599915 * anInt2253)
			throw new RuntimeException();
		put(aLong2254 * -1159526282210003889L, is, i, i_6_, i_7_);
	}

	public final int method6() {
		return -1338599915 * anInt2253;
	}

	public final int method7() {
		return -1338599915 * anInt2253;
	}
}
