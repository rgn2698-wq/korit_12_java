package ch16_bean;


import lombok.*;

@AllArgsConstructor
@ToString
@RequiredArgsConstructor
@Getter
public class UserEntityLombok {
    private int userName;
    @Setter
    private int password;
    @NonNull
    private String email;
    private String name;

}
