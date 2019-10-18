//DUAL PIVOT QUICKSORT SEDGEWICK(A, left, right)
class Solution {
    public static void dualPivotQuicksortSedgewick(int[] A, int left, int right){
        if(right - left >= 1){
            int i  = left;
            int i i1 = left;
            int j = right;
            int j1 = right;
            int p = A[left];
            int q = A[right];
            //Line 3 below
            if(p > q){
                int temp = p; //Swaps p and q
                p = q;
                q = tempt;
            }
        //Line 4 below
        while(true){
           int i = i + 1;
            //Line 6
            while(A[i] <= q){ //Line 7
                if(i >= j){
                    break;
                }
                if(A[i] < p){ //Line 8
                    A[i1] = A[i];
                    i1++;
                    A[i] = A[i1];
                }
                i = i + 1;
                }
            }
            if(i >= j){ //Line 7
                break;
            }
           j = j - 1; //Line 11

            while(A[j] >= p){ //Line 12
                if(A[j] > q){
                    A[j1] = A[j];
                    j1 = j1 - 1;
                    A[j] = A[j1];
                }

                if(i >= j){
                    break;
                }
                j = j - 1;;
            }
            if(i >= j){
                break;
            }

            A[i1] = A[j];
            A[j1] = A[i];
            i1 = i1 + 1;
            j1 = j1 - 1;
            A[i] = A[i1];
            A[j] = A[j1];
        }

        A[i1] = p;
        A[j1] = A[i];
        i1 += 1;
        j1 = j1 - 1;
        A[i] = A[i1];
        A[j] = A[j1];
    }

    A[i1] = p;
    A[j1] = q;
    dualPivotQuicksortSedgewick(A, left, i1 - 1);
    dualPivotQuicksortSedgewick(A, i1 + 1, j1 - 1);
    dualPivotQuicksortSedgewick(A, j1 + 1, right);


    }

  }
    public int[] sortArray(int[] nums) {
        dualPivotQuicksortSedgewick(nums, 0, nums.length - 1);
        return nums;
    }
}
