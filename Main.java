public class Main {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void methodA() {
                System.out.println("New A");
            }
        };
        a.methodA();
    }
}
