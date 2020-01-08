public class ArraySearcher
{
    private int[] a;

    public ArraySearcher(int[] anArray)
    {
        a = anArray;
    }
    public int find(int target)
    {
        return binarySearch(target, 0, a.length-1);

    }

    private int binarySearch(int target, int first, int last)
    {
        int result;
        if(first>last)
            result = -1;
        else
        {
            int mid = (first+last)/2;
            if(target == a[mid])
                result = mid;
            else if(target < a[mid])
                result = binarySearch(target, first, mid-1);
            else
                result = binarySearch(target, mid+1, last);
        }
        return  result;
    }
}
