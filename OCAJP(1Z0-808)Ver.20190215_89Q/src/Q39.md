### Q39

You are asked to develop a program for a shopping application, and you are given the following information:

* The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass of the other two classes.  

* The int calculatePrice (Toy t) method calculates the price of a toy.  

* The void printToy (Toy t) method prints the details of a toy.  

Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

----------

* A.  
<pre><code>public abstract class Toy{
  public abstract int calculatePrice(Toy t);
  public void printToy(Toy t) { /* code goes here */ }
}</code></pre>  

* B.  
<pre><code>public abstract class Toy{
  public int calculatePrice(Toy t);
  public void printToy(Toy t);
}</code></pre>  

* C.  
<pre><code>public abstract class Toy{
  public int calculatePrice(Toy t);
  public final void printToy(Toy t) { /* code goes here */ }
}</code></pre>  

* D.  
<pre><code>public abstract class Toy{
  public abstract int calculatePrice(Toy t) { /* code goes here */ }
  public abstract void printToy(Toy t) { /* code goes here */ }
}</code></pre>  

### Answer : A
