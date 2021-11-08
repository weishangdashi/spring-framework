package com.imooc.pattern.eventmode;

public class EnentModeDemo {

	public static void main(String[] args) {
		EventSource eventSource= new EventSource();
		SingleClickEventListener singleClickEventListener=new SingleClickEventListener();
		DoubleClickEventListener doubleClickEventListener=new DoubleClickEventListener();
		Event event=new Event();
		event.setType("doubleclick");
		eventSource.register(singleClickEventListener);
	eventSource.register(doubleClickEventListener);
	eventSource.publishEvent(event);
	}
}
