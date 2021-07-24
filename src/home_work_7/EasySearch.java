package src.home_work_7;

public class EasySearch implements ISearchEngine{
    private int result;
    private long counter;
    private boolean lever;

    public EasySearch() {
    }

    public long search(String text, String word) {
        lever = true;
        counter = 0;
        result = 0;
        while (lever) {
            if(counter == 0) {
                result = text.indexOf(word);
                if (result != -1) {
                    counter ++;
                    result += word.length();
                } else {
                    lever = false;
                    break;
                }
            } else {
                result = text.indexOf(word,result);
                if(result != -1) {
                    counter++;
                    result += word.length();
                } else {
                    lever = false;
                    break;
                }
            }
        }
        return counter;
    }
}
