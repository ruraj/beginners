PARSER
===

This problem tests your ability to manipulate strings using standard Java features.


Basic version
----


A remote system regularly sends data that contains a hidden numeric value to your code. This string contains a single line and looks something like this:

<code>20160519150000-STX,6-3.0-CONF4</code>

We need to extract the value 3.0 from this string and show it on the console.


Advanced version
---

A remote system regularly sends encrypted data that contains a hidden numeric value to your code. This string contains three lines and looks something like this:
<pre>
<code>
3127162:261111
TUY-7.4/1
DPOG5
</code>
</pre>

Each character in this string has been encrypted by increasing the ASCII value of original character by 1. So when decrypted, the lines look like this:

<pre><code>
20160519150000
STX,6-3.0
CONF4
</code></pre>

We need to decrypt the encrypted string and then extract the value *3.0* from the second line.
