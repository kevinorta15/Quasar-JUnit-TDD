import org.junit.Test;
import static org.junit.Assert.*;
public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String pass){
        String hash = "";
        for (char character : pass.toCharArray()){
            switch (character){
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }
        return hash;
    }

    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }
}
