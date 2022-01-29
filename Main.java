import example.ExamplePackage;

public class Main {
    public static void hoge() {
        System.out.println("hoge!");
    }
    public static void fuga() {
        System.out.println("fuga!");
    }
    public static void main(String[] args) {
        ExamplePackage myObj = new ExamplePackage();
        Main.hoge();
        Main.fuga();
        myObj.main();
    }
}

