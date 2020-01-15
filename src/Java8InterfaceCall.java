public class Java8InterfaceCall {

    public static void main(String[] args) {
        new A1().vishal();
    }

}


interface i1 {

    default void vishal(){
        System.out.println("i1");
    }
}

interface i2 {

    default void vishal(){
        System.out.println("i2");
    }
}

class A1 implements i1, i2 {

    @Override
    public void vishal()
    {
        i1.super.vishal();
    }

}