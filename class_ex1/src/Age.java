public class Age {
    public static void main(String[] args) {
        int birth = 1990;
        int now;
        System.out.println(birth + "年に生まれた湊くんは、");
        now = 2022;
        System.out.println("10年後の" + now + "年には" + (now-birth) + "歳です");

        now = 2042;
        System.out.println("10年後の" + now + "年には" + (now-birth) + "歳です");

        now = 2062;
        System.out.println("10年後の" + now + "年には" + (now-birth) + "歳です");
    }
}