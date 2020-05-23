package es.geeksusma.brackets;

/**
 * Not so nice solution, only a 25% because I badly assume no {} can be enclosed by ()
 */
class Brackets {

    public int solution(String S) {
        if (S == null || "".equals(S)) {
            return 1;
        }
        if (!beginningAndEndWellFormed(S, "{", "}")) {
            return 0;
        }
        if (!beginningAndEndWellFormed(S.substring(1, S.length() - 1), "[", "]")) {
            return 0;
        }
        String pendingString = S.substring(2, S.length() - 2);
        for (int i = 0; i < pendingString.length(); i++) {
            if (pendingString.charAt(0) == '(') {
                if (!beginningAndEndWellFormed(pendingString, "(", ")")) {
                    return 0;
                }
            } else if (pendingString.charAt(0) == ')') {
                if (!beginningAndEndWellFormed(pendingString, ")", "(")) {
                    return 0;
                }
            }
            pendingString = pendingString.substring(1, pendingString.length() - 1);
        }
        return 1;
    }


    boolean beginningAndEndWellFormed(String s, String init, String end) {
        return s.startsWith(init) && s.endsWith(end);
    }
}
