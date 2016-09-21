package chain;

public abstract class FilterAdapter implements Filter{

	@Override
	public boolean doSomething(FilterChain chain, Object obj) {
		return chain.doSomething(obj);
	}
}
