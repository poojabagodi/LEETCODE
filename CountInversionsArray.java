

//this is using 
class CountInversionsArray{
    public static int mergesort(int[] arr,int si,int ei){
        int count=0;
        if(si>=ei){
            return count;
        }
        int mid=si+(ei-si)/2;
        count+=mergesort(arr, si, mid);
        count+= mergesort(arr, mid+1, ei);
        count+=merge(arr,si,mid,ei);

        return count;
    }

    public static int merge(int[] arr,int si,int mid,int ei){
        int count=0;
        int k=0;
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                count+=(mid-i+1);
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }
        return count;

    }

    public static int pairs(int[] arr){
       int count= mergesort(arr, 0, arr.length-1);
        return count;
    }


    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        System.out.println(pairs(arr));
    }
}
