package chain;

public class FilterTestOne extends FilterEventAdapter{
	
	public void doSomethingBefore(FilterChain chain, Object obj){
		System.out.println("FilterTestOne  do  before-----");
	}
	
	public void doSomethingAfter(FilterChain chain, Object obj){
		System.out.println("FilterTestOne  do after------");
	}
}
