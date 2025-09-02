import java.util.Arrays;

public class MedianFinder {

    /**
     * 计算整数数组的中位数。
     * 
     * @param numbers 输入的整数数组。
     * @return 数组的中位数。
     * @throws IllegalArgumentException 如果输入数组为null或空。
     */
    public static double findMedian(int[] numbers) {
        // 1. 检查输入有效性
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("输入数组不能为空");
        }

        // 2. 对数组进行排序
        Arrays.sort(numbers);

        int length = numbers.length;
        
        // 3. 判断数组长度是奇数还是偶数，并计算中位数
        if (length % 2 == 1) {
            // 奇数情况：返回中间的元素
            return (double) numbers[length / 2];
        } else {
            // 偶数情况：返回中间两个元素的平均值
            int midIndex1 = length / 2 - 1;
            int midIndex2 = length / 2;
            return ((double) (numbers[midIndex1] + numbers[midIndex2])) / 2.0;
        }
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        // 测试奇数长度数组
        int[] oddArray = {5, 3, 1, 2, 4};
        System.out.println("奇数数组 [5, 3, 1, 2, 4] 的中位数是: " + findMedian(oddArray));

        // 测试偶数长度数组
        int[] evenArray = {6, 2, 4, 1};
        System.out.println("偶数数组 [6, 2, 4, 1] 的中位数是: " + findMedian(evenArray));
    }
}