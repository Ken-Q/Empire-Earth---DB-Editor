package gui.components;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

import datmanager.Core;

public class JButtonRed extends JButton {
	
	private static final long serialVersionUID = -7170626623468679349L;
	
	{
		setBackground(Core.UI_COLOR_ELEMENT);
		setForeground(Color.WHITE);
	}

	public JButtonRed(String name){
		super(name);
		super.setContentAreaFilled(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (getModel().isPressed()) {
			g.setColor(Core.UI_COLOR_ELEMENT3);
		} else if (getModel().isRollover()) {
			g.setColor(Core.UI_COLOR_ELEMENT2);
		} else {
			g.setColor(Core.UI_COLOR_ELEMENT);
		}
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}
	
}
