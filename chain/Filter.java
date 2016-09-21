package chain;

public interface Filter {
	
	boolean doSomething(FilterChain chain,Object obj);
}
