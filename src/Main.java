import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры двумерного массива m и n соответственно:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        Element[][] array = new Element[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = new Element(scan.nextInt());
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j].value + " ");
            }
            System.out.println();
        }
        Element maxElem = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j].compareTo(maxElem) > 0) {
                    maxElem = array[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент: " + maxElem.value);
    }
}
class Element implements Comparable<Element> {
    public int value;

    public Element(int value) {
        this.value = value;
    }
    @Override
    public int compareTo(Element other) {
        return Integer.compare(this.value, other.value);
    }
}
