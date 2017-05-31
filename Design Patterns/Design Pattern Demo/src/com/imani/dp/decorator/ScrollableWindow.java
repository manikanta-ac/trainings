package com.imani.dp.decorator;

public class ScrollableWindow extends DecoratedWindow {

	public ScrollableWindow(Window simpleWindow) {
		super(simpleWindow);
	}

	@Override
	public void renderWindow() {
		super.renderWindow();
		addScrollBar();
	}

	private void addScrollBar() {
		System.out.println("Added scroll bar to window!!!");
	}
}
