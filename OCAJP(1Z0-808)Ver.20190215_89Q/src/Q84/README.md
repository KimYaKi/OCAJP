### Q84

Which two code fragments can be independently inserted at line n1 to enable the code to print the elements of the array in reverse order? (Choose 2)

---

* A  
<pre><code>while(x > 0){
	x--;
	System.out.print(array[x]);
}</code></pre>  

* B  
<pre><code>do{
	x--;
	System.out.print(array[x]);
}while(x >= 0);</code></pre>  

* C  
<pre><code>while(x >= 0){
	System.out.print(array[x]);
	x--;
}</code></pre>  

* D  
<pre><code>do{
	System.out.print(array[x]);
	x--;
}while(x >= 0);</code></pre>  

* E  
<pre><code>while(x > 0){
	System.out.print(array[--x]);
}</code></pre>  

### Answer : A, E