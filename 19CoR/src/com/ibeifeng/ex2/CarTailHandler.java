package com.ibeifeng.ex2;

public class CarTailHandler extends CarHandler{

	public void HandlerCar() {
		System.out.println("��װ��β");
		if(this.carHandler != null) {
			this.carHandler.HandlerCar();
		}
	}

}
