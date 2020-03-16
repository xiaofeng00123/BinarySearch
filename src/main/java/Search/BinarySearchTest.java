package Search;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchTest(){
        int[] a = {2,4,5,7,9};
        System.out.println(BinarySearchUtils.binarySearch(a,0,a.length-1,4));
    }

    @Test
    public void bsearch1Test(){
        int[] a = {2,4,5,5,5,5,7,9};
        System.out.println(BinarySearchUtils.bsearch1(a,0,a.length-1,5));
    }

    @Test
    public void bsearch2Test(){
        int[] a = {2,4,5,5,5,5,7,9};
        System.out.println(BinarySearchUtils.bsearch2(a,0,a.length-1,5));
    }

    @Test
    public void bsearch3Test(){
        int[] a = {2,4,5,7,9};
        System.out.println(BinarySearchUtils.bsearch3(a,0,a.length-1,6));
    }

    @Test
    public void bsearch4Test(){
        int[] a = {2,4,5,7,9};
        System.out.println(BinarySearchUtils.bsearch4(a,5,6));
    }

}
