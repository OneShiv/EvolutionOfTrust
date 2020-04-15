import java.util.Scanner;

public class ConsolePlayerBehavior implements PlayerBehavior{
   Scanner inputText;

    public ConsolePlayerBehavior(Scanner inputText) {
        this.inputText = inputText;
    }

    public MoveType move(){
        String inputText = null;
        inputText = this.inputText.nextLine();
        return MoveType.valueFor(inputText);
    }
}

// We should not instantiate Scanner instance here because
// say for this case we will put Scanner(System.in) but we always don't know it should be Sysstem.in or other
// hence should create instance first and pass as dependency so that is configured outside of this Class
