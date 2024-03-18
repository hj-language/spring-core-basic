package hello.core.singleton;

public class SingletonService {

    // static 영역에 인스턴스를 하나만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    // 조회
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
