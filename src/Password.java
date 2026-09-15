import java.util.*;

public class Password {
    public String GetUpper(){
        String[] upper = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int randy = (int)((Math.random()*26));
        return upper[randy];
    }
}
