package ch22_lambda;

@FunctionalInterface        // 함수형 인터페이스라는 것은 명시.
public interface Calculator {
    int compute(int a, int b);
}
