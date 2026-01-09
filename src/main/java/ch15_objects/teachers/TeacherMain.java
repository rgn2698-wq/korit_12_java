package ch15_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수","코리아아카데미");
        Teacher teacher2 = new Teacher("안근수","코리아아카데미");
        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher1);
        System.out.println(result1);

        /*
            이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는 겁니다.
            Teacher에서 .equals)_를 재정의 하기 전에는 false가 떳음.
            그때는 teacher1과 re
         */

        Class tClass = teacher1.getClass(); // 지난 시간에함
        System.out.println(tClass); // 결과값: class ch15_objects.teachers.Teacher
        System.out.println(tClass.getSimpleName().equals("Teacher"));
        System.out.println(tClass.getClass().getSimpleName());
        // 어느 수준까지는 그냥 작성할지, 아니면 너무 기니까 어느부분은 달라서
        // 변수에 대입할지 자체 상황 / 조직 성향에 따라 결정해야함.

        Field[] fields = tClass.getDeclaredFields();

        System.out.println(fields);

        // 두가지 방법으로 field를 확인할수 있을것 같습니다.
        // 1. 반복문 사용 / 2. Arrays를 사용하는 방법

        System.out.println(Arrays.toString(fields));
        for (int i = 0 ; i < fields.length ; i++) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
        }
        // 이상에서 클래스 명에서  주의할 점: Teacher이라는 원본의 자료명이 아니라 field의 자료명을 이미.

        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지 명 + 클래스 명 출력 : " + field.getType().getSimpleName());
        }


        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("메서드명 출력: " + method.getName());
            System.out.println("리턴 타입 출력: " + method.getReturnType());
            System.out.println();
        }
        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아 아카데미");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);

        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_objects.Teacher
         */

    }
}
