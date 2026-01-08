package ch14_casting.centralcontrol;

public class CentralControl {
    // field 선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    /*
        그래서 여기에 deviceArray에 element를 추가하는 메서드를 작성할건데,
        배열의 특성 상 lastIndex+1 개의 방을 가지게 될겁니다. 그런데 5개의 방을
        가지고 있는데 6개 째의 Power 하위 클래스의 객체를 집어넣게 되면 오류가
        발생하게 될거라는 걸 추측할 수 있으므로,
        우리는 추가하기 전에 일단 배열에 비어있는 곳이 있는지를 체크하도록 할 예정입니다.
        그러면 추가하는 메서드를 정의할 때의 로직은
        1. deviceArray 필드 내에 비어있는 방이 있는지 체크
        2. 비어있다면 추가
        3. 없다면 거절
        의 단계로 메서드를 작성할 필요가 있을 것 같습니다.
     */
    public void addDevice(Power device) {
        // 1. 비어있는지 체크
        int emptyIndex = checkEmpty();
//        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
//            if(deviceArray[i] == null) emptyIndex = i;
//            else emptyIndex = -1;
//        }
        // 2. 조건문 작성해서 비어있으면 추가 / 없으면 연결 못한다고 안내
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;     // 그래야 35번 라인이 실행 안돼서 추가 자체를 안시킬거니까.
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");
        /*
            .getClass() -> 클래스명을 return하는 method -> 패키지명.클래스 형태로 return
            .getClass().getSimpleName() -> 클래스명만 return

            여기까지 작성했을 때, 결과적으로 addDevice()라는 메서드 내에
            1. 비어있는 index를 확인하는 메서드 하나
            2. 추가하는 메서드 하나
            로 두 개로 이루어져 있음을 알 수 있습니다.
         */
    }

    // 비어있는 인덱스를 굳이 외부로 노출할 필요가 없기 때문에
    private int checkEmpty() {
        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }
    /*
        Java의 index 넘버에는 음수값이 없기 때문에(python에는 있지만), 실패를 나타낼 때 -1을
        쓰는 경우가 많습니다. 하지만 0 과 너무 가까운 수이다보니까 조직에 따라서 -100이라든지
        아니면 return으로 나올 수 없을 만한 음수값을 지정하는 경우도 있는데,
        아까 위에 addDevice() 메서드에서 if(emptyIndex == -4293058)로 쓰고 싶지 않으면
        -1 쓰는게 정신 건강에 좋습니다.
     */

    /*
        deviceArray는 Power[] 배열로 이루어져있습니다. -> 그러면 interface Power 내부에
        .on()이라는 메서드가 있으므로
        Power[] 배열 내에 있는 element들은 전부 .on() 메서드를 강제로 구현했어야만 합니다.
        그러니까 객체명.on();을 호출해주기만 한다면 deviceArray() 내부에 있는 element들은 전부
        전원이 켜지겠네요.
     */

    public void powerOn() {
        /*
            해당 클래스의 필드인 Power[] 배열 내에 있는 객체들은 기본적으로
            Power의 서브 클래스의 객체들입니다.
            즉, on() / off() method를 공통적으로 지니고 있습니다.
            그리고 Power 자료형으로 업캐스팅도 되어있습니다.

            배열 내부를 탐색해야하니까 -> 반복문
            그러면 deviceArray[i]는 업캐스팅된 Power의 서브클래스의 인스턴스
            즉 deviceArray[i].on();이 존재할거라는 의미입니다.
            반복문 돌면서 deviceArray[i].on(); 이거 실행시켜주면 전부 다 켜지겠네요.
         */
        for ( int i = 0 ; i  < deviceArray.length ; i++ ) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 없어 실행하지 못했습니다.");
                continue;       // return; 으로 마무리 했을 때와의 콘솔 상에서의 차이점을 확인하면 더 명확해집니다.
                /*
                    break;는 반복문을 즉시 종료하는 명령어고
                    return;은 method를 즉시 종료하는 명령어.
                    continue;는 현재 반복'만' 종료하고 다음 반복으로 넘어감.
                    즉, deviceArray[6] 이 null이라면 다음 반복으로 i++시켜서
                    deviceArray[7]을 검사하고 deviceArray.length 미만까지
                    전체 다 확인을 하는 형태라고 할 수 있습니다.

                    그러면 6번지는 비어있고 7번지에 Power 의 서브 클래스의
                    인스턴스가 존재하는 상황에서 6번지는 실행 안되고
                    7번지는 실행되겠네요.

                 */
            }
            deviceArray[i].on();
        }
        // 근데 아까 말한 것처럼 비어있는 index가 있다면 오류 발생합니다.
        /*
            예를 들어 5개짜리 배열 만들었는데 3 번지가 비어있으면
            0, 1, 2에서 on() 메서드를 호출하는데 성공하고,
            3에서 오류 발생하기 때문에
            4번 인덱스에서 on() 메서드를 아예 호출하지 못합니다.
         */

        /*
            powerOff() 메서드를 정의하고, Main에서 호출하시오.
            단 배열 내부를 탐색할 때 향상된 for문으로 작성하시오.
            장치가 없어 전원을 끌 수 없습니다.
         */
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
    /*
        현재 배열 내에 각 객체들이 들어가있습니다.
        객체명.getClass().getSimpleName()을 활용하면 클래스 네임만 출력된다는 것을 확인할 수 있는데,
        deviceArray를 반복 돌려서 몇 번 (인덱스+1)에 어떤 클래스의 객체가 있는지 표시하는
        showInfo 메서드를 정의하시오.
        실행 예
        슬롯 [ 1 ] 번 : Computer
        슬롯 [ 2 ] 번 : LED
        ...
        슬롯 [ 10 ] 번 : Empty
     */
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
// 이상과 같이 작성하신 분들은 일반 for문을 작성한 showInfo2()를 정의해보시면 되겠습니다.

    // downcasting 관련 - 즉 Power[]의 내부 element의 고유 메서드 호출
    public void performSpecificMethod() {
        for ( Power device : deviceArray ) {
            if(device instanceof Airconditioner) {
                Airconditioner airConditioner = (Airconditioner) device;
                airConditioner.changeMode();
            } else if (device instanceof Computer) {
                // 컴퓨터로 다운 캐스팅 명시적으로 해줘야 하고.
                Computer computer = (Computer) device;
                // 컴퓨터의 고유 메서드를 실행하면 되겠네요.
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


    public void deleteDevice(int index) {
        if (index >= 0 && index < deviceArray.length && deviceArray[index] != null) {
            deviceArray[index] = null;
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




/*
    Printer 클래스와 Speaker클래스를 생성하고 Power를 implement하시오
    Printer의 고유 메서드는 print() - 프린터가 인쇄를 합니다.
    Speaker의 고유 메소드는 changeEqual() - 스피커의 이퀄라이저를 변경합니다.

    Main에서 Printer / Speaker 인스턴스를 deviceArray에 추가하고
    .powerOn()
    .powerOff()
    .showInfo()
    .performSpecificMethod()를 호출 하시오.
 */
