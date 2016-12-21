/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int anInt1328;
	private boolean aBool1329;

	public NativeHeap(int i) {
		anInt1328 = -1514118655 * i;
		allocateHeap(anInt1328 * -138174975);
		aBool1329 = true;
	}

	synchronized boolean method1439() {
		return aBool1329;
	}

	public NativeHeapBuffer method1440(int i, boolean bool) {
		if (!aBool1329)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void method1441() {
		if (aBool1329)
			deallocateHeap();
		aBool1329 = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected synchronized void finalize() throws Throwable {
		super.finalize();
		method1441();
	}

	protected synchronized void method1442() throws Throwable {
		super.finalize();
		method1441();
	}

	protected synchronized void method1443() throws Throwable {
		super.finalize();
		method1441();
	}

	synchronized boolean method1444() {
		return aBool1329;
	}

	synchronized boolean method1445() {
		return aBool1329;
	}

	public synchronized void method1446() {
		if (aBool1329)
			deallocateHeap();
		aBool1329 = false;
	}

	public synchronized void method1447() {
		if (aBool1329)
			deallocateHeap();
		aBool1329 = false;
	}
}
