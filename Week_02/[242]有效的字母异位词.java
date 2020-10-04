//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 255 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//哈希表
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for (int i =0; i < s.length(); i ++) {
            map[s.charAt(i) - 'a'] ++;
            map[t.charAt(i) - 'a'] --;
        }
        //遍历整个字符，s.charAt()方法取ascii码，对两个字符进行加和减，若最后int类型的哈希表中数据全为0，则通过
        for(int i =0; i < 26; i ++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
