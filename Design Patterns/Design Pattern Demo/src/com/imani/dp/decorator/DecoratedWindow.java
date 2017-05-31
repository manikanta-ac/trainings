package com.imani.dp.decorator;

public abstract class DecoratedWindow implements Window {
	private Window simpleWindow = null;

	public DecoratedWindow(Window simpleWindow) {
		this.simpleWindow = simpleWindow;
	}

	@Override
	public void renderWindow() {
		simpleWindow.renderWindow();
	}

}
