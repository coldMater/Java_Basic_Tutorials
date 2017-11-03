package exam_interface;

public class Main {

	public static void main(String[] args) {
		BluetoothMouse bluetoothMouse = new BluetoothMouse();
		
		Mouse mouse = bluetoothMouse;
		IBluetooth iBluetooth = bluetoothMouse;
		
		mouse.rightClick();
		mouse.leftClick();
		
		iBluetooth.paring("A001VF1002");
	}

}
