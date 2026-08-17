<p>给你一个字符串&nbsp;<code>sequence</code>&nbsp;，如果字符串 <code>word</code>&nbsp;连续重复&nbsp;<code>k</code>&nbsp;次形成的字符串是&nbsp;<code>sequence</code>&nbsp;的一个子字符串，那么单词&nbsp;<code>word</code> 的 <strong>重复值为 <code>k</code></strong><strong> </strong>。单词 <code>word</code>&nbsp;的 <strong>最</strong><strong>大重复值</strong>&nbsp;是单词&nbsp;<code>word</code>&nbsp;在&nbsp;<code>sequence</code>&nbsp;中最大的重复值。如果&nbsp;<code>word</code>&nbsp;不是&nbsp;<code>sequence</code>&nbsp;的子串，那么重复值&nbsp;<code>k</code>&nbsp;为 <code>0</code> 。</p>

<p>给你一个字符串 <code>sequence</code>&nbsp;和 <code>word</code>&nbsp;，请你返回 <strong>最大重复值&nbsp;<code>k</code> </strong>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<b>输入：</b>sequence = "ababc", word = "ab"
<b>输出：</b>2
<strong>解释：</strong>"abab" 是 "<strong>abab</strong>c" 的子字符串。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<b>输入：</b>sequence = "ababc", word = "ba"
<b>输出：</b>1
<strong>解释：</strong>"ba" 是 "a<strong>ba</strong>bc" 的子字符串，但 "baba" 不是 "ababc" 的子字符串。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<b>输入：</b>sequence = "ababc", word = "ac"
<b>输出：</b>0
<strong>解释：</strong>"ac" 不是 "ababc" 的子字符串。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= sequence.length &lt;= 100</code></li> 
 <li><code>1 &lt;= word.length &lt;= 100</code></li> 
 <li><code>sequence</code> 和&nbsp;<code>word</code>&nbsp;都只包含小写英文字母。</li> 
</ul>

<div><div>Related Topics</div><div><li>字符串</li><li>动态规划</li><li>字符串匹配</li></div></div><br><div><li>👍 179</li><li>👎 0</li></div>