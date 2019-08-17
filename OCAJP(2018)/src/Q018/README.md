### Q018

Which code fragment prints red: blue: small: medium?

---

* A  
<pre><code>for(int index = 1; index < 2; index++){
	for(int idx = 1; idx < index; ++idx){
		System.out.print(shirts[index][idx] + ":");
	}
}</code></pre>   

* B  
<pre><code>for(int index = 0; index < 2; index++){
	for(int idx = 0; idx < index; ++idx){
		System.out.print(shirts[index][idx] + ":");
	}
}</code></pre>  

* C  
<pre><code>for(String c : colors){
	for(String s : sizes){
		System.out.println(s + ":");
	}
}</code></pre>  

* D  
<pre><code>for(int index = 0; index < 2;){
	for(int idx = 0; idx < 2;){
		System.out.print(shirts[index][idx] + ":");
		idx++;
	}
	index++;
}</code></pre>  


### Answer : D