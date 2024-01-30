package fc.java.poly;

public class TV implements RemoCon{
    // chUp(),chDown(),volUp(),volDown()
    @Override
    public void chUp() {
        System.out.println("Tv의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("Tv의 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("Tv의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("Tv의 소리가 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("Tv에서 인터넷이 실행된다.");
    }
}
