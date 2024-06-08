package Again.Arrays;


public class test {

    public static void main(String[] args) {
        int index=0;
        int[]nums1={1,10,4,4,2,7};
        int []nums2={9,3,5,1,7,4};
        int indexMin=0;
        int max=0;
        
        for(int i=0;i<nums1.length;i++)
        {
            int diff=(nums1[i]-nums2[i]);
            if(diff<0)
            {
                diff=diff*(-1);
            }
            if(diff>max)
            {
                max=diff;
                index=i;
            }


            int min=max;
        for(int j=0;j<nums1.length;j++)
        {
            int diff1=nums1[j]-nums2[index];
            if(diff1<0)
            {
                diff1=diff1*(-1);
            }
            if(diff1<min)
            {
                min=diff1;
                indexMin=j;
                
            }
        }
        nums1[index]=nums1[indexMin];
        return absoluteSum(nums1,nums2);
    
        }
        System.out.println(max);
        System.out.println(index);
        System.out.println(indexMin);
        

    }

    int absoluteSum(int []nums1,int []nums2)
    {
        int sum=0;
        for(int i=0;i<nums1.length;i++)
        {
            int diff=nums1[i]-nums2[i];
            if(diff<0)
            {
                diff=diff*(-1);
            }
            sum+=diff;
        }
        return sum;
    }
    
}
