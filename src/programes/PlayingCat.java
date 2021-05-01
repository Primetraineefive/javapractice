package programes;

/**
 * Created by Jay
 */
public class PlayingCat {

    public boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            if (temperature>=25 && temperature<= 35){
                return true;
            }else {
                return false;
            }
        }else {
            if (temperature>=25 && temperature<= 35){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PlayingCat cat = new PlayingCat();
        System.out.println(cat.isCatPlaying(true,10));
//        System.out.println(cat.isCatPlaying(false,36));
//        System.out.println(cat.isCatPlaying(false,35));
    }




}
