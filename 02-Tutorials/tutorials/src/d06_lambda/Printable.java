package d06_lambda;

@FunctionalInterface
public interface Printable {

//    void print();
//    void print(String suffix);
    String print(String suffix, String prefix);

    // Burada tek bir metod olmalı.
}
