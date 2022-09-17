class Practice
{
    public static void main(String args[])
    {
        int[] nums ={78,23,45,1,4,10,32, 3,11,15,33,76,79};
        int min=3, mid=7, high=10;  
        int[] left= new int[mid-min];
        int[] right= new int[high-mid+2];

        for(int i=min,j=0;i<mid;i++,j++)
        {
            left[j]=nums[i];
        }
        for(int i=mid,j=0;i<=high;i++,j++)
        {
            right[j]=nums[i];
        }

       int index=min;
       int i=0,j=0;

       while(true)
       {
        if(i<1)
        if(left[i]>right[j])
        {
            nums[index]=right[j];
            j++;
            index++;
        }
        else if(left[i]<right[j])
        {
            nums[index]=left[i];
            i++;
            index++;
        }
        else if(left[i]==right[j])
        {
            nums[index]=left[i];
            i++;
            index++;
            nums[index]=right[j];
            j++;
            index++;
        }
       }
        
    }
}