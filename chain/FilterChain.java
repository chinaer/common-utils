package chain;

public interface FilterChain {
	
	int getFilterSize();
	
	boolean doSomething(Object obj);

}
