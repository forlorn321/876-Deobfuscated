/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class572;

public abstract class TwitchEvent {
	public int eventType;

	public TwitchEvent(int i) {
		eventType = i;
	}

	public abstract void method4951(int[] is, long[] ls, Object[] objects);

	public abstract Class572 method4952();

	public abstract Class572 method4953();

	public abstract Class572 method4954();

	public abstract void method4955(int[] is, long[] ls, Object[] objects);
}
