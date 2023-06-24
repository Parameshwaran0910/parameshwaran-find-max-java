import java.io.*;

class MaximumNumberInArray {
    public static void main(String[] args) throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(in.readLine());

        int[] array = new int[size];

        System.out.println("Enter the values of the array elements:");
        for (int i = 0; i < size; i++)
        {
            array[i] = Integer.parseInt(in.readLine());
        }

        int maxNumber = array[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++)
        {
            if (array[i] > maxNumber)
            {
                maxNumber = array[i];
                maxIndex = i;
            }
        }

        System.out.println("\n Maximum Number: " + maxNumber);
        System.out.println("Position of First Occurrence: "+ maxIndex);
    }
}