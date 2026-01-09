package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity(1, 9876, "a@test.com", "이승우");

        System.out.println(user1);
        System.out.println(user1.getName());


        UserEntityLombok user2 = new UserEntityLombok(1,9876, "a@test.com","승" );

        System.out.println(user2);

    }
}
