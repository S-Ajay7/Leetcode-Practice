class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] temp = new String[arr.length + 1];
        for (String str : arr) {
            int n = (str.charAt(str.length() - 1) - '0');
            temp[n] = str.substring(0, str.length() - 1);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < temp.length; i++) {
            result.append(temp[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}