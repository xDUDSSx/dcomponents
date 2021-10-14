package net.dudss.dcomponents.renderers;

import net.dudss.dcomponents.data.Pair;

import javax.swing.*;
import java.awt.*;

public class StringObjectPairListCellRenderer extends DefaultListCellRenderer {
	@SuppressWarnings("rawtypes")
	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		Component comp = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		if (value instanceof Pair) {
			Pair pair = (Pair) value;
			JLabel label = (JLabel) comp;
			label.setText(pair.getL().toString());
		}
		return comp;
	}
}
