package chain;

public abstract class FilterEventAdapter extends FilterAdapter{

	@Override
	public boolean doSomething(FilterChain chain, Object obj) {
		doSomethingBefore(chain, obj);
		boolean result= super.doSomething(chain, obj);
		doSomethingAfter(chain, obj);
		return result;
	}
	
	public void doSomethingBefore(FilterChain chain, Object obj){
		
	}
	
	public void doSomethingAfter(FilterChain chain, Object obj){
		
	}
}
