//https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelSheetColTitle_168 {
    public static void main(String[] args) {
        
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c = (char)(columnNumber%26 +'A');
            columnNumber /= 26;
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
