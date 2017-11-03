package Inheritance;

public class MouseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse mouse = new Mouse();
		mouse.rightClick();
		mouse.lefrClick();
		mouse.drag();
		
		WheelMouse wheelMouse = new WheelMouse();
		wheelMouse.rightClick();
		wheelMouse.lefrClick();
		wheelMouse.drag();
		wheelMouse.wheel();
	}

}
