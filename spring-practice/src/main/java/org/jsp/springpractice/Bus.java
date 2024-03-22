package org.jsp.springpractice;

public class Bus {
	private Engine engine;

	private Bus() {
	}

	public Bus(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
