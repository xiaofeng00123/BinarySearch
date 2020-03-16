package Search;

public class BinarySearchUtils {

    /**
     * 二分查找的时间复杂度是O(log(n))
     * 1.二分查找依赖顺序表结构即数组
     * 2.二分查找针对的是有序数据
     * 此处是简单的二分查找即数组中没有重复元素
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public static int binarySearch(int[] a, int low, int high, int value){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(a[mid]<value){
            binarySearch(a,mid+1,high,value);
        }else if(a[mid]>value){
            binarySearch(a,low,mid-1,value);
        }else if(a[mid]==value){
            return mid;
        }
        return -1;
    }

    /**
     * 查找第一个值等于给定值的元素位置 若不存在则返回-1
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public static int bsearch1(int[] a, int low, int high, int value){
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==value){
                if((mid==0)||(a[mid-1]!=value)){
                    return mid;
                }else{
                    high=mid-1;
                }
            }else if(a[mid]<value){
                low=mid+1;
            }else if(a[mid]>value){
                high=mid-1;
            }
        }
        return -1;
    }

    /**
     * 查找最后一个值等于给定值的元素位置 若不存在则返回-1
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public static int bsearch2(int[] a, int low, int high, int value){
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==value){
                if(mid==0||a[mid+1]!=value)
                    return mid;
                else
                    low=mid+1;
            }else if(a[mid]>value){
                high=mid-1;
            }else if(a[mid]<value){
                low=mid+1;
            }
        }
        return -1;
    }

    /**
     * 查找第一个大于等于给定值的元素
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public static int bsearch3(int[] a, int low, int high, int value){
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>=value){
                if(mid==0||a[mid-1]<value){
                    return mid;
                }else{
                    high=mid-1;
                }
            }else
                low=mid+1;
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于给定值的元素
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int bsearch4(int[] a, int n, int value){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]<=value){
                if(mid==n-1||a[mid+1]>value){
                    return mid;
                }else{
                    low=mid+1;
                }
            }else
                high=mid-1;
        }
        return -1;
    }

}
