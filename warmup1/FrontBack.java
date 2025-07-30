public class FrontBack {
    public String frontBack(String str) {
        int len = str.length();

        if (len <= 1) {
            return str;
        }

        String mid = str.substring(1, len - 1);
        return str.charAt(len - 1) + mid + str.charAt(0);
    }
}

