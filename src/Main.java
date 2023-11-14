public class Main {

    // 1. parenthesesCheck
public static Boolean parenthesesCheck(String str) {
    int openCount = 0;
    int closeCount = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.charAt(i) == '(') {
            openCount ++;
        }
        if (str.charAt(i) == ')') {
            closeCount ++;
        }
    }
    if (openCount == closeCount) {
        return true;
    }
    return false;
}

    // 2. reverseInteger
public static String reverseInteger(int s) {
    String str = s + "";
    String output = "";
    for (int i = str.length()-1; i > 0; i--) {
        output += str.charAt(i);
    }
    return output;
}

    // 3. encryptThis
public static String encryptThis(String str) {
    String output = "";
    String[] wordsArray = str.split(" ");
    int wordIndex = 0;
    String word = "";
    for (int j = 0; j < wordsArray.length; j++) {
        wordsArray[j] = ((int)str.charAt(0)) + (str.charAt(wordsArray[j].length()-1) + wordsArray[j].substring(2,wordsArray[j].length()-1))+wordsArray[j].charAt(1);
        output += wordsArray[j] + (j == wordsArray.length-1?"": " "); // ternary operator if j is equals to last letter return empty string, else return space
    }
    return output;
}

    // 4. decipherThis
public static String decipherThis(String str) {

}

}