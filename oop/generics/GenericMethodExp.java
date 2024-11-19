public class GenericMethodExp<U, T> {
    U a;
    T b;

    //constructor
    GenericMethodExp(U a, T b) {
        this.a = a;
        this.b = b;
    }

    // Generic print method
    <U, T> void print() {
        System.out.println(a);
        System.out.println(b);
    }
    // Generic print method (overloading)
    <X, Y> void print(X a, Y b) {
        System.out.println(a);
        System.out.println(b);
    }

}

class Main {
    public static void main(String[] args) {
        GenericMethodExp<Integer, String> obj = new GenericMethodExp<>(4, "this");
        
        // Calling the generic print method
        obj.print();
        //passing different typees to print method
        obj.print("Hello", 6);
    }
}

