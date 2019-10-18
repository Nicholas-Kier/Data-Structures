import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DualPivotQuickSort{
  public static void main(String[] args){
    File file = new File(args[0]); //args 1 is the contents of the file.
    int nums = 0;
     try{
       Scanner X = new Scanner(file);
       while(X.hasNextInt())
       {
         X.nextInt();
         nums++;
       }
     }
     catch (FileNotFoundException a)
     {
        a.printStackTrace();
     }

     int[] array = new int[nums];
      try{
        Scanner input = new Scanner(file);
        while(input.hasNextInt())
        {
          for(int i = 0; i < array.length; i++)
          {
            array[i] = input.nextInt();
          }
        }
        input.close();
      }
      catch (FileNotFoundException a)
      {
        a.printStackTrace();
      }
      dualPivotQuicksortYaroslavskiy(array, 0, array.length-1);
      System.out.print(array[0]);
      for (int i = 1; i < array.length; i++){
        System.out.print(" " + array[i]);
      }
  }
public static int[] dualPivotQuicksortYaroslavskiy(int[] A, int left, int right){
  int temp;
  int k;
  int g;
  int p;
  int l;
  int q;
  if(right - left >= 1){
      p = A[left];
      q = A[right];
      System.out.println("p: "+ A[left]);
      System.out.println("q : "+ A[right]);
        if(p < q){
           temp = p;
           System.out.println("Temp: "+ temp);
            p = q;
            q = temp;
            temp = A[left];
            A[left] = A[right];
            A[right] = temp;
          }
        l = left + 1;
        g = right - 1;
        k = l;
        while(k <= g){
          if(A[k] > p){
            temp = A[k];
            A[k] = A[l];
            A[l] = temp;
            l = l + 1;
          }
          else{
            if(A[k] < q){ //For descending order, I changed this > or < in all but the while loop below and any with = signs in them.
              while(A[g] < q && k < g){
                g = g - 1;
              }
              temp = A[k];
              A[k] = A[g];
              A[g] = temp;
              g = g - 1;
              if (A[k] > p){
                temp = A[k];
                A[k] = A[l];
                A[l] = temp;
                l = l + 1;
              }
            }
          }
            k = k + 1;
        }
            l = l - 1;
            g = g + 1;
            temp = A[left];
            A[left] = A[l];
            A[l] = temp;
            temp = A[right];
            A[right] = A[g];
            A[g] = temp;
            dualPivotQuicksortYaroslavskiy(A, left, l - 1);
            dualPivotQuicksortYaroslavskiy(A, l + 1, g - 1);
            dualPivotQuicksortYaroslavskiy(A, g + 1, right);

          }
            return A;
      }
}

  /*  int nums = 0;
    File file = new File(args[0]); //args 1 is the contents of the file.
     int[] array = new int[nums];
     try{
       Scanner X = new Scanner(file);
       while(X.hasNextInt()){
         X.nextInt();
         nums++;
       }
     }catch (FileNotFoundException a){
         a.printStackTrace();
     }
     for(int i = 0; i < array.length; i++){
       System.out.println(array[i] + "");
     }
      try{
        Scanner input = new Scanner(file);
        while(input.hasNextInt()){

          for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
          }
        }
            input.close();
      } catch (FileNotFoundException a){
          a.printStackTrace();
      }
      dualPivotQuicksortYaroslavskiy(array, 0, array.length-1);
      System.out.print(array[0]);
      for (int i = 1; i < array.length; i++){
        System.out.print(" " + array[i]);
      }
  }



public static int[] dualPivotQuicksortYaroslavskiy(int[] A, int left, int right){
  int temp;
  int k = 0;
  int g = 0;
  int p = 0;
  int l = 0;
  int q = 0;


  if(right - left >= 1){
      p = A[left];
      q = A[right];

        if(p < q){
           temp = p;
            p = q;
            q = temp;

            temp = A[left];
            A[left] = A[right];
            A[right] = temp;
          }
        l = left + 1;
        g = right - 1;
        k = l;

        while(k <= g){
          if(A[k] < p){
            temp = A[k];
            A[k] = A[l];
            A[l] = temp;
            l = l + 1;
          }
          else{
            if(A[k] < q){
              while(A[g] < q && k < g){
                g = g - 1;
              }
              temp = A[k];
              A[k] = A[g];
              A[g] = temp;
              g = g - 1;
              if (A[k] < p){
                temp = A[k];
                A[k] = A[l];
                A[l] = temp;
                l = l + 1;
              }
            }
          }
            k = k + 1;
        }

            l = l - 1;
            g = g + 1;
            temp = A[left];
            A[left] = A[l];
            A[l] = temp;
            temp = A[right];
            A[right] = A[g];
            A[g] = temp;
            dualPivotQuicksortYaroslavskiy(A, left, l - 1);
            dualPivotQuicksortYaroslavskiy(A, l + 1, g - 1);
            dualPivotQuicksortYaroslavskiy(A, g + 1, right);

          }
            return A;
}
}*/
