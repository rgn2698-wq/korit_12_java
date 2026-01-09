package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest object1 = new ObjectTest();
        object1.setName("김일");
        object1.setAddress("부산광역시 연제구");

        object1.showInfo();

        ObjectTest object2 = new ObjectTest();
        object2.setName("김이");
        object2.setAddress("서울특별시 종로구");
        object2.showInfo();
        System.out.println(object2);


        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);
        System.out.println(result3);

        ObjectTest test1 = new ObjectTest();
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);
        boolean result5 = strArray[0] == test1.getName();
        boolean result6 = example == test1.getName();
        System.out.println(result5);
        System.out.println(result6);

        String example2 = new String("안녕하세요");
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);

        String example3 = new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);

        boolean result81 = "안녕하세요".equals(example2);
        System.out.println(result81);
        boolean result82 = example3.equals(example);
        System.out.println(result82);


    }
}
