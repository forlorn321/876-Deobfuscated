/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class513 {
	Robot aRobot7009;

	public void setcustomcursor(Component component, int[] is, int i, int i_0_, Point point) {
		if (null != is) {
			BufferedImage bufferedimage = new BufferedImage(i, i_0_, 2);
			bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		} else
			component.setCursor(null);
	}

	public Class513() throws Exception {
		aRobot7009 = new Robot();
	}

	public void movemouse(int i, int i_1_) {
		aRobot7009.mouseMove(i, i_1_);
	}
}
