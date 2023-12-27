import java.util.ArrayList;
import java.util.List;
public class Cafemenu {
    public static void main(String[] args) {
            menulist drink1 = new menulist("hot coffee", "hot", 300);
            menulist drink2 = new menulist("ice coffee", "cold", 300);
            menulist drink3 = new menulist("special coffee", "hot", 500);
            menulist drink4 = new menulist("wow coffee","apollon",1000000000);
            List<menulist> menulists = new ArrayList<>();
            menulists.add(drink1);
            menulists.add(drink2);
            menulists.add(drink3);
            menulists.add(drink4);

            boolean foundMenu = false;

        try {
            for (menulist menulist : menulists) {
                if (menulist.gettemperture().equals("hot")) {
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                    System.out.println("メニュー名：" + menulist.getname());
                    System.out.println("値段：" + menulist.getprice());
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                    foundMenu = true;
                }
            }
            if (!foundMenu) {
                System.out.println("お探しのメニューは見つかりませんでした；；");}

            } catch (Exception e) {
                System.out.println("エラーが発生しました");}
    }
}

