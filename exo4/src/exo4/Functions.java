package exo4;

public class Functions {

    private String alpha;
    private String str;

    public Functions(String s1 ,String s2 ){
        this.alpha = s1;
        this.str = s2;
    }

    public boolean verify(String alpha, String str) {

        if (alpha.equals(alpha.toUpperCase())) {
            if (str.equals(str.toUpperCase())) {
                if (alpha.contains(str)) {
                    return true;
                }
            }
        }else if (alpha.equals(alpha.toLowerCase())) {
            if (str.equals(str.toLowerCase())) {
                if (alpha.contains(str)) {
                    return true;
                }
            }

        }else{
            return false;
        }

        return false;
    }

    private String rotationLeft(int n ,String str ){

        int l = str.length();
        String resualt = new String();
        resualt =  str.substring(n,l) + str.substring(0,(n-1) ) ;

        return  resualt;
    }


}
