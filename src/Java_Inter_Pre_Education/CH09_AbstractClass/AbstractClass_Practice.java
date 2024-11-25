package Java_Inter_Pre_Education.CH09_AbstractClass;

// Practice
// 아래 Device 추상 클래스를 이용하여 UsbPort1 클래스와 WiFi 클래스를 구현

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }

    // 추상 메서드 오버라이딩
    void deviceInfo() {
        System.out.println("ID = " + this.deviceId);
    }

    void connect() {
        System.out.println("연결 하였습니다.");
    }

    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

// WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) {
        this.deviceId = id;
    }

    // 우클릭 > Generate > Implement Method 클릭하여 반드시 오버라이딩 해줘야할 부분을 자동으로 작성 가능
    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}

public class AbstractClass_Practice {
    public static void main(String[] args) {
        // Test Code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi1 = new WiFi(0);
    }
}
