
public class App {
    public static void main(String[] args) throws Exception {
        String intro = AppExtra.introString();
        System.out.println(intro);

        String fullIntro = addXPoint(intro);
        System.out.println(fullIntro);
    }

    private static String addXPoint(String content) {
        return content + "!";
    }





}

