/* Class536_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class ChangeClanSettings extends Class536 {
	abstract void applySetting(Clan clan);

	abstract void decodeSetting(RSByteBuffer class536_sub33);

	ChangeClanSettings() {
		/* empty */
	}

	public static boolean method9591(int i) {
		return Class508.anInterface60_6916 != null;
	}
}
