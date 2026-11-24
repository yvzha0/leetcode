<p>给定一个按&nbsp;<strong>非递减顺序&nbsp;</strong>排列的整数数组 <code>nums</code>，请你&nbsp;<a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank"><strong>原地</strong></a>&nbsp;删除部分重复元素，使得每个不同的元素&nbsp;<strong>最多出现两次</strong>。元素的&nbsp;<strong>相对顺序&nbsp;</strong>应保持&nbsp;<strong>不变</strong>。</p>

<p>由于在某些语言中无法改变数组的长度，因此必须将结果放在数组 <code>nums</code> 的<strong>前半部分</strong>。更准确地说，如果删除重复元素后有 <code>k</code> 个元素，那么 <code>nums</code> 的前 <code>k</code> 个元素应该保存最终结果。前 <code>k</code> 个元素之后的内容无关紧要。</p>

<p>将最终结果放入 <code>nums</code> 的前 <code>k</code> 个位置后，返回 <code>k</code>。</p>

<p><strong>不要&nbsp;</strong>为另一个数组分配额外空间。你必须使用 O(1) 的额外内存，<strong>通过&nbsp;<a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank">原地</a>&nbsp;修改输入数组&nbsp;</strong>来完成此操作。</p>

<p><strong>自定义判题：</strong></p>

<p>判题程序将使用以下代码测试你的解答：</p>

<pre>
int[] nums = [...]; // 输入数组
int[] expectedNums = [...]; // 长度正确的预期答案

int k = removeDuplicates(nums); // 调用你的实现

assert k == expectedNums.length;
for (int i = 0; i &lt; k; i++) {
    assert nums[i] == expectedNums[i];
}
</pre>

<p>如果所有断言都通过，那么你的解答将被&nbsp;<strong>接受</strong>。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1,1,2,2,3]
<strong>输出：</strong>5, nums = [1,1,2,2,3,_]
<strong>解释：</strong>你的函数应该返回 k = 5，并且 nums 的前五个元素分别为 1、1、2、2 和 3。
返回的 k 之后的元素是什么并不重要（因此用下划线表示）。
</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [0,0,1,1,1,1,2,3,3]
<strong>输出：</strong>7, nums = [0,0,1,1,2,3,3,_,_]
<strong>解释：</strong>你的函数应该返回 k = 7，并且 nums 的前七个元素分别为 0、0、1、1、2、3 和 3。
返回的 k 之后的元素是什么并不重要（因此用下划线表示）。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>nums</code> 已按&nbsp;<strong>非递减&nbsp;</strong>顺序排列。</li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>双指针</li></div></div><br><div><li>👍 1421</li><li>👎 0</li></div>