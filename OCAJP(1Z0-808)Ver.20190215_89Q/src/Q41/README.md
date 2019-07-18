### Q41

Given the following class declarations:
* public abstract class Animal  
* public interface Hunter  
* public class Cat extends Animal implements Hunter  
* public class Tiger extends Cat  

Which answer fails to compile?

----------

* A.
<pre><code>ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Tiger());</code></pre> 

* B.  
<pre><code>ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Cat());</code></pre> 

* C.  
<pre><code>ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Tiger());</code></pre> 

* D.  
<pre><code>ArrayList<Tiger> myList = new ArrayList<>();
myList.add(new Cat());</code></pre> 

* D.  
<pre><code>ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Cat());</code></pre> 

### Answer : E
