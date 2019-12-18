package 牛客网;

public class Test {
    public static void main(String[] args) {
        System.out.println(rolateEqual("abcde","cdeab"));
    }


    public static String rolateEqual(String str_1,String str_2){
        if(str_1.length()!=str_2.length()){
            return "False";
        }
        if(str_1.length() == 0){
            return "True";
        }
        str_2 +=str_2;

        for (int i=0;i<str_2.length();i++){
            if (str_2.charAt(i) == str_1.charAt(0)){
                int k=i+1;
                for(int j=1;j<str_1.length() && k<str_2.length();j++){
                    if(str_1.charAt(j)!=str_2.charAt(k)){
                        break;
                    }
                    k++;
                }
                if(k== i+str_1.length()){
                    return "True";
                }
            }
        }
        return "False";


    }
}
