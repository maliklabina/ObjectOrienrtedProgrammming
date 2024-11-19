public class GenericClass<u,t> {
    u a;
    t b;

GenericClass(u a , t b){
    this.a = a;
    this.b = b;
}

void print(){
    System.out.println(a);
    System.out.println(b);
    }
}

class Main{
    public static void main(String[] args){
        GenericClass<Integer, String> obj = new GenericClass<Integer,String>(4,"this");
        obj.print();
    }
}