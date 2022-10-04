package by.itstep.vikvik.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private int[] array;

//    @BeforeClass
//    public static void initGlobal(){
//        System.out.println("@BeforeClass");
//        array = new int[] {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
//    }
//
//    @AfterClass
//    public static void destroyGlobal(){
//        System.out.println("@AfterClass");
//        array = null;
//    }

    @Before
    public void init(){
        System.out.println("Before method");
        array = new int[] {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
    }

    @After
    public void destroy(){
        System.out.println("After method");
        array = null;
    }


    @Test
    public void testBubbleSortAsc() {
        System.out.println("testBubbleSortAsc");
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);

        assertArrayEquals(expected, array);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//            }
//        }
    }

//    @Test(expected = RuntimeException.class)
//    public void testBubbleSortAscWithNull() {
//        ArraySorter.bubbleSortAsc(null);
//    }
//
//    @Test
//    public void testBubbleSortAscWithEmptyObject() {
//        ArraySorter.bubbleSortAsc(new int[0]);
//    }

    @Test
    public void testBubbleSortDesc() {
        System.out.println("testBubbleSortDesc");
        int[] expected = {7, 6, 5, 5, 4, 4, 3, 3, 2, 1};

        ArraySorter.bubbleSortDesc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

//    @Test(expected = RuntimeException.class)
//    public void testBubbleSortDescWithNull() {
//        ArraySorter.bubbleSortDesc(null);
//    }
//
//    @Test
//    public void testBubbleSortDescWithEmptyObject() {
//        ArraySorter.bubbleSortDesc(new int[0]);
//    }

    @Test
    public void testSelectedSortAsc() {
        System.out.println("testSelectedSortAsc");
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.selectedSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

//    @Test(expected = RuntimeException.class)
//    public void testSelectedSortAscWithNull() {
//        ArraySorter.selectedSortAsc(null);
//    }
//
//    @Test
//    public void testSelectedSortAscWithEmptyObject() {
//        ArraySorter.selectedSortAsc(new int[0]);
//    }


    @Ignore
    @Test
    public void testSelectedSortDesc() {
        System.out.println("testSelectedSortDesc");
        int[] expected = {7, 6, 5, 5, 4, 4, 3, 3, 2, 1};

        ArraySorter.selectedSortDesc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

//    @Test(expected = RuntimeException.class)
//    public void testSelectedSortDescWithNull() {
//        ArraySorter.selectedSortDesc(null);
//    }
//
//    @Test
//    public void testSelectedSortDescWithEmptyObject() {
//        ArraySorter.selectedSortDesc(new int[0]);
//    }
}
