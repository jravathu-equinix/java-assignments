package history;

import java.util.ArrayDeque;

public class History {
    static ArrayDeque<String> history= new ArrayDeque<>();

    public void addHistory(String calculation)
    {
        if(this.history.size()<5) {
            this.history.addFirst(calculation);
        }
        else{
            this.history.removeLast();
            this.history.addFirst(calculation);
        }
    }

    public void showHistory(){
        System.out.println("\nLast 5 calculations: ");
        this.history.forEach((calculation) -> System.out.println(calculation));
    }
}
