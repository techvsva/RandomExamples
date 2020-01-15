public class Covariance {

    public static void main(String args[]) {

        A a = new A();
        A ta = a.covarianceMsg("Covariance check");
        System.out.println(ta.getClass());
    }
}

class A extends CovarianceType {

    @Override
    public A covarianceMsg(String msg) {
        System.out.println("child method");
        System.out.println(msg);
        return new A();
    }
}

class CovarianceType {

    public CovarianceType covarianceMsg(String msg) {
        System.out.println("parent method");
        System.out.println(msg);
        return new CovarianceType();
    }
}