import java.util.*;

public class Password {
    public String GetUpper(){
        String[] upper = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int randy = (int)((Math.random()*26));
        return upper[randy];
    }

    public String GetLower(){
        String[] lower = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int randy = (int)((Math.random()*26));
        return lower[randy];
    }

    public String GetSpecial(){
        String[] spec = new String[]{"!","@","#","$","%","^","&","*","(",")","-","_","=","+","?","<",",",">",".",};
        int randy = (int)((Math.random()*19));
        return spec[randy];
    }
}
