package ch18_generic.bmi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private double weight;
    private double height;
}
