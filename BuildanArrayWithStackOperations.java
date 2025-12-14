import java.util.ArrayList;
import java.util.List;
public class BuildanArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int currentNumber = 1;
        int targetIndex = 0;

        while (targetIndex < target.length) {
            if (currentNumber == target[targetIndex]) {
                operations.add("Push");
                targetIndex++;
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
            currentNumber++;
        }

        return operations;
    }
    public static void main(String[] args) {
        BuildanArrayWithStackOperations builder = new BuildanArrayWithStackOperations();
        int[] target = {2, 3, 4};
        int n = 4;
        List<String> result = builder.buildArray(target, n);
        
        System.out.println("Operations: " + result);
    }
}
