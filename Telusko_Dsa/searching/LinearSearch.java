package searching;

class linearsearch {


    public static int linsr(int arr[], int target){

       // int steps = 0;

        for(int i=0; i<arr.length; i++){
            //steps++;
            if(arr[i]==target){
               // System.out.println("linear steps: "+steps);
                return i;
            }
        }
        //System.out.println("linear steps: "+steps);
        return -1;
    }

}

class Practice {
    public static void main(String[] args) {


        int arr[] = {45, 78 ,58, 96, 21, 36};
        int target = 21;

        //System.out.println(searching.linearsearch.linsr(arr,target));

        int result = linearsearch.linsr(arr,target);
        if(result != -1){
            System.out.println("index : "+result);
        }else{
            System.out.println("not found");
        }


    }
}
