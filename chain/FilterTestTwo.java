package chain;

public class FilterTestTwo extends FilterEventAdapter {

	
	public void doSomethingBefore(FilterChain chain, Object obj){
		System.out.println("FilterTestTwo  do  before-----");
	}
	
	public void doSomethingAfter(FilterChain chain, Object obj){
		System.out.println("FilterTestTwo  do after------");
	}
}
