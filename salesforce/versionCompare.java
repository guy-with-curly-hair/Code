package salesforce;

public class versionCompare {

    public static void main(String[] args) {
        String version1="1.0.1";
        String version2="1";
        System.out.println(compareVersion(version1,version2));
    }

    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
        for(int i=0;i<v1.length || i<v2.length;i++) {
            int sv1 = i<v1.length?Integer.parseInt(v1[i]):0,
                    sv2 = i<v2.length?Integer.parseInt(v2[i]):0;
            if(sv1 < sv2)
                return -1;
            else if (sv2 < sv1)
                return 1;
        }
        return 0;
    }


}
