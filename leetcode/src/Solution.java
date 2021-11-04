import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return new int[]{};
        int l = 0, r = len - 1;
        var map = new HashMap<Integer, Integer>();
        while (l <= r) {
            int lt = target - nums[l];
            int rt = target - nums[r];
            if (map.containsKey(lt)) {
                return new int[]{l, map.get(lt)};
            } else {
                map.put(nums[l], l);
                l += 1;
            }
            if (map.containsKey(rt)) {
                return new int[]{map.get(rt), r};
            } else {
                map.put(nums[r], r);
                r -= 1;
            }
        }

        return new int[]{};
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode ans = new ListNode(0);
        ListNode ca = ans;
        int flag = 0;

        while (c1 != null || c2 != null) {
            int value = flag;
            if (c1 != null) {
                value += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                value += c2.val;
                c2 = c2.next;
            }
            if (value > 9) {
                flag = 1;
                value %= 10;
            } else {
                flag = 0;
            }
            ca.next = new ListNode(value);
            ca = ca.next;
        }
        if (flag == 1) ca.next = new ListNode(1);

        return ans.next;
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0 || s == null || s == "") return 0;
        var map = new HashMap<Character, Integer>();
        int max = 1;
        int i = 0;
        int j = 0;
        while (j < len) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                max = Math.max(max, map.size());
                int d = map.get(c);
                while (i <= d) {
                    map.remove(s.charAt(i));
                    i += 1;
                }
            }
            map.put(c, j);
            j += 1;
        }

        return Math.max(max, map.size());
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int len = l1 + l2;
        var a = new int[len];
        int i = 0;
        int j = 0;
        while (i < l1 || j < l2) {
            if (i == l1) {
                while (j < l2) {
                    a[i + j] = nums2[j];
                    j += 1;
                }
                break;
            }
            if (j == l2) {
                while (i < l1) {
                    a[i + j] = nums1[i];
                    i += 1;
                }
                break;
            }
            if (nums1[i] < nums2[j]) {
                a[i + j] = nums1[i];
                i += 1;
            } else {
                a[i + j] = nums2[j];
                j += 1;
            }
        }

        double ans;
        int m = (int) len / 2;
        int mSub = m - 1;

        if (len % 2 == 1) {
            ans = a[m];
        } else {
            ans = (double) (a[m] + a[mSub]) / 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("ans: " + solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
