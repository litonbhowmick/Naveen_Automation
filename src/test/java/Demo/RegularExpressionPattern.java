package Demo;

public class RegularExpressionPattern {

    public static void main(String[] args) {

        String str = "aaa";
        String p = "a*";

        String[] strarr = str.split("");
        String[] pattern = p.split("");
        boolean flag=false;

        for (int i = 0; i < str.length(); i++) {
            if(pattern[i].contains("[a-zA-Z]")){
                if (pattern[i].equals(strarr[i])){
                    flag= true;
                } else if (pattern[i].contains(".")) {
                    if (strarr[i].length()==1){
                        flag=false;
                    }else{
                        flag = true;
                    }
                } else if (pattern[i].contains("*")) {
                    if (strarr[i].isEmpty()){
                        flag=false;
                    }else{
                        flag = true;
                    }
                } else {
                    flag=false;
                }
            }
            flag=false;
        }

        System.out.println(flag);




    }
}
