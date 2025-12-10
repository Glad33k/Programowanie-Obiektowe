package zad4;

public class TestMyComparator implements MyComparator{
    int a;
    int b;

    public TestMyComparator(int a, int b) {
        this.a = a;
        this.b = b;
    }



    public static void main(String[] args) {
        TestMyComparator t1=new TestMyComparator(1,2);
        System.out.println(t1.compare(t1.a,t1.b));
    }

    @Override
    public int compare(int a, int b) {
        return Integer.compare(a,b);
    }
}
