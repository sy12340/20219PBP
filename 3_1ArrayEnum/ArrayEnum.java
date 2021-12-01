import java.util.Arrays;
import java.util.Scanner;

public class ArrayEnum {
    public static void main(String[] args) {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        int []value = new int[100];

        while (true) {
            final Command command = getCommand(sc);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(sc);
                    value[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(value,index);
                    break;
                case MAX:
                    System.out.println(value[0]);
                case MIN:
                    System.out.println(value[value.length-1]);
                case SUM:
                    int sum = 0;
                    for(int i = 0; i < index; i++){
                        sum += value[i];
                    }
                    System.out.println(sum);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                default:
                    System.out.println("Invalid Command");
            }

        }
        sc.close();
    }

    private static void printList(int[] values,int index){
        for(int i = 0; i < index; i++){
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }

    private static Command getCommand(Scanner num) {
        String sc = num.next().toUpperCase();
        for (Command cd : Command.values()) {
            if (cd.name().equals(sc)) {
                return cd;
            }
        }
        return Command.NOT;
    }

    private static int getValue(Scanner sc){
        int num = sc.nextInt();
        return num;
    }

    public Integer[] res(Integer[] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length - i - 1; j++) {

                if (value[j] > value[j + 1]) {
                    int temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                }
            }
        }
        return value;
    }
}
enum Command {
    ADD,LIST,SUM,QUIT,MAX,MIN,INVALID,NOT}
