class Solution {
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> retList = new ArrayList<>();
        if (s.length() < 4)
            return retList;
        String t = "";
        for (int i0 = 1; i0 < 4; i0++) {
            for (int i1 = i0 + 1; i1 < i0 + 4; i1++) {
                for (int i2 = i1 + 1; i2 < i1 + 4; i2++) {
                    t = valIp(s, i0, i1, i2);
                    if (t == null)
                        continue;
                    retList.add(t);
                }
            }
        }
        return retList;
    }

    private String valIp(String s, int i0, int i1, int i2) {
        if (i2 >= s.length() || s.length() - i2 > 3)
            return null;
        String retArr = "";
        String strArr[] = new String[4];
        int t;
        strArr[0] = s.substring(0, i0);
        strArr[1] = s.substring(i0, i1);
        strArr[2] = s.substring(i1, i2);
        strArr[3] = s.substring(i2, s.length());
        for (int i = 0; i < 4; i++) {
            t = Integer.parseInt(strArr[i]);
            if (t > 255)
                return null;
            if (String.valueOf(t).length() != strArr[i].length())
                return null;
            if (i != 3)
                retArr += strArr[i] + ".";
            else
                retArr += strArr[i];
        }
        return retArr;
    }
}