package MathForKate;

public class MathForKate {

    public static void main(String[] args) throws Exception {

        Operations math = new Operations();
        math.setMaxVal(20);
        math.setMinVal(0);
        math.setNumOfTasks(21);

        MathFileWriter mfw = new MathFileWriter();
        mfw.all();


    }
}
