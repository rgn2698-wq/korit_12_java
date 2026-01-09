package ch14_casting.centralcontrol;

public class CentralControl2 {
    private Power[] deviceArray;

    public CentralControl2(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }


    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();

        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");

    }


    private int checkEmpty() {
        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }




    public void powerOn() {

        for (Power power : deviceArray) {
            if (power == null) {
                System.out.println("장치가 없어 실행하지 못했습니다.");
                continue;

            }
            power.on();
        }

    }

    public void powerOff() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어서 전원을 끌 수 없습니다.");
                continue;
            }
            device.off();
        }
    }



    public void showInfo() {
        int i = 0;
        for ( Power device : deviceArray ) {
            if(device == null) {
                System.out.println("슬롯 [ " + ++i + " ] 번 : Empty" );
                continue;
            }
            System.out.println("슬롯 [ " + ++i + " ] 번 :" + device.getClass().getSimpleName());
        }
    }


    public void performSpecificMethod() {
        for ( Power device : deviceArray ) {
            if(device instanceof Airconditioner) {
                Airconditioner airConditioner = (Airconditioner) device;
                airConditioner.changeMode();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device == null) {
                System.out.println("연결되지 있지 않습니다.");
            } else {
                System.out.println("아직 지원되지 않는 전자기기입니다.");
            }
        }
    }


    public void deleteDevice(int slot) {
        if (slot >= 0 && slot < deviceArray.length && deviceArray[slot] != null) {
            deviceArray[slot] = null;
        }
    }

    public void deleteDevice(Power device) {
        for (int j = 0; j < deviceArray.length; j++) {
            if (deviceArray[j] == device) {
                deviceArray[j] = null;
            }
        }
    }

}

