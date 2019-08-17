### Q009

How should you write methods in the "ElectricAccount" class at line n1 so that the member variable "bill" is always equal to the value of the member variable "kwh" multiplied by the member variable rate?  
> 멤버 변수  "bill"이 항상 멤버 변수 "kwh"의 값과 멤버 변수 비율을 곱한 값과 같도록 n1행의 "ElectricAccount" 클래스에 메소드를 작성하는 방법은 무엇입니까?

---

* A  
<pre><code>public void addKwh(double kwh){
	this.kwh += kwh;
	this.bill = this.kwh * this.rate;
}</code></pre>  

* B  
<pre><code>public void addKwh(double kwh){
	if (kwh > 0){
		this.kwh += kwh;
		this.bill = this.kwh * this.rate;
	}
}</code></pre>  

* C  
<pre><code>private void addKwh(double kwh){
	if (kwh > 0){
		this.kwh += kwh;
		this.bill = this.kwh * this.rate;
	}
}</code></pre>  

* D  
<pre><code>public void addKwh(double kwh){
	if (kwh > 0){
		this.kwh += kwh;
		setBill(this.kwh);
	}
}
public void setBill(double kwh){
	bill = kwh * rate;
}</code></pre>  


### Answer : A, C