package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.example.ListZipper.hashmapify;
import static org.example.ListZipper.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListZipperTest {
    @Test
    public void testListZipperIntegers() {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers); // [1, 2, 3, 4, 5, 6, 7, 8]

        assertEquals(mergedNumbers, List.of(1, 2, 3, 4, 5, 6, 7, 8));
    }
    @Test
    public void testListZipperStrings() {
        List<String> nums1 = List.of("1", "3", "5", "7");
        List<String> nums2 = List.of("2", "4", "6", "8");
        List<String> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers);
        assertEquals(mergedNumbers, List.of("1", "2", "3", "4", "5", "6", "7", "8"));
    }
    @Test
    public void testListZipperAddOns() {
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> mergedWords = zip(colors1, colors2);
        System.out.println(mergedWords); // ["Red", "White", "Green", "Black", "Blue", "Orange", "Pink", "Fuschia"]
        assertEquals(mergedWords, List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink", "Fuschia"));
    }
    @Test
    public void testListZipperHashMap() {
        List<String> colors = List.of("White", "Black", "Orange", "Pink");
        List<Integer> nums = List.of(1, 3, 5, 7);

        // This should create {"White" => 1, "Black" => 3, "Orange" => 5, "Pink" => 7}
        HashMap<String, Integer> map = hashmapify(colors, nums);
        System.out.println(map);
        assertEquals(map, new HashMap<>(){{
            put("White", 1);
            put("Black", 3);
            put("Orange", 5);
            put("Pink", 7);
        }
        });

    }
}
