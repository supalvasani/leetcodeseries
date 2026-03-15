public class productofarrayexceptself {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];

    int prefix = 1;
    for (int i = 0; i < n; i++) {
        res[i] = prefix;
        prefix *= nums[i];
    }

    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= suffix;
        suffix *= nums[i];
    }

    return res;
    }
}

//first prefix is found properly for 1st element and then suffix is found properly for last element
// and then both are multiplied to get the result for each element. This way we can get 
// the product of all elements except self without using division and in O(n) time complexity.
//prefix of 1st elemt is 1  and suffix of last element is 1 because there are no elements before
// first and after last element.