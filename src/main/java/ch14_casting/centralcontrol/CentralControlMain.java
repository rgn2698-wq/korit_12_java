package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        Airconditioner airConditioner1 = new Airconditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        // 이하의 코드는 비어있는 배열을 CentralControl 클래스의 field인 deviceArray에 집어넣음.
        CentralControl centralControl1 = new CentralControl(new Power[10]);
        // 이하의 코드는 powers 배열을 만든 다음에 내부에 Power의 하위 클래스들의 객체를 집어넣음
        Power[] powers = {new Airconditioner(), new Computer(), new Mouse(), new LED(), new Printer(), new Speaker()}; // 여기서 이루어짐.
        /*
            여기서 각 전자기기들의 객체를 생성하고 여기서 집어넣는것 까지 전체 다 실행을 할거기때문에
            powers를 직접 쓰지는 않고, Power가 interface이기 때문에 객체 생성이 안되는데 배열을 만들 수 없는가를
            검증하기 위해 코드를 남겨둠.
         */
//        centealControl1.deviceArray 에 접근하는것이 불가능. 접근 제어자가 private이기 때문.
        // 그렇다면 centralControl1.deviceArray에 Power의 하위클래스인 AirConditioner 등의 객체를 집어넣기 위해서는
        // public method를 경유 해야할것 -> CentralControl 클래스의 public method를 정의해야 함.

        centralControl1.addDevice(airConditioner1); // 여기서 업캐스팅이 이루어졌습니다.
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
        centralControl1.addDevice(led1);
        centralControl1.addDevice(led1);

        centralControl1.powerOn();
        centralControl1.powerOff();

        centralControl1.showInfo();

        centralControl1.performSpecificMethod();

        System.out.println("------------------- Printer / Speaker 추가 이후 --------------------");

        // Printer / Speaker 객체 생성
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        centralControl1.addDevice(printer1);
        centralControl1.addDevice(speaker1);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        centralControl1.powerOn();
        centralControl1.powerOff();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        centralControl1.showInfo();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        centralControl1.performSpecificMethod();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

//        centralControl1.deviceArray[0] = null;
        /*
            이상의 코드는 deviceArray가 public 접근 제어자일 경우에만 성립합니다.
            하지만 캡슐화를 위해서 private으로 선언해놨다면
            저희는 method를 경유하여 deviceArray 배열 내에 있는 특정 index의 객체를 삭제할 수도 있을 것 같습니다.

            deleteDevice()를 2 개 정의하시오.
         */
        centralControl1.showInfo();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        centralControl1.deleteDevice(3);
        centralControl1.deleteDevice(computer1);

        centralControl1.showInfo();

    }
}
